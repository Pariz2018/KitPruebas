package com.selmec.kitpruebas.Models;
// Generated Oct 26, 2014 8:36:36 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Ensamble generated by hbm2java
 */
@Entity
@Table(name="ensamble"
    ,catalog="kitpruebas"
    , uniqueConstraints = @UniqueConstraint(columnNames="Folio") 
)
public class Ensamble  implements java.io.Serializable {


     private Integer id;
     private Cariles cariles;
     private Planta planta;
     private Ubicaciones ubicaciones;
     private Usuarios usuarios;
     private String folio;
     private Date dtCreacion;
     private String recibio;
     private String tecnico;
     private Set pruebas = new HashSet(0);

    public Ensamble() {
    }

	
    public Ensamble(Cariles cariles, Planta planta, Ubicaciones ubicaciones, Usuarios usuarios, String folio, Date dtCreacion, String recibio, String tecnico) {
        this.cariles = cariles;
        this.planta = planta;
        this.ubicaciones = ubicaciones;
        this.usuarios = usuarios;
        this.folio = folio;
        this.dtCreacion = dtCreacion;
        this.recibio = recibio;
        this.tecnico = tecnico;
    }
    public Ensamble(Cariles cariles, Planta planta, Ubicaciones ubicaciones, Usuarios usuarios, String folio, Date dtCreacion, String recibio, String tecnico, Set pruebas) {
       this.cariles = cariles;
       this.planta = planta;
       this.ubicaciones = ubicaciones;
       this.usuarios = usuarios;
       this.folio = folio;
       this.dtCreacion = dtCreacion;
       this.recibio = recibio;
       this.tecnico = tecnico;
       this.pruebas = pruebas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CarrilID", nullable=false)
    public Cariles getCariles() {
        return this.cariles;
    }
    
    public void setCariles(Cariles cariles) {
        this.cariles = cariles;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PlantaID", nullable=false)
    public Planta getPlanta() {
        return this.planta;
    }
    
    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UbicacionId", nullable=false)
    public Ubicaciones getUbicaciones() {
        return this.ubicaciones;
    }
    
    public void setUbicaciones(Ubicaciones ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UsuarioID", nullable=false)
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    
    @Column(name="Folio", unique=true, nullable=false, length=50)
    public String getFolio() {
        return this.folio;
    }
    
    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dtCreacion", nullable=false, length=19)
    public Date getDtCreacion() {
        return this.dtCreacion;
    }
    
    public void setDtCreacion(Date dtCreacion) {
        this.dtCreacion = dtCreacion;
    }

    
    @Column(name="Recibio", nullable=false, length=100)
    public String getRecibio() {
        return this.recibio;
    }
    
    public void setRecibio(String recibio) {
        this.recibio = recibio;
    }

    
    @Column(name="Tecnico", nullable=false, length=100)
    public String getTecnico() {
        return this.tecnico;
    }
    
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ensamble")
    public Set getPruebas() {
        return this.pruebas;
    }
    
    public void setPruebas(Set pruebas) {
        this.pruebas = pruebas;
    }




}

