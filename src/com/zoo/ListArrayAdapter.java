package com.zoo;

import java.util.List;

import com.zoo.model.User;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListArrayAdapter extends ArrayAdapter<User> {
	private final List<User> values;

	public ListArrayAdapter(Context context, int itemListLayout, int itemListId, List<User> values) {
		super(context, itemListLayout, itemListId, values);
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
//		LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//		View listItemView = inflater.inflate(R.layout.activity_user_listitem, parent, false);

		View listItemView = super.getView(position, convertView, parent);
		
		ImageView logoView = (ImageView) listItemView.findViewById(R.id.user_logo);
		logoView.setImageResource(R.drawable.nature);

		TextView fullnameView = (TextView) listItemView.findViewById(R.id.user_fullname);
		fullnameView.setText(values.get(position).getFirstName() + " " + values.get(position).getLastName());

		return listItemView;
	}
}
