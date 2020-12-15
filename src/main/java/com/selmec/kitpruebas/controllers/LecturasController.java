/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Lecturas;
import com.selmec.kitpruebas.dto.LecturaDTO;
import com.selmec.kitpruebas.services.ILecturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Lecturas")
public class LecturasController extends BaseController<Lecturas, Integer, LecturaDTO> {

    @Autowired
    ILecturasService lecturasService;

    public LecturasController() {
        this.setDTO(LecturaDTO.class);
        this.baseService = lecturasService;
    }
}
