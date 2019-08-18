package logexpress;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadCliente extends javax.swing.JFrame {

    public CadCliente() {
        initComponents();
    }
    
         Connection conn;
     public CadCliente(Connection conn) {
        initComponents();
        this.conn = conn;
        
                        TFCodigoCliente.setEnabled(false);
                        TFNomeCliente.setEnabled(false);
                        TFFantasiaCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFInscEstadualCliente.setEnabled(false);
                        TFTelefone1Cliente.setEnabled(false);
                        TFTelefone2Cliente.setEnabled(false);
                        TFFaxCliente.setEnabled(false);
                        TFEmailCliente.setEnabled(false);
                        TFSiteCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        TFCEPCliente.setEnabled(false);
                        TAObservacoesCliente.setEnabled(false);
                        
                        BInserirCliente.setEnabled(false);
                        BLimparCliente.setEnabled(false);
                        BAtualizarCliente.setEnabled(false);
                        BExcluirCliente.setEnabled(false);
                        
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BExcluirCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BInserirCliente = new javax.swing.JButton();
        BAtualizarCliente = new javax.swing.JButton();
        BLimparCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFNomeCliente = new javax.swing.JTextField();
        TFFantasiaCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFCNPJCliente = new javax.swing.JTextField();
        TFInscEstadualCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFTelefone1Cliente = new javax.swing.JTextField();
        TFTelefone2Cliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TFFaxCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFEmailCliente = new javax.swing.JTextField();
        TFSiteCliente = new javax.swing.JTextField();
        TFCEPCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TFBairroCliente = new javax.swing.JTextField();
        TFNumEndCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CBEstadoCliente = new javax.swing.JComboBox();
        TFCidadeCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TFEnderecoCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservacoesCliente = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        BVoltarCliente = new javax.swing.JButton();
        LCodigoCliente = new javax.swing.JLabel();
        TFCodigoCliente = new javax.swing.JTextField();
        BInserirDadosCliente = new javax.swing.JButton();
        BBuscarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BExcluirCliente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BExcluirCliente.setText("Excluir");
        BExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");

        BInserirCliente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BInserirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BInserirCliente.setText("Gravar");
        BInserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirClienteActionPerformed(evt);
            }
        });

        BAtualizarCliente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        BAtualizarCliente.setText("Atualizar");
        BAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarClienteActionPerformed(evt);
            }
        });

        BLimparCliente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        BLimparCliente.setText("Limpar");
        BLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparClienteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 240, 240));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jLabel2.setText("Nome / Razão Social");

        jLabel3.setText("Nome Fantasia(CNPJ)");

        jLabel4.setText("CNPJ / CPF");

        jLabel5.setText("Insc Estadual / RG");

        jLabel6.setText("Telefone 01");

        jLabel7.setText("Telefone 02");

        jLabel8.setText("Fax");

        jLabel9.setText("E-mail");

        jLabel17.setText("CEP");

        jLabel13.setText("Numero");

        jLabel16.setText("Estado");

        CBEstadoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", " AP", " AM", " BA", " CE", " DF", " ES", " GO", " MA", " MT", " MS", " MG", " PA", " PB", " PR", " PE", " PI", " RJ", " RN", " RS", " RO", " RR", " SC", " SP", " SE", " TO", " " }));

        jLabel15.setText("Cidade");

        jLabel12.setText("Endereço");

        jLabel10.setText("Site");

        jLabel14.setText("Bairro");

        TAObservacoesCliente.setColumns(20);
        TAObservacoesCliente.setRows(5);
        TAObservacoesCliente.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jScrollPane1.setViewportView(TAObservacoesCliente);

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel19.setText("Observações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(TFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFFantasiaCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(TFEmailCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCNPJCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFInscEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelefone1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelefone2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFFaxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFSiteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNumEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFantasiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFCNPJCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TFInscEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFTelefone1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TFTelefone2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TFFaxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TFSiteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TFEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(TFNumEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(TFBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(TFCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(TFCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        BVoltarCliente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BVoltarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltarCliente.setText("Voltar");
        BVoltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarClienteActionPerformed(evt);
            }
        });

        LCodigoCliente.setText("Codigo");

        BInserirDadosCliente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BInserirDadosCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionarDados.png"))); // NOI18N
        BInserirDadosCliente.setText("Inserir Dados");
        BInserirDadosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDadosClienteActionPerformed(evt);
            }
        });

        BBuscarCliente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        BBuscarCliente.setText("Buscar Cliente");
        BBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LCodigoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BInserirDadosCliente)
                        .addGap(18, 18, 18)
                        .addComponent(BBuscarCliente))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BVoltarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LCodigoCliente)
                                    .addComponent(TFCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BInserirDadosCliente)
                                .addComponent(BBuscarCliente)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(BLimparCliente)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluirCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BVoltarCliente))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarClienteActionPerformed
