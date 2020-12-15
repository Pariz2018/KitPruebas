/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Motores;
import com.selmec.kitpruebas.dto.MotorDTO;
import com.selmec.kitpruebas.services.IMotoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Motores")
public class MotoresController extends BaseController<Motores, String, MotorDTO> {

  
    IMotoresService motoresService;

    public MotoresController() {
        this.setDTO(MotorDTO.class);
        
    }

    /**
     * @param motoresService the motoresService to set
     */
      @Autowired
    public void setMotoresService(IMotoresService motoresService) {
        this.motoresService = motoresService;
        this.baseService = motoresService;
    }
}
