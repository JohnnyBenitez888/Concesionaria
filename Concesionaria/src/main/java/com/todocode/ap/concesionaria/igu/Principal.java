package com.todocode.ap.concesionaria.igu;

/**
 *
 * @author Johnny
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        PanelFondo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        btnAltas = new javax.swing.JButton();
        btnBajas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelFondo.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        labelTitulo.setText("Venta de Automóviles");

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/auto (1).png"))); // NOI18N

        btnAltas.setBackground(new java.awt.Color(51, 51, 51));
        btnAltas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAltas.setForeground(new java.awt.Color(255, 255, 255));
        btnAltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/frenteAuto (40x40).png"))); // NOI18N
        btnAltas.setText("Alta de Automóviles");
        btnAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltasActionPerformed(evt);
            }
        });

        btnBajas.setBackground(new java.awt.Color(51, 51, 51));
        btnBajas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBajas.setForeground(new java.awt.Color(255, 255, 255));
        btnBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/consulta(40x40).png"))); // NOI18N
        btnBajas.setText("Consulta, Edición y Baja");
        btnBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajasActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salir(40x40).png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelTitulo)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(labelIcon))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON SALIR---------------------------------------------------------------
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    //BOTON ALTA----------------------------------------------------------------
    private void btnAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltasActionPerformed
        Alta alta = new Alta();
        alta.setVisible(true);
        alta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAltasActionPerformed

    //BOTON CONSULTA Y EDICION--------------------------------------------------
    private void btnBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajasActionPerformed
        VerAutos ver = new VerAutos();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBajasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton btnAltas;
    private javax.swing.JButton btnBajas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
