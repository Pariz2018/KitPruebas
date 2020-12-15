/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.selmec.kitpruebas.dto;

/**
 *
 * @author GEIDAR
 */
public class MotorDTO implements java.io.Serializable {

    public String modelo;
    public int frecuenciaOperacion;
    public int kw;
    public int kva;
    public int amp;
    public int noFases;
    public String marca;
    public int kwContinuo;
    public int kvaContinuo;
    public int ampContinuo;
    public int combustible;
    public int tipoControl;
    public int rpm;
    public String generadorMarca;
    public String generadorModelo;
    public float derrateo;
    public float fp;
    //public Set plantas = new HashSet(0); //se hace referencia circular?, creo que sí

    public MotorDTO() {
    }
}