this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarClienteActionPerformed

    private void BInserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirClienteActionPerformed

             if (!TFNomeCliente.getText().equals("") &&  !TFFantasiaCliente.getText().equals("") &&  !TFCNPJCliente.getText().equals("")){
        
           try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO Clientes VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstm.setString(1, TFNomeCliente.getText());
            pstm.setString(2, TFFantasiaCliente.getText());
            pstm.setString(3, TFCNPJCliente.getText());
            pstm.setString(4, TFInscEstadualCliente.getText());
            pstm.setString(5, TFTelefone1Cliente.getText());
            pstm.setString(6, TFTelefone2Cliente.getText());
            pstm.setString(7, TFFaxCliente.getText());
            pstm.setString(8, TFEmailCliente.getText());
            pstm.setString(9, TFSiteCliente.getText());
            pstm.setString(10, TFEnderecoCliente.getText());
            pstm.setString(11, TFNumEndCliente.getText());
            pstm.setString(12, TFBairroCliente.getText());
            pstm.setString(13, TFCidadeCliente.getText());
            pstm.setString(14, CBEstadoCliente.getSelectedItem().toString());
            pstm.setString(15, TFCEPCliente.getText());
            pstm.setString(16, TAObservacoesCliente.getText());          

            pstm.executeUpdate();
            pstm.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Atenção!!!\n\nErro ao inserir Cliente!!");
        }
        
         }
         else
        {
            JOptionPane.showMessageDialog(null, "Entre com os Dados do Cliente para efetuar o cadastro!!");
        }
        
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");
        
        this.dispose();
// TODO add your handling code here:
    

