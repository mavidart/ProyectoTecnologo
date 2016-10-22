package Presentacion;

import DataTypes.DtInfoServicio;
import Logica.Fabrica;
import Logica.ISistema;
import Logica.Proveedor;
import Logica.Servicio;
import Manejadores.ManejadorProveedor;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class infoProveedor2 extends javax.swing.JInternalFrame {

    private infoProveedor anterior;
    
    private DefaultListModel lista = new DefaultListModel();
    private ISistema IS;
    
    public infoProveedor2(infoProveedor ant) {
        initComponents();
        anterior = ant;
        ManejadorProveedor mp = ManejadorProveedor.getinstance();
        Fabrica fabrica = Fabrica.getInstance();
        IS = fabrica.getISistema();
        txtInfoServ.setEditable(false);
        txtInfoServ.setLineWrap(true);
        txtInfoServ.setWrapStyleWord(true);
        entradaOrigen.setEditable(false);
        entradaDestino.setEditable(false);
        entradaPrecio.setEditable(false);
        
        for(int i=0;i< anterior.dp.getServicios().size();i++){        
            String s = anterior.dp.getServicios().get(i);
            lista.addElement(anterior.dp.getServicios().get(i));
        }    
        jlistServicios.setModel(lista); 
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlistServicios = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfoServ = new javax.swing.JTextArea();
        btnVer = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entradaPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entradaOrigen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entradaDestino = new javax.swing.JTextField();

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jlistServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistServiciosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jlistServicios);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Imagenes");

        txtInfoServ.setColumns(20);
        txtInfoServ.setRows(5);
        jScrollPane1.setViewportView(txtInfoServ);

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Descripcion");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Precio");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Origen");

        entradaOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaOrigenActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Destino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 48, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(entradaDestino)
                                            .addComponent(entradaPrecio)
                                            .addComponent(entradaOrigen)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVer)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(entradaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(entradaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entradaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImagen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImagen3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        this.setVisible(false);
        anterior.setVisible(true);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jlistServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistServiciosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlistServiciosMouseClicked

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        ManejadorProveedor mp= ManejadorProveedor.getinstance();
        
        if(jlistServicios.getSelectedValue()!=null){

            String aux = jlistServicios.getSelectedValue();

            //Proveedor proveedor = mp.buscarProv(anterior.sel);
            //Servicio ds = mp.buscarServicio(proveedor, aux);

            DtInfoServicio ds = IS.infoPorProv(anterior.getNombreProv(), aux);
            
            entradaPrecio.setText(ds.getPrecio().toString());
            entradaDestino.setText(ds.getDestino());
            entradaOrigen.setText(ds.getOrigen());
            txtInfoServ.setText(ds.getDescipcion());

            if(ds.getImagen1() !=null){
                String mos=ds.getImagen1();
                ImageIcon icono1 = new ImageIcon(mos);
                Icon ic1 = new ImageIcon(icono1.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_DEFAULT));
                lblImagen1.setIcon(ic1);
            }else{
                lblImagen1.setIcon(frameIcon);
            }
    //-------------
            if(ds.getImagen2() !=null){
                String mos=ds.getImagen2();
                ImageIcon icono2 = new ImageIcon(mos);
                Icon ic2 = new ImageIcon(icono2.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_DEFAULT));
                lblImagen2.setIcon(ic2);
            }else{
                lblImagen2.setIcon(frameIcon);
            }
    //-------------
            if(ds.getImagen3() !=null){
                String mos=ds.getImagen3();
                ImageIcon icono3 = new ImageIcon(mos);
                Icon ic3 = new ImageIcon(icono3.getImage().getScaledInstance(lblImagen3.getWidth(), lblImagen3.getHeight(), Image.SCALE_DEFAULT));
                lblImagen3.setIcon(ic3);
            }else{
                lblImagen3.setIcon(frameIcon);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un servicio","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void entradaOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaOrigenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnVer;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField entradaDestino;
    private javax.swing.JTextField entradaOrigen;
    private javax.swing.JTextField entradaPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> jlistServicios;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JTextArea txtInfoServ;
    // End of variables declaration//GEN-END:variables
}
