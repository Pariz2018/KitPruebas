/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Cariles;
import com.selmec.utils.dao.IGenericDao;
import com.selmec.utils.services.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarilesService extends BaseServices<Cariles, Integer> implements ICarilesService {

    @Autowired
    public void setDao(IGenericDao<Cariles, Integer> daoToSet) {
        dao = daoToSet;
        dao.setClazz(Cariles.class);
    }
}
