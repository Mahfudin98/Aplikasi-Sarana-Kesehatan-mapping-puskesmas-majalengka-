package com.example.saranakesehatan;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class peta extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peta);
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
        LatLng talaga = new LatLng(-6.98331, 108.311220);
        mMap.addMarker(new MarkerOptions().position(talaga).title("Puskesmas Talaga"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(talaga,10));

        LatLng cikijing = new LatLng(-7.011623, 108.353577);
        mMap.addMarker(new MarkerOptions().position(cikijing).title("Puskesmas Cikijing"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cikijing,10));

        LatLng cingambul = new LatLng(-7.043433, 108.353160);
        mMap.addMarker(new MarkerOptions().position(cingambul).title("Puskesmas Cingambul"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cingambul,10));

        LatLng lemahsugih = new LatLng(-7.011919, 108.169710);
        mMap.addMarker(new MarkerOptions().position(lemahsugih).title("Puskesmas Lemahsugih"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lemahsugih,10));

        LatLng margajaya = new LatLng(-6.989079, 108.189511);
        mMap.addMarker(new MarkerOptions().position(margajaya).title("Puskesmas Margajaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(margajaya,10));

        LatLng malausma = new LatLng(-7.044418, 108.253330);
        mMap.addMarker(new MarkerOptions().position(malausma).title("Puskesmas Malausma"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(malausma,10));

        LatLng bantarujeg = new LatLng(-6.965283, 108.241690);
        mMap.addMarker(new MarkerOptions().position(bantarujeg).title("Puskesmas Bantarujeg"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bantarujeg,10));

        LatLng banjaran = new LatLng(-6.961101, 108.314236);
        mMap.addMarker(new MarkerOptions().position(banjaran).title("Puskesmas Banjaran"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(banjaran,10));

        LatLng argapura = new LatLng(-6.909032, 108.314419);
        mMap.addMarker(new MarkerOptions().position(argapura).title("Puskesmas Argapura"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(argapura,10));

        LatLng maja = new LatLng(-6.889281, 108.304260);
        mMap.addMarker(new MarkerOptions().position(maja).title("Puskesmas Maja"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(maja,10));

        LatLng majalengka = new LatLng(-6.839964, 108.237997);
        mMap.addMarker(new MarkerOptions().position(majalengka).title("Puskesmas Majalengka"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(majalengka,10));

        LatLng munjul = new LatLng(-6.831188, 108.206072);
        mMap.addMarker(new MarkerOptions().position(munjul).title("Puskesmas Munjul"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(munjul,10));

        LatLng cigasong = new LatLng(-6.809019, 108.251935);
        mMap.addMarker(new MarkerOptions().position(cigasong).title("Puskesmas Cigasong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cigasong,10));

        LatLng sukahaji = new LatLng(-6.819008, 108.281898);
        mMap.addMarker(new MarkerOptions().position(sukahaji).title("Puskesmas Sukahaji"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sukahaji,10));

        LatLng salagedang = new LatLng(-6.800370, 108.313116);
        mMap.addMarker(new MarkerOptions().position(salagedang).title("Puskesmas Salagedang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(salagedang,10));

        LatLng sindang = new LatLng(-6.829396, 108.326942);
        mMap.addMarker(new MarkerOptions().position(sindang).title("Puskesmas Sindang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sindang,10));

        LatLng rajagaluh = new LatLng(-6.787232, 108.344993);
        mMap.addMarker(new MarkerOptions().position(rajagaluh).title("Puskesmas Rajagaluh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rajagaluh,10));

        LatLng sindangwangi = new LatLng(-6.791678, 108.376785);
        mMap.addMarker(new MarkerOptions().position(sindangwangi).title("Puskesmas Sindangwangi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sindangwangi,10));

        LatLng leuwimunding = new LatLng(-6.733796, 108.347950);
        mMap.addMarker(new MarkerOptions().position(leuwimunding).title("Puskesmas Leuwimunding"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(leuwimunding,10));

        LatLng waringin = new LatLng(-6.747497, 108.291142);
        mMap.addMarker(new MarkerOptions().position(waringin).title("Puskesmas waringin"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(waringin,10));

        LatLng jatiwangi = new LatLng(-6.839964, 108.237997);
        mMap.addMarker(new MarkerOptions().position(jatiwangi).title("Puskesmas Jatiwangi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jatiwangi,10));

        LatLng loji = new LatLng(-6.725339, 108.276578);
        mMap.addMarker(new MarkerOptions().position(loji).title("Puskesmas Loji"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(loji,10));

        LatLng balida = new LatLng(-6.727518, 108.206919);
        mMap.addMarker(new MarkerOptions().position(balida).title("Puskesmas Balida"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(balida,10));

        LatLng kasokandel = new LatLng(-6.741212, 108.225641);
        mMap.addMarker(new MarkerOptions().position(kasokandel).title("Puskesmas Kasokandel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kasokandel,10));

        LatLng panyingkiran = new LatLng(-6.803011, 108.184907);
        mMap.addMarker(new MarkerOptions().position(panyingkiran).title("Puskesmas Panyingkiran"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panyingkiran,10));

        LatLng kadipaten = new LatLng(-6.784164, 108.171366);
        mMap.addMarker(new MarkerOptions().position(kadipaten).title("Puskesmas Kadipaten"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kadipaten,10));

        LatLng kertajati = new LatLng(-6.665698, 108.172517);
        mMap.addMarker(new MarkerOptions().position(kertajati).title("Puskesmas Kertajati"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kertajati,10));

        LatLng sukamulya = new LatLng(-6.637456, 108.124846);
        mMap.addMarker(new MarkerOptions().position(sukamulya).title("Puskesmas Sukamulya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sukamulya,10));

        LatLng jatitujuh = new LatLng(-6.645520, 108.229305);
        mMap.addMarker(new MarkerOptions().position(jatitujuh).title("Puskesmas Jatitujuh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jatitujuh,10));

        LatLng panongan = new LatLng(-6.678001, 108.221163);
        mMap.addMarker(new MarkerOptions().position(panongan).title("Puskesmas Panongan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(panongan,10));

        LatLng ligung = new LatLng(-6.651983, 108.280152);
        mMap.addMarker(new MarkerOptions().position(ligung).title("Puskesmas Ligung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ligung,10));

        LatLng sumberjaya = new LatLng(-6.703496, 108.362148);
        mMap.addMarker(new MarkerOptions().position(sumberjaya).title("Puskesmas Sumberjaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sumberjaya,10));

        LatLng rsmajalengka = new LatLng(-6.833867, 108.233443);
        mMap.addMarker(new MarkerOptions().position(rsmajalengka).title("RSUD Majalengka"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rsmajalengka,10));

        LatLng budikasih = new LatLng(-6.800059, 108.182964);
        mMap.addMarker(new MarkerOptions().position(budikasih).title("RSK Bedah Budi Kasih"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(budikasih,10));

        LatLng cideres = new LatLng(-6.760723, 108.195024);
        mMap.addMarker(new MarkerOptions().position(cideres).title("Rumah Sakit Cideres"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cideres,10));
    }
}
