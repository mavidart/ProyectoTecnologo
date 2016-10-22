package DataTypes;

import Logica.Servicio;
import java.util.ArrayList;
import java.util.Map;

public class DtPromocion {
    private String nombre;
    private float descuento;
    private float precioTotal;    
    private ArrayList<String> servicios;

    public DtPromocion(String nombre, float descuento, float precioTotal, ArrayList servicios) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.precioTotal = precioTotal;
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }
    public float getDescuento() {
        return descuento;
    }
    public float getPrecioTotal() {
        return precioTotal;
    }
    public ArrayList getServicios() {
        return servicios;
    }

        
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
    public void setServicios(ArrayList servicios) {
        this.servicios = servicios;
    }
    
}