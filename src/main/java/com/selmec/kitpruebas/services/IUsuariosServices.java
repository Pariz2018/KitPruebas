package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Usuarios;
import com.selmec.utils.services.IBaseServices;

public interface IUsuariosServices extends IBaseServices<Usuarios, Integer> {

    public Usuarios GetByUsername(String paramString);
 
}
