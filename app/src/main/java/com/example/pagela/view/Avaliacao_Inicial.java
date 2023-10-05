package com.example.pagela.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagela.R;

public class Avaliacao_Inicial extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao_inicial);
        getSupportActionBar().hide();
        Button button = (Button) findViewById(R.id.buttonEnviarAvaliacao);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Avaliacao_Inicial.this,Tela_Perfil_Paciente.class);
                startActivity(intent);
                finish();
            }
        });
    }
}