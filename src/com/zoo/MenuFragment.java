package com.zoo;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MenuFragment extends Fragment {

	private LinearLayout mDrawerMenu;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		// Indicate that this fragment would like to influence the set of
		// actions in the action bar.
		setHasOptionsMenu(true);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mDrawerMenu = (LinearLayout) inflater.inflate(R.layout.activity_main, container, false);

		Button sendButton = (Button) mDrawerMenu.findViewById(R.id.button_mirrorText);
		sendButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent reverseTextActivity = new Intent(getActivity(), ReverseTextActivity.class);
				startActivity(reverseTextActivity);
			}
		});

		Button formButton = (Button) mDrawerMenu.findViewById(R.id.button_form);
		formButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent formActivity = new Intent(getActivity(), FormActivity.class);
				startActivity(formActivity);
			}
		});

		Button usersButton = (Button) mDrawerMenu.findViewById(R.id.button_list_users);
		usersButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent usersActivity = new Intent(getActivity(), UserListActivity.class);
				startActivity(usersActivity);
			}
		});

		return mDrawerMenu;
	}

	/*
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 * menu; this adds items to the action bar if it is present.
	 * getMenuInflater().inflate(R.menu.main, menu); return true; }
	 */

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void onPause() {
		super.onPause();
	}
}
