/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Usuarios;
import com.selmec.kitpruebas.dto.UsuarioDTO;
import com.selmec.kitpruebas.services.IUsuariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author rrojase
 */
@Controller
@RequestMapping("api/Usuarios")
public class UsuariosController extends BaseController<Usuarios, Integer, UsuarioDTO> {

    
    IUsuariosServices usuariosServices;

    @Autowired
    public void setUsuariosServices(IUsuariosServices usuariosServices) {
        this.usuariosServices = usuariosServices;
        this.baseService = usuariosServices;
    }

    public UsuariosController() {
        this.setDTO(UsuarioDTO.class);
        this.baseService = usuariosServices;
    }
}
