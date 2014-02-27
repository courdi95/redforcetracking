package com.hearandknow.rft;

import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;
import com.hearandknow.rft.*;

public class MySettings extends Activity
{
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
		
		EditText text = (EditText) findViewById(R.id.text_num_center);
		text.setText("toto");

		SharedPreferences sharedPref = getSharedPreferences(
			getString(R.string.preference_file_key), Context.MODE_PRIVATE);

		String default_num_center = "0033676752005";
		String num_center;
		//	int defaultValue = 10;

//		int defaultValue = getResources().getInteger(R.string.saved_high_score_default);
    	//String num_center = sharedPref.getInt(getString(R.string.saved_high_score), default_num_center);
		
		int defaultValue = 10;
		int highScore = sharedPref.getInt(getString(R.string.saved_high_score), defaultValue);
		Toast.makeText(getApplicationContext(), Integer.toString(highScore),
					   Toast.LENGTH_SHORT).show();
		
		num_center = sharedPref.getString(getString(R.string.saved_num_center),default_num_center);
		text.setText(num_center);
		///////////////////////
		
		
		}
}
