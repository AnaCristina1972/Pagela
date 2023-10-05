package com.example.pagela.Controller;

import java.util.List;

public interface Icrud<T> {
    //incluir
    public  boolean incluir(T obj);

    //alterar
    public boolean alterar(T obj);

    //deletar
    public boolean deletar(T obj);
    //listar

    public List<T> listar();


}
