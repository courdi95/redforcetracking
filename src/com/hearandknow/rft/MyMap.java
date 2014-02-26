package com.hearandknow.rft;


import android.app.*;
import android.os.*;
import android.widget.*;
import org.osmdroid.util.*;
import org.osmdroid.views.*;
import org.osmdroid.tileprovider.tilesource.*;

public class MyMap extends Activity
{
	
	public MapView mapView;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.osmmap);
		
		Toast.makeText(getApplicationContext(), "bbbbbb",
					   Toast.LENGTH_SHORT).show();

	//	MapView mapView = new MapView(this, 256); //constructor
		
		mapView = (MapView) findViewById(R.id.mapview);
		//mapView.setClickable(true);
		mapView.setUseDataConnection(true);
		mapView.setTileSource (TileSourceFactory.CYCLEMAP);
		mapView.setTileSource (TileSourceFactory.MAPQUESTOSM);
		mapView.setBuiltInZoomControls(true);
//		mapView.setTileSource (TileSourceFactory.MAPNIK);
	//	setContentView(mapView); //displaying the MapView
		mapView.getController().setZoom(12); //set initial zoom-level, depends on your need
		mapView.getController().setCenter(new GeoPoint(49.0, 2.0)); //This point is in Enschede, Netherlands. You should select a point in your map or get it from user's location.
		mapView.setUseDataConnection(true); //keeps the mapView from loading online tiles using network connection.
	}
	
//	mapView.setUseDataConnection(true);
}



