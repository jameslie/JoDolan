package com.example.jodolan.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.jodolan.R;
import com.example.jodolan.database.AkunLogin;
import com.example.jodolan.database.AppDatabase;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appDatabase = AppDatabase.initDatabase(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                AkunLogin[] list = appDatabase.akunDAO().getData();
                Log.d("AkunFragment", "item : " + list.length);

                if (list.length == 0){
                    Intent homeIntent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(homeIntent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();;
                }else {
                    Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(homeIntent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();;
                }

            }
        },SPLASH_TIME_OUT);

    }
}


