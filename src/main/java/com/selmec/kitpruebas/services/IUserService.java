/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Usuarios;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author rrojase
 */
public interface IUserService extends UserDetailsService {

    Usuarios findByName(String name);

}
