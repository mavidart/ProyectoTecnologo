/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

import java.util.ArrayList;


public class DtInfoServicio {
    private String nombre;
    private String descipcion;
    private Float precio;
    private String imagen1;
    private String imagen2;
    private String imagen3;
    private String destino;
    private String origen;
    private String proveedor;
    
    public DtInfoServicio(String nombre, String descipcion, Float precio, String imagen1, String imagen2, String imagen3, String destino, String origen, String proveedor) {
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.precio = precio;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.destino = destino;
        this.origen = origen;
        this.proveedor = proveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public void setImagen3(String imagen3) {
        this.imagen3 = imagen3;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public String getImagen1() {
        return imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public String getImagen3() {
        return imagen3;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }

    public String getProveedor() {
        return proveedor;
    }

    
    
}
