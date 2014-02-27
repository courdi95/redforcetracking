package com.hearandknow.rft;

import android.app.*;
import android.content.*;
import android.os.*;
import android.telephony.gsm.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MyMessage extends  Activity
{
	private SharedPreferences sharedPref;
	private String num_center;
	private String text_message;
	private EditText mEditText;
	private String default_num_center = "0033676752005";
	
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);

		sharedPref = getSharedPreferences(
			getString(R.string.preference_file_key), Context.MODE_PRIVATE);
		num_center = sharedPref.getString(getString(R.string.saved_num_center), default_num_center);
		
		mEditText = (EditText) findViewById(R.id.text_message);
		
		Button bSendMessage = (Button) findViewById(R.id.send_message);
		
		bSendMessage.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{
					
					String msgAlerte;
					msgAlerte = "Message sent to ";
					msgAlerte = msgAlerte.concat(num_center);
					Toast.makeText(getApplicationContext(), msgAlerte,
								   Toast.LENGTH_SHORT).show();

					text_message = mEditText.getText().toString();
					////////
					SmsManager msmsManager = SmsManager.getDefault(); 	
					msmsManager.sendTextMessage(num_center, null, text_message, null, null);


				};
			}

		);
		
//		SmsManager smsManager = SmsManager.getDefault(); 	
//		smsManager.sendTextMessage("phoneNo", null, "sms message", null, null);

		
		
	}
}
