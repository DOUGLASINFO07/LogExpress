package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaFornecedor extends javax.swing.JFrame {

    public ConsultaFornecedor() {
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
        
        ManutencaoVeiculo manutencaoVeiculo;
        
         public ConsultaFornecedor(Connection conn, String Nome, String Fantasia, 
                 String CNPJ, String InscEstadual, String Telefone1, String Telefone2,
                 String Fax,  ManutencaoVeiculo manutencaoVeiculo) {
        initComponents();
        
        this.conn = conn;
        this.Nome = Nome;
        this.Fantasia = Fantasia;
        this.CNPJ= CNPJ;
        this.InscEstadual = InscEstadual;
        this.Telefone1 = Telefone1;
        this.Telefone2 = Telefone2;
        this.Fax = Fax;
        
        this.manutencaoVeiculo = manutencaoVeiculo;

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFNomeFornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaFornecedor = new javax.swing.JTable();
        BBuscarFornecedor = new javax.swing.JButton();
        BSelecionarFornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta de Fornecedor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Nome do Fornecedor");

        TConsultaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nome Fantasia", "CNPJ", "InscEstadual", "Telefone1", "Telefone2", "fax"
            }
        ));
        jScrollPane1.setViewportView(TConsultaFornecedor);

        BBuscarFornecedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarFornecedor.setText("Buscar");
        BBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarFornecedorActionPerformed(evt);
            }
        });

        BSelecionarFornecedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarFornecedor.setText("Inserir");
        BSelecionarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarFornecedor))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(BSelecionarFornecedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BSelecionarFornecedor)
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

        String NomeFornecedor = TFNomeFornecedor.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM fornecedor WHERE nome LIKE '"+NomeFornecedor+"%' ORDER BY Nome");

            while(rs.next()){
                String nome = rs.getString("nome");
                String fantasia = rs.getString("Fantasia");
                String cnpj = rs.getString("CNPJ");
                String inscEstadual = rs.getString("InscEstadual");
                String telefone1 = rs.getString("Telefone1");
                String telefone2 = rs.getString("Telefone2");
                String fax = rs.getString("Fax");

                m.addRow(new Object[] {nome, fantasia,cnpj, inscEstadual, telefone1, telefone2, fax});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Fornecedor: "+e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarFornecedorActionPerformed

    private void BSelecionarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarFornecedorActionPerformed

        String NomeFornecedor = TConsultaFornecedor.getValueAt(TConsultaFornecedor.getSelectedRow(), 0).toString();
       
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM Fornecedor WHERE nome LIKE '"+NomeFornecedor+"%' ORDER BY nome");

            while(rs.next()){
                
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String fantasia = rs.getString("fantasia");
                String cnpj = rs.getString("cnpj");
                String inscEstadual = rs.getString("inscEstadual");
                String telefone1 = rs.getString("telefone1");
                String telefone2 = rs.getString("telefone2");
                String fax = rs.getString("fax");
                

                        manutencaoVeiculo.TFCodigoFornecedor.setText(""+codigo);
                        manutencaoVeiculo.TFNomeFornecedor.setText(nome);
                        manutencaoVeiculo.TFFantasiaFornecedor.setText(fantasia);
                        manutencaoVeiculo.TFCNPJFornecedor.setText(cnpj);
                        manutencaoVeiculo.TFInscEstadualFornecedor.setText(inscEstadual);
                        manutencaoVeiculo.TFTelefone1Fornecedor.setText(telefone1);
                        manutencaoVeiculo.TFTelefone2Fornecedor.setText(telefone2);
                        manutencaoVeiculo.TFFaxFornecedor.setText(fax);
                        }
        }       
                catch(SQLException e){
            System.out.println(
                "Error ao consultar Fornecedor: "+e.getMessage());
        }
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarFornecedor;
    private javax.swing.JButton BSelecionarFornecedor;
    private javax.swing.JTable TConsultaFornecedor;
    private javax.swing.JTextField TFNomeFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
