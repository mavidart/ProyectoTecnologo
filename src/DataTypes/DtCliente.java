package DataTypes;

import java.util.ArrayList;
import java.util.Date;

public class DtCliente {
    
    private String nick;   
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaN;
    private String foto;
    private ArrayList<Integer> reservas;

    public DtCliente() {     
    }       

    public DtCliente(String nick, String nombre, String apellido, String correo, Date fechaN, String foto,ArrayList<Integer> reservas) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaN = fechaN;
        this.foto = foto;
        this.reservas=reservas;
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
    public void setReservas(ArrayList<Integer> reservas) {
        this.reservas = reservas;
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
    public ArrayList<Integer> getReservas() {
        return reservas;
    }
    
    
}
