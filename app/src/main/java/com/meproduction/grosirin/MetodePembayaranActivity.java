package com.meproduction.grosirin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MetodePembayaranActivity extends AppCompatActivity {
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_pembayaran);

        button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kerj = new Intent(MetodePembayaranActivity.this, ListBankActivity.class);
                MetodePembayaranActivity.this.startActivity(kerj);
            }
        });

        button4 = findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keranjang = new Intent(MetodePembayaranActivity.this, ListBankActivity.class);
                MetodePembayaranActivity.this.startActivity(keranjang);
            }
        });

        button5 = findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keranjang = new Intent(MetodePembayaranActivity.this, ListBankActivity.class);
                MetodePembayaranActivity.this.startActivity(keranjang);
            }
        });
    }
}
