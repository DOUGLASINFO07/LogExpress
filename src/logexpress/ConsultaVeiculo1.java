package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaVeiculo1 extends javax.swing.JFrame {

    public ConsultaVeiculo1() {
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
        
        ManutencaoVeiculo manutencaoVeiculo;
        
        public ConsultaVeiculo1(Connection conn, String Placa, String TipoVeiculo, 
                 String Fabricante, String Modelo, String Ano, String Renavam,
                 String Chassi, ManutencaoVeiculo manutencaoVeiculo) {
        initComponents();
        
        this.conn = conn;
        this.Placa = Placa;
        this.TipoVeiculo = TipoVeiculo;
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Renavam = Renavam;
        this.Chassi = Chassi;
        
        this.manutencaoVeiculo = manutencaoVeiculo;
        
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TFNomeVeiculo1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BBuscarVeiculo1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaVeiculo1 = new javax.swing.JTable();
        BSelecionarVeiculo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Veículo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Nome do Veículo");

        BBuscarVeiculo1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarVeiculo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarVeiculo1.setText("Buscar");
        BBuscarVeiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarVeiculo1ActionPerformed(evt);
            }
        });

        TConsultaVeiculo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo Veículo", "Fabricante", "Modelo", "Ano", "Renavan", "Chassi"
            }
        ));
        jScrollPane1.setViewportView(TConsultaVeiculo1);

        BSelecionarVeiculo1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarVeiculo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarVeiculo1.setText("Inserir");
        BSelecionarVeiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarVeiculo1ActionPerformed(evt);
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
                                .addComponent(TFNomeVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarVeiculo1))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BSelecionarVeiculo1)
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
                    .addComponent(TFNomeVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarVeiculo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BSelecionarVeiculo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarVeiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarVeiculo1ActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaVeiculo1.getModel();

        while(TConsultaVeiculo1.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeVeiculo = TFNomeVeiculo1.getText();

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
    }//GEN-LAST:event_BBuscarVeiculo1ActionPerformed

    private void BSelecionarVeiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarVeiculo1ActionPerformed

             String NomeVeiculo = TConsultaVeiculo1.getValueAt(TConsultaVeiculo1.getSelectedRow(), 3).toString();
 
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
                

                        manutencaoVeiculo.TFCodigoVeiculo.setText(""+codigo);
                        manutencaoVeiculo.TFPlacaVeiculo1.setText(placa);
                        manutencaoVeiculo.CBTipoVeiculo1.setSelectedItem(tipoVeiculo);
                        manutencaoVeiculo.TFFabricante1.setText(fabricacao);
                        manutencaoVeiculo.TFModeloVeiculo1.setText(modelo);
                        manutencaoVeiculo.TFAnoVeiculo1.setText(ano);
                        manutencaoVeiculo.TFRenavam1.setText(renavam);
                        manutencaoVeiculo.TFChassi1.setText(chassi);
                        }
        }       
                catch(Exception e){
            System.out.println(
                "Error ao consultar Veiculo: "+e.getMessage());
        }
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BSelecionarVeiculo1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaVeiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVeiculo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarVeiculo1;
    private javax.swing.JButton BSelecionarVeiculo1;
    private javax.swing.JTable TConsultaVeiculo1;
    public javax.swing.JTextField TFNomeVeiculo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
