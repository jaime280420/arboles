package com.practica01.service;

import com.practica01.domain.Arbol;
import java.util.List;


public interface ArbolService {
    //Metodo que retorna la lista de arboles 

    public List<Arbol> getArboles(boolean activos);
}
