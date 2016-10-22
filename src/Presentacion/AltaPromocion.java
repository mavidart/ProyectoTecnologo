package Presentacion;

import Logica.Ciudad;
import Logica.Fabrica;
import Logica.ISistema;
import Logica.Pais;
import Logica.Promocion;
import Logica.Proveedor;
import Logica.Servicio;
import Manejadores.ManejadorProveedor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AltaPromocion extends javax.swing.JInternalFrame {
int contador=0;
float precioTotal=0;
float precioConDesc;
private String nombreProveedor = "";
private ISistema IS;

 private DefaultListModel listaSer = new DefaultListModel();
  private DefaultListModel lista = new DefaultListModel();  
    
    public AltaPromocion() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        IS = fabrica.getISistema();       
        ManejadorProveedor mp = ManejadorProveedor.getinstance();
        
//---- PRUEBA  -----------------------------------------------------------------
    /*  Map<String,Promocion> pr=new HashMap<>(); 
        Promocion p = new Promocion("vasos", 20, 70, null);
        pr.put(p.getNombre(), p);      
        
        Map<String,Servicio> sr=new HashMap<>(); 
        Pais p1 = new Pais();
        Ciudad o = new Ciudad("Montevideo", p1); Ciudad d = new Ciudad("Colonia", p1);
        Servicio s = new Servicio("navidad", "fiestas", 1000, o, d, null, null, null);
        sr.put(s.getNombre(), s);        
                    
        Proveedor prov= new Proveedor(sr, pr, "tata", "tata.com.uy", "marito", "mario", "rios", "mrr@gmail.com", null, null);  
        mp.addProveedor(prov); */
//------------------------------------------------------------------------------       
        
        List <Proveedor> prs=mp.getProveedoresObjetos();
        jlistServicios.removeAll();
        cbProveedores.removeAllItems();
        
        for(int i=0;i<prs.size();i++){               
                Proveedor aux = (Proveedor) prs.get(i); 
                //System.out.println("El nick es: " + aux.getNick());
                cbProveedores.addItem(aux.getNick());
        }
    contador ++;        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNompromo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistResultado = new javax.swing.JList();
        btnAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbProveedores = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlistServicios = new javax.swing.JList<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("jLabel4");

        jLabel1.setText("Nombre");

        jLabel2.setText("Descuento");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Alta Promoción");

        jScrollPane2.setViewportView(jlistResultado);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jButton2.setText("Quitar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Proveedor");

        cbProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedoresActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jlistServicios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(60, 60, 60)
                                .addComponent(btnConfirmar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProveedores, javax.swing.GroupLayout.Alignment.LEADING, 0, 201, Short.MAX_VALUE)
                            .addComponent(txtNompromo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNompromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(56, 56, 56)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConfirmar)
                            .addComponent(btnCancelar))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(63, 63, 63))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String aux = jlistServicios.getSelectedValue();
        if("".equals(nombreProveedor))
              nombreProveedor = cbProveedores.getSelectedItem().toString();
        if(lista.contains(aux)){
                JOptionPane.showMessageDialog(null, "Ya agrego ese servicio","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                if(cbProveedores.getSelectedItem().toString().equals(nombreProveedor)){
                    lista.addElement(aux);
                    jlistResultado.setModel(lista);
                }else{
                    JOptionPane.showMessageDialog(null, "El servicio no pertenece al mismo proveedor","Error",JOptionPane.ERROR_MESSAGE);
                }
                //lblPrecio.setText("precioTotal");
            }       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
                    
    if(lista.isEmpty()||txtNompromo.getText().equals("")||txtDescuento.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos Vacios","Error",JOptionPane.ERROR_MESSAGE);
    }else{
        ManejadorProveedor mp = ManejadorProveedor.getinstance();
        String sel = (String) this.cbProveedores.getSelectedItem();          
        Proveedor paux = (Proveedor) mp.buscarProv(sel);
        
        
        List<Servicio> ser = new ArrayList<>();
        for(int i=0; i<lista.getSize(); i++){
            String nom= lista.getElementAt(i).toString();
            Servicio s=mp.buscarServicio(paux, nom);
            precioTotal=precioTotal+s.getPrecio();
           // System.out.println("Entre aca");
           // System.out.println("Nomnbre del servicio: "+s.getNombre());
            ser.add(s);
        }
        
        float des = Float.parseFloat(txtDescuento.getText());
        precioConDesc = precioTotal - ((precioTotal*des)/100);
        boolean retorno;
        retorno=IS.altaPromocion(sel,txtNompromo.getText(), ser, des, precioConDesc);
        if(retorno){
            JOptionPane.showMessageDialog(null, "Se agrego correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe una promocion con ese nombre","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedoresActionPerformed
        if(contador>0){ 
       
        ManejadorProveedor mp = ManejadorProveedor.getinstance(); 
        String sel = (String) this.cbProveedores.getSelectedItem(); 
          //System.out.println("SEL ES: "+ sel);
        Proveedor paux = (Proveedor) mp.buscarProv(sel);
        
          //System.out.println("El nick del proveedor es: "+ paux.getNick());
        
         List <Servicio> srs=paux.getServicios();
         listaSer.removeAllElements();
         jlistResultado.setModel(lista);
         for(int i=0;i<srs.size();i++){               
                Servicio ser = (Servicio) srs.get(i); 
                listaSer.addElement(ser.getNombre());
        }
         jlistServicios.setModel(listaSer);       
        }
    }//GEN-LAST:event_cbProveedoresActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jlistResultado.getSelectedValue()!=null){
            lista.removeElement(jlistResultado.getSelectedValue().toString());
            jlistResultado.setModel(lista);
            if(lista.size()==0){
                nombreProveedor = "";
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList jlistResultado;
    private javax.swing.JList<String> jlistServicios;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtNompromo;
    // End of variables declaration//GEN-END:variables
}
