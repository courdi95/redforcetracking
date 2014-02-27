package com.hearandknow.rft;

import android.app.*;
import android.content.*;
import android.location.*;
import android.os.*;
import android.telephony.gsm.*;
import android.text.format.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity
{
	private final Activity me = this;
	private SharedPreferences sharedPref;
	private String num_center;
	private String default_num_center = "003360000000";
	private double myLatitude; 
	private double myLongitude; 	
	private Location myLocation;
	private int myAccuracy; 
	private boolean hasmyAccuracy;
	private long myTime; 
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);


		//Context context = this;

		sharedPref = getSharedPreferences(
			getString(R.string.preference_file_key), Context.MODE_PRIVATE);
		num_center = sharedPref.getString(getString(R.string.saved_num_center), default_num_center);
			
//		int newHighScore = 5;
//		SharedPreferences.Editor editor = sharedPref.edit();
//		editor.putInt(getString(R.string.saved_high_score), newHighScore);
//		editor.commit();
//		
//		int defaultValue = 10;

//		int defaultValue = getResources().getInteger(R.string.saved_high_score_default);
    	//int highScore = sharedPref.getInt(getString(R.string.saved_high_score), defaultValue);

		//Toast.makeText(getApplicationContext(), Integer.toString(highScore),
					//   Toast.LENGTH_SHORT).show();

		Button bEmergency = (Button) findViewById(R.id.emergency);
		Button bMessages = (Button) findViewById(R.id.messages);
		Button bCheck = (Button) findViewById(R.id.check);
		Button bBeacon = (Button) findViewById(R.id.beacon);
		//Button bText = (Button) findViewById(R.id.text);
		Button bMap = (Button) findViewById(R.id.maposm);
		Button bSettings = (Button) findViewById(R.id.settings);

		bEmergency.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{
					String msgAlerte;
					String msgToast;
					msgToast = "Emergency message sent to ";
					msgToast = msgToast.concat(num_center);
					Toast.makeText(getApplicationContext(), msgToast,
								   Toast.LENGTH_SHORT).show();
								   
					//String retourGps;
					//retourGps = getLastKnownLocation();
					msgAlerte = "Alerte pour le portable xxxxxx .";
					//	LocationManager mylocationManager = (LocationManager) myContext.getSystemService(Context.LOCATION_SERVICE);	 
					LocationManager mylocationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE); 
					// récupère Location 
					myLocation = mylocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER); 	 
					if (myLocation != null)
					{ 		 	
					// recupére infos 		
						msgAlerte = msgAlerte.concat(" Derniere position connue : ");
						// Accuracy 	
						// 1 	
						hasmyAccuracy = myLocation.hasAccuracy(); 	
						if (hasmyAccuracy)
						{ 		
							msgAlerte = msgAlerte.concat(" precision : ");
//							chaine_status = chaine_status.concat("y"); 	
//							chaine_status = chaine_status.concat(";");		 
							myAccuracy = (int) myLocation.getAccuracy(); 
						} 	
						else
						{ 		
							msgAlerte = msgAlerte.concat(" pas de precision : ");
//							chaine_status = chaine_status.concat("n"); 		
//							chaine_status = chaine_status.concat(";");	 	
							myAccuracy = 0;			 	
						}; 	

						//2 		
						msgAlerte=msgAlerte.concat(String.valueOf(myAccuracy)); 	
						msgAlerte = msgAlerte.concat(" -"); 
						// Altitude 	

						// 3 	
//						hasmyAltitude = myLocation.hasAltitude(); 	
//						if (hasmyAltitude)
//						{ 	
//							chaine_status = chaine_status.concat("y"); 	
//							chaine_status = chaine_status.concat(";");	
//							myAltitude = (int) myLocation.getAltitude(); 	
//						} 	
//						else
//						{ 			
//							chaine_status = chaine_status.concat("n"); 	
//							chaine_status = chaine_status.concat(";");		
//							myAltitude = 0; 	
//						}; 	

						// 4 	
//						chaine_status = chaine_status.concat(String.valueOf(myAltitude)); 	
//						chaine_status = chaine_status.concat(";"); 			 
//
//						// Bearing 	
//						// 5 	
//						hasmyBearing = myLocation.hasBearing(); 	
//						if (hasmyBearing)
//						{ 			
//							chaine_status = chaine_status.concat("y"); 	
//							chaine_status = chaine_status.concat(";"); 	
//							myBearing = (int) myLocation.getBearing();		 
//						} 	
//						else
//						{ 			
//							chaine_status = chaine_status.concat("n"); 			
//							chaine_status = chaine_status.concat(";"); 				
//							myBearing = 0;	
//						}; 		
//
//						// 6 	
//						chaine_status = chaine_status.concat(String.valueOf(myBearing)); 	
//						chaine_status = chaine_status.concat(";"); 	 

						// Latitude et longitude 	
						// 7 	
						msgAlerte = msgAlerte.concat(" lat : ");
						myLatitude = myLocation.getLatitude(); 	
						msgAlerte = msgAlerte.concat(String.valueOf(myLatitude)); 	
						msgAlerte = msgAlerte.concat(" -"); 		 	

						// 8 	
						msgAlerte = msgAlerte.concat(" lon : ");
						myLongitude = myLocation.getLongitude(); 	
						msgAlerte = msgAlerte.concat(String.valueOf(myLongitude)); 	
						msgAlerte = msgAlerte.concat(" -"); 		 

						// Speed 		// 9 	
//						hasmySpeed = myLocation.hasSpeed(); 	
//						if (hasmySpeed)
//						{ 	
//							chaine_status = chaine_status.concat("y"); 		
//							chaine_status = chaine_status.concat(";"); 	
//							mySpeed = (int) myLocation.getSpeed(); 		
//						} 	
//						else
//						{ 	
//							chaine_status = chaine_status.concat("n"); 		
//							chaine_status = chaine_status.concat(";");	
//							mySpeed = 0; 	
//						}; 	
//
//						// 10 	
//						chaine_status = chaine_status.concat(String.valueOf(mySpeed)); 	
//						chaine_status = chaine_status.concat(";"); 		

						// time 		// 11	 	
						myTime = myLocation.getTime(); 	
						String dateString= DateFormat.format("MM/dd/yyyy hh:mm:ss", new Date(myTime)).toString();

						
						msgAlerte = msgAlerte.concat(" date : ");
						msgAlerte = msgAlerte.concat(dateString); 	
						//msgAlerte = msgAlerte.concat(";"); 		 	


						/////////////	 		 
					} 	 
					else
					{		 	
						msgAlerte = msgAlerte.concat(" Pas de position."); 	
					} 	 	 
					
					
					////////
					SmsManager msmsManager = SmsManager.getDefault(); 	
					msmsManager.sendTextMessage(num_center, null, msgAlerte, null, null);

					
				};
			}

		);

		bMessages.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{
					Intent intt = new Intent(me, MyMessage.class);
					startActivity(intt);
//					Toast.makeText(getApplicationContext(), "Messages",
//								   Toast.LENGTH_SHORT).show();
				};
			}

		);

		bCheck.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{
					Intent intt = new Intent(me, MyCheckin.class);
					startActivity(intt);

					//	Toast.makeText(getApplicationContext(), "Check",
					//				   Toast.LENGTH_SHORT).show();
				};
			}

		);

		bSettings.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{
					Intent intt = new Intent(me, MySettings.class);
					startActivity(intt);

					//	Toast.makeText(getApplicationContext(), "Check",
					//				   Toast.LENGTH_SHORT).show();
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

//		bText.setOnClickListener(new OnClickListener() {
//
//				public void onClick(View p1)
//				{
//
//					Toast.makeText(getApplicationContext(), "Free text",
//								   Toast.LENGTH_SHORT).show();
////					Intent intt = new Intent(me, MyMap.class);
////					startActivity(intt);
//				};
//			}
//
//		);

		bMap.setOnClickListener(new OnClickListener() {

				public void onClick(View p1)
				{

//					Toast.makeText(getApplicationContext(), "Map",
//								   Toast.LENGTH_SHORT).show();
					Intent intt = new Intent(me, MyMap.class);
					startActivity(intt);
				};
			}

		);

    }



	public  String getLastKnownLocation()
	{ 	
// variables 
		String chaine_status =""; 
		Location myLocation; 
		int myAccuracy; 
		boolean hasmyAccuracy; 
		int myAltitude; 
		boolean hasmyAltitude; 	
		int myBearing;
		boolean hasmyBearing; 
		double myLatitude; 
		double myLongitude; 		
		int mySpeed; 
		boolean hasmySpeed; 
		long myTime; 

//////////////////////////////////// 
// Récupération du contexte et du location manager 	
		//Context myContext = getContexteApplication();


		//	LocationManager mylocationManager = (LocationManager) myContext.getSystemService(Context.LOCATION_SERVICE);	 
		LocationManager mylocationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE); 
