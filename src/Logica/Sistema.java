package Logica;

import DataTypes.DtCliente;
import DataTypes.DtInfoReserva;
import DataTypes.DtInfoServicio;
import DataTypes.DtPromocion;
import DataTypes.DtProveedor;
import DataTypes.DtReserva;
import DataTypes.DtServicio;
import DataTypes.DtTiposAsociativos;
import DataTypes.EstadoReserva;
import Manejadores.ManejadorCategoria;
import Manejadores.ManejadorCiudades;
import Manejadores.ManejadorCliente;
import Manejadores.ManejadorProveedor;
import Manejadores.ManejadorReserva;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class Sistema implements ISistema{
    
    public Sistema() {          
    }
    
    @Override
    public void cargarTodo() {
        ManejadorProveedor mp = ManejadorProveedor.getinstance();
        ManejadorCliente mc = ManejadorCliente.getinstance();
        ManejadorReserva mr = ManejadorReserva.getinstance();
        ManejadorCategoria mcat = ManejadorCategoria.getInstance();
        ManejadorCiudades mciu = ManejadorCiudades.getInstance();                
        
        if(mc.vacio()) mc.cargarColeccion();  
        if(mp.vacio()) mp.cargarColeccion();
        if(mr.vacio()) mr.cargarColeccion();   
        if(mciu.vacio()) mciu.cargarColeccion(); 
        if(mcat.vacio()) mcat.cargarDatos();
    }
//------------------------------------------------------------------------------
@Override
public List<DtPromocion> listarPromociones() {      
    ManejadorProveedor mp = ManejadorProveedor.getinstance();
    List <Proveedor> lista = mp.ListProveedores();
    List <DtPromocion> listaPro = new ArrayList<>();       
  /*           
    for(int i=0;i<lista.size();i++){        
        Proveedor p =(Proveedor) lista.get(i);
        
        for(int j=0;j<p.getPromociones().size();j++){
            Promocion promo=(Promocion) p.getPromociones().get(j) ;            
            
            String origen ="";
            String destino = "";
            if(promo.getServicios().get(i).getDestino()!=null){
                destino = promo.getServicios().get(i).getDestino().getNombre();
            }
            if(promo.getServicios().get(i).getOrigen()!=null){
                origen = promo.getServicios().get(i).getOrigen().getNombre();
            }  
            ArrayList listaServicios= new ArrayList();                      
            Servicio ser = (Servicio) promo.getServicios().get(i);              
            DtInfoServicio nuevo = new DtInfoServicio(ser.getNombre(), ser.getDescripcion(), ser.getPrecio(), ser.getImagen1(), ser.getImagen2(), ser.getImagen3(), destino, origen, ser.getProveedor());
            listaServicios.add(nuevo);           
        }       
            DtPromocion dp = new DtPromocion(promo.getNombre(), promo.getDescuento(), promo.getPrecioTotal(), promo);
            listaPro.add(dp);
        }      
    } 
*/
       return listaPro;
}    
//------------------------------------------------------------------------------
@Override
public List <DtInfoServicio> listarServicios() {
    ManejadorProveedor mp = ManejadorProveedor.getinstance();
    List <Proveedor> lista = mp.ListProveedores();
    List <DtInfoServicio> listaSer = new ArrayList<>();       
             
    for(int i=0;i<lista.size();i++){        
        Proveedor p =(Proveedor) lista.get(i);
        
        for(int j=0;j<p.getServicios().size();j++){
            Servicio ser=(Servicio) p.getServicios().get(j) ;            
            
            String origen ="";
            String destino = "";
            if(ser.getDestino()!=null){
                destino = ser.getDestino().getNombre();
            }
            if(ser.getOrigen()!=null){
                origen = ser.getOrigen().getNombre();
            }            
            
            DtInfoServicio ds= new DtInfoServicio(ser.getNombre(), ser.getDescripcion(),ser.getPrecio(), ser.getImagen1(), ser.getImagen2(), ser.getImagen3(), destino, origen, ser.getProveedor());
            listaSer.add(ds);
        }      
    } 
       return listaSer;
    }
    
    
//-------------------------------------------------------------------------------------------------
    
  @Override
  public boolean altaCliente(String nick, String nom, String ape, String correo,Date fecha,String foto) {
              ManejadorCliente mc = ManejadorCliente.getinstance();
              ManejadorProveedor mp = ManejadorProveedor.getinstance();
              
              
       if((mc.buscarCli(nick)==null)&&(mp.buscarProv(nick)==null)&&(mc.buscarPorCorreo(correo)==null)&&(mp.buscarPorCorreo(correo)==null)){            
            List <Reserva> r=new ArrayList<>();
            Cliente cli= new Cliente(r,nick, nom, ape, correo, fecha, foto); 
            mc.addCliente(cli);
            
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {            
            em.persist(cli);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
            
            return true;
            //JOptionPane.showMessageDialog(null, "Se ha agregado con exito");
       }else{   
           return false;
              //JOptionPane.showMessageDialog(null, "Usuario existente","Error",JOptionPane.ERROR_MESSAGE);                     
            }      
    }
//-------------------------------------------------------------------------------------------------
  
   @Override
    public boolean altaProveedor(String nick, String nom, String ape, String correo, Date fecha, String foto, String nomEmp, String linkEmp) {
        ManejadorProveedor mp = ManejadorProveedor.getinstance();        
        ManejadorCliente mc = ManejadorCliente.getinstance();
        
       if((mc.buscarCli(nick)==null)&&(mp.buscarProv(nick)==null)&&(mc.buscarPorCorreo(correo)==null)&&(mp.buscarPorCorreo(correo)==null)){
           
           List <Servicio> s=new ArrayList<>();   List <Promocion> p=new ArrayList<>();
           
           Proveedor prov= new Proveedor(s, p, nomEmp, linkEmp, nick, nom, ape, correo, fecha, foto);           
           mp.addProveedor(prov);
           
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {            
            em.persist(prov);            
            //ManejadorReserva mr = ManejadorReserva.getinstance();            
            //em.persist(res);                       
            
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
         

           return true;  
           //JOptionPane.showMessageDialog(null, "Se ha agregado con exito");
       }else{
           return false;   
           //JOptionPane.showMessageDialog(null, "Usuario existente","Error",JOptionPane.ERROR_MESSAGE);                     
            }    
       
    }    
//---------------------------------------------------------------------------------------------------------             
 

    public DtCliente verInfoCliente(String nick) {
        
        ManejadorCliente mc = ManejadorCliente.getinstance();        
        
        Cliente cli = mc.buscarCli(nick);
        
        ArrayList listaReservas= new ArrayList();
        for(int i=0;i<cli.getReservas().size();i++){               
              Reserva res = (Reserva) cli.getReservas().get(i); 
              listaReservas.add(res.getNumero());
        }
        
        DtCliente dc= new DtCliente(cli.getNick(),cli.getNombre(), cli.getApellido(), cli.getCorreo(), cli.getFechaN(),cli.getFoto(),listaReservas);        
                   
     return dc;
    }    
//------------------------------------------------------------------------------------------------- 
    
     @Override
    public DtProveedor verInfoProveedor(String nick) {       
        ManejadorProveedor proveedores = ManejadorProveedor.getinstance();
        Proveedor prov = proveedores.buscarProv(nick);
        
        ArrayList listaServicios= new ArrayList();
        for( int i=0;i<prov.getServicios().size();i++ ){               
              Servicio ser = (Servicio) prov.getServicios().get(i); 
              listaServicios.add(ser.getNombre());
        }
        
        ArrayList listaPromos= new ArrayList();
        for(int i=0;i<prov.getPromociones().size();i++){               
              Promocion promos = (Promocion) prov.getPromociones().get(i); 
              listaPromos.add(promos.getNombre());
        }
        
        DtProveedor dp= new DtProveedor(prov.getNick(),prov.getNombre(), prov.getApellido(), prov.getCorreo(), prov.getFechaN(),prov.getFoto(),prov.getNomEmpresa(),prov.getLinkEmpresa(),listaServicios,listaPromos);        
                   
     return dp;
    }
//-------------------------------------------------------------------------------------------------    
   public boolean realizarReserva (String nickName, ArrayList<DtReserva> dtS, ArrayList<DtReserva> dtP, String nickProveedor) 
    {        
      
       ManejadorCliente clientes = ManejadorCliente.getinstance();
       ManejadorProveedor proveedores = ManejadorProveedor.getinstance();
       ManejadorReserva mr = ManejadorReserva.getinstance();
       
       Cliente seleccionado = clientes.buscarCli(nickName);
       Proveedor prove = proveedores.buscarProv(nickProveedor);
       
       //System.out.println(prove);
       
       List promos = new ArrayList<>();
       List servis = new ArrayList<>();
       
       float precio = 0;
       // System.out.println("Hasta aca llega1");
        if(!dtS.isEmpty()){
            for(int i=0; i<dtS.size(); i++){
                DtReserva ser = (DtReserva) dtS.get(i);
                int cantidad = ser.getCantidad();
                Servicio buscado = prove.buscarServicio(ser.getNombre());
                precio = precio+(buscado.getPrecio()*cantidad);
                ResServ nuevoServ = new ResServ(ser.getCantidad(), ser.getFechaI(), ser.getFechaF(), buscado);
                servis.add(nuevoServ);
            }
        }        
        
        if(!dtP.isEmpty()){
            for(int i=0; i<dtP.size(); i++){
                DtReserva pro = (DtReserva) dtP.get(i);
                int cantidad = pro.getCantidad();
                Promocion buscada = prove.buscarPromocion(pro.getNombre());
                precio = precio+(buscada.getPrecioTotal()*cantidad);
                ResPro nuevoPro = new ResPro(pro.getCantidad(), pro.getFechaI(), pro.getFechaF(), buscada);
                promos.add(nuevoPro);
            }
        }
        
        
         //System.out.println("Hasta aca llega");
                 
       Reserva nueva = new Reserva(precio, new Date(), EstadoReserva.registrada,seleccionado, servis, promos);
       
       // mr.agregarReserva(nueva);
        
       // System.out.println(seleccionado.getNick());        
       //seleccionado.crearReserva(nueva);
       
       //List <Reserva> res =seleccionado.getReservas();
       //res.add(nueva);
       
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {  
            
            seleccionado.addReservas(seleccionado, nueva);
            em.merge(nueva); 
            em.merge(seleccionado);         
            mr.agregarReserva(nueva);
            
                    
            //ManejadorReserva mr = ManejadorReserva.getinstance();
            
            
             //System.out.println("");
             //System.out.println(" El numero de la reserva es: " + nueva.getNumero().toString());
            em.getTransaction().commit();
            
            //System.out.println(" Despues del commit");
        } catch (Exception e) {
           //System.out.println("estoy en el catch");
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        mr.setReservas(new ArrayList());
        mr.cargarColeccion();
        clientes.vaciarClientes();
        clientes.cargarColeccion();
        
//------------------------------------------------------------------------    

       return true;
       //JOptionPane.showMessageDialog(null, "Se ha agregado con exito");       
 }      
//-------------------------------------------------------------------------------------------------  
    @Override
    public boolean altaCategoria(String nombre, String nomPadre, String tipo, boolean persistencia) {
        
        
        ManejadorCategoria categorias = ManejadorCategoria.getInstance();
        List <Servicio> servicios = new ArrayList<>();
        List <Categoria> mapis = new ArrayList<>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        
        if(categorias.buscarCategoria(nombre) == null){
            if("".equals(nomPadre)){
            //ACA AGREGO LAS CATEGORIAS QUE SON DE PRIMER NIVEL    
                if("Compuesta".equals(tipo)){
                    Compuesta nueva = new Compuesta(nombre, mapis);
                    categorias.agregarCategoria(nueva);
                    em.getTransaction().begin();
                    try {
                        em.persist(nueva);
                        em.getTransaction().commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                        em.getTransaction().rollback();
                    } finally {
                        em.close();
                    }
                }else{
                    Simple nuevo = new Simple(nombre, servicios);
                    categorias.agregarCategoria(nuevo);
                    em.getTransaction().begin();
                    try {
                        em.persist(nuevo);
                        em.getTransaction().commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                        em.getTransaction().rollback();
                    } finally {
                        em.close();
                    }
                }
                return true;
            }else{
                //SE AGREGAN LAS CATEGORIAS A LOS HIJOS
                if(categorias.buscarCategoria(nomPadre) instanceof Compuesta){
                    Compuesta auxiliar = (Compuesta) categorias.buscarCategoria(nomPadre);
                    List <Categoria> mapa;
                    if("Compuesta".equals(tipo)){
                        Compuesta nueva = new Compuesta(nombre, mapis);
                        if(auxiliar.getCategorias()==null){
                            mapa = new ArrayList<>();
                        }else{
                            mapa = auxiliar.getCategorias();
                        }
                        mapa.add(nueva);
                        auxiliar.setCategorias(mapa);
                        
                        //ESTE PASO ES FUNDAMENTAL ACA ES DONDE SE CREA EL LINK...
                        //NO DEBE CREARSE EL OBJETO PREVIAMENTE SINO QUE SE PERSISTE ...
                        //AUTOMATICAMENTE CUANDO SE AGREGA AL MAP Y SE ACTUALIZA ESE MAP...
                        //LO MISMO QUE PASA ACA PASA DENTRO DEL ELSE SOLO QUE CON UNA...
                        //INSTANCIA DE SIMPLE...
                        em.getTransaction().begin();
                        try {
                            em.merge(auxiliar);
                            em.getTransaction().commit();
                        } catch (Exception e) {
                            e.printStackTrace();
                            em.getTransaction().rollback();
                        } finally {
                            em.close();
                        }  
                    }else{
                        Simple nuevo = new Simple(nombre, servicios);
                        if(auxiliar.getCategorias()==null){
                            mapa = new ArrayList<>();
                        }else{
                            mapa = auxiliar.getCategorias();
                        }
                        mapa.add(nuevo);
                        auxiliar.setCategorias(mapa);
                        em.getTransaction().begin();
                            try {
                                em.merge(auxiliar);
                                em.getTransaction().commit();
                            }catch (Exception e) {
                                e.printStackTrace();
                                em.getTransaction().rollback();
                            } finally {
                                em.close();
                            }
                        }
                    return true;
                }else{
                    return false;
                }
        
            
        }
    }else{
        return false;
        //JOptionPane.showMessageDialog(null, "Nombre de categoria existente","Error",JOptionPane.ERROR_MESSAGE);
    }
 }
//-------------------------------------------------------------------------------------------------   
    
public boolean altaPromocion(String nick, String nombre, List <Servicio> servicios, float descuento, float precioTotal) {
       
    ManejadorProveedor mp= ManejadorProveedor.getinstance();
        //Obtengo al proveedor al que se le asignará la promoción       
        Proveedor prov = (Proveedor) mp.buscarProv(nick);                
       
        //pregunto si el proveedor tiene una promoción con ese nombre       
       boolean esta = mp.buscarPromocion(prov, nombre);   
       
        
        if(esta!=true){  
             //Si no existe, creo la promoción    
             Promocion nuevaPromo=new Promocion(nombre, descuento, precioTotal, servicios);
             EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
             EntityManager em = emf.createEntityManager();
             em.getTransaction().begin();
                try {                                           
                    prov.addPromos(prov, nuevaPromo);                                     
                    em.merge(nuevaPromo); 
                    em.merge(prov); 
                           
                    em.getTransaction().commit();
                } catch (Exception e) {
                    e.printStackTrace();
                    em.getTransaction().rollback();
                } finally {
                    em.close();
                }
             
             
                                 
          }else{
            //En caso de que la promocion exista
            return false;
        //JOptionPane.showMessageDialog(null, "Ya existe una promocion con ese nombre","Error",JOptionPane.ERROR_MESSAGE);
             }
        //String msj = Sprov.getPromociones().get(nombre).getPrecioTotal();
        return true;
        //JOptionPane.showMessageDialog(null, "Se agrego correctamente");
        //System.out.println("Se agrego la promocion de nombre:" + prov.getPromociones().get(nombre).getNombre()+
          //      "Con precio: " + prov.getPromociones().get(nombre).getPrecioTotal() );  
}
//------------------------------------------------------------------------------------------------- 
    
    @Override
    public boolean altaServicio(DtServicio servicio){
        Servicio nuevo;       
        ManejadorCiudades ciudades = ManejadorCiudades.getInstance();
        ManejadorCategoria categorias = ManejadorCategoria.getInstance();
        ManejadorProveedor proveedores = ManejadorProveedor.getinstance();
        
        Proveedor prove = (Proveedor) proveedores.buscarProv(servicio.getProveedor().toString());       
                     
        
        if(!prove.vacio() && prove.existe(servicio.getNombre().toString())){
            //System.out.println("El servicio ya existe dentro del proveedor");
            return false;
            //JOptionPane.showMessageDialog(null, "Servicio existente","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            if("".equals(servicio.getCiudadDestino())){
                nuevo = new Servicio(servicio.getNombre(), servicio.getDescripcion(), servicio.getPrecio(), ciudades.obtenerCiudad(servicio.getCiudadOrigen()), null, servicio.getImg1(), servicio.getImg2(), servicio.getImg3(), prove.getNick());
                //System.out.println("Se agrego servicio");
            }else{
                nuevo = new Servicio(servicio.getNombre(), servicio.getDescripcion(), servicio.getPrecio(), ciudades.obtenerCiudad(servicio.getCiudadOrigen()), ciudades.obtenerCiudad(servicio.getCiudadDestino()), servicio.getImg1(), servicio.getImg2(), servicio.getImg3(), prove.getNick());
                //System.out.println("Se agrego vuelo");
            }
           
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
                try {    
                    prove.addServicios(prove, nuevo);
                    em.merge(nuevo);
                    em.merge(prove);
                   
                    
                        int tamano;
                        tamano = servicio.getCategorias().size();

                        String auxiliar;
                        Simple cat;
                    for(int i=0; i<tamano; i++){
                        //Se buscan las categorias y se agragan los servicios.
                        auxiliar = (String) servicio.getCategorias().get(i);
                        cat = (Simple) categorias.buscarCategoria(auxiliar);                                 
                        cat.agregarServicio(nuevo);
                        em.merge(cat);
                    }              
                            
                    em.getTransaction().commit();
                } catch (Exception e) {
                    e.printStackTrace();
                    em.getTransaction().rollback();
                } finally {
                    em.close();
                }           
           
            return true;
            //JOptionPane.showMessageDialog(null, "Se agrego correctamente");
        } 
    }
//------------------------------------------------------------------------------------------------- 
    
    @Override
    public DtInfoServicio verInfoServicio(String nomCategoria, String nomServicio, String proveedor){
        ManejadorCategoria categorias = ManejadorCategoria.getInstance();
        
        if(categorias.buscarCategoria(nomCategoria) instanceof Simple){
            Simple auxiliar = (Simple) categorias.buscarCategoria(nomCategoria);
            Servicio obtenido = auxiliar.buscarPorNombre(nomServicio, proveedor);
            //Crear una instancia de DTinfoServicio con los datos del servicio
            String origen ="";
            String destino = "";
            if(obtenido.getDestino()!=null){
                destino = obtenido.getDestino().getNombre();
            }
            if(obtenido.getOrigen()!=null){
                origen = obtenido.getOrigen().getNombre();
            }
            DtInfoServicio retorno = new DtInfoServicio(obtenido.getNombre(), obtenido.getDescripcion(), obtenido.getPrecio(), obtenido.getImagen1(), obtenido.getImagen2(), obtenido.getImagen3(), destino, origen, obtenido.getProveedor());
            //retornar ese DtServicio
            return retorno;
        }else{
            return null;
        }
        
    }
//-------------------------------------------------------------------------------------------------
    
    @Override
    public boolean actualizarEstadoReserva(String id, String estado){
        ManejadorReserva reservas = ManejadorReserva.getinstance();
        Reserva obtenida = reservas.buscarRes(Integer.parseInt(id));
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tarea1PU");
        EntityManager em = emf.createEntityManager();
        
        
        if(obtenida.getEstado().equals(EstadoReserva.registrada)){
            em.getTransaction().begin();
            try {
                if(estado.equals("Cancelada")){
                    obtenida.setEstado(EstadoReserva.cancelada);
                    em.merge(obtenida);
                    em.getTransaction().commit();
                    //JOptionPane.showMessageDialog(null, "Se modifica correctamente");
                }else{
                    if(estado.equals("Pagada")){
                        obtenida.setEstado(EstadoReserva.pagada);
                        em.merge(obtenida);
                        em.getTransaction().commit();
                        //JOptionPane.showMessageDialog(null, "Se modifica correctamente");
                    }else{
                        obtenida.setEstado(EstadoReserva.facturada);
                        em.merge(obtenida);
                        em.getTransaction().commit();
                        //JOptionPane.showMessageDialog(null, "Se modifica correctamente");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
            } finally {
                em.close();
            }
            return true;
        }else{
            return false;
            //JOptionPane.showMessageDialog(null, "La reserva se modifico anteriormente","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
//-------------------------------------------------------------------------------------------------
    
   public DtInfoReserva verInfoReserva(Integer id){
        ManejadorReserva reservas = ManejadorReserva.getinstance();
        
        // System.out.println("---------^^^^^^^^^_________");
        Reserva obtenida=null;
        obtenida = reservas.buscarRes(id);
        
        //if(obtenida!=null) System.out.println("LA ENCONTRO");
        List promos = obtenida.getRespros();
        List serv = obtenida.getResserv();
        
        List dtPromos = new ArrayList();
        List dtServ = new ArrayList();
        
        if(!promos.isEmpty()){
            for(int i=0; i<promos.size(); i++){
                ResPro aux1 = (ResPro) promos.get(i);
                DtTiposAsociativos nuevo = new DtTiposAsociativos(aux1.getCantidad(), aux1.getFechaInicio(), aux1.getFechaFin(), aux1.getPromo().getNombre());
                dtPromos.add(nuevo);
            }
        }
        
        if(!serv.isEmpty()){
            for(int i=0; i<serv.size(); i++){
                ResServ aux2 = (ResServ) serv.get(i);
                DtTiposAsociativos nuevo1 = new DtTiposAsociativos(aux2.getCantidad(), aux2.getFechaInicio(), aux2.getFechaFin(), aux2.getServicio().getNombre());
                dtServ.add(nuevo1);
            }
        }
        
        DtInfoReserva retorno = new DtInfoReserva(id, obtenida.getFecha(), obtenida.getPrecioTotal(), obtenida.getEstado(), dtServ, dtPromos);
        
        return retorno;
        
    }
    
    public void actualizarServicio(DtServicio servicio){
        
    }
    
    @Override
    public DtPromocion verInfoPromocion(String nomProve,String Promocion) {
        //System.out.println("estoy aca adentro");
        ManejadorProveedor mp = ManejadorProveedor.getinstance();

        Proveedor prove= mp.buscarProv(nomProve);
        Promocion promo = prove.buscarPromocion(Promocion);

        //System.out.println("NOMBRE DE LA PROMOCION: "+ promo.getNombre());

        //if(promo.getServicios()==null) System.out.println("ES NULL");

        
        ArrayList listaServicios= new ArrayList();
        for(int i=0;i<promo.getServicios().size();i++){               
              Servicio ser = (Servicio) promo.getServicios().get(i); 
              String origen = "";
              String destino = "";
              if(ser.getOrigen()!=null){
                  origen = ser.getOrigen().getNombre();
              }
              if(ser.getDestino()!=null){
                  destino = ser.getDestino().getNombre();
              }
              DtInfoServicio nuevo = new DtInfoServicio(ser.getNombre(), ser.getDescripcion(), ser.getPrecio(), ser.getImagen1(), ser.getImagen2(), ser.getImagen3(), destino, origen, ser.getProveedor());
              listaServicios.add(nuevo);
        }

        DtPromocion dpromo= new DtPromocion(promo.getNombre(), promo.getDescuento(), promo.getPrecioTotal(),listaServicios);

        return dpromo; 
    
    }
    
    public boolean cancelarReserva(String numero){
        ManejadorReserva mr = ManejadorReserva.getinstance();
        ManejadorCliente mc = ManejadorCliente.getinstance();
        
        Reserva res = mr.buscarRes(Integer.parseInt(numero));
        Cliente cli = mc.buscarCli(res.getCliente().getNick());
        List aux = res.getRespros();
        if(aux!=null){
            for(int i=0; i<aux.size(); i++){
                aux.remove(i);
            }
        }
        aux = res.getResserv();
        if(aux!=null){
            for(int i=0; i<aux.size(); i++){
                aux.remove(i);
            }
        }
        cli.borrarReserva(res);
        mr.borrarReserva(res);
        return true;
    }
    
    public DtInfoServicio infoPorProv(String nombreProv, String servicio){
        ManejadorProveedor mp = ManejadorProveedor.getinstance();
        Proveedor proveedor = mp.buscarProv(nombreProv);
        Servicio service = proveedor.buscarServicio(servicio);
        String origen = "";
        String destino = "";
        if(service.getOrigen()!=null){
            origen = service.getOrigen().getNombre();
        }
        if(service.getDestino()!=null){
            destino = service.getDestino().getNombre();
        }
        return new DtInfoServicio(service.getNombre(), service.getDescripcion(), service.getPrecio(), service.getImagen1(), service.getImagen2(), service.getImagen3(), destino, origen, service.getProveedor());
    }

    public void tester(){
        //|____________________________________________________________|
        //|---------------------Agregando ciudades---------------------|
        //|____________________________________________________________|

        ManejadorCiudades ciudades = ManejadorCiudades.getInstance();
       
        Ciudad ciudad1 = new Ciudad("Sao Pablo",null);
        Ciudad ciudad2 = new Ciudad("Buenos Aires", null);
        Ciudad ciudad3 = new Ciudad("New York", null);
        
        ciudades.addCiudades(ciudad1);
        ciudades.addCiudades(ciudad2);
        ciudades.addCiudades(ciudad3);
        
        //|____________________________________________________________|
        //|---------------------Agregando usuarios---------------------|
        //|____________________________________________________________|
        
        this.altaCliente("nicoperez94", "Nicolas", "Perez", "nicoperez94@live.com", new Date(1994-1900, 06, 22), "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\nico.jpg");
        this.altaCliente("analaura12", "Ana Laura", "Gonzales", "analaura12@gmail.com", new Date(1990-1900, 12, 01), "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\chica.jpg");
        this.altaProveedor("gonzatrick", "Gonzalo", "Tricota", "gonzatricota@gmail.com", new Date(1955-1900, 11, 15), "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\gonzalo.jpg", "American Airlines", "www.americanairlines.com");
        this.altaProveedor("pepeargento", "Pepe", "Argento", "pepeargento@hotmail.com", new Date(1980-1900, 05, 22), "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\pepe.jpg", "Despegar", "www.despegar.com");
       //Se contemplan los casos de error posibles
        System.out.println("|____________________________________________________________|");
        System.out.println("|---------------------Pruebas   usuarios---------------------|");
        System.out.println("|____________________________________________________________|");
        
        if(!this.altaCliente("nicoperez94", "Nicolas", "Perez", "", new Date(), "")){//Nick Repetido Cliente
            System.out.println("No se pudo ingresar cliente: Existe nick");
        }
        if(!this.altaCliente("nicoperez", "", "", "nicoperez94@live.com", new Date(), "")){//Correo Repetico Cliente
            System.out.println("No se pudo ingresar cliente: Existe mail");
        }
        if(!this.altaProveedor("nicoperez94", "", "", "", new Date(), "","","")){//Nick Repetido Proveedor
            System.out.println("No se pudo ingresar proveedor: Existe nick");
        }
        if(!this.altaProveedor("nicoperez", "", "", "nicoperez94@live.com", new Date(), "","","")){//Correo Repetido Proveedor
            System.out.println("No se pudo ingresar proveedor: Existe mail");
        }
        System.out.println("");
        
        //|____________________________________________________________|
        //|--------------------Agregando categorias--------------------|
        //|____________________________________________________________|
        
        this.altaCategoria("Vuelos", "", "Compuesta", true);
        this.altaCategoria("Hoteles", "", "Compuesta", true);
        this.altaCategoria("American Airlines", "Vuelos", "Compuesta", true);
        this.altaCategoria("AlasU", "Vuelos", "Compuesta", true);
        this.altaCategoria("Primera Clase", "American Airlines", "Simple", true);
        this.altaCategoria("Conrad", "Hoteles", "Simple", true);
        
        //Se contemplan posibles errores
        
        System.out.println("|____________________________________________________________|");
        System.out.println("|---------------------Pruebas categorias---------------------|");
        System.out.println("|____________________________________________________________|");
        
        if(!this.altaCategoria("Vuelos", "Hoteles", "Compuesta", true)){//Nombre existente
            System.out.println("El nombre ingresado existe: Caso Compuesta");
        }
        if(!this.altaCategoria("Nuevo", "No Existe", "Compuesta", true)){//No existe categoria padre
            System.out.println("No se encuentra la categoria padre: Caso Compuesta");
        }
        if(!this.altaCategoria("Nuevo", "Primera Clase", "Compuesta", true)){//El padre no existe
            System.out.println("El padre es simple: Caso Compuesta");
        }
        if(!this.altaCategoria("Vuelos", "Hoteles", "Simple", true)){//Nombre existente
            System.out.println("El nombre ingresado existe: Caso Simple");
        }
        if(!this.altaCategoria("Nuevo", "No Existe", "Simple", true)){
            System.out.println("No existe la categoria padre: Caso Simple");
        }
        if(!this.altaCategoria("Nuevo", "Primera Clase", "Simple", true)){//El padre no existe
            System.out.println("El padre es simple: Caso Simple");
        }
        System.out.println("");
        //|____________________________________________________________|
        //|--------------------Agregando  servicios--------------------|
        //|____________________________________________________________|

        ManejadorCategoria cates = ManejadorCategoria.getInstance();
        ManejadorProveedor proves = ManejadorProveedor.getinstance();
        ArrayList<String> categorias = new ArrayList();
        categorias.add("Conrad");
       
//        DtServicio servicio1 = new DtServicio("HoteleriaOne", "Un excelente servicio de hoteleria brindado de la mejor manera.", new Float(15000), ciudad1.getNombre(), null, categorias, "pepeargento", "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\habitacion1.jpg", "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\banio1.jpg", "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\piscina1.jpg");
//        this.altaServicio(servicio1);
//        
//        DtServicio servicio3 = new DtServicio("HoteleriaOne", "Un servicio de hoteleria genial.", new Float(30000), ciudad2.getNombre(), null, categorias, "gonzatrick", "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\habitacion2.jpg", "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\banios2.jpg", "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\piscina2.jpg");
//        this.altaServicio(servicio3);
//        
//        //Se contemplan errores
//        
//        DtServicio servicio2 = new DtServicio("HoteleriaOne", "Un excelente servicio de hoteleria brindado de la mejor manera.", new Float(15000), ciudad1.getNombre(), null, categorias, "pepeargento", "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\habitacion1.jpg", "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\banio1.jpg", "C:\\Users\\nicop\\Desktop\\Cosas del Curso\\Imagenes\\piscina1.jpg");
//        if(!this.altaServicio(servicio2)){
//            System.out.println("El proveedor ya tiene agregado ese servicio");
//        }
        
        
    }

    

    

    
    

}


