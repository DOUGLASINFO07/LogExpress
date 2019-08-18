package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PesquisaFornecedor extends javax.swing.JFrame {

    public PesquisaFornecedor() {
        initComponents();
    }
    
    Connection conn;
     
        String Nome;
        String Fantasia;
        String CNPJ;
        String InscEstadual;
        String Telefone1;
        String Telefone2;
        String Fax;
        String Email;
        String Site;
        String Endereco;
        String Numero;
        String Bairro;
        String Cidade;
        String Estado;
        String CEP;
        String Observacoes;

        CadFornecedor cadFornecedor;
        
         public PesquisaFornecedor(Connection conn, 
                 String Nome, 
                 String Fantasia, 
                 String CNPJ, 
                 String InscEstadual, 
                 String Telefone1, 
                 String Telefone2,
                 String Fax, 
                 String Email, 
                 String Site, 
                 String Endereco, 
                 String Numero, 
                 String Bairro, 
                 String Cidade,
                 String Estado, 
                 String CEP, 
                 String Observacoes, 
                 CadFornecedor cadFornecedor) {
        initComponents();
        
        this.conn = conn;
        this.Nome = Nome;
        this.Fantasia = Fantasia;
        this.CNPJ= CNPJ;
        this.InscEstadual = InscEstadual;
        this.Telefone1 = Telefone1;
        this.Telefone2 = Telefone2;
        this.Fax = Fax;
        this.Email = Email;
        this.Site = Site;
        this.Endereco= Endereco;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.CEP = CEP;
        this.Observacoes = Observacoes;

        this.cadFornecedor = cadFornecedor;
        
        BSelecionarFornecedor.setEnabled(false);

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaFornecedor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TFNomePesuisaFornecedor = new javax.swing.JTextField();
        BBuscarFornecedor = new javax.swing.JButton();
        BVoltar = new javax.swing.JButton();
        BSelecionarFornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta de Fornecedor");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        TConsultaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nome Fantasia", "CNPJ / CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TConsultaFornecedor);

        jLabel2.setText("Fornecedor");

        BBuscarFornecedor.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarFornecedor.setText("Buscar");
        BBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarFornecedorActionPerformed(evt);
            }
        });

        BVoltar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltar.setText("Voltar");
        BVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarActionPerformed(evt);
            }
        });

        BSelecionarFornecedor.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BSelecionarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarFornecedor.setText("Inserir");
        BSelecionarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNomePesuisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BBuscarFornecedor))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BSelecionarFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(BVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNomePesuisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarFornecedor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltar)
                    .addComponent(BSelecionarFornecedor))
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

    private void BBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarFornecedorActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaFornecedor.getModel();

        while(TConsultaFornecedor.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeFornecedor = TFNomePesuisaFornecedor.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM fornecedor WHERE nome LIKE '"+NomeFornecedor+"%' ORDER BY Nome");

            while(rs.next()){
                String nome = rs.getString("nome");
                String fantasia = rs.getString("Fantasia");
                String cnpj = rs.getString("CNPJ");
               

                m.addRow(new Object[] {nome, fantasia,cnpj});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Fornecedor: "+e.getMessage());
        }
        
        BSelecionarFornecedor.setEnabled(true);

    }//GEN-LAST:event_BBuscarFornecedorActionPerformed

    private void BSelecionarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarFornecedorActionPerformed

        String NomeFornecedor = TConsultaFornecedor.getValueAt(TConsultaFornecedor.getSelectedRow(), 0).toString();
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM fornecedor WHERE nome LIKE '"+NomeFornecedor+"%' ORDER BY Nome");

            while(rs.next()){
                
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String fantasia = rs.getString("fantasia");
                String cnpj = rs.getString("cnpj");
                String inscEstadual = rs.getString("inscEstadual");
                String telefone1 = rs.getString("telefone1");
                String telefone2 = rs.getString("telefone2");
                String fax = rs.getString("fax");
                String email = rs.getString("email");
                String site = rs.getString("site");
                String Endereco = rs.getString("Endereco");
                String NumEnd = rs.getString("Numero");
                String Bairro = rs.getString("Bairro");
                String Cidade = rs.getString("Cidade");
                String Estado = rs.getString("Estado");
                String CEP = rs.getString("CEP");
                String Observacoes = rs.getString("Observacoes");
                
                
                        cadFornecedor.TFCodigoFornecedor.setText(""+codigo);
                        cadFornecedor.TFNomeFornecedor.setText(nome);
                        cadFornecedor.TFFantasiaFornecedor.setText(fantasia);
                        cadFornecedor.TFCNPJFornecedor.setText(cnpj);
                        cadFornecedor.TFInscEstadualFornecedor.setText(inscEstadual);
                        cadFornecedor.TFTelefone1Fornecedor.setText(telefone1);
                        cadFornecedor.TFTelefone2Fornecedor.setText(telefone2);
                        cadFornecedor.TFFaxFornecedor.setText(fax);
                        cadFornecedor.TFEmailFornecedor.setText(email);
                        cadFornecedor.TFSiteFornecedor.setText(site);
                        cadFornecedor.TFEnderecoFornecedor.setText(Endereco);
                        cadFornecedor.TFNumEnderecoFornecedor.setText(NumEnd);
                        cadFornecedor.TFBairroFornecedor.setText(Bairro);
                        cadFornecedor.TFCidadeFornecedor.setText(Cidade);
                        cadFornecedor.CBEstadoFornecedor.setSelectedItem(Estado);
                        cadFornecedor.TFCEPFornecedor.setText(CEP);
                        cadFornecedor.TAObservacoesFornecedor.setText(Observacoes);
                        
                        
                        cadFornecedor.TFCodigoFornecedor.setEnabled(false);
                        cadFornecedor.TFNomeFornecedor.setEnabled(true);
                        cadFornecedor.TFFantasiaFornecedor.setEnabled(true);
                        cadFornecedor.TFCNPJFornecedor.setEnabled(true);
                        cadFornecedor.TFInscEstadualFornecedor.setEnabled(true);
                        cadFornecedor.TFTelefone1Fornecedor.setEnabled(true);
                        cadFornecedor.TFTelefone2Fornecedor.setEnabled(true);
                        cadFornecedor.TFFaxFornecedor.setEnabled(true);
                        cadFornecedor.TFEmailFornecedor.setEnabled(true);
                        cadFornecedor.TFSiteFornecedor.setEnabled(true);
                        cadFornecedor.TFEnderecoFornecedor.setEnabled(true);
                        cadFornecedor.TFNumEnderecoFornecedor.setEnabled(true);
                        cadFornecedor.TFBairroFornecedor.setEnabled(true);
                        cadFornecedor.TFCidadeFornecedor.setEnabled(true);
                        cadFornecedor.CBEstadoFornecedor.setEnabled(true);
                        cadFornecedor.TFCEPFornecedor.setEnabled(true);
                        cadFornecedor.TAObservacoesFornecedor.setEnabled(true);
                        
                        cadFornecedor.BInserirFornecedor.setEnabled(false);
                        cadFornecedor.BLimparFornecedor.setEnabled(true);
                        cadFornecedor.BAtualizarFornecedor.setEnabled(true);
                        cadFornecedor.BExcluirFornecedor.setEnabled(true);
                        
                        cadFornecedor.LCodigoFornecedor.setVisible(false);
                        cadFornecedor.TFCodigoFornecedor.setVisible(false);
                
            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Fornecedor: "+e.getMessage());
        }
        
        this.dispose();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarFornecedorActionPerformed

    private void BVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarActionPerformed
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarActionPerformed
 
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
            java.util.logging.Logger.getLogger(PesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBuscarFornecedor;
    public javax.swing.JButton BSelecionarFornecedor;
    private javax.swing.JButton BVoltar;
    public javax.swing.JTable TConsultaFornecedor;
    public javax.swing.JTextField TFNomePesuisaFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
