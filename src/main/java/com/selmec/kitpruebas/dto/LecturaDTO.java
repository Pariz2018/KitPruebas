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
public class LecturaDTO implements java.io.Serializable {

    public int id;
    //public PruebaDTO prueba; referencia circular?, creo que sí
    public double l1l2;
    public double l2l3;
    public double l3l1;
    public double hz;
    public int temp;
    public double l1;
    public double l2;
    public double l3;
    public Date dtStamp;
    public int rmp;
    public double i1;
    public double i2;
    public double i3;
    public double bateria;
    public int segundo;
    public int iteracion;
     //public IteracionesDTO iteraciones;//se hace referencia circular?, creo que sí

    public LecturaDTO() {
    }
}
