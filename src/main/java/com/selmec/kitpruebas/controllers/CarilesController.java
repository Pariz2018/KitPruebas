/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Cariles;
import com.selmec.kitpruebas.dto.CarilDTO;
import com.selmec.kitpruebas.services.ICarilesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Cariles")
public class CarilesController extends BaseController<Cariles, Integer, CarilDTO> {

    ICarilesService carilService;

    public CarilesController() {
        this.setDTO(CarilDTO.class);
        this.baseService = carilService;
    }

    /**
     * @param carilService the carilService to set
     */
    @Autowired
    public void setCarilService(ICarilesService carilService) {
        this.carilService = carilService;
        this.baseService = carilService;
    }

}
