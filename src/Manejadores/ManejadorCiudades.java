package Manejadores;

import Logica.Ciudad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ManejadorCiudades {
    private Map<String, Ciudad> ciudades;
    private static ManejadorCiudades instancia = null;
    
    private ManejadorCiudades(){
        ciudades = new HashMap<>();
    }
    
    public boolean vacio(){
          if(ciudades.isEmpty()){
              return true;
          }else
              return false;
      }
    
    public static ManejadorCiudades getInstance(){
        if(instancia == null)
            instancia = new ManejadorCiudades();
        return instancia;
    }
    
    public void addCiudades(Ciudad ciu){
        String nombre = ciu.getNombre();
        if(this.obtenerCiudad(nombre) == null)
            ciudades.put(nombre, ciu);
    }
    
    
public List ListarCiudades(){
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        Query qry= em.createQuery("SELECT ci FROM Ciudad ci"); 
       
        List <Ciudad> cius=qry.getResultList();               
        em.close(); 
        
        for(int i=0;i<cius.size();i++){
            Ciudad ci =(Ciudad) cius.get(i);
            
        } 
    return cius;
}
    
    
    
    
    public Ciudad obtenerCiudad(String nombre){
        return ((Ciudad) ciudades.get(nombre));
    }
    
    public ArrayList getCiudades(){
        ArrayList retorno = new ArrayList();
        for(Map.Entry<String,Ciudad> entry:ciudades.entrySet()){
           Ciudad ob=entry.getValue();
           retorno.add(ob.getNombre());
        }
        return retorno;
    }
    
//------------------------------------------------------------------------------
public void cargarColeccion(){    
//Traigo los datos de la base de datos y los cargo en la coleccion de reservas
        
    List <Ciudad> cius = ListarCiudades();    
        for(int i=0;i<cius.size();i++){
        
            Ciudad ci =(Ciudad) cius.get(i);
            ciudades.put(ci.getNombre(), ci);           
        }    
}    
//------------------------------------------------------------------------------
    
    
    
}
