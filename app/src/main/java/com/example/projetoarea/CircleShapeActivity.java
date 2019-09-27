package com.example.projetoarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CircleShapeActivity extends AppCompatActivity {

    private EditText etRaio;
    private Button btnCalcular;
    private Float raio;
    private Float resultado;
    public static final String EXTRA_RAIO = "raio";
    public static final String EXTRA_RESULTADO = "resultado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_shape);

        etRaio = findViewById(R.id.etRaio);
        btnCalcular= findViewById(R.id.btnCalcularC);

        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                raio = Float.valueOf(etRaio.getText().toString());
                calcular();
            }
        });
    }

    public void calcular() {

        resultado = 3.14159f * (raio*raio);

        Intent intent = new Intent(this, ResultActivityCircle.class);
        intent.putExtra(EXTRA_RAIO, raio);
        Log.d("ALCM",  "Raio -> "+raio);
        intent.putExtra(EXTRA_RESULTADO, resultado);
        Log.d("ALCM",  "Resultado -> "+resultado);
        startActivity(intent);
    }

}
