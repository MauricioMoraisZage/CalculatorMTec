import javax.swing.JOptionPane;

public class hexadecimal extends javax.swing.JFrame {
    int v1, v2;
    String op, resultado;
    
    public hexadecimal() {
        initComponents();
        setTitle("MTechnology - Hexadecimal Calculator");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dez = new javax.swing.JButton();
        onze = new javax.swing.JButton();
        doze = new javax.swing.JButton();
        tereze = new javax.swing.JButton();
        quatorze = new javax.swing.JButton();
        quinze = new javax.swing.JButton();
        subtrair = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        somar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        tela = new javax.swing.JTextField();
        multiplicar = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        voltarPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        um = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        apagar2 = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        apagar1 = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dez.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dez.setText("A");
        dez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dezActionPerformed(evt);
            }
        });

        onze.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        onze.setText("B");
        onze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onzeActionPerformed(evt);
            }
        });

        doze.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        doze.setText("C");
        doze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dozeActionPerformed(evt);
            }
        });

        tereze.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tereze.setText("D");
        tereze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terezeActionPerformed(evt);
            }
        });

        quatorze.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        quatorze.setText("E");
        quatorze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatorzeActionPerformed(evt);
            }
        });

        quinze.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        quinze.setText("F");
        quinze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quinzeActionPerformed(evt);
            }
        });

        subtrair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        subtrair.setText("-");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        somar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        somar.setText("+");
        somar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somarActionPerformed(evt);
            }
        });

        dividir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        tela.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        multiplicar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        multiplicar.setText("*");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        igual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        voltarPrincipal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        voltarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Left_32px.png"))); // NOI18N
        voltarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarPrincipalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Hexadecimal Calculator");

        um.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        um.setText("1");
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoM.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        apagar2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        apagar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Left_32px.png"))); // NOI18N
        apagar2.setText("Back");
        apagar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagar2ActionPerformed(evt);
            }
        });

        dois.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dois.setText("2");
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });

        apagar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        apagar1.setText("C");
        apagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagar1ActionPerformed(evt);
            }
        });

        tres.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        quatro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        quatro.setText("4");
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        cinco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        sete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sete.setText("7");
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        oito.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        oito.setText("8");
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        nove.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nove.setText("9");
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(voltarPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(149, 149, 149))
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(doze, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(tereze, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(quatorze, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(quinze, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(somar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dez, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(onze, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(apagar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apagar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(63, 63, 63)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(voltarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 379, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jLabel1)
                    .addGap(44, 44, 44)
                    .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apagar2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(somar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apagar1))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dez, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(onze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tereze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quatorze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quinze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(32, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dezActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "10");
    }//GEN-LAST:event_dezActionPerformed

    private void onzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onzeActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "11");
    }//GEN-LAST:event_onzeActionPerformed

    private void dozeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dozeActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "12");
    }//GEN-LAST:event_dozeActionPerformed

    private void terezeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terezeActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "13");
    }//GEN-LAST:event_terezeActionPerformed

    private void quatorzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatorzeActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "14");
    }//GEN-LAST:event_quatorzeActionPerformed

    private void quinzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quinzeActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "15");
    }//GEN-LAST:event_quinzeActionPerformed

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairActionPerformed
        try{
            v1 = Integer.parseInt(tela.getText());
            tela.setText("");
            op="-";
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_subtrairActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void somarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somarActionPerformed
        try{
            v1 = Integer.parseInt(tela.getText());
            tela.setText("");
            op="+";
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_somarActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        // TODO add your handling code here:
        try{
            v1 = Integer.parseInt(tela.getText());
            tela.setText("");
            op="/";
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_dividirActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        // TODO add your handling code here:
        try{
            v1 = Integer.parseInt(tela.getText());
            tela.setText("");
            op="*";
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_multiplicarActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        try{
            v2=Integer.parseInt(tela.getText());
            if(op=="+"){
                String resultado = Integer.toHexString(v1+v2);
                tela.setText(String.valueOf(resultado));
            }else if(op=="-"){
                String resultado = Integer.toHexString(v1-v2);
                tela.setText(String.valueOf(resultado));
            }else if(op=="*"){
                String resultado = Integer.toHexString(v1*v2);
                tela.setText(String.valueOf(resultado));
            }
            else if(op=="/"){
                try{
                    String resultado = Integer.toHexString(v1/v2);
                    tela.setText(String.valueOf(resultado));
                }catch(Exception e){
                    tela.setText("Error, Impossible to do this operation!");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error!");
        }
            /*else if(op=="resto"){
            try{
                String resultado = Integer.toHexString(v1%v2);
                tela.setText(String.valueOf(resultado));
            }catch(Exception e){
                tela.setText("NaN");
            }  }*/
    }//GEN-LAST:event_igualActionPerformed

    private void voltarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarPrincipalActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Calculator().setVisible(true); //voltando para o sistema principal
    }//GEN-LAST:event_voltarPrincipalActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "1");
    }//GEN-LAST:event_umActionPerformed

    private void apagar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagar2ActionPerformed
        // TODO add your handling code here:
        String backspace = null;
        if(tela.getText().length()>0){
            StringBuilder num = new StringBuilder(tela.getText());
            num.deleteCharAt(tela.getText().length()-1);
            backspace=num.toString();
            tela.setText(backspace);
        }
    }//GEN-LAST:event_apagar2ActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "2");
    }//GEN-LAST:event_doisActionPerformed

    private void apagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagar1ActionPerformed
        // TODO add your handling code here:
        tela.setText("");
    }//GEN-LAST:event_apagar1ActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "3");
    }//GEN-LAST:event_tresActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "4");
    }//GEN-LAST:event_quatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "6");
    }//GEN-LAST:event_seisActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "7");
    }//GEN-LAST:event_seteActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "8");
    }//GEN-LAST:event_oitoActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        // TODO add your handling code here:
        tela.setText(tela.getText() + "9");
    }//GEN-LAST:event_noveActionPerformed

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
            java.util.logging.Logger.getLogger(hexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hexadecimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar1;
    private javax.swing.JButton apagar2;
    private javax.swing.JButton cinco;
    private javax.swing.JButton dez;
    private javax.swing.JButton dividir;
    private javax.swing.JButton dois;
    private javax.swing.JButton doze;
    private javax.swing.JButton igual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton onze;
    private javax.swing.JButton quatorze;
    private javax.swing.JButton quatro;
    private javax.swing.JButton quinze;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton somar;
    private javax.swing.JButton subtrair;
    private javax.swing.JTextField tela;
    private javax.swing.JButton tereze;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton voltarPrincipal;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
