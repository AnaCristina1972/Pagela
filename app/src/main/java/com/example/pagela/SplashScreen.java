package com.example.pagela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    int TIME_SPLASH=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iniciarSplash();
    }
    private void iniciarSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this, TelaLogin.class);
                startActivity(intent);
                finish();
            }
        },TIME_SPLASH);
    }
}