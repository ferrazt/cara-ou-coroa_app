package com.example.alinhamento;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //recuperar dados
        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        //Lógica do cara ou coroa
        if(numero == 0){
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }else imageResultado.setImageResource(R.drawable.moeda_coroa);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
