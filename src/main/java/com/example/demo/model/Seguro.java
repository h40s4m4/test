package com.example.demo.model;

import java.io.Serializable;

public class Seguro implements Serializable {

    private String folio;
    private String codigoSucursal;
    private String rutPersona;
    private String fechaGrabacion;
    private String codigoTipoSeguro;
    private String estado;
    private String nombreTipoSeguro;
    private String nombrePersona;
    private String telefono;

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(String rutPersona) {
        this.rutPersona = rutPersona;
    }

    public String getFechaGrabacion() {
        return fechaGrabacion;
    }

    public void setFechaGrabacion(String fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }

    public String getCodigoTipoSeguro() {
        return codigoTipoSeguro;
    }

    public void setCodigoTipoSeguro(String codigoTipoSeguro) {
        this.codigoTipoSeguro = codigoTipoSeguro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreTipoSeguro() {
        return nombreTipoSeguro;
    }

    public void setNombreTipoSeguro(String nombreTipoSeguro) {
        this.nombreTipoSeguro = nombreTipoSeguro;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
