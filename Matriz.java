
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
    
public class Matriz extends javax.swing.JFrame {
    Matriz2 a;
    Matriz2 b;
    public Matriz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tela1A = new javax.swing.JTextField();
        Tela2A = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AdicionarMatrizA = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TelaMatrizA = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tela1B = new javax.swing.JTextField();
        Tela2B = new javax.swing.JTextField();
        AdicionarMatrizB = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TelaMatrizB = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        TelaResultado = new javax.swing.JTextArea();
        Soma = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        multplicacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MatrizA[ Fila ]: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("MatrizA[ Coluna ]:");

        Tela1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tela1AActionPerformed(evt);
            }
        });

        Tela2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tela2AActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Matrix");

        AdicionarMatrizA.setText("Adicionar MatrizA");
        AdicionarMatrizA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarMatrizAActionPerformed(evt);
            }
        });

        TelaMatrizA.setColumns(20);
        TelaMatrizA.setRows(5);
        jScrollPane2.setViewportView(TelaMatrizA);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText(":MatrizB[ Fila ] ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText(":MatrizB[ Coluna ]");

        Tela1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tela1BActionPerformed(evt);
            }
        });

        Tela2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tela2BActionPerformed(evt);
            }
        });

        AdicionarMatrizB.setText("Adicionar MatrizB");
        AdicionarMatrizB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarMatrizBActionPerformed(evt);
            }
        });

        TelaMatrizB.setColumns(20);
        TelaMatrizB.setRows(5);
        jScrollPane3.setViewportView(TelaMatrizB);

        TelaResultado.setColumns(20);
        TelaResultado.setRows(5);
        jScrollPane4.setViewportView(TelaResultado);

        Soma.setText("Soma");
        Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SomaActionPerformed(evt);
            }
        });

        subtracao.setText("Subtracao");
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        multplicacao.setText("multipl");
        multplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multplicacaoActionPerformed(evt);
            }
        });

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Tela1A)
                                            .addComponent(Tela2A, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(AdicionarMatrizA)
                                        .addGap(33, 33, 33)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(198, 198, 198)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Tela1B)
                                                    .addComponent(Tela2B, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel6)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(216, 216, 216)
                                                .addComponent(AdicionarMatrizB))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(Soma)
                                .addGap(79, 79, 79)
                                .addComponent(subtracao)
                                .addGap(65, 65, 65)
                                .addComponent(multplicacao))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(Tela2A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tela1A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(46, 46, 46)))
                        .addGap(31, 31, 31)
                        .addComponent(AdicionarMatrizA))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Tela2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Tela1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(49, 49, 49))))
                        .addGap(31, 31, 31)
                        .addComponent(AdicionarMatrizB)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multplicacao)
                    .addComponent(subtracao)
                    .addComponent(Soma))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tela2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tela2AActionPerformed
        // Tela das colunas da matriz do segundo método
    }//GEN-LAST:event_Tela2AActionPerformed

    private void Tela1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tela1AActionPerformed
        // Tela das filas da matriz do segundo método
    }//GEN-LAST:event_Tela1AActionPerformed

    private void AdicionarMatrizAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarMatrizAActionPerformed
        //Botão para adcionar a matrizA do segundo método
        if((Tela1A.getText().length()>0) && (Tela2A.getText().length()>0)){//verificando os dados da fila e coluna
            if( !esNumero(Tela1A.getText()) || !esNumero(Tela2A.getText()) ){//verificando se é númerico ou não
               JOptionPane.showInputDialog(this, "Apenas valor numérico");
               return;
            }
            int filas = Integer.parseInt(Tela1A.getText());
            int colunas = Integer.parseInt(Tela2A.getText());
            a = new Matriz2(filas, colunas);
            
            for(int i=0; i<filas; i++){
                for(int j=0;  j<colunas; j++){
                    int dados = Integer.parseInt(JOptionPane.showInputDialog("Insere números para a posição: ["+i+" "+j+" ]: "));
                    a.Inserir(i, j, dados);
                }
            }
            TelaMatrizA.setText(a.imprimir());
        }
        else{
            JOptionPane.showMessageDialog(this, "Insere números das filas e colunas da Matriz: ");
        }        
    }//GEN-LAST:event_AdicionarMatrizAActionPerformed

    private void Tela1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tela1BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tela1BActionPerformed

    private void Tela2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tela2BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tela2BActionPerformed

    private void AdicionarMatrizBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarMatrizBActionPerformed
         //Botão para adcionar a matrizB do segundo método
        if((Tela1B.getText().length()>0) && (Tela2B.getText().length()>0)){//verificando os dados da fila e coluna
            if( !esNumero(Tela1B.getText()) || !esNumero(Tela2B.getText()) ){//verificando se é númerico ou não
               JOptionPane.showInputDialog(this, "Apenas valor numérico");
               return;
            }
            int filas = Integer.parseInt(Tela1B.getText());
            int colunas = Integer.parseInt(Tela2B.getText());
            b = new Matriz2(filas, colunas);
            
            for(int i=0; i<filas; i++){
                for(int j=0;  j<colunas; j++){
                    int dados = Integer.parseInt(JOptionPane.showInputDialog("Insere números para a posição: ["+i+" "+j+" ]: "));
                    b.Inserir(i, j, dados);
                }
            }
            TelaMatrizB.setText(b.imprimir());
        }
        else{
            JOptionPane.showMessageDialog(this, "Insere números das filas e colunas da Matriz: ");
        }        
    }//GEN-LAST:event_AdicionarMatrizBActionPerformed

    private void multplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multplicacaoActionPerformed
        //Multiplicando as matrizes...
        if((a==null) || (b==null)){ //verificando os dados da matriz
            JOptionPane.showMessageDialog(this, "Adiciona valor na matriz");
            return;
        }
        if(a.getColunas()==b.getFilas()){//Só da pra multiplicar matrizes qndo obedece essa condicao
            double[][] res = multiplicar(a.getM(), b.getM());
            TelaResultado.setText(Arrays.deepToString(res));
        }
        else{
            TelaResultado.setText("erro");
        }
    }//GEN-LAST:event_multplicacaoActionPerformed

    private void SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SomaActionPerformed
        //Somando matrizes....
        if((a==null) || (b==null)){ //verificando os dados da matriz
            JOptionPane.showMessageDialog(this, "Adiciona valor na matriz");
            return;
        }
        if(a.getColunas()==b.getFilas()){
            double[][] res = somar(a.getM(), b.getM());
            TelaResultado.setText(Arrays.deepToString(res));
        }
        else{
            TelaResultado.setText("erro");
        }
    }//GEN-LAST:event_SomaActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        //Subtração de matrizes
        if((a==null) || (b==null)){ //verificando os dados da matriz
            JOptionPane.showMessageDialog(this, "Adiciona valor na matriz");
            return;
        }
        if(a.getColunas()==b.getFilas()){
            double[][] res = subtrair(a.getM(), b.getM());
            TelaResultado.setText(Arrays.deepToString(res));
        }
        else{
            TelaResultado.setText("erro");
        }
    }//GEN-LAST:event_subtracaoActionPerformed
  //........................................................................................//  
