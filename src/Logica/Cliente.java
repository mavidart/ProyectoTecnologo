package Logica;

import DataTypes.DtReserva;
import DataTypes.EstadoReserva;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends Usuario {  
    
     @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER) 
    private List <Reserva> reservas;
        
    public Cliente() {
        reservas=new ArrayList<>();
    }
    
    public void crearReserva(Reserva nueva){
        //String codigo = java.util.UUID.randomUUID().toString();       
        //Reserva nueva = new Reserva(precio, new Date(), EstadoReserva.registrada,this, dtS, dtP);
        reservas.add(nueva);        
    }

    public Cliente(List <Reserva> reservas, String nick, String nombre, String apellido, String correo, Date fechaN, String foto) {
        super(nick, nombre, apellido, correo, fechaN, foto);
        this.reservas = reservas;
    }

     
    public void addReservas(Cliente cli,Reserva res) {
        List <Reserva> reser = cli.getReservas();
        reser.add(res);
        cli.setReservas(reser);
    }

    
   public void borrarReserva(Reserva borrar){
       reservas.remove(borrar);
   }

    public void setReservas(List <Reserva> reservas) {
        this.reservas = reservas;
    }

    public List <Reserva> getReservas() {
        return reservas;
    }    
    
}
