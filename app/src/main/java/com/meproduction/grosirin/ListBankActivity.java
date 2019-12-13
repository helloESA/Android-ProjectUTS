package com.meproduction.grosirin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ListBankActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bank);

        button = findViewById(R.id.buttonLihatStruk);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keranjang = new Intent(ListBankActivity.this, InvoiceActivity.class);
                ListBankActivity.this.startActivity(keranjang);
            }
        });
    }
}
