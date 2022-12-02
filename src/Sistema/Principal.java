/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;
import java.awt.Color;
import javax.swing.JOptionPane;
import movimiento.MoverComp;

public class Principal extends javax.swing.JFrame {
    Color entrar = new Color(25,138,198);
    Color sale = new Color (0,119,182);
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Menú Principal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        lblMood1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        main = new javax.swing.JPanel();
        opciones = new Sistema.PanelRound();
        btnsm = new Sistema.PanelRound();
        lblm = new javax.swing.JLabel();
        inicio = new javax.swing.JPanel();
        lblinicio = new javax.swing.JLabel();
        lbli = new javax.swing.JLabel();
        favorito = new javax.swing.JPanel();
        lblfavorito = new javax.swing.JLabel();
        lblf = new javax.swing.JLabel();
        carrito = new javax.swing.JPanel();
        lblcarrito = new javax.swing.JLabel();
        lblc = new javax.swing.JLabel();
        configuracion = new javax.swing.JPanel();
        lblMood = new javax.swing.JLabel();
        lblconfiguracion = new javax.swing.JLabel();
        salir = new javax.swing.JPanel();
        lbls = new javax.swing.JLabel();
        lblsalir = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblpago2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        opz = new Sistema.PanelRound();
        lblz = new javax.swing.JLabel();
        opa = new Sistema.PanelRound();
        lbla = new javax.swing.JLabel();
        opp = new Sistema.PanelRound();
        lblp = new javax.swing.JLabel();
        opc = new Sistema.PanelRound();
        lblca = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblnz = new javax.swing.JLabel();
        lblnc = new javax.swing.JLabel();
        lblna = new javax.swing.JLabel();
        lblnp = new javax.swing.JLabel();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField3.setText("ZAPATILLAS");

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField4.setText("ZAPATILLAS");

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField2.setText("ZAPATILLAS");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.setText("ZAPATILLAS");

