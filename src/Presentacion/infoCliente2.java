package Presentacion;

import DataTypes.DtInfoReserva;
import DataTypes.DtReserva;
import DataTypes.DtTiposAsociativos;
import Logica.Cliente;
import Logica.Fabrica;
import Logica.ISistema;
import Logica.ResPro;
import Logica.ResServ;
import Logica.Reserva;
import Manejadores.ManejadorCliente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class infoCliente2 extends javax.swing.JInternalFrame {

    private infoCliente anterior;
    
    //private DefaultListModel lista = new DefaultListModel();
    private ISistema IS;
    private DefaultListModel lista = new DefaultListModel();
    
    private DefaultListModel listaPS = new DefaultListModel();
    
    public infoCliente2(infoCliente ant) {
        initComponents();
        anterior = ant;
        
        Fabrica fabrica = Fabrica.getInstance();
        IS = fabrica.getISistema();
        entradaPrecio.setEditable(false);
        entradaFecha.setEditable(false);
        entradaEstado.setEditable(false);
        
        for(int i=0;i< anterior.dc.getReservas().size();i++){        
            String s = anterior.dc.getReservas().get(i).toString();
            lista.addElement(s);
        }    
        jlistReservas.setModel(lista);
    
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlistReservas = new javax.swing.JList<>();
        btnVer = new javax.swing.JToggleButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jlistPS = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        entradaPrecio = new javax.swing.JTextField();
        entradaEstado = new javax.swing.JTextField();
        entradaFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jlistReservas);

        btnVer.setText("Ver Reserva");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(jlistPS);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Numero de Reserva");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Servicios y Promociones");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Estado");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Fecha");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Informacion de Reserva");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(entradaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(entradaPrecio)
                                            .addComponent(entradaEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnVolver)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(29, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(entradaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(entradaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(entradaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVer)
                            .addComponent(btnVolver)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        this.setVisible(false);
        anterior.setVisible(true);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        ManejadorCliente mc= ManejadorCliente.getinstance();       

        if(jlistReservas.getSelectedValue()!=null){

            Integer aux = Integer.parseInt(jlistReservas.getSelectedValue());
            
            DtInfoReserva res = IS.verInfoReserva(aux);
            
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm"); //dateFormat.format(res.getFecha());

            Float da = res.getPrecio();
            entradaPrecio.setText(da.toString());
            entradaEstado.setText(res.getEstado().toString());
            entradaFecha.setText(dateFormat.format(res.getFecha()));
            

            listaPS.removeAllElements();

            for(int i=0;i<res.getServicios().size();i++){               
                    DtTiposAsociativos rser = (DtTiposAsociativos) res.getServicios().get(i);
                    String servicios = rser.getNomSerPro(); 
                    listaPS.addElement(servicios);                
            }

            
            for(int i=0;i<res.getPromociones().size();i++){               
                    DtTiposAsociativos rpro = (DtTiposAsociativos) res.getPromociones().get(i);
                    String promos = rpro.getNomSerPro(); 
                    listaPS.addElement(promos);                
            }


            jlistPS.setModel(listaPS);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una reserva","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnVer;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField entradaEstado;
    private javax.swing.JTextField entradaFecha;
    private javax.swing.JTextField entradaPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> jlistPS;
    private javax.swing.JList<String> jlistReservas;
    // End of variables declaration//GEN-END:variables
}
