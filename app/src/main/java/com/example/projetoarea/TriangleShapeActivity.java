package com.example.projetoarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TriangleShapeActivity extends AppCompatActivity {

    private EditText etBase;
    private EditText etAltura;
    private Button btnCalcular;
    private float base;
    private float altura;
    private float resultado;
    public static final String EXTRA_ALTURA = "altura";
    public static final String EXTRA_BASE = "base";
    public static final String EXTRA_RESULTADO = "resultado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_shape);

        etBase = findViewById(R.id.etBaseT);
        etAltura = findViewById(R.id.etAlturaT);

        btnCalcular= findViewById(R.id.btnCalcularT);

        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                base = Float.valueOf(etBase.getText().toString());
                altura = Float.valueOf(etBase.getText().toString());
                calcular();
            }
        });
    }

    public void calcular() {
        //calcula area
        resultado = (base * altura) / 2;

        Intent intent = new Intent(this, ResultActivityTriangle.class);
        intent.putExtra(EXTRA_BASE, base);
        Log.d("ALCM", "Base: "+base);
        intent.putExtra(EXTRA_ALTURA, altura);
        Log.d("ALCM", "Altura: "+altura);
        intent.putExtra(EXTRA_RESULTADO, resultado);
        Log.d("ALCM",  "Resultado: "+resultado);
        startActivity(intent);
    }
}
