package Manejadores;

import Logica.Cliente;
import Logica.Promocion;
import Logica.Proveedor;
import Logica.Servicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.tree.DefaultMutableTreeNode;

public class ManejadorProveedor {
    
    private List <Proveedor> proveedores; // clave string contiene objetos Usuario
    private static ManejadorProveedor instancia=null;
    private DefaultMutableTreeNode arbol;
    
    private ManejadorProveedor(){
        proveedores=new ArrayList<>(); // inicializar el mapa aquí
    }  
    
    public boolean vacio(){
          if(proveedores.isEmpty()){
              return true;
          }else
              return false;
      }
    public static ManejadorProveedor getinstance(){
        if (instancia==null)
            instancia = new ManejadorProveedor();
        return instancia;
    }
    
    public Proveedor buscarProv(String nick){  
        //System.out.println("Tamaño de proveedores "+proveedores.size() );
        for(int i=0;i<proveedores.size();i++){        
               Proveedor aux =(Proveedor) proveedores.get(i);
               //System.out.println(aux.getNick()+ ":"+nick);
               if(aux.getNick().equals(nick)){
                  //System.out.println("ENTRE ACA");
                  return aux;
               }                        
        }
         return null;       
    } 
    
    public Proveedor buscarPorCorreo(String correo){
        System.out.println("Tamaño de proveedores "+proveedores.size() );
        for(int i=0;i<proveedores.size();i++){        
               Proveedor aux =(Proveedor) proveedores.get(i);
               //System.out.println("COrreo ES "+ aux.getCorreo()+ " y aux: "+correo);
               if(aux.getCorreo().equals(correo)){
                   //System.out.println("ENTRE ACA");
                   return aux;
               }                        
        }
         return null; 
    }
    
    
    
    
    

    
    public Servicio buscarServicio(Proveedor prov, String nomServicio){                
        
        for(int i=0;i<prov.getServicios() .size();i++){              
                Servicio aux = (Servicio) prov.getServicios().get(i);
                    
            if(aux.getNombre().equals(nomServicio)){
                //System.out.println("eran iguales");
                return aux;            
            }         
        }
    return null;   
} 
    
    public boolean buscarPromocion(Proveedor prov, String nomPromocion){
     boolean esta=false;       
     
      for(int i=0;i<prov.getPromociones().size();i++){              
                Promocion aux = (Promocion) prov.getPromociones().get(i);   
            
            if(aux.getNombre().equals(nomPromocion)){
                //System.out.println("eran iguales");
                esta=true;  return esta;            
            }         
        }
    return esta;   
}       
    
    
    public List <Proveedor> getProveedoresObjetos() {
        return proveedores;
    }
    
    
    
    
    
    
    
    
    
    public void addProveedor(Proveedor prov){
        String n = prov.getNick();
        proveedores.add(prov);
    }    
    
    
public List ListarProveedores(){
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        Query qry= em.createQuery("SELECT p FROM Proveedor p"); 
       
        List <Proveedor> provs=qry.getResultList();               
        em.close(); 
        
        for(int i=0;i<provs.size();i++){
        
            Proveedor p =(Proveedor) provs.get(i);
            //System.out.println(p.getNick());
        } 
    return provs;
}
       
    
    
    public void recorrer(){
        for(int i=0;i<proveedores.size();i++){
           Proveedor ob= (Proveedor) proveedores.get(i);
           System.out.println("Proveedor: "+ ob.getNombre()+ " Empresa: "+ ob.getNomEmpresa());
       }
    }   
    
    public Proveedor buscarPorNombre(String nombre){        
        
        for(int i=0;i<proveedores.size();i++){
            Proveedor aux = (Proveedor) proveedores.get(i);
           
            if(aux.getNombre().equals(nombre)){
                return aux;
            }
        }
        return null;
    }
    
    public ArrayList getProveedores(){
        ArrayList retorno = new ArrayList();
        for(int i=0;i<proveedores.size();i++){
           Proveedor ob=(Proveedor) proveedores.get(i);
           retorno.add(ob.getNick());
        }
        return retorno;
    }
    
    public List ListProveedores(){
        List <Proveedor> retorno = new ArrayList();
        for(int i=0;i<proveedores.size();i++){
           Proveedor ob=proveedores.get(i);
           retorno.add(ob);
        }
        return retorno;
    }   
    
    
    
//------------------------------------------------------------------------------
public void cargarColeccion(){    
//Traigo los datos de la base de datos y los cargo en la coleccion de proveedores
        
    List <Proveedor> ps = ListarProveedores();    
        for(int i=0;i<ps.size();i++){
        
            Proveedor p =(Proveedor) ps.get(i);
            proveedores.add(p);
        }    
}    

public void crearArbol(DefaultMutableTreeNode agregame){   
    if(!proveedores.isEmpty()){
        
        //System.out.println("Proveedores no es NULL");
        for(int i=0;i<proveedores.size();i++){
            DefaultMutableTreeNode nuevo = new DefaultMutableTreeNode(proveedores.get(i).getNick());
            Proveedor auxiliar = (Proveedor) proveedores.get(i);
            
           // System.out.println(" nuevo es:  " + nuevo.toString());
            
            auxiliar.agregarServicios(nuevo);     
            
            //System.out.println(" ----------------------------------- ");
            
            auxiliar.agregarPromociones(nuevo);
            
            agregame.add(nuevo);
        }
    }
}
//------------------------------------------------------------------------------   
    
}
