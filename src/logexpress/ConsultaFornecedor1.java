package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaFornecedor1 extends javax.swing.JFrame {

    public ConsultaFornecedor1() {
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
        
        ManutencaoCombustivel manutencaoCombustivel;
        
         public ConsultaFornecedor1(Connection conn, String Nome, String Fantasia, 
                 String CNPJ, String InscEstadual, String Telefone1, String Telefone2,
                 String Fax,  ManutencaoCombustivel manutencaoCombustivel) {
        initComponents();
        
        this.conn = conn;
        this.Nome = Nome;
        this.Fantasia = Fantasia;
        this.CNPJ= CNPJ;
        this.InscEstadual = InscEstadual;
        this.Telefone1 = Telefone1;
        this.Telefone2 = Telefone2;
        this.Fax = Fax;
        
        this.manutencaoCombustivel = manutencaoCombustivel;

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFNomeFornecedor1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaFornecedor1 = new javax.swing.JTable();
        BBuscarFornecedor1 = new javax.swing.JButton();
        BSelecionarFornecedor1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta de Fornecedor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Nome do Fornecedor");

        TConsultaFornecedor1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nome Fantasia", "CNPJ", "InscEstadual", "Telefone1", "Telefone2", "fax", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(TConsultaFornecedor1);

        BBuscarFornecedor1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarFornecedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarFornecedor1.setText("Buscar");
        BBuscarFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarFornecedor1ActionPerformed(evt);
            }
        });

        BSelecionarFornecedor1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarFornecedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarFornecedor1.setText("Inserir");
        BSelecionarFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarFornecedor1ActionPerformed(evt);
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
                                .addComponent(TFNomeFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarFornecedor1))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BSelecionarFornecedor1)
                .addGap(371, 371, 371))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNomeFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarFornecedor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BSelecionarFornecedor1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarFornecedor1ActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaFornecedor1.getModel();

        while(TConsultaFornecedor1.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeFornecedor = TFNomeFornecedor1.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM fornecedor WHERE nome LIKE '"+NomeFornecedor+"%' ORDER BY Nome");

            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String fantasia = rs.getString("Fantasia");
                String cnpj = rs.getString("CNPJ");
                String inscEstadual = rs.getString("InscEstadual");
                String telefone1 = rs.getString("Telefone1");
                String telefone2 = rs.getString("Telefone2");
                String fax = rs.getString("Fax");

                m.addRow(new Object[] {nome, fantasia,cnpj, inscEstadual, telefone1, telefone2, fax, codigo});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Fornecedor: "+e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarFornecedor1ActionPerformed

    private void BSelecionarFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarFornecedor1ActionPerformed

        manutencaoCombustivel.TFNomeFornecedor1.setText(TConsultaFornecedor1.getValueAt(TConsultaFornecedor1.getSelectedRow(), 0).toString());
        manutencaoCombustivel.TFFantasiaFornecedor1.setText(TConsultaFornecedor1.getValueAt(TConsultaFornecedor1.getSelectedRow(), 1).toString());
        manutencaoCombustivel.TFCNPJFornecedor1.setText(TConsultaFornecedor1.getValueAt(TConsultaFornecedor1.getSelectedRow(), 2).toString());
        manutencaoCombustivel.TFInscEstadualFornecedor1.setText(TConsultaFornecedor1.getValueAt(TConsultaFornecedor1.getSelectedRow(), 3).toString());
        manutencaoCombustivel.TFTelefone1Fornecedor1.setText(TConsultaFornecedor1.getValueAt(TConsultaFornecedor1.getSelectedRow(), 4).toString());
        manutencaoCombustivel.TFTelefone2Fornecedor1.setText(TConsultaFornecedor1.getValueAt(TConsultaFornecedor1.getSelectedRow(), 5).toString());
        manutencaoCombustivel.TFFaxFornecedor1.setText(TConsultaFornecedor1.getValueAt(TConsultaFornecedor1.getSelectedRow(), 6).toString());
        manutencaoCombustivel.TFCodigoFornecedorCombustivel.setText(TConsultaFornecedor1.getValueAt(TConsultaFornecedor1.getSelectedRow(), 7).toString());

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarFornecedor1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaFornecedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFornecedor1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarFornecedor1;
    private javax.swing.JButton BSelecionarFornecedor1;
    private javax.swing.JTable TConsultaFornecedor1;
    private javax.swing.JTextField TFNomeFornecedor1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
