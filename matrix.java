import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;

public class matrix extends javax.swing.JFrame {
    int fil, filB, col, colB;
    int [][] MatrizA = new int[fil][col];
    int [][] MatrizB = new int [filB][colB];
    
    public matrix() {
        initComponents();
        setTitle("MTechnology - Matrix");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tela1B = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TelaResultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Tela2B = new javax.swing.JTextField();
        AdicionarMatrizA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TelaMatrizA = new javax.swing.JTextArea();
        BotaoB = new javax.swing.JButton();
        voltarPrincipal = new javax.swing.JButton();
        Soma = new javax.swing.JButton();
        Tela1A = new javax.swing.JTextField();
        subtracao = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TelaMatrizB = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        multplicacao = new javax.swing.JButton();
        Tela2A = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tela1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tela1BActionPerformed(evt);
            }
        });

        TelaResultado.setColumns(20);
        TelaResultado.setRows(5);
        jScrollPane4.setViewportView(TelaResultado);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MatrizA[Row] ");

        Tela2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tela2BActionPerformed(evt);
            }
        });

        AdicionarMatrizA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AdicionarMatrizA.setText("ok");
        AdicionarMatrizA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarMatrizAActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("MatrizA[Col ]");

        TelaMatrizA.setColumns(20);
        TelaMatrizA.setRows(5);
        jScrollPane2.setViewportView(TelaMatrizA);

        BotaoB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoB.setText("ok");
        BotaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBActionPerformed(evt);
            }
        });

        voltarPrincipal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        voltarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Left_32px.png"))); // NOI18N
        voltarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarPrincipalActionPerformed(evt);
            }
        });

        Soma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Soma.setText("+");
        Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SomaActionPerformed(evt);
            }
        });

        Tela1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tela1AActionPerformed(evt);
            }
        });

        subtracao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subtracao.setText("-");
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoM.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        TelaMatrizB.setColumns(20);
        TelaMatrizB.setRows(5);
        jScrollPane3.setViewportView(TelaMatrizB);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("MatrizB[Row] ");

        multplicacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        multplicacao.setText("*");
        multplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multplicacaoActionPerformed(evt);
            }
        });

        Tela2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tela2AActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("MatrizB[ Col ]");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Matrix Operation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Tela1A, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Tela2A, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(AdicionarMatrizA)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Soma)
                        .addGap(71, 71, 71)
                        .addComponent(subtracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(multplicacao))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(BotaoB))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Tela1B, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(Tela2B, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(voltarPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(267, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(242, 242, 242)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(voltarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tela1A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tela2A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(multplicacao)
                                    .addComponent(subtracao)
                                    .addComponent(Soma)
                                    .addComponent(AdicionarMatrizA)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tela1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tela2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoB)))))
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jLabel5)
                    .addContainerGap(309, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tela1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tela1BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tela1BActionPerformed

    private void Tela2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tela2BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tela2BActionPerformed

    private void AdicionarMatrizAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarMatrizAActionPerformed
        try{
            if((Tela1A.getText().length()>0) && (Tela2A.getText().length()>0)){
                fil = Integer.parseInt(Tela1A.getText());
                col = Integer.parseInt(Tela2A.getText());
                MatrizA = new int[fil][col];

                for(int i=0; i<fil; i++){
                    for(int j=0;  j<col; j++){
                        MatrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insert numbers to position: ["+i+" "+j+" ]: "));
                    }
                }
                String tela = "";
                for(int f=0; f<fil; f++){
                    tela+="[  ";
                    for(int c=0; c<col; c++){
                        tela += String.valueOf(MatrizA[f][c]) +"  ";
                    }
                    tela+=" ]\n";
                }
                TelaMatrizA.setText(tela);
            }
            else{
                JOptionPane.showMessageDialog(this, "Insert numbers to row and column of Matrix: ");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error!");
        }
    }//GEN-LAST:event_AdicionarMatrizAActionPerformed

    private void BotaoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBActionPerformed
        if((Tela1B.getText().length()>0) && (Tela2B.getText().length()>0)){
            filB = Integer.parseInt(Tela1B.getText());
            colB = Integer.parseInt(Tela2B.getText());
            MatrizB = new int[filB][colB];

            for(int i=0; i<filB; i++){
                for(int j=0;  j<colB; j++){
                    MatrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insert numbers to position: ["+i+" "+j+" ]: "));
                }
            }
            String tela = "";
            for(int f=0; f<filB; f++){
                tela+="[  ";
                for(int c=0; c<colB; c++){
                    tela += String.valueOf(MatrizB[f][c]) +"  ";
                }
                tela+=" ]\n";
            }
            TelaMatrizB.setText(tela);
        }
        else{
            JOptionPane.showMessageDialog(this, "Insert numbers to row and column of Matrix: ");
        }
    }//GEN-LAST:event_BotaoBActionPerformed

    private void voltarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarPrincipalActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Calculator().setVisible(true); //voltando para o sistema principal
    }//GEN-LAST:event_voltarPrincipalActionPerformed

    private void SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SomaActionPerformed
        if(fil != colB){
            TelaResultado.setText("invalid matrix");
        }
        else{
            //método para somar matrizes...
            int [][] Soma = new int[fil][colB];
            for(int l=0; l<fil; l++){
                for(int c=0; c<colB; c++){
                    Soma[l][c] = MatrizA[l][c] + MatrizB[l][c];
                }
            }
            TelaResultado.setText(Arrays.deepToString(Soma));
        }
    }//GEN-LAST:event_SomaActionPerformed

    private void Tela1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tela1AActionPerformed
        // Tela das filas da matriz do segundo método
    }//GEN-LAST:event_Tela1AActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        if(fil != colB){
            TelaResultado.setText("invalid matrix");
        }
        else{
            //método para somar matrizes...
            int [][] Sub = new int[fil][colB];
            for(int l=0; l<fil; l++){
                for(int c=0; c<colB; c++){
                    Sub[l][c] = MatrizA[l][c] - MatrizB[l][c];
                }
            }
            TelaResultado.setText(Arrays.deepToString(Sub));
        }
    }//GEN-LAST:event_subtracaoActionPerformed

    private void multplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multplicacaoActionPerformed
        if(fil != colB){
            TelaResultado.setText("invalid matrix");
        }
        else{
            int [][] Mult= new int[fil][colB];
            for(int l=0; l<fil; l++){
                for(int c=0; c<colB; c++){
                    for(int k=0; k<col; k++){
                        Mult[l][c] += MatrizA[l][k] * MatrizB[k][c];
                    }
                }
            }
            TelaResultado.setText(Arrays.deepToString(Mult));
        }
    }//GEN-LAST:event_multplicacaoActionPerformed

    private void Tela2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tela2AActionPerformed
        // Tela das colunas da matriz do segundo método
    }//GEN-LAST:event_Tela2AActionPerformed

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
            java.util.logging.Logger.getLogger(matrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matrix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarMatrizA;
    private javax.swing.JButton BotaoB;
    private javax.swing.JButton Soma;
    private javax.swing.JTextField Tela1A;
    private javax.swing.JTextField Tela1B;
    private javax.swing.JTextField Tela2A;
    private javax.swing.JTextField Tela2B;
    private javax.swing.JTextArea TelaMatrizA;
    private javax.swing.JTextArea TelaMatrizB;
    private javax.swing.JTextArea TelaResultado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton multplicacao;
    private javax.swing.JButton subtracao;
    private javax.swing.JButton voltarPrincipal;
    // End of variables declaration//GEN-END:variables
}
