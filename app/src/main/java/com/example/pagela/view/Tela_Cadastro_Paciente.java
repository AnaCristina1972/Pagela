package com.example.pagela.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pagela.Controller.PacienteController;
import com.example.pagela.api.AppUtil;
import com.example.pagela.R;
import com.example.pagela.model.Paciente;

public class Tela_Cadastro_Paciente extends AppCompatActivity {

private EditText edite_idede;
    private EditText edite_nome;
    private EditText edite_cpf;
    private EditText edite_dataNascimento;
    private EditText edite_senha;
    private EditText edite_senha2;
    private EditText edite_email;
private Button criar;
Paciente objPaciente;
PacienteController pacienteController= new PacienteController(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_paciente);
        getSupportActionBar().hide();
        iniciarComponentes();
        Log.i(AppUtil.TAG,"onCreate: PacienteController");

        criar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Tela_Cadastro_Paciente.this, Avaliacao_Inicial.class);
                startActivity(intent);
            }
        });
    }
    private void iniciarComponentes(){
        edite_nome=(EditText) findViewById(R.id.cadTextNome);
        edite_cpf=(EditText) findViewById(R.id.cadTextCpf);
        edite_idede=(EditText) findViewById(R.id.cadTextidade);
        edite_dataNascimento=(EditText) findViewById(R.id.cadTextData);
        edite_email=(EditText) findViewById(R.id.editTextEmail);
        edite_senha=(EditText) findViewById(R.id.cadTexSenha);
        edite_senha2=(EditText) findViewById(R.id.cadTexConfirmarSenha);
        criar=(Button) findViewById(R.id.buttonCriar);
    }



}