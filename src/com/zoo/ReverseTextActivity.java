package com.zoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseTextActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reverse_text);
				
		TextView textHelloWorld = (TextView) findViewById(R.id.label_redirected);
		textHelloWorld.setText(R.string.text_changed);	
				
		EditText textarea = (EditText) findViewById(R.id.textarea_toReverse);
		textarea.addTextChangedListener(new TextWatcher() {
			TextView reverseText = (TextView) findViewById(R.id.label_reverseText);
			
	        public void onTextChanged(CharSequence s, int start, int before, int count) {
	        	StringBuffer reversedSb = new StringBuffer(s);			
	        	reverseText.setText(reversedSb.reverse().toString());
	        }

			@Override
			public void afterTextChanged(Editable s) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}
	     });
		
		Button backButton = (Button) findViewById(R.id.button_back);
		backButton.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent mainActivity = new Intent(ReverseTextActivity.this, MainActivity.class);
				startActivity(mainActivity);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

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
	
	protected void onPause() {
		super.onPause();
		setContentView(R.layout.activity_reverse_text);
	}
}
