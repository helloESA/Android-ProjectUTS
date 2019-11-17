package com.meproduction.grosirin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;

public class splashScreen extends Activity {
    //set waktu splash screen tersebut
    private static int lama_tampil = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent roadto = new Intent(splashScreen.this,login_activity.class);
                startActivity(roadto);

                finish();
            }
        },lama_tampil);
    };
}
