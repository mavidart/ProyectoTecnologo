package DataTypes;

import java.util.Date;


public class DtReserva {
    
private String nombre;    
private Integer cantidad;
private Date fechaI;
private Date fechaF;
private String proveedor;

public DtReserva() {
}

public DtReserva(String nombre, Integer cantidad, Date fechaI, Date fechaF, String proveedor) {
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.fechaI = fechaI;
    this.fechaF = fechaF;
    this.proveedor = proveedor;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaI(Date fechaI) {
        this.fechaI = fechaI;
    }

    public void setFechaF(Date fechaF) {
        this.fechaF = fechaF;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Date getFechaI() {
        return fechaI;
    }

    public Date getFechaF() {
        return fechaF;
    }

    public String getProveedor() {
        return proveedor;
    }

    
    

}
