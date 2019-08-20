package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PesquisaOrdemEntrega extends javax.swing.JFrame {

    public PesquisaOrdemEntrega() {
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
        String NomeD;
        String CNPJD;
        String EnderecoD;
        String NumEnderecoD;
        String BairroD;
        String CidadeD;
        String EstadoD;
        String Nome;
        String CNPJ;
        String Endereco;
        String NumEndereco;
        String Bairro;
        String Cidade;
        String Estado;
        String TipoMercadoria;
        String Quantidade;
        String Especie;
        String MetroCubico; 
        String Peso;
        String NotaFiscal;
        String Observacao;

        OrdemEntrega ordemEntrega;
        
         public PesquisaOrdemEntrega(Connection conn, 
        
         String Placa,
        String TipoVeiculo,
        String Fabricacao,
        String Modelo,
        String Ano,
        String Renavam,
        String Chassi,
        String DNome, 
        String DCNPJ, 
        String DEndereco, 
        String DNumEndereco, 
        String DBairro, 
        String DCidade,
        String DEstado,
        String Nome, 
        String CNPJ, 
        String Endereco, 
        String NumEndereco, 
        String Bairro, 
        String Cidade,
        String Estado,
        String TipoMercadoria, 
        String Quantidade, 
        String Especie, 
        String MetroCubico, 
        String Peso, 
        String NotaFiscal,
        String Observacao,

        
                 OrdemEntrega ordemEntrega) {
        initComponents();
        
        this.conn = conn;
        this.Placa = Placa;
        this.TipoVeiculo = TipoVeiculo;
        this.Fabricacao= Fabricacao;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Renavam = Renavam;
        this.Chassi = Chassi;
        this.NomeD = DNome;
        this.CNPJD = DCNPJ;
        this.EnderecoD = DEndereco;
        this.NumEnderecoD = DNumEndereco;
        this.BairroD = DBairro;
        this.CidadeD = DCidade;
        this.EstadoD = DEstado;
        this.Nome = Nome;
        this.CNPJ = CNPJ;
        this.Endereco = Endereco;
        this.NumEndereco = NumEndereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.TipoMercadoria = TipoMercadoria; 
        this.Quantidade =  Quantidade;
        this.Especie = Especie; 
        this.MetroCubico = MetroCubico;  
        this.Peso = Peso;
        this.NotaFiscal = NotaFiscal; 
        this.Observacao = Observacao;

        
        this.ordemEntrega = ordemEntrega;
        
        BSelecionarOrdemEntrega.setEnabled(false);

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaOrdemEntrega = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TFPesquisaOrdemEntrega = new javax.swing.JTextField();
        BBuscarOrdemEntrega = new javax.swing.JButton();
        BVoltarOrdemEntrega = new javax.swing.JButton();
        BSelecionarOrdemEntrega = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Ordem de Entrega");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        TConsultaOrdemEntrega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nota Fiscal", "Tipo Mercadoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TConsultaOrdemEntrega);

        jLabel2.setText("Nota Fiscal");

        BBuscarOrdemEntrega.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarOrdemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarOrdemEntrega.setText("Buscar");
        BBuscarOrdemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarOrdemEntregaActionPerformed(evt);
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

        BSelecionarOrdemEntrega.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BSelecionarOrdemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarOrdemEntrega.setText("Inserir");
        BSelecionarOrdemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarOrdemEntregaActionPerformed(evt);
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
                                .addComponent(TFPesquisaOrdemEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BBuscarOrdemEntrega))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BSelecionarOrdemEntrega)
                                .addGap(18, 18, 18)
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
                    .addComponent(TFPesquisaOrdemEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarOrdemEntrega))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarOrdemEntrega)
                    .addComponent(BSelecionarOrdemEntrega))
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

    private void BBuscarOrdemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarOrdemEntregaActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaOrdemEntrega.getModel();

        while(TConsultaOrdemEntrega.getRowCount() > 0){
            m.removeRow(0);
        }

        String NotaFiscal = TFPesquisaOrdemEntrega.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM ordemEntrega WHERE notaFiscal LIKE '"+NotaFiscal+"%' ORDER BY notaFiscal");

            while(rs.next()){
                String notaFiscal = rs.getString("notaFiscal");
                String tipomercadoria = rs.getString("tipoMercadoria");

               

                m.addRow(new Object[] {notaFiscal, tipomercadoria});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Ordem Entrega: "+e.getMessage());
        }
        
        BSelecionarOrdemEntrega.setEnabled(true);

    }//GEN-LAST:event_BBuscarOrdemEntregaActionPerformed

    private void BSelecionarOrdemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarOrdemEntregaActionPerformed

        String notaFiscal = TConsultaOrdemEntrega.getValueAt(TConsultaOrdemEntrega.getSelectedRow(), 0).toString();
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT c.codigo, c.nome, c.cnpj, c.endereco, c.numero, c.bairro, c.cidade, c.estado,"
                        + "d.codigo, d.nome, d.cnpj, d.endereco, d.numero, d.bairro, d.cidade, d.estado,"
                        + "v.codigo, v.placa, v.tipoveiculo, v.fabricacao, v.modelo, v.ano, v.renavam, v.chassi,"
                        + "oe.codigo, oe.tipomercadoria, oe.quantMercadoria, oe.especiemerc, oe.peso, oe.metrocubico, oe.notafiscal, oe.observacao "
                        + "FROM Clientes c, Destinatario d, Veiculo v, ordemEntrega oe"
                        + "  WHERE notaFiscal LIKE '"+notaFiscal+"%' AND c.codigo = oe.codCliente AND d.codigo = oe.codDestinatario AND v.codigo = oe.codVeiculo");

            while(rs.next()){
                
                int Dcodigo = rs.getInt("d.codigo");
                String Dnome = rs.getString("d.nome");
                String Dcnpj = rs.getString("d.cnpj");
                String Dendereco = rs.getString("d.Endereco");
                String DNumEnd = rs.getString("d.Numero");
                String Dbairro = rs.getString("d.Bairro");
                String Dcidade = rs.getString("d.Cidade");
                String Destado = rs.getString("d.Estado");
                
                         ordemEntrega.TFCodigoDestinatario.setText(""+Dcodigo);
                        ordemEntrega.TFNomeDestinatario.setText(Dnome);
                        ordemEntrega.TFCNPJDestinatario.setText(Dcnpj);
                        ordemEntrega.TFEnderecoDestinatario.setText(Dendereco);
                        ordemEntrega.TFNumEndDestinatario.setText(DNumEnd);
                        ordemEntrega.TFBairroDestinatario.setText(Dbairro);
                        ordemEntrega.TFCidadeDestinatario.setText(Dcidade);
                        ordemEntrega.CBEstadoDestinatario.setSelectedItem(Destado);
                        
                int Vcodigo = rs.getInt("v.codigo");
                String Vplaca = rs.getString("v.placa");
                String VtipoVeiculo = rs.getString("v.tipoVeiculo");
                String Vfabricacao = rs.getString("v.Fabricacao");
                String Vmodelo = rs.getString("v.Modelo");
                String Vano = rs.getString("v.ano");
                String Vrenavam = rs.getString("v.renavam");
                String Vchassi = rs.getString("v.chassi");
                

                        ordemEntrega.TFCodigoVeiculo.setText(""+Vcodigo);
                        ordemEntrega.TFPlacaVeiculo.setText(Vplaca);
                        ordemEntrega.CBTipoVeiculo.setSelectedItem(VtipoVeiculo);
                        ordemEntrega.CBFabricante.setSelectedItem(Vfabricacao);
                        ordemEntrega.TFModeloVeiculo.setText(Vmodelo);
                        ordemEntrega.TFAnoVeiculo.setText(Vano);
                        ordemEntrega.TFRenavam.setText(Vrenavam);
                        ordemEntrega.TFChassi.setText(Vchassi);
                        
                        
                int Ccodigo = rs.getInt("c.codigo");
                String Cnome = rs.getString("c.nome");
                String Ccnpj = rs.getString("c.CNPJ");
                String Cendereco = rs.getString("c.Endereco");
                String CnumEndereco = rs.getString("c.Numero");
                String Cbairro = rs.getString("c.bairro");
                String Ccidade = rs.getString("c.cidade");
                String Cestado = rs.getString("c.estado");
                
                        ordemEntrega.TFCodigoCliente.setText(""+Ccodigo);
                        ordemEntrega.TFNomeCliente.setText(Cnome);
                        ordemEntrega.TFCNPJCliente.setText(Ccnpj);
                        ordemEntrega.TFEnderecoCliente.setText(Cendereco);
                        ordemEntrega.TFNumEndCliente.setText(CnumEndereco);
                        ordemEntrega.TFBairroCliente.setText(Cbairro);
                        ordemEntrega.TFCidadeCliente.setText(Ccidade);
                        ordemEntrega.CBEstadoCliente.setSelectedItem(Cestado);
                        
                int OEcodigo = rs.getInt("oe.codigo");
                String tipoMercadoria = rs.getString("oe.tipoMercadoria");
                String especieMerc = rs.getString("oe.especieMerc");
                String quantMercadoria = rs.getString("oe.quantMercadoria");
                String peso = rs.getString("oe.peso");
                String metroCubico = rs.getString("oe.metroCubico");
                String notafiscal = rs.getString("oe.notaFiscal");
                String observacao = rs.getString("oe.observacao");
                       
        ordemEntrega.TFCodigoOrdemEntrega.setText(""+OEcodigo);                
        ordemEntrega.TFTipoMercadoria.setText(tipoMercadoria);
        ordemEntrega.TFEspecieMercadoria.setText(especieMerc);
        ordemEntrega.TFQuantidadeMercadoria.setText(quantMercadoria);
        ordemEntrega.TFPesoMercadoria.setText(peso);
        ordemEntrega.TFMetroCubico.setText(metroCubico);
        ordemEntrega.TFNotaFiscal.setText(notafiscal);
        ordemEntrega.TAObservacoes.setText(observacao);
                           
                        ordemEntrega.BLimparOrdemEntrega.setEnabled(true);
                        ordemEntrega.BAtualizarOrdemEntrega.setEnabled(true);
                        ordemEntrega.BExcluirOrdemEntrega.setEnabled(true);
                        
                        ordemEntrega.TFCodigoDestinatario.setEnabled(false);
                        ordemEntrega.TFNomeDestinatario.setEnabled(false);
                        ordemEntrega.TFCNPJDestinatario.setEnabled(false);
                        ordemEntrega.TFEnderecoDestinatario.setEnabled(false);
                        ordemEntrega.TFNumEndDestinatario.setEnabled(false);
                        ordemEntrega.TFBairroDestinatario.setEnabled(false);
                        ordemEntrega.TFCidadeDestinatario.setEnabled(false);
                        ordemEntrega.CBEstadoDestinatario.setEnabled(false);
                        ordemEntrega.LCodigoDestinatario.setVisible(false);
                        ordemEntrega.TFCodigoDestinatario.setVisible(false);
                        
                        ordemEntrega.TFCodigoVeiculo.setEnabled(false);
                        ordemEntrega.TFPlacaVeiculo.setEnabled(false);
                        ordemEntrega.CBTipoVeiculo.setEnabled(false);
                        ordemEntrega.CBFabricante.setEnabled(false);
                        ordemEntrega.TFModeloVeiculo.setEnabled(false);
                        ordemEntrega.TFAnoVeiculo.setEnabled(false);
                        ordemEntrega.TFRenavam.setEnabled(false);
                        ordemEntrega.TFChassi.setEnabled(false);
                        ordemEntrega.LCodigoVeiculo.setVisible(false);
                        ordemEntrega.TFCodigoVeiculo.setVisible(false);
                        
                        ordemEntrega.TFNomeCliente.setEnabled(false);
                        ordemEntrega.TFCNPJCliente.setEnabled(false);
                        ordemEntrega.TFEnderecoCliente.setEnabled(false);
                        ordemEntrega.TFNumEndCliente.setEnabled(false);
                        ordemEntrega.TFBairroCliente.setEnabled(false);
                        ordemEntrega.TFCidadeCliente.setEnabled(false);
                        ordemEntrega.CBEstadoCliente.setEnabled(false);
                        ordemEntrega.LCodigoCliente.setVisible(false);
                        ordemEntrega.TFCodigoCliente.setVisible(false);
                        
                        ordemEntrega.LCodigoOrdemEntrega.setVisible(false);
                        ordemEntrega.TFCodigoOrdemEntrega.setVisible(false);
                        ordemEntrega.TFTipoMercadoria.setEnabled(true);
                        ordemEntrega.TFQuantidadeMercadoria.setEnabled(true);
                        ordemEntrega.TFEspecieMercadoria.setEnabled(true);
                        ordemEntrega.TFPesoMercadoria.setEnabled(true);
                        ordemEntrega.TFMetroCubico.setEnabled(true);
                        ordemEntrega.TFNotaFiscal.setEnabled(true);
                        ordemEntrega.TAObservacoes.setEnabled(true);
                        ordemEntrega.TFNotaFiscal.setVisible(true);
                        
                        ordemEntrega.BBuscaCliente.setEnabled(false);
                        ordemEntrega.BInserirOrdemEntrega.setEnabled(false);                        
                        ordemEntrega.BLimparOrdemEntrega.setEnabled(true);
                        ordemEntrega.BAtualizarOrdemEntrega.setEnabled(true);
                        ordemEntrega.BExcluirOrdemEntrega.setEnabled(true);
                        ordemEntrega.BBuscarDestinatario.setEnabled(false);
                        ordemEntrega.BBuscarVeiculo.setEnabled(false);  
                        ordemEntrega.BGPS.setEnabled(true);
                        ordemEntrega.BImprimir.setEnabled(true); 
                        
                        
        
                  
            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Veiculo: "+e.getMessage());
        }
        
        this.dispose();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarOrdemEntregaActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisaOrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaOrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaOrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaOrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaOrdemEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBuscarOrdemEntrega;
    public javax.swing.JButton BSelecionarOrdemEntrega;
    private javax.swing.JButton BVoltarOrdemEntrega;
    public javax.swing.JTable TConsultaOrdemEntrega;
    public javax.swing.JTextField TFPesquisaOrdemEntrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
