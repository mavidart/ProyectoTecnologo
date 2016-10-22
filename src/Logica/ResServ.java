package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

@Entity
public class ResServ implements Serializable {

     @Id
    @GeneratedValue(generator = "ResServSeq")
    @SequenceGenerator(name = "ResServSeq", sequenceName = "RESSERV_SEQ", allocationSize = 1)   
    private Long id;
    
    private Integer cantidad;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    //@OneToOne
    //private Servicio serv;

    @OneToOne
    @JoinColumn(name="nombre_servicio")
    private Servicio servicio;    

    public ResServ() {
        servicio=null;
    }

    public ResServ(Integer cantidad, Date fechaInicio, Date fechaFin, Servicio serv) {
        this.cantidad = cantidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.servicio = serv;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Long getId() {
        return id;
    }
     
    public float obtenerPrecio(){
        return servicio.getPrecio();
    }
    
    public Integer getCantidad() {
        return cantidad;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public Date getFechaFin() {
        return fechaFin;
    }

    public Servicio getServicio() {
        return servicio;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }  
   
    
}
