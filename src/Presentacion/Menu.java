package Presentacion;


import DataTypes.Cargados;
import DataTypes.DtServicio;
import Logica.Ciudad;
import Logica.Fabrica;
import Logica.ISistema;
import Logica.Promocion;
import Logica.Proveedor;
import Logica.Servicio;
import Manejadores.ManejadorCategoria;
import Manejadores.ManejadorCiudades;
import Manejadores.ManejadorCliente;
import Manejadores.ManejadorProveedor;
import Manejadores.ManejadorReserva;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Menu extends javax.swing.JFrame {

   // private ISistema IS;
    
    public Menu() throws Exception {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        ISistema IS = fabrica.getISistema();
        
        IS.cargarTodo();
        List lista=IS.listarServicios();
        
        //Cargados precar = Cargados.getInstance();
        
        //precar.precargados();       
        // FALTA CARGAR COLECCION DE CATEGORIAS
        //mcat.cargarDatos
       
        //DATOS DE PRUEBA        
        //IS.tester();
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAltas = new javax.swing.JMenu();
        mnuAltaUsu = new javax.swing.JMenuItem();
        mnuAltaCate = new javax.swing.JMenuItem();
        mnuAltaSer = new javax.swing.JMenuItem();
        mnuAltaPromo = new javax.swing.JMenuItem();
        mnuRealizarRes = new javax.swing.JMenuItem();
        mnuActualizarRes = new javax.swing.JMenuItem();
        mnuCancelarRes = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        mnuInfoCliente = new javax.swing.JMenuItem();
        mnuInfoProveedor = new javax.swing.JMenuItem();
        mnuInfoServicio = new javax.swing.JMenuItem();
        mnuInfoPromo = new javax.swing.JMenuItem();
        mnuInfoReserva = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuAltas.setText("Altas");
        MenuAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAltasActionPerformed(evt);
            }
        });

        mnuAltaUsu.setText("Alta Usuario");
        mnuAltaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaUsuActionPerformed(evt);
            }
        });
        MenuAltas.add(mnuAltaUsu);

        mnuAltaCate.setText("Alta Categoria");
        mnuAltaCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaCateActionPerformed(evt);
            }
        });
        MenuAltas.add(mnuAltaCate);

        mnuAltaSer.setText("Alta Servicio");
        mnuAltaSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaSerActionPerformed(evt);
            }
        });
        MenuAltas.add(mnuAltaSer);

        mnuAltaPromo.setText("Alta Promoción");
        mnuAltaPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaPromoActionPerformed(evt);
            }
        });
        MenuAltas.add(mnuAltaPromo);

        mnuRealizarRes.setText("Realizar Reserva");
        mnuRealizarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRealizarResActionPerformed(evt);
            }
        });
        MenuAltas.add(mnuRealizarRes);

        mnuActualizarRes.setText("Actualizar estado de Reserva");
        mnuActualizarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuActualizarResActionPerformed(evt);
            }
        });
        MenuAltas.add(mnuActualizarRes);

        mnuCancelarRes.setText("Cancelar Reserva");
        mnuCancelarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCancelarResActionPerformed(evt);
            }
        });
        MenuAltas.add(mnuCancelarRes);

        jMenuBar1.add(MenuAltas);

        menuVer.setText("Ver...");

        mnuInfoCliente.setText("Ver Información de Usuario");
        mnuInfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInfoClienteActionPerformed(evt);
            }
        });
        menuVer.add(mnuInfoCliente);

        mnuInfoProveedor.setText("Ver Información de Proveedor");
        mnuInfoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInfoProveedorActionPerformed(evt);
            }
        });
        menuVer.add(mnuInfoProveedor);

        mnuInfoServicio.setText("Ver Información de Servicio");
        mnuInfoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInfoServicioActionPerformed(evt);
            }
        });
        menuVer.add(mnuInfoServicio);

        mnuInfoPromo.setText("Ver Información de Promoción");
        mnuInfoPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInfoPromoActionPerformed(evt);
            }
        });
        menuVer.add(mnuInfoPromo);

        mnuInfoReserva.setText("Ver Información de Reserva");
        mnuInfoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInfoReservaActionPerformed(evt);
            }
        });
        menuVer.add(mnuInfoReserva);

        jMenuBar1.add(menuVer);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAltaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaUsuActionPerformed
        AltaUsuario alt_usu = new AltaUsuario();
        this.add(alt_usu);
        alt_usu.setVisible(true);
    }//GEN-LAST:event_mnuAltaUsuActionPerformed

    private void mnuAltaCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaCateActionPerformed
        AltaCategoria alt_cat = new AltaCategoria();
        this.add(alt_cat);
        alt_cat.setVisible(true);
    }//GEN-LAST:event_mnuAltaCateActionPerformed

    private void MenuAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAltasActionPerformed

    }//GEN-LAST:event_MenuAltasActionPerformed

    private void mnuAltaSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaSerActionPerformed
        AltaServicio alt_ser = new AltaServicio(this);
        this.add(alt_ser);
        alt_ser.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAltaSerActionPerformed

    private void mnuAltaPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaPromoActionPerformed
        AltaPromocion alt_pro = new AltaPromocion();
        this.add(alt_pro);
        alt_pro.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAltaPromoActionPerformed

    private void mnuRealizarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRealizarResActionPerformed
        RealizarReserva reserva = new RealizarReserva();
        this.add(reserva);
        reserva.setVisible(true);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuRealizarResActionPerformed

    private void mnuActualizarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuActualizarResActionPerformed
        ActualizarEstadoRes act_est = new ActualizarEstadoRes();
        this.add(act_est);
        act_est.setVisible(true);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuActualizarResActionPerformed

    private void mnuCancelarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCancelarResActionPerformed
        CancelarReserva cancelar = new CancelarReserva();
        this.add(cancelar);
        cancelar.setVisible(true);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCancelarResActionPerformed

    private void mnuInfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInfoClienteActionPerformed
        infoCliente info_usu = new infoCliente(this);
        this.add(info_usu);
        info_usu.setVisible(true);
       
        
        
    }//GEN-LAST:event_mnuInfoClienteActionPerformed

    private void mnuInfoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInfoProveedorActionPerformed
        infoProveedor proveedor = new infoProveedor(this);
        this.add(proveedor);
        proveedor.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_mnuInfoProveedorActionPerformed

    private void mnuInfoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInfoServicioActionPerformed
        InformacionServicio servicio = new InformacionServicio();
        this.add(servicio);
        servicio.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuInfoServicioActionPerformed

    private void mnuInfoPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInfoPromoActionPerformed
        infoPromocion promo = new infoPromocion();
        this.add(promo);
        promo.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuInfoPromoActionPerformed

    private void mnuInfoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInfoReservaActionPerformed
        infoReserva reserva = new infoReserva();
        this.add(reserva);
        reserva.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuInfoReservaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       /* float da = 125;
        ArrayList<String> cat = new ArrayList();
        DtServicio datos = new DtServicio("Vuelo", "Este vuelo es de prueba", da, "Uruguay", "", cat, "nicoperez");
        
        ManejadorCiudades ciudades = ManejadorCiudades.getInstance();
        Pais pa = new Pais("America");
        Ciudad ciu = new Ciudad("Uruguay", pa);
        ciudades.addCiudades(ciu);
        
        //PRUEBAS
        //--------------------------------------
        Ciudad ciu1 = new Ciudad("Argentina", null);
        ciudades.addCiudades(ciu1);
        
        Ciudad ciu2 = new Ciudad("Brasil", null);
        ciudades.addCiudades(ciu2);
        //--------------------------------------
        
        manejadorUsuario usuarios = manejadorUsuario.getinstance();
        Proveedor usu = new Proveedor("www.facebook.com", null, "nicoperez", "Nico", null, null, null);
        Proveedor usu1 = new Proveedor("www.twiter.com", null, "diegoperez", "Diego", null, null, null);
        usuarios.addUsuario(usu);
        usuarios.addUsuario(usu1);
        
        //Sistema sys = new Sistema();
        //sys.altaServicio(datos);
       
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                ManejadorCategoria categorias = ManejadorCategoria.getInstance();
                
                
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAltas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuVer;
    private javax.swing.JMenuItem mnuActualizarRes;
    private javax.swing.JMenuItem mnuAltaCate;
    private javax.swing.JMenuItem mnuAltaPromo;
    private javax.swing.JMenuItem mnuAltaSer;
    private javax.swing.JMenuItem mnuAltaUsu;
    private javax.swing.JMenuItem mnuCancelarRes;
    private javax.swing.JMenuItem mnuInfoCliente;
    private javax.swing.JMenuItem mnuInfoPromo;
    private javax.swing.JMenuItem mnuInfoProveedor;
    private javax.swing.JMenuItem mnuInfoReserva;
    private javax.swing.JMenuItem mnuInfoServicio;
    private javax.swing.JMenuItem mnuRealizarRes;
    // End of variables declaration//GEN-END:variables
}
