package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaDestinatario extends javax.swing.JFrame {

    public ConsultaDestinatario() {
        initComponents();
    }
    
    Connection conn;
     
        String Nome;
        String CNPJ;
        String Endereco;
        String NumEndereco;
        String Bairro;
        String Cidade;
        String Estado;
        
        OrdemEntrega ordemEntrega;
        
         public ConsultaDestinatario(Connection conn, String Nome, String CNPJ, 
                 String Endereco, String NumEndereco, String Bairro, String Cidade,
                 String Estado, OrdemEntrega ordemEntrega) {
        initComponents();
        
        this.conn = conn;
        this.Nome = Nome;
        this.CNPJ = CNPJ;
        this.Endereco = Endereco;
        this.NumEndereco = NumEndereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        
        this.ordemEntrega = ordemEntrega;
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFNomeDestinatario = new javax.swing.JTextField();
        BBuscarDestinatario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaDestinatario = new javax.swing.JTable();
        BSelecionarDestinatario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Destinatário");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Nome do Destinatário");

        BBuscarDestinatario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarDestinatario.setText("Buscar");
        BBuscarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarDestinatarioActionPerformed(evt);
            }
        });

        TConsultaDestinatario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome / Nome Fantasia", "CNPJ / CPF", "Endereco", "Numero", "Bairro", "Cidade", "Estado"
            }
        ));
        jScrollPane1.setViewportView(TConsultaDestinatario);

        BSelecionarDestinatario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarDestinatario.setText("Inserrir");
        BSelecionarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarDestinatarioActionPerformed(evt);
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFNomeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarDestinatario))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(BSelecionarDestinatario)
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
                    .addComponent(TFNomeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarDestinatario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BSelecionarDestinatario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarDestinatarioActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaDestinatario.getModel();

        while(TConsultaDestinatario.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeDestinatario = TFNomeDestinatario.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM Destinatario WHERE nome LIKE '"+NomeDestinatario+"%' ORDER BY Nome");

            while(rs.next()){
                String nome = rs.getString("nome");
                String cnpj = rs.getString("CNPJ");
                String endereco = rs.getString("Endereco");
                String numEndereco = rs.getString("Numero");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String estado = rs.getString("estado");

                m.addRow(new Object[] {nome, cnpj,endereco, numEndereco, bairro, cidade, estado});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Destinatario: "+e.getMessage());
        }

        // TODO add your handling code here:
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
                String cnpj = rs.getString("cnpj");
                String endereco = rs.getString("Endereco");
                String NumEnd = rs.getString("Numero");
                String bairro = rs.getString("Bairro");
                String cidade = rs.getString("Cidade");
                String estado = rs.getString("Estado");
                
                        ordemEntrega.TFCodigoDestinatario.setText(""+codigo);
                        ordemEntrega.TFNomeDestinatario.setText(nome);
                        ordemEntrega.TFCNPJDestinatario.setText(cnpj);
                        ordemEntrega.TFEnderecoDestinatario.setText(endereco);
                        ordemEntrega.TFNumEndDestinatario.setText(NumEnd);
                        ordemEntrega.TFBairroDestinatario.setText(bairro);
                        ordemEntrega.TFCidadeDestinatario.setText(cidade);
                        ordemEntrega.CBEstadoDestinatario.setSelectedItem(estado);
                  
            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Destinatario: "+e.getMessage());
        }
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarDestinatarioActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaDestinatario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarDestinatario;
    private javax.swing.JButton BSelecionarDestinatario;
    private javax.swing.JTable TConsultaDestinatario;
    private javax.swing.JTextField TFNomeDestinatario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
