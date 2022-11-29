package com.example.sounddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mpPlayer;

    public void playAudio(View view){


        mpPlayer.start();
    }
    public void pauseAudio(View view){
        mpPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpPlayer = MediaPlayer.create(this, R.raw.fairy_audio);
    }
}