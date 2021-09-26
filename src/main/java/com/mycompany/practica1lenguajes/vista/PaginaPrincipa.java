/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1lenguajes.vista;

import com.mycompany.practica1lenguajes.clases.ObjetoValidacion;
import com.mycompany.practica1lenguajes.manejador.Validacion;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class PaginaPrincipa extends javax.swing.JFrame {
    public PaginaPrincipa() {
        initComponents();
        areatext.setEditable(false);
        areatext.setEnabled(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonsubir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areatext = new javax.swing.JTextArea();
        botonEditar = new javax.swing.JButton();
        textBuscar = new javax.swing.JTextField();
        botonbuscar = new javax.swing.JButton();
        botonextraer = new javax.swing.JButton();
        botonrep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);

        botonsubir.setText("Subir Archivo");
        botonsubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsubirActionPerformed(evt);
            }
        });

        areatext.setColumns(20);
        areatext.setRows(5);
        jScrollPane1.setViewportView(areatext);

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        botonextraer.setText("Extraer");
        botonextraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonextraerActionPerformed(evt);
            }
        });

        botonrep.setText("Reporte");
        botonrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonsubir)
                        .addGap(18, 18, 18)
                        .addComponent(botonEditar)
                        .addGap(14, 14, 14)
                        .addComponent(botonextraer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonrep)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonsubir)
                    .addComponent(botonEditar)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar)
                    .addComponent(botonextraer)
                    .addComponent(botonrep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(156, 156, 156))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonsubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsubirActionPerformed
        ObjetoValidacion ob= new ObjetoValidacion("subirarchivo");
        ob.SubirArchivo();
    }//GEN-LAST:event_botonsubirActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        areatext.setEditable(true);
        areatext.setEnabled(true);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        String textb= textBuscar.getText();
        if(textb==" "){
            JOptionPane.showMessageDialog(null, "NO HAY TEXTO PARA INGRESAR");
        }else{
            
        }
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void botonextraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonextraerActionPerformed
        char[] linea= areatext.getText().toCharArray();
        ObjetoValidacion ob= new ObjetoValidacion("subirarchivo");
        ob.mostrarLineas(linea);
    }//GEN-LAST:event_botonextraerActionPerformed

    private void botonrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrepActionPerformed
        JOptionPane.showMessageDialog(null, Validacion.Rep());
    }//GEN-LAST:event_botonrepActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea areatext;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botonextraer;
    private javax.swing.JButton botonrep;
    private javax.swing.JButton botonsubir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textBuscar;
    // End of variables declaration//GEN-END:variables
}