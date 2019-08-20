package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PesquisaVeiculo extends javax.swing.JFrame {

    public PesquisaVeiculo() {
        initComponents();
    }
    
    Connection conn;
     
        String Placa;
        String TipoVeiculo;
        String Fabricacao;
        String Modelo;
        String Ano;
        String Renavam;
        String Chassi;
        String TipoPneu;
        String TipoCombustivel;
        String Tara;
        String PesoLiquido;
        String Observacoes;

        CadVeiculo cadVeiculo;
        
         public PesquisaVeiculo(Connection conn, 
                 
        String Placa,
        String TipoVeiculo,
        String Fabricacao,
        String Modelo,
        String Ano,
        String Renavam,
        String Chassi,
        String TipoPneu,
        String TipoCombustivel,
        String Tara,
        String PesoLiquido,
        String Observacoes,
        
                 CadVeiculo cadVeiculo) {
        initComponents();
        
        this.conn = conn;
        this.Placa = Placa;
        this.TipoVeiculo = TipoVeiculo;
        this.Fabricacao= Fabricacao;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Renavam = Renavam;
        this.Chassi = Chassi;
        this.TipoPneu = TipoPneu;
        this.TipoCombustivel = TipoCombustivel;
        this.Tara = Tara;
        this.PesoLiquido = PesoLiquido;
        this.Observacoes = Observacoes;

        this.cadVeiculo = cadVeiculo;
        
        BSelecionarVeiculo.setEnabled(false);

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaVeiculo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TFPesquisaVeiculo = new javax.swing.JTextField();
        BBuscarVeiculo = new javax.swing.JButton();
        BVoltarVeiculo = new javax.swing.JButton();
        BSelecionarVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta de Veículos");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        TConsultaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TConsultaVeiculo);

        jLabel2.setText("Modelo Veículo");

        BBuscarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarVeiculo.setText("Buscar");
        BBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarVeiculoActionPerformed(evt);
            }
        });

        BVoltarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BVoltarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltarVeiculo.setText("Voltar");
        BVoltarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarVeiculoActionPerformed(evt);
            }
        });

        BSelecionarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BSelecionarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarVeiculo.setText("Inserir");
        BSelecionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFPesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BBuscarVeiculo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BSelecionarVeiculo)
                                .addGap(18, 18, 18)
                                .addComponent(BVoltarVeiculo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFPesquisaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarVeiculo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarVeiculo)
                    .addComponent(BSelecionarVeiculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarVeiculoActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaVeiculo.getModel();

        while(TConsultaVeiculo.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeModelo = TFPesquisaVeiculo.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM veiculo WHERE Modelo LIKE '"+NomeModelo+"%' ORDER BY Modelo");

            while(rs.next()){
                String modelo = rs.getString("Modelo");
                String placa = rs.getString("Placa");

               

                m.addRow(new Object[] {modelo, placa});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Veiculo: "+e.getMessage());
        }
        
        BSelecionarVeiculo.setEnabled(true);

    }//GEN-LAST:event_BBuscarVeiculoActionPerformed

    private void BSelecionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarVeiculoActionPerformed

        String NomeModelo = TConsultaVeiculo.getValueAt(TConsultaVeiculo.getSelectedRow(), 0).toString();
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM Veiculo WHERE Modelo LIKE '"+NomeModelo+"%' ORDER BY Modelo");

            while(rs.next()){
                
                int codigo = rs.getInt("codigo");
                String placa = rs.getString("placa");
                String tipoVeiculo = rs.getString("tipoVeiculo");
                String fabricacao = rs.getString("Fabricacao");
                String modelo = rs.getString("Modelo");
                String ano = rs.getString("ano");
                String renavam = rs.getString("renavam");
                String chassi = rs.getString("chassi");
                String tipoPneu = rs.getString("tipoPneu");
                String tipoCombustivel = rs.getString("tipoCombustivel");
                String tara = rs.getString("tara");
                String pesoLiquido = rs.getString("pesoLiquido");
                String observacoes = rs.getString("Observacao");

                        cadVeiculo.TFCodigoVeiculo.setText(""+codigo);
                        cadVeiculo.TFPlacaVeiculo.setText(placa);
                        cadVeiculo.CBTipoVeiculo.setSelectedItem(tipoVeiculo);
                        cadVeiculo.TFFabricante.setText(fabricacao);
                        cadVeiculo.TFModelo.setText(modelo);
                        cadVeiculo.TFAno.setText(ano);
                        cadVeiculo.TFRenavam.setText(renavam);
                        cadVeiculo.TFChassi.setText(chassi);
                        cadVeiculo.TFTipoPneu.setText(tipoPneu);
                        cadVeiculo.CBTipoCombustivel.setSelectedItem(tipoCombustivel);
                        cadVeiculo.TFTara.setText(tara);
                        cadVeiculo.TFPesoLiquido.setText(pesoLiquido);
                        cadVeiculo.TAObservacoes.setText(observacoes);
                        
                        
                        cadVeiculo.TFCodigoVeiculo.setEnabled(false);
                        cadVeiculo.TFPlacaVeiculo.setEnabled(true);
                        cadVeiculo.CBTipoVeiculo.setEnabled(true);
                        cadVeiculo.TFFabricante.setEnabled(true);
                        cadVeiculo.TFModelo.setEnabled(true);
                        cadVeiculo.TFAno.setEnabled(true);
                        cadVeiculo.TFRenavam.setEnabled(true);
                        cadVeiculo.TFChassi.setEnabled(true);
                        cadVeiculo.TFTipoPneu.setEnabled(true);
                        cadVeiculo.CBTipoCombustivel.setEnabled(true);
                        cadVeiculo.TFTara.setEnabled(true);
                        cadVeiculo.TFPesoLiquido.setEnabled(true);
                        cadVeiculo.TAObservacoes.setEnabled(true);
                        
                        cadVeiculo.BInserirVeiculo.setEnabled(false);
                        cadVeiculo.BLimparVeiculo.setEnabled(true);
                        cadVeiculo.BAtualizarVeiculo.setEnabled(true);
                        cadVeiculo.BExcluirVeiculo.setEnabled(true);
                        
                        cadVeiculo.LCodigoVeiculo.setVisible(false);
                        cadVeiculo.TFCodigoVeiculo.setVisible(false);
                
            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Veiculo: "+e.getMessage());
        }
        
        this.dispose();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarVeiculoActionPerformed

    private void BVoltarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarVeiculoActionPerformed
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarVeiculoActionPerformed
 
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
            java.util.logging.Logger.getLogger(PesquisaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBuscarVeiculo;
    public javax.swing.JButton BSelecionarVeiculo;
    private javax.swing.JButton BVoltarVeiculo;
    public javax.swing.JTable TConsultaVeiculo;
    public javax.swing.JTextField TFPesquisaVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
