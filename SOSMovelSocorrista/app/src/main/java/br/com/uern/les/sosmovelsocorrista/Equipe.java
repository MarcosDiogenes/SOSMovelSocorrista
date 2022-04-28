package br.com.uern.les.sosmovelsocorrista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Equipe extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnEqRegulacao;
    ImageButton btnEqSinaisVitais;
    ImageButton btnEqAndamento;
    ImageButton btnEqEquipe;
    ImageButton btnEqMapa;
    Button btnConfirmacao;
    EditText entradaCpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipe);

        btnEqRegulacao = findViewById(R.id.btnEqRegulacao);
        btnEqSinaisVitais = findViewById(R.id.btnEqSinaisVitais);
        btnEqAndamento = findViewById(R.id.btnEqAndamento);
        btnEqEquipe = findViewById(R.id.btnEqEquipe);
        btnEqMapa = findViewById(R.id.btnEqMapa);
        btnConfirmacao = findViewById(R.id.btnConfirmeCpf);
        entradaCpf = findViewById(R.id.entradaCpf);

        btnConfirmacao.setOnClickListener(this);
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
            case  R.id.btnConfirmeCpf:

                ArrayList<Equipe> listaBd = new ArrayList<Equipe>();

                for (int i = 0; i < listaBd.size(); i++) {
                    if (listaBd.get(i).getCPF() == entradaCpf) {
                        //exibir na tela
                    }
                }
                break;
        }

    }
}
