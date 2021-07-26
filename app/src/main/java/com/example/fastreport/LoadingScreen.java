package com.example.fastreport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

       // Handler handler = new Handler();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent homeIntent = new Intent (LoadingScreen.this,MainActivity.class);
                startActivity(new Intent (LoadingScreen.this,MainActivity.class));
                finish();
            }
        },4000);

    }
}