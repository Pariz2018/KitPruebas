/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author GEIDAR
 */
public class PruebaDTO implements java.io.Serializable {

    public int id;
    public EnsambleDTO ensamble;
    public IncidenciaDTO incidencias;
    public int tipo;
    public int estatus;
    public Date dtInicio;
    public Date dtFin;
    public String comentario;
    public int aprueba;
    public Date dtAprueba;
    public int apruebaSupervisor;
    public Date dtApruebaSupervisor;
    public Set lecturases = new HashSet(0);//posible referencia circular?

    public PruebaDTO() {
    }
}
