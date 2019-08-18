package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PesquisaCliente extends javax.swing.JFrame {

    public PesquisaCliente() {
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

        CadCliente cadCliente;
        
         public PesquisaCliente(Connection conn, 
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
                 CadCliente cadCliente) {
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

        this.cadCliente = cadCliente;
        
        BSelecionarCliente.setEnabled(false);

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TFNomePesquisaCliente = new javax.swing.JTextField();
        BBuscarCliente = new javax.swing.JButton();
        BVoltarCliente = new javax.swing.JButton();
        BSelecionarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta de Clientes");
        jLabel1.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        TConsultaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nome Fantasia", "CNPJ / CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TConsultaCliente);

        jLabel2.setText("Clientes");

        BBuscarCliente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarCliente.setText("Buscar");
        BBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarClienteActionPerformed(evt);
            }
        });

        BVoltarCliente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BVoltarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltarCliente.setText("Voltar");
        BVoltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarClienteActionPerformed(evt);
            }
        });

        BSelecionarCliente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BSelecionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarCliente.setText("Inserir");
        BSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarClienteActionPerformed(evt);
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
                        .addComponent(TFNomePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BBuscarCliente))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BSelecionarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(BVoltarCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNomePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarCliente)
                    .addComponent(BSelecionarCliente))
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

    private void BBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarClienteActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaCliente.getModel();

        while(TConsultaCliente.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeCliente = TFNomePesquisaCliente.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM clientes WHERE nome LIKE '"+NomeCliente+"%' ORDER BY Nome");

            while(rs.next()){
       
                String nome = rs.getString("nome");
                String fantasia = rs.getString("Fantasia");
                String cnpj = rs.getString("CNPJ");

                m.addRow(new Object[] {nome, fantasia,cnpj});      

            }
            
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Cliente: "+e.getMessage());
        }
        
        BSelecionarCliente.setEnabled(true);

    }//GEN-LAST:event_BBuscarClienteActionPerformed

    private void BSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarClienteActionPerformed
 
        String NomeCliente = TConsultaCliente.getValueAt(TConsultaCliente.getSelectedRow(), 0).toString();
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM CLIENTES WHERE nome LIKE '"+NomeCliente+"%' ORDER BY Nome");

            while(rs.next()){
                
                String codigo = rs.getString("telefone1");
                String nome = rs.getString("nome");
                String fantasia = rs.getString("fantasia");
                String cnpj = rs.getString("cnpj");
                String inscEstadual = rs.getString("inscEstadual");
                String telefone1 = rs.getString("telefone1");
                String telefone2 = rs.getString("telefone2");
                String fax = rs.getString("fax");
                String email = rs.getString("email");
                String site = rs.getString("site");
                String endereco = rs.getString("Endereco");
                String NumEnd = rs.getString("Numero");
                String bairro = rs.getString("Bairro");
                String cidade = rs.getString("Cidade");
                String estado = rs.getString("Estado");
                String cep = rs.getString("CEP");
                String observacoes = rs.getString("Observacoes");

                        cadCliente.TFCodigoCliente.setText(""+codigo);
                        cadCliente.TFNomeCliente.setText(nome);
                        cadCliente.TFFantasiaCliente.setText(fantasia);
                        cadCliente.TFCNPJCliente.setText(cnpj);
                        cadCliente.TFInscEstadualCliente.setText(inscEstadual);
                        cadCliente.TFTelefone1Cliente.setText(telefone1);
                        cadCliente.TFTelefone2Cliente.setText(telefone2);
                        cadCliente.TFFaxCliente.setText(fax);
                        cadCliente.TFEmailCliente.setText(email);
                        cadCliente.TFSiteCliente.setText(site);
                        cadCliente.TFEnderecoCliente.setText(endereco);
                        cadCliente.TFNumEndCliente.setText(NumEnd);
                        cadCliente.TFBairroCliente.setText(bairro);
                        cadCliente.TFCidadeCliente.setText(cidade);
                        cadCliente.CBEstadoCliente.setSelectedItem(estado);
                        cadCliente.TFCEPCliente.setText(cep);
                        cadCliente.TAObservacoesCliente.setText(observacoes);
   
                        cadCliente.TFCodigoCliente.setEnabled(false);
                        cadCliente.TFNomeCliente.setEnabled(true);
                        cadCliente.TFFantasiaCliente.setEnabled(true);
                        cadCliente.TFCNPJCliente.setEnabled(true);
                        cadCliente.TFInscEstadualCliente.setEnabled(true);
                        cadCliente.TFTelefone1Cliente.setEnabled(true);
                        cadCliente.TFTelefone2Cliente.setEnabled(true);
                        cadCliente.TFFaxCliente.setEnabled(true);
                        cadCliente.TFEmailCliente.setEnabled(true);
                        cadCliente.TFSiteCliente.setEnabled(true);
                        cadCliente.TFEnderecoCliente.setEnabled(true);
                        cadCliente.TFNumEndCliente.setEnabled(true);
                        cadCliente.TFBairroCliente.setEnabled(true);
                        cadCliente.TFCidadeCliente.setEnabled(true);
                        cadCliente.CBEstadoCliente.setEnabled(true);
                        cadCliente.TFCEPCliente.setEnabled(true);
                        cadCliente.TAObservacoesCliente.setEnabled(true);
                        
                        cadCliente.BInserirCliente.setEnabled(false);
                        cadCliente.BLimparCliente.setEnabled(true);
                        cadCliente.BAtualizarCliente.setEnabled(true);
                        cadCliente.BExcluirCliente.setEnabled(true);
                        
                        cadCliente.LCodigoCliente.setVisible(false);
                        cadCliente.TFCodigoCliente.setVisible(false);
                
            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Cliente: "+e.getMessage());
        }

        this.dispose();

    }//GEN-LAST:event_BSelecionarClienteActionPerformed

    private void BVoltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarClienteActionPerformed
        
        this.dispose();  
        
    }//GEN-LAST:event_BVoltarClienteActionPerformed
 
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
            java.util.logging.Logger.getLogger(PesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBuscarCliente;
    public javax.swing.JButton BSelecionarCliente;
    private javax.swing.JButton BVoltarCliente;
    public javax.swing.JTable TConsultaCliente;
    public javax.swing.JTextField TFNomePesquisaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
