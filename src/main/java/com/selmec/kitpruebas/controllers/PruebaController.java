/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Prueba;
import com.selmec.kitpruebas.services.IPruebaService;
import com.selmec.kitpruebas.dto.PruebaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Prueba")
public class PruebaController extends BaseController<Prueba, Integer, PruebaDTO> {

   
    IPruebaService pruebaService;

    public PruebaController() {
        this.setDTO(PruebaDTO.class);
       
    }

    /**
     * @param pruebaService the pruebaService to set
     */
     @Autowired
    public void setPruebaService(IPruebaService pruebaService) {
        this.pruebaService = pruebaService;
         this.baseService = pruebaService;
    }
}
