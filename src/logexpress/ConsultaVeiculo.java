package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaVeiculo extends javax.swing.JFrame {

    public ConsultaVeiculo() {
        initComponents();
    }
    
     Connection conn;
     
        String Placa;
        String TipoVeiculo;
        String Fabricante;
        String Modelo;
        String Ano;
        String Renavam;
        String Chassi;
        
        OrdemEntrega ordemEntrega;
        
         public ConsultaVeiculo(Connection conn, String Placa, String TipoVeiculo, 
                 String Fabricante, String Modelo, String Ano, String Renavam,
                 String Chassi, OrdemEntrega ordemEntrega) {
        initComponents();
        
        this.conn = conn;
        this.Placa = Placa;
        this.TipoVeiculo = TipoVeiculo;
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Renavam = Renavam;
        this.Chassi = Chassi;
        
        this.ordemEntrega = ordemEntrega;
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TFNomeVeiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BBuscarVeiculo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaVeiculo = new javax.swing.JTable();
        BSelecionarVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Veículo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Nome do Veículo");

        BBuscarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarVeiculo.setText("Buscar");
        BBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarVeiculoActionPerformed(evt);
            }
        });

        TConsultaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo Veículo", "Fabricante", "Modelo", "Ano", "Renavan", "Chassi"
            }
        ));
        jScrollPane1.setViewportView(TConsultaVeiculo);

        BSelecionarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarVeiculo.setText("Inserir");
        BSelecionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarVeiculoActionPerformed(evt);
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
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarVeiculo))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BSelecionarVeiculo)
                .addGap(345, 345, 345))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarVeiculo)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BSelecionarVeiculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarVeiculoActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaVeiculo.getModel();

        while(TConsultaVeiculo.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeVeiculo = TFNomeVeiculo.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM Veiculo WHERE modelo LIKE '"+NomeVeiculo+"%' ORDER BY Modelo");

            while(rs.next()){
                String placa = rs.getString("placa");
                String tipoVeiculo = rs.getString("TipoVeiculo");
                String fabricante = rs.getString("Fabricacao");
                String modelo = rs.getString("Modelo");
                String ano = rs.getString("Ano");
                String renavam = rs.getString("Renavam");
                String chassi = rs.getString("Chassi");

                m.addRow(new Object[] {placa, tipoVeiculo, fabricante, modelo, ano, renavam, chassi});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Veiculo: "+e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarVeiculoActionPerformed

    private void BSelecionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarVeiculoActionPerformed


        String NomeVeiculo = TConsultaVeiculo.getValueAt(TConsultaVeiculo.getSelectedRow(), 3).toString();
 
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM Veiculo WHERE Modelo LIKE '"+NomeVeiculo+"%' ORDER BY Modelo");

            while(rs.next()){
                
                int codigo = rs.getInt("codigo");
                String placa = rs.getString("placa");
                String tipoVeiculo = rs.getString("tipoVeiculo");
                String fabricacao = rs.getString("Fabricacao");
                String modelo = rs.getString("Modelo");
                String ano = rs.getString("ano");
                String renavam = rs.getString("renavam");
                String chassi = rs.getString("chassi");
                

                        ordemEntrega.TFCodigoVeiculo.setText(""+codigo);
                        ordemEntrega.TFPlacaVeiculo.setText(placa);
                        ordemEntrega.CBTipoVeiculo.setSelectedItem(tipoVeiculo);
                        ordemEntrega.CBFabricante.setSelectedItem(fabricacao);
                        ordemEntrega.TFModeloVeiculo.setText(modelo);
                        ordemEntrega.TFAnoVeiculo.setText(ano);
                        ordemEntrega.TFRenavam.setText(renavam);
                        ordemEntrega.TFChassi.setText(chassi);
                      

                
            }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Veiculo: "+e.getMessage());
        }
        
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarVeiculo;
    private javax.swing.JButton BSelecionarVeiculo;
    private javax.swing.JTable TConsultaVeiculo;
    private javax.swing.JTextField TFNomeVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
