/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programa;

import javax.swing.JOptionPane;

/**
 *
 * @author jjjav
 */
public class LeyesNewton extends javax.swing.JFrame {

    /**
     * Creates new form LeyesNewton
     */
    public LeyesNewton() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Leyes de Newton");

        text_estatica.setEditable(false);
        text_cinetica.setEditable(false);
        text_Cestatica.setEditable(false);
        text_Ccinetica.setEditable(false);
        text_angulo.setEditable(false);
        text_pesox.setEditable(false);
        text_pesoy.setEditable(false);

        btn_friccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_friccionActionPerformed(evt);
            }
        });
        btn_inclinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inclinacionActionPerformed(evt);
            }
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

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_salir1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_normal = new javax.swing.JTextField();
        text_fuerzaneta = new javax.swing.JTextField();
        text_peso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text_masa = new javax.swing.JTextField();
        btn_friccion = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        text_cinetica = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text_estatica = new javax.swing.JTextField();
        btn_inclinacion = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        text_Cestatica = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        text_Ccinetica = new javax.swing.JTextField();
        text_pesox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        text_pesoy = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        text_angulo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        text_aceleracion = new javax.swing.JTextField();
        btn_calcularcinetica = new javax.swing.JRadioButton();
        btn_calcularestatica = new javax.swing.JRadioButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(60, 141, 173));

        jPanel4.setBackground(new java.awt.Color(18, 93, 152));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Leyes de Newton");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        btn_calcular.setBackground(new java.awt.Color(245, 169, 98));
        btn_calcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        jPanel1.add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 90, 20));

        btn_limpiar.setBackground(new java.awt.Color(245, 169, 98));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 80, 20));

        btn_salir1.setBackground(new java.awt.Color(255, 102, 102));
        btn_salir1.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir1.setText("Salir");
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 90, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Fuerza Normal:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Peso:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 40, 20));
        jPanel1.add(text_normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, -1));
        jPanel1.add(text_fuerzaneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 80, 70, -1));
        jPanel1.add(text_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Fuerza Neta:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("Masa:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 40, 20));
        jPanel1.add(text_masa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 60, -1));

        btn_friccion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_friccion.setText("Fricción");
        btn_friccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_friccionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_friccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("Fricción Cinética:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, 20));
        jPanel1.add(text_cinetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setText("Fricción Estatica:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 20));
        jPanel1.add(text_estatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 80, -1));

        btn_inclinacion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_inclinacion.setText("Inclinación");
        btn_inclinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inclinacionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_inclinacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setText("μk: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, 20));
        jPanel1.add(text_Cestatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 80, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setText("μS:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 20));
        jPanel1.add(text_Ccinetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 90, -1));
        jPanel1.add(text_pesox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 80, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("Peso en x:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("Peso en y:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 20));
        jPanel1.add(text_pesoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 90, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setText("Angulo° :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 20));
        jPanel1.add(text_angulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 90, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel15.setText("Aceleración:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 20));
        jPanel1.add(text_aceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 90, -1));

        btn_calcularcinetica.setText("Calcular Cinética");
        btn_calcularcinetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularcineticaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_calcularcinetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        btn_calcularestatica.setText("Calcular Estatica");
        btn_calcularestatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularestaticaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_calcularestatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        try {
            double gravedad = 9.81;

            double fuerza = Double.parseDouble(text_fuerzaneta.getText());
            double masa = (text_masa.getText().isEmpty()) ? 0 : Double.parseDouble(text_masa.getText());
            double peso = (text_peso.getText().isEmpty()) ? 0 : Double.parseDouble(text_peso.getText());
            double normal = (text_normal.getText().isEmpty()) ? 0 : Double.parseDouble(text_normal.getText());
            double aceleracion = (text_aceleracion.getText().isEmpty()) ? 0 : Double.parseDouble(text_aceleracion.getText());
            double fric_estatica = (text_estatica.getText().isEmpty()) ? 0 : Double.parseDouble(text_estatica.getText());
            double fric_cinetica = (text_cinetica.getText().isEmpty()) ? 0 : Double.parseDouble(text_cinetica.getText());
            double coe_estatica = (text_Cestatica.getText().isEmpty()) ? 0 : Double.parseDouble(text_Cestatica.getText());
            double coe_cinetica = (text_Ccinetica.getText().isEmpty()) ? 0 : Double.parseDouble(text_Ccinetica.getText());

            // Calcular masa y peso si no están disponibles
            if (peso == 0) {
                peso = masa * gravedad;
                text_peso.setText(String.valueOf(String.format("%.2f", peso)));
                JOptionPane.showMessageDialog(null, "Formula utilizada: \n w=m*g");
            }
            if (masa == 0) {
                masa = peso / gravedad;
                text_masa.setText(String.valueOf(String.format("%.2f", masa)));
                JOptionPane.showMessageDialog(null, "Formula utilizada: \n m=w/g");
            }

            // Calcular fuerza, aceleración y masa
            if (masa > 0 && aceleracion > 0 && fuerza == 0) {
                fuerza = masa * aceleracion;
                text_fuerzaneta.setText(String.valueOf(String.format("%.2f", fuerza)));
                JOptionPane.showMessageDialog(null, "Formula utilizada: \n f=m*a");
            } else if (masa > 0 && fuerza > 0 && aceleracion == 0) {
                aceleracion = fuerza / masa;
                text_aceleracion.setText(String.valueOf(String.format("%.2f", aceleracion)));
                JOptionPane.showMessageDialog(null, "Formula utilizada: \n a=f/m");
            } else if (masa == 0 && fuerza > 0 && aceleracion > 0) {
                masa = fuerza / aceleracion;
                text_masa.setText(String.valueOf(String.format("%.2f", masa)));
                JOptionPane.showMessageDialog(null, "Formula utilizada: \n m=f/a");
            } else if (masa > 0 && peso > 0 && aceleracion == 0) {
                aceleracion = peso / masa;
                text_aceleracion.setText(String.valueOf(String.format("%.2f", aceleracion)));
                JOptionPane.showMessageDialog(null, "Formula utilizada: \n a=p/m");
            }

            // Calcular normal si no está disponible
            if (normal == 0 && peso > 0) {
                normal = peso;
                text_normal.setText(String.valueOf(String.format("%.2f", normal)));
                JOptionPane.showMessageDialog(null, "N=w");
            }
            if (btn_inclinacion.isSelected()) {
                double angulo = (text_angulo.getText().isEmpty()) ? 0 : Double.parseDouble(text_angulo.getText());
                double pesox = (text_pesox.getText().isEmpty()) ? 0 : Double.parseDouble(text_pesox.getText());
                double pesoy = (text_pesoy.getText().isEmpty()) ? 0 : Double.parseDouble(text_pesoy.getText());

                double anguloRad = Math.toRadians(angulo);

                if (angulo > 0 && pesox == 0 && pesoy == 0) {
                    double npesoy = peso * Math.cos(anguloRad);
                    double npesox = peso * Math.sin(anguloRad);

                    double fuerzaNeta = npesox;
                    double fuerzaNormal = npesoy;

                    text_fuerzaneta.setText(String.valueOf(String.format("%.2f", fuerzaNeta)));
                    text_normal.setText(String.valueOf(String.format("%.2f", fuerzaNormal)));
                    text_pesox.setText(String.valueOf(String.format("%.2f", npesox)));
                    text_pesoy.setText(String.valueOf(String.format("%.2f", npesoy)));
                    JOptionPane.showMessageDialog(null, "Formula utilizadas: \n wy = w*(cosθ)\n wx = w*(sinθ) \n F=wx \n N=wy");

                } else if (angulo == 0 && pesox > 0 && pesoy > 0) {
                    double angulon = Math.toDegrees(Math.atan2(pesox, pesoy));
                    System.out.println(angulon);
                    text_angulo.setText(String.valueOf(String.format("%.2f", angulon)));
                    JOptionPane.showMessageDialog(null, "Formula utilizada: \n θ=tan⁻¹(wx/wy)");
                } else if (angulo > 0 && pesox == 0 && pesoy > 0) {
                    double componenteX = pesoy * Math.tan(Math.toRadians(angulo));
                    text_pesox.setText(String.valueOf(String.format("%.2f", componenteX)));
                    JOptionPane.showMessageDialog(null, "Formula utilizada: \n wx=wy*tanθ");
                } else if (angulo > 0 && pesox > 0 && pesoy == 0) {
                    double componenteY = pesox / Math.tan(Math.toRadians(angulo));
                    text_pesoy.setText(String.valueOf(String.format("%.2f", componenteY)));
                    JOptionPane.showMessageDialog(null, "Formula utilizada: \n wy=wx/tanθ");
                }
            }
            // Calcular fricción estática y cinética(sin inclinación)
            if (btn_friccion.isSelected()) {
                if (btn_calcularestatica.isSelected()) {
                    if (coe_estatica == 0) {
                        fric_estatica = fuerza;
                        coe_estatica = fric_estatica / normal;
                        text_estatica.setText(String.valueOf(String.format("%.2f", fric_estatica)));
                        text_Cestatica.setText(String.valueOf(String.format("%.2f", coe_estatica)));
                        JOptionPane.showMessageDialog(null, "Formula utilizada: \n fs = F \n μs=fs/N");
                    }
                    if (fric_estatica == 0) {
                        fric_estatica = coe_estatica * normal;
                        JOptionPane.showMessageDialog(null, "Formula utilizada: \n Fs=μs*N");
                        text_estatica.setText(String.valueOf(String.format("%.2f", fric_estatica)));
                    }
                }
                if (btn_calcularcinetica.isSelected()) {
                    if (coe_cinetica == 0 && fuerza > 0) {
                        fric_cinetica = fuerza;
                        coe_cinetica = fric_cinetica / normal;
                        text_cinetica.setText(String.valueOf(String.format("%.2f", fric_cinetica)));
                        text_Ccinetica.setText(String.valueOf(String.format("%.2f", coe_cinetica)));
                        JOptionPane.showMessageDialog(null, "Formula utilizada: \n fk=F \n μk=fk/N");
                    }
                    if (fric_cinetica == 0 && coe_cinetica > 0) {
                        fric_cinetica = coe_cinetica * normal;
                        text_cinetica.setText(String.valueOf(String.format("%.2f", fric_cinetica)));
                        JOptionPane.showMessageDialog(null, "Formula utilizada: \n fk=μk*N");
                    }
                }
                //con inclinación
                if (btn_inclinacion.isSelected()) {
                    double angulo = (text_angulo.getText().isEmpty()) ? 0 : Double.parseDouble(text_angulo.getText());
                    double pesox = (text_pesox.getText().isEmpty()) ? 0 : Double.parseDouble(text_pesox.getText());
                    double pesoy = (text_pesoy.getText().isEmpty()) ? 0 : Double.parseDouble(text_pesoy.getText());

                    double anguloRad = Math.toRadians(angulo);

                    if (fuerza == 0 && peso > 0 && coe_cinetica > 0) {
                        normal = peso * Math.cos(anguloRad);
                        fric_cinetica = coe_cinetica * normal;
                        pesoy = peso * Math.sin(anguloRad);
                        fuerza = pesoy + fric_cinetica;
                        text_fuerzaneta.setText(String.valueOf(String.format("%.2f", fuerza)));
                    }

                    if (angulo == 0 && coe_estatica > 0) {
                        angulo = Math.toDegrees(Math.atan(coe_estatica));
                        text_angulo.setText(String.format("%.2f", angulo));
                    }
                    if (fuerza == 0 && masa > 0 && aceleracion > 0 && coe_cinetica > 0) {
                        fuerza = masa * (aceleracion + gravedad * coe_cinetica);
                        text_fuerzaneta.setText(String.format("%.2f", fuerza));
                    }
                    if (masa > 0 && aceleracion > 0 && fric_cinetica > 0 && fuerza == 0) {
                        double fuerzar = masa * aceleracion;
                        fuerza = fuerzar + fric_cinetica;
                        text_fuerzaneta.setText(String.format("%.2f", fuerza));
                    }
                    if (btn_calcularestatica.isSelected()) { //estatica μs y fric
                        if (coe_estatica == 0) {
                            coe_estatica = fric_estatica / normal;
                            text_Cestatica.setText(String.valueOf(String.format("%.2f", coe_estatica)));
                            JOptionPane.showMessageDialog(null, "Fórmula utilizada: \n μs = Fs/N");
                        }
                        if (fric_estatica == 0) {
                            fric_estatica = coe_estatica * normal;
                            text_estatica.setText(String.valueOf(String.format("%.2f", fric_estatica)));
                            JOptionPane.showMessageDialog(null, "Fórmula utilizada: \n Fs = μs * N");
                        }
                    }
                    if (btn_calcularcinetica.isSelected()) { //estatica μk y fric
                        if (coe_cinetica == 0 && fuerza > 0) {
                            coe_cinetica = fric_cinetica / normal;
                            text_Ccinetica.setText(String.valueOf(String.format("%.2f", coe_cinetica)));
                            JOptionPane.showMessageDialog(null, "Fórmula utilizada: μk = Fk/N");
                        }
                        if (fric_cinetica == 0 && coe_cinetica > 0) {
                            fric_cinetica = coe_cinetica * normal;
                            text_cinetica.setText(String.valueOf(String.format("%.2f", fric_cinetica)));
                            JOptionPane.showMessageDialog(null, "Fórmula utilizada: Fk = μk * N");
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Cálculos realizados con éxito.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa valores numéricos válidos en los campos.");
        }
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        text_normal.setText("");
        text_aceleracion.setText("");
        text_fuerzaneta.setText("");
        text_peso.setText("");
        text_masa.setText("");
        text_estatica.setText("");
        text_cinetica.setText("");
        text_Cestatica.setText("");
        text_Ccinetica.setText("");
        text_angulo.setText("");
        text_pesox.setText("");
        text_pesoy.setText("");

        text_estatica.setEditable(false);
        text_cinetica.setEditable(false);
        text_Cestatica.setEditable(false);
        text_Ccinetica.setEditable(false);
        text_angulo.setEditable(false);
        text_pesox.setEditable(false);
        text_pesoy.setEditable(false);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salir1ActionPerformed

    private void btn_friccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_friccionActionPerformed
        text_estatica.setEditable(true);
        text_cinetica.setEditable(true);
        text_Cestatica.setEditable(true);
        text_Ccinetica.setEditable(true);
    }//GEN-LAST:event_btn_friccionActionPerformed

    private void btn_inclinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inclinacionActionPerformed
        text_angulo.setEditable(true);
        text_pesox.setEditable(true);
        text_pesoy.setEditable(true);
    }//GEN-LAST:event_btn_inclinacionActionPerformed

    private void btn_calcularestaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularestaticaActionPerformed
        text_cinetica.setEditable(false);
        text_Ccinetica.setEditable(false);
    }//GEN-LAST:event_btn_calcularestaticaActionPerformed

    private void btn_calcularcineticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularcineticaActionPerformed
        text_estatica.setEditable(false);
        text_Cestatica.setEditable(false);
    }//GEN-LAST:event_btn_calcularcineticaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JRadioButton btn_calcularcinetica;
    private javax.swing.JRadioButton btn_calcularestatica;
    private javax.swing.JRadioButton btn_friccion;
    private javax.swing.JRadioButton btn_inclinacion;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField text_Ccinetica;
    private javax.swing.JTextField text_Cestatica;
    private javax.swing.JTextField text_aceleracion;
    private javax.swing.JTextField text_angulo;
    private javax.swing.JTextField text_cinetica;
    private javax.swing.JTextField text_estatica;
    private javax.swing.JTextField text_fuerzaneta;
    private javax.swing.JTextField text_masa;
    private javax.swing.JTextField text_normal;
    private javax.swing.JTextField text_peso;
    private javax.swing.JTextField text_pesox;
    private javax.swing.JTextField text_pesoy;
    // End of variables declaration//GEN-END:variables
}
