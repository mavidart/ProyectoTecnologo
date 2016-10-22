package DataTypes;

import java.util.ArrayList;

public class DtServicio {
    private String nombre;
    private String descripcion;
    private Float precio;
    private String ciudadOrigen;
    private String ciudadDestino;
    private ArrayList<String> categorias;
    private String proveedor;
   private String img1;
    private String img2;
    private String img3;

    public DtServicio(String nombre, String descripcion, Float precio, String ciudadOrigen, String ciudadDestino, ArrayList<String> categorias, String proveedor, String img1, String img2, String img3) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.categorias = categorias;
        this.proveedor = proveedor;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
    }    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Float getPrecio() {
        return precio;
    }
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    public String getCiudadDestino() {
        return ciudadDestino;
    }
    
    public String getProveedor() {
        return proveedor;
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public String getImg1() {
        return img1;
    }

    public String getImg2() {
        return img2;
    }

    public String getImg3() {
        return img3;
    }

    
}
