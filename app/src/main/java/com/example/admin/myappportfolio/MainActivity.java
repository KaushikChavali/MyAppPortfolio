package com.example.admin.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotifyStreamer(View view) {
        Toast.makeText(this, "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }

    public void scoresApp(View view){
        Toast.makeText(this, "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
    }

    public void libraryApp(View view){
        Toast.makeText(this, "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
    }

    public void buildItBigger(View view){
        Toast.makeText(this, "This button will launch my Build it Bigger app!", Toast.LENGTH_SHORT).show();
    }

    public void xyzReader(View view){
        Toast.makeText(this, "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
    }

    public void capstone(View view){
        Toast.makeText(this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
    }
}
