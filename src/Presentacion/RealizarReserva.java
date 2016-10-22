/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import DataTypes.DtReserva;
import Logica.Fabrica;
import Logica.ISistema;
import Manejadores.ManejadorCliente;
import Manejadores.ManejadorProveedor;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author leandro
 */
public class RealizarReserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form RealizarReserva
     */
    private ISistema IS;
    private DefaultListModel lista = new DefaultListModel();
    private ArrayList<DtReserva> reservasServicios = new ArrayList();
    private ArrayList<DtReserva> reservasPromociones = new ArrayList();
    
    public RealizarReserva() {
        initComponents();
        
        Fabrica fabrica = Fabrica.getInstance();
        IS = fabrica.getISistema();
        
        
        
        entradaProveedor.setEditable(false);
        
        ManejadorProveedor proveedores = ManejadorProveedor.getinstance();
        ManejadorCliente clientes = ManejadorCliente.getinstance();
        
        ArrayList clients = clientes.getClientes();
        
        
        for(int i=0; i<clients.size(); i++){
            campoCliente.addItem(clients.get(i).toString());
            
        }
        
        
        for(int i=1; i<32; i++){
            diaFecha1.addItem(i);
        }
        for(int i=1; i<13; i++){
            mesFecha1.addItem(i);
        }
        for(int i=1920; i<2018; i++){
            anioFecha1.addItem(i);
        }
        for(int i=1; i<32; i++){
            diaFecha2.addItem(i);
        }
        for(int i=1; i<13; i++){
            mesFecha2.addItem(i);
        }
        for(int i=1920; i<2018; i++){
            anioFecha2.addItem(i);
           
        }
        
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Proveedores");
        
        //System.out.println("---- Llegue hasta aca -----");
        
        proveedores.crearArbol(raiz);
        
        //System.out.println("---- ARBOL -----");
        
        DefaultTreeModel modelo = new DefaultTreeModel(raiz);
        this.arbol.setModel(modelo);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoCliente = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        campoCantidad = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonQuitar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAgregar = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        diaFecha1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        mesFecha1 = new javax.swing.JComboBox();
        anioFecha1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        diaFecha2 = new javax.swing.JComboBox();
        mesFecha2 = new javax.swing.JComboBox();
        anioFecha2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        entradaProveedor = new javax.swing.JTextField();

        botonConfirmar.setText("Confirmar");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Realizar Reserva");

        jLabel2.setText("Cliente");

        jScrollPane1.setViewportView(arbol);

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonQuitar.setText("Quitar");
        botonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaAgregar);

        jLabel5.setText("Cantidad");

        jLabel7.setText("Fecha Inicio");

        anioFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioFecha1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha Fin");

        jLabel1.setText("Proveedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(39, 39, 39)
                                .addComponent(botonConfirmar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botonQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(diaFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(mesFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(anioFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(diaFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(mesFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(anioFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(entradaProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                                .addComponent(campoCantidad))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entradaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diaFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anioFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anioFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diaFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(botonAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(botonQuitar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        int tamano;
        String[] separador;
        if(arbol.getSelectionPath()!=null){  
            separador = arbol.getSelectionPath().toString().split(",");
            tamano = separador.length;
            if(tamano == 4){
                String proveedor = separador[tamano-3];
                proveedor = proveedor.substring(1);
                String tipo = separador[tamano-2];
                tipo = tipo.substring(1);
                String servicio = separador[tamano-1];
                separador = servicio.split("]");
                servicio = separador[0];
                servicio = servicio.substring(1);


                if(lista.contains(servicio)){
                    JOptionPane.showMessageDialog(null, "Ya agrego este servicio/promocion","Error",JOptionPane.ERROR_MESSAGE);
                }else{
                    if(lista.isEmpty()){
                        if(campoCantidad.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "El campo cantidad es vacio","Error",JOptionPane.ERROR_MESSAGE);
                        }else{
                            String fechaInicio = anioFecha1.getSelectedItem().toString() + mesFecha1.getSelectedItem().toString() + diaFecha1.getSelectedItem().toString();
                            String fechaFin = anioFecha2.getSelectedItem().toString() + mesFecha2.getSelectedItem().toString() + diaFecha2.getSelectedItem().toString();
                            int enteroInicio = Integer.parseInt(fechaInicio);
                            int enteroFin = Integer.parseInt(fechaFin);
                            if(enteroInicio == enteroFin || enteroInicio > enteroFin){
                                JOptionPane.showMessageDialog(null, "Las fechas son iguales o\ninicio mayor que fin","Error",JOptionPane.ERROR_MESSAGE);
                            }else{
                                entradaProveedor.setText(proveedor);
                                lista.addElement(servicio);
                                listaAgregar.setModel(lista);
                                int anio = Integer.parseInt(anioFecha1.getSelectedItem().toString())-1900;
                                Date ini = new Date(anio, Integer.parseInt(mesFecha1.getSelectedItem().toString()), Integer.parseInt(diaFecha1.getSelectedItem().toString()));
                                Date fin = new Date(Integer.parseInt(anioFecha2.getSelectedItem().toString())-1900, Integer.parseInt(mesFecha2.getSelectedItem().toString()), Integer.parseInt(diaFecha2.getSelectedItem().toString()));
                                DtReserva nuevo = new DtReserva(servicio, Integer.parseInt(campoCantidad.getText()), ini, fin, proveedor);
                                if("Servicios".equals(tipo)){
                                    reservasServicios.add(nuevo);
                                    //System.out.println("Se agrego servicio");
                                }else{
                                    reservasPromociones.add(nuevo);
                                    //System.out.println("Se agrego promocion");
                                }
                            }
                        }
                    }else{
                        if(entradaProveedor.getText().equals(proveedor)){
                            String fechaInicio = anioFecha1.getSelectedItem().toString() + mesFecha1.getSelectedItem().toString() + diaFecha1.getSelectedItem().toString();
                            String fechaFin = anioFecha2.getSelectedItem().toString() + mesFecha2.getSelectedItem().toString() + diaFecha2.getSelectedItem().toString();
                            int enteroInicio = Integer.parseInt(fechaInicio);
                            int enteroFin = Integer.parseInt(fechaFin);
                            if(enteroInicio == enteroFin || enteroInicio > enteroFin){
                                JOptionPane.showMessageDialog(null, "Las fechas son iguales o\ninicio mayor que fin","Error",JOptionPane.ERROR_MESSAGE);
                            }else{
                                int anio = Integer.parseInt(anioFecha1.getSelectedItem().toString())-1900;
                                Date ini = new Date(anio, Integer.parseInt(mesFecha1.getSelectedItem().toString()), Integer.parseInt(diaFecha1.getSelectedItem().toString()));
                                Date fin = new Date(Integer.parseInt(anioFecha2.getSelectedItem().toString())-1900, Integer.parseInt(mesFecha2.getSelectedItem().toString()), Integer.parseInt(diaFecha2.getSelectedItem().toString()));
                                DtReserva nuevo = new DtReserva(servicio, Integer.parseInt(campoCantidad.getText()), ini, fin, proveedor);
                                if("Servicios".equals(tipo)){
                                    reservasServicios.add(nuevo);
                                    //System.out.println("Se agrego servicio");
                                }else{
                                    reservasPromociones.add(nuevo);
                                    //System.out.println("Se agrego promocion");
                                }
                                lista.addElement(servicio);
                                listaAgregar.setModel(lista);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Seleccione un servicio/promocion\ndel proveedor: " + entradaProveedor.getText(),"Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }

            }else
                JOptionPane.showMessageDialog(null, "Seleccione un servicio/promocion","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un servicio/promocion","Error",JOptionPane.ERROR_MESSAGE); 
        }
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarActionPerformed
        for(int i=0; i<reservasServicios.size(); i++){
            DtReserva aux = reservasServicios.get(i);
            if(aux.getNombre().equals(listaAgregar.getSelectedValue().toString())){
                reservasServicios.remove(i);
                //System.out.println("Se borro servicio");
                break;
            }
        }
        for(int i=0; i<reservasPromociones.size(); i++){
            DtReserva aux = reservasPromociones.get(i);
            if(aux.getNombre().equals(listaAgregar.getSelectedValue().toString())){
                reservasPromociones.remove(i);
                break;
            }
        }
        lista.removeElement(listaAgregar.getSelectedValue());
        listaAgregar.setModel(lista);
        if(lista.isEmpty()){
            entradaProveedor.setText("");
        }
    }//GEN-LAST:event_botonQuitarActionPerformed

    private void anioFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioFecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioFecha1ActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        if(campoCliente.getSelectedItem()!=null){
            boolean retorno = IS.realizarReserva(campoCliente.getSelectedItem().toString(), reservasServicios, reservasPromociones, entradaProveedor.getText());
            if(retorno){
                JOptionPane.showMessageDialog(null, "Se ha agregado con exito");
            }
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un cliente","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox anioFecha1;
    private javax.swing.JComboBox anioFecha2;
    private javax.swing.JTree arbol;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JButton botonQuitar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JComboBox campoCliente;
    private javax.swing.JComboBox diaFecha1;
    private javax.swing.JComboBox diaFecha2;
    private javax.swing.JTextField entradaProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaAgregar;
    private javax.swing.JComboBox mesFecha1;
    private javax.swing.JComboBox mesFecha2;
    // End of variables declaration//GEN-END:variables
}
