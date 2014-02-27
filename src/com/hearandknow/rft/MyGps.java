package com.hearandknow.rft;


import android.content.*;
import android.location.*;

public class MyGps
{



// location /////////////////
//message renvoyé : // 	 hasAccuracy (y/n);int myAccuracy; hasAltitude; myAltitude; hasBearing;myBearing; myLatitude;myLongitude; hasSpeed;mySpeed; myTime; // ou "location_NULL" /////////////////
//	public static String getLastKnownLocation()
//	{ 	
//// variables 
//		String chaine_status =""; 
//		Location myLocation; 
//		int myAccuracy; 
//		boolean hasmyAccuracy; 
//		int myAltitude; 
//		boolean hasmyAltitude; 	
//		int myBearing;
//		boolean hasmyBearing; 
//		double myLatitude; 
//		double myLongitude; 		
//		int mySpeed; 
//		boolean hasmySpeed; 
//		long myTime; 
//
////////////////////////////////////// 
//// Récupération du contexte et du location manager 	
//		//Context myContext = getContexteApplication();
//
//
//		//	LocationManager mylocationManager = (LocationManager) myContext.getSystemService(Context.LOCATION_SERVICE);	 
//		LocationManager	mylocationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE); 
//// récupère Location 
//		myLocation = mylocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER); 	 
//		if (myLocation != null)
//		{ 		 	
//// recupére infos 		 	
//			// Accuracy 	
//			// 1 	
//			hasmyAccuracy = myLocation.hasAccuracy(); 	
//			if (hasmyAccuracy)
//			{ 		
//				chaine_status = chaine_status.concat("y"); 	
//				chaine_status = chaine_status.concat(";");		 
//				myAccuracy = (int) myLocation.getAccuracy(); 
//			} 	
//			else
//			{ 		
//				chaine_status = chaine_status.concat("n"); 		
//				chaine_status = chaine_status.concat(";");	 	
//				myAccuracy = 0;			 	
//			}; 	
//
//			//2 		
//			chaine_status = chaine_status.concat(String.valueOf(myAccuracy)); 	
//			chaine_status = chaine_status.concat(";"); 		 
//			// Altitude 	
//
//			// 3 	
//			hasmyAltitude = myLocation.hasAltitude(); 	
//			if (hasmyAltitude)
//			{ 	
//				chaine_status = chaine_status.concat("y"); 	
//				chaine_status = chaine_status.concat(";");	
//				myAltitude = (int) myLocation.getAltitude(); 	
//			} 	
//			else
//			{ 			
//				chaine_status = chaine_status.concat("n"); 	
//				chaine_status = chaine_status.concat(";");		
//				myAltitude = 0; 	
//			}; 	
//
//			// 4 	
//			chaine_status = chaine_status.concat(String.valueOf(myAltitude)); 	
//			chaine_status = chaine_status.concat(";"); 			 
//
//			// Bearing 	
//			// 5 	
//			hasmyBearing = myLocation.hasBearing(); 	
//			if (hasmyBearing)
//			{ 			
//				chaine_status = chaine_status.concat("y"); 	
//				chaine_status = chaine_status.concat(";"); 	
//				myBearing = (int) myLocation.getBearing();		 
//			} 	
//			else
//			{ 			
//				chaine_status = chaine_status.concat("n"); 			
//				chaine_status = chaine_status.concat(";"); 				
//				myBearing = 0;	
//			}; 		
//
//			// 6 	
//			chaine_status = chaine_status.concat(String.valueOf(myBearing)); 	
//			chaine_status = chaine_status.concat(";"); 	 
//
//			// Latitude et longitude 	
//			// 7 	
//			myLatitude = myLocation.getLatitude(); 	
//			chaine_status = chaine_status.concat(String.valueOf(myLatitude)); 	
//			chaine_status = chaine_status.concat(";"); 		 	
//
//			// 8 	
//			myLongitude = myLocation.getLongitude(); 	
//			chaine_status = chaine_status.concat(String.valueOf(myLongitude)); 	
//			chaine_status = chaine_status.concat(";"); 		 
//
//			// Speed 		// 9 	
//			hasmySpeed = myLocation.hasSpeed(); 	
//			if (hasmySpeed)
//			{ 	
//				chaine_status = chaine_status.concat("y"); 		
//				chaine_status = chaine_status.concat(";"); 	
//				mySpeed = (int) myLocation.getSpeed(); 		
//			} 	
//			else
//			{ 	
//				chaine_status = chaine_status.concat("n"); 		
//				chaine_status = chaine_status.concat(";");	
//				mySpeed = 0; 	
//			}; 	
//
//			// 10 	
//			chaine_status = chaine_status.concat(String.valueOf(mySpeed)); 	
//			chaine_status = chaine_status.concat(";"); 		
//
//			// time 		// 11	 	
//			myTime = myLocation.getTime(); 	
//			chaine_status = chaine_status.concat(String.valueOf(myTime)); 	
//			chaine_status = chaine_status.concat(";"); 		 	
//
//
//			/////////////	 		 
//		} 	 
//		else
//		{		 	
//			chaine_status = chaine_status.concat("location_NULL"); 	
//		} 	 	 
//
//		return chaine_status;
//	}


}
