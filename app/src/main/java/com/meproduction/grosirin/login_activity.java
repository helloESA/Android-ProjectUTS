package com.meproduction.grosirin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

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
                    Intent he = new Intent(login_activity.this, menuutama_activity.class);
                    login_activity.this.startActivity(he);
                    finish();
                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(login_activity.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent df = new Intent(login_activity.this, daftar_activity.class);
                login_activity.this.startActivity(df);
            }
        });

    }
}
