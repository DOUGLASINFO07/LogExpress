package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaVeiculo3 extends javax.swing.JFrame {

    public ConsultaVeiculo3() {
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
        
        ManutencaoPneus manutencaoPneus;
        
        public ConsultaVeiculo3(Connection conn, String Placa, String TipoVeiculo, 
                 String Fabricante, String Modelo, String Ano, String Renavam,
                 String Chassi, ManutencaoPneus manutencaoPneus) {
        initComponents();
        
        this.conn = conn;
        this.Placa = Placa;
        this.TipoVeiculo = TipoVeiculo;
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Renavam = Renavam;
        this.Chassi = Chassi;
        
        this.manutencaoPneus = manutencaoPneus;
        
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TFNomeVeiculo3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BBuscarVeiculo3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaVeiculo3 = new javax.swing.JTable();
        BSelecionarVeiculo3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Veículo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Nome do Veículo");

        BBuscarVeiculo3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarVeiculo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarVeiculo3.setText("Buscar");
        BBuscarVeiculo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarVeiculo3ActionPerformed(evt);
            }
        });

        TConsultaVeiculo3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo Veículo", "Fabricante", "Modelo", "Ano", "Renavan", "Chassi", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(TConsultaVeiculo3);

        BSelecionarVeiculo3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarVeiculo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarVeiculo3.setText("Inserir");
        BSelecionarVeiculo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarVeiculo3ActionPerformed(evt);
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
                                .addComponent(TFNomeVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarVeiculo3))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BSelecionarVeiculo3)
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNomeVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarVeiculo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BSelecionarVeiculo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarVeiculo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarVeiculo3ActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaVeiculo3.getModel();

        while(TConsultaVeiculo3.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeVeiculo = TFNomeVeiculo3.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM Veiculo WHERE modelo LIKE '"+NomeVeiculo+"%' ORDER BY Modelo");

            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String placa = rs.getString("placa");
                String tipoVeiculo = rs.getString("TipoVeiculo");
                String fabricante = rs.getString("Fabricacao");
                String modelo = rs.getString("Modelo");
                String ano = rs.getString("Ano");
                String renavam = rs.getString("Renavam");
                String chassi = rs.getString("Chassi");

                m.addRow(new Object[] {placa, tipoVeiculo, fabricante, modelo, ano, renavam, chassi, codigo});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Veiculo: "+e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarVeiculo3ActionPerformed

    private void BSelecionarVeiculo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarVeiculo3ActionPerformed

        manutencaoPneus.TFPlacaVeiculo3.setText(TConsultaVeiculo3.getValueAt(TConsultaVeiculo3.getSelectedRow(), 0).toString());
        manutencaoPneus.CBTipoVeiculo3.setSelectedItem(TConsultaVeiculo3.getValueAt(TConsultaVeiculo3.getSelectedRow(), 1).toString());
        manutencaoPneus.TFFabricanteVeiculo3.setText(TConsultaVeiculo3.getValueAt(TConsultaVeiculo3.getSelectedRow(), 2).toString());
        manutencaoPneus.TFModeloVeiculo3.setText(TConsultaVeiculo3.getValueAt(TConsultaVeiculo3.getSelectedRow(), 3).toString());
        manutencaoPneus.TFAnoVeiculo3.setText(TConsultaVeiculo3.getValueAt(TConsultaVeiculo3.getSelectedRow(), 4).toString());
        manutencaoPneus.TFRenavam3.setText(TConsultaVeiculo3.getValueAt(TConsultaVeiculo3.getSelectedRow(), 5).toString());
        manutencaoPneus.TFChassi3.setText(TConsultaVeiculo3.getValueAt(TConsultaVeiculo3.getSelectedRow(), 6).toString());
        manutencaoPneus.TFCodigoVeiculosPneus.setText(TConsultaVeiculo3.getValueAt(TConsultaVeiculo3.getSelectedRow(), 7).toString());

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarVeiculo3ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaVeiculo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVeiculo3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarVeiculo3;
    private javax.swing.JButton BSelecionarVeiculo3;
    private javax.swing.JTable TConsultaVeiculo3;
    public javax.swing.JTextField TFNomeVeiculo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
