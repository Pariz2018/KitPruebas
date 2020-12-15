/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Iteraciones;
import com.selmec.kitpruebas.dto.IteracionDTO;
import com.selmec.kitpruebas.services.IIteracionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Iteraciones")
public class IteracionesController extends BaseController<Iteraciones, Integer, IteracionDTO> {

    @Autowired
    IIteracionesService iteracionesService;

    public IteracionesController() {
        this.setDTO(IteracionDTO.class);
        this.baseService = iteracionesService;
    }
}
