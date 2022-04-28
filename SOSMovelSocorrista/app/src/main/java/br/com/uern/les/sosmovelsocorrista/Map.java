package br.com.uern.les.sosmovelsocorrista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Map extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnMapRegulacao;
    ImageButton btnMapSinaisVitais;
    ImageButton btnMapAndamento;
    ImageButton btnMapEquipe;
    ImageButton btnMapMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        btnMapRegulacao = findViewById(R.id.btnMapRegulacao);
        btnMapSinaisVitais = findViewById(R.id.btnMapSinaisVitais);
        btnMapAndamento = findViewById(R.id.btnMapAndamento);
        btnMapEquipe = findViewById(R.id.btnMapEquipe);
        btnMapMapa = findViewById(R.id.btnMapMapa);

        btnMapRegulacao.setOnClickListener(this);
        btnMapSinaisVitais.setOnClickListener(this);
        btnMapAndamento.setOnClickListener(this);
        btnMapEquipe.setOnClickListener(this);
        btnMapMapa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnMapRegulacao:
                startActivity(new Intent(Map.this, Regulacao.class));
                break;
            case R.id.btnMapSinaisVitais:
                startActivity(new Intent(Map.this, SinaisVitais.class));
                break;
            case R.id.btnMapAndamento:
                startActivity(new Intent(Map.this, Andamento.class));
                break;
            case R.id.btnMapEquipe:
                startActivity(new Intent(Map.this, Equipe.class));
                break;
            case R.id.btnMapMapa:
                startActivity(new Intent(Map.this, Map.class));
                break;
        }

    }
}