package com.example.pagela.view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pagela.Controller.PacienteController;
import com.example.pagela.R;
import com.example.pagela.model.Paciente;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Paciente obj;
    PacienteController pac=new PacienteController(getApplicationContext());
    private EditText nome,email,cpf,datanasc,idade,senha, senha2;
    Button cadastra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();
        iniciarComponentes();
        String[] mensagem={"Prencha todos os campos","Cadastro realizado com sucesso"};
        cadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = obj.getNome().toString();
                String email = obj.getEmail().toString();
                String cpf = obj.getCpf().toString();
                String data = obj.getDatanascimento().toString();
                String idade = obj.getIdade().toString();
                String senha = obj.getSenha().toString();
                if(cpf.isEmpty() || nome.isEmpty() || email.isEmpty() || data.isEmpty() || idade.isEmpty() || senha.isEmpty() ){
                    Snackbar snac= Snackbar.make(view,mensagem[0],Snackbar.LENGTH_SHORT);
                    snac.setTextColor(Color.BLACK);
                    snac.show();
                }else{
                    pac.incluir(obj);
                }


            }
        });

    }

        private void iniciarComponentes(){
            nome = (EditText) findViewById(R.id.cadTextNome);
            email = (EditText) findViewById(R.id.editTextEmail);
            cpf = (EditText) findViewById(R.id.cadTextNome);
            datanasc = (EditText) findViewById(R.id.editTextEmail);
            idade = (EditText) findViewById(R.id.cadTextNome);
            senha = (EditText) findViewById(R.id.editTextEmail);
            senha2 = (EditText) findViewById(R.id.cadTextNome);

        }
    }


