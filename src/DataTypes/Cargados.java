
package DataTypes;

import Logica.Ciudad;
import Logica.Cliente;
import Logica.Pais;
import Manejadores.ManejadorCiudades;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Cargados {     
    
    private static Cargados instancia = null;
    
    private Cargados(){
    }
    
    public static Cargados getInstance(){
        if(instancia == null)
            instancia = new Cargados();
        return instancia;
    }
    
    public void precargados(){
        
        System.out.println("INICIANDO ...");
        
        List <Pais> paises=new ArrayList<>();
//PAISES   
        Pais pais1=new Pais("Uruguay");  persist(pais1);
        Pais pais2=new Pais("Argentina");  persist(pais2);
        Pais pais3=new Pais("Colombia");  persist(pais3);
        Pais pais4=new Pais("EEUU");  persist(pais4);
        Pais pais5=new Pais("España");  persist(pais5);
        Pais pais6=new Pais("Francia");  persist(pais6);
        Pais pais7=new Pais("Alemania");  persist(pais7);
        Pais pais8=new Pais("Suiza");  persist(pais8);
        Pais pais9=new Pais("Australia");  persist(pais9);
        Pais pais10=new Pais("Brasil");  persist(pais10);
        Pais pais11=new Pais("China");  persist(pais11);
        
        paises.add(pais1);  paises.add(pais2);  paises.add(pais3);  paises.add(pais4);
        paises.add(pais5);  paises.add(pais6);  paises.add(pais7);  paises.add(pais8);
        paises.add(pais9);  paises.add(pais10);  paises.add(pais11);
//  CUIDADES

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            Ciudad ciu1 = new Ciudad("Montevideo", pais1);  em.merge(ciu1);
        Ciudad ciu2 = new Ciudad("Buenos Aires", pais2);  em.merge(ciu2);
        Ciudad ciu3 = new Ciudad("Bogotá", pais3);  em.merge(ciu3);
        Ciudad ciu4 = new Ciudad("Miami", pais4);  em.merge(ciu4);  
        Ciudad ciu5 = new Ciudad("Valencia", pais5);  em.merge(ciu5);
        Ciudad ciu6 = new Ciudad("Madrid", pais5);  em.merge(ciu6);
        Ciudad ciu7 = new Ciudad("París", pais6);  em.merge(ciu7);
        Ciudad ciu8 = new Ciudad("Berlín", pais7);  em.merge(ciu8);
        Ciudad ciu9 = new Ciudad("Ginebra", pais8);  em.merge(ciu9);
        Ciudad ciu10 = new Ciudad("Sidney", pais9);  em.merge(ciu10);
        Ciudad ciu11 = new Ciudad("Pekín", pais11);  em.merge(ciu11);
        Ciudad ciu12 = new Ciudad("Cantón", pais11);  em.merge(ciu12);
        Ciudad ciu13 = new Ciudad("Florianópolis", pais10);  em.merge(ciu13);
        Ciudad ciu14 = new Ciudad("Bariloche", pais2);  em.merge(ciu14); 
            
        ManejadorCiudades mciudades = ManejadorCiudades.getInstance();

       mciudades.addCiudades(ciu1);  mciudades.addCiudades(ciu2);  mciudades.addCiudades(ciu3);
       mciudades.addCiudades(ciu4);  mciudades.addCiudades(ciu5);  mciudades.addCiudades(ciu6);
       mciudades.addCiudades(ciu7);  mciudades.addCiudades(ciu8);  mciudades.addCiudades(ciu9);
       mciudades.addCiudades(ciu10); mciudades.addCiudades(ciu11);  mciudades.addCiudades(ciu12);
       mciudades.addCiudades(ciu13); mciudades.addCiudades(ciu14);
            
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

// USUARIOS

Cliente cli1= new Cliente(null, "tCook", "Tim", "Cook", "air.f@gmail.com", new Date(60,11-1,1), "C:\\Users\\Daiana\\Desktop\\imgh4t\\Airfrance.jpg");
persist(cli1);
//Cliente cli2= new Cliente(null, "moody", "Alastor", "Moody", "eu.car@eucar.com", new Date(1965,9,2), "C:\\Users\\Daiana\\Desktop\\imgh4t\\Europcar.jpg");
        

   
   }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
       
    
    
}
