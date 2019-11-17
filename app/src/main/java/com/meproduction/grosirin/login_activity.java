package com.meproduction.grosirin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        final EditText username = (EditText) findViewById(R.id.inuser);
        final EditText password = (EditText) findViewById(R.id.inpass);
        Button masuk = (Button) findViewById(R.id.btnlogin);
        Button daftar = (Button) findViewById(R.id.btndaftar);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uName = username.getText().toString();
                String uPass = password.getText().toString();

                if(uName.equals("Admin")&&uPass.equals("1234")){
                    Intent he = new Intent(login_activity.this, MenuUtama.class);
                    login_activity.this.startActivity(he);
                    finish();
                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(login_activity.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                    Toast.makeText(getApplicationContext(),"Username dan Password Tidak Tersedia",Toast.LENGTH_SHORT).show();
                }
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Fitur Belum Tersedia",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
