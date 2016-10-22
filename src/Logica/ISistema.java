package Logica;

import DataTypes.DtCliente;
import DataTypes.DtInfoReserva;
import DataTypes.DtInfoServicio;
import DataTypes.DtPromocion;
import DataTypes.DtProveedor;
import DataTypes.DtReserva;
import java.util.Date;
import DataTypes.DtServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface ISistema {
    public abstract boolean altaCliente(String nick, String nom, String ape, String correo,Date fecha,String foto);
    public abstract boolean altaProveedor(String nick, String nom, String ape, String correo,Date fecha,String foto,String nomEmp, String linkEmp);
    public abstract boolean altaCategoria(String nombre, String nomPadre, String tipo, boolean persistencia);
    public abstract boolean altaServicio(DtServicio servicio);
    public abstract void actualizarServicio(DtServicio servicio);/* FALTA COMPLETAMENTE */
    public abstract boolean altaPromocion(String nick, String nombre, List <Servicio> servicios, float descuento, float precioTotal);
    public abstract boolean realizarReserva (String nickName, ArrayList<DtReserva> dtS, ArrayList<DtReserva> dtP, String nickProveedor);
    public abstract boolean actualizarEstadoReserva(String id, String estado);
    public abstract boolean cancelarReserva(String numero);
    public abstract DtInfoReserva verInfoReserva(Integer id);
    public abstract DtCliente verInfoCliente(String nick);
    public abstract DtProveedor verInfoProveedor(String nick);
    public abstract DtInfoServicio verInfoServicio(String nomCategoria, String nomServicio, String proveedor);
    public abstract DtPromocion verInfoPromocion(String nomProve,String Promocion);
    
    public abstract DtInfoServicio infoPorProv(String nombreProv, String servicio);
    
    public abstract void cargarTodo();
    public abstract List<DtInfoServicio> listarServicios();
    public abstract List<DtPromocion> listarPromociones();
    
    //PARTE DE TESTING
    public abstract void tester();
}
