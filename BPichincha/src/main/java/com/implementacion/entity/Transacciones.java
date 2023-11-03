
package com.implementacion.entity;

import java.math.BigDecimal;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transacciones")
public class Transacciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;
    private BigDecimal idcuenta;
    private String tipotransaccion;
    private BigDecimal valor;
    private String fecha;
    private String hora;

    public BigDecimal getId() {
        return id;
    }

    public BigDecimal getIdcuenta() {
        return idcuenta;
    }

    public String getTipotransaccion() {
        return tipotransaccion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public void setIdcuenta(BigDecimal idcuenta) {
        this.idcuenta = idcuenta;
    }

    public void setTipotransaccion(String tipotransaccion) {
        this.tipotransaccion = tipotransaccion;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
       private static final Logger LOG = Logger.getLogger(Transacciones.class.getName());
    
}
