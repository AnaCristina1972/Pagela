package com.example.pagela.model;

import android.util.Log;
import com.example.pagela.api.AppUtil;

import com.example.pagela.Controller.Icrud;

import java.util.Date;

public class Paciente  {
    private int id;
    private String nome;
    private String cpf;
    private String datanascimento;
    private String idade;
    private String email;
    private String senha;
    private String senha2;

    //String confirmacaoSenha;

    public Paciente(int id, String nome, String cpf, String email, String senha, String datanascimento, String idade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.idade = idade;
        this.email = email;
        this.senha = senha;

    }

    public Paciente(String nome, String cpf, String email, String senha, String datanascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.email = email;
        this.senha = senha;
         }

    public Paciente() {
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha2() {
        return senha2;
    }

    public void setSenha2(String senha2) {
        this.senha2 = senha2;
    }
}