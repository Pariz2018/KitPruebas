/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Instalacion;
import com.selmec.utils.dao.IGenericDao;
import com.selmec.utils.services.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstalacionService extends BaseServices<Instalacion, Integer> implements IInstalacionService {

    @Autowired
    public void setDao(IGenericDao<Instalacion, Integer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Instalacion.class);
    }
}
