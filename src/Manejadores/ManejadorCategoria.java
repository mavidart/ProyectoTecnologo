package Manejadores;

import Logica.Categoria;
import Logica.Compuesta;
import Logica.Servicio;
import Logica.Simple;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.tree.DefaultMutableTreeNode;

public class ManejadorCategoria {
    private List <Categoria> categorias;
    private static ManejadorCategoria instancia = null;
    private DefaultMutableTreeNode arbol = null;
    
    private ManejadorCategoria(){
        categorias = new ArrayList<>();
    }
    
    public static ManejadorCategoria getInstance(){
        if(instancia == null)
            instancia = new ManejadorCategoria();
        return instancia;
    }
public boolean vacio(){
          if(categorias.isEmpty()){
              return true;
          }else
              return false;
      }    
    public void agregarCategoria(Categoria nueva){
        categorias.add(nueva);
    }    
    public void imprimirCategorias(){
        for(int i=0;i<categorias.size();i++){        
               Compuesta aux =(Compuesta) categorias.get(i);
               System.out.println(aux.getNombre());
               aux.imprimirCategorias();          
        }       
    }
    
    public void crearArbol(DefaultMutableTreeNode agregame){
        if(!categorias.isEmpty()){
            for(int i=0;i<categorias.size();i++){ 
                Categoria cate =(Categoria) categorias.get(i);
                DefaultMutableTreeNode nuevo = new DefaultMutableTreeNode(cate.getNombre());
                /* o va cate aca? */
                if(categorias.get(i) instanceof Compuesta){
                    Compuesta auxiliar = (Compuesta) categorias.get(i);
                    //System.out.println(auxiliar.getNombre()+"\n\n\n\n");
                    //System.out.println(auxiliar.vacio());
                    auxiliar.crearArbol(nuevo);
                }
                agregame.add(nuevo);
            }
        }
    }
    
    public void crearArbolConServicios(DefaultMutableTreeNode agregame){
        if(!categorias.isEmpty()){
            for(int i=0;i<categorias.size();i++){ 
                Categoria cate =(Categoria) categorias.get(i);
                DefaultMutableTreeNode nuevo = new DefaultMutableTreeNode(categorias.get(i).getNombre());
                if(categorias.get(i) instanceof Compuesta){
                    Compuesta auxiliar = (Compuesta) categorias.get(i);
                    
                    //System.out.println("aca entra");                    
                    auxiliar.crearArbolConServicios(nuevo);
                }else{
                    
                    Simple auxiliar = (Simple) categorias.get(i);
                    auxiliar.agregarServiciosAlArbol(nuevo);
                }
                agregame.add(nuevo);
            }
        }
    }
    
    public Categoria buscar(String nombre){
    
    for(int i=0;i<categorias.size();i++){
            Categoria aux = (Categoria) categorias.get(i);
           
            if(aux.getNombre().equals(nombre)){
                return aux;
            }
        }
        return null;        
    }   
    
    public Categoria buscarCategoria(String nombre){
                
        if(buscar(nombre)!=null){
            return buscar(nombre);
        }else{               
    
            for(Categoria cate : categorias){
                if(cate instanceof Compuesta){
                    Compuesta aux = (Compuesta) cate;
                    if(aux.buscarCategoria(nombre) != null){
                        return aux.buscarCategoria(nombre);
                    }
                }
            }
        }
        return null;
         
    }    
    
   
    
    
    
    
    
    
    
    

    
    //--------------------------------------------------------------------------
    //||||||||                ACA ESTA LA PERSISTENCIA                 |||||||||
    //--------------------------------------------------------------------------
  
        public void cargarDatos(){
            if(categorias.isEmpty()){
                ManejadorCategoria cates = ManejadorCategoria.getInstance();
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
                EntityManager em = emf.createEntityManager();

                //OBTENGO LA LISTA DE OBJETOS
                List objetos = em.createQuery("SELECT c FROM Categoria c").getResultList();
                //OBTENGO LAS ASOCIACIONES
                List<String> primeraColumna = em.createNativeQuery("SELECT compuesta_nombre FROM categoria_categoria").getResultList();
                List<String> segundaColumna = em.createNativeQuery("SELECT categorias_nombre FROM categoria_categoria").getResultList();
                for(int i=0; i<objetos.size(); i++){
                    if(objetos.get(i) instanceof Compuesta){
                        Compuesta comp = (Compuesta) objetos.get(i);
                        if(!primeraColumna.contains(comp.getNombre()) && !segundaColumna.contains(comp.getNombre())){
                            cates.agregarCategoria(comp);
                        }else{
                            if(primeraColumna.contains(comp.getNombre()) && !segundaColumna.contains(comp.getNombre())){
                                cates.agregarCategoria(comp);
                            }
                        }
                    }else{
                        Simple simp = (Simple) objetos.get(i);
                        if(!primeraColumna.contains(simp.getNombre()) && !segundaColumna.contains(simp.getNombre())){
                            cates.agregarCategoria(simp);
                        }
                    }
                }
            }
    }
    
}
