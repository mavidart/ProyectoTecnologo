package Manejadores;

import Logica.Reserva;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ManejadorReserva {
        
    private List <Reserva> reservas; // clave string contiene objetos Usuario
    private static ManejadorReserva instancia=null;
    
     private ManejadorReserva(){
        reservas=new ArrayList<>(); // inicializar el mapa aquí
    }    
     
     public static ManejadorReserva getinstance(){
        if (instancia==null)
            instancia = new ManejadorReserva();
        return instancia;
    }  
     
      public void agregarReserva(Reserva r){
          reservas.add(r);
    };
    
      public boolean vacio(){
          if(reservas.isEmpty()){
              return true;
          }else
              return false;
      }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
      
     
      
      public ArrayList getReservas(){
        ArrayList retorno = new ArrayList();
            for(int i=0;i<reservas.size();i++){        
               Reserva ob= (Reserva) reservas.get(i);
               if(ob.getNumero()!=null)
                    retorno.add(ob.getNumero().toString());
            }
        return retorno;
    }
      
   public Reserva buscarRes(Integer clave){
        for(int i=0;i<reservas.size();i++){        
               Reserva aux =(Reserva) reservas.get(i);
               if(aux.getNumero().equals(clave)){
                   return aux;
               }                        
        }
         return null;
    }
   
   public void borrarReserva(Reserva borrar){
       reservas.remove(borrar);
   }
      
      
      
      
      
      
/*public List ListarReservas(){
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        Query qry= em.createQuery("SELECT r FROM Reserva r"); 
       
        List <Reserva> res=qry.getResultList();               
        em.close(); 
        
        for(int i=0;i<res.size();i++){
        
            Reserva r =(Reserva) res.get(i);
            //System.out.println(r.getNumero());
        } 
    return res;
}*/

//------------------------------------------------------------------------------
public void cargarColeccion(){    
//Traigo los datos de la base de datos y los cargo en la coleccion de reservas
        
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
    EntityManager em = emf.createEntityManager();
    Query qry= em.createQuery("SELECT r FROM Reserva r"); 

    List <Reserva> res = qry.getResultList();
    
        for(int i=0;i<res.size();i++){
        
            Reserva r =(Reserva) res.get(i);
            reservas.add(r);           
        }    
}    
//------------------------------------------------------------------------------
    
}
