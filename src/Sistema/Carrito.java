/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;

import Clases.Carrito1;
import java.awt.Color;
import java.awt.Cursor;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTHIAN
 */
public class Carrito extends javax.swing.JFrame {


    public Carrito() {
        initComponents();
        setLocationRelativeTo(null);
        confirmar.setCursor(new Cursor(HAND_CURSOR));
        ver.setCursor(new Cursor(HAND_CURSOR));
        cancelar.setCursor(new Cursor(HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zonas = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        salir1 = new Sistema.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rbt3 = new javax.swing.JRadioButton();
        rbt1 = new javax.swing.JRadioButton();
        rbt2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbld = new javax.swing.JLabel();
        confirmar = new Sistema.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ver = new Sistema.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        cancelar = new Sistema.PanelRound();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 142, 142));
        jLabel1.setText("Total a pagar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 97, 36));

        lbltotal.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(43, 45, 66));
        jPanel2.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 130, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 45, 66));
        jLabel2.setText("Pedido pendiente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/billetes.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 50, 40));

        salir1.setBackground(new java.awt.Color(247, 247, 247));
        salir1.setForeground(new java.awt.Color(204, 204, 204));
        salir1.setRoundBottomLeft(30);
        salir1.setRoundBottomRight(30);
        salir1.setRoundTopLeft(30);
        salir1.setRoundTopRight(30);
        salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salir1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salir1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                salir1MouseReleased(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("←");
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout salir1Layout = new javax.swing.GroupLayout(salir1);
        salir1.setLayout(salir1Layout);
        salir1Layout.setHorizontalGroup(
            salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salir1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        salir1Layout.setVerticalGroup(
            salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salir1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 32));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 435, 111));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        zonas.add(rbt3);
        rbt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbt3.setForeground(new java.awt.Color(43, 45, 66));
        rbt3.setText("Lima Norte");
        jPanel1.add(rbt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 98, -1));

        zonas.add(rbt1);
        rbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbt1.setForeground(new java.awt.Color(43, 45, 66));
        rbt1.setText("Lima Sur");
        jPanel1.add(rbt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 98, -1));

        zonas.add(rbt2);
        rbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbt2.setForeground(new java.awt.Color(43, 45, 66));
        rbt2.setText("Lima Centro");
        jPanel1.add(rbt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 45, 66));
        jLabel3.setText("Seleccionar zona:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 145, 140));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 45, 66));
        jLabel4.setText("Pendiente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 28, 77, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 2, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 45, 66));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 60, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 45, 66));
        jLabel6.setText("Total: ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 104, 120, 20));

        lbld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbld.setForeground(new java.awt.Color(43, 45, 66));
        lbld.setText("Delivery: ");
        jPanel3.add(lbld, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 82, 120, 20));

        confirmar.setBackground(new java.awt.Color(0, 210, 172));
        confirmar.setRoundBottomLeft(15);
        confirmar.setRoundBottomRight(15);
        confirmar.setRoundTopLeft(15);
        confirmar.setRoundTopRight(15);
        confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confirmarMouseReleased(evt);
            }
        });
        confirmar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirmar pedido");
        confirmar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 15, 130, -1));

        jPanel3.add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 170, 50));

        jButton1.setForeground(new java.awt.Color(60, 63, 65));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 45, 66));
        jLabel7.setText("Subtotal:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 60, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("Nombre:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, -1));
        jPanel3.add(txtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, -1));
        jPanel3.add(txtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("DNI:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));
        jPanel3.add(txtdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 45, 66));
        jLabel12.setText("Dirección:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

        ver.setBackground(new java.awt.Color(38, 70, 83));
        ver.setRoundBottomLeft(15);
        ver.setRoundBottomRight(15);
        ver.setRoundTopLeft(15);
        ver.setRoundTopRight(15);
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                verMouseReleased(evt);
            }
        });
        ver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ver compras");
        ver.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 100, -1));

        jPanel3.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 130, 30));

        cancelar.setBackground(new java.awt.Color(230, 57, 70));
        cancelar.setRoundBottomLeft(15);
        cancelar.setRoundBottomRight(15);
        cancelar.setRoundTopLeft(15);
        cancelar.setRoundTopRight(15);
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelarMouseReleased(evt);
            }
        });
        cancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cancelar compra");
        cancelar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, 120, -1));

        jPanel3.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, 440, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel5.setText(lbltotal.getText());
        double valor=0;
        boolean p1=rbt1.isSelected(),p2=rbt2.isSelected(),p3=rbt3.isSelected();
        valor=hallarD(p1,p2,p3);
        lbld.setText("Delivery:      "+valor);
        double subt = Double.parseDouble(jLabel5.getText());
        double tot=subt+valor;
        
        jLabel6.setText("Total:         "+tot);
        lbltotal.setText(""+tot);
    }//GEN-LAST:event_jButton1ActionPerformed

    double hallarD(boolean p1, boolean p2, boolean p3){
        double valor=0;
        if (rbt1.isSelected())
            valor=10.0;
        if (rbt2.isSelected())
            valor=15.0;
        if (rbt3.isSelected())
            valor=20.0;
        return valor;
    }
    private void confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseClicked
        File f = new File("Compras.txt");
        Principal p=new Principal();
        if(txtn.getText().equals("")||txtd.getText().equals("")||txtdi.getText().equals("")||!(rbt1.isSelected()||rbt2.isSelected()||rbt3.isSelected())){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{   
            JOptionPane.showMessageDialog(this,"¡Su pedido se ha realizado con éxito!");
            this.setVisible(false);
            p.setVisible(true);
            f.delete();
        }
    }//GEN-LAST:event_confirmarMouseClicked

    private void confirmarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMousePressed
        confirmar.setBackground(new Color(12, 166, 138));
    }//GEN-LAST:event_confirmarMousePressed

    private void confirmarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseReleased
        confirmar.setBackground(new Color(0,210,172));
    }//GEN-LAST:event_confirmarMouseReleased

    private void confirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseEntered
        confirmar.setBackground(new Color(22, 196, 165));
    }//GEN-LAST:event_confirmarMouseEntered

    private void confirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseExited
        confirmar.setBackground(new Color(0,210,172));
    }//GEN-LAST:event_confirmarMouseExited

    private void salir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseClicked
        Principal obj=new Principal();
        Principal.lblpago2.setText(lbltotal.getText());
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salir1MouseClicked

    private void salir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseEntered
        salir1.setBackground(new Color(231,231,231));
    }//GEN-LAST:event_salir1MouseEntered

    private void salir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseExited
        salir1.setBackground(new Color(247,247,247));
    }//GEN-LAST:event_salir1MouseExited

    private void salir1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MousePressed
        salir1.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_salir1MousePressed

    private void salir1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseReleased
        salir1.setBackground(new Color(247,247,247));
    }//GEN-LAST:event_salir1MouseReleased

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        VistaCompras v = new VistaCompras();
        v.setVisible(true);
    }//GEN-LAST:event_verMouseClicked
    private void verMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMousePressed
        ver.setBackground(new Color(24, 45, 52));
    }//GEN-LAST:event_verMousePressed

    private void verMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseReleased
        ver.setBackground(new Color(38,70,83));
    }//GEN-LAST:event_verMouseReleased

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        File f = new File("Compras.txt");
        Principal p = new Principal();
        int respuesta=JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere cancelar la compra?", "Cancelar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (respuesta==0){
            JOptionPane.showMessageDialog(null, "Compra cancelada", "Cancelado", 1);
            p.setVisible(true);
            this.setVisible(false);
            f.delete();
            Carrito1.borrar();
        }
            
    }//GEN-LAST:event_cancelarMouseClicked

    private void cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarMousePressed

    private void cancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarMouseReleased

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
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Sistema.PanelRound cancelar;
    private Sistema.PanelRound confirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbld;
    public static javax.swing.JLabel lbltotal;
    private javax.swing.JRadioButton rbt1;
    private javax.swing.JRadioButton rbt2;
    private javax.swing.JRadioButton rbt3;
    private Sistema.PanelRound salir1;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txtdi;
    private javax.swing.JTextField txtn;
    private Sistema.PanelRound ver;
    public static javax.swing.ButtonGroup zonas;
    // End of variables declaration//GEN-END:variables
}
