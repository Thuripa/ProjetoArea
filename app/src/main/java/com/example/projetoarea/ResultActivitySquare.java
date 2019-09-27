package com.example.projetoarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivitySquare extends AppCompatActivity {

    private TextView lblArea;
    private TextView lbAltura;
    private TextView lblLargura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_square);

        lblArea = findViewById(R.id.lblAreaTotal);
        lbAltura = findViewById(R.id.lblHeight);
        lblLargura = findViewById(R.id.lblLargura);

        Intent intent = getIntent();
/*
        float area = intent.getParcelableExtra("area");
        float largura = intent.getParcelableExtra("largura");
        float altura = intent.getParcelableExtra("altura");
*/
        Log.d("ALCM",  "Valores Sendo Postos Quadrado");
        String altura1 = intent.getStringExtra(SquareShapeActivity.EXTRA_ALTURA);
        String largura1 = intent.getStringExtra(SquareShapeActivity.EXTRA_LARGURA);
        String resultado = intent.getStringExtra(SquareShapeActivity.EXTRA_RESULTADO);
        Log.d("ALCM",  "A"+altura1+"L:"+largura1+"R:"+resultado);
        lblArea.setText("Área Total: "+ resultado);
        lblLargura.setText("Largura: "+largura1);
        lbAltura.setText("Altura: "+altura1);
        Log.d("ALCM",  "Labels Ajustados");

    }
}
