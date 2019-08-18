package logexpress;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadFornecedor extends javax.swing.JFrame {

    public CadFornecedor() {
        initComponents();
    }
    
     Connection conn;
     public CadFornecedor(Connection conn) {
        initComponents();
        this.conn = conn;
                        
                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        TFEmailFornecedor.setEnabled(false);
                        TFSiteFornecedor.setEnabled(false);
                        TFEnderecoFornecedor.setEnabled(false);
                        TFNumEnderecoFornecedor.setEnabled(false);
                        TFBairroFornecedor.setEnabled(false);
                        TFCidadeFornecedor.setEnabled(false);
                        CBEstadoFornecedor.setEnabled(false);
                        TFCEPFornecedor.setEnabled(false);
                        TAObservacoesFornecedor.setEnabled(false);
                        
                        BInserirFornecedor.setEnabled(false);
                        BLimparFornecedor.setEnabled(false);
                        BAtualizarFornecedor.setEnabled(false);
                        BExcluirFornecedor.setEnabled(false);
                        
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BInserirFornecedor = new javax.swing.JButton();
        BAtualizarFornecedor = new javax.swing.JButton();
        BLimparFornecedor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFNomeFornecedor = new javax.swing.JTextField();
        TFFantasiaFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFCNPJFornecedor = new javax.swing.JTextField();
        TFInscEstadualFornecedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFTelefone1Fornecedor = new javax.swing.JTextField();
        TFTelefone2Fornecedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TFFaxFornecedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFEmailFornecedor = new javax.swing.JTextField();
        TFSiteFornecedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TFCEPFornecedor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TFBairroFornecedor = new javax.swing.JTextField();
        TFNumEnderecoFornecedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CBEstadoFornecedor = new javax.swing.JComboBox();
        TFCidadeFornecedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TFEnderecoFornecedor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservacoesFornecedor = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        BVoltar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        BExcluirFornecedor = new javax.swing.JButton();
        LCodigoFornecedor = new javax.swing.JLabel();
        TFCodigoFornecedor = new javax.swing.JTextField();
        BInserirDadosFornecedor = new javax.swing.JButton();
        BBuscarFornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BInserirFornecedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BInserirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BInserirFornecedor.setText("Salvar");
        BInserirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirFornecedorActionPerformed(evt);
            }
        });

        BAtualizarFornecedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        BAtualizarFornecedor.setText("Atualizar");
        BAtualizarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarFornecedorActionPerformed(evt);
            }
        });

        BLimparFornecedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        BLimparFornecedor.setText("Limpar");
        BLimparFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparFornecedorActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 240, 240));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jLabel2.setText("Razão Social");

        jLabel3.setText("Nome Fantasia");

        jLabel4.setText("CNPJ / CPF");

        jLabel5.setText("Inscrição Estadual / RG");

        jLabel6.setText("Telefone 01");

        jLabel7.setText("Telefone 02");

        jLabel8.setText("Fax");

        jLabel9.setText("E-mail");

        jLabel10.setText("Site");

        jLabel17.setText("CEP");

        jLabel13.setText("Numero");

        jLabel14.setText("Bairro");

        jLabel16.setText("Estado");

        CBEstadoFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC ", "AL ", "AP ", "AM ", "BA ", "CE ", "DF ", "GO ", "ES ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN ", "RS ", "RO ", "RR ", "SP ", "SC ", "SE ", "TO" }));

        jLabel15.setText("Cidade");

        jLabel12.setText("Endereço");

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel19.setText("Observações");

        TAObservacoesFornecedor.setColumns(20);
        TAObservacoesFornecedor.setRows(5);
        TAObservacoesFornecedor.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jScrollPane1.setViewportView(TAObservacoesFornecedor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFInscEstadualFornecedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEmailFornecedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFSiteFornecedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNumEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFBairroFornecedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNomeFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFFantasiaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelefone1Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelefone2Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFaxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBEstadoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCEPFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(TFNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFantasiaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TFInscEstadualFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFTelefone1Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TFTelefone2Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TFFaxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TFSiteFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TFEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(TFNumEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(TFBairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TFCidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(CBEstadoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(TFCEPFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Cadastro Fornecedor");

        BVoltar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltar.setText("Voltar");
        BVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        BExcluirFornecedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BExcluirFornecedor.setText("Excluir");
        BExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirFornecedorActionPerformed(evt);
            }
        });

        LCodigoFornecedor.setText("Codigo");

        BInserirDadosFornecedor.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BInserirDadosFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionarDados.png"))); // NOI18N
        BInserirDadosFornecedor.setText("Inserir Dados");
        BInserirDadosFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDadosFornecedorActionPerformed(evt);
            }
        });

        BBuscarFornecedor.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        BBuscarFornecedor.setText("Buscar Fornecedor");
        BBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarFornecedorActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BInserirDadosFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarFornecedor))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BAtualizarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BInserirFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BLimparFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BExcluirFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LCodigoFornecedor))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BInserirDadosFornecedor)
                            .addComponent(BBuscarFornecedor)
                            .addComponent(LCodigoFornecedor)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BInserirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizarFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(BLimparFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluirFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarActionPerformed
this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarActionPerformed

    private void BInserirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirFornecedorActionPerformed

         if (!TFNomeFornecedor.getText().equals("") &&  !TFFantasiaFornecedor.getText().equals("") &&  !TFCNPJFornecedor.getText().equals("")){
        
           try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO fornecedor VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstm.setString(1, TFNomeFornecedor.getText());
            pstm.setString(2, TFFantasiaFornecedor.getText());
            pstm.setString(3, TFCNPJFornecedor.getText());
            pstm.setString(4, TFInscEstadualFornecedor.getText());
            pstm.setString(5, TFTelefone1Fornecedor.getText());
            pstm.setString(6, TFTelefone2Fornecedor.getText());
            pstm.setString(7, TFFaxFornecedor.getText());
            pstm.setString(8, TFEmailFornecedor.getText());
            pstm.setString(9, TFSiteFornecedor.getText());
            pstm.setString(10, TFEnderecoFornecedor.getText());
            pstm.setString(11, TFNumEnderecoFornecedor.getText());
            pstm.setString(12, TFBairroFornecedor.getText());
            pstm.setString(13, TFCidadeFornecedor.getText());
            pstm.setString(14, CBEstadoFornecedor.getSelectedItem().toString());
            pstm.setString(15, TFCEPFornecedor.getText());
            pstm.setString(16, TAObservacoesFornecedor.getText());          

            pstm.executeUpdate();
            pstm.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Atenção!!!\n\nErro ao inserir fornecedor!!");
        }
        
         }
         else
        {
            JOptionPane.showMessageDialog(null, "Entre com os Dados do Fornecedor para efetuar o cadastro!!");
        }
        
        JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com Sucesso!");
        
                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        TFEmailFornecedor.setEnabled(false);
                        TFSiteFornecedor.setEnabled(false);
                        TFEnderecoFornecedor.setEnabled(false);
                        TFNumEnderecoFornecedor.setEnabled(false);
                        TFBairroFornecedor.setEnabled(false);
                        TFCidadeFornecedor.setEnabled(false);
                        CBEstadoFornecedor.setEnabled(false);
                        TFCEPFornecedor.setEnabled(false);
                        TAObservacoesFornecedor.setEnabled(false);
                        
                        BInserirFornecedor.setEnabled(false);
                        BLimparFornecedor.setEnabled(false);
                        BAtualizarFornecedor.setEnabled(false);
                        BExcluirFornecedor.setEnabled(false);
                        
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);
                        
                        TFCodigoFornecedor.setText("");
                        TFNomeFornecedor.setText("");
                        TFFantasiaFornecedor.setText("");
                        TFCNPJFornecedor.setText("");
                        TFInscEstadualFornecedor.setText("");
                        TFTelefone1Fornecedor.setText("");
                        TFTelefone2Fornecedor.setText("");
                        TFFaxFornecedor.setText("");
                        TFEmailFornecedor.setText("");
                        TFSiteFornecedor.setText("");
                        TFEnderecoFornecedor.setText("");
                        TFNumEnderecoFornecedor.setText("");
                        TFBairroFornecedor.setText("");
                        TFCidadeFornecedor.setText("");
                        CBEstadoFornecedor.setSelectedItem("UF");
                        TFCEPFornecedor.setText("");
                        TAObservacoesFornecedor.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_BInserirFornecedorActionPerformed

    private void BAtualizarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarFornecedorActionPerformed
            
        try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE fornecedor SET nome = '"+TFNomeFornecedor.getText()+"',"
                    + "Fantasia = '"+TFFantasiaFornecedor.getText()+"',"
                    + "CNPJ = '"+TFCNPJFornecedor.getText()+"',"
                    + "InscEstadual = '"+TFInscEstadualFornecedor.getText()+"',"
                    + "Telefone1 = '"+TFTelefone1Fornecedor.getText()+"',"
                    + "Telefone2 = '"+TFTelefone2Fornecedor.getText()+"',"
                    + "Fax = '"+TFFaxFornecedor.getText()+"',"
                    + "Email = '"+TFEmailFornecedor.getText()+"',"
                    + "Site = '"+TFSiteFornecedor.getText()+"',"
                    + "Endereco = '"+TFEnderecoFornecedor.getText()+"',"
                    + "Numero = '"+TFNumEnderecoFornecedor.getText()+"',"
                    + "Bairro = '"+TFBairroFornecedor.getText()+"',"
                    + "Cidade = '"+TFCidadeFornecedor.getText()+"',"
                    + "Estado = '"+CBEstadoFornecedor.getSelectedItem()+"',"
                    + "CEP = '"+TFCEPFornecedor.getText()+"',"
                    + "Observacoes = '"+TAObservacoesFornecedor.getText()+"'"
                    + "WHERE Codigo = '"+TFCodigoFornecedor.getText()+"'");
            
                        
                        TFCodigoFornecedor.setText("");
                        TFNomeFornecedor.setText("");
                        TFFantasiaFornecedor.setText("");
                        TFCNPJFornecedor.setText("");
                        TFInscEstadualFornecedor.setText("");
                        TFTelefone1Fornecedor.setText("");
                        TFTelefone2Fornecedor.setText("");
                        TFFaxFornecedor.setText("");
                        TFEmailFornecedor.setText("");
                        TFSiteFornecedor.setText("");
                        TFEnderecoFornecedor.setText("");
                        TFNumEnderecoFornecedor.setText("");
                        TFBairroFornecedor.setText("");
                        TFCidadeFornecedor.setText("");
                        CBEstadoFornecedor.setSelectedItem("UF");
                        TFCEPFornecedor.setText("");
                        TAObservacoesFornecedor.setText("");
                        
                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        TFEmailFornecedor.setEnabled(false);
                        TFSiteFornecedor.setEnabled(false);
                        TFEnderecoFornecedor.setEnabled(false);
                        TFNumEnderecoFornecedor.setEnabled(false);
                        TFBairroFornecedor.setEnabled(false);
                        TFCidadeFornecedor.setEnabled(false);
                        CBEstadoFornecedor.setEnabled(false);
                        TFCEPFornecedor.setEnabled(false);
                        TAObservacoesFornecedor.setEnabled(false);
                        
                        BInserirFornecedor.setEnabled(false);
                        BLimparFornecedor.setEnabled(false);
                        BAtualizarFornecedor.setEnabled(false);
                        BExcluirFornecedor.setEnabled(false);
                        
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);

            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Funcionario Alterado com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Alterar Funcionário\n"+e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BAtualizarFornecedorActionPerformed

    private void BInserirDadosFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDadosFornecedorActionPerformed

                        TFNomeFornecedor.setText("");
                        TFFantasiaFornecedor.setText("");
                        TFCNPJFornecedor.setText("");
                        TFInscEstadualFornecedor.setText("");
                        TFTelefone1Fornecedor.setText("");
                        TFTelefone2Fornecedor.setText("");
                        TFFaxFornecedor.setText("");
                        TFEmailFornecedor.setText("");
                        TFSiteFornecedor.setText("");
                        TFEnderecoFornecedor.setText("");
                        TFNumEnderecoFornecedor.setText("");
                        TFBairroFornecedor.setText("");
                        TFCidadeFornecedor.setText("");
                        CBEstadoFornecedor.setSelectedItem("UF");
                        TFCEPFornecedor.setText("");
                        TAObservacoesFornecedor.setText("");
                                                
                        TFNomeFornecedor.setEnabled(true);
                        TFFantasiaFornecedor.setEnabled(true);
                        TFCNPJFornecedor.setEnabled(true);
                        TFInscEstadualFornecedor.setEnabled(true);
                        TFTelefone1Fornecedor.setEnabled(true);
                        TFTelefone2Fornecedor.setEnabled(true);
                        TFFaxFornecedor.setEnabled(true);
                        TFEmailFornecedor.setEnabled(true);
                        TFSiteFornecedor.setEnabled(true);
                        TFEnderecoFornecedor.setEnabled(true);
                        TFNumEnderecoFornecedor.setEnabled(true);
                        TFBairroFornecedor.setEnabled(true);
                        TFCidadeFornecedor.setEnabled(true);
                        CBEstadoFornecedor.setEnabled(true);
                        TFCEPFornecedor.setEnabled(true);
                        TAObservacoesFornecedor.setEnabled(true);
                        
                        BInserirFornecedor.setEnabled(true);
                        BLimparFornecedor.setEnabled(true);
                        BAtualizarFornecedor.setEnabled(false);
                        BExcluirFornecedor.setEnabled(false);

    }//GEN-LAST:event_BInserirDadosFornecedorActionPerformed

    private void BBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarFornecedorActionPerformed

        PesquisaFornecedor PF = new PesquisaFornecedor(conn, 
                        TFNomeFornecedor.getText(),
                        TFFantasiaFornecedor.getText(),
                        TFCNPJFornecedor.getText(),
                        TFInscEstadualFornecedor.getText(),
                        TFTelefone1Fornecedor.getText(),
                        TFTelefone2Fornecedor.getText(),
                        TFFaxFornecedor.getText(),
                        TFEmailFornecedor.getText(),
                        TFSiteFornecedor.getText(),
                        TFEnderecoFornecedor.getText(),
                        TFNumEnderecoFornecedor.getText(),
                        TFBairroFornecedor.getText(),
                        TFCidadeFornecedor.getText(),
                        (String)CBEstadoFornecedor.getSelectedItem(),
                        TFCEPFornecedor.getText(),
                        TAObservacoesFornecedor.getText(),
                        this);
        
        PF.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarFornecedorActionPerformed

    private void BExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirFornecedorActionPerformed
       
                 try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM fornecedor WHERE codigo = '"+TFCodigoFornecedor.getText()+"'");

                        TFNomeFornecedor.setText("");
                        TFFantasiaFornecedor.setText("");
                        TFCNPJFornecedor.setText("");
                        TFInscEstadualFornecedor.setText("");
                        TFTelefone1Fornecedor.setText("");
                        TFTelefone2Fornecedor.setText("");
                        TFFaxFornecedor.setText("");
                        TFEmailFornecedor.setText("");
                        TFSiteFornecedor.setText("");
                        TFEnderecoFornecedor.setText("");
                        TFNumEnderecoFornecedor.setText("");
                        TFBairroFornecedor.setText("");
                        TFCidadeFornecedor.setText("");
                        CBEstadoFornecedor.setSelectedItem("UF");
                        TFCEPFornecedor.setText("");
                        TAObservacoesFornecedor.setText("");
                        
                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        TFEmailFornecedor.setEnabled(false);
                        TFSiteFornecedor.setEnabled(false);
                        TFEnderecoFornecedor.setEnabled(false);
                        TFNumEnderecoFornecedor.setEnabled(false);
                        TFBairroFornecedor.setEnabled(false);
                        TFCidadeFornecedor.setEnabled(false);
                        CBEstadoFornecedor.setEnabled(false);
                        TFCEPFornecedor.setEnabled(false);
                        TAObservacoesFornecedor.setEnabled(false);
                        
                        BInserirFornecedor.setEnabled(false);
                        BLimparFornecedor.setEnabled(false);
                        BAtualizarFornecedor.setEnabled(false);
                        BExcluirFornecedor.setEnabled(false);
                        
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);
            
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Fornecedor Excluido com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Fornecedor\n"+e.getMessage());}
// TODO add your handling code here:
    }//GEN-LAST:event_BExcluirFornecedorActionPerformed

    private void BLimparFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparFornecedorActionPerformed

                        TFNomeFornecedor.setText("");
                        TFFantasiaFornecedor.setText("");
                        TFCNPJFornecedor.setText("");
                        TFInscEstadualFornecedor.setText("");
                        TFTelefone1Fornecedor.setText("");
                        TFTelefone2Fornecedor.setText("");
                        TFFaxFornecedor.setText("");
                        TFEmailFornecedor.setText("");
                        TFSiteFornecedor.setText("");
                        TFEnderecoFornecedor.setText("");
                        TFNumEnderecoFornecedor.setText("");
                        TFBairroFornecedor.setText("");
                        TFCidadeFornecedor.setText("");
                        CBEstadoFornecedor.setSelectedItem("UF");
                        TFCEPFornecedor.setText("");
                        TAObservacoesFornecedor.setText("");
                        
                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        TFEmailFornecedor.setEnabled(false);
                        TFSiteFornecedor.setEnabled(false);
                        TFEnderecoFornecedor.setEnabled(false);
                        TFNumEnderecoFornecedor.setEnabled(false);
                        TFBairroFornecedor.setEnabled(false);
                        TFCidadeFornecedor.setEnabled(false);
                        CBEstadoFornecedor.setEnabled(false);
                        TFCEPFornecedor.setEnabled(false);
                        TAObservacoesFornecedor.setEnabled(false);
                        
                        BInserirFornecedor.setEnabled(false);
                        BLimparFornecedor.setEnabled(false);
                        BAtualizarFornecedor.setEnabled(false);
                        BExcluirFornecedor.setEnabled(false);
                        
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);

    }//GEN-LAST:event_BLimparFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFornecedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarFornecedor;
    public javax.swing.JButton BBuscarFornecedor;
    public javax.swing.JButton BExcluirFornecedor;
    public javax.swing.JButton BInserirDadosFornecedor;
    public javax.swing.JButton BInserirFornecedor;
    public javax.swing.JButton BLimparFornecedor;
    public javax.swing.JButton BVoltar;
    public javax.swing.JComboBox CBEstadoFornecedor;
    public javax.swing.JLabel LCodigoFornecedor;
    public javax.swing.JTextArea TAObservacoesFornecedor;
    public javax.swing.JTextField TFBairroFornecedor;
    public javax.swing.JTextField TFCEPFornecedor;
    public javax.swing.JTextField TFCNPJFornecedor;
    public javax.swing.JTextField TFCidadeFornecedor;
    public javax.swing.JTextField TFCodigoFornecedor;
    public javax.swing.JTextField TFEmailFornecedor;
    public javax.swing.JTextField TFEnderecoFornecedor;
    public javax.swing.JTextField TFFantasiaFornecedor;
    public javax.swing.JTextField TFFaxFornecedor;
    public javax.swing.JTextField TFInscEstadualFornecedor;
    public javax.swing.JTextField TFNomeFornecedor;
    public javax.swing.JTextField TFNumEnderecoFornecedor;
    public javax.swing.JTextField TFSiteFornecedor;
    public javax.swing.JTextField TFTelefone1Fornecedor;
    public javax.swing.JTextField TFTelefone2Fornecedor;
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
