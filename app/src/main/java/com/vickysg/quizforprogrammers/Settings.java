package com.vickysg.quizforprogrammers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import static com.vickysg.quizforprogrammers.AppController.StopSound;


public class Settings extends AppCompatActivity {

    private Context mContext;
    private Switch mMusicCheckBox;
    private Button ok_btn;
    private boolean isMusicOn;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-3912259549278001/5733955406", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
                mInterstitialAd.show(Settings.this);
            }

        });

        mContext = Settings.this;
        AppController.currentActivity = this;

        intitViews();

        populateMusicEnalbeContents();
    }

    private void intitViews() {

        mMusicCheckBox = findViewById(R.id.music_checkbox);
        mMusicCheckBox.setChecked(true);
        ok_btn = findViewById(R.id.bt_settings);

        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPlayScreen();
            }
        });

    }

    private void goToPlayScreen() {

        Intent intentPlayScreen = new Intent(Settings.this,PlayScreen.class);
        startActivity(intentPlayScreen);
        finish();

    }

    public void viewClickHandler(View view) {

        switch (view.getId()){


            case R.id.music_checkbox:
                        switchMusicEnableCheckbox();
                        break;
        }

    }

    private void switchMusicEnableCheckbox() {

        isMusicOn = !isMusicOn;
        if (isMusicOn){
            SettingsPreferences.setMusicEnableDisable(mContext,true);
            AppController.playMusic();

        }else {
            SettingsPreferences.setMusicEnableDisable(mContext,false);
            StopSound();
        }

        populateMusicEnalbeContents();

    }


    protected void populateMusicEnalbeContents(){

        if (SettingsPreferences.getMusicEnableDisable(mContext)){
            AppController.playMusic();
            mMusicCheckBox.setChecked(true);
        }else {
            StopSound();
            mMusicCheckBox.setChecked(false);
        }
        isMusicOn = SettingsPreferences.getMusicEnableDisable(mContext);

    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Settings.this,PlayScreen.class);
        startActivity(intent);
        finish();
    }
}
