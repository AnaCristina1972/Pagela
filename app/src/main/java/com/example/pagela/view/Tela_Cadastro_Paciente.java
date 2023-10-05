package com.example.pagela.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.pagela.Controller.PacienteController;
import com.example.pagela.api.AppUtil;
import com.example.pagela.R;

public class Tela_Cadastro_Paciente extends AppCompatActivity {

    PacienteController pacienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_paciente);
        getSupportActionBar().hide();
        Log.i(AppUtil.TAG,"onCreate: App database");
        pacienteController=new PacienteController(getApplicationContext());




    }

}