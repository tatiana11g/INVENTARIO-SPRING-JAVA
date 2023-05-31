/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.demo.vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmActualizar = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombreac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprecioact = new javax.swing.JTextField();
        txtinventarioact = new javax.swing.JTextField();
        btnactualizaregis = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblnombre = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();
        lblinventario = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtinventario = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        lbltitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproductos = new javax.swing.JTable();
        btnborrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btminforme = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ACTUALIZAR PRODUCTO");

        jLabel2.setText("Ingrese los datos a actualizar");

        jLabel3.setText("Nombre :");

        jLabel4.setText("Precio :");

        jLabel5.setText("Inventario :");

        btnactualizaregis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnactualizaregis.setText("ACTUALIZAR");

        javax.swing.GroupLayout frmActualizarLayout = new javax.swing.GroupLayout(frmActualizar.getContentPane());
        frmActualizar.getContentPane().setLayout(frmActualizarLayout);
        frmActualizarLayout.setHorizontalGroup(
            frmActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmActualizarLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(frmActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(frmActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtnombreac, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtinventarioact, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecioact, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmActualizarLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(frmActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmActualizarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmActualizarLayout.createSequentialGroup()
                        .addComponent(btnactualizaregis)
                        .addGap(182, 182, 182))))
        );
        frmActualizarLayout.setVerticalGroup(
            frmActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmActualizarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(frmActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombreac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(frmActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtprecioact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(frmActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtinventarioact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnactualizaregis)
                .addGap(40, 40, 40))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Agregar Nuevo Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblnombre.setText("Nombre :");

        lblprecio.setText("Precio :");

        lblinventario.setText("Inventario :");

        btnagregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnagregar.setText("AGREGAR");

        jLayeredPane1.setLayer(lblnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblprecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblinventario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtinventario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnagregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtprecio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblinventario)
                            .addComponent(lblprecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(73, 73, 73)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre)
                            .addComponent(txtinventario, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtprecio))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre))
                .addGap(21, 21, 21)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblprecio)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(lblinventario))
                    .addComponent(txtinventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnagregar)
                .addGap(32, 32, 32))
        );

        lbltitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbltitulo.setText("¡Bienvebido a la APP de inventario");

        tblproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Inventario"
            }
        ));
        jScrollPane1.setViewportView(tblproductos);

        btnborrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnborrar.setText("BORRAR");

        btnactualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");

        btminforme.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btminforme.setText("INFORME");
        btminforme.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnborrar)
                                .addGap(81, 81, 81)
                                .addComponent(btnactualizar))
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btminforme)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbltitulo)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbltitulo)
                .addGap(43, 43, 43)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar)
                    .addComponent(btnborrar)
                    .addComponent(btminforme))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btminforme;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnactualizaregis;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnborrar;
    private javax.swing.JFrame frmActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblinventario;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTable tblproductos;
    private javax.swing.JTextField txtinventario;
    private javax.swing.JTextField txtinventarioact;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombreac;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprecioact;
    // End of variables declaration//GEN-END:variables

    public JButton getBtminforme() {
        return btminforme;
    }

    public JButton getBtnactualizar() {
        return btnactualizar;
    }

    public JButton getBtnagregar() {
        return btnagregar;
    }

    public JButton getBtnborrar() {
        return btnborrar;
    }

    public JLayeredPane getjLayeredPane1() {
        return jLayeredPane1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getLblinventario() {
        return lblinventario;
    }

    public JLabel getLblnombre() {
        return lblnombre;
    }

    public JLabel getLblprecio() {
        return lblprecio;
    }

    public JLabel getLbltitulo() {
        return lbltitulo;
    }

    public JTable getTblproductos() {
        return tblproductos;
    }

    public JTextField getTxtinventario() {
        return txtinventario;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public JTextField getTxtprecio() {
        return txtprecio;
    }

    public JButton getBtnactualizaregis() {
        return btnactualizaregis;
    }

    public JFrame getFrmactualizar() {
        return frmActualizar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JTextField getTxtinventarioact() {
        return txtinventarioact;
    }

    public JTextField getTxtnombreac() {
        return txtnombreac;
    }

    public JTextField getTxtprecioact() {
        return txtprecioact;
    }


    




}
