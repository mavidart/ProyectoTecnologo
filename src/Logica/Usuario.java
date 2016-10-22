package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Usuario implements Serializable {

    @Id private String nick;
    private String nombre;
    private String apellido;
    private String correo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaN;
    private String foto;
    
    public Usuario() {
    }
    
    public Usuario(String nick, String nombre, String apellido, String correo, Date fechaN, String foto) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaN = fechaN;
        this.foto = foto;
    }  
  
    
    public void setNick(String nick) {
        this.nick = nick;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
     public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }    
    
    public String getNick() {
        return nick;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public Date getFechaN() {
        return fechaN;
    }
    public String getFoto() {
        return foto;
    } 
  
    
}
