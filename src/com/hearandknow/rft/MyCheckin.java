package com.hearandknow.rft;

import android.app.*;
import android.content.*;
import android.os.*;
import android.telephony.gsm.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MyCheckin extends Activity
{
	private SharedPreferences sharedPref;
	private String num_center;
	private String text_message;
	private EditText mEditText;
	private Spinner mSpinner;
	private Button bSendCheck;
	private String default_num_center = "0033000000000";
	
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkin);
		
		sharedPref = getSharedPreferences(
			getString(R.string.preference_file_key), Context.MODE_PRIVATE);
		num_center = sharedPref.getString(getString(R.string.saved_num_center), default_num_center);
		

		mSpinner = (Spinner) findViewById(R.id.liste_checkin);
		
		bSendCheck=(Button) findViewById(R.id.send_checkin);
		
		bSendCheck.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{

					String msgAlerte;
					msgAlerte = "Check in";
					msgAlerte = msgAlerte.concat(num_center);
					Toast.makeText(getApplicationContext(), msgAlerte,
								   Toast.LENGTH_SHORT).show();

					
					text_message = "Le portable xxxxx fait un check in : ";
					text_message=text_message.concat(String.valueOf(mSpinner.getSelectedItem()));
					
					////////
					SmsManager msmsManager = SmsManager.getDefault(); 	
					msmsManager.sendTextMessage(num_center, null, text_message, null, null);


				};
			}

		);

		

		
		
	}
	
}
