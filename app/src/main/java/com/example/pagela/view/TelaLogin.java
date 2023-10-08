package com.example.pagela.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pagela.R;

public class TelaLogin extends AppCompatActivity {
Button button;
TextView textoCadastre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        getSupportActionBar().hide();
         button = (Button) findViewById(R.id.button);
         textoCadastre=(TextView)findViewById(R.id.textCadastre);


        textoCadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TelaLogin.this,Tela_Cadastro_Paciente.class);
                startActivity(intent);
            }
        });

        }





}