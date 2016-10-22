package Logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Servicio implements Serializable {
    
    @Id private String nombre;    
    private String descripcion;
    private float precio;
    
    @ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    @JoinColumn(name="ciudad_origen")
    private Ciudad origen;
    
    @ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    @JoinColumn(name="ciudad_destino")
    private Ciudad destino;
   
    private String imagen1;
    private String imagen2;
    private String imagen3;
    private String proveedor;
    
    public Servicio() {
        origen=null;
        destino=null; 
    }

    public Servicio(String nombre, String descripcion, float precio, Ciudad origen, Ciudad destino, String imagen1, String imagen2, String imagen3, String proveedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.proveedor = proveedor;
    }     
    //Setters
    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
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

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    
    //Getters
    public Ciudad getDestino() {
        return destino;
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

    
    
    public Ciudad getOrigen() {
        return origen;
    }
    public String getNombre() {
        return nombre;
    }    
    public String getDescripcion() {
        return descripcion;
    }
    public float getPrecio() {
        return precio;
    }

    public String getProveedor() {
        return proveedor;
    }
    
}
