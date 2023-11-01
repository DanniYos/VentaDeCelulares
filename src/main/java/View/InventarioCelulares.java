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
import tools.Pantalla;

/**
 *
 * @author wilia
 */
public class InventarioCelulares extends javax.swing.JFrame {
    Pantalla pantalla = Pantalla.getInstance();
    InventarioLotes inventarioLotes = InventarioLotes.getInstance();

    private static final InventarioCelulares inventarioCelulares = new InventarioCelulares();

    public static InventarioCelulares getInstance(){
        return inventarioCelulares;
    }


    public InventarioCelulares() {
        initComponents();
        tablaInventarioCelulares.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "none");
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
        tablaInventarioCelulares = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        filtroBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 38, 53));

        tablaInventarioCelulares.setBackground(new java.awt.Color(204, 204, 204));
        tablaInventarioCelulares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaInventarioCelulares.setForeground(new java.awt.Color(0, 0, 0));
        tablaInventarioCelulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INVENTARIO", "CODIGO DE BARRA", "MARCA", "MODELO", "PLAN", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInventarioCelulares.setName(""); // NOI18N
        tablaInventarioCelulares.setRowHeight(35);
        tablaInventarioCelulares.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tablaInventarioCelulares.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaInventarioCelulares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaInventarioCelularesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaInventarioCelulares);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 208, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CELULARES DISPONIBLES");

        filtroBuscar.setBackground(new java.awt.Color(17, 38, 53));
        filtroBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        filtroBuscar.setForeground(new java.awt.Color(190, 208, 235));
        filtroBuscar.setBorder(null);

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscar.setText("BUSCAR");
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(filtroBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filtroBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        cargarInventario();
    }//GEN-LAST:event_botonBuscarMouseClicked

    private void tablaInventarioCelularesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaInventarioCelularesKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Venta venta = Venta.getInstance();
            InventarioLotes inv = InventarioLotes.getInstance();
            CarroVenta cv = CarroVenta.getInstance();
            int selectedRow = tablaInventarioCelulares.getSelectedRow();
            Object codigoBarra = tablaInventarioCelulares.getValueAt(selectedRow, 1);
            String codigoBarraString = codigoBarra.toString();
            System.out.println(codigoBarra);
            pantalla.abrirPantalla(inv, 600, 350);
            inv.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            inv.mostrarCeuluaresPorLote(codigoBarraString);
            int fila = venta.getTablaListaProductos().getRowCount();
            if (fila > 0 ){
                cv.disminuirInventario();
            }
            this.dispose();
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
            java.util.logging.Logger.getLogger(InventarioCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioCelulares().setVisible(true);
            }
        });
    }

    public void cargarInventario(){
        if (filtroBuscar.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del celular que desea buscar");
        }else{
        CelularController celularController = new CelularController();
        String filtro = filtroBuscar.getText();
        List<Object[]> celulares = celularController.listarInventarioCelular(filtro);
        DefaultTableModel listaCelulares = (DefaultTableModel) tablaInventarioCelulares.getModel();
        listaCelulares.setRowCount(0);
        for(Object[] celular : celulares) {
            Long cantidad = (Long) celular[0];
            String codigoBarra = (String) celular[1];
            String marca = (String) celular[2];
            String modelo = (String) celular[3];
            String plan = (String) celular[4];
            Double precioVenta = (Double) celular[5];
            listaCelulares.addRow(new Object[]{cantidad,codigoBarra, marca, modelo, plan, precioVenta});
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField filtroBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaInventarioCelulares;
    // End of variables declaration//GEN-END:variables
}
