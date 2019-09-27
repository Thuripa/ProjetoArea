package com.example.projetoarea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivityCircle extends AppCompatActivity{

    private TextView lblArea;
    private TextView lblRaio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_circle);

        lblArea = findViewById(R.id.lblAreaTotal);
        lblRaio = findViewById(R.id.lblRaio);

        Intent intent = getIntent();
        String raio = intent.getStringExtra(CircleShapeActivity.EXTRA_RAIO);
        String resultado = intent.getStringExtra(CircleShapeActivity.EXTRA_RESULTADO);
        lblArea.setText("Área Total: "+ resultado);
        Log.d("ALCM",  "->resultado");
        lblRaio.setText("Raio: "+raio);
        Log.d("ALCM",  "-> Raio: "+raio);


    }
}
