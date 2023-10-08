package com.example.pagela.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pagela.Controller.PacienteController;
import com.example.pagela.R;
import com.example.pagela.api.AppUtil;
import com.example.pagela.model.Paciente;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Paciente obj;
    private static final String PREF_NOME="APP_SAUDE_MENTAL";
    SharedPreferences sharedPreferences;
    PacienteController pac=new PacienteController(getApplicationContext());
   private EditText edite_idede,edite_nome,edite_cpf,edite_dataNascimento,edite_senha,edite_senha2,edite_email;
   private Button criar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        Log.i(AppUtil.TAG, "Oncreate Main rodando");
        sharedPreferences=getSharedPreferences(PREF_NOME, Context.MODE_PRIVATE);
        Log.i(AppUtil.TAG, "Oncreate Pasta Shared Criada");
        iniciarComponentes();
        String[] mensagem={"Prencha todos os campos","Cadastro realizado com sucesso"};

        criar.setOnClickListener(new View.OnClickListener() {
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
           edite_nome=(EditText) findViewById(R.id.cadTextNome);
        edite_cpf=(EditText) findViewById(R.id.cadTextCpf);
        edite_idede=(EditText) findViewById(R.id.cadTextidade);
        edite_dataNascimento=(EditText) findViewById(R.id.cadTextData);
        edite_email=(EditText) findViewById(R.id.cadTextEmail);
        edite_senha=(EditText) findViewById(R.id.cadTexSenha);
        edite_senha2=(EditText) findViewById(R.id.cadTexConfirmarSenha);
        criar=(Button) findViewById(R.id.buttonCriar);

        }
    }


