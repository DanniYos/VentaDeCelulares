/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CarroVenta;
import Controller.CelularController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 *
 * @author wilia
 */
public class InventarioLotes extends javax.swing.JFrame {
    CelularController cl;


    public InventarioLotes() {
        initComponents();
        tablaInventarioCelularesLotes.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "none");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventarioCelularesLotes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 38, 53));

        tablaInventarioCelularesLotes.setBackground(new java.awt.Color(204, 204, 204));
        tablaInventarioCelularesLotes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaInventarioCelularesLotes.setForeground(new java.awt.Color(0, 0, 0));
        tablaInventarioCelularesLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IMEI", "MARCA", "MODELO", "PLAN", "PRECIO"
            }
        ));
        tablaInventarioCelularesLotes.setName(""); // NOI18N
        tablaInventarioCelularesLotes.setRowHeight(35);
        tablaInventarioCelularesLotes.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tablaInventarioCelularesLotes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaInventarioCelularesLotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaInventarioCelularesLotesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaInventarioCelularesLotes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaInventarioCelularesLotesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaInventarioCelularesKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.dispose();
            llenarTabla();
            actualizarInventario();
        }
    }//GEN-LAST:event_tablaInventarioCelularesKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(InventarioLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioLotes().setVisible(true);
            }
        });
    }

    public void mostrarCeuluaresPorLote(String codigoBarra){
        cl = new CelularController();
        List<Object[]> celulares = cl.listarCelularesPorLote(codigoBarra);
        DefaultTableModel tablaListaCelulares = (DefaultTableModel) tablaInventarioCelularesLotes.getModel();
        for (Object[] celular : celulares){
            String IMEI = (String) celular[0];
            String marca = (String) celular[1];
            String modelo = (String) celular[2];
            String plan = (String) celular[3];
            double precioVenta = (double) celular[4];
            tablaListaCelulares.addRow(new Object[]{IMEI, marca, modelo, plan, precioVenta});
        }

    }

    public String obtenerImei(){
        int selectedRow = tablaInventarioCelularesLotes.getSelectedRow();
        Object imei = tablaInventarioCelularesLotes.getValueAt(selectedRow, 0);
        String imeiString = (String) imei;
        System.out.println(imeiString);
        return imeiString;
    }

    public void llenarTabla(){
        Venta venta = Venta.getInstance();
        CarroVenta carroVenta = new CarroVenta();
        Object[] celular = carroVenta.agregarProducto(obtenerImei());
        Integer cantidad = 1;
        String marca = (String) celular[0];
        String modelo = (String) celular[1];
        double precioVenta = (double) celular[2];
        DefaultTableModel tabla = (DefaultTableModel) venta.tablaListaProductos.getModel();
        tabla.addRow(new Object[]{cantidad, marca, modelo, precioVenta});
        String total = carroVenta.sumarTotal(venta.tablaListaProductos);
        venta.campoTotal.setText("Q"+total);
    }


    public void actualizarInventario(){
        cl = new CelularController();
        int filaSeleccionada = tablaInventarioCelularesLotes.getSelectedRow();
        String imei = (String) tablaInventarioCelularesLotes.getValueAt(filaSeleccionada, 0) ;
        System.out.println(imei);
        cl.actualizarInventario(imei, false);
        InventarioCelulares inv = InventarioCelulares.getInstance();
        inv.cargarInventario();
    }

    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInventarioCelularesLotes;
}
