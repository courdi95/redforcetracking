package com.hearandknow.rft;


import android.app.*;
import android.os.*;
import android.widget.*;
import org.osmdroid.util.*;
import org.osmdroid.views.*;

public class MyMap extends Activity
{
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.osmmap);
		
		Toast.makeText(getApplicationContext(), "bbbbbb",
					   Toast.LENGTH_SHORT).show();

		MapView mapView = new MapView(this, 256); //constructor
		mapView.setClickable(true);
		mapView.setBuiltInZoomControls(true);
		setContentView(mapView); //displaying the MapView
		mapView.getController().setZoom(15); //set initial zoom-level, depends on your need
		mapView.getController().setCenter(new GeoPoint(52.221, 6.893)); //This point is in Enschede, Netherlands. You should select a point in your map or get it from user's location.
		mapView.setUseDataConnection(false); //keeps the mapView from loading online tiles using network connection.
	}
}



