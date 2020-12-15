/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Prueba;
import com.selmec.utils.dao.IGenericDao;
import com.selmec.utils.services.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GEIDAR
 */
@Service
public class PruebaService extends BaseServices<Prueba, Integer> implements IPruebaService {

    @Autowired
    public void setDao(IGenericDao<Prueba, Integer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Prueba.class);
    }
}
