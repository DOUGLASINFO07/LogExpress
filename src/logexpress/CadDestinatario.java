package logexpress;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadDestinatario extends javax.swing.JFrame {

    public CadDestinatario() {
        initComponents();
    }
    
     Connection conn;
     public CadDestinatario(Connection conn) {
        initComponents();
        this.conn = conn;
        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFFantasiaDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFInscEstadualDestinatario.setEnabled(false);
                        TFTelefone1Destinatario.setEnabled(false);
                        TFTelefone2Destinatario.setEnabled(false);
                        TFFaxDestinatario.setEnabled(false);
                        TFEmailDestinatario.setEnabled(false);
                        TFSiteDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        TFCEPDestinatario.setEnabled(false);
                        TAObservacoesDestinatario.setEnabled(false);
                        
                        BInserirDestinatario.setEnabled(false);
                        BLimparDestinatario.setEnabled(false);
                        BAtualizarDestinatario.setEnabled(false);
                        BExcluirDestinatario.setEnabled(false);
                        
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);
        
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BInserirDestinatario = new javax.swing.JButton();
        BAtualizarDestinatario = new javax.swing.JButton();
        BLimparDestinatario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFNomeDestinatario = new javax.swing.JTextField();
        TFFantasiaDestinatario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFCNPJDestinatario = new javax.swing.JTextField();
        TFInscEstadualDestinatario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFTelefone1Destinatario = new javax.swing.JTextField();
        TFTelefone2Destinatario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TFFaxDestinatario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFEmailDestinatario = new javax.swing.JTextField();
        TFSiteDestinatario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TFCEPDestinatario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TFBairroDestinatario = new javax.swing.JTextField();
        TFNumEndDestinatario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CBEstadoDestinatario = new javax.swing.JComboBox();
        TFCidadeDestinatario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TFEnderecoDestinatario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservacoesDestinatario = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BVoltarDestinatario = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        BExcluirDestinatario = new javax.swing.JButton();
        LCodigoDestinatario = new javax.swing.JLabel();
        TFCodigoDestinatario = new javax.swing.JTextField();
        BInserirDadosDestinatario = new javax.swing.JButton();
        BBuscarDestinatario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BInserirDestinatario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BInserirDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BInserirDestinatario.setText("Gravar");
        BInserirDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDestinatarioActionPerformed(evt);
            }
        });

        BAtualizarDestinatario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        BAtualizarDestinatario.setText("Atualizar");
        BAtualizarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarDestinatarioActionPerformed(evt);
            }
        });

        BLimparDestinatario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        BLimparDestinatario.setText("Limpar");
        BLimparDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparDestinatarioActionPerformed(evt);
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

        jLabel10.setText("Site");

        jLabel17.setText("CEP");

        jLabel13.setText("Numero");

        jLabel14.setText("Bairro");

        jLabel16.setText("Estado");

        CBEstadoDestinatario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", " AP", " AM", " BA", " CE", " DF", " ES", " GO", " MA", " MT", " MS", " MG", " PA", " PB", " PR", " PE", " PI", " RJ", " RN", " RS", " RO", " RR", " SC", " SP", " SE", " TO", " ", " " }));

        jLabel15.setText("Cidade");

        jLabel12.setText("Endereço");

        TAObservacoesDestinatario.setColumns(20);
        TAObservacoesDestinatario.setRows(5);
        TAObservacoesDestinatario.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jScrollPane1.setViewportView(TAObservacoesDestinatario);

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel19.setText("Observações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCidadeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBEstadoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCEPDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFSiteDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(1, 1, 1)
                                .addComponent(TFTelefone1Destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFTelefone2Destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFaxDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCNPJDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFInscEstadualDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFNomeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFantasiaDestinatario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEmailDestinatario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEnderecoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNumEndDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFBairroDestinatario))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFNomeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFantasiaDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFCNPJDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TFInscEstadualDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(TFTelefone1Destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFTelefone2Destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFaxDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFEmailDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TFSiteDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TFEnderecoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(TFNumEndDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(TFBairroDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TFCidadeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(CBEstadoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(TFCEPDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Cadastro de Destinatário");

        BVoltarDestinatario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BVoltarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltarDestinatario.setText("Voltar");
        BVoltarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarDestinatarioActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        BExcluirDestinatario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BExcluirDestinatario.setText("Excluir");
        BExcluirDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirDestinatarioActionPerformed(evt);
            }
        });

        LCodigoDestinatario.setText("Codigo");

        BInserirDadosDestinatario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BInserirDadosDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionarDados.png"))); // NOI18N
        BInserirDadosDestinatario.setText("Inserir Dados");
        BInserirDadosDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDadosDestinatarioActionPerformed(evt);
            }
        });

        BBuscarDestinatario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        BBuscarDestinatario.setText("Buscar Destinatário");
        BBuscarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarDestinatarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BInserirDadosDestinatario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarDestinatario))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(LCodigoDestinatario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCodigoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BInserirDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAtualizarDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BLimparDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BExcluirDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BVoltarDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LCodigoDestinatario)
                            .addComponent(TFCodigoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BInserirDadosDestinatario)
                            .addComponent(BBuscarDestinatario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BInserirDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizarDestinatario)
                        .addGap(18, 18, 18)
                        .addComponent(BLimparDestinatario)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluirDestinatario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BVoltarDestinatario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarDestinatarioActionPerformed

        this.dispose(); 
       
    }//GEN-LAST:event_BVoltarDestinatarioActionPerformed

    private void BInserirDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDestinatarioActionPerformed

         if (!TFNomeDestinatario.getText().equals("") &&  !TFFantasiaDestinatario.getText().equals("") &&  !TFCNPJDestinatario.getText().equals("")){
        
           try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO Destinatario VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstm.setString(1, TFNomeDestinatario.getText());
            pstm.setString(2, TFFantasiaDestinatario.getText());
            pstm.setString(3, TFCNPJDestinatario.getText());
            pstm.setString(4, TFInscEstadualDestinatario.getText());
            pstm.setString(5, TFTelefone1Destinatario.getText());
            pstm.setString(6, TFTelefone2Destinatario.getText());
            pstm.setString(7, TFFaxDestinatario.getText());
            pstm.setString(8, TFEmailDestinatario.getText());
            pstm.setString(9, TFSiteDestinatario.getText());
            pstm.setString(10, TFEnderecoDestinatario.getText());
            pstm.setString(11, TFNumEndDestinatario.getText());
            pstm.setString(12, TFBairroDestinatario.getText());
            pstm.setString(13, TFCidadeDestinatario.getText());
            pstm.setString(14, CBEstadoDestinatario.getSelectedItem().toString());
            pstm.setString(15, TFCEPDestinatario.getText());
            pstm.setString(16, TAObservacoesDestinatario.getText());          

            pstm.executeUpdate();
            pstm.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Atenção!!!\n\nErro ao inserir Destinatario!!");
        }
        
         }
         else
        {
            JOptionPane.showMessageDialog(null, "Entre com os Dados do Destinatario para efetuar o cadastro!!");
        }
        
        JOptionPane.showMessageDialog(null, "Destinatario Cadastrado com Sucesso!");
        
                                TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFFantasiaDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFInscEstadualDestinatario.setEnabled(false);
                        TFTelefone1Destinatario.setEnabled(false);
                        TFTelefone2Destinatario.setEnabled(false);
                        TFFaxDestinatario.setEnabled(false);
                        TFEmailDestinatario.setEnabled(false);
                        TFSiteDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        TFCEPDestinatario.setEnabled(false);
                        TAObservacoesDestinatario.setEnabled(false);
                        
                        BInserirDestinatario.setEnabled(false);
                        BLimparDestinatario.setEnabled(false);
                        BAtualizarDestinatario.setEnabled(false);
                        BExcluirDestinatario.setEnabled(false);
                        
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);
                        
                        TFCodigoDestinatario.setText("");
                        TFNomeDestinatario.setText("");
                        TFFantasiaDestinatario.setText("");
                        TFCNPJDestinatario.setText("");
                        TFInscEstadualDestinatario.setText("");
                        TFTelefone1Destinatario.setText("");
                        TFTelefone2Destinatario.setText("");
                        TFFaxDestinatario.setText("");
                        TFEmailDestinatario.setText("");
                        TFSiteDestinatario.setText("");
                        TFEnderecoDestinatario.setText("");
                        TFNumEndDestinatario.setText("");
                        TFBairroDestinatario.setText("");
                        TFCidadeDestinatario.setText("");
                        CBEstadoDestinatario.setSelectedItem("UF");
                        TFCEPDestinatario.setText("");
                        TAObservacoesDestinatario.setText("");

    }//GEN-LAST:event_BInserirDestinatarioActionPerformed

    private void BInserirDadosDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDadosDestinatarioActionPerformed

        TFNomeDestinatario.setText("");
        TFFantasiaDestinatario.setText("");
        TFCNPJDestinatario.setText("");
        TFInscEstadualDestinatario.setText("");
        TFTelefone1Destinatario.setText("");
        TFTelefone2Destinatario.setText("");
        TFFaxDestinatario.setText("");
        TFEmailDestinatario.setText("");
        TFSiteDestinatario.setText("");
        TFEnderecoDestinatario.setText("");
        TFNumEndDestinatario.setText("");
        TFBairroDestinatario.setText("");
        TFCidadeDestinatario.setText("");
        CBEstadoDestinatario.setSelectedItem("UF");
        TFCEPDestinatario.setText("");
        TAObservacoesDestinatario.setText("");

        TFNomeDestinatario.setEnabled(true);
        TFFantasiaDestinatario.setEnabled(true);
        TFCNPJDestinatario.setEnabled(true);
        TFInscEstadualDestinatario.setEnabled(true);
        TFTelefone1Destinatario.setEnabled(true);
        TFTelefone2Destinatario.setEnabled(true);
        TFFaxDestinatario.setEnabled(true);
        TFEmailDestinatario.setEnabled(true);
        TFSiteDestinatario.setEnabled(true);
        TFEnderecoDestinatario.setEnabled(true);
        TFNumEndDestinatario.setEnabled(true);
        TFBairroDestinatario.setEnabled(true);
        TFCidadeDestinatario.setEnabled(true);
        CBEstadoDestinatario.setEnabled(true);
        TFCEPDestinatario.setEnabled(true);
        TAObservacoesDestinatario.setEnabled(true);

        BInserirDestinatario.setEnabled(true);
        BLimparDestinatario.setEnabled(true);
        BAtualizarDestinatario.setEnabled(false);
        BExcluirDestinatario.setEnabled(false);
    }//GEN-LAST:event_BInserirDadosDestinatarioActionPerformed

    private void BBuscarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarDestinatarioActionPerformed

        PesquisaDestinatario PF = new PesquisaDestinatario(conn,
            TFNomeDestinatario.getText(),
            TFFantasiaDestinatario.getText(),
            TFCNPJDestinatario.getText(),
            TFInscEstadualDestinatario.getText(),
            TFTelefone1Destinatario.getText(),
            TFTelefone2Destinatario.getText(),
            TFFaxDestinatario.getText(),
            TFEmailDestinatario.getText(),
            TFSiteDestinatario.getText(),
            TFEnderecoDestinatario.getText(),
            TFNumEndDestinatario.getText(),
            TFBairroDestinatario.getText(),
            TFCidadeDestinatario.getText(),
            (String)CBEstadoDestinatario.getSelectedItem(),
            TFCEPDestinatario.getText(),
            TAObservacoesDestinatario.getText(),
            this);

        PF.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarDestinatarioActionPerformed

    private void BExcluirDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirDestinatarioActionPerformed

                         try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM destinatario WHERE codigo = '"+TFCodigoDestinatario.getText()+"'");

                        TFNomeDestinatario.setText("");
                        TFFantasiaDestinatario.setText("");
                        TFCNPJDestinatario.setText("");
                        TFInscEstadualDestinatario.setText("");
                        TFTelefone1Destinatario.setText("");
                        TFTelefone2Destinatario.setText("");
                        TFFaxDestinatario.setText("");
                        TFEmailDestinatario.setText("");
                        TFSiteDestinatario.setText("");
                        TFEnderecoDestinatario.setText("");
                        TFNumEndDestinatario.setText("");
                        TFBairroDestinatario.setText("");
                        TFCidadeDestinatario.setText("");
                        CBEstadoDestinatario.setSelectedItem("UF");
                        TFCEPDestinatario.setText("");
                        TAObservacoesDestinatario.setText("");
                        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFFantasiaDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFInscEstadualDestinatario.setEnabled(false);
                        TFTelefone1Destinatario.setEnabled(false);
                        TFTelefone2Destinatario.setEnabled(false);
                        TFFaxDestinatario.setEnabled(false);
                        TFEmailDestinatario.setEnabled(false);
                        TFSiteDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        TFCEPDestinatario.setEnabled(false);
                        TAObservacoesDestinatario.setEnabled(false);
                        
                        BInserirDestinatario.setEnabled(false);
                        BLimparDestinatario.setEnabled(false);
                        BAtualizarDestinatario.setEnabled(false);
                        BExcluirDestinatario.setEnabled(false);
                        
                        LCodigoDestinatario.setVisible(true);
                        TFCodigoDestinatario.setVisible(true);
            
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Destinatario Excluido com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Destinatario\n"+e.getMessage());}

    }//GEN-LAST:event_BExcluirDestinatarioActionPerformed

    private void BLimparDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparDestinatarioActionPerformed

                        TFNomeDestinatario.setText("");
                        TFFantasiaDestinatario.setText("");
                        TFCNPJDestinatario.setText("");
                        TFInscEstadualDestinatario.setText("");
                        TFTelefone1Destinatario.setText("");
                        TFTelefone2Destinatario.setText("");
                        TFFaxDestinatario.setText("");
                        TFEmailDestinatario.setText("");
                        TFSiteDestinatario.setText("");
                        TFEnderecoDestinatario.setText("");
                        TFNumEndDestinatario.setText("");
                        TFBairroDestinatario.setText("");
                        TFCidadeDestinatario.setText("");
                        CBEstadoDestinatario.setSelectedItem("UF");
                        TFCEPDestinatario.setText("");
                        TAObservacoesDestinatario.setText("");
                        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFFantasiaDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFInscEstadualDestinatario.setEnabled(false);
                        TFTelefone1Destinatario.setEnabled(false);
                        TFTelefone2Destinatario.setEnabled(false);
                        TFFaxDestinatario.setEnabled(false);
                        TFEmailDestinatario.setEnabled(false);
                        TFSiteDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        TFCEPDestinatario.setEnabled(false);
                        TAObservacoesDestinatario.setEnabled(false);
                        
                        BInserirDestinatario.setEnabled(false);
                        BLimparDestinatario.setEnabled(false);
                        BAtualizarDestinatario.setEnabled(false);
                        BExcluirDestinatario.setEnabled(false);
                        
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);

    }//GEN-LAST:event_BLimparDestinatarioActionPerformed

    private void BAtualizarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarDestinatarioActionPerformed
       
 try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE destinatario SET nome = '"+TFNomeDestinatario.getText()+"',"
                    + "Fantasia = '"+TFFantasiaDestinatario.getText()+"',"
                    + "CNPJ = '"+TFCNPJDestinatario.getText()+"',"
                    + "InscEstadual = '"+TFInscEstadualDestinatario.getText()+"',"
                    + "Telefone1 = '"+TFTelefone1Destinatario.getText()+"',"
                    + "Telefone2 = '"+TFTelefone2Destinatario.getText()+"',"
                    + "Fax = '"+TFFaxDestinatario.getText()+"',"
                    + "Email = '"+TFEmailDestinatario.getText()+"',"
                    + "Site = '"+TFSiteDestinatario.getText()+"',"
                    + "Endereco = '"+TFEnderecoDestinatario.getText()+"',"
                    + "Numero = '"+TFNumEndDestinatario.getText()+"',"
                    + "Bairro = '"+TFBairroDestinatario.getText()+"',"
                    + "Cidade = '"+TFCidadeDestinatario.getText()+"',"
                    + "Estado = '"+CBEstadoDestinatario.getSelectedItem()+"',"
                    + "CEP = '"+TFCEPDestinatario.getText()+"',"
                    + "Observacoes = '"+TAObservacoesDestinatario.getText()+"'"
                    + "WHERE Codigo = '"+TFCodigoDestinatario.getText()+"'");
            
                        
                        TFCodigoDestinatario.setText("");
                        TFNomeDestinatario.setText("");
                        TFFantasiaDestinatario.setText("");
                        TFCNPJDestinatario.setText("");
                        TFInscEstadualDestinatario.setText("");
                        TFTelefone1Destinatario.setText("");
                        TFTelefone2Destinatario.setText("");
                        TFFaxDestinatario.setText("");
                        TFEmailDestinatario.setText("");
                        TFSiteDestinatario.setText("");
                        TFEnderecoDestinatario.setText("");
                        TFNumEndDestinatario.setText("");
                        TFBairroDestinatario.setText("");
                        TFCidadeDestinatario.setText("");
                        CBEstadoDestinatario.setSelectedItem("UF");
                        TFCEPDestinatario.setText("");
                        TAObservacoesDestinatario.setText("");
                        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFFantasiaDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFInscEstadualDestinatario.setEnabled(false);
                        TFTelefone1Destinatario.setEnabled(false);
                        TFTelefone2Destinatario.setEnabled(false);
                        TFFaxDestinatario.setEnabled(false);
                        TFEmailDestinatario.setEnabled(false);
                        TFSiteDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        TFCEPDestinatario.setEnabled(false);
                        TAObservacoesDestinatario.setEnabled(false);
                        
                        BInserirDestinatario.setEnabled(false);
                        BLimparDestinatario.setEnabled(false);
                        BAtualizarDestinatario.setEnabled(false);
                        BExcluirDestinatario.setEnabled(false);
                        
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);

            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Destinatario Alterado com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Alterar Destinatario\n"+e.getMessage());
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_BAtualizarDestinatarioActionPerformed

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
            java.util.logging.Logger.getLogger(CadDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadDestinatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadDestinatario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarDestinatario;
    public javax.swing.JButton BBuscarDestinatario;
    public javax.swing.JButton BExcluirDestinatario;
    public javax.swing.JButton BInserirDadosDestinatario;
    public javax.swing.JButton BInserirDestinatario;
    public javax.swing.JButton BLimparDestinatario;
    public javax.swing.JButton BVoltarDestinatario;
    public javax.swing.JComboBox CBEstadoDestinatario;
    public javax.swing.JLabel LCodigoDestinatario;
    public javax.swing.JTextArea TAObservacoesDestinatario;
    public javax.swing.JTextField TFBairroDestinatario;
    public javax.swing.JTextField TFCEPDestinatario;
    public javax.swing.JTextField TFCNPJDestinatario;
    public javax.swing.JTextField TFCidadeDestinatario;
    public javax.swing.JTextField TFCodigoDestinatario;
    public javax.swing.JTextField TFEmailDestinatario;
    public javax.swing.JTextField TFEnderecoDestinatario;
    public javax.swing.JTextField TFFantasiaDestinatario;
    public javax.swing.JTextField TFFaxDestinatario;
    public javax.swing.JTextField TFInscEstadualDestinatario;
    public javax.swing.JTextField TFNomeDestinatario;
    public javax.swing.JTextField TFNumEndDestinatario;
    public javax.swing.JTextField TFSiteDestinatario;
    public javax.swing.JTextField TFTelefone1Destinatario;
    public javax.swing.JTextField TFTelefone2Destinatario;
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
