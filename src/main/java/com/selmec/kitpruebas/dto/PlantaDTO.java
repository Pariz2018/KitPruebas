/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.dto;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author GEIDAR
 */
public class PlantaDTO implements java.io.Serializable {

    public String noSerie;
    public MotorDTO motores;
    public String noOp;
    public String motorSerie;
    public String controlId;
    public int tipoOperacion;
    public String generadorSerie;
    public Integer voltaje;
    public Integer capInt;
    public Set ensambles = new HashSet(0);//se hace referencia circular?, 

    public PlantaDTO() {
    }
}
