/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;
import Clases.Carrito1;
import Clases.Compras;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import movimiento.MoverComp;

/**
 *
 * @author CRISTHIAN
 */
public class Productos extends javax.swing.JFrame {
    Color entrar = new Color(25,138,198);
    Color sale = new Color (0,119,182);
    int cantidad=0;
    public Productos() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Productos");
    }
   public void tipoP(int orden1){
        orden=orden1;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        lblsalir = new javax.swing.JLabel();
        lbls = new javax.swing.JLabel();
        panelP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblpago = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        salir1 = new Sistema.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        product1 = new javax.swing.JPanel();
        lblp1 = new javax.swing.JLabel();
        lblimg1 = new javax.swing.JLabel();
        product2 = new javax.swing.JPanel();
        lblp2 = new javax.swing.JLabel();
        lblimg2 = new javax.swing.JLabel();
        product3 = new javax.swing.JPanel();
        lblp3 = new javax.swing.JLabel();
        lblimg3 = new javax.swing.JLabel();
        chk1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        chk2 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        mas = new javax.swing.JLabel();
        menos = new javax.swing.JLabel();
        btnmas = new javax.swing.JButton();
        btnmenos = new javax.swing.JButton();
        cant = new javax.swing.JTextField();
        menos1 = new javax.swing.JLabel();
        mas1 = new javax.swing.JLabel();
        btnmas1 = new javax.swing.JButton();
        btnmenos1 = new javax.swing.JButton();
        cant1 = new javax.swing.JTextField();
        mas2 = new javax.swing.JLabel();
        menos2 = new javax.swing.JLabel();
        btnmas2 = new javax.swing.JButton();
        btnmenos2 = new javax.swing.JButton();
        cant2 = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainMouseClicked(evt);
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
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

        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/csesion.png"))); // NOI18N
        salir.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 37, 35));

        lbls.setBackground(new java.awt.Color(255, 255, 255));
        lbls.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbls.setForeground(new java.awt.Color(255, 255, 255));
        lbls.setText("Cerrar sesión");
        salir.add(lbls, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 18, -1, -1));

        opciones.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 210, 60));

        main.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-125, 0, 210, 533));

        panelP.setBackground(new java.awt.Color(144, 224, 239));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total a pagar:");

        lblpago.setFont(new java.awt.Font("HP Simplified Jpan Light", 0, 24)); // NOI18N
        lblpago.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("HP Simplified Jpan Light", 0, 24)); // NOI18N
        jLabel3.setText("S/.");

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblpago, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpago, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        main.add(panelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, 100));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel7.add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 32));

        product1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product1.add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 170, 70, 21));

        lblimg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblimg1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblimg1MouseExited(evt);
            }
        });
        product1.add(lblimg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 19, 140, 140));

        jPanel7.add(product1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 180, 200));

        product2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product2.add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 21));

        lblimg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblimg2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblimg2MouseExited(evt);
            }
        });
        product2.add(lblimg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 140));

        jPanel7.add(product2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 180, 200));

        product3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product3.add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 21));

        lblimg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblimg3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblimg3MouseExited(evt);
            }
        });
        product3.add(lblimg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 140));

        jPanel7.add(product3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 180, 200));

        chk1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chk1.setText("Agregar");
        jPanel7.add(chk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Agregar al carrito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 150, 40));

        chk2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chk2.setText("Agregar");
        jPanel7.add(chk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        chk3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chk3.setText("Agregar");
        jPanel7.add(chk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        mas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mas.setForeground(new java.awt.Color(0, 0, 0));
        mas.setText("+");
        jPanel7.add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 355, -1, 20));

        menos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        menos.setForeground(new java.awt.Color(0, 0, 0));
        menos.setText("-");
        jPanel7.add(menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 355, -1, 20));

        btnmas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmasMouseClicked(evt);
            }
        });
        jPanel7.add(btnmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 30, 30));

        btnmenos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenosMouseClicked(evt);
            }
        });
        jPanel7.add(btnmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 30, 30));

        cant.setText("0");
        jPanel7.add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 352, 30, -1));

        menos1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        menos1.setForeground(new java.awt.Color(0, 0, 0));
        menos1.setText("-");
        jPanel7.add(menos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 355, -1, 20));

        mas1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mas1.setForeground(new java.awt.Color(0, 0, 0));
        mas1.setText("+");
        jPanel7.add(mas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 355, -1, 20));

        btnmas1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmas1MouseClicked(evt);
            }
        });
        jPanel7.add(btnmas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 30, 30));

        btnmenos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmenos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenos1MouseClicked(evt);
            }
        });
        jPanel7.add(btnmenos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 30, 30));

        cant1.setText("0");
        jPanel7.add(cant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 352, 30, -1));

        mas2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mas2.setForeground(new java.awt.Color(0, 0, 0));
        mas2.setText("+");
        jPanel7.add(mas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 355, -1, 20));

        menos2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        menos2.setForeground(new java.awt.Color(0, 0, 0));
        menos2.setText("-");
        jPanel7.add(menos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 355, -1, 20));

        btnmas2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmas2MouseClicked(evt);
            }
        });
        jPanel7.add(btnmas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 30, 30));

        btnmenos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmenos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenos2MouseClicked(evt);
            }
        });
        jPanel7.add(btnmenos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 30, 30));

        cant2.setText("0");
        jPanel7.add(cant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 352, 30, -1));
        jPanel7.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 150, 40));
        jPanel7.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 150, 40));
        jPanel7.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 150, 40));

        main.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 730, 470));

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
    double total=0;
    int orden;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean p1=chk1.isSelected(),p2=chk2.isSelected(),p3=chk3.isSelected();
        Integer.parseInt(cant1.getText());
        lblpago.setText(""+hallarTotal(orden, p1, p2, p3, Integer.parseInt(cant.getText()),Integer.parseInt(cant1.getText()),Integer.parseInt(cant2.getText())));
        chk1.setSelected(false);
        chk2.setSelected(false);
        chk3.setSelected(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed
 
    double hallarTotal (int orden, boolean p1, boolean p2, boolean p3, int c, int c1, int c2){
        Carrito1 obj=new Carrito1();
        Compras obj2 = new Compras();
        double subt=0, totalc=0, totalz=0,totala=0, totalp=0;
        
        if (p1){
            subt += precio1*c;
            cantidad++;
            obj2.setDatos(precio1, c, lbl1.getText());
        }
        if (p2){
            subt += precio2*c1;
            cantidad++;
            obj2.setDatos(precio2, c1, lbl2.getText());
        }
        if (p3){
            subt += precio3*c2;
            cantidad++;
            obj2.setDatos(precio3, c2, lbl3.getText());
        }
        switch(orden){
            case 0: totalz += subt;
                    obj.setSubTotal(totalz, orden);break;
            case 1: totalp += subt;
                    obj.setSubTotal(totalp, orden);break;
            case 2: totalc += subt;
                    obj.setSubTotal(totalc, orden);break;
            case 3: totala += subt;
                    obj.setSubTotal(totala, orden);break;
        }
        total = obj.totalPago();
        return total;
    }
    private void salir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseClicked
        Principal obj=new Principal();
        Principal.lblpago2.setText(lblpago.getText());
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

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        seguridad s=new seguridad();
        if(JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir?", "Alerta!", JOptionPane.YES_NO_OPTION)==0){
            s.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_salirMouseClicked

    private void carritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoMouseClicked
        Carrito car=new Carrito();
        if (lblpago.getText().equals("")||lblpago.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún producto.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Carrito.lbltotal.setText(lblpago.getText());
            car.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_carritoMouseClicked

    private void configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseClicked
        Color modo = null;
        Color bn = null;
        if (lblMood.getText().equals("Modo Claro")){
            modo = new Color(0,119,182);
            bn = Color.BLACK;
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
            main.setBackground(new Color(35,35,35));
            lblMood.setText("Modo Claro");
            btnsm.setBackground(new Color(40,40,40));
            panelP.setBackground(new Color(73,80,87));
            entrar = new Color(55,55,55);
            sale = new Color (27,27,27);
        }
        opciones.setBackground(modo);
        inicio.setBackground(modo);
        carrito.setBackground(modo);
        favorito.setBackground(modo);
        configuracion.setBackground(modo);
        salir.setBackground(modo);
        chk1.setForeground(bn);
        chk2.setForeground(bn);
        chk3.setForeground(bn);
        jLabel2.setForeground(bn);
        jLabel3.setForeground(bn);
        lblpago.setForeground(bn);
    }//GEN-LAST:event_configuracionMouseClicked

    private void mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseClicked
        if (opciones.getX()==0)
            MoverComp.Izquierda(opciones, 2, 1, -125);
    }//GEN-LAST:event_mainMouseClicked

    private void lblimg1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg1MouseEntered
        ImageIcon imagen1 = null;
        switch(orden){
            case 0:
                imagen1 = new ImageIcon(this.getClass().getResource("/imgProductos/zap1.jpg"));break;
            case 1:
                imagen1 = new ImageIcon(this.getClass().getResource("/imgProductos/pan1.jpg"));break;
            case 2:
                imagen1 = new ImageIcon(this.getClass().getResource("/imgProductos/cam1.jpg"));break;
            case 3:
                imagen1 = new ImageIcon(this.getClass().getResource("/imgProductos/abr1.jpg"));break;
        }
        lblimg1.setIcon(imagen1);
    }//GEN-LAST:event_lblimg1MouseEntered

    private void lblimg1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg1MouseExited
        producto1 (orden);
    }//GEN-LAST:event_lblimg1MouseExited
    int canti=0, canti1=0, canti2=0;
    private void btnmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmasMouseClicked
        if (canti<10){
            canti++;
            cant.setText(""+canti);
        }else{
            JOptionPane.showMessageDialog(null, "Máximo de pedidos alcanzado.", "Máximo de pedido alcanzado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnmasMouseClicked

    private void btnmenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenosMouseClicked
        if (canti>0){
            canti--;
            cant.setText(""+canti);
        }
    }//GEN-LAST:event_btnmenosMouseClicked

    private void btnmas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmas1MouseClicked
        if (canti1<10){
            canti1++;
            cant1.setText(""+canti1);
        }else{
            JOptionPane.showMessageDialog(null, "Máximo de pedidos alcanzado.", "Máximo de pedido alcanzado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnmas1MouseClicked

    private void btnmenos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenos1MouseClicked
        if (canti1>0){
            canti1--;
            cant1.setText(""+canti1);
        }
    }//GEN-LAST:event_btnmenos1MouseClicked

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        Principal p=new Principal();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inicioMouseClicked

    private void favoritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoMouseClicked
        JOptionPane.showMessageDialog(null, "Muy pronto, por implementar...");
    }//GEN-LAST:event_favoritoMouseClicked

    private void lblimg2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg2MouseEntered
        ImageIcon imagen2 = null;
        switch(orden){
            case 0:
                imagen2 = new ImageIcon(this.getClass().getResource("/imgProductos/zapatilla2.1.jpg"));break;
            case 1:
                imagen2 = new ImageIcon(this.getClass().getResource("/imgProductos/pan2.jpg"));break;
            case 2:
                imagen2 = new ImageIcon(this.getClass().getResource("/imgProductos/cam2.jpg"));break;
            case 3:
                imagen2 = new ImageIcon(this.getClass().getResource("/imgProductos/abr2.jpg"));break;
        }
        lblimg2.setIcon(imagen2);
    }//GEN-LAST:event_lblimg2MouseEntered

    private void lblimg2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg2MouseExited
        producto2 (orden);
    }//GEN-LAST:event_lblimg2MouseExited

    private void lblimg3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg3MouseEntered
        ImageIcon imagen3 = null;
        switch(orden){
            case 0:
                imagen3 = new ImageIcon(this.getClass().getResource("/imgProductos/zapatilla3.1.jpg"));break;
            case 1:
                imagen3 = new ImageIcon(this.getClass().getResource("/imgProductos/pan3.jpg"));break;
            case 2:
                imagen3 = new ImageIcon(this.getClass().getResource("/imgProductos/cam3.jpg"));break;
            case 3:
                imagen3 = new ImageIcon(this.getClass().getResource("/imgProductos/abr3.jpg"));break;
        }
        lblimg3.setIcon(imagen3);
    }//GEN-LAST:event_lblimg3MouseEntered

    private void lblimg3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg3MouseExited
        producto3 (orden);
    }//GEN-LAST:event_lblimg3MouseExited

    private void btnmas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmas2MouseClicked
        if (canti2<10){
            canti2++;
            cant2.setText(""+canti2);
        }else{
            JOptionPane.showMessageDialog(null, "Máximo de pedidos alcanzado.", "Máximo de pedido alcanzado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnmas2MouseClicked

    private void btnmenos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenos2MouseClicked
        if (canti2>0){
            canti2--;
            cant2.setText(""+canti2);
        }
    }//GEN-LAST:event_btnmenos2MouseClicked
    //Declaración de variables globales
    double precio1=0;
    double precio2=0;
    double precio3=0;
    
    public void producto1 (int orden){
        Carrito1 obj=new Carrito1();
        total = obj.totalPago();
        lblpago.setText(""+total);
        ImageIcon imagen1 = null;
        DecimalFormat formato1 = new DecimalFormat("#.00");
        switch(orden){
            case 0:
                precio1=150.00;
                imagen1 = new ImageIcon(this.getClass().getResource("/imgProductos/Zapatilla1.jpg"));
                lbl1.setText("Zapatilla Nike BlackModel");break;
            case 1:
                precio1=159.0;
                imagen1 = new ImageIcon(this.getClass().getResource("/imgProductos/pantalon1.jpg"));
                lbl1.setText("Pantalón Hip Hop Negro");break;
            case 2:
                precio1=70.0;
                imagen1 = new ImageIcon(this.getClass().getResource("/imgProductos/camisa1.jpg"));
                lbl1.setText("Camisa cuadrados Azules");break;
            case 3:
                precio1=249.0;
                imagen1 = new ImageIcon(this.getClass().getResource("/imgProductos/abrigo1.jpg"));
                lbl1.setText("Abrigo de piel de Oso");break;
        }
        lblimg1.setIcon(imagen1);
        lblp1.setText("S/ "+String.format("%.2f", precio1));
    }
    public void producto2 (int orden){
        ImageIcon imagen2 = null;
        switch(orden){
            case 0:
                precio2=120.00;
                imagen2 = new ImageIcon(this.getClass().getResource("/imgProductos/Zapatilla2.jpg"));
                lbl2.setText("Zapatilla Nike WhiteModel");break;
            case 1:
                precio2=139.0;
                imagen2 = new ImageIcon(this.getClass().getResource("/imgProductos/pantalon2.jpg"));
                lbl2.setText("Pantalón apegado Negro");break;
            case 2:
                precio2=120.0;
                imagen2 = new ImageIcon(this.getClass().getResource("/imgProductos/camisa2.jpg"));
                lbl2.setText("Camisa Salmón para hombre");break;
            case 3:
                precio2=270.0;
                imagen2 = new ImageIcon(this.getClass().getResource("/imgProductos/abrigo2.jpg"));
                lbl2.setText("Abrigo Sueco Negro Algodón");break;
        }
        lblimg2.setIcon(imagen2);
        lblp2.setText("S/ "+String.format("%.2f", precio2));
    }
    public void producto3 (int orden){
        ImageIcon imagen3 = null;
        switch(orden){
            case 0:
                precio3=200.0;
                imagen3 = new ImageIcon(this.getClass().getResource("/imgProductos/Zapatilla3.jpg"));
                lbl3.setText("Zapatilla Nike BlackBerry");break;
            case 1:
                precio3=209.0;
                imagen3 = new ImageIcon(this.getClass().getResource("/imgProductos/pantalon3.jpg"));
                lbl3.setText("Pantalón Jean rasgado Mujer");break;
            case 2:
                precio3=100.0;
                imagen3 = new ImageIcon(this.getClass().getResource("/imgProductos/camisa3.jpg"));
                lbl3.setText("Camisa profesional Celeste");break;
            case 3:
                precio3=230.0;
                imagen3 = new ImageIcon(this.getClass().getResource("/imgProductos/abrigo3.jpg"));
                lbl3.setText("Abrigo de invierno Rojo");break;
        }
        lblimg3.setIcon(imagen3);
        lblp3.setText("S/ "+String.format("%.2f", precio3));
    }
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmas;
    private javax.swing.JButton btnmas1;
    private javax.swing.JButton btnmas2;
    private javax.swing.JButton btnmenos;
    private javax.swing.JButton btnmenos1;
    private javax.swing.JButton btnmenos2;
    private Sistema.PanelRound btnsm;
    private javax.swing.JTextField cant;
    private javax.swing.JTextField cant1;
    private javax.swing.JTextField cant2;
    private javax.swing.JPanel carrito;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JPanel configuracion;
    private javax.swing.JPanel favorito;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblMood;
    private javax.swing.JLabel lblc;
    private javax.swing.JLabel lblcarrito;
    private javax.swing.JLabel lblconfiguracion;
    private javax.swing.JLabel lblf;
    private javax.swing.JLabel lblfavorito;
    private javax.swing.JLabel lbli;
    private javax.swing.JLabel lblimg1;
    private javax.swing.JLabel lblimg2;
    private javax.swing.JLabel lblimg3;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblm;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblpago;
    private javax.swing.JLabel lbls;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JPanel main;
    private javax.swing.JLabel mas;
    private javax.swing.JLabel mas1;
    private javax.swing.JLabel mas2;
    private javax.swing.JLabel menos;
    private javax.swing.JLabel menos1;
    private javax.swing.JLabel menos2;
    private Sistema.PanelRound opciones;
    private javax.swing.JPanel panelP;
    private javax.swing.JPanel product1;
    private javax.swing.JPanel product2;
    private javax.swing.JPanel product3;
    private javax.swing.JPanel salir;
    private Sistema.PanelRound salir1;
    // End of variables declaration//GEN-END:variables
}
