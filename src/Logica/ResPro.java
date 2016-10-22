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
public class ResPro implements Serializable {
    
    @Id
    @GeneratedValue(generator = "ResProSeq")
    @SequenceGenerator(name = "ResProSeq", sequenceName = "RESPRO_SEQ", allocationSize = 1)
    private Long id;  
    
    private Integer cantidad;
    
    @Temporal(javax.persistence.TemporalType.DATE)    
    private Date fechaInicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;            
        
    @OneToOne
    @JoinColumn(name="nombre_promocion")
    private Promocion promo;
    
    public ResPro() {
        promo=null;
    }

    public Long getId() {
        return id;
    }

    public void setPromo(Promocion promo) {
        this.promo = promo;
    }


    public ResPro(Integer cantidad, Date fechaInicio, Date fechaFin, Promocion promo) {
        this.cantidad = cantidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.promo = promo;
    }
    
    public float obtenerPrecio(){
        return promo.getPrecioTotal();
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

    public Promocion getPromo() {
        return promo;
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
