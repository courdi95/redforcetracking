package com.hearandknow.rft;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Button bEmergency = (Button) findViewById(R.id.emergency);
		Button bMessages = (Button) findViewById(R.id.messages);
		Button bCheck = (Button) findViewById(R.id.check);
		Button bBeacon = (Button) findViewById(R.id.beacon);
		Button bText = (Button) findViewById(R.id.text);

		bEmergency.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{

					Toast.makeText(getApplicationContext(), "Emergency",
								   Toast.LENGTH_SHORT).show();
				};
			}

		);
		
		bMessages.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{

					Toast.makeText(getApplicationContext(), "Messages",
								   Toast.LENGTH_SHORT).show();
				};
			}

		);
		
		bCheck.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{

					Toast.makeText(getApplicationContext(), "Check",
								   Toast.LENGTH_SHORT).show();
				};
			}

		);
		
		bBeacon.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{

					Toast.makeText(getApplicationContext(), "Beacon",
								   Toast.LENGTH_SHORT).show();
				};
			}

		);
		
		bText.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{

					Toast.makeText(getApplicationContext(), "Free text",
								   Toast.LENGTH_SHORT).show();
				};
			}

		);
		
		
		
    }

}
