/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.implementacion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ingpa
 */
@Entity
@Table(name = "Clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private BigDecimal id;
    private String nombre;
    private String apellido;
    private double telefonomovil;
    private double telefonofijo;
    private String correo; 

    public BigDecimal getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getTelefonomovil() {
        return telefonomovil;
    }

    public double getTelefonofijo() {
        return telefonofijo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefonomovil(double telefonomovil) {
        this.telefonomovil = telefonomovil;
    }

    public void setTelefonofijo(double telefonofijo) {
        this.telefonofijo = telefonofijo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

       private static final Logger LOG = Logger.getLogger(Transacciones.class.getName());
   
}
