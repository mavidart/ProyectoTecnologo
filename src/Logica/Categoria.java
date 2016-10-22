package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Categoria implements Serializable {
    @Id private String nombre;    
    
    public Categoria(){
        this.nombre = "";       
    }
    
    public Categoria(String nombre) {
        this.nombre = nombre;
      
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
      
}
