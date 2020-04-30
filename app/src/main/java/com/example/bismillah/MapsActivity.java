package com.example.bismillah;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng SPBU1 = new LatLng(-7.9756823,112.5717021);
        mMap.addMarker(new MarkerOptions().position(SPBU1).title("Marker in SPBU LOWOKDORO"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU1));

        LatLng SPBU2 = new LatLng(-7.972927,112.5911966);
        mMap.addMarker(new MarkerOptions().position(SPBU2).title("Marker in SPBU GADANG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU2));


        LatLng SPBU3 = new LatLng(-7.9375519,112.5918396);
        mMap.addMarker(new MarkerOptions().position(SPBU3).title("Marker in SPBU TLOGOMAS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU3));


        LatLng SPBU4 = new LatLng(-7.9194333,112.5847666);
        mMap.addMarker(new MarkerOptions().position(SPBU4).title("Marker in SPBU CILIWUNG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU4));

        LatLng SPBU5 = new LatLng(-7.9625117,112.6215156);
        mMap.addMarker(new MarkerOptions().position(SPBU5).title("Marker in SPBU JL.BANDUNG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU5));

        LatLng SPBU6 = new LatLng(-7.9376327,112.6271025);
        mMap.addMarker(new MarkerOptions().position(SPBU6).title("Marker in SPBU Soekarno Hatta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU6));

        LatLng SPBU7 = new LatLng(-7.9569189,112.6132898);
        mMap.addMarker(new MarkerOptions().position(SPBU7).title("Marker in SPBU Soekarno Hatta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU7));

        //coba


    }
}
