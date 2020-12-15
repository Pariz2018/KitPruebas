/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Ensamble;
import com.selmec.kitpruebas.dto.EnsambleDTO;
import com.selmec.kitpruebas.services.IEnsambleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Ensamble")
public class EnsambleController extends BaseController<Ensamble, Integer, EnsambleDTO> {

    IEnsambleService ensambleService;

    public EnsambleController() {
        this.setDTO(EnsambleDTO.class);

    }

    /**
     * @param ensambleService the ensambleService to set
     */
    @Autowired
    public void setEnsambleService(IEnsambleService ensambleService) {
        this.ensambleService = ensambleService;
        this.baseService = ensambleService;
    }
}
