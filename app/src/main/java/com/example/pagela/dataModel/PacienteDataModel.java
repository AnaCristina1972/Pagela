package com.example.pagela.dataModel;

public class PacienteDataModel {
    public static final String TABELA="Paciente";
    public static final String ID="id";
    public static final String NOME="NOME";
    public static final String CPF="cpf";
    public static final String EMAIL="email";
    public static final String SENHA="senha";
    public static final String DATA_NASCIMENTO="datanascimento";
    public static final String IDADE="idade";

//Query para criar a tabela no bando de dados
    public static String queryCriarTabela="";

    //Metodo para criar a tabela
    public static String CriarTabela(){
        queryCriarTabela+="CREATE TABLE"+TABELA+"(";
        queryCriarTabela+=ID+"integer primary key autoincrement, ";
        queryCriarTabela+=NOME+"Text, ";
        queryCriarTabela+=CPF+"Text,";
        queryCriarTabela+=EMAIL+"Text, ";
        queryCriarTabela+=SENHA+"Text, ";
        queryCriarTabela+=DATA_NASCIMENTO+"Text, ";
        queryCriarTabela+=IDADE+"Text, ";
        queryCriarTabela+=") ";
        return queryCriarTabela;
    }
}
