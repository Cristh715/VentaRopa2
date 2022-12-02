/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Clases.Cuentas;
/**
 *
 * @author CRISTHIAN
 */
public class Registro extends javax.swing.JFrame {
    seguridad s;
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Registro");
        txtc.setEditable(false);
        txtcon.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        salir = new Sistema.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        lblr = new javax.swing.JLabel();
        nombre = new Sistema.PanelRound();
        panelRound2 = new Sistema.PanelRound();
        txtn = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();
        apellido = new Sistema.PanelRound();
        panelRound3 = new Sistema.PanelRound();
        txta = new javax.swing.JTextField();
        lblimage1 = new javax.swing.JLabel();
        dni = new Sistema.PanelRound();
        panelRound4 = new Sistema.PanelRound();
        txtd = new javax.swing.JTextField();
        lblimage2 = new javax.swing.JLabel();
        btnre = new javax.swing.JButton();
        txtc = new javax.swing.JTextField();
        txtcon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(247, 247, 247));
        fondo.setPreferredSize(new java.awt.Dimension(500, 530));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(247, 247, 247));
        salir.setForeground(new java.awt.Color(204, 204, 204));
        salir.setRoundBottomLeft(30);
        salir.setRoundBottomRight(30);
        salir.setRoundTopLeft(30);
        salir.setRoundTopRight(30);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                salirMouseReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("←");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout salirLayout = new javax.swing.GroupLayout(salir);
        salir.setLayout(salirLayout);
        salirLayout.setHorizontalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salirLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        salirLayout.setVerticalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fondo.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 31, -1, -1));

        lblr.setBackground(new java.awt.Color(51, 51, 51));
        lblr.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblr.setForeground(new java.awt.Color(102, 102, 102));
        lblr.setText("REGISTRO");
        fondo.add(lblr, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 31, -1, -1));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setRoundBottomLeft(25);
        nombre.setRoundBottomRight(25);
        nombre.setRoundTopLeft(25);
        nombre.setRoundTopRight(25);
        nombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(25);
        panelRound2.setRoundBottomRight(25);
        panelRound2.setRoundTopLeft(25);
        panelRound2.setRoundTopRight(25);

        txtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtn.setForeground(new java.awt.Color(193, 193, 193));
        txtn.setText("Nombres");
        txtn.setBorder(null);
        txtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnFocusGained(evt);
            }
        });

        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario1.png"))); // NOI18N

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblimage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtn, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(lblimage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        nombre.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 303, 34));

        fondo.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 86, 307, 38));

        apellido.setBackground(new java.awt.Color(255, 255, 255));
        apellido.setRoundBottomLeft(25);
        apellido.setRoundBottomRight(25);
        apellido.setRoundTopLeft(25);
        apellido.setRoundTopRight(25);
        apellido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(25);
        panelRound3.setRoundBottomRight(25);
        panelRound3.setRoundTopLeft(25);
        panelRound3.setRoundTopRight(25);

        txta.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txta.setForeground(new java.awt.Color(193, 193, 193));
        txta.setText("Apellidos");
        txta.setBorder(null);
        txta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaFocusGained(evt);
            }
        });

        lblimage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario1.png"))); // NOI18N

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblimage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txta, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        apellido.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        fondo.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 136, 307, 38));

        dni.setBackground(new java.awt.Color(255, 255, 255));
        dni.setRoundBottomLeft(25);
        dni.setRoundBottomRight(25);
        dni.setRoundTopLeft(25);
        dni.setRoundTopRight(25);
        dni.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(25);
        panelRound4.setRoundBottomRight(25);
        panelRound4.setRoundTopLeft(25);
        panelRound4.setRoundTopRight(25);

        txtd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtd.setForeground(new java.awt.Color(193, 193, 193));
        txtd.setText("DNI");
        txtd.setBorder(null);
        txtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdFocusGained(evt);
            }
        });

        lblimage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dni.png"))); // NOI18N

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblimage2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtd, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dni.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 305, -1));

        fondo.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 185, 309, 38));

        btnre.setBackground(new java.awt.Color(0, 180, 216));
        btnre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnre.setForeground(new java.awt.Color(255, 255, 255));
        btnre.setText("Registrar");
        btnre.setBorder(null);
        btnre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreMouseClicked(evt);
            }
        });
        fondo.add(btnre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 110, 30));

        txtc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fondo.add(txtc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 210, -1));
        fondo.add(txtcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 210, -1));

        jLabel2.setText("Contraseña");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jLabel3.setText("Correo;");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setBackground(new Color(231,231,231));       
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setBackground(new Color(247,247,247)); 
    }//GEN-LAST:event_salirMouseExited

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        salir.setBackground(new Color(204,204,204)); 
    }//GEN-LAST:event_salirMousePressed

    private void salirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseReleased
        salir.setBackground(new Color(247,247,247));
    }//GEN-LAST:event_salirMouseReleased

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        seguridad s = new seguridad();
        this.setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_salirMouseClicked
    String nombres,apellidos, correo, contraseña;

    private void btnreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreMouseClicked
        Cuentas datos=new Cuentas ();
        nombres=txtn.getText();
        apellidos=txta.getText();
        contraseña=txtd.getText();
        crear(nombres, apellidos);
        try{
            datos.setDatos(correo, contraseña);
            txtc.setText(correo);
            txtcon.setText(contraseña);
            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.","Confirmación", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de registro de usuario.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnreMouseClicked

     
    private void txtaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaFocusGained
        apellidoe();nombrea();dnia();
    }//GEN-LAST:event_txtaFocusGained

    private void txtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnFocusGained
        nombree();apellidoa();dnia();
    }//GEN-LAST:event_txtnFocusGained

    private void txtdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdFocusGained
        dnie(); nombrea();apellidoa();
    }//GEN-LAST:event_txtdFocusGained

    private void dnie(){
        ImageIcon imagen1 = new ImageIcon(this.getClass().getResource("/imagenes/dni1.png")); 
        dni.setBackground(new Color(0,180,216));
        lblimage2.setIcon(imagen1);
        if (txtd.getText().equals("DNI")){
            txtd.setText("");
            txtd.setForeground(Color.black);
        }
    }
    private void dnia(){
        ImageIcon imagen3 = new ImageIcon(this.getClass().getResource("/imagenes/dni.png")); 
        dni.setBackground(Color.WHITE);
        lblimage2.setIcon(imagen3);
        if (txtd.getText().equals("")){
            txtd.setText("DNI");
            txtd.setForeground(new Color(193,193,193));
        }
    }
    private void apellidoe (){
        ImageIcon imagen1 = new ImageIcon(this.getClass().getResource("/imagenes/usuario2.png")); 
        apellido.setBackground(new Color(0,180,216));
        lblimage1.setIcon(imagen1);
        if (txta.getText().equals("Apellidos")){
            txta.setText("");
            txta.setForeground(Color.black);
        }    
    }
    private void apellidoa (){
        ImageIcon imagen2 = new ImageIcon(this.getClass().getResource("/imagenes/usuario1.png"));
        apellido.setBackground(Color.WHITE);
        lblimage1.setIcon(imagen2);
        if (txta.getText().equals("")){
            txta.setText("Apellidos");
            txta.setForeground(new Color(193,193,193));
        }
    }
    private void nombree(){
        ImageIcon imagen1 = new ImageIcon(this.getClass().getResource("/imagenes/usuario2.png"));
            nombre.setBackground(new Color(0,180,216));
            lblimage.setIcon(imagen1);
            if (txtn.getText().equals("Nombres")){
                txtn.setText("");
                txtn.setForeground(Color.black);
            }
    }
    private void nombrea(){
        ImageIcon imagen2 = new ImageIcon(this.getClass().getResource("/imagenes/usuario1.png"));
        nombre.setBackground(Color.WHITE);
        lblimage.setIcon(imagen2);
        if (txtn.getText().equals("")){
            txtn.setText("Nombres");
            txtn.setForeground(new Color(193,193,193));
        }
    }
    void crear(String nombre, String apellido){
        String [] nom;
        String [] apell;
        nom=nombre.split("\\s+");
        apell=apellido.split("\\s+");
        correo=(nom[0]+"."+apell[0]);

    }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Sistema.PanelRound apellido;
    private javax.swing.JButton btnre;
    private Sistema.PanelRound dni;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblimage1;
    private javax.swing.JLabel lblimage2;
    private javax.swing.JLabel lblr;
    private Sistema.PanelRound nombre;
    private Sistema.PanelRound panelRound2;
    private Sistema.PanelRound panelRound3;
    private Sistema.PanelRound panelRound4;
    private Sistema.PanelRound salir;
    private javax.swing.JTextField txta;
    public static javax.swing.JTextField txtc;
    private javax.swing.JTextField txtcon;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txtn;
    // End of variables declaration//GEN-END:variables
}
