import javax.swing.JOptionPane;  //Biblioteca q formata erros no Java Swing

public class conversion extends javax.swing.JFrame {

    public conversion() {
        initComponents();
        setTitle("MTechnology - Conversions");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Tela = new javax.swing.JTextField();
        Converter = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        select1 = new javax.swing.JComboBox<>();
        voltarPrincipal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        select2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Conversions");

        Tela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaActionPerformed(evt);
            }
        });

        Converter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Converter.setText("Converte");
        Converter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConverterActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        select1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        select1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your option1", "Kilometer", "Meter", "Kilogram", "Gram", "Kilobyte", "Megabyte", "GigaByte", "Celsius", "Fahrenheit", "Kelvin" }));
        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });

        voltarPrincipal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        voltarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Left_32px.png"))); // NOI18N
        voltarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarPrincipalActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoM.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Insert:");

        select2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        select2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your option2", "Kilometer", "Meter", "Kilogram", "Gram", "Kilobyte", "Megabyte", "GigaByte", "Celsius", "Fahrenheit", "Kelvin" }));
        select2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("to");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltarPrincipal)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Converter, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(select2, 0, 189, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tela)))))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voltarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 81, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tela, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Converter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelaActionPerformed

    private void ConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConverterActionPerformed
         try {
            String S1 = (String)select1.getSelectedItem();
            String S2 = (String)select2.getSelectedItem();
            if ((Tela.getText().equals("")) || (S1.equals("Select your option1")) || (S2.equals("Select your option2")) ){
                JOptionPane.showMessageDialog(null, "Choose options", "Error", JOptionPane.INFORMATION_MESSAGE);
            } 
            else if(S1.equals("Kilometer") && S2.equals("Meter")){
                double Km = Double.parseDouble(Tela.getText());
                Km = Km * 1000;
                //Tela.setText(Double.toString(Km) + "m");
                Tela.setText(String.valueOf(Km) + "m");
            }else if (S1.equals("Meter") && S2.equals("Kilometer")) {
                double metro = Double.parseDouble(Tela.getText());
                metro = metro / 1000;
                Tela.setText(String.valueOf(metro) + "Km");
            } 
            
            else if ( (S1.equals("Kilogram")) && (S2.equals("Gram")) ){
                double Kg = Double.parseDouble(Tela.getText());
                Kg = Kg * 1000;
                Tela.setText(String.valueOf(Kg) + "g");
            } else if ( (S1.equals("Gram")) && (S2.equals("Kilogram")) ){
                double grama = Double.parseDouble(Tela.getText());
                grama = grama / 1000;
                Tela.setText(String.valueOf(grama) + "Kg");
            }
            
            else if ( (S1.equals("Kilobyte")) && (S2.equals("Megabyte")) ){
                double KB = Double.parseDouble(Tela.getText());
                KB = KB / 1024;
                Tela.setText(String.valueOf(KB) + "MB");
            } else if ( (S1.equals("Kilobyte")) && (S2.equals("GigaByte")) ){
                double KB = Double.parseDouble(Tela.getText());
                KB = KB / 2048;
                Tela.setText(String.valueOf(KB) + "GB");
            } else if ( (S1.equals("Megabyte")) && (S2.equals("Kilobyte")) ){
                double MB = Double.parseDouble(Tela.getText());
                MB = MB * 1024;
                Tela.setText(Double.toString(MB) + "KB");
            } else if ( (S1.equals("Megabyte")) && (S2.equals("GigaByte")) ){
                double MB = Double.parseDouble(Tela.getText());
                MB = MB / 1024;
                Tela.setText(Double.toString(MB) + "GB");
            } else if ( (S1.equals("GigaByte")) && (S2.equals("Megabyte")) ){
                double GB = Double.parseDouble(Tela.getText());
                GB = GB * 1024;
                Tela.setText(String.valueOf(GB) + "MB");
            } else if ( (S1.equals("GigaByte")) && (S2.equals("Kilobyte")) ){
                double KB = Double.parseDouble(Tela.getText());
                KB = KB * 2048;
                Tela.setText(String.valueOf(KB) + "KB");
            }
            
            else if ( (S1.equals("Celsius")) && (S2.equals("Fahrenheit")) ){
                double C = Double.parseDouble(Tela.getText());
                double F = (double)(C*1.8 +32);
                Tela.setText(String.valueOf(F) + "F");
            } else if ( (S1.equals("Fahrenheit")) && (S2.equals("Celsius")) ){
                double F = Double.parseDouble(Tela.getText());
                double C = (double)((F-32)*5/9);
                Tela.setText(String.valueOf(C) + "ºC");
            } else if ( (S1.equals("Celsius")) && (S2.equals("Kelvin")) ){
                double C = Double.parseDouble(Tela.getText());
                double K = (double)(C + 273.15);
                Tela.setText(String.valueOf(K) + "K");
            } else if ( (S1.equals("Fahrenheit")) && (S2.equals("Kelvin")) ){
                double F = Double.parseDouble(Tela.getText());
                double K = (double)((F-32)*5/9 + 273.15);
                Tela.setText(String.valueOf(K) + "K");
            }else if ( (S1.equals("Kelvin")) && (S2.equals("Fahrenheit")) ){
                double K = Double.parseDouble(Tela.getText());
                double F = (double)(0 - 273.15)*9/5 + 32;
                Tela.setText(String.valueOf(F) + "F");
            } else if ( (S1.equals("Kelvin")) && (S2.equals("Celsius")) ){
                double K = Double.parseDouble(Tela.getText());
                double C = (double)(0 - 273.15);
                Tela.setText(String.valueOf(C) + "C");
            }
            
            else{
                Tela.setText(null);
                JOptionPane.showMessageDialog(null, "Option Invalid");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_ConverterActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Tela.setText(null);
        select1.setSelectedIndex(0);
        select2.setSelectedIndex(0);
    }//GEN-LAST:event_ResetActionPerformed

    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed

    }//GEN-LAST:event_select1ActionPerformed

    private void voltarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarPrincipalActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Calculator().setVisible(true); //voltando para o sistema principal
    }//GEN-LAST:event_voltarPrincipalActionPerformed

    private void select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conversion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Converter;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField Tela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> select1;
    private javax.swing.JComboBox<String> select2;
    private javax.swing.JButton voltarPrincipal;
    // End of variables declaration//GEN-END:variables
}
