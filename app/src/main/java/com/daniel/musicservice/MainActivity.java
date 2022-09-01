package com.daniel.musicservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button buttonPlay;
   private Button buttonStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.buttonPlay = (Button)findViewById(R.id.read);
        this.buttonStop = (Button)findViewById(R.id.stop);

        this.buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSong();
            }
        });

        this.buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopSong();
            }
        });
    }

    // This method is called when users click on the Play button.
    public void playSong()  {
        // Create Intent object for PlaySongService.
        Intent myIntent = new Intent(MainActivity.this, LectureMusic.class);

        // Call startService with Intent parameter.
        this.startService(myIntent);
    }

    // This method is called when users click on the Stop button.
    public void stopSong( )  {

        // Create Intent object
        Intent myIntent = new Intent(MainActivity.this, LectureMusic.class);
        this.stopService(myIntent);
    }
}