package com.example.pagela.Controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.example.pagela.api.AppUtil;
import com.example.pagela.dataModel.PacienteDataModel;
import com.example.pagela.dataSource.AppDatabase;
import com.example.pagela.model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteController extends AppDatabase implements Icrud<Paciente> {
    ContentValues dadosObjeto;
    public PacienteController(Context context) {
        super(context);
        Log.i(AppUtil.TAG,"PessoaController: Conectado");
    }

    @Override
    public boolean incluir(Paciente obj) {
        dadosObjeto=new ContentValues();
        dadosObjeto.put(PacienteDataModel.NOME,obj.getNome());
        dadosObjeto.put(PacienteDataModel.CPF,obj.getCpf());
        dadosObjeto.put(PacienteDataModel.DATA_NASCIMENTO,obj.getDatanascimento());
        dadosObjeto.put(PacienteDataModel.IDADE,obj.getIdade());
        dadosObjeto.put(PacienteDataModel.EMAIL,obj.getEmail());
        dadosObjeto.put(PacienteDataModel.SENHA,obj.getSenha());

        //Enviando dados pro database

        return insert(PacienteDataModel.TABELA,dadosObjeto);

    }

    @Override
    public boolean alterar(Paciente obj) {
        dadosObjeto=new ContentValues();
        dadosObjeto.put(PacienteDataModel.NOME,obj.getNome());
        dadosObjeto.put(PacienteDataModel.CPF,obj.getCpf());
        dadosObjeto.put(PacienteDataModel.DATA_NASCIMENTO,obj.getDatanascimento());
        dadosObjeto.put(PacienteDataModel.IDADE,obj.getIdade());
        dadosObjeto.put(PacienteDataModel.EMAIL,obj.getEmail());
        dadosObjeto.put(PacienteDataModel.SENHA,obj.getSenha());
        return true;

    }

    @Override
    public boolean deletar(Paciente obj) {
        dadosObjeto=new ContentValues();
        dadosObjeto.put(PacienteDataModel.ID,obj.getId());
        return true;
    }

    @Override
    public List<Paciente> listar() {
        List<Paciente> lista=new ArrayList<>();
        return  lista;
    }
}
