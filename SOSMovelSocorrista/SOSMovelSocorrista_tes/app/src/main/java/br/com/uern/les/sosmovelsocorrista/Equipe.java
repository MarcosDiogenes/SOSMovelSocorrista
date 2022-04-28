package br.com.uern.les.sosmovelsocorrista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Equipe extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipe);

        ImageButton btnEqRegulacao = findViewById(R.id.btnEqRegulacao);
        ImageButton btnEqSinaisVitais = findViewById(R.id.btnEqSinaisVitais);
        ImageButton btnEqAndamento = findViewById(R.id.btnEqAndamento);
        ImageButton btnEqEquipe = findViewById(R.id.btnEqEquipe);
        ImageButton btnEqMapa = findViewById(R.id.btnEqMapa);

        btnEqRegulacao.setOnClickListener(this);
        btnEqSinaisVitais.setOnClickListener(this);
        btnEqAndamento.setOnClickListener(this);
        btnEqEquipe.setOnClickListener(this);
        btnEqMapa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnEqRegulacao:
                startActivity(new Intent(Equipe.this, Regulacao.class));
                break;
            case R.id.btnEqSinaisVitais:
                startActivity(new Intent(Equipe.this, SinaisVitais.class));
                break;
            case R.id.btnEqAndamento:
                startActivity(new Intent(Equipe.this, Andamento.class));
                break;
            case R.id.btnEqEquipe:
                startActivity(new Intent(Equipe.this, Equipe.class));
                break;
            case R.id.btnEqMapa:
                startActivity(new Intent(Equipe.this, Map.class));
                break;
        }

    }
}