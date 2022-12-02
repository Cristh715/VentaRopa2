/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author CRISTHIAN
 */
public class VistaCompras extends javax.swing.JFrame {

    public static int cantidades[];
    public static String productos[];
    public static double precios[];
    public VistaCompras() {
        VistaCompras.precios = new double [20];
        VistaCompras.productos = new String [20];
        VistaCompras.cantidades = new int [20];
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos();
    }
    public static void recuperar(){
        int j=0;    
        try{
            File f = new File("Compras.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                
                while((linea = br.readLine()) != null){
                    String[]  rec =  linea.split(";");
                
                    String valor1 = rec[0];
                    int valor2 = Integer.parseInt(rec[1]);
                    double valor3 = Double.parseDouble(rec[2]);
                
                    productos[j]=valor1;
                    cantidades[j]=valor2;
                    precios[j]=valor3;
                    j++;
                }
                fr.close();
            }
        }catch(IOException | NumberFormatException e){
            System.out.println(e);
        }
    }
    
    
    public void mostrarDatos (){
        recuperar();
        double total=0;
        int cant=0;
        for (int i=0; i<20;i++){
            cant=i+1;
            tFactura.setValueAt(""+cant,i,1);
            tFactura.setValueAt(productos[i],i,1);
            tFactura.setValueAt(cantidades[i],i,2);
            tFactura.setValueAt(precios[i],i,3);
            tFactura.setValueAt(precios[i]*cantidades[i],i,4);
            total+=(precios[i]*cantidades[i]);
            if (precios[i+1]==0)
                break;
        }
        lbltotal.setText(""+total);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tFactura = new javax.swing.JTable();
        salir1 = new Sistema.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N", "Descripción", "Cantidad", "Precio Unitario", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tFactura);
        if (tFactura.getColumnModel().getColumnCount() > 0) {
            tFactura.getColumnModel().getColumn(0).setPreferredWidth(35);
            tFactura.getColumnModel().getColumn(0).setMaxWidth(35);
            tFactura.getColumnModel().getColumn(1).setPreferredWidth(230);
            tFactura.getColumnModel().getColumn(1).setMaxWidth(230);
            tFactura.getColumnModel().getColumn(2).setPreferredWidth(70);
            tFactura.getColumnModel().getColumn(2).setMaxWidth(70);
            tFactura.getColumnModel().getColumn(3).setPreferredWidth(100);
            tFactura.getColumnModel().getColumn(3).setMaxWidth(100);
            tFactura.getColumnModel().getColumn(4).setPreferredWidth(70);
            tFactura.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 490, 350));

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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("←");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout salir1Layout = new javax.swing.GroupLayout(salir1);
        salir1.setLayout(salir1Layout);
        salir1Layout.setHorizontalGroup(
            salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salir1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        salir1Layout.setVerticalGroup(
            salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salir1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 32));

        lbltotal.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 60, 30));

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseClicked
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
 
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(VistaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltotal;
    private Sistema.PanelRound salir1;
    private javax.swing.JTable tFactura;
    // End of variables declaration//GEN-END:variables
}
