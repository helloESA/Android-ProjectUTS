package com.meproduction.grosirin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class InvoiceActivity extends AppCompatActivity {
    ListView vListView;
    SimpleAdapter vSimpleAdapter;
    HashMap<String, String> vMap;
    ArrayList<HashMap<String, String>> vListData;
    String[] vGambarBarang;
    String[] vNamaBarang;
    String[] vJumlah;
    String[] vTotalHarga;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);

        vListView = (ListView)findViewById(R.id.listViewBarang);
        vGambarBarang = new String[] {
                Integer.toString(R.drawable.gulaku), Integer.toString(R.drawable.minyak), Integer.toString(R.drawable.donat)
        };
        vNamaBarang = new String[] {
                "Gulaku", "Minyak", "Donat"
        };
        vJumlah = new String[] {
                "Jumlah: 5", "Jumlah: 2", "Jumlah: 15"
        };
        vTotalHarga = new String[] {
                "Total Harga: Rp.123.000", "Total Harga: Rp.55.000", "Total Harga: Rp.225.000"
        };

        vListData = new ArrayList<HashMap<String, String>>();

        for(int i = 0; i < 3; i++) {
            vMap = new HashMap<String, String>();
            vMap.put("GambarBarang", vGambarBarang[i]);
            vMap.put("NamaBarang", vNamaBarang[i]);
            vMap.put("Jumlah", vJumlah[i]);
            vMap.put("TotalHarga", vTotalHarga[i]);
            vListData.add(vMap);
        }

        vSimpleAdapter = new SimpleAdapter(this, vListData, R.layout.invoice_item, new String[]{"GambarBarang","NamaBarang", "Jumlah", "TotalHarga"}, new int[]{R.id.imageViewBarang,R.id.textViewNamaBarang, (R.id.textViewJumlahBarang), (R.id.textViewTotalHarga)});
        vListView.setAdapter(vSimpleAdapter);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keranjang = new Intent(InvoiceActivity.this, PilihItemActivity.class);
                InvoiceActivity.this.startActivity(keranjang);
            }
        });
    }
}
