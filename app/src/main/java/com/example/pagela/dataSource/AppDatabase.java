package com.example.pagela.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.pagela.api.AppUtil;
import com.example.pagela.dataModel.PacienteDataModel;

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
        db.execSQL(PacienteDataModel.CriarTAbela());
        Log.d(AppUtil.TAG,"Tabela Paciente"+PacienteDataModel.CriarTAbela());
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

}
