/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Ensamble;
import com.selmec.utils.dao.IGenericDao;
import com.selmec.utils.services.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GEIDAR
 */
@Service
public class EnsambleService extends BaseServices<Ensamble, Integer> implements IEnsambleService {

    @Autowired
    public void setDao(IGenericDao<Ensamble, Integer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Ensamble.class);
    }
}
