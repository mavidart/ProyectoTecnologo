package Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.swing.tree.DefaultMutableTreeNode;

@Entity
public class Proveedor extends Usuario {
   
   @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
   private List <Servicio> servicios;
           
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
   private List <Promocion> promociones;

   private String nomEmpresa;
   private String linkEmpresa;

    public Proveedor() {
        servicios=new ArrayList<>();
        promociones=new ArrayList<>();
    }

    public Proveedor(List<Servicio> servicios, List <Promocion> promociones, String nomEmpresa, String linkEmpresa, String nick, String nombre, String apellido, String correo, Date fechaN, String foto) {
        super(nick, nombre, apellido, correo, fechaN, foto);
        this.servicios = servicios;
        this.promociones = promociones;
        this.nomEmpresa = nomEmpresa;
        this.linkEmpresa = linkEmpresa;
    }   
  
       
    public boolean vacio(){
        return servicios.isEmpty();
    }
    
    public boolean existe(String nombre){
        
        for(int i=0;i<servicios.size();i++){        
               Servicio saux =(Servicio) servicios.get(i);
               if(saux.getNombre().equals(nombre)){
                   return true;
               }                        
        }
        return false;               
    }
    
    public void listarServicios(){
        if(servicios.isEmpty()){
            System.out.println("No hay servicios");
        }else{
            for(int i=0;i<servicios.size();i++){                
                Servicio ob=(Servicio) servicios.get(i);
                System.out.println("Objeto con nombre: "+ ob.getNombre());
            }
        }
    }
    
    public void agregarServicio(Servicio service){
        servicios.add(service);
    }
    
    
    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }
    public void setLinkEmpresa(String linkEmpresa) {
        this.linkEmpresa = linkEmpresa;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }
    public String getLinkEmpresa() {
        return linkEmpresa;
    }     
    
//-----------------------------------------------------
    public List <Servicio> getServicios() {
        return servicios;
    }
    public List <Promocion> getPromociones() {
        return this.promociones;
    }
    
     public void setServicios(List <Servicio> servicios) {
        this.servicios = servicios;
    }
    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
    }
//----------------------------------------------------- 
    public void agregarServicios(DefaultMutableTreeNode agregame){
        DefaultMutableTreeNode service = new DefaultMutableTreeNode("Servicios");
        if(!servicios.isEmpty()){
            for(int i=0;i<servicios.size();i++){
                DefaultMutableTreeNode nuevo = new DefaultMutableTreeNode(servicios.get(i).getNombre());
                service.add(nuevo);
            }
        }
        agregame.add(service);
    }
    
    public void agregarPromociones(DefaultMutableTreeNode agregame){
        
        if(promociones==null){      
                promociones = new ArrayList<>();  
              //System.out.println("Promociones ERA null");
        }        
        DefaultMutableTreeNode promo = new DefaultMutableTreeNode("Promociones");
            
        
        if(!promociones.isEmpty()){           
            for(int i=0;i<promociones.size();i++){
                DefaultMutableTreeNode nuevo = new DefaultMutableTreeNode(promociones.get(i).getNombre());
                promo.add(nuevo);
            }
        } //System.out.print("Promociones es vacia");
        agregame.add(promo);
    }
    
     public void addPromos(Proveedor prov, Promocion promo){
       List <Promocion> p =prov.getPromociones();
       p.add(promo);
       prov.setPromociones(p);   
    }
     
    public void addServicios(Proveedor prov, Servicio servis){
       List <Servicio> s =prov.getServicios();
       s.add(servis);
       prov.setServicios(s);
    }
     
     
    
    public Servicio buscarServicio(String servicio){
        
        for(int i=0;i<servicios.size();i++){        
               Servicio aux =(Servicio) servicios.get(i);
               if(aux.getNombre().equals(servicio)){
                   return aux;
               }                        
        }
         return null;
                
    }
    
    public Promocion buscarPromocion(String promocion){        
         for(int i=0;i<promociones.size();i++){        
               Promocion aux =(Promocion) promociones.get(i);
               if(aux.getNombre().equals(promocion)){
                   return aux;
               }                        
        }
        return null;        
    }    
}
