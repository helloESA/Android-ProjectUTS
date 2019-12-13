package com.meproduction.grosirin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tokoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toko);
        Button toko1 = (Button) findViewById(R.id.btn_toko1);
        Button toko2 = (Button) findViewById(R.id.btn_toko2);
        Button toko3 = (Button) findViewById(R.id.btn_toko3);
        Button toko4 = (Button) findViewById(R.id.btn_toko4);
        Button toko5 = (Button) findViewById(R.id.btn_toko5);
        Button toko6 = (Button) findViewById(R.id.btn_toko6);
        Button toko7 = (Button) findViewById(R.id.btn_toko7);
        Button toko8 = (Button) findViewById(R.id.btn_toko8);

        toko1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toko1I = new Intent(tokoActivity.this, PilihItemActivity.class);
                tokoActivity.this.startActivity(toko1I);
            }
        });

        toko2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toko2I = new Intent(tokoActivity.this, PilihItemActivity.class);
                tokoActivity.this.startActivity(toko2I);
            }
        });

        toko3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toko3I = new Intent(tokoActivity.this, PilihItemActivity.class);
                tokoActivity.this.startActivity(toko3I);
            }
        });

        toko4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toko4I = new Intent(tokoActivity.this, PilihItemActivity.class);
                tokoActivity.this.startActivity(toko4I);
            }
        });

        toko5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(tokoActivity.this);
                builder.setMessage("Mohon Maaf Toko Tutup")
                        .setNegativeButton("Kembali", null).create().show();
            }
        });

        toko6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(tokoActivity.this);
                builder.setMessage("Mohon Maaf Toko Tutup")
                        .setNegativeButton("Kembali", null).create().show();
            }
        });

        toko7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(tokoActivity.this);
                builder.setMessage("Mohon Maaf Toko Tutup")
                        .setNegativeButton("Kembali", null).create().show();
            }
        });

        toko8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(tokoActivity.this);
                builder.setMessage("Mohon Maaf Toko Tutup")
                        .setNegativeButton("Kembali", null).create().show();
            }
        });
    }
}
