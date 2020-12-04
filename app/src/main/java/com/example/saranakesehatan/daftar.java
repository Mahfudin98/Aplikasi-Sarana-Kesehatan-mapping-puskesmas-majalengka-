package com.example.saranakesehatan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class daftar extends AppCompatActivity {

    String[] kesehatan = {"Puskesmas Talaga", " Puskesmas Cikijing", "Puskesmas Cingambul", "Puskesmas Lemahsugih", "Puskesmas Margajaya", "Puskesmas ", "Puskesmas Malausma", "Puskesmas Bantarujeg", "Puskesmas Banjaran", "Puskesmas Argapura", "Puskesmas Maja", "Puskesmas Majalengka", "Puskesmas Munjul", "Puskesmas Cigasong", "Puskesmas Sukahaji", "Puskesmas Salagedang", "Puskesmas Sindang", "Puskesmas Rajagaluh", "Puskesmas Sindangwangi", "Puskesmas Leuwimunding", "Puskesmas Waringin", "Puskesmas Jatiwangi", "Puskesmas Loji", "Puskesmas Balida", "Puskesmas Kasokandel", "Puskesmas Panyingkiran", "Puskesmas Kadipaten", "Puskesmas Kertajati", "Puskesmas Sukamulya", "Puskesmas Jatitujuh", "Puskesmas Panongan", "Puskesmas Ligung", "Puskesmas Sumberjaya", "RS Majalengka", "RS Cideres", "RS Bedah Budi Kasih"};
    ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        ListView listView = findViewById(R.id.listview1);
        data = new ArrayList<>();
        getData();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getName = data.get(position);
                Intent sendData = new Intent(daftar.this, keterangan.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);

            }
        });
    }
    private void getData(){
        Collections.addAll(data, kesehatan);
    }
}
