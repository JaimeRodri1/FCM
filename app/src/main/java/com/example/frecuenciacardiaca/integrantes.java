package com.example.frecuenciacardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class integrantes extends AppCompatActivity {

    private VideoView fond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrantes);

        fond = findViewById(R.id.intef);
        fond.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.integrantes));
        fond.start();
    }
}