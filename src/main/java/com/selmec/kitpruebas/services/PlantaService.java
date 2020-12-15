/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Planta;
import com.selmec.utils.dao.IGenericDao;
import com.selmec.utils.services.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GEIDAR
 */
@Service
public class PlantaService extends BaseServices<Planta, String> implements IPlantaService {

    @Autowired
    public void setDao(IGenericDao<Planta, String> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Planta.class);
    }
}
