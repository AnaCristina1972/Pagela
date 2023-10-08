package com.example.pagela.dataSource;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.pagela.api.AppUtil;
import com.example.pagela.dataModel.PacienteDataModel;
import com.example.pagela.model.Paciente;

import java.util.List;

public class AppDatabase extends SQLiteOpenHelper {

public static final String BD= "AppSaudeMental.sqlite";
public static final int VERSION_DB = 1;
SQLiteDatabase db;
    public AppDatabase(Context context) {
        super(context, BD, null, VERSION_DB);
        Log.i(AppUtil.TAG,"AppDataBase:Crinando o Banco");
        db=getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        db.execSQL(PacienteDataModel.CriarTabela());
        Log.d(AppUtil.TAG,"Tabela Paciente"+PacienteDataModel.CriarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
    public boolean insert(String tabela, ContentValues dados){
       db=getWritableDatabase();
        boolean retorna=false;
        try {
            retorna=db.insert(tabela, null,dados)>0;
        }catch (Exception e){
            Log.d(AppUtil.TAG,"Insert "+e.getMessage());
        }
        return retorna;

    }
    /**
     * Metodo pra Alterar os dados no BD
     * @return
     */
    public boolean update(String tabela, ContentValues dados){
        db = getWritableDatabase();
        boolean retorna = false;
        try {
            retorna = db.update(tabela,dados,"id =?", new String[] {String.valueOf(dados.get("id"))}) > 0;

        }catch (Exception e){
            Log.d(AppUtil.TAG, "update "+e.getMessage());
        }

        return retorna;
    }
    /**
     * Metodo pra Excluir os dados no BD
     * @return
     */
    public boolean deleteById(String tabela, int id){
        db = getWritableDatabase();
        boolean retorno = false;
        try {
            retorno = db.delete(tabela,"id = ?",new String[] {String.valueOf(id)}) > 0;

        }catch (Exception e){
            Log.d(AppUtil.TAG, "Delete "+e.getMessage());
        }

        return retorno;
    }

    /**
     * Metodo pra Listar os dados no BD
     * @return
     */

}
