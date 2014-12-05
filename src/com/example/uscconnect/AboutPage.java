package com.example.uscconnect;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AboutPage extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_page);
//		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JYuMMhll4TA")));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about_page, menu);
		return true;
	}

	public void imgBtnClicked(View v) {
		// Inflate the menu; this adds items to the action bar if it is present.
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JYuMMhll4TA")));

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
	
	
}
