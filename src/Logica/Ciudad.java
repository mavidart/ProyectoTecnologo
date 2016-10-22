package Logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Ciudad implements Serializable {
    
    @Id private String nombre;
    
    @ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    @JoinColumn(name="nombre_Pais")
    private Pais pais;

    public Ciudad() {
        pais=null;
    }
    
    public Ciudad(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }
    public String getNombre() {
        return nombre;
    }
    public Pais getPais(){
        return this.pais;
    }
     
    
}
