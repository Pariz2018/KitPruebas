/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Incidencias;
import com.selmec.kitpruebas.dto.IncidenciaDTO;
import com.selmec.kitpruebas.services.IIncidenciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Incidencias")
public class IncidenciasController extends BaseController<Incidencias, String, IncidenciaDTO> {

   
    IIncidenciasService incidenciasService;

    public IncidenciasController() {
        this.setDTO(IncidenciaDTO.class);
      
    }

    /**
     * @param incidenciasService the incidenciasService to set
     */
     @Autowired
    public void setIncidenciasService(IIncidenciasService incidenciasService) {
        this.incidenciasService = incidenciasService;
          this.baseService = incidenciasService;
    }
}
