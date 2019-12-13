package com.meproduction.grosirin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PilihItemActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_item);

        button = findViewById(R.id.buttonPilih1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keranjang = new Intent(PilihItemActivity.this, KeranjangActivity.class);
                PilihItemActivity.this.startActivity(keranjang);
            }
        });

        button2 = findViewById(R.id.buttonPilih2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keranjang = new Intent(PilihItemActivity.this, KeranjangActivity.class);
                PilihItemActivity.this.startActivity(keranjang);
            }
        });

        button3 = findViewById(R.id.buttonPilih3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keranjang = new Intent(PilihItemActivity.this, KeranjangActivity.class);
                PilihItemActivity.this.startActivity(keranjang);
            }
        });
    }
}