        lblMood1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMood1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zapatilla.png"))); // NOI18N
        lblMood1.setToolTipText("");

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 153, 204));
        jTextField5.setText("PRENDAS DISPONIBLES");
        jTextField5.setCaretColor(new java.awt.Color(0, 204, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMouseEntered(evt);
            }
        });
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opciones.setBackground(new java.awt.Color(0, 119, 182));
        opciones.setRoundBottomRight(30);
        opciones.setRoundTopRight(30);
        opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsm.setBackground(new java.awt.Color(10, 107, 158));
        btnsm.setRoundBottomLeft(45);
        btnsm.setRoundBottomRight(45);
        btnsm.setRoundTopLeft(45);
        btnsm.setRoundTopRight(45);
        btnsm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblm.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblm.setForeground(new java.awt.Color(255, 255, 255));
        lblm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblm.setText("≡");
        lblm.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblm.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblmMouseReleased(evt);
            }
        });
        btnsm.add(lblm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        opciones.add(btnsm, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 25, -1, -1));

        inicio.setBackground(new java.awt.Color(0, 119, 182));
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicioMouseExited(evt);
            }
        });
        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        inicio.add(lblinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 37, 35));

        lbli.setBackground(new java.awt.Color(255, 255, 255));
        lbli.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbli.setForeground(new java.awt.Color(255, 255, 255));
        lbli.setText("Inicio");
        inicio.add(lbli, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 18, -1, -1));

        opciones.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 60));

        favorito.setBackground(new java.awt.Color(0, 119, 182));
        favorito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoritoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                favoritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                favoritoMouseExited(evt);
            }
        });
        favorito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfavorito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favoritos.png"))); // NOI18N
        favorito.add(lblfavorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 37, 35));

        lblf.setBackground(new java.awt.Color(255, 255, 255));
        lblf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblf.setForeground(new java.awt.Color(255, 255, 255));
        lblf.setText("Favoritos");
        favorito.add(lblf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 18, -1, -1));

        opciones.add(favorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 60));

        carrito.setBackground(new java.awt.Color(0, 119, 182));
        carrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carritoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carritoMouseExited(evt);
            }
        });
        carrito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.png"))); // NOI18N
        carrito.add(lblcarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 37, 35));

        lblc.setBackground(new java.awt.Color(255, 255, 255));
        lblc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblc.setForeground(new java.awt.Color(255, 255, 255));
        lblc.setText("Carrito");
        carrito.add(lblc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 18, -1, -1));

        opciones.add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 60));

        configuracion.setBackground(new java.awt.Color(0, 119, 182));
        configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configuracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                configuracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                configuracionMouseExited(evt);
            }
        });
        configuracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMood.setBackground(new java.awt.Color(255, 255, 255));
        lblMood.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMood.setForeground(new java.awt.Color(255, 255, 255));
        lblMood.setText("Modo Oscuro");
        configuracion.add(lblMood, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, -1, -1));

        lblconfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mood.png"))); // NOI18N
        configuracion.add(lblconfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 15, 37, 35));

        opciones.add(configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 60));

        salir.setBackground(new java.awt.Color(0, 119, 182));
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
        salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbls.setBackground(new java.awt.Color(255, 255, 255));
        lbls.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbls.setForeground(new java.awt.Color(255, 255, 255));
        lbls.setText("Cerrar sesión");
        salir.add(lbls, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 18, -1, -1));

        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/csesion.png"))); // NOI18N
        salir.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 5, 37, 50));

        opciones.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 210, 60));

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pedidos FISI");
        opciones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 110, 30));

        main.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-125, 0, 210, 533));

        panelP.setBackground(new java.awt.Color(144, 224, 239));
        panelP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total a pagar:");
        panelP.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, -1, -1));

        lblpago2.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        lblpago2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelP.add(lblpago2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 76, 41));

        jLabel1.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel1.setText("S/.");
        panelP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 72, 37, -1));

        main.add(panelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 190, 130));

        opz.setBackground(new java.awt.Color(0, 150, 199));
        opz.setRoundBottomLeft(150);
        opz.setRoundBottomRight(150);
        opz.setRoundTopLeft(150);
        opz.setRoundTopRight(150);
        opz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblz.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zapatilla.png"))); // NOI18N
        lblz.setToolTipText("");
        lblz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblzMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblzMouseExited(evt);
            }
        });
        opz.add(lblz, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 151));

        main.add(opz, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 150, 150));

        opa.setBackground(new java.awt.Color(0, 150, 199));
        opa.setRoundBottomLeft(150);
        opa.setRoundBottomRight(150);
        opa.setRoundTopLeft(150);
        opa.setRoundTopRight(150);
        opa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrigo.png"))); // NOI18N
        lbla.setToolTipText("");
        lbla.setInheritsPopupMenu(false);
        lbla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblaMouseExited(evt);
            }
        });
        opa.add(lbla, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 154, -1));

        main.add(opa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 150, 150));

        opp.setBackground(new java.awt.Color(0, 150, 199));
        opp.setRoundBottomLeft(150);
        opp.setRoundBottomRight(150);
        opp.setRoundTopLeft(150);
        opp.setRoundTopRight(150);
        opp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pantalon.png"))); // NOI18N
        lblp.setToolTipText("");
        lblp.setInheritsPopupMenu(false);
        lblp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblpMouseExited(evt);
            }
        });
        opp.add(lblp, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 154, -1));

        main.add(opp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 150, 150));

        opc.setBackground(new java.awt.Color(0, 150, 199));
        opc.setRoundBottomLeft(160);
        opc.setRoundBottomRight(160);
        opc.setRoundTopLeft(160);
        opc.setRoundTopRight(160);
        opc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camisas.png"))); // NOI18N
        lblca.setToolTipText("");
        lblca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcaMouseExited(evt);
            }
        });
        opc.add(lblca, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 150, 150));

        main.add(opc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 150, 150));

        lbltitulo.setBackground(new java.awt.Color(0, 0, 0));
        lbltitulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbltitulo.setText("PRENDAS DISPONIBLES");
        lbltitulo.setToolTipText("");
        main.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("○");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("◉");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 21, 20));

        lblnz.setBackground(new java.awt.Color(0, 0, 0));
        lblnz.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        lblnz.setForeground(new java.awt.Color(13, 59, 102));
        lblnz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnz.setText("Zapatillas");
        main.add(lblnz, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 90, 30));

        lblnc.setBackground(new java.awt.Color(0, 0, 0));
        lblnc.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        lblnc.setForeground(new java.awt.Color(13, 59, 102));
        lblnc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnc.setText("Camisas");
        main.add(lblnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 90, 30));

        lblna.setBackground(new java.awt.Color(0, 0, 0));
        lblna.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        lblna.setForeground(new java.awt.Color(13, 59, 102));
        lblna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblna.setText("Abrigos");
        main.add(lblna, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 90, 30));

        lblnp.setBackground(new java.awt.Color(0, 0, 0));
        lblnp.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        lblnp.setForeground(new java.awt.Color(13, 59, 102));
        lblnp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnp.setText("Pantalones");
        main.add(lblnp, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 90, 30));

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 949, 533));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmMouseClicked
        if (opciones.getX()==-125)
            MoverComp.Derecha(opciones, 2, 1, 0);
        else
            MoverComp.Izquierda(opciones, 2, 1, -125);
    }//GEN-LAST:event_lblmMouseClicked

    private void lblmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmMousePressed
        if (lblMood.getText().equals("Modo Oscuro"))
            btnsm.setBackground(new Color(6,92,137));
        else
            btnsm.setBackground(new Color(55,55,55));
    }//GEN-LAST:event_lblmMousePressed

    private void lblmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmMouseReleased
        if (lblMood.getText().equals("Modo Oscuro"))
            btnsm.setBackground(new Color(10,107,158));
        else
            btnsm.setBackground(new Color(40,40,40));
    }//GEN-LAST:event_lblmMouseReleased

    private void inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseEntered
        inicio.setBackground(entrar);
    }//GEN-LAST:event_inicioMouseEntered

    private void inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseExited
        inicio.setBackground(sale);
    }//GEN-LAST:event_inicioMouseExited

    private void favoritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoMouseEntered
        favorito.setBackground(entrar);
    }//GEN-LAST:event_favoritoMouseEntered

    private void favoritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoMouseExited
        favorito.setBackground(sale);
    }//GEN-LAST:event_favoritoMouseExited

    private void carritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoMouseEntered
        carrito.setBackground(entrar);
    }//GEN-LAST:event_carritoMouseEntered

    private void carritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoMouseExited
        carrito.setBackground(sale);
    }//GEN-LAST:event_carritoMouseExited

    private void configuracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseEntered
        configuracion.setBackground(entrar);
    }//GEN-LAST:event_configuracionMouseEntered

    private void configuracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseExited
        configuracion.setBackground(sale);
    }//GEN-LAST:event_configuracionMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setBackground(entrar);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setBackground(sale);
    }//GEN-LAST:event_salirMouseExited
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void carritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoMouseClicked
        Carrito car=new Carrito();
        if (lblpago2.getText().equals("")||lblpago2.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún producto.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Carrito.lbltotal.setText(lblpago2.getText());
            car.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_carritoMouseClicked

    private void configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseClicked
        Color modo = null;
        Color bn = null;
        Color letras = null;
        if (lblMood.getText().equals("Modo Claro")){
            modo = new Color(0,119,182);
            bn = Color.BLACK;
            letras = new Color(13,59,102);
            main.setBackground(Color.WHITE);
            lblMood.setText("Modo Oscuro");  // nop
            btnsm.setBackground(new Color(10,107,158));
            panelP.setBackground(new Color(144,224,239));
            entrar = new Color(25,138,198);
            sale = new Color (0,119,182);
        }
        else{
            modo = new Color(27,27,27);
            bn = Color.WHITE;
            letras = Color.WHITE;
            main.setBackground(new Color(35,35,35));
            lblMood.setText("Modo Claro");
            btnsm.setBackground(new Color(40,40,40));
            panelP.setBackground(new Color(73,80,87));
            entrar = new Color(55,55,55);
            sale = new Color (27,27,27);
        }
        opciones.setBackground(modo);
        lbltitulo.setForeground(bn);
        inicio.setBackground(modo);
        carrito.setBackground(modo);
        favorito.setBackground(modo);
        configuracion.setBackground(modo);
        salir.setBackground(modo);
        jLabel1.setForeground(bn);
        jLabel2.setForeground(bn);
        lblpago2.setForeground(bn);
        lblnz.setForeground(letras);
        lblnc.setForeground(letras);
        lblna.setForeground(letras);
        lblnp.setForeground(letras);
    }//GEN-LAST:event_configuracionMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        seguridad s=new seguridad();
        if(JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir?", "Alerta!", JOptionPane.YES_NO_OPTION)==0){
            s.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_salirMouseClicked

    private void lblcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcaMouseClicked
        Productos obj=new Productos();
        obj.setVisible(true);
        this.setVisible(false);
        obj.tipoP(2);
        obj.producto1(2);
        obj.producto2(2);
        obj.producto3(2);
    }//GEN-LAST:event_lblcaMouseClicked

    private void lblcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcaMouseEntered
        MoverComp.Arriba(opc, 7, 1, 315);
        MoverComp.Arriba(lblnc, 1, 1, 280);
    }//GEN-LAST:event_lblcaMouseEntered

    private void lblcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcaMouseExited
        MoverComp.Abajo(opc, 7, 1, 330);
        MoverComp.Abajo(lblnc, 1, 1, 350);
    }//GEN-LAST:event_lblcaMouseExited

    private void lblzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblzMouseExited
        MoverComp.Abajo(opz, 5, 1, 330);
        MoverComp.Abajo(lblnz, 1, 1, 350);
    }//GEN-LAST:event_lblzMouseExited

    private void lblzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblzMouseEntered
        MoverComp.Arriba(opz, 7, 1, 315);
        MoverComp.Arriba(lblnz, 1, 1, 280);
    }//GEN-LAST:event_lblzMouseEntered

    private void lblzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblzMouseClicked
        Productos obj=new Productos();
        obj.tipoP(0);
        obj.producto1(0);
        obj.producto2(0);
        obj.producto3(0);
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblzMouseClicked

    private void lblaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblaMouseClicked
        Productos obj=new Productos();
        obj.setVisible(true);
        this.setVisible(false);
        obj.tipoP(3);
        obj.producto1(3);
        obj.producto2(3);
        obj.producto3(3);
    }//GEN-LAST:event_lblaMouseClicked

    private void lblaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblaMouseEntered
        MoverComp.Arriba(opa, 7, 1, 315);
        MoverComp.Arriba(lblna, 1, 1, 280);
    }//GEN-LAST:event_lblaMouseEntered

    private void lblaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblaMouseExited
        MoverComp.Abajo(opa, 7, 1, 330);
        MoverComp.Abajo(lblna, 1, 1, 350);
    }//GEN-LAST:event_lblaMouseExited

    private void lblpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpMouseClicked
        Productos obj=new Productos();
        obj.setVisible(true);
        this.setVisible(false);
        obj.tipoP(1);
        obj.producto1(1);
        obj.producto2(1);
        obj.producto3(1);
    }//GEN-LAST:event_lblpMouseClicked

    private void lblpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpMouseEntered
        MoverComp.Arriba(opp, 7, 1, 315);
        MoverComp.Arriba(lblnp, 1, 1, 280);
    }//GEN-LAST:event_lblpMouseEntered

    private void lblpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpMouseExited
        MoverComp.Abajo(opp, 7, 1, 330);
        MoverComp.Abajo(lblnp, 1, 1, 350);
    }//GEN-LAST:event_lblpMouseExited

    private void mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseClicked
        if (opciones.getX()==0)
            MoverComp.Izquierda(opciones, 2, 1, -125);
    }//GEN-LAST:event_mainMouseClicked

    private void mainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseEntered
        MoverComp.Abajo(opp, 7, 1, 330);
        MoverComp.Abajo(lblnp, 1, 1, 350);
        MoverComp.Abajo(opa, 7, 1, 330);
        MoverComp.Abajo(lblna, 1, 1, 350);
        MoverComp.Abajo(opz, 5, 1, 330);
        MoverComp.Abajo(lblnz, 1, 1, 350);
        MoverComp.Abajo(opc, 7, 1, 330);
        MoverComp.Abajo(lblnc, 1, 1, 350);
    }//GEN-LAST:event_mainMouseEntered

    private void favoritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoMouseClicked
        JOptionPane.showMessageDialog(null, "Muy pronto, por implementar...");
    }//GEN-LAST:event_favoritoMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Sistema.PanelRound btnsm;
    private javax.swing.JPanel carrito;
    private javax.swing.JPanel configuracion;
    private javax.swing.JPanel favorito;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblMood;
    private javax.swing.JLabel lblMood1;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblc;
    private javax.swing.JLabel lblca;
    private javax.swing.JLabel lblcarrito;
    private javax.swing.JLabel lblconfiguracion;
    private javax.swing.JLabel lblf;
    private javax.swing.JLabel lblfavorito;
    private javax.swing.JLabel lbli;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblm;
    private javax.swing.JLabel lblna;
    private javax.swing.JLabel lblnc;
    private javax.swing.JLabel lblnp;
    private javax.swing.JLabel lblnz;
    private javax.swing.JLabel lblp;
    public static javax.swing.JLabel lblpago2;
    private javax.swing.JLabel lbls;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblz;
    private javax.swing.JPanel main;
    private Sistema.PanelRound opa;
    private Sistema.PanelRound opc;
    private Sistema.PanelRound opciones;
    private Sistema.PanelRound opp;
    private Sistema.PanelRound opz;
    private javax.swing.JPanel panelP;
    private javax.swing.JPanel salir;
    // End of variables declaration//GEN-END:variables
}
