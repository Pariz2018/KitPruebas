/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Instalacion;
import com.selmec.kitpruebas.dto.InstalacionDTO;
import com.selmec.kitpruebas.services.IInstalacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Instalacion")
public class InstalacionController extends BaseController<Instalacion, Integer, InstalacionDTO> {

    @Autowired
    IInstalacionService instalacionService;

    public InstalacionController() {
        this.setDTO(InstalacionDTO.class);
        this.baseService = instalacionService;
    }
}
