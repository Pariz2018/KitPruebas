/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Arranque;
import com.selmec.kitpruebas.dto.ArranqueDTO;
import com.selmec.kitpruebas.services.IArranqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Arranque")
public class ArranqueContorller extends BaseController<Arranque, Integer, ArranqueDTO>{
                
    @Autowired
    IArranqueService arranqueService;

    public ArranqueContorller() {
        this.setDTO(ArranqueDTO.class);
        this.baseService = arranqueService;
    }
}
