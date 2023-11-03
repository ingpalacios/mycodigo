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
@Table(name = "Cuentas")
public class Cuentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private BigDecimal id;
    private char tipo;
    private char estado;
    private String moneda;
    private BigDecimal cliente;
    private BigDecimal saldo;

    public BigDecimal getId() {
        return id;
    }

    public char getTipo() {
        return tipo;
    }

    public char getEstado() {
        return estado;
    }

    public String getMoneda() {
        return moneda;
    }

    public BigDecimal getCliente() {
        return cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
  
    public void setId(BigDecimal id) {
        this.id = id;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void setCliente(BigDecimal cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
        
      private static final Logger LOG = Logger.getLogger(Cuentas.class.getName());
    
    }
