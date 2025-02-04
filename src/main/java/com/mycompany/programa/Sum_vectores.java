/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programa;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author jjjav
 */
public class Sum_vectores extends javax.swing.JFrame {

    /**
     * Creates new form Sum_vectores
     */
    
    public Sum_vectores() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Suma de Vectores");
        result_a.setEditable(false);
        result_m.setEditable(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Vector1_m = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Vector2_m = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Vector3_m = new javax.swing.JTextField();
        Vector4_m = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_sumar = new javax.swing.JButton();
        btn_salir1 = new javax.swing.JButton();
        Vector4_a = new javax.swing.JTextField();
        Vector1_a = new javax.swing.JTextField();
        Vector2_a = new javax.swing.JTextField();
        Vector3_a = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        result_m = new javax.swing.JTextField();
        result_a = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Angulo °");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 60, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Resultante:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 20));
        jPanel1.add(Vector1_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Vector 1:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Vector 2:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));
        jPanel1.add(Vector2_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setText("Vector 3:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));
        jPanel1.add(Vector3_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 60, -1));
        jPanel1.add(Vector4_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 60, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setText("Vector 4:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        jPanel3.setBackground(new java.awt.Color(60, 141, 173));

        jPanel4.setBackground(new java.awt.Color(18, 93, 152));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Suma de Vectores");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 121, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        btn_sumar.setBackground(new java.awt.Color(255, 169, 98));
        btn_sumar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_sumar.setText("Sumar");
        btn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        btn_salir1.setBackground(new java.awt.Color(255, 102, 102));
        btn_salir1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_salir1.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir1.setText("Salir");
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 83, -1));
        jPanel1.add(Vector4_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 60, -1));
        jPanel1.add(Vector1_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, -1));
        jPanel1.add(Vector2_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 60, -1));
        jPanel1.add(Vector3_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 60, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("|V |");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, -1));
        jPanel1.add(result_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 60, -1));
        jPanel1.add(result_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 60, -1));

        jLabel1.setBackground(new java.awt.Color(255, 169, 98));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 169, 98));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_____________________________________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 30));

        btn_limpiar.setBackground(new java.awt.Color(245, 169, 98));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 80, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarActionPerformed
        try {
            double magnitud1 = Double.parseDouble(Vector1_m.getText());
            double magnitud2 = Double.parseDouble(Vector2_m.getText());
            double magnitud3 = Double.parseDouble(Vector3_m.getText());
            double magnitud4 = Double.parseDouble(Vector4_m.getText());

            double direccion1 = Double.parseDouble(Vector1_a.getText());
            double direccion2 = Double.parseDouble(Vector2_a.getText());
            double direccion3 = Double.parseDouble(Vector3_a.getText());
            double direccion4 = Double.parseDouble(Vector4_a.getText());

            double angulo1 = Math.toRadians(direccion1);
            double angulo2 = Math.toRadians(direccion2);
            double angulo3 = Math.toRadians(direccion3);
            double angulo4 = Math.toRadians(direccion4);

            double compx1 = magnitud1 * Math.cos(angulo1);
            double compy1 = magnitud1 * Math.sin(angulo1);
            double compx2 = magnitud2 * Math.cos(angulo2);
            double compy2 = magnitud2 * Math.sin(angulo2);
            double compx3 = magnitud3 * Math.cos(angulo3);
            double compy3 = magnitud3 * Math.sin(angulo3);
            double compx4 = magnitud4 * Math.cos(angulo4);
            double compy4 = magnitud4 * Math.sin(angulo4);

            double sumaX = compx1 + compx2 + compx3 + compx4;
            double sumaY = compy1 + compy2 + compy3 + compy4;

            double magnitud = Math.sqrt(Math.pow(sumaX, 2) + Math.pow(sumaY, 2));
            double direccion = Math.toDegrees(Math.atan2(sumaY, sumaX));

            DecimalFormat df = new DecimalFormat("#.####");
            String magnitudn = df.format(magnitud);
            String direccionn = df.format(direccion);

            result_m.setText(String.valueOf(magnitudn));
            result_a.setText(String.valueOf(direccionn));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese números válidos en los campos de magnitud y ángulo.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_sumarActionPerformed

    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salir1ActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Vector1_a.setText("");
        Vector1_m.setText("");
        Vector2_a.setText("");
        Vector2_m.setText("");
        Vector3_a.setText("");
        Vector3_m.setText("");
        Vector4_m.setText("");
        Vector4_a.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Vector1_a;
    private javax.swing.JTextField Vector1_m;
    private javax.swing.JTextField Vector2_a;
    private javax.swing.JTextField Vector2_m;
    private javax.swing.JTextField Vector3_a;
    private javax.swing.JTextField Vector3_m;
    private javax.swing.JTextField Vector4_a;
    private javax.swing.JTextField Vector4_m;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField result_a;
    private javax.swing.JTextField result_m;
    // End of variables declaration//GEN-END:variables
}