// récupère Location 
		myLocation = mylocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER); 	 
		if (myLocation != null)
		{ 		 	
// recupére infos 		 	
			// Accuracy 	
			// 1 	
			hasmyAccuracy = myLocation.hasAccuracy(); 	
			if (hasmyAccuracy)
			{ 		
				chaine_status = chaine_status.concat("y"); 	
				chaine_status = chaine_status.concat(";");		 
				myAccuracy = (int) myLocation.getAccuracy(); 
			} 	
			else
			{ 		
				chaine_status = chaine_status.concat("n"); 		
				chaine_status = chaine_status.concat(";");	 	
				myAccuracy = 0;			 	
			}; 	

			//2 		
			chaine_status = chaine_status.concat(String.valueOf(myAccuracy)); 	
			chaine_status = chaine_status.concat(";"); 		 
			// Altitude 	

			// 3 	
			hasmyAltitude = myLocation.hasAltitude(); 	
			if (hasmyAltitude)
			{ 	
				chaine_status = chaine_status.concat("y"); 	
				chaine_status = chaine_status.concat(";");	
				myAltitude = (int) myLocation.getAltitude(); 	
			} 	
			else
			{ 			
				chaine_status = chaine_status.concat("n"); 	
				chaine_status = chaine_status.concat(";");		
				myAltitude = 0; 	
			}; 	

			// 4 	
			chaine_status = chaine_status.concat(String.valueOf(myAltitude)); 	
			chaine_status = chaine_status.concat(";"); 			 

			// Bearing 	
			// 5 	
			hasmyBearing = myLocation.hasBearing(); 	
			if (hasmyBearing)
			{ 			
				chaine_status = chaine_status.concat("y"); 	
				chaine_status = chaine_status.concat(";"); 	
				myBearing = (int) myLocation.getBearing();		 
			} 	
			else
			{ 			
				chaine_status = chaine_status.concat("n"); 			
				chaine_status = chaine_status.concat(";"); 				
				myBearing = 0;	
			}; 		

			// 6 	
			chaine_status = chaine_status.concat(String.valueOf(myBearing)); 	
			chaine_status = chaine_status.concat(";"); 	 

			// Latitude et longitude 	
			// 7 	
			myLatitude = myLocation.getLatitude(); 	
			chaine_status = chaine_status.concat(String.valueOf(myLatitude)); 	
			chaine_status = chaine_status.concat(";"); 		 	

			// 8 	
			myLongitude = myLocation.getLongitude(); 	
			chaine_status = chaine_status.concat(String.valueOf(myLongitude)); 	
			chaine_status = chaine_status.concat(";"); 		 

			// Speed 		// 9 	
			hasmySpeed = myLocation.hasSpeed(); 	
			if (hasmySpeed)
			{ 	
				chaine_status = chaine_status.concat("y"); 		
				chaine_status = chaine_status.concat(";"); 	
				mySpeed = (int) myLocation.getSpeed(); 		
			} 	
			else
			{ 	
				chaine_status = chaine_status.concat("n"); 		
				chaine_status = chaine_status.concat(";");	
				mySpeed = 0; 	
			}; 	

			// 10 	
			chaine_status = chaine_status.concat(String.valueOf(mySpeed)); 	
			chaine_status = chaine_status.concat(";"); 		

			// time 		// 11	 	
			myTime = myLocation.getTime(); 	
			chaine_status = chaine_status.concat(String.valueOf(myTime)); 	
			chaine_status = chaine_status.concat(";"); 		 	


			/////////////	 		 
		} 	 
		else
		{		 	
			chaine_status = chaine_status.concat("location_NULL"); 	
		} 	 	 

		return chaine_status;
	}

}
