package com.vickysg.quizforprogrammers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView apptitle1 , apptitle2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        apptitle1 = findViewById(R.id.apptitle1);
        apptitle2 = findViewById(R.id.apptitle2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this , PlayScreen.class);
                startActivity(intent);
                finish();

            }
        },700);
    }
}