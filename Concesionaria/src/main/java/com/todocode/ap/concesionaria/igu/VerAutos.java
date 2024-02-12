package com.todocode.ap.concesionaria.igu;

import com.todocode.ap.concesionaria.logica.Automovil;
import com.todocode.ap.concesionaria.logica.Controladora;
import java.util.List;
import javax.swing.table.DefaultTableModel;

 
public class VerAutos extends javax.swing.JFrame {

    
    Controladora control = null;
    
    public VerAutos() {
        initComponents();
        this.control = new Controladora();
        cargarTabla();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        labelSubTitulo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        labelTitulo.setText("Visualización de Autos");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setBackground(new java.awt.Color(51, 51, 51));
        tabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        labelSubTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSubTitulo.setForeground(new java.awt.Color(51, 51, 51));
        labelSubTitulo.setText("Datos de Autos:");

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(51, 51, 51));
        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelSubTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo cargar Tabla-------------------------------------------------------
    public void cargarTabla() {
        
        //PARA QUE EL USUARIO NO MUEVA DE LUGAR LAS COLUMNAS
        tabla.getTableHeader().setReorderingAllowed(false);

        DefaultTableModel modelo = new DefaultTableModel() {
            //metodo para que filas y columnas no se puedan editar por el usuario
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //Nombre de las columnas.
        String titulos[] = {"ID", "Modelo", "Marca", "Motor", "Color", "Patente", "N° Puertas"};

        //Setear nombres de cada columna.
        modelo.setColumnIdentifiers(titulos);

        //traer datos desda la Base Datos
        List<Automovil> autos = control.traerAutos();

        //cargar las mascotas y los duenios en la tabla
        if (autos != null) {
            for (Automovil auto : autos) {
                Object objeto[] = {auto.getId(), auto.getModelo(), auto.getMarca(), auto.getMotor(), auto.getColor(),
                auto.getPatente(), auto.getCantPuertas()};
                modelo.addRow(objeto);
            }
        }

        //agregar el modelo a la tabla
        tabla.setModel(modelo);
    }
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

//        //Controlo que la tabla no esté vacía.
//        if (tabla.getRowCount() > 0) {
//
//            //Controlo que se haya seleccionado un registro.
//            if (tabla.getSelectedRow() != -1) {
//
//                //Obtengo ID de la mascota a eliminar.
//                int idAuto = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
//
//                //Llamo al método borrar.
//                control.eliminarDato(idAuto);
//
//                //Aviso al usuario que borró correctamente.
//                mostrarMensaje("Dato eliminado correctamente.", "info", "Eliminación de Datos");
//
//                //Volvemos a cargar la tabla.
//                cargarTabla();
//            } else {
//                mostrarMensaje("Seleccione para eliminar", "error", "Eliminación de Datos");
//            }
//        } else {
//            mostrarMensaje("No hay datos para eliminar", "error", "Eliminación de Datos");
//        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

//        //Controlo que la tabla no esté vacía.
//        if (tabla.getRowCount() > 0) {
//
//            //Controlo que se haya seleccionado un registro.
//            if (tabla.getSelectedRow() != -1) {
//
//                //Obtengo ID de la mascota a editar.
//                int idAuto = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
//
//                //Instancio el jFrame de modificar
//                ModificarDatos modi = new ModificarDatos(idAuto);
//                modi.setVisible(true);
//                modi.setLocationRelativeTo(null);
//                this.dispose();
//
//            } else {
//                mostrarMensaje("Seleccione para Modificar", "error", "Modificación de Datos");
//            }
//        } else {
//            mostrarMensaje("No hay datos para modificar", "error", "Modificación de Datos");
//        }
    }//GEN-LAST:event_btnEditarActionPerformed

    //BOTON ATRAS-----------------------------------------------------------------------------------------------------------------
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Principal pri = new Principal();
        pri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSubTitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
