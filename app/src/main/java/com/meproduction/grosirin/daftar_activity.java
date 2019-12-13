package com.meproduction.grosirin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class daftar_activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_daftar);
        Button tambah = (Button) findViewById(R.id.simpan_button);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent df = new Intent(daftar_activity.this, login_activity.class);
                daftar_activity.this.startActivity(df);
            }
        });
    }
}
