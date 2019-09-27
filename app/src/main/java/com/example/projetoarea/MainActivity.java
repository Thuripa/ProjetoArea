package com.example.projetoarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgFormas;
    private RadioButton rbSelecionado;
    private Button btnSeguinte;
    private TextView lblSelecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgFormas = findViewById(R.id.rgForma);
        lblSelecao = findViewById(R.id.lblSelecao);

        Button btnSeguinte = findViewById(R.id.btnSelecao);

        btnSeguinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = rgFormas.getCheckedRadioButtonId();
                rbSelecionado = findViewById(radioId);
                proximaTela();

            }
        });
    }
    //verifica qual opção foi selecionada entre os Radio Buttons
    public void getChecked(View v) {

        int radioId = rgFormas.getCheckedRadioButtonId();
        rbSelecionado = findViewById(radioId);
        lblSelecao.setText("Seleção: "+ rbSelecionado.getText());

    }

    public void proximaTela() {


        if(rbSelecionado == findViewById(R.id.rbCirculo)) {

            Intent intent = new Intent(this, CircleShapeActivity.class);
            startActivity(intent);

        } else if (rbSelecionado == findViewById(R.id.rbQuadrado)) {

            Intent intent = new Intent(this, SquareShapeActivity.class);
            startActivity(intent);

        } else if (rbSelecionado == findViewById(R.id.rbTriangulo)) {

            Intent intent = new Intent(this, TriangleShapeActivity.class);
            startActivity(intent);

        } else {

            //Caso nenhuma opção seja selecionada, exibe um toast de aviso
            Toast.makeText(this, "Selecione uma Opção", Toast.LENGTH_LONG).show();

        }
    }
}
