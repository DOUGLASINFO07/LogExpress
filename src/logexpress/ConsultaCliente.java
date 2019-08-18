package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaCliente extends javax.swing.JFrame {

    public ConsultaCliente() {
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
        
         public ConsultaCliente(Connection conn,  
                 String Nome, 
                 String CNPJ, 
                 String Endereco, 
                 String NumEndereco,
                 String Bairro, 
                 String Cidade,
                 String Estado, 
                 OrdemEntrega ordemEntrega) {
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
        TFNomeCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaCliente = new javax.swing.JTable();
        BSelecionar = new javax.swing.JButton();
        BBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta de Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome do Cliente");

        TConsultaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome / Nome Fantasia", "CNPJ / CPF", "Endereco", "Numero", "Bairro", "Cidade", "Estado"
            }
        ));
        jScrollPane1.setViewportView(TConsultaCliente);

        BSelecionar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionar.setText("Inserir");
        BSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarActionPerformed(evt);
            }
        });

        BBuscar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscar.setText("Buscar");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BBuscar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(BSelecionar)))
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
                    .addComponent(TFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BSelecionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarActionPerformed
     
        
        String NomeCliente = TConsultaCliente.getValueAt(TConsultaCliente.getSelectedRow(), 1).toString();
        
        try{
                  Statement stmt = conn.createStatement();
                  ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM Clientes WHERE nome LIKE '"+NomeCliente+"%' ORDER BY Nome");

            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String cnpj = rs.getString("CNPJ");
                String endereco = rs.getString("Endereco");
                String numEndereco = rs.getString("Numero");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String estado = rs.getString("estado");
                
              ordemEntrega.TFCodigoCliente.setText(""+codigo);
              ordemEntrega.TFNomeCliente.setText(nome);
              ordemEntrega.TFCNPJCliente.setText(cnpj);
              ordemEntrega.TFEnderecoCliente.setText(endereco);
              ordemEntrega.TFNumEndCliente.setText(numEndereco);
              ordemEntrega.TFBairroCliente.setText(bairro);
              ordemEntrega.TFCidadeCliente.setText(cidade);
              ordemEntrega.CBEstadoCliente.setSelectedItem(estado);
  
            }
            
            }catch(Exception e){ 
                System.out.println("Error ao consultar Clientes: "+e.getMessage());
            }
        
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarActionPerformed

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed

               DefaultTableModel m = (DefaultTableModel) 
        TConsultaCliente.getModel();
        
            while(TConsultaCliente.getRowCount() > 0){
                m.removeRow(0);
            }
            
            String NomeCliente = TFNomeCliente.getText();
            
             try{
                  Statement stmt = conn.createStatement();
                  ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM Clientes WHERE nome LIKE '"+NomeCliente+"%' ORDER BY Nome");

            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String cnpj = rs.getString("CNPJ");
                String endereco = rs.getString("Endereco");
                String numEndereco = rs.getString("Numero");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String estado = rs.getString("estado");
                
                
                
                
               m.addRow(new Object[] {codigo, nome, cnpj,endereco, numEndereco, bairro, cidade, estado});
            }
            }catch(Exception e){ 
                System.out.println(
             "Error ao consultar Clientes: "+e.getMessage());
            }

// TODO add your handling code here:
    }//GEN-LAST:event_BBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BSelecionar;
    private javax.swing.JTable TConsultaCliente;
    private javax.swing.JTextField TFNomeCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
