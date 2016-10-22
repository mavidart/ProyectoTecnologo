package DataTypes;

import java.util.ArrayList;
import java.util.Date;

public class DtProveedor {
    
    private String nick;   
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaN;
    private String foto;
    private String nomEmp;   
    private String linkEmp;
    private ArrayList<String> servicios;
    private ArrayList<String> promociones;

    public DtProveedor() {
    } 

    public DtProveedor(String nick, String nombre, String apellido, String correo, Date fechaN, String foto, String nomEmp, String linkEmp, ArrayList<String> servicios, ArrayList<String> promociones) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaN = fechaN;
        this.foto = foto;
        this.nomEmp = nomEmp;
        this.linkEmp = linkEmp;
        this.servicios = servicios;
        this.promociones = promociones;
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
    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }
    public void setLinkEmp(String linkEmp) {
        this.linkEmp = linkEmp;
    }
    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
    }
    public void setPromociones(ArrayList<String> promociones) {
        this.promociones = promociones;
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
    public String getNomEmp() {
        return nomEmp;
    }
    public String getLinkEmp() {
        return linkEmp;
    }
    public ArrayList<String> getServicios() {
        return servicios;
    }
    public ArrayList<String> getPromociones() {
        return promociones;
    }
    
    
}
