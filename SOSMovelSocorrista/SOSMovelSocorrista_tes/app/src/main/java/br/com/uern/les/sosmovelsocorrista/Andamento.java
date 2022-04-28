package br.com.uern.les.sosmovelsocorrista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Andamento extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andamento);

        ImageButton btnAndRegulacao = findViewById(R.id.btnAndRegulacao);
        ImageButton btnAndSinaisVitais = findViewById(R.id.btnAndSinaisVitais);
        ImageButton btnAndAndamento = findViewById(R.id.btnAndAndamento);
        ImageButton btnAndEquipe = findViewById(R.id.btnAndEquipe);
        ImageButton btnAndMapa = findViewById(R.id.btnAndMapa);

        btnAndRegulacao.setOnClickListener(this);
        btnAndSinaisVitais.setOnClickListener(this);
        btnAndAndamento.setOnClickListener(this);
        btnAndEquipe.setOnClickListener(this);
        btnAndMapa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnAndRegulacao:
                startActivity(new Intent(Andamento.this, Regulacao.class));
                break;
            case R.id.btnAndSinaisVitais:
                startActivity(new Intent(Andamento.this, SinaisVitais.class));
                break;
            case R.id.btnAndAndamento:
                startActivity(new Intent(Andamento.this, Andamento.class));
                break;
            case R.id.btnAndEquipe:
                startActivity(new Intent(Andamento.this, Equipe.class));
                break;
            case R.id.btnAndMapa:
                startActivity(new Intent(Andamento.this, Map.class));
                break;
        }

    }
}