package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaVeiculo2 extends javax.swing.JFrame {

    public ConsultaVeiculo2() {
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
        
        ManutencaoCombustivel manutencaoCombustivel;
        
        public ConsultaVeiculo2(Connection conn, String Placa, String TipoVeiculo, 
                 String Fabricante, String Modelo, String Ano, String Renavam,
                 String Chassi, ManutencaoCombustivel manutencaoCombustivel) {
        initComponents();
        
        this.conn = conn;
        this.Placa = Placa;
        this.TipoVeiculo = TipoVeiculo;
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Renavam = Renavam;
        this.Chassi = Chassi;
        
        this.manutencaoCombustivel = manutencaoCombustivel;
        
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TFNomeVeiculo2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BBuscarVeiculo2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaVeiculo2 = new javax.swing.JTable();
        BSelecionarVeiculo2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Veículo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Nome do Veículo");

        BBuscarVeiculo2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarVeiculo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarVeiculo2.setText("Buscar");
        BBuscarVeiculo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarVeiculo2ActionPerformed(evt);
            }
        });

        TConsultaVeiculo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo Veículo", "Fabricante", "Modelo", "Ano", "Renavan", "Chassi", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(TConsultaVeiculo2);

        BSelecionarVeiculo2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarVeiculo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarVeiculo2.setText("Inserir");
        BSelecionarVeiculo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarVeiculo2ActionPerformed(evt);
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
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNomeVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarVeiculo2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BSelecionarVeiculo2)
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNomeVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarVeiculo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BSelecionarVeiculo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarVeiculo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarVeiculo2ActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaVeiculo2.getModel();

        while(TConsultaVeiculo2.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeVeiculo = TFNomeVeiculo2.getText();

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
    }//GEN-LAST:event_BBuscarVeiculo2ActionPerformed

    private void BSelecionarVeiculo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarVeiculo2ActionPerformed

        manutencaoCombustivel.TFPlacaVeiculo2.setText(TConsultaVeiculo2.getValueAt(TConsultaVeiculo2.getSelectedRow(), 0).toString());
        manutencaoCombustivel.CBTipoVeiculo2.setSelectedItem(TConsultaVeiculo2.getValueAt(TConsultaVeiculo2.getSelectedRow(), 1).toString());
        manutencaoCombustivel.TFFabricanteVeiculo2.setText(TConsultaVeiculo2.getValueAt(TConsultaVeiculo2.getSelectedRow(), 2).toString());
        manutencaoCombustivel.TFModeloVeiculo2.setText(TConsultaVeiculo2.getValueAt(TConsultaVeiculo2.getSelectedRow(), 3).toString());
        manutencaoCombustivel.TFAnoVeiculo2.setText(TConsultaVeiculo2.getValueAt(TConsultaVeiculo2.getSelectedRow(), 4).toString());
        manutencaoCombustivel.TFRenavam2.setText(TConsultaVeiculo2.getValueAt(TConsultaVeiculo2.getSelectedRow(), 5).toString());
        manutencaoCombustivel.TFChassi2.setText(TConsultaVeiculo2.getValueAt(TConsultaVeiculo2.getSelectedRow(), 6).toString());
        manutencaoCombustivel.TFCodigoVeiculosCombustivel.setText(TConsultaVeiculo2.getValueAt(TConsultaVeiculo2.getSelectedRow(), 7).toString());

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarVeiculo2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaVeiculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVeiculo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarVeiculo2;
    private javax.swing.JButton BSelecionarVeiculo2;
    private javax.swing.JTable TConsultaVeiculo2;
    public javax.swing.JTextField TFNomeVeiculo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
