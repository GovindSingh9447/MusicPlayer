package com.example.soc_macmini_15.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.soc_macmini_15.musicplayer.Activity.MainActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread= new Thread() {
            public void run() {
                try {
                    sleep(3000);



                } catch (Exception e) {
                    e.printStackTrace();


                } finally {

                    Intent intent=new Intent( Splash.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }

            }


        };thread.start();


    }
}