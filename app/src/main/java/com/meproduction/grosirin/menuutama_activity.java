package com.meproduction.grosirin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuutama_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama_activity);
        Button toko = (Button) findViewById(R.id.btn_toko);
        Button trx = (Button) findViewById(R.id.btn_transaksi);
        Button kate = (Button) findViewById(R.id.btn_kategori);
        Button akun = (Button) findViewById(R.id.btn_akun);
        Button uang = (Button) findViewById(R.id.btn_uang);
        Button promo = (Button) findViewById(R.id.btn_promo);

        toko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tokoI = new Intent(menuutama_activity.this, tokoActivity.class);
                menuutama_activity.this.startActivity(tokoI);
            }
        });

        trx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trxI = new Intent(menuutama_activity.this, activity_histori.class);
                menuutama_activity.this.startActivity(trxI);
            }
        });

        kate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kateI = new Intent(menuutama_activity.this, KategoriActivity.class);
                menuutama_activity.this.startActivity(kateI);
            }
        });

        akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent akunI = new Intent(menuutama_activity.this, profile_activity.class);
                menuutama_activity.this.startActivity(akunI);
            }
        });

        uang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(menuutama_activity.this);
                builder.setMessage("Mohon Maaf Fitur Belum Tersedia")
                        .setNegativeButton("Kembali", null).create().show();
            }
        });

        promo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(menuutama_activity.this);
                builder.setMessage("Mohon Maaf Fitur Belum Tersedia")
                        .setNegativeButton("Kembali", null).create().show();
            }
        });
    }
}
