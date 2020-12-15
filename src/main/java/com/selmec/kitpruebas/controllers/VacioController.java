/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Vacio;
import com.selmec.kitpruebas.dto.VacioDTO;
import com.selmec.kitpruebas.services.IVacioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Vacio")
public class VacioController extends BaseController<Vacio, Integer, VacioDTO> {

    @Autowired
    IVacioService vacioService;

    public VacioController() {
        this.setDTO(VacioDTO.class);
        this.baseService = vacioService;
    }
}
