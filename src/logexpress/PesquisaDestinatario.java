package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PesquisaDestinatario extends javax.swing.JFrame {

    public PesquisaDestinatario() {
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

        CadDestinatario cadDestinatario;
        
         public PesquisaDestinatario(Connection conn, 
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
                 CadDestinatario cadDestinatario) {
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

        this.cadDestinatario = cadDestinatario;
        
        BSelecionarDestinatario.setEnabled(false);

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaDestinatario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TFNomePesuisaDestinatario = new javax.swing.JTextField();
        BBuscarDestinatario = new javax.swing.JButton();
        BVoltarDestinatario = new javax.swing.JButton();
        BSelecionarDestinatario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Destinatário");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        TConsultaDestinatario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TConsultaDestinatario);

        jLabel2.setText("Destinatario");

        BBuscarDestinatario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarDestinatario.setText("Buscar");
        BBuscarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarDestinatarioActionPerformed(evt);
            }
        });

        BVoltarDestinatario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BVoltarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltarDestinatario.setText("Voltar");
        BVoltarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarDestinatarioActionPerformed(evt);
            }
        });

        BSelecionarDestinatario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BSelecionarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarDestinatario.setText("Inserir");
        BSelecionarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarDestinatarioActionPerformed(evt);
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
                        .addComponent(TFNomePesuisaDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BBuscarDestinatario))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BSelecionarDestinatario)
                        .addGap(18, 18, 18)
                        .addComponent(BVoltarDestinatario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNomePesuisaDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarDestinatario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarDestinatario)
                    .addComponent(BSelecionarDestinatario))
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

    private void BBuscarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarDestinatarioActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaDestinatario.getModel();

        while(TConsultaDestinatario.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeDestinatario = TFNomePesuisaDestinatario.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM destinatario WHERE nome LIKE '"+NomeDestinatario+"%' ORDER BY Nome");

            while(rs.next()){
                String nome = rs.getString("nome");
                String fantasia = rs.getString("Fantasia");
                String cnpj = rs.getString("CNPJ");
               

                m.addRow(new Object[] {nome, fantasia,cnpj});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Destinatario: "+e.getMessage());
        }
        
        BSelecionarDestinatario.setEnabled(true);

    }//GEN-LAST:event_BBuscarDestinatarioActionPerformed

    private void BSelecionarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarDestinatarioActionPerformed

        String NomeDestinatario = TConsultaDestinatario.getValueAt(TConsultaDestinatario.getSelectedRow(), 0).toString();
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM destinatario WHERE nome LIKE '"+NomeDestinatario+"%' ORDER BY Nome");

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
                
                
                        cadDestinatario.TFCodigoDestinatario.setText(""+codigo);
                        cadDestinatario.TFNomeDestinatario.setText(nome);
                        cadDestinatario.TFFantasiaDestinatario.setText(fantasia);
                        cadDestinatario.TFCNPJDestinatario.setText(cnpj);
                        cadDestinatario.TFInscEstadualDestinatario.setText(inscEstadual);
                        cadDestinatario.TFTelefone1Destinatario.setText(telefone1);
                        cadDestinatario.TFTelefone2Destinatario.setText(telefone2);
                        cadDestinatario.TFFaxDestinatario.setText(fax);
                        cadDestinatario.TFEmailDestinatario.setText(email);
                        cadDestinatario.TFSiteDestinatario.setText(site);
                        cadDestinatario.TFEnderecoDestinatario.setText(Endereco);
                        cadDestinatario.TFNumEndDestinatario.setText(NumEnd);
                        cadDestinatario.TFBairroDestinatario.setText(Bairro);
                        cadDestinatario.TFCidadeDestinatario.setText(Cidade);
                        cadDestinatario.CBEstadoDestinatario.setSelectedItem(Estado);
                        cadDestinatario.TFCEPDestinatario.setText(CEP);
                        cadDestinatario.TAObservacoesDestinatario.setText(Observacoes);
                        
                        
                        cadDestinatario.TFCodigoDestinatario.setEnabled(false);
                        cadDestinatario.TFNomeDestinatario.setEnabled(true);
                        cadDestinatario.TFFantasiaDestinatario.setEnabled(true);
                        cadDestinatario.TFCNPJDestinatario.setEnabled(true);
                        cadDestinatario.TFInscEstadualDestinatario.setEnabled(true);
                        cadDestinatario.TFTelefone1Destinatario.setEnabled(true);
                        cadDestinatario.TFTelefone2Destinatario.setEnabled(true);
                        cadDestinatario.TFFaxDestinatario.setEnabled(true);
                        cadDestinatario.TFEmailDestinatario.setEnabled(true);
                        cadDestinatario.TFSiteDestinatario.setEnabled(true);
                        cadDestinatario.TFEnderecoDestinatario.setEnabled(true);
                        cadDestinatario.TFNumEndDestinatario.setEnabled(true);
                        cadDestinatario.TFBairroDestinatario.setEnabled(true);
                        cadDestinatario.TFCidadeDestinatario.setEnabled(true);
                        cadDestinatario.CBEstadoDestinatario.setEnabled(true);
                        cadDestinatario.TFCEPDestinatario.setEnabled(true);
                        cadDestinatario.TAObservacoesDestinatario.setEnabled(true);
                        
                        cadDestinatario.BInserirDestinatario.setEnabled(false);
                        cadDestinatario.BLimparDestinatario.setEnabled(true);
                        cadDestinatario.BAtualizarDestinatario.setEnabled(true);
                        cadDestinatario.BExcluirDestinatario.setEnabled(true);
                        
                        cadDestinatario.LCodigoDestinatario.setVisible(false);
                        cadDestinatario.TFCodigoDestinatario.setVisible(false);
                
            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Destinatario: "+e.getMessage());
        }
        
        this.dispose();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarDestinatarioActionPerformed

    private void BVoltarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarDestinatarioActionPerformed
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarDestinatarioActionPerformed
 
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
            java.util.logging.Logger.getLogger(PesquisaDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaDestinatario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBuscarDestinatario;
    public javax.swing.JButton BSelecionarDestinatario;
    private javax.swing.JButton BVoltarDestinatario;
    public javax.swing.JTable TConsultaDestinatario;
    public javax.swing.JTextField TFNomePesuisaDestinatario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
