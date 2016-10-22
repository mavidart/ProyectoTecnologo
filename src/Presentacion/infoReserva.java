package Presentacion;

import DataTypes.DtInfoReserva;
import DataTypes.DtTiposAsociativos;
import Logica.Fabrica;
import Logica.ISistema;
import Logica.ResPro;
import Logica.ResServ;
import Manejadores.ManejadorReserva;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class infoReserva extends javax.swing.JInternalFrame {
    
    private ISistema IS;
    private DefaultListModel listaRes = new DefaultListModel();
    private DefaultListModel listaOb = new DefaultListModel();
    private DtInfoReserva obtenido;
    
    public infoReserva() {
        initComponents();
        
        entradaFechaReserva.setEditable(false);
        entradaCantidad.setEditable(false);
        entradaEstado.setEditable(false);
        entradaFin.setEditable(false);
        entradaInicio.setEditable(false);
        entradaPrecio.setEditable(false);
        botonVerDatos.setEnabled(false);
        
        ManejadorReserva reservas = ManejadorReserva.getinstance();
        
        ArrayList auxReservas = new ArrayList();
        auxReservas = reservas.getReservas();
        
        for(int i=0; i<auxReservas.size(); i++){
            listaRes.addElement(auxReservas.get(i));
        }
        listaReservas.setModel(listaRes);
        
        Fabrica fabrica = Fabrica.getInstance();
        IS = fabrica.getISistema();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        boronConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        entradaFechaReserva = new javax.swing.JTextField();
        entradaPrecio = new javax.swing.JTextField();
        entradaEstado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaObtenida = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        entradaCantidad = new javax.swing.JTextField();
        entradaInicio = new javax.swing.JTextField();
        entradaFin = new javax.swing.JTextField();
        botonVerDatos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaReservas = new javax.swing.JList();

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Informacion de la Reserva");

        boronConfirmar.setText("Ver Reserva Seleccionada");
        boronConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boronConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Reservas");

        jLabel5.setText("Fecha");

        jLabel7.setText("Precio");

        jLabel8.setText("Estado");

        jScrollPane2.setViewportView(listaObtenida);

        jLabel9.setText("Servicios y Promociones");

        jLabel10.setText("Cantidad");

        jLabel11.setText("Inicio");

        jLabel12.setText("Fin");

        botonVerDatos.setText("Ver datos de lista");
        botonVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDatosActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(listaReservas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(entradaCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                            .addComponent(entradaInicio)
                                            .addComponent(entradaFin)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(botonVerDatos)
                                        .addGap(33, 33, 33))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(54, 54, 54))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(boronConfirmar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(entradaFechaReserva, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(entradaPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(entradaEstado, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(boronConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(entradaFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(entradaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entradaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(entradaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(entradaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(entradaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(botonVerDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addComponent(jScrollPane2)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void botonVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDatosActionPerformed
  
        if(listaReservas.getSelectedValue()!=null){
            List resAux = obtenido.getServicios();
            List proAux = obtenido.getPromociones();
           
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            
            if(!resAux.isEmpty()){
                for(int i=0;i<resAux.size();i++){        
                    DtTiposAsociativos aux = (DtTiposAsociativos) resAux.get(i);
                    if(listaObtenida.getSelectedValue().toString().equals(aux.getNomSerPro())){
                        entradaInicio.setText(dateFormat.format(aux.getInicio()));
                        entradaFin.setText(dateFormat.format(aux.getFin()));
                        Integer cant = aux.getCantidad();
                        entradaCantidad.setText(cant.toString());
                        break;
                    }
                }
            }
            if(!proAux.isEmpty()){
                
                for(int i=0;i<proAux.size();i++){        
                    DtTiposAsociativos aux = (DtTiposAsociativos) proAux.get(i);
                    if(listaObtenida.getSelectedValue().toString().equals(aux.getNomSerPro())){
                        entradaInicio.setText(dateFormat.format(aux.getInicio()));
                        entradaFin.setText(dateFormat.format(aux.getFin()));
                        Integer cant = aux.getCantidad();
                        entradaCantidad.setText(cant.toString());
                        break;
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una reserva","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonVerDatosActionPerformed

    private void boronConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boronConfirmarActionPerformed
            
        listaOb.removeAllElements();
        listaObtenida.removeAll();      
        
        if(listaReservas.getSelectedValue()!=null){            
            
           Integer id = Integer.parseInt(listaReservas.getSelectedValue().toString());
           //System.out.println("Antes de entrar" + id);      
           
           obtenido = IS.verInfoReserva(id);          
           
           DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
           
           Float aux = obtenido.getPrecio();
           
           entradaFechaReserva.setText(dateFormat.format(obtenido.getFecha()));
           entradaEstado.setText(obtenido.getEstado().toString());
           entradaPrecio.setText(aux.toString());
           
           List resAux = obtenido.getServicios();
           List proAux = obtenido.getPromociones();           
           
           if(!resAux.isEmpty()){
                for(int i=0;i<resAux.size();i++){        
                    DtTiposAsociativos aux1 = (DtTiposAsociativos) resAux.get(i);
                    listaOb.addElement(aux1.getNomSerPro());
                }
           }
           if(!proAux.isEmpty()){
                for(int i=0;i<proAux.size();i++){        
                    DtTiposAsociativos aux2 = (DtTiposAsociativos) proAux.get(i);
                    listaOb.addElement(aux2.getNomSerPro());           
                }           
           }
           listaObtenida.setModel(listaOb);
           
           botonVerDatos.setEnabled(true);
           
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione servicio/promocion","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boronConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boronConfirmar;
    private javax.swing.JButton botonVerDatos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField entradaCantidad;
    private javax.swing.JTextField entradaEstado;
    private javax.swing.JTextField entradaFechaReserva;
    private javax.swing.JTextField entradaFin;
    private javax.swing.JTextField entradaInicio;
    private javax.swing.JTextField entradaPrecio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaObtenida;
    private javax.swing.JList listaReservas;
    // End of variables declaration//GEN-END:variables
}
