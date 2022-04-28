package br.com.uern.les.sosmovelsocorrista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SinaisVitais extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnSVRegulacao;
    ImageButton btnSVSinaisVitais;
    ImageButton btnSVAndamento;
    ImageButton btnSVEquipe;
    ImageButton btnSVMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinais_vitais);

        btnSVRegulacao = findViewById(R.id.btnSVRegulacao);
        btnSVSinaisVitais = findViewById(R.id.btnSVSinaisVitais);
        btnSVAndamento = findViewById(R.id.btnSVAndamento);
        btnSVEquipe = findViewById(R.id.btnSVEquipe);
        btnSVMapa = findViewById(R.id.btnSVMapa);

        btnSVRegulacao.setOnClickListener(this);
        btnSVSinaisVitais.setOnClickListener(this);
        btnSVAndamento.setOnClickListener(this);
        btnSVEquipe.setOnClickListener(this);
        btnSVMapa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnSVRegulacao:
                startActivity(new Intent(SinaisVitais.this, Regulacao.class));
                break;
            case R.id.btnSVSinaisVitais:
                startActivity(new Intent(SinaisVitais.this, SinaisVitais.class));
                break;
            case R.id.btnSVAndamento:
                startActivity(new Intent(SinaisVitais.this, Andamento.class));
                break;
            case R.id.btnSVEquipe:
                startActivity(new Intent(SinaisVitais.this, Equipe.class));
                break;
            case R.id.btnSVMapa:
                startActivity(new Intent(SinaisVitais.this, Map.class));
                break;
        }

    }
}
