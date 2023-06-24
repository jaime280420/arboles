package com.practica01.service.impl;

import com.practica01.dao.ArbolDao;
import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArbolServiceimpl implements ArbolService {

    @Autowired
    private ArbolDao arbolDao;

    @Override
    @Transactional(readOnly = true)
    public List<Arbol> getArboles(boolean activos) {
        List<Arbol> lista = arbolDao.findAll();

        if (activos) {
            //Para remover las categorias donde activo sea igual a falso
            lista.removeIf(x -> !x.isActivo());
        }
        return lista;

    }
}
