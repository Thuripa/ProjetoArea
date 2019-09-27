package com.example.projetoarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SquareShapeActivity extends AppCompatActivity{

    private EditText altura;
    private EditText largura;
    private Button btnCalcular;
    private float n1;
    private float n2;
    private float resultado;
    public static final String EXTRA_ALTURA = "altura" ;
    public static final String EXTRA_LARGURA = "largura";
    public static final String EXTRA_RESULTADO = "resultado";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_shape);

        Log.d("ALCM",  "OnCreate Chamado");
        altura = findViewById(R.id.etAlturaQ);
        largura = findViewById(R.id.etLarguraQ);

        btnCalcular = findViewById(R.id.btnCalcularQ);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Float.valueOf(altura.getText().toString());
                n2 = Float.valueOf(largura.getText().toString());
                Log.d("ALCM",  "n1:"+n1);
                calcular();
            }
        });

    }

    public void calcular() {
        resultado = n1 * n2;
        Toast.makeText(this, "Resposta :"+ resultado, Toast.LENGTH_LONG).show();

        Log.d("ALCM",  "Resultado quadrado ok");
        Intent intent = new Intent(this, ResultActivitySquare.class);
        intent.putExtra(EXTRA_LARGURA, n1);
        intent.putExtra(EXTRA_ALTURA, n2);
        intent.putExtra(EXTRA_RESULTADO, resultado);
        Log.d("ALCM",  "Extras ok: "+altura+" "+largura+" "+resultado);
        startActivity(intent);
    }
}