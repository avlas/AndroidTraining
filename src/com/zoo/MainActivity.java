package com.zoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        	        
		Button sendButton = (Button) findViewById(R.id.button_mirrorText);
		sendButton.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent intentActivity = new Intent(MainActivity.this, ReverseTextActivity.class);
				startActivity(intentActivity);
			}
		});
		
		Button formButton = (Button) findViewById(R.id.button_form);
		formButton.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent formActivity = new Intent(MainActivity.this, FormActivity.class);
				startActivity(formActivity);
			}
		});
		
		Button usersButton = (Button) findViewById(R.id.button_list_users);
		usersButton.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent usersActivity = new Intent(MainActivity.this, UserListActivity.class);
				startActivity(usersActivity);
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
		setContentView(R.layout.activity_main);
	}
}
