package com.vickysg.quizforprogrammers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameRules extends AppCompatActivity {

    Button ok ;

    TextView t1, t2 ;

    ImageView appicon ;
    TextView apptitle1 , apptitle2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_rules);

        ok = findViewById(R.id.ok);

        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);

        appicon = findViewById(R.id.appicon);
        apptitle1 = findViewById(R.id.apptitle1);
        apptitle2 = findViewById(R.id.apptitle2);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameRules.this , PlayScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}