// TODO add your handling code here:
    }//GEN-LAST:event_BInserirClienteActionPerformed

    private void BInserirDadosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDadosClienteActionPerformed

        TFNomeCliente.setText("");
        TFFantasiaCliente.setText("");
        TFCNPJCliente.setText("");
        TFInscEstadualCliente.setText("");
        TFTelefone1Cliente.setText("");
        TFTelefone2Cliente.setText("");
        TFFaxCliente.setText("");
        TFEmailCliente.setText("");
        TFSiteCliente.setText("");
        TFEnderecoCliente.setText("");
        TFNumEndCliente.setText("");
        TFBairroCliente.setText("");
        TFCidadeCliente.setText("");
        CBEstadoCliente.setSelectedItem("UF");
        TFCEPCliente.setText("");
        TAObservacoesCliente.setText("");

        TFNomeCliente.setEnabled(true);
        TFFantasiaCliente.setEnabled(true);
        TFCNPJCliente.setEnabled(true);
        TFInscEstadualCliente.setEnabled(true);
        TFTelefone1Cliente.setEnabled(true);
        TFTelefone2Cliente.setEnabled(true);
        TFFaxCliente.setEnabled(true);
        TFEmailCliente.setEnabled(true);
        TFSiteCliente.setEnabled(true);
        TFEnderecoCliente.setEnabled(true);
        TFNumEndCliente.setEnabled(true);
        TFBairroCliente.setEnabled(true);
        TFCidadeCliente.setEnabled(true);
        CBEstadoCliente.setEnabled(true);
        TFCEPCliente.setEnabled(true);
        TAObservacoesCliente.setEnabled(true);

        BInserirCliente.setEnabled(true);
        BLimparCliente.setEnabled(true);
        BAtualizarCliente.setEnabled(false);
        BExcluirCliente.setEnabled(false);
    }//GEN-LAST:event_BInserirDadosClienteActionPerformed

    private void BBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarClienteActionPerformed

        PesquisaCliente PC = new PesquisaCliente(conn,
            TFNomeCliente.getText(),
            TFFantasiaCliente.getText(),
            TFCNPJCliente.getText(),
            TFInscEstadualCliente.getText(),
            TFTelefone1Cliente.getText(),
            TFTelefone2Cliente.getText(),
            TFFaxCliente.getText(),
            TFEmailCliente.getText(),
            TFSiteCliente.getText(),
            TFEnderecoCliente.getText(),
            TFNumEndCliente.getText(),
            TFBairroCliente.getText(),
            TFCidadeCliente.getText(),
            (String)CBEstadoCliente.getSelectedItem(),
            TFCEPCliente.getText(),
            TAObservacoesCliente.getText(),
            this);

        PC.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarClienteActionPerformed

    private void BLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparClienteActionPerformed
        
        TFNomeCliente.setText("");
                        TFFantasiaCliente.setText("");
                        TFCNPJCliente.setText("");
                        TFInscEstadualCliente.setText("");
                        TFTelefone1Cliente.setText("");
                        TFTelefone2Cliente.setText("");
                        TFFaxCliente.setText("");
                        TFEmailCliente.setText("");
                        TFSiteCliente.setText("");
                        TFEnderecoCliente.setText("");
                        TFNumEndCliente.setText("");
                        TFBairroCliente.setText("");
                        TFCidadeCliente.setText("");
                        CBEstadoCliente.setSelectedItem("UF");
                        TFCEPCliente.setText("");
                        TAObservacoesCliente.setText("");
                        
                        TFCodigoCliente.setEnabled(false);
                        TFNomeCliente.setEnabled(false);
                        TFFantasiaCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFInscEstadualCliente.setEnabled(false);
                        TFTelefone1Cliente.setEnabled(false);
                        TFTelefone2Cliente.setEnabled(false);
                        TFFaxCliente.setEnabled(false);
                        TFEmailCliente.setEnabled(false);
                        TFSiteCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        TFCEPCliente.setEnabled(false);
                        TAObservacoesCliente.setEnabled(false);
                        
                        BInserirCliente.setEnabled(false);
                        BLimparCliente.setEnabled(false);
                        BAtualizarCliente.setEnabled(false);
                        BExcluirCliente.setEnabled(false);
                        
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);
        
    }//GEN-LAST:event_BLimparClienteActionPerformed

    private void BAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarClienteActionPerformed
        
                 
        try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE Clientes SET nome = '"+TFNomeCliente.getText()+"',"
                    + "Fantasia = '"+TFFantasiaCliente.getText()+"',"
                    + "CNPJ = '"+TFCNPJCliente.getText()+"',"
                    + "InscEstadual = '"+TFInscEstadualCliente.getText()+"',"
                    + "Telefone1 = '"+TFTelefone1Cliente.getText()+"',"
                    + "Telefone2 = '"+TFTelefone2Cliente.getText()+"',"
                    + "Fax = '"+TFFaxCliente.getText()+"',"
                    + "Email = '"+TFEmailCliente.getText()+"',"
                    + "Site = '"+TFSiteCliente.getText()+"',"
                    + "Endereco = '"+TFEnderecoCliente.getText()+"',"
                    + "Numero = '"+TFNumEndCliente.getText()+"',"
                    + "Bairro = '"+TFBairroCliente.getText()+"',"
                    + "Cidade = '"+TFCidadeCliente.getText()+"',"
                    + "Estado = '"+CBEstadoCliente.getSelectedItem()+"',"
                    + "CEP = '"+TFCEPCliente.getText()+"',"
                    + "Observacoes = '"+TAObservacoesCliente.getText()+"'"
                    + "WHERE Codigo = '"+TFCodigoCliente.getText()+"'");
            
                        
                        TFCodigoCliente.setText("");
                        TFNomeCliente.setText("");
                        TFFantasiaCliente.setText("");
                        TFCNPJCliente.setText("");
                        TFInscEstadualCliente.setText("");
                        TFTelefone1Cliente.setText("");
                        TFTelefone2Cliente.setText("");
                        TFFaxCliente.setText("");
                        TFEmailCliente.setText("");
                        TFSiteCliente.setText("");
                        TFEnderecoCliente.setText("");
                        TFNumEndCliente.setText("");
                        TFBairroCliente.setText("");
                        TFCidadeCliente.setText("");
                        CBEstadoCliente.setSelectedItem("UF");
                        TFCEPCliente.setText("");
                        TAObservacoesCliente.setText("");
                        
                        TFCodigoCliente.setEnabled(false);
                        TFNomeCliente.setEnabled(false);
                        TFFantasiaCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFInscEstadualCliente.setEnabled(false);
                        TFTelefone1Cliente.setEnabled(false);
                        TFTelefone2Cliente.setEnabled(false);
                        TFFaxCliente.setEnabled(false);
                        TFEmailCliente.setEnabled(false);
                        TFSiteCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        TFCEPCliente.setEnabled(false);
                        TAObservacoesCliente.setEnabled(false);
                        
                        BInserirCliente.setEnabled(false);
                        BLimparCliente.setEnabled(false);
                        BAtualizarCliente.setEnabled(false);
                        BExcluirCliente.setEnabled(false);
                        
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);


            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Cliente Alterado com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Alterar Cliente\n"+e.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_BAtualizarClienteActionPerformed

    private void BExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirClienteActionPerformed
        
              
                 try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM Clientes WHERE codigo = '"+TFCodigoCliente.getText()+"'");

                        TFNomeCliente.setText("");
                        TFFantasiaCliente.setText("");
                        TFCNPJCliente.setText("");
                        TFInscEstadualCliente.setText("");
                        TFTelefone1Cliente.setText("");
                        TFTelefone2Cliente.setText("");
                        TFFaxCliente.setText("");
                        TFEmailCliente.setText("");
                        TFSiteCliente.setText("");
                        TFEnderecoCliente.setText("");
                        TFNumEndCliente.setText("");
                        TFBairroCliente.setText("");
                        TFCidadeCliente.setText("");
                        CBEstadoCliente.setSelectedItem("UF");
                        TFCEPCliente.setText("");
                        TAObservacoesCliente.setText("");
                        
                        TFCodigoCliente.setEnabled(false);
                        TFNomeCliente.setEnabled(false);
                        TFFantasiaCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFInscEstadualCliente.setEnabled(false);
                        TFTelefone1Cliente.setEnabled(false);
                        TFTelefone2Cliente.setEnabled(false);
                        TFFaxCliente.setEnabled(false);
                        TFEmailCliente.setEnabled(false);
                        TFSiteCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        TFCEPCliente.setEnabled(false);
                        TAObservacoesCliente.setEnabled(false);
                        
                        BInserirCliente.setEnabled(false);
                        BLimparCliente.setEnabled(false);
                        BAtualizarCliente.setEnabled(false);
                        BExcluirCliente.setEnabled(false);
                        
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);
            
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Cliente Excluido com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Cliente\n"+e.getMessage());}
// TODO add your handling code here:
    }//GEN-LAST:event_BExcluirClienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarCliente;
    public javax.swing.JButton BBuscarCliente;
    public javax.swing.JButton BExcluirCliente;
    public javax.swing.JButton BInserirCliente;
    public javax.swing.JButton BInserirDadosCliente;
    public javax.swing.JButton BLimparCliente;
    public javax.swing.JButton BVoltarCliente;
    public javax.swing.JComboBox CBEstadoCliente;
    public javax.swing.JLabel LCodigoCliente;
    public javax.swing.JTextArea TAObservacoesCliente;
    public javax.swing.JTextField TFBairroCliente;
    public javax.swing.JTextField TFCEPCliente;
    public javax.swing.JTextField TFCNPJCliente;
    public javax.swing.JTextField TFCidadeCliente;
    public javax.swing.JTextField TFCodigoCliente;
    public javax.swing.JTextField TFEmailCliente;
    public javax.swing.JTextField TFEnderecoCliente;
    public javax.swing.JTextField TFFantasiaCliente;
    public javax.swing.JTextField TFFaxCliente;
    public javax.swing.JTextField TFInscEstadualCliente;
    public javax.swing.JTextField TFNomeCliente;
    public javax.swing.JTextField TFNumEndCliente;
    public javax.swing.JTextField TFSiteCliente;
    public javax.swing.JTextField TFTelefone1Cliente;
    public javax.swing.JTextField TFTelefone2Cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
