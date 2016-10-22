package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.swing.tree.DefaultMutableTreeNode;


@Entity
public class Simple extends Categoria{    
    
    //@ManyToMany
    @ManyToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    private List <Servicio> servicios;
    
    public Simple(){
        super("");
        servicios = new ArrayList<>();
    }
    
    public Simple(String nombre, List <Servicio> servicios){
        super(nombre);
        this.servicios = servicios;
    }

    public void setServicios(List <Servicio> servicios) {
        this.servicios = servicios;
    }


    public List <Servicio> getCategorias() {
        return servicios;
    }
    
    public void agregarServicio(Servicio nuevo){
        //System.out.println(" estoy aca adentro!!!!!!");
        servicios.add(nuevo);
    }
    
    public Servicio buscarServicio(String nombre){
        
        for(int i=0;i<servicios.size();i++){        
               Servicio aux =(Servicio) servicios.get(i);
               if(aux.getNombre().equals(nombre)){
                   return aux;
               }                        
        }
        return null;        
    }
    
    public Servicio buscarPorNombre(String nombre, String proveedor){
        for(int i=0;i<servicios.size();i++){
            Servicio retorno = (Servicio) servicios.get(i);
            if(nombre.equals(retorno.getNombre()) && proveedor.equals(retorno.getProveedor())){
                return retorno;
            }
        }
        return null;
    }
    
    public void agregarServiciosAlArbol(DefaultMutableTreeNode agregame){
        if(!servicios.isEmpty()){
            for(int i=0;i<servicios.size();i++){
                Servicio agregar = (Servicio) servicios.get(i);
                String nombre = agregar.getProveedor() + ":" + agregar.getNombre();
                agregame.add(new DefaultMutableTreeNode(nombre));
            }
        }
    }
    
}
