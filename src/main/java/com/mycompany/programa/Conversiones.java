/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programa;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jjjav
 */
public class Conversiones extends javax.swing.JFrame {

    /**
     * Creates new form Conversiones
     */
    public Conversiones() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Conversiones");
        jTextField2.setEditable(false);
        
        btn_tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Time.png")));
        btn_longitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Length.png")));
        btn_masa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Weight Kg.png")));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/convertir.png")));
        
        btn_tiempo.addActionListener((ActionEvent e) -> {
            jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Segundos", "Minutos", "Horas", "Días", "Años"}));
            jComboBox3.setModel(new DefaultComboBoxModel<>(new String[]{"Segundos", "Minutos", "Horas", "Días", "Años"}));
        });

        btn_longitud.addActionListener((ActionEvent e) -> {
            jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Metros", "Kilómetros", "Millas", "Pies", "Centímetros", "Pulgadas"}));
            jComboBox3.setModel(new DefaultComboBoxModel<>(new String[]{"Metros", "Kilómetros", "Millas", "Pies", "Centímetros", "Pulgadas"}));
        });

        btn_masa.addActionListener((ActionEvent e) -> {
            jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Kilogramo", "Gramo", "Libra", "Onzas"}));
            jComboBox3.setModel(new DefaultComboBoxModel<>(new String[]{"Kilogramo", "Gramo", "Libra", "Onzas"}));
        });
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
        jPanel2 = new javax.swing.JPanel();
        btn_tiempo = new javax.swing.JRadioButton();
        btn_masa = new javax.swing.JRadioButton();
        btn_longitud = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        btn_convertir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        btn_salir1 = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tiempo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_tiempo.setText("Tiempo");
        btn_tiempo.setIcon(new javax.swing.ImageIcon("C:\\Users\\jjjav\\OneDrive\\Documentos\\NetBeansProjects\\Programa\\src\\main\\java\\com\\mycompany\\programa\\imagenes\\Time.png"));
        jPanel2.add(btn_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        btn_masa.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_masa.setText("Masa");
        btn_masa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_masa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_masa.setIcon(new javax.swing.ImageIcon("C:\\Users\\jjjav\\OneDrive\\Documentos\\NetBeansProjects\\Programa\\src\\main\\java\\com\\mycompany\\programa\\imagenes\\Weight Kg.png"));
        jPanel2.add(btn_masa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        btn_longitud.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_longitud.setText("Longitud");
        btn_longitud.setIcon(new javax.swing.ImageIcon("C:\\Users\\jjjav\\OneDrive\\Documentos\\NetBeansProjects\\Programa\\src\\main\\java\\com\\mycompany\\programa\\imagenes\\Length.png"));
        jPanel2.add(btn_longitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(60, 141, 173));

        jPanel4.setBackground(new java.awt.Color(18, 93, 152));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversión de Medidas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 101, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 110, -1));

        btn_convertir.setBackground(new java.awt.Color(245, 169, 98));
        btn_convertir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_convertir.setText("Convertir");
        btn_convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_convertirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jjjav\\OneDrive\\Documentos\\NetBeansProjects\\Programa\\src\\main\\java\\com\\mycompany\\programa\\imagenes\\convertir.png"));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 100, 60));

        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, -1));

        btn_salir1.setBackground(new java.awt.Color(255, 102, 102));
        btn_salir1.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir1.setText("Salir");
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 83, -1));

        btn_limpiar.setBackground(new java.awt.Color(245, 169, 98));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salir1ActionPerformed

    private void btn_convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_convertirActionPerformed
        try{
            double numero1 = Double.parseDouble(jTextField1.getText());

            String seleccion1 = jComboBox2.getSelectedItem().toString();
            String seleccion2 = jComboBox3.getSelectedItem().toString();
            double resultado = 0.0;

            switch (seleccion1){
                //Tiempo
                case "Segundos" -> {
                    switch (seleccion2){
                        case "Segundos" -> resultado = numero1;
                        case "Minutos" -> resultado = numero1/60;
                        case "Horas" -> resultado = numero1/3600;
                        case "Días" -> resultado = numero1/86400;
                        case "Años" ->  resultado = numero1/3.154e+7;
                    }
                }
                case "Minutos" -> {
                    switch (seleccion2){
                        case "Segundos" -> resultado = numero1*60;
                        case "Minutos" -> resultado = numero1;
                        case "Horas" -> resultado = numero1/60;
                        case "Días" -> resultado = numero1/1440;
                        case "Años" -> resultado = numero1/525600;
                    }
                }
                case "Horas" -> {
                    switch (seleccion2){
                        case "Segundos" -> resultado = numero1*3600;
                        case "Minutos" -> resultado = numero1*60;
                        case "Horas" -> resultado = numero1;
                        case "Días" -> resultado = numero1/24;
                        case "Años" -> resultado = numero1/8760;
                    }
                }
                case "Días" -> {
                    switch (seleccion2){
                        case "Segundos" -> resultado = numero1*86400;
                        case "Minutos" -> resultado = numero1*1440;
                        case "Horas" -> resultado = numero1*24;
                        case "Días" -> resultado = numero1;
                        case "Años" -> resultado = numero1/365;
                    }
                }
                case "Años" -> {
                    switch (seleccion2){
                        case "Segundos" -> resultado = numero1*3.154e+7;
                        case "Minutos" ->resultado = numero1*525600;
                        case "Horas" -> resultado = numero1*8760;
                        case "Días" -> resultado = numero1*365;
                        case "Años" -> resultado = numero1;
                    }
                }
                //Longitud
                case "Metros" -> {
                    switch (seleccion2){
                        case "Metros" -> resultado = numero1;
                        case "Kilómetros" ->resultado = numero1/1000;
                        case "Millas" -> resultado = numero1/1609;
                        case "Pies" -> resultado = numero1*3.281;
                        case "Centímetros" -> resultado = numero1*100;
                        case "Pulgadas" -> resultado = numero1*39.37;
                    }
                }
                case "Kilómetros"->{
                    switch (seleccion2){
                        case "Metros" -> resultado = numero1 * 1000;
                        case "Kilómetros" -> resultado = numero1;
                        case "Millas" -> resultado = numero1 * 1e+12;
                        case "Pies" -> resultado = numero1 * 3281;
                        case "Centímetros" -> resultado = numero1 * 100000;
                        case "Pulgadas" -> resultado = numero1 * 39370;
                    }
                }
                case "Millas"->{
                    switch (seleccion2){
                        case "Metros" -> resultado = numero1 * 1609;
                        case "Kilómetros" -> resultado = numero1 * 1.609;
                        case "Millas" -> resultado = numero1;
                        case "Pies" -> resultado = numero1 * 5228;
                        case "Centímetros" -> resultado = numero1 * 160900;
                        case "Pulgadas" -> resultado = numero1 * 63360;
                    }
                }
                case "Pies"->{
                    switch(seleccion2){
                        case "Metros" -> resultado = numero1 / 3.281;
                        case "Kilómetros" -> resultado = numero1 / 3281;
                        case "Millas" -> resultado = numero1 / 5280;
                        case "Pies" -> resultado = numero1;
                        case "Centímetros" -> resultado = numero1 / 30.48;
                        case "Pulgadas" -> resultado = numero1 / 12;
                    }
                }
                case "Centímetros"->{
                    switch(seleccion2){
                        case "Metros" -> resultado = numero1 / 100;
                        case "Kilómetros" -> resultado = numero1 / 100000;
                        case "Millas" -> resultado = numero1 / 160900;
                        case "Pies" -> resultado = numero1 / 30.48;
                        case "Centímetros" -> resultado = numero1;
                        case "Pulgadas" -> resultado = numero1 / 2.54;
                    }
                }
                case "Pulgadas"->{
                    switch(seleccion2){
                        case "Metros" -> resultado = numero1 / 39.37;
                        case "Kilómetros" -> resultado = numero1 / 39370;
                        case "Millas" -> resultado = numero1 / 63360;
                        case "Pies" -> resultado = numero1 / 12;
                        case "Centímetros" -> resultado = numero1 / 2.54;
                        case "Pulgadas" -> resultado = numero1;
                    }
                }
                //Masa
                case "Kilogramo"->{
                    switch(seleccion2){
                        case "Kilogramo" -> resultado = numero1;
                        case "Gramo" -> resultado = numero1 * 1000;
                        case "Libra" -> resultado = numero1 * 2.205;
                        case "Onzas" -> resultado = numero1 * 35.274;
                    }
                }
                case "Gramo"->{
                    switch(seleccion2){
                        case "Kilogramo" -> resultado = numero1 / 1000;
                        case "Gramo" -> resultado = numero1;
                        case "Libra" -> resultado = numero1 / 453.6;
                        case "Onzas" -> resultado = numero1 / 28.35;
                    }
                }
                case "Libra"->{
                    switch(seleccion2){
                        case "Kilogramo" -> resultado = numero1 / 2.205;
                        case "Gramo" -> resultado = numero1 * 453.6;
                        case "Libra" -> resultado = numero1;
                        case "Onzas" -> resultado = numero1 * 16;
                    }
                }
                case "Onzas"->{
                    switch(seleccion2){
                        case "Kilogramo" -> resultado = numero1 / 35.274;
                        case "Gramo" -> resultado = numero1 * 28.35;
                        case "Libra" -> resultado = numero1 / 16;
                        case "Onzas" -> resultado = numero1;
                    }
                }
            }
                DecimalFormat df = new DecimalFormat("#.#########");
                String nuevoresultado = df.format(resultado);
                jTextField2.setText(String.valueOf(nuevoresultado));
            }
        catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Solo se admiten valores numericos");
        }
    }//GEN-LAST:event_btn_convertirActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_convertir;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JRadioButton btn_longitud;
    private javax.swing.JRadioButton btn_masa;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JRadioButton btn_tiempo;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
