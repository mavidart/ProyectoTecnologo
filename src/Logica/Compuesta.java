package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.swing.tree.DefaultMutableTreeNode;

@Entity
public class Compuesta extends Categoria implements Serializable {
    
    
    //@JoinTable(name="CAT_CAT", joinColumns
     @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    private List <Categoria> categorias;
    
    public Compuesta(){
        super("");
        categorias = new ArrayList<>();
    }
    
    public Compuesta(String nombre, List <Categoria> cate){
        super(nombre);
        this.categorias = cate;
    }

    public void setCategorias(List <Categoria> categorias) {
        this.categorias = categorias;
    }    

    public List <Categoria> getCategorias() {
        return categorias;
    }
    
    /*public Categoria buscarCategoria(String nombre, Categoria buscada){
        return null;
    }*/
    
    public boolean vacio(){
        if(categorias.isEmpty())
            return true;
        else 
            return false;
    }
    
    public void agregarCategoria(Categoria nueva){
        categorias.add(nueva);
    }
    
    public boolean existeEnNivel(String nombre){
        
        for(int i=0;i<categorias.size();i++){        
               Categoria aux =(Categoria) categorias.get(i);
               if(aux.getNombre().equals(nombre)){
                   return true;
               }                        
        }
        return false;
        
    }
    
    public void imprimirCategorias(){
        for(int i=0;i<categorias.size();i++){
            Compuesta aux =(Compuesta) categorias.get(i);
            System.out.println(aux.getNombre());
            aux.imprimirCategorias();
        }
    }
    
    public Categoria buscarCategoria(String nombre){
        
         for(int i=0;i<categorias.size();i++){        
               Categoria aux =(Categoria) categorias.get(i);
               if(aux.getNombre().equals(nombre)){
                   return aux;
               }                        
        }
        return null;
    }
    
    public void crearArbol(DefaultMutableTreeNode agregame){
        if(!categorias.isEmpty()){
            for(int i=0;i<categorias.size();i++){
                DefaultMutableTreeNode nuevo = new DefaultMutableTreeNode(categorias.get(i).getNombre());
                if(categorias.get(i) instanceof Compuesta){
                    Compuesta auxiliar = (Compuesta) categorias.get(i);
                    auxiliar.crearArbol(nuevo);
                }
                agregame.add(nuevo);
            }
        }
    }
    
    public void crearArbolConServicios(DefaultMutableTreeNode agregame){
        if(!categorias.isEmpty()){
            for(int i=0;i<categorias.size();i++){
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
    
};
