package com.hearandknow.rft;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MySettings extends Activity
{
	
	EditText mEditText;
	String num_center;
	SharedPreferences sharedPref;
	
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

		mEditText = (EditText) findViewById(R.id.text_num_center);
		mEditText.setText("toto");

		sharedPref = getSharedPreferences(
			getString(R.string.preference_file_key), Context.MODE_PRIVATE);

		String default_num_center = "003360000000";
		
		//	int defaultValue = 10;

//		int defaultValue = getResources().getInteger(R.string.saved_high_score_default);
    	//String num_center = sharedPref.getInt(getString(R.string.saved_high_score), default_num_center);

//		int defaultValue = 10;
//		int highScore = sharedPref.getInt(getString(R.string.saved_high_score), defaultValue);
//		Toast.makeText(getApplicationContext(), Integer.toString(highScore),
//					   Toast.LENGTH_SHORT).show();

		num_center = sharedPref.getString(getString(R.string.saved_num_center), default_num_center);
		mEditText.setText(num_center);
		///////////////////////

		Button bRecord = (Button) findViewById(R.id.record_num_center);

		bRecord.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{

					Toast.makeText(getApplicationContext(), "Record phone number",
								   Toast.LENGTH_SHORT).show();
						
					num_center = mEditText.getText().toString();
					SharedPreferences.Editor editor = sharedPref.edit();
					editor.putString(getString(R.string.saved_num_center), num_center);
					editor.commit();
					
				};
			}

		);
	}
}
