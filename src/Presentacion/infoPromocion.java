package Presentacion;

import DataTypes.DtInfoServicio;
import DataTypes.DtPromocion;
import DataTypes.DtServicio;
import Logica.Fabrica;
import Logica.ISistema;
import Logica.Promocion;
import Logica.Proveedor;
import Logica.Servicio;
import Manejadores.ManejadorProveedor;
import java.awt.Image;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class infoPromocion extends javax.swing.JInternalFrame {

int contador=0;
private ISistema IS;

 private DefaultListModel lista = new DefaultListModel();  
 private DtPromocion dpromo;

    public infoPromocion() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        IS = fabrica.getISistema();        
        ManejadorProveedor mp= ManejadorProveedor.getinstance();        
        
        lblImagen1.setSize(100, 100);
        lblImagen2.setSize(100, 100);
        lblImagen3.setSize(100, 100);
        entradaDescripcion.setLineWrap(true);
        entradaDescripcion.setWrapStyleWord(true);
        entradaDescripcion.setEditable(false);
        entradaDescuento.setEditable(false);
        entradaDestino.setEditable(false);
        entradaNombre.setEditable(false);
        entradaOrigen.setEditable(false);
        entradaPrecio.setEditable(false);
        entradaPrecioTotal.setEditable(false);
        
        List <Proveedor> provs = mp.ListProveedores();         
        
        //System.out.println("Tamanio de provs: " + provs.size());
        
        for(int i=0;i<provs.size();i++){           
            
               for(int j=0;j<provs.get(i).getPromociones().size();j++){               
                   Promocion aux = (Promocion) provs.get(i).getPromociones().get(j); 
                      cbPromociones.addItem(provs.get(i).getNick() +" "+aux.getNombre());
        }
               
   }
    cbPromociones.getSelectedItem();
    contador++;
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        cbPromociones = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblImagen1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblImagen2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblImagen3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlistServicios = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entradaPrecioTotal = new javax.swing.JTextField();
        entradaDescuento = new javax.swing.JTextField();
        entradaNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnVerservicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        entradaDescripcion = new javax.swing.JTextArea();
        entradaDestino = new javax.swing.JTextField();
        entradaOrigen = new javax.swing.JTextField();
        entradaPrecio = new javax.swing.JTextField();

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Información Promocion");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cbPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPromocionesActionPerformed(evt);
            }
        });

        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(94, 100));

        lblImagen1.setText("img1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImagen1)
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblImagen1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setAutoscrolls(true);
        jPanel2.setMaximumSize(new java.awt.Dimension(94, 100));

        lblImagen2.setText("img2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblImagen2)
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblImagen2)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel3.setAutoscrolls(true);
        jPanel3.setMaximumSize(new java.awt.Dimension(94, 100));

        lblImagen3.setText("img3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblImagen3)
                .addGap(0, 82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblImagen3)
                .addGap(42, 42, 42))
        );

        jScrollPane4.setViewportView(jlistServicios);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Descuento");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Precio Total");

        entradaDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaDescuentoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Servicios");

        btnVerservicio.setText("Ver Servicio");
        btnVerservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerservicioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Precio");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Origen");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Destino");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Descripcion");

        entradaDescripcion.setColumns(20);
        entradaDescripcion.setRows(5);
        jScrollPane1.setViewportView(entradaDescripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(entradaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                            .addComponent(entradaOrigen)
                                            .addComponent(entradaPrecio))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(entradaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(entradaDescuento)
                            .addComponent(entradaPrecioTotal))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnVolver)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVerservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(entradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entradaDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entradaPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVerservicio)
                                        .addGap(10, 10, 10)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(entradaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(entradaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(entradaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPromocionesActionPerformed
        if(this.contador>0){
           
            String sel = (String) this.cbPromociones.getSelectedItem();
            String[] parte= sel.split(" ");
            String nomProve = parte[0];
            String nomPromo = parte[1];
           
            
    dpromo = IS.verInfoPromocion(nomProve, nomPromo);
    
    entradaNombre.setText(dpromo.getNombre());
    Float des = dpromo.getDescuento();
    entradaDescuento.setText(des.toString());
    Float pre = dpromo.getPrecioTotal();
    entradaPrecioTotal.setText(pre.toString());
           
        for(int i=0;i<dpromo.getServicios().size();i++){
            DtInfoServicio info = (DtInfoServicio) dpromo.getServicios().get(i);
            lista.addElement(info.getNombre());
        }    
        jlistServicios.setModel(lista);          
            
        }
            
    }//GEN-LAST:event_cbPromocionesActionPerformed

    private void btnVerservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerservicioActionPerformed
        ManejadorProveedor mp= ManejadorProveedor.getinstance();
         
        String sel = (String) this.cbPromociones.getSelectedItem();
        String[] parte= sel.split(" ");
        String nomProve = parte[0];
        String nomPromo = parte[1];
        
        String aux = jlistServicios.getSelectedValue();
        List lista = dpromo.getServicios();
        DtInfoServicio info = null;
        for(int i=0; i<dpromo.getServicios().size(); i++){
             info = (DtInfoServicio) lista.get(i);
            if(info.getNombre().equals(aux)){
                break;
            }
        }
        if(info!=null){
            entradaOrigen.setText(info.getOrigen());
            entradaDestino.setText(info.getDestino());
            entradaDescripcion.setText(info.getDescipcion());
            Float prec = info.getPrecio();
            entradaPrecio.setText(prec.toString());

            if(info.getImagen1() !=null){
                String mos=info.getImagen1();
                ImageIcon icono1 = new ImageIcon(mos);
                Icon ic1 = new ImageIcon(icono1.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_DEFAULT));
                lblImagen1.setIcon(ic1);
            }else{
                lblImagen1.setIcon(frameIcon);
            }
    //-------------
            if(info.getImagen2() !=null){
                String mos=info.getImagen2();
                ImageIcon icono2 = new ImageIcon(mos);
                Icon ic2 = new ImageIcon(icono2.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_DEFAULT));
                lblImagen2.setIcon(ic2);
            }else{
                lblImagen2.setIcon(frameIcon);
            }
    //-------------
            if(info.getImagen3() !=null){
                String mos=info.getImagen3();
                ImageIcon icono3 = new ImageIcon(mos);
                Icon ic3 = new ImageIcon(icono3.getImage().getScaledInstance(lblImagen3.getWidth(), lblImagen3.getHeight(), Image.SCALE_DEFAULT));
                lblImagen3.setIcon(ic3);
            }else{
                lblImagen3.setIcon(frameIcon);
            }
        }
        
    }//GEN-LAST:event_btnVerservicioActionPerformed

    private void entradaDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaDescuentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerservicio;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbPromociones;
    private javax.swing.JTextArea entradaDescripcion;
    private javax.swing.JTextField entradaDescuento;
    private javax.swing.JTextField entradaDestino;
    private javax.swing.JTextField entradaNombre;
    private javax.swing.JTextField entradaOrigen;
    private javax.swing.JTextField entradaPrecio;
    private javax.swing.JTextField entradaPrecioTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> jlistServicios;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    // End of variables declaration//GEN-END:variables
}
