package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PesquisaManutencaoCombustivel extends javax.swing.JFrame {

    public PesquisaManutencaoCombustivel() {
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
        String DataAbastecimnto;
        String Kilometragem;
        String TipoCombustivel;
        String Litros;
        String TotalPago;
        String Observacao;

        ManutencaoCombustivel manutencaoCombustivel;
        
         public PesquisaManutencaoCombustivel(Connection conn, 
        
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
        String DataAbastecimnto,
        String Kilometragem,
        String TipoCombustivel,
        String Litros,
        String TotalPago,
        String Observacao,

        
                 ManutencaoCombustivel manutencaoCombustivel) {
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
        this.DataAbastecimnto = DataAbastecimnto;
        this.Kilometragem = Kilometragem;
        this.TipoCombustivel = TipoCombustivel;
        this.Litros = Litros;
        this.TotalPago = TotalPago;
        this.Observacao = Observacao;
        
        this.manutencaoCombustivel = manutencaoCombustivel;
        
        BSelecionarManutencaoCombustivel.setEnabled(false);

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaManutencaoCombustivel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TFPesquisaManutencaoCombustivel = new javax.swing.JTextField();
        BBuscarManutencaoCombustivel = new javax.swing.JButton();
        BVoltarManutencaoCombustivel = new javax.swing.JButton();
        BSelecionarManutencaoCombustivel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Controle de Combustivel");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        TConsultaManutencaoCombustivel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TConsultaManutencaoCombustivel);

        jLabel2.setText("Orçamento");

        BBuscarManutencaoCombustivel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarManutencaoCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarManutencaoCombustivel.setText("Buscar");
        BBuscarManutencaoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarManutencaoCombustivelActionPerformed(evt);
            }
        });

        BVoltarManutencaoCombustivel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BVoltarManutencaoCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltarManutencaoCombustivel.setText("Voltar");
        BVoltarManutencaoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarManutencaoCombustivelActionPerformed(evt);
            }
        });

        BSelecionarManutencaoCombustivel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BSelecionarManutencaoCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarManutencaoCombustivel.setText("Inserir");
        BSelecionarManutencaoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarManutencaoCombustivelActionPerformed(evt);
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
                                .addComponent(TFPesquisaManutencaoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BBuscarManutencaoCombustivel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BSelecionarManutencaoCombustivel)
                                .addGap(18, 18, 18)
                                .addComponent(BVoltarManutencaoCombustivel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFPesquisaManutencaoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarManutencaoCombustivel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarManutencaoCombustivel)
                    .addComponent(BSelecionarManutencaoCombustivel))
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

    private void BBuscarManutencaoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarManutencaoCombustivelActionPerformed
  
        
        DefaultTableModel m = (DefaultTableModel) 
        TConsultaManutencaoCombustivel.getModel();
        
            while(TConsultaManutencaoCombustivel.getRowCount() > 0){
                m.removeRow(0);
            }
            
            String orcamento = TFPesquisaManutencaoCombustivel.getText();
            
             try{
                  Statement stmt = conn.createStatement();
                  ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM controleCombustivel WHERE totalpago LIKE '"+orcamento+"%' ORDER BY totalPago");

            while(rs.next()){
               
                String orcamento1 = rs.getString("TotalPago");
                String dataEntrada = rs.getString("dataAbastecimento");
   
               m.addRow(new Object[] {orcamento1, dataEntrada});
            }
            }catch(Exception e){ 
                System.out.println(
             "Error ao consultar Controle de Combustivel: "+e.getMessage());
            }
             
             BSelecionarManutencaoCombustivel.setEnabled(true);

    }//GEN-LAST:event_BBuscarManutencaoCombustivelActionPerformed

    private void BSelecionarManutencaoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarManutencaoCombustivelActionPerformed

        String OrcamentoManutencaoCombustivel = TConsultaManutencaoCombustivel.getValueAt(TConsultaManutencaoCombustivel.getSelectedRow(), 0).toString();
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT f.codigo, "
                        + "f.nome, "
                        + "f.fantasia, "
                        + "f.cnpj, "
                        + "f.inscEstadual, "
                        + "f.telefone1, "
                        + " f.telefone2, "
                        + "f.fax, "
                        + "mv.codigo, "
                        + "mv.dataAbastecimento, "
                        + "mv.kilometro, "
                        + "mv.tipoCombustivel,"
                        + "mv.Litros, "
                        + "mv.Totalpago, "
                        + "mv.observacao, "
                        + "v.codigo, "
                        + "v.placa, "
                        + "v.tipoveiculo, "
                        + "v.fabricacao, "
                        + "v.modelo, "
                        + "v.ano,"
                        + "v.renavam, "
                        + "v.chassi "
                        + "     FROM Fornecedor f, "
                        + "controleCombustivel mv , "
                        + "Veiculo v"
                        + "     WHERE totalPago "
                        + "     LIKE '"+OrcamentoManutencaoCombustivel+"%' "
                        + "     AND v.codigo = mv.codVeiculo"
                        + "     AND f.codigo = mv.codFornecedor");

            while(rs.next()){
                
                int fcodigo = rs.getInt("f.codigo");
                String fnome = rs.getString("f.nome");
                String ffantasia = rs.getString("f.fantasia");
                String fcnpj = rs.getString("f.cnpj");
                String finscEstadual = rs.getString("f.inscEstadual");
                String ftelefone1 = rs.getString("f.telefone1");
                String ftelefone2 = rs.getString("f.telefone2");
                String ffax = rs.getString("f.fax");
                
                        manutencaoCombustivel.TFCodigoFornecedorCombustivel.setText(""+fcodigo);
                        manutencaoCombustivel.TFNomeFornecedor1.setText(fnome);
                        manutencaoCombustivel.TFFantasiaFornecedor1.setText(ffantasia);
                        manutencaoCombustivel.TFCNPJFornecedor1.setText(fcnpj);
                        manutencaoCombustivel.TFInscEstadualFornecedor1.setText(finscEstadual);
                        manutencaoCombustivel.TFTelefone1Fornecedor1.setText(ftelefone1);
                        manutencaoCombustivel.TFTelefone2Fornecedor1.setText(ftelefone2);
                        manutencaoCombustivel.TFFaxFornecedor1.setText(ffax);
                        
                int Vcodigo = rs.getInt("v.codigo");
                String Vplaca = rs.getString("v.placa");
                String VtipoVeiculo = rs.getString("v.tipoVeiculo");
                String Vfabricacao = rs.getString("v.Fabricacao");
                String Vmodelo = rs.getString("v.Modelo");
                String Vano = rs.getString("v.ano");
                String Vrenavam = rs.getString("v.renavam");
                String Vchassi = rs.getString("v.chassi");
                

                        manutencaoCombustivel.TFCodigoVeiculosCombustivel.setText(""+Vcodigo);
                        manutencaoCombustivel.TFPlacaVeiculo2.setText(Vplaca);
                        manutencaoCombustivel.CBTipoVeiculo2.setSelectedItem(VtipoVeiculo);
                        manutencaoCombustivel.TFFabricanteVeiculo2.setText(Vfabricacao);
                        manutencaoCombustivel.TFModeloVeiculo2.setText(Vmodelo);
                        manutencaoCombustivel.TFAnoVeiculo2.setText(Vano);
                        manutencaoCombustivel.TFRenavam2.setText(Vrenavam);
                        manutencaoCombustivel.TFChassi2.setText(Vchassi);
                        
                        
                int mvcodigo = rs.getInt("mv.codigo");
                String mvdataCombustivel = rs.getString("mv.dataAbastecimento");
                String mvKilometro = rs.getString("mv.kilometro");
                String mvtipoCombustivel = rs.getString("mv.tipoCombustivel");
                String mvLitros = rs.getString("mv.Litros");
                String mvTotalPago = rs.getString("mv.TotalPago");
                String mvobservacao = rs.getString("mv.Observacao");
                
                        manutencaoCombustivel.TFCodigoManutencaoCombustivel.setText(""+mvcodigo);
                        manutencaoCombustivel.TFDataAbastecimento.setText(mvdataCombustivel);
                        manutencaoCombustivel.CBCombustivel.setSelectedItem(mvtipoCombustivel);
                        manutencaoCombustivel.TFKilometragem.setText(mvKilometro);
                        manutencaoCombustivel.TFLitros.setText( mvLitros);
                        manutencaoCombustivel.TFTotalPagar.setText(mvTotalPago);
                        manutencaoCombustivel.TAObservacoes.setText(mvobservacao);
                        
                        manutencaoCombustivel.TFCodigoManutencaoCombustivel.setEnabled(false);
                        manutencaoCombustivel.TFNomeFornecedor1.setEnabled(false);
                        manutencaoCombustivel.TFFantasiaFornecedor1.setEnabled(false);
                        manutencaoCombustivel.TFCNPJFornecedor1.setEnabled(false);
                        manutencaoCombustivel.TFInscEstadualFornecedor1.setEnabled(false);
                        manutencaoCombustivel.TFTelefone1Fornecedor1.setEnabled(false);
                        manutencaoCombustivel.TFTelefone2Fornecedor1.setEnabled(false);
                        manutencaoCombustivel.TFFaxFornecedor1.setEnabled(false);
                        manutencaoCombustivel.LCodigoManutencaoCombustivel.setVisible(false);
                        manutencaoCombustivel.TFCodigoManutencaoCombustivel.setVisible(false);
                        
                        manutencaoCombustivel.TFCodigoVeiculosCombustivel.setEnabled(false);
                        manutencaoCombustivel.TFPlacaVeiculo2.setEnabled(false);
                        manutencaoCombustivel.CBTipoVeiculo2.setEnabled(false);
                        manutencaoCombustivel.TFFabricanteVeiculo2.setEnabled(false);
                        manutencaoCombustivel.TFModeloVeiculo2.setEnabled(false);
                        manutencaoCombustivel.TFAnoVeiculo2.setEnabled(false);
                        manutencaoCombustivel.TFRenavam2.setEnabled(false);
                        manutencaoCombustivel.TFChassi2.setEnabled(false);
                        manutencaoCombustivel.LCodigoVeiculoCombustivel.setVisible(false);
                        manutencaoCombustivel.TFCodigoVeiculosCombustivel.setVisible(false);
                                             
                        manutencaoCombustivel.LCodigoManutencaoCombustivel.setVisible(false);
                        manutencaoCombustivel.TFCodigoManutencaoCombustivel.setVisible(false);
                        manutencaoCombustivel.TFDataAbastecimento.setEnabled(true);
                        manutencaoCombustivel.TFKilometragem.setEnabled(true);
                        manutencaoCombustivel.CBCombustivel.setEnabled(true);
                        manutencaoCombustivel.TFLitros.setEnabled(true);
                        manutencaoCombustivel.TFTotalPagar.setEnabled(true);
                        manutencaoCombustivel.TAObservacoes.setEnabled(true);
                        
                       
                        manutencaoCombustivel.BInserirManutencaoCombustivel.setEnabled(false);                        
                        manutencaoCombustivel.BLimparManutencaoCombustivel.setEnabled(true);
                        manutencaoCombustivel.BAtualizarManutencaoCombustivel.setEnabled(true);
                        manutencaoCombustivel.BExcluirManutencaoCombustivel.setEnabled(true);
                        manutencaoCombustivel.BInserirDadosManutencaoCombustivel.setEnabled(true);
                        
                        
                       
            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Manutencao Veiculo: "+e.getMessage());
        }
        
        this.dispose();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarManutencaoCombustivelActionPerformed

    private void BVoltarManutencaoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarManutencaoCombustivelActionPerformed
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarManutencaoCombustivelActionPerformed
 
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
            java.util.logging.Logger.getLogger(PesquisaManutencaoCombustivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaManutencaoCombustivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaManutencaoCombustivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaManutencaoCombustivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaManutencaoCombustivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBuscarManutencaoCombustivel;
    public javax.swing.JButton BSelecionarManutencaoCombustivel;
    public javax.swing.JButton BVoltarManutencaoCombustivel;
    public javax.swing.JTable TConsultaManutencaoCombustivel;
    public javax.swing.JTextField TFPesquisaManutencaoCombustivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
