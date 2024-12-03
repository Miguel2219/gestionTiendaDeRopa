/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.company.views;

import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class Compras extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Compras() {
        initComponents();

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comprasPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        ingresoIdentificacion = new javax.swing.JLabel();
        ingresoIdentificacionTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ingresoIdPrenda = new javax.swing.JLabel();
        ingresoIdPrendaTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        realizarCompra = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(744, 419));

        comprasPanel.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-1388108025-612x612.jpg"))); // NOI18N

        ingresoIdentificacion.setText("IDENTIFICACION DEL CLIENTE");

        ingresoIdentificacionTxt.setForeground(new java.awt.Color(204, 204, 204));
        ingresoIdentificacionTxt.setText("Ingrese la identificacion");
        ingresoIdentificacionTxt.setBorder(null);
        ingresoIdentificacionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoIdentificacionTxtActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        ingresoIdPrenda.setText("ID PRENDA");

        ingresoIdPrendaTxt.setForeground(new java.awt.Color(204, 204, 204));
        ingresoIdPrendaTxt.setText("Ingrese el ID de la prenda");
        ingresoIdPrendaTxt.setBorder(null);
        ingresoIdPrendaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoIdPrendaTxtActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        realizarCompra.setBackground(new java.awt.Color(102, 102, 102));
        realizarCompra.setText("Realizar Compra");
        realizarCompra.setBorderPainted(false);
        realizarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        realizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout comprasPanelLayout = new javax.swing.GroupLayout(comprasPanel);
        comprasPanel.setLayout(comprasPanelLayout);
        comprasPanelLayout.setHorizontalGroup(
            comprasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comprasPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(comprasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comprasPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(comprasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(comprasPanelLayout.createSequentialGroup()
                                .addComponent(ingresoIdentificacionTxt)
                                .addGap(103, 103, 103))
                            .addGroup(comprasPanelLayout.createSequentialGroup()
                                .addComponent(ingresoIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(70, 70, 70))
                            .addGroup(comprasPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addGap(15, 15, 15))
                            .addGroup(comprasPanelLayout.createSequentialGroup()
                                .addComponent(ingresoIdPrenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(170, 170, 170))
                            .addComponent(ingresoIdPrendaTxt)
                            .addGroup(comprasPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator3)
                                .addGap(14, 14, 14))))
                    .addGroup(comprasPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(realizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66)))
                .addGap(293, 293, 293))
        );
        comprasPanelLayout.setVerticalGroup(
            comprasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comprasPanelLayout.createSequentialGroup()
                .addGroup(comprasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comprasPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, Short.MAX_VALUE))
                    .addGroup(comprasPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(ingresoIdentificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingresoIdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(ingresoIdPrenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingresoIdPrendaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(realizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comprasPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(comprasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(comprasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoIdentificacionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoIdentificacionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoIdentificacionTxtActionPerformed

    private void ingresoIdPrendaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoIdPrendaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoIdPrendaTxtActionPerformed

    private void realizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_realizarCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel comprasPanel;
    private javax.swing.JLabel ingresoIdPrenda;
    private javax.swing.JTextField ingresoIdPrendaTxt;
    private javax.swing.JLabel ingresoIdentificacion;
    private javax.swing.JTextField ingresoIdentificacionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton realizarCompra;
    // End of variables declaration//GEN-END:variables
}