package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PesquisaManutencaoVeiculos extends javax.swing.JFrame {

    public PesquisaManutencaoVeiculos() {
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

        ManutencaoVeiculo manutencaoVeiculo;
        
         public PesquisaManutencaoVeiculos(Connection conn, 
        
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

        
                 ManutencaoVeiculo manutencaoVeiculo) {
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

        
        this.manutencaoVeiculo = manutencaoVeiculo;
        
        BSelecionarManutencaoVeiculo.setEnabled(false);

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaManutencaoVeiculo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TFPesquisaManutencaoVeiculo = new javax.swing.JTextField();
        BBuscarManutencaoVeiculo = new javax.swing.JButton();
        BVoltarOrdemEntrega = new javax.swing.JButton();
        BSelecionarManutencaoVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Manutenção de Veículos");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        TConsultaManutencaoVeiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TConsultaManutencaoVeiculo);

        jLabel2.setText("Orçamento");

        BBuscarManutencaoVeiculo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarManutencaoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarManutencaoVeiculo.setText("Buscar");
        BBuscarManutencaoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarManutencaoVeiculoActionPerformed(evt);
            }
        });

        BVoltarOrdemEntrega.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BVoltarOrdemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltarOrdemEntrega.setText("Voltar");
        BVoltarOrdemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarOrdemEntregaActionPerformed(evt);
            }
        });

        BSelecionarManutencaoVeiculo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BSelecionarManutencaoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarManutencaoVeiculo.setText("Inserir");
        BSelecionarManutencaoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarManutencaoVeiculoActionPerformed(evt);
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
                                .addComponent(TFPesquisaManutencaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BBuscarManutencaoVeiculo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BSelecionarManutencaoVeiculo)
                                .addGap(227, 227, 227)
                                .addComponent(BVoltarOrdemEntrega)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFPesquisaManutencaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarManutencaoVeiculo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarOrdemEntrega)
                    .addComponent(BSelecionarManutencaoVeiculo))
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

    private void BBuscarManutencaoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarManutencaoVeiculoActionPerformed
   DefaultTableModel m = (DefaultTableModel) 
        TConsultaManutencaoVeiculo.getModel();
        
            while(TConsultaManutencaoVeiculo.getRowCount() > 0){
                m.removeRow(0);
            }
            
            String orcamento = TFPesquisaManutencaoVeiculo.getText();
            
             try{
                  Statement stmt = conn.createStatement();
                  ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM manutencaoveiculo WHERE Orcamento LIKE '"+orcamento+"%' ORDER BY Orcamento");

            while(rs.next()){
               
                String orcamento1 = rs.getString("Orcamento");
                String dataEntrada = rs.getString("dataEntrada");
   
               m.addRow(new Object[] {orcamento1, dataEntrada});
            }
            }catch(Exception e){ 
                System.out.println(
             "Error ao consultar Clientes: "+e.getMessage());
            }
            BSelecionarManutencaoVeiculo.setEnabled(true);

    }//GEN-LAST:event_BBuscarManutencaoVeiculoActionPerformed

    private void BSelecionarManutencaoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarManutencaoVeiculoActionPerformed

        String OrcamentoManutencaoVeiculo = TConsultaManutencaoVeiculo.getValueAt(TConsultaManutencaoVeiculo.getSelectedRow(), 0).toString();
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT f.codigo, f.nome, f.fantasia, f.cnpj, f.inscEstadual, f.telefone1, "
                        + " f.telefone2, f.fax, mv.codigo, mv.dataentrada, mv.reparo1, mv.reparo2,"
                        + "mv.reparo3, mv.orcamento, mv.datasaida, mv.observacao, "
                        + "v.codigo, v.placa, v.tipoveiculo, v.fabricacao, v.modelo, v.ano,"
                        + "v.renavam, v.chassi FROM Fornecedor f, manutencaoveiculo mv , Veiculo v"
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
                
                        manutencaoVeiculo.TFCodigoFornecedor.setText(""+fcodigo);
                        manutencaoVeiculo.TFNomeFornecedor.setText(fnome);
                        manutencaoVeiculo.TFFantasiaFornecedor.setText(ffantasia);
                        manutencaoVeiculo.TFCNPJFornecedor.setText(fcnpj);
                        manutencaoVeiculo.TFInscEstadualFornecedor.setText(finscEstadual);
                        manutencaoVeiculo.TFTelefone1Fornecedor.setText(ftelefone1);
                        manutencaoVeiculo.TFTelefone2Fornecedor.setText(ftelefone2);
                        manutencaoVeiculo.TFFaxFornecedor.setText(ffax);
                        
                int Vcodigo = rs.getInt("v.codigo");
                String Vplaca = rs.getString("v.placa");
                String VtipoVeiculo = rs.getString("v.tipoVeiculo");
                String Vfabricacao = rs.getString("v.Fabricacao");
                String Vmodelo = rs.getString("v.Modelo");
                String Vano = rs.getString("v.ano");
                String Vrenavam = rs.getString("v.renavam");
                String Vchassi = rs.getString("v.chassi");
                

                        manutencaoVeiculo.TFCodigoVeiculo.setText(""+Vcodigo);
                        manutencaoVeiculo.TFPlacaVeiculo1.setText(Vplaca);
                        manutencaoVeiculo.CBTipoVeiculo1.setSelectedItem(VtipoVeiculo);
                        manutencaoVeiculo.TFFabricante1.setText(Vfabricacao);
                        manutencaoVeiculo.TFModeloVeiculo1.setText(Vmodelo);
                        manutencaoVeiculo.TFAnoVeiculo1.setText(Vano);
                        manutencaoVeiculo.TFRenavam1.setText(Vrenavam);
                        manutencaoVeiculo.TFChassi1.setText(Vchassi);
                        
                        
                int mvcodigo = rs.getInt("mv.codigo");
                String mvdataEntrada = rs.getString("mv.dataEntrada");
                String mvreparo1 = rs.getString("mv.reparo1");
                String mvreparo2 = rs.getString("mv.reparo2");
                String mvreparo3 = rs.getString("mv.reparo3");
                String mvorcamento = rs.getString("mv.orcamento");
                String mvdataSaida = rs.getString("mv.dataSaida");
                String mvobservacao = rs.getString("mv.observacao");
                
                        manutencaoVeiculo.TFCodigoManutencaoVeiculos.setText(""+mvcodigo);
                        manutencaoVeiculo.TFDataEntrada.setText(mvdataEntrada);
                        manutencaoVeiculo.CBReparo1.setSelectedItem(mvreparo1);
                        manutencaoVeiculo.CBReparo2.setSelectedItem(mvreparo2);
                        manutencaoVeiculo.CBReparo3.setSelectedItem(mvreparo3);
                        manutencaoVeiculo.TFOrcamento.setText( mvorcamento);
                        manutencaoVeiculo.TFDataSaida.setText(mvdataSaida);
                        manutencaoVeiculo.TAObservacoes.setText(mvobservacao);
                        
                            manutencaoVeiculo.TFCodigoFornecedor.setEnabled(false);
                            manutencaoVeiculo.TFNomeFornecedor.setEnabled(false);
                            manutencaoVeiculo.TFFantasiaFornecedor.setEnabled(false);
                            manutencaoVeiculo.TFCNPJFornecedor.setEnabled(false);
                            manutencaoVeiculo.TFInscEstadualFornecedor.setEnabled(false);
                            manutencaoVeiculo.TFTelefone1Fornecedor.setEnabled(false);
                            manutencaoVeiculo.TFTelefone2Fornecedor.setEnabled(false);
                            manutencaoVeiculo.TFFaxFornecedor.setEnabled(false);
                            manutencaoVeiculo.LCodigoFornecedor.setVisible(false);
                            manutencaoVeiculo.TFCodigoFornecedor.setVisible(false);

                            manutencaoVeiculo. TFCodigoVeiculo.setEnabled(false);
                            manutencaoVeiculo.TFPlacaVeiculo1.setEnabled(false);
                            manutencaoVeiculo.CBTipoVeiculo1.setEnabled(false);
                            manutencaoVeiculo.TFFabricante1.setEnabled(false);
                            manutencaoVeiculo.TFModeloVeiculo1.setEnabled(false);
                            manutencaoVeiculo.TFAnoVeiculo1.setEnabled(false);
                            manutencaoVeiculo.TFRenavam1.setEnabled(false);
                            manutencaoVeiculo.TFChassi1.setEnabled(false);
                            manutencaoVeiculo.LCodigoVeiculo.setVisible(false);
                            manutencaoVeiculo.TFCodigoVeiculo.setVisible(false);

                            manutencaoVeiculo.LCodigoManutencaoVeiculo.setVisible(false);
                            manutencaoVeiculo.TFCodigoManutencaoVeiculos.setVisible(false);
                            manutencaoVeiculo.TFDataEntrada.setEnabled(true);
                            manutencaoVeiculo.CBReparo1.setEnabled(true);
                            manutencaoVeiculo.CBReparo2.setEnabled(true);
                            manutencaoVeiculo.CBReparo3.setEnabled(true);
                            manutencaoVeiculo.TFOrcamento.setEnabled(true);
                            manutencaoVeiculo.TFDataSaida.setEnabled(true);
                            manutencaoVeiculo. TAObservacoes.setEnabled(true);

                            manutencaoVeiculo.BBuscarFornecedor.setEnabled(true);
                            manutencaoVeiculo.BInserirManutencaoVeiculo.setEnabled(false);                        
                            manutencaoVeiculo.BLimparManutencaoVeiculo.setEnabled(true);
                            manutencaoVeiculo.BAtualizarManutencaoVeiculo.setEnabled(true);
                            manutencaoVeiculo.BExcluirManutencaoVeiculo.setEnabled(true);
                            manutencaoVeiculo.BBuscarFornecedor.setEnabled(true);
                            manutencaoVeiculo.BBuscarVeiculo.setEnabled(true);

            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Manutencao Veiculo: "+e.getMessage());
        }
        
        this.dispose();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarManutencaoVeiculoActionPerformed

    private void BVoltarOrdemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarOrdemEntregaActionPerformed
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarOrdemEntregaActionPerformed
 
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
            java.util.logging.Logger.getLogger(PesquisaManutencaoVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaManutencaoVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaManutencaoVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaManutencaoVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaManutencaoVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBuscarManutencaoVeiculo;
    public javax.swing.JButton BSelecionarManutencaoVeiculo;
    public javax.swing.JButton BVoltarOrdemEntrega;
    public javax.swing.JTable TConsultaManutencaoVeiculo;
    public javax.swing.JTextField TFPesquisaManutencaoVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
