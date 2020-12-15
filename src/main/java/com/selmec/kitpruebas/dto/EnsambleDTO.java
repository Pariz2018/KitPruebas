/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.dto;

import java.util.Date;

/**
 *
 * @author GEIDAR
 */
public class EnsambleDTO implements java.io.Serializable {

    public int id;
    public CarilDTO cariles;//posible referencai circular?
    public PlantaDTO planta;//posible referncia circular?
    public UbicacionDTO ubicaciones;
    public UsuarioDTO usuarios;
    public String folio;
    public Date dtCreacion;
    public String recibio;
    public String tecnico;
    //public Set pruebas = new HashSet(0);

    public EnsambleDTO() {
    }

}
