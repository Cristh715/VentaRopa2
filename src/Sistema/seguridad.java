/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author CRISTHIAN
 */
public class seguridad extends javax.swing.JFrame {
    public static String correos[];
    public static String contraseñas[];
    public seguridad() {
        seguridad.correos = new String [20];
        seguridad.contraseñas = new String [20];
        initComponents();
        setLocationRelativeTo(null);
        login.setCursor(new Cursor(HAND_CURSOR));
        salir.setCursor(new Cursor(HAND_CURSOR));
        this.setTitle("Login");
        recuperar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        Registrarse = new Sistema.PanelRound();
        txtl1 = new javax.swing.JLabel();
        login = new Sistema.PanelRound();
        txtl = new javax.swing.JLabel();
        lblc = new javax.swing.JLabel();
        sc = new javax.swing.JPanel();
        txtc = new javax.swing.JPasswordField();
        txtu = new javax.swing.JTextField();
        su = new javax.swing.JPanel();
        imgu = new javax.swing.JLabel();
        lblu = new javax.swing.JLabel();
        imgc = new javax.swing.JLabel();
        salir = new Sistema.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        salirp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        title.setText("INICIAR SESIÓN");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        Registrarse.setBackground(new java.awt.Color(2, 62, 138));
        Registrarse.setRoundBottomLeft(10);
        Registrarse.setRoundBottomRight(10);
        Registrarse.setRoundTopLeft(10);
        Registrarse.setRoundTopRight(10);
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegistrarseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RegistrarseMouseReleased(evt);
            }
        });
        Registrarse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtl1.setFont(new java.awt.Font("Dubai Medium", 0, 16)); // NOI18N
        txtl1.setForeground(new java.awt.Color(255, 255, 255));
        txtl1.setText("Registrarse");
        Registrarse.add(txtl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        getContentPane().add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 100, -1));

        login.setBackground(new java.awt.Color(2, 62, 138));
        login.setRoundBottomLeft(10);
        login.setRoundBottomRight(10);
        login.setRoundTopLeft(10);
        login.setRoundTopRight(10);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginMouseReleased(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtl.setFont(new java.awt.Font("Dubai Medium", 0, 16)); // NOI18N
        txtl.setForeground(new java.awt.Color(255, 255, 255));
        txtl.setText("Ingresar");
        login.add(txtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 60, 30));

        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 90, -1));

        lblc.setBackground(new java.awt.Color(0, 0, 0));
        lblc.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        lblc.setText("Contraseña");
        getContentPane().add(lblc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        sc.setBackground(new java.awt.Color(170, 170, 170));

        javax.swing.GroupLayout scLayout = new javax.swing.GroupLayout(sc);
        sc.setLayout(scLayout);
        scLayout.setHorizontalGroup(
            scLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        scLayout.setVerticalGroup(
            scLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, 1));

        txtc.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtc.setForeground(new java.awt.Color(204, 204, 204));
        txtc.setText("*******");
        txtc.setBorder(null);
        txtc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcFocusGained(evt);
            }
        });
        getContentPane().add(txtc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 275, 162, -1));

        txtu.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtu.setForeground(new java.awt.Color(204, 204, 204));
        txtu.setText("Ingrese su nombre de usuario");
        txtu.setBorder(null);
        txtu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtuFocusGained(evt);
            }
        });
        getContentPane().add(txtu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 185, 170, -1));

        su.setBackground(new java.awt.Color(170, 170, 170));

        javax.swing.GroupLayout suLayout = new javax.swing.GroupLayout(su);
        su.setLayout(suLayout);
        suLayout.setHorizontalGroup(
            suLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        suLayout.setVerticalGroup(
            suLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(su, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, 1));

        imgu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        getContentPane().add(imgu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        lblu.setBackground(new java.awt.Color(0, 0, 0));
        lblu.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        lblu.setText("Usuario");
        getContentPane().add(lblu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 70, -1));

        imgc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contraseña.png"))); // NOI18N
        getContentPane().add(imgc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        salir.setBackground(new java.awt.Color(230, 57, 70));
        salir.setRoundBottomLeft(15);
        salir.setRoundBottomRight(10);
        salir.setRoundTopLeft(10);
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
        });

        jPanel1.setBackground(new java.awt.Color(2, 62, 138));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 57, 70), 2, true));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        salirp.setForeground(new java.awt.Color(255, 255, 255));
        salirp.setText("×");
        jPanel1.add(salirp, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 20, 30));

        javax.swing.GroupLayout salirLayout = new javax.swing.GroupLayout(salir);
        salir.setLayout(salirLayout);
        salirLayout.setHorizontalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        salirLayout.setVerticalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 0, 35, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondox4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 438));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void recuperar(){
        int j=0;    
        try{
            File f = new File("Cuentas.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                
                while((linea = br.readLine()) != null){
                    String[]  rec =  linea.split(";");
                
                    String valor1 = rec[0];
                    String valor2 = rec[1];
                
                    correos[j]=valor1;
                    contraseñas[j]=valor2;
                    j++;
                }
                fr.close();
            }
        }catch(IOException | NumberFormatException e){
            System.out.println(e);
        }
    }
    
    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked
    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setBackground(Color.WHITE);
        salirp.setForeground(new Color(230,57,70));
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setBackground(new Color(230,57,70));
        salirp.setForeground(Color.WHITE);
    }//GEN-LAST:event_salirMouseExited
    boolean band;
    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        band = true;
        recuperar();
        if(comprobar(txtu.getText(),txtc.getText())){
            JOptionPane.showMessageDialog(this,"BIENVENIDO ESTIMADO USUARIO");
            Principal obj=new Principal();
            obj.setVisible(true);
            this.setVisible(false);
        }
        else if (band){
            JOptionPane.showMessageDialog(this,"Usuario y/o contraseña INCORRECTOS.");
            txtc.setText("");
        }
    }//GEN-LAST:event_loginMouseClicked
    boolean comprobar (String correo, String contraseña){
        boolean r=false;
        int i=0;
        if (correos[0]!=null){
            do{
               if(correo.equals(correos[i])&&contraseña.equals(contraseñas[i]))
                    r=true;
                i++;
                }
            while(!r && i<20);
        }else{
            JOptionPane.showMessageDialog(this,"No hay usuarios registrados.");
            band=false;
        }
        return r;
    }
    
    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(new Color(13, 88, 184));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(new Color(2,62,138));
    }//GEN-LAST:event_loginMouseExited

    private void txtcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcFocusGained
    if (String.valueOf(txtc.getPassword()).equals("*******")){
        txtc.setText("");
        txtc.setForeground(Color.black);
    }                                 
    if (txtu.getText().equals("")){
        txtu.setText("Ingrese su nombre de usuario");
        txtu.setForeground(new Color(204,204,204));
    }                             
    sc.setBackground(new Color(0,119,182));
    sc.setSize(160,2);
    su.setSize(160,1);
    su.setBackground (new Color(170,170,170));
    }//GEN-LAST:event_txtcFocusGained

    private void txtuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuFocusGained
        if (txtu.getText().equals("Ingrese su nombre de usuario")){
            txtu.setText("");
            txtu.setForeground(Color.black);
        }
        if (String.valueOf(txtc.getPassword()).equals("")){
            txtc.setText("*******");
            txtc.setForeground(new Color(204,204,204));
        }
        su.setBackground(new Color(0,119,182));
        su.setSize(160,2);
        sc.setSize(160,1);
        sc.setBackground(new Color(170,170,170));
    }//GEN-LAST:event_txtuFocusGained

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
        login.setBackground(new Color(5, 50, 107));
    }//GEN-LAST:event_loginMousePressed

    private void loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseReleased
        login.setBackground(new Color(2,62,138));
    }//GEN-LAST:event_loginMouseReleased

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        Registro re = new Registro();
        re.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void RegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseEntered
        Registrarse.setBackground(new Color(13, 88, 184));
    }//GEN-LAST:event_RegistrarseMouseEntered

    private void RegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarseMouseExited

    private void RegistrarseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarseMousePressed

    private void RegistrarseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarseMouseReleased

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
            java.util.logging.Logger.getLogger(seguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seguridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Sistema.PanelRound Registrarse;
    private javax.swing.JLabel imgc;
    private javax.swing.JLabel imgu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblc;
    private javax.swing.JLabel lblu;
    private Sistema.PanelRound login;
    private Sistema.PanelRound salir;
    private javax.swing.JLabel salirp;
    private javax.swing.JPanel sc;
    private javax.swing.JPanel su;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txtc;
    private javax.swing.JLabel txtl;
    private javax.swing.JLabel txtl1;
    private javax.swing.JTextField txtu;
    // End of variables declaration//GEN-END:variables
}