//.......  método da criação de matrizes ....//
    public class Matriz2{
        int filas;
        int colunas;
        double [][] matriz;
        //....Matriz...  
        public double[][] getM(){//recebe
            return matriz;
        }
        public void setM(double[][] m){//mostra
            this.matriz = m;
        }
        //...filas...
        public int getFilas(){//recebe
            return filas;
        }
        public void setFilas(int filas){ //mostra
            this.filas = filas;
        }
        //...colunas...
        public int getColunas(){//recebe
            return colunas;
        }
        public void setColunas(int colunas){//mostra
            this.colunas = colunas;
        }
        //.........Construindo a matriz..........
        public Matriz2(int filas, int colunas){
            this.filas = filas;
            this.colunas = colunas;
            this.matriz = new double[filas][colunas];
        }
        public void Inserir(int fila, int coluna, int dados){
            this.matriz[fila][coluna] = dados;
        }
        public String imprimir(){
            String ver = "";
            for(int f=0; f<this.filas; f++){
                ver=ver+"[  ";
                for(int c=0; c<this.colunas; c++){
                    ver = ver + String.valueOf(matriz[f][c]) +"  ";
                }
                ver=ver+" ]\n";
            }
            return ver;
        }
    }
    //método para somar matrizes...
    public double[][]somar(double[][] a, double[][] b){
        double[][] soma = new double[a.length][b.length];
            for(int l=0; l<a.length; l++){
                for(int c=0; c<b.length; c++){
                    soma[l][c] = a[l][c] + b[l][c]; //formula para soma de matrizes                    
                }
                
            }
    return soma;
    }
    //método para subtrair matrizes...
    public double[][]subtrair(double[][] a, double[][] b){
        double[][] sub = new double[a.length][b.length];
            for(int l=0; l<a.length; l++){
                for(int c=0; c<b.length; c++){
                    sub[l][c] = a[l][c] - b[l][c]; //formula para soma de matrizes                    
                }
            }
    return sub;
    }
    //Método para multiplicar...
    public double[][]multiplicar(double[][] a, double[][] b){
        double[][] c = new double[a.length][b[0].length];
        if(a[0].length == b.length){
            for(int i=0; i<a.length; i++){
                for(int j=0; j<b[0].length; j++){
                    for(int k=0; k<a[0].length; k++){
                        c[i][j] += a[i][k] * b[k][j]; //formula da mult de matrizes
                    }
                }
            }
        }return c;
    }
    
    private static boolean esNumero(String cadeia){//Método privado para comprovar se é numério ou não
        try{
            Double.parseDouble(cadeia); 
            return true;
        }catch(NumberFormatException erro){
            return false;
        }
    }
//----------------------------------------------------------------------------------------------------//
    /*** @param args the command line arguments*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarMatrizA;
    private javax.swing.JButton AdicionarMatrizB;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton multplicacao;
    private javax.swing.JButton subtracao;
    // End of variables declaration//GEN-END:variables
}
