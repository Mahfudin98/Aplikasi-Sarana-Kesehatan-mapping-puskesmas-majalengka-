package com.example.saranakesehatan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cari(View view) {
        Intent intent = new Intent(MainActivity.this,cari.class);
        startActivity(intent);
    }

    public void daftar(View view) {
        Intent intent = new Intent(MainActivity.this,daftar.class);
        startActivity(intent);
    }

    public void peta(View view) {
        Intent intent = new Intent(MainActivity.this,peta.class);
        startActivity(intent);
    }

    public void tentang(View view) {
        Intent intent = new Intent(MainActivity.this,tentang.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Apakah kamu ingin keluar?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
