package Presentacion;

import DataTypes.DtProveedor;
import Logica.Fabrica;
import Logica.ISistema;
import Manejadores.ManejadorProveedor;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class infoProveedor extends javax.swing.JInternalFrame {

    private ISistema IS;
    private Menu menu;
    private infoProveedor2 infoProv2;    
    
int contador=0;
DtProveedor dp;
String sel="";

    public infoProveedor(Menu men) {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        IS = fabrica.getISistema();
        ManejadorProveedor mp= ManejadorProveedor.getinstance();
        
        //Analogo a listar Clinetes en InfoUsu
        List pr = mp.getProveedores();
        cbProveedores.removeAllItems();  
        
        for(int i=0; i<pr.size();i++){           
            
            cbProveedores.addItem(pr.get(i).toString());        
        }
        cbProveedores.getSelectedItem();
        contador++;     
        
        menu = men;
        
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        cbProveedores = new javax.swing.JComboBox<>();
        btnVerServicios = new javax.swing.JToggleButton();

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Información Proveedor");

        btnCancelar.setText("Volver");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 170));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImagen)
                .addGap(0, 152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblImagen)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        cbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedoresActionPerformed(evt);
            }
        });

        btnVerServicios.setText("Ver Servicios del Proveedor");
        btnVerServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerServiciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerServicios)
                        .addGap(23, 23, 23)
                        .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedoresActionPerformed
        if(this.contador>0){
            
        sel = (String) this.cbProveedores.getSelectedItem();
        dp =IS.verInfoProveedor(sel);
       
        txtInfo.setText("Nick: "+dp.getNick()+"\nNombre: "+dp.getNombre()+"\nApellido: "+dp.getApellido()+"\nCorreo: "+dp.getCorreo()+"\nFecha de Nacimiento: "+dp.getFechaN()+"\nNombre Empresa: "+dp.getNomEmp()+"\nLink EmpresA: "+dp.getLinkEmp());
        
        lblImagen.setSize(200, 150);
        
        ImageIcon imagen = new ImageIcon(dp.getFoto());
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        
        
        lblImagen.setIcon(icono);
        }

    }//GEN-LAST:event_cbProveedoresActionPerformed

    private void btnVerServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerServiciosActionPerformed
        if(!sel.equals("")){
            if(this.contador>0){
                String sel = (String) this.cbProveedores.getSelectedItem();
                infoProv2 = new infoProveedor2(this);
                menu.add(infoProv2);
                this.setVisible(false);
                infoProv2.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerServiciosActionPerformed

    public String getNombreProv(){
        return sel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnVerServicios;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables
}
