package Logica;

import DataTypes.EstadoReserva;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

@Entity
public class Reserva implements Serializable {
        
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(generator = "my_seq",strategy=GenerationType.SEQUENCE)
    //@SequenceGenerator(name="my_seq",sequenceName="MY_SEQ", allocationSize=1)       
       
    @Id
    @GeneratedValue(generator = "ReservaSeq",strategy=GenerationType.AUTO)
    @SequenceGenerator(name = "ReservaSeq", sequenceName = "RESERVA_SEQ", allocationSize = 1)
    private Integer numero;    
    
    private float precioTotal;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private EstadoReserva estado;
    
    @ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    private Cliente cliente;      
  
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    //private ArrayList<ResServ> resserv;
    private List <ResServ> resserv;
    
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    private List <ResPro> respros;
    

    public Reserva() {
        cliente = null;
         respros= new ArrayList<>();
         resserv= new ArrayList<>();        
    }

    public Reserva( float precioTotal, Date fecha, EstadoReserva estado, Cliente cliente, List <ResServ> resserv, List <ResPro> respros) {
     
        this.precioTotal = precioTotal;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        this.resserv = resserv;
        this.respros = respros;
    }

       
    public Integer getNumero() {
        return numero;
    }   
    public float getPrecioTotal() {
        return precioTotal;
    }
    public Date getFecha() {
        return fecha;
    }
    public EstadoReserva getEstado() {
        return estado;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public List<ResServ> getResserv() {
        return resserv;
    }
    public List<ResPro> getRespros() {
        return respros;
    }
    
    

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public void setResserv(List<ResServ> resserv) {
        this.resserv = resserv;
    }
    public void setRespros(List<ResPro> respros) {
        this.respros = respros;
    }    
    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
