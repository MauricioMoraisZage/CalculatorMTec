import javax.swing.JOptionPane;

public class binary extends javax.swing.JFrame {
    int n1, n2, resul;
    String sinal;
    
    public binary() {
        initComponents();
        setTitle("M-Technology - Binary Calculator");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        multiplicar = new javax.swing.JButton();
        voltarPrincipal = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        apagar1 = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        um = new javax.swing.JButton();
        Tela = new javax.swing.JTextField();
        apagarTudo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        somar = new javax.swing.JButton();
        subtrair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        multiplicar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        multiplicar.setText("*");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        voltarPrincipal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        voltarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Left_32px.png"))); // NOI18N
        voltarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarPrincipalActionPerformed(evt);
            }
        });

        dividir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        Igual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoM.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        apagar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        apagar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Left_32px.png"))); // NOI18N
        apagar1.setText("Back");
        apagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagar1ActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        um.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        um.setText("1");
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        Tela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        apagarTudo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        apagarTudo.setText("C");
        apagarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarTudoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Binary Calculator");

        somar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        somar.setText("+");
        somar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somarActionPerformed(evt);
            }
        });

        subtrair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        subtrair.setText("-");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(voltarPrincipal)
                .addGap(0, 492, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(multiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(um, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(somar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(apagar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(apagarTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(Tela, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(jLabel1)
                            .addGap(88, 88, 88)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(voltarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 382, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel1))
                        .addComponent(jLabel8))
                    .addGap(26, 26, 26)
                    .addComponent(Tela, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(apagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(apagarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(somar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        // TODO add your handling code here:
        try{
            n1 = Integer.parseInt(Tela.getText());
            Tela.setText("");
            sinal="*";
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_multiplicarActionPerformed

    private void voltarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarPrincipalActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Calculator().setVisible(true); //voltando para o sistema principal
    }//GEN-LAST:event_voltarPrincipalActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        // TODO add your handling code here:
        try{
            n1 = Integer.parseInt(Tela.getText());
            Tela.setText("");
            sinal="/";
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error");
        }

    }//GEN-LAST:event_dividirActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        // TODO add your handling code here:
        //n2=Integer.toBinaryString((tela.getText()+""));
        try{
            n2 = Integer.parseInt(Tela.getText()); 
            if(sinal=="+"){
                // tela.setText(String.valueOf(n1 + n2));
                String resul = Integer.toBinaryString(n1+n2);
                Tela.setText(String.valueOf(resul));
            }else if(sinal=="-"){
                String resul = Integer.toBinaryString(n1-n2);
                Tela.setText(String.valueOf(resul));
            }else if(sinal=="*"){
                String resul = Integer.toBinaryString(n1*n2);
                Tela.setText(String.valueOf(resul));
            }
            else if(sinal=="/"){
                try{
                    String resul= Integer.toBinaryString(n1/n2);
                    Tela.setText(String.valueOf(resul));
                }catch(Exception e){
                    Tela.setText("Error!");
                }
        }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, Try again!");
        }
        /*else if(sinal=="resto"){
            try{
                String resul = Integer.toBinaryString(n1%n2);
                Tela.setText(String.valueOf(resul));
            }catch(Exception e){
                Tela.setText("NaN");
            }
        }*/
    }//GEN-LAST:event_IgualActionPerformed

    private void apagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagar1ActionPerformed
        // TODO add your handling code here:
        String backspace = null;
        if(Tela.getText().length()>0){
            StringBuilder num = new StringBuilder(Tela.getText());
            num.deleteCharAt(Tela.getText().length()-1);
            backspace=num.toString();
            Tela.setText(backspace);
        }
    }//GEN-LAST:event_apagar1ActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        Tela.setText(Tela.getText()+"0");
    }//GEN-LAST:event_zeroActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        // TODO add your handling code here:
        Tela.setText(Tela.getText()+"1");
    }//GEN-LAST:event_umActionPerformed

    private void apagarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarTudoActionPerformed
        // TODO add your handling code here:
        Tela.setText("");
    }//GEN-LAST:event_apagarTudoActionPerformed

    private void somarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somarActionPerformed
        // TODO add your handling code here:
        try{
            n1 = Integer.parseInt(Tela.getText());
            //n1=Integer.toBinaryString((tela.getText()+""));
            Tela.setText("");
            sinal="+";
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_somarActionPerformed

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairActionPerformed
        // TODO add your handling code here:
        try{
            n1 = Integer.parseInt(Tela.getText());
            Tela.setText("");
            sinal="-";
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_subtrairActionPerformed

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
            java.util.logging.Logger.getLogger(binary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(binary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(binary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(binary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new binary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Igual;
    private javax.swing.JTextField Tela;
    private javax.swing.JButton apagar1;
    private javax.swing.JButton apagarTudo;
    private javax.swing.JButton dividir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton somar;
    private javax.swing.JButton subtrair;
    private javax.swing.JButton um;
    private javax.swing.JButton voltarPrincipal;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
