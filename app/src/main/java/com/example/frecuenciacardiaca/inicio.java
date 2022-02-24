package com.example.frecuenciacardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

public class inicio extends AppCompatActivity {

    private ImageButton ini;

    private ImageView gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        ini = (ImageButton) findViewById(R.id.IBini);
        gif = findViewById(R.id.fcgif);
        Glide.with(getApplicationContext()).load(R.drawable.gifxd).into(gif);


        ini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(p);
            }
        });
    }
}