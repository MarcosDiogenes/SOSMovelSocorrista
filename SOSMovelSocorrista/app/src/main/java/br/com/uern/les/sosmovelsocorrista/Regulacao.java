package br.com.uern.les.sosmovelsocorrista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Regulacao extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnRegRegulacao;
    ImageButton btnRegSinaisVitais;
    ImageButton btnRegAndamento;
    ImageButton btnRegEquipe;
    ImageButton btnRegMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulacao);

        btnRegRegulacao = findViewById(R.id.btnRegRegulacao);
        btnRegSinaisVitais = findViewById(R.id.btnRegSinaisVitais);
        btnRegAndamento = findViewById(R.id.btnRegAndamento);
        btnRegEquipe = findViewById(R.id.btnRegEquipe);
        btnRegMapa = findViewById(R.id.btnRegMapa);

        btnRegRegulacao.setOnClickListener(this);
        btnRegSinaisVitais.setOnClickListener(this);
        btnRegAndamento.setOnClickListener(this);
        btnRegEquipe.setOnClickListener(this);
        btnRegMapa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnRegRegulacao:
                startActivity(new Intent(Regulacao.this, Regulacao.class));
                break;
            case R.id.btnRegSinaisVitais:
                startActivity(new Intent(Regulacao.this, SinaisVitais.class));
                break;
            case R.id.btnRegAndamento:
                startActivity(new Intent(Regulacao.this, Andamento.class));
                break;
            case R.id.btnRegEquipe:
                startActivity(new Intent(Regulacao.this, Equipe.class));
                break;
            case R.id.btnRegMapa:
                startActivity(new Intent(Regulacao.this, Map.class));
                break;
        }

    }
}