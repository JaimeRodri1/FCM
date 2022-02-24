package com.example.frecuenciacardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {



    private EditText CE;
    private ImageButton Cal;
    private TextView data;
    private ImageView lat;
    double FCM;
    double edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CE = (EditText) findViewById(R.id.Edad);
        Cal = (ImageButton) findViewById(R.id.BTcalcu);
        data = (TextView) findViewById(R.id.txtVfrecue);
        lat = findViewById(R.id.foncal);
        Glide.with(getApplicationContext()).load(R.drawable.latdo1).into(lat);



        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CE.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"¡No ha escrito su edad!",Toast.LENGTH_SHORT).show();
                }
                else{
                    calculo();
                    CE.getText().clear();
                }
            }
        });
    }


    public void calculo() {
        int FCe;
        edad = Double.parseDouble(CE.getText().toString());
        FCM = ((207 - (0.7019864 * edad)));
        FCe = (int) FCM;
        data.setText(""+FCe+" lpm");

    }
}