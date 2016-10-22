package DataTypes;

import java.util.Date;

/**
 *
 * @author nicop
 */
public class DtTiposAsociativos {
    private int cantidad;
    private Date inicio;
    private Date fin;
    private String nomSerPro;
    
    public DtTiposAsociativos(int cantidad, Date inicio, Date fin, String nomSerPro){
        this.cantidad = cantidad;
        this.fin = fin;
        this.inicio = inicio;
        this.nomSerPro = nomSerPro;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public void setNomSerPro(String nomSerPro) {
        this.nomSerPro = nomSerPro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFin() {
        return fin;
    }

    public String getNomSerPro() {
        return nomSerPro;
    }
    
}
