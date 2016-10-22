package Manejadores;

import Logica.Cliente;
import Logica.Reserva;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ManejadorCliente {   
    
     private List <Cliente> clientes; // clave string contiene objetos Usuario
     private static ManejadorCliente instancia=null;
     
     private ManejadorCliente(){
        clientes=new ArrayList<>(); // inicializar el mapa aquí
    }    
     
     public boolean vacio(){
          if(clientes.isEmpty()){
              return true;
          }else
              return false;
      }
     
     public static ManejadorCliente getinstance(){
        if (instancia==null)
            instancia = new ManejadorCliente();
        return instancia;
    }     
     
     public Cliente buscarPorCorreo(String correo){
         for(int i=0;i<clientes.size();i++){        
               Cliente aux =(Cliente) clientes.get(i);
               if(aux.getCorreo().equals(correo)){
                   return aux;
               }                        
        }
         return null;        
     }

    public Cliente buscarCli(String nick){
        for(int i=0;i<clientes.size();i++){        
               Cliente aux =(Cliente) clientes.get(i);
               if(aux.getNick().equals(nick)){
                   return aux;
               }                        
        }
         return null;
    }
    
    
    public Reserva buscarReserva(Cliente cli, Integer numReserva){
        
        for(int i=0;i<cli.getReservas().size();i++){              
                Reserva aux = (Reserva) cli.getReservas().get(i);                 
            
            if(aux.getNumero().equals(numReserva)){
                //System.out.println("eran iguales");
                return aux;            
            }         
        }
    return null;   
}
 /*public boolean buscarCliPorCorreo(String correo){
        boolean esta = false;
        List<Cliente> cl = ListarClientes();
        
        for(int i)
    }*/

    public List <Cliente> getClientesObjets() {
        return clientes;
    }

    public void vaciarClientes(){
        clientes = new ArrayList<>();
    }

    
    public void addCliente(Cliente cli){
        String n = cli.getNick();
        clientes.add(cli);
    }

    public ArrayList getClientes(){
       ArrayList retorno = new ArrayList();
        
         for(int i=0;i<clientes.size();i++){        
              Cliente ob =(Cliente) clientes.get(i);        
              retorno.add(ob.getNick());
        }
        return retorno;
    }
    
public List ListarClientes(){
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        Query qry= em.createQuery("SELECT c FROM Cliente c"); 
       
        List <Cliente> clies=qry.getResultList();               
        em.close(); 
        
        for(int i=0;i<clies.size();i++){
        
            Cliente c =(Cliente) clies.get(i);
            //System.out.println("NICK SACADO DE LA BASE DE DATOS" + c.getNick());
        } 
    return clies;
}
    
// Esto de recorrer solo lo usé para probar si agregaba el objeto a la coleccion
    public void recorrer(){           
           for(int i=0;i<clientes.size();i++){        
               Cliente ob =(Cliente) clientes.get(i);
               System.out.println("Objeto con nombre: "+ ob.getNombre());
       }
    }    
    
//------------------------------------------------------------------------------
public void cargarColeccion(){    
//Traigo los datos de la base de datos y los cargo en la coleccion de cleintes
        
    List <Cliente> clis = ListarClientes();    
        for(int i=0;i<clis.size();i++){
        
            Cliente c =(Cliente) clis.get(i);
            clientes.add(c);
        }    
}    
//------------------------------------------------------------------------------
    
}
