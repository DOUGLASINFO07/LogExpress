package logexpress;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaFuncionario extends javax.swing.JFrame {

    public ConsultaFuncionario() {
        initComponents();
    }

     Connection conn;
     
        String Nome;
        String CPF;
        String RG;
        String DataNascimento;
        String CategoriaHabilitacao;
        String CarteiraHabilitacao;
        String PIS;
        String TelResidencia;
        String Celular;
        String Endereco;
        String Numero;
        String Bairro;
        String Cidade;
        String Estado;
        String CEP;
        String EstadoCivil;
        String Sexo;
        String Observacoes;
        
        CadFuncionario cadFuncionario;
        
         public ConsultaFuncionario(Connection conn, 
                 
                 String Nome, 
                 String CPF,  
                 String RG, 
                 String DataNascimento, 
                 String CategoriaHabilitacao, 
                 String CarteiraHabilitacao, 
                 String PIS,
                 String TelResidencia, 
                 String Celular, 
                 String Endereco, 
                 String Numero, 
                 String Bairro, 
                 String Cidade, 
                 String Estado, 
                 String CEP, 
                 String Estadocivil, 
                 String Sexo,
                 String Observacoes, 
                 
                 CadFuncionario cadFuncionario) {
        initComponents();
        
        this.conn = conn;
        
        this.Nome = Nome;
        this.CPF = CPF;
        this.RG = RG;
        this.DataNascimento = DataNascimento;
        this.CategoriaHabilitacao = CategoriaHabilitacao;
        this.CarteiraHabilitacao = CarteiraHabilitacao;
        this.PIS = PIS;
        this.TelResidencia = TelResidencia;
        this.Celular = Celular;
        this.Endereco = Endereco;
        this.Numero= Numero;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.CEP = CEP;
        this.EstadoCivil = Estadocivil;
        this.Sexo = Sexo;
        this.Observacoes = Observacoes;
                
        this.cadFuncionario = cadFuncionario;
        
        BSelecionarFuncionario.setEnabled(false);

         }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaFuncionario = new javax.swing.JTable();
        BSelecionarFuncionario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TFFuncionario = new javax.swing.JTextField();
        BBuscarFuncionario = new javax.swing.JButton();
        BVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Funcionários");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        TConsultaFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TConsultaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TConsultaFuncionario);

        BSelecionarFuncionario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BSelecionarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BSelecionarFuncionario.setText("Inserir");
        BSelecionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarFuncionarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Funcionário");

        BBuscarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarFuncionario.setText("Buscar");
        BBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarFuncionarioActionPerformed(evt);
            }
        });

        BVoltar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltar.setText("Voltar");
        BVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBuscarFuncionario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BSelecionarFuncionario)
                                .addGap(18, 18, 18)
                                .addComponent(BVoltar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSelecionarFuncionario)
                    .addComponent(BVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarFuncionarioActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TConsultaFuncionario.getModel();

        while(TConsultaFuncionario.getRowCount() > 0){
            m.removeRow(0);
        }

        String NomeFuncionario = TFFuncionario.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM funcionario WHERE nome LIKE '"+NomeFuncionario+"%' ORDER BY Nome");

            while(rs.next()){
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");

                m.addRow(new Object[] {nome, cpf,});
            }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Fornecedor: "+e.getMessage());
        }
        
        BSelecionarFuncionario.setEnabled(true);

    }//GEN-LAST:event_BBuscarFuncionarioActionPerformed

    private void BSelecionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarFuncionarioActionPerformed

         String funcionario = TConsultaFuncionario.getValueAt(TConsultaFuncionario.getSelectedRow(), 0).toString();
         
         try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM funcionario WHERE nome LIKE '"+funcionario+"%' ORDER BY Nome");

            while(rs.next()){
                
                int idFuncionario = rs.getInt("idFuncionario");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String rg = rs.getString("rg");
                String dataNascimento = rs.getString("dataNascimento");
                String CatHabilitacao = rs.getString("CatHabilitacao");
                String CNH = rs.getString("CNH");
                String PIS = rs.getString("PIS");
                String TelResidencial = rs.getString("TelResidencial");
                String Celular = rs.getString("Celular");
                String Endereco = rs.getString("Endereco");
                String NumEnd = rs.getString("NumEnd");
                String Bairro = rs.getString("Bairro");
                String Cidade = rs.getString("Cidade");
                String Estado = rs.getString("Estado");
                String CEP = rs.getString("CEP");
                String EstadoCivil = rs.getString("EstadoCivil");
                String Sexo = rs.getString("Sexo");
                if(Sexo.equals("Masculino"))
                        cadFuncionario.RBSexoMasc.setSelected(true);
                    else
                        cadFuncionario.RBSexoFem.setSelected(true);
                
                String Observacoes = rs.getString("Observacao");
                
                cadFuncionario.TFCodigo.setText(""+idFuncionario);
                cadFuncionario.TFNome.setText(nome);
                cadFuncionario.TFCPF.setText(cpf);
                cadFuncionario.TFRG.setText(rg);
                cadFuncionario.TFDataNasc.setText(dataNascimento);
                cadFuncionario.CBHabilitacao.setSelectedItem(CatHabilitacao);
                cadFuncionario.TFCartMotorista.setText(CNH);
                cadFuncionario.TFPIS.setText(PIS);
                cadFuncionario.TFTelResidencial.setText(TelResidencial);
                cadFuncionario.TFCelular.setText(Celular);
                cadFuncionario.TFEndereco.setText(Endereco);
                cadFuncionario.TFNumero.setText(NumEnd);
                cadFuncionario.TFBairro.setText(Bairro);
                cadFuncionario.TFCidade.setText(Cidade);
                cadFuncionario.CBEstado.setSelectedItem(Estado);
                cadFuncionario.TFCEP.setText(CEP);
                cadFuncionario.CBEstadoCivil.setSelectedItem(EstadoCivil);
                cadFuncionario.TAObservacoes.setText(Observacoes);
                
                cadFuncionario.TFCodigo.setEnabled(false);
                cadFuncionario.TFNome.setEnabled(true);
                cadFuncionario.TFCPF.setEnabled(true);
                cadFuncionario.TFRG.setEnabled(true);
                cadFuncionario.TFDataNasc.setEnabled(true);
                cadFuncionario.CBHabilitacao.setEnabled(true);
                cadFuncionario.TFCartMotorista.setEnabled(true);
                cadFuncionario.TFPIS.setEnabled(true);
                cadFuncionario.TFTelResidencial.setEnabled(true);
                cadFuncionario.TFCelular.setEnabled(true);
                cadFuncionario.TFEndereco.setEnabled(true);
                cadFuncionario.TFNumero.setEnabled(true);
                cadFuncionario.TFBairro.setEnabled(true);
                cadFuncionario.TFCidade.setEnabled(true);
                cadFuncionario.CBEstado.setEnabled(true);
                cadFuncionario.TFCEP.setEnabled(true);
                cadFuncionario.CBEstadoCivil.setEnabled(true);
                cadFuncionario.RBSexoMasc.setEnabled(true);
                cadFuncionario.RBSexoFem.setEnabled(true);
                cadFuncionario.TAObservacoes.setEnabled(true);
                
                cadFuncionario.BInserir.setEnabled(false);
                cadFuncionario.BAtualizar.setEnabled(true);
                cadFuncionario.BExcluir.setEnabled(true);
                cadFuncionario.BLimpar.setEnabled(true);


                 }
        }catch(Exception e){
            System.out.println(
                "Error ao consultar Fornecedor: "+e.getMessage());
        }
    this.dispose();
    }//GEN-LAST:event_BSelecionarFuncionarioActionPerformed

    private void BVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarActionPerformed
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarFuncionario;
    private javax.swing.JButton BSelecionarFuncionario;
    private javax.swing.JButton BVoltar;
    private javax.swing.JTable TConsultaFuncionario;
    private javax.swing.JTextField TFFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
