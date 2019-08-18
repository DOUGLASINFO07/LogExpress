package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PesquisaManutencaoPneus extends javax.swing.JFrame {

    public PesquisaManutencaoPneus() {
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
        String Nome;
        String Fantasia;
        String CNPJ;
        String Inscricao;
        String Telefone1;
        String Telefone2;
        String Fax;
        String DataEntrada;
        String Reparo1;
        String Reparo2;
        String Reparo3;
        String Orcamento;
        String DataSaida;
        String Observacao;

        ManutencaoPneus manutencaoPneus;
        
         public PesquisaManutencaoPneus(Connection conn, 
        
        String Placa,
        String TipoVeiculo,
        String Fabricacao,
        String Modelo,
        String Ano,
        String Renavam,
        String Chassi,
        String Nome,
        String Fantasia,
        String CNPJ,
        String Inscricao,
        String Telefone1,
        String Telefone2,
        String Fax,
        String DataEntrada,
        String Reparo1,
        String Reparo2,
        String Reparo3,
        String Orcamento,
        String DataSaida,
        String Observacao,

        
                 ManutencaoPneus manutencaoPneus) {
        initComponents();
        
        this.conn = conn;
        this.Placa = Placa;
        this.TipoVeiculo = TipoVeiculo;
        this.Fabricacao = Fabricacao;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Renavam = Renavam;
        this.Chassi = Chassi;
        this.Nome = Nome;
        this.Fantasia = Fantasia;
        this.CNPJ = CNPJ;
        this.Inscricao = Inscricao;
        this.Telefone1 = Telefone1;
        this.Telefone2 = Telefone2;
        this.Fax = Fax;
        this.DataEntrada = DataEntrada;
        this.Reparo1 = Reparo1;
        this.Reparo2 = Reparo2;
        this.Reparo3 = Reparo3;
        this.Orcamento = Orcamento;
        this.DataSaida = DataSaida;
        this.Observacao = Observacao;

        
        this.manutencaoPneus = manutencaoPneus;
        
        BSelecionarManutencaoPneus.setEnabled(false);

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaManutencaoPneus = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TFPesquisaManutencaoPneus = new javax.swing.JTextField();
        BBuscarManutencaoPneus = new javax.swing.JButton();
        BVoltarManutencaoPneus = new javax.swing.JButton();
        BSelecionarManutencaoPneus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Manutenção de Pneus");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        TConsultaManutencaoPneus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orcamento", "Data Entrada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TConsultaManutencaoPneus);

        jLabel2.setText("Orçamento");

        BBuscarManutencaoPneus.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarManutencaoPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarManutencaoPneus.setText("Buscar");
        BBuscarManutencaoPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarManutencaoPneusActionPerformed(evt);
            }
        });

        BVoltarManutencaoPneus.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BVoltarManutencaoPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltarManutencaoPneus.setText("Voltar");
        BVoltarManutencaoPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarManutencaoPneusActionPerformed(evt);
            }
        });

        BSelecionarManutencaoPneus.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BSelecionarManutencaoPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarManutencaoPneus.setText("Inserir");
        BSelecionarManutencaoPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarManutencaoPneusActionPerformed(evt);
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
                                .addComponent(TFPesquisaManutencaoPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BBuscarManutencaoPneus))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BSelecionarManutencaoPneus)
                                .addGap(18, 18, 18)
                                .addComponent(BVoltarManutencaoPneus)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFPesquisaManutencaoPneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarManutencaoPneus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarManutencaoPneus)
                    .addComponent(BSelecionarManutencaoPneus))
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

    private void BBuscarManutencaoPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarManutencaoPneusActionPerformed
   DefaultTableModel m = (DefaultTableModel) 
        TConsultaManutencaoPneus.getModel();
        
            while(TConsultaManutencaoPneus.getRowCount() > 0){
                m.removeRow(0);
            }
            
            String orcamento = TFPesquisaManutencaoPneus.getText();
            
             try{
                  Statement stmt = conn.createStatement();
                  ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM manutencaopneus WHERE Orcamento LIKE '"+orcamento+"%' ORDER BY Orcamento");

            while(rs.next()){
               
                String orcamento1 = rs.getString("Orcamento");
                String dataEntrada = rs.getString("dataEntrada");
   
               m.addRow(new Object[] {orcamento1, dataEntrada});
            }
            }catch(Exception e){ 
                System.out.println(
             "Error ao consultar Manutencao de Pneus: "+e.getMessage());
            }
             
             BSelecionarManutencaoPneus.setEnabled(true);

    }//GEN-LAST:event_BBuscarManutencaoPneusActionPerformed

    private void BSelecionarManutencaoPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarManutencaoPneusActionPerformed

        String OrcamentoManutencaoVeiculo = TConsultaManutencaoPneus.getValueAt(TConsultaManutencaoPneus.getSelectedRow(), 0).toString();
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT f.codigo, f.nome, f.fantasia, f.cnpj, f.inscEstadual, f.telefone1, "
                        + " f.telefone2, f.fax, mv.codigo, mv.dataentrada, mv.reparo1, mv.reparo2,"
                        + "mv.reparo3, mv.orcamento, mv.datasaida, mv.observacao, "
                        + "v.codigo, v.placa, v.tipoveiculo, v.fabricacao, v.modelo, v.ano,"
                        + "v.renavam, v.chassi FROM Fornecedor f, manutencaopneus mv , Veiculo v"
                        + "  WHERE orcamento LIKE '"+OrcamentoManutencaoVeiculo+"%' AND v.codigo = mv.codVeiculo"
                        + " AND f.codigo = mv.codfornecedor");

            while(rs.next()){
                
                int fcodigo = rs.getInt("f.codigo");
                String fnome = rs.getString("f.nome");
                String ffantasia = rs.getString("f.fantasia");
                String fcnpj = rs.getString("f.cnpj");
                String finscEstadual = rs.getString("f.inscEstadual");
                String ftelefone1 = rs.getString("f.telefone1");
                String ftelefone2 = rs.getString("f.telefone2");
                String ffax = rs.getString("f.fax");
                
                        manutencaoPneus.TFCodigoFornecedorPneus.setText(""+fcodigo);
                        manutencaoPneus.TFNomeFornecedor2.setText(fnome);
                        manutencaoPneus.TFFantasiaFornecedor2.setText(ffantasia);
                        manutencaoPneus.TFCNPJFornecedor2.setText(fcnpj);
                        manutencaoPneus.TFInscEstadualFornecedor2.setText(finscEstadual);
                        manutencaoPneus.TFTelefone1Fornecedor2.setText(ftelefone1);
                        manutencaoPneus.TFTelefone2Fornecedor2.setText(ftelefone2);
                        manutencaoPneus.TFFaxFornecedor2.setText(ffax);
                        
                int Vcodigo = rs.getInt("v.codigo");
                String Vplaca = rs.getString("v.placa");
                String VtipoVeiculo = rs.getString("v.tipoVeiculo");
                String Vfabricacao = rs.getString("v.Fabricacao");
                String Vmodelo = rs.getString("v.Modelo");
                String Vano = rs.getString("v.ano");
                String Vrenavam = rs.getString("v.renavam");
                String Vchassi = rs.getString("v.chassi");
                

                        manutencaoPneus.TFCodigoVeiculosPneus.setText(""+Vcodigo);
                        manutencaoPneus.TFPlacaVeiculo3.setText(Vplaca);
                        manutencaoPneus.CBTipoVeiculo3.setSelectedItem(VtipoVeiculo);
                        manutencaoPneus.TFFabricanteVeiculo3.setText(Vfabricacao);
                        manutencaoPneus.TFModeloVeiculo3.setText(Vmodelo);
                        manutencaoPneus.TFAnoVeiculo3.setText(Vano);
                        manutencaoPneus.TFRenavam3.setText(Vrenavam);
                        manutencaoPneus.TFChassi3.setText(Vchassi);
                        
                        
                int mvcodigo = rs.getInt("mv.codigo");
                String mvdataEntrada = rs.getString("mv.dataEntrada");
                String mvreparo1 = rs.getString("mv.reparo1");
                String mvreparo2 = rs.getString("mv.reparo2");
                String mvreparo3 = rs.getString("mv.reparo3");
                String mvorcamento = rs.getString("mv.orcamento");
                String mvdataSaida = rs.getString("mv.dataSaida");
                String mvobservacao = rs.getString("mv.observacao");
                
                        manutencaoPneus.TFCodigoManutencaoPneus.setText(""+mvcodigo);
                        manutencaoPneus.TFDataEntradaPneus.setText(mvdataEntrada);
                        manutencaoPneus.CBTipoReparo1Pneus.setSelectedItem(mvreparo1);
                        manutencaoPneus.CBTipoReparo2Pneus.setSelectedItem(mvreparo2);
                        manutencaoPneus.CBTipoReparo3Pneus.setSelectedItem(mvreparo3);
                        manutencaoPneus.TFOrcamentoPneus.setText( mvorcamento);
                        manutencaoPneus.TFDataSaidaPneus.setText(mvdataSaida);
                        manutencaoPneus.TAObservacoesPnues.setText(mvobservacao);
                        
                        manutencaoPneus.TFCodigoManutencaoPneus.setEnabled(false);
                        manutencaoPneus.TFNomeFornecedor2.setEnabled(false);
                        manutencaoPneus.TFFantasiaFornecedor2.setEnabled(false);
                        manutencaoPneus.TFCNPJFornecedor2.setEnabled(false);
                        manutencaoPneus.TFInscEstadualFornecedor2.setEnabled(false);
                        manutencaoPneus.TFTelefone1Fornecedor2.setEnabled(false);
                        manutencaoPneus.TFTelefone2Fornecedor2.setEnabled(false);
                        manutencaoPneus.TFFaxFornecedor2.setEnabled(false);
                        manutencaoPneus.LCodigoManutencaoPneus.setVisible(false);
                        manutencaoPneus.TFCodigoManutencaoPneus.setVisible(false);
                        
                        manutencaoPneus.TFCodigoVeiculosPneus.setEnabled(false);
                        manutencaoPneus.TFPlacaVeiculo3.setEnabled(false);
                        manutencaoPneus.CBTipoVeiculo3.setEnabled(false);
                        manutencaoPneus.TFFabricanteVeiculo3.setEnabled(false);
                        manutencaoPneus.TFModeloVeiculo3.setEnabled(false);
                        manutencaoPneus.TFAnoVeiculo3.setEnabled(false);
                        manutencaoPneus.TFRenavam3.setEnabled(false);
                        manutencaoPneus.TFChassi3.setEnabled(false);
                        manutencaoPneus.LCodigoVeiculoPneus.setVisible(false);
                        manutencaoPneus.TFCodigoVeiculosPneus.setVisible(false);
                                             
                        manutencaoPneus.LCodigoManutencaoPneus.setVisible(false);
                        manutencaoPneus.TFCodigoManutencaoPneus.setVisible(false);
                        manutencaoPneus.TFDataEntradaPneus.setEnabled(true);
                        manutencaoPneus.CBTipoReparo1Pneus.setEnabled(true);
                        manutencaoPneus.CBTipoReparo2Pneus.setEnabled(true);
                        manutencaoPneus.CBTipoReparo3Pneus.setEnabled(true);
                        manutencaoPneus.TFOrcamentoPneus.setEnabled(true);
                        manutencaoPneus.TFDataSaidaPneus.setEnabled(true);
                        manutencaoPneus.TAObservacoesPnues.setEnabled(true);
                        
                        manutencaoPneus.BBuscarManutencaoPneus.setEnabled(true);
                        manutencaoPneus.BInserirDadosManutencaoPneus.setEnabled(true);                        
                        manutencaoPneus.BLimparmanutencaoPneus.setEnabled(true);
                        manutencaoPneus.BAtualizarPneus.setEnabled(true);
                        manutencaoPneus.BExcluirPneus.setEnabled(true);
                        manutencaoPneus.BBuscarManutencaoPneus.setEnabled(true);
                        manutencaoPneus.BInserirManutencaoPneus.setEnabled(false);
                           
            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Manutencao Veiculo: "+e.getMessage());
        }
        
        this.dispose();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarManutencaoPneusActionPerformed

    private void BVoltarManutencaoPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarManutencaoPneusActionPerformed
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarManutencaoPneusActionPerformed
 
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
            java.util.logging.Logger.getLogger(PesquisaManutencaoPneus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaManutencaoPneus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaManutencaoPneus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaManutencaoPneus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaManutencaoPneus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBuscarManutencaoPneus;
    public javax.swing.JButton BSelecionarManutencaoPneus;
    public javax.swing.JButton BVoltarManutencaoPneus;
    public javax.swing.JTable TConsultaManutencaoPneus;
    public javax.swing.JTextField TFPesquisaManutencaoPneus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
