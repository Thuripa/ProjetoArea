package com.example.projetoarea;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivityTriangle extends AppCompatActivity {

    private TextView lblArea;
    private  TextView lblBase;
    private TextView lblAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_triangle);

        lblArea = findViewById(R.id.lblAreaTotal);
        lblAltura = findViewById(R.id.lblAltura);
        lblBase = findViewById(R.id.lblBase);

        Intent intent = getIntent();

       /* float area = intent.getParcelableExtra("area");
        float base = intent.getParcelableExtra("base");
        float altura = intent.getParcelableExtra("altura");*/



        String base = intent.getStringExtra(TriangleShapeActivity.EXTRA_BASE);
        Log.d("ALCM",  "Base: "+base);
        String altura = intent.getStringExtra(TriangleShapeActivity.EXTRA_ALTURA);
        Log.d("ALCM",  "Altura: "+altura);
        String resultado = intent.getStringExtra(CircleShapeActivity.EXTRA_RESULTADO);
        Log.d("ALCM",  "Resultado: "+resultado);
        lblArea.setText("Área Total: "+ Float.valueOf(resultado));
        lblBase.setText("Base: "+Float.valueOf(base));
        lblAltura.setText("Altura: "+Float.valueOf(altura));
        Log.d("ALCM",  "Labels Ajustados");


    }
}
