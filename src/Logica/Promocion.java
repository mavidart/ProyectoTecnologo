package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Promocion implements Serializable {
    
    @Id private String nombre;
    private float descuento;
    private float precioTotal;   
    
    @ManyToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    private List <Servicio> servicios;

    public Promocion() {
        servicios=new ArrayList<>();
    }

    public Promocion(String nombre, float descuento, float precioTotal, List <Servicio> servicios) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.precioTotal = precioTotal;
        this.servicios = servicios;
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
    public void setServicios(List<Servicio> servicios) {
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
    public List <Servicio> getServicios() {
        return servicios;
    }
}
