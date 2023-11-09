/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CarroVenta;
import jdk.jfr.Event;
import tools.Pantalla;
import tools.Tabla;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author wilia
 */
public class Venta extends javax.swing.JFrame {

    Pantalla pantalla = Pantalla.getInstance();
    Recargas recargas = Recargas.getInstance();

    IconoMenu iconoMenu = new IconoMenu();
    Icono icono = new Icono();
    MenuPrincipal menuPrincipal;

    private  static final Venta venta = new Venta();

    public static Venta getInstance(){
        return venta;
    }
    
    public Venta() {
        initComponents();
        Tabla tabla = Tabla.getInstance();
        Font font = new Font("Arial", Font.BOLD, 15);
        iconoMenu.setImageToLabel(iconoCelular, "src/main/java/imagenes/iconoSmartphone.png");
        iconoMenu.setImageToLabel(iconoRecarga, "src/main/java/imagenes/iconoRecarga.png");
        icono.setImageToLabel(botonAtras,"src/main/java/imagenes/iconoAtras.png");
        tablaListaProductos.getTableHeader().setFont(font);
        tabla.enter(tablaListaProductos);
    }

    public JTable getTablaListaProductos() {
        return tablaListaProductos;
    }

    public void setTablaListaProductos(JTable tablaListaProductos) {
        this.tablaListaProductos = tablaListaProductos;
    }

    public TextField getCampoTotal() {
        return campoTotal;
    }

    public void setCampoTotal(TextField campoTotal) {
        this.campoTotal = campoTotal;
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        inventarioCelular = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        iconoCelular = new javax.swing.JLabel();
        inventarioRecarga = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        iconoRecarga = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaListaProductos = new javax.swing.JTable();
        textTotal = new javax.swing.JLabel();
        campoTotal = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 38, 53));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 208, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE PRODUCTOS");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("FACTURAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel2.setBackground(new java.awt.Color(17, 38, 53));
        jPanel2.setLayout(new java.awt.GridLayout(6, 1));

        jPanel3.setBackground(new java.awt.Color(17, 38, 53));

        botonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(17, 38, 53));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);

        inventarioCelular.setBackground(new java.awt.Color(17, 38, 53));
        inventarioCelular.setForeground(new java.awt.Color(190, 208, 235));
        inventarioCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventarioCelular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarioCelularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventarioCelularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventarioCelularMouseExited(evt);
            }
        });
        inventarioCelular.setLayout(new java.awt.GridLayout(1, 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(190, 208, 235));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CELULAR");
        inventarioCelular.add(jLabel2);
        inventarioCelular.add(iconoCelular);

        jPanel2.add(inventarioCelular);

        inventarioRecarga.setBackground(new java.awt.Color(17, 38, 53));
        inventarioRecarga.setForeground(new java.awt.Color(190, 208, 235));
        inventarioRecarga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventarioRecarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarioRecargaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventarioRecargaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventarioRecargaMouseExited(evt);
            }
        });
        inventarioRecarga.setLayout(new java.awt.GridLayout(1, 2));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 208, 235));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RECARGA");
        inventarioRecarga.add(jLabel4);
        inventarioRecarga.add(iconoRecarga);

        jPanel2.add(inventarioRecarga);

        jPanel7.setBackground(new java.awt.Color(17, 38, 53));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(17, 38, 53));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8);

        tablaListaProductos.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tablaListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANTIDAD", "CODIGO", "PRODUCTO", "DESCRIPCION", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaListaProductos.setRowHeight(35);
        tablaListaProductos.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tablaListaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaListaProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaListaProductosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablaListaProductos);

        textTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textTotal.setForeground(new java.awt.Color(190, 208, 235));
        textTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTotal.setText("TOTAL");

        campoTotal.setBackground(new java.awt.Color(102, 255, 102));
        campoTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoTotal.setEditable(false);
        campoTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        campoTotal.setText("Q0.00");
        campoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventarioCelularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioCelularMouseEntered
        Color customColor = new Color(252,255,247);
        inventarioCelular.setBackground(customColor);
    }//GEN-LAST:event_inventarioCelularMouseEntered

    private void inventarioCelularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioCelularMouseExited
        Color customColor = new Color(17,38,53);
        inventarioCelular.setBackground(customColor);
    }//GEN-LAST:event_inventarioCelularMouseExited

    private void inventarioRecargaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioRecargaMouseEntered
        Color customColor = new Color(252,255,247);
        inventarioRecarga.setBackground(customColor);
    }//GEN-LAST:event_inventarioRecargaMouseEntered

    private void inventarioRecargaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioRecargaMouseExited
        Color customColor = new Color(17,38,53);
        inventarioRecarga.setBackground(customColor);
    }//GEN-LAST:event_inventarioRecargaMouseExited

    private void inventarioCelularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioCelularMouseClicked
        InventarioCelulares pantallaInventarioCelular = InventarioCelulares.getInstance();
        pantalla.abrirPantalla(pantallaInventarioCelular,800,500);
        pantallaInventarioCelular.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_inventarioCelularMouseClicked

    private void botonAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseClicked
        Pantalla pantalla = Pantalla.getInstance();
        pantalla.abrirPantalla(menuPrincipal = new MenuPrincipal(), 1100, 700);
        this.dispose();
    }//GEN-LAST:event_botonAtrasMouseClicked

    private void campoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTotalActionPerformed

    private void inventarioRecargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioRecargaMouseClicked
        pantalla.abrirPantalla(recargas, 800,500);
        recargas.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_inventarioRecargaMouseClicked

    private void tablaListaProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaListaProductosKeyReleased
        CarroVenta cv = CarroVenta.getInstance();
        if(evt.getKeyCode() == KeyEvent.VK_DELETE){
            cv.eliminarProducto();
            cv.sumarTotal();
        }
    }//GEN-LAST:event_tablaListaProductosKeyReleased

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonAtras;
    private java.awt.TextField campoTotal;
    private javax.swing.JLabel iconoCelular;
    private javax.swing.JLabel iconoRecarga;
    private javax.swing.JPanel inventarioCelular;
    private javax.swing.JPanel inventarioRecarga;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaListaProductos;
    private javax.swing.JLabel textTotal;
    // End of variables declaration//GEN-END:variables
}
