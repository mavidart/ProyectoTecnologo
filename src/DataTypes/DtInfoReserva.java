/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ubuntu
 */
public class DtInfoReserva {
    private Integer numero;
    private Date fecha;
    private float precio;
    private EstadoReserva estado;
    private List servicios;
    private List promociones; // private Map<Integer,ResPro> promociones;

    public DtInfoReserva(Integer numero, Date fecha, float precio, EstadoReserva estado, List servicios, List promociones) {
        this.numero = numero;
        this.fecha = fecha;
        this.precio = precio;
        this.estado = estado;
        this.servicios = servicios;
        this.promociones = promociones;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public void setServicios(List servicios) {
        this.servicios = servicios;
    }

    public void setPromociones(List promociones) {
        this.promociones = promociones;
    }

    public Integer getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public List getServicios() {
        return servicios;
    }

    public List getPromociones() {
        return promociones;
    }
    
}
