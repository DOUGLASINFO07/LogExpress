package logexpress;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadFuncionario extends javax.swing.JFrame {

    public CadFuncionario() {
        initComponents();
    }
    
     Connection conn;
         public CadFuncionario(Connection conn) {
        initComponents();    
        this.conn = conn;
        
        TFCodigo.setEnabled(false); 
        TFNome.setEnabled(false);
        TFCPF.setEnabled(false);
        TFRG.setEnabled(false);
        TFDataNasc.setEnabled(false);
        CBHabilitacao.setEnabled(false);
        TFCartMotorista.setEnabled(false);
        TFPIS.setEnabled(false);
        TFTelResidencial.setEnabled(false);
        TFCelular.setEnabled(false);
        TFEndereco.setEnabled(false);
        TFNumero.setEnabled(false);
        TFBairro.setEnabled(false);
        TFCidade.setEnabled(false);
        CBEstado.setEnabled(false);
        TFCEP.setEnabled(false);
        CBEstadoCivil.setEnabled(false);
        RBSexoMasc.setEnabled(false);
        RBSexoFem.setEnabled(false);
        TAObservacoes.setEnabled(false);
        
        BAtualizar.setEnabled(false);
        BExcluir.setEnabled(false);
        BLimpar.setEnabled(false);
        BInserir.setEnabled(false);
                
        LCodigo.setVisible(false);
        TFCodigo.setVisible(false);

         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BInserir = new javax.swing.JButton();
        BAtualizar = new javax.swing.JButton();
        BLimpar = new javax.swing.JButton();
        BExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TFNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFRG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFDataNasc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFCartMotorista = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CBHabilitacao = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFTelResidencial = new javax.swing.JTextField();
        TFCelular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFEndereco = new javax.swing.JTextField();
        TFNumero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TFBairro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TFCidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CBEstado = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        TFCEP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CBEstadoCivil = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        RBSexoMasc = new javax.swing.JRadioButton();
        RBSexoFem = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservacoes = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        TFPIS = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        BInserirDados = new javax.swing.JButton();
        BBuscarFuncionario = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        LCodigo = new javax.swing.JLabel();
        TFCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 153));

        BInserir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BInserir.setText("Salvar");
        BInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirActionPerformed(evt);
            }
        });

        BAtualizar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        BAtualizar.setText("Atualizar");
        BAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarActionPerformed(evt);
            }
        });

        BLimpar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        BLimpar.setText("Limpar");
        BLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparActionPerformed(evt);
            }
        });

        BExcluir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BExcluir.setText("Excluir");
        BExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Cadastro de Funcionários");

        jPanel1.setBackground(new java.awt.Color(190, 240, 240));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jLabel3.setText("Celular");

        jLabel4.setText("CPF");

        jLabel5.setText("RG");

        jLabel6.setText("Data Nascimento");

        jLabel7.setText("CNH");

        jLabel8.setText("PIS");

        CBHabilitacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NH", "A", "B", "A-B", "C", "A-C", "D", "A-D", "E", "A-E", " " }));

        jLabel9.setText("Categ. Habil.");

        jLabel10.setText("Tel.");

        jLabel11.setText("Nome");

        jLabel12.setText("Endereço");

        jLabel13.setText("Numero");

        jLabel14.setText("Bairro");

        jLabel15.setText("Cidade");

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC ", "AL ", "AP ", "AM ", "BA ", "CE ", "DF ", "GO ", "ES ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN ", "RS ", "RO ", "RR ", "SP ", "SC ", "SE ", "TO" }));

        jLabel16.setText("Estado");

        jLabel17.setText("CEP");

        CBEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "***   Selecione   ***", "Casado(a)", "Solteiro(a)", "Viúvo(a)" }));

        jLabel20.setText("Estado Civil");

        buttonGroup1.add(RBSexoMasc);
        RBSexoMasc.setText("Masc");

        buttonGroup1.add(RBSexoFem);
        RBSexoFem.setText("Fem");

        jLabel21.setText("Sexo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Dados Cadastrais");

        TAObservacoes.setColumns(20);
        TAObservacoes.setRows(5);
        TAObservacoes.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jScrollPane1.setViewportView(TAObservacoes);

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel19.setText("Observações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(TFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFRG, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBHabilitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCartMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFPIS, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CBEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21)
                                    .addGap(18, 18, 18)
                                    .addComponent(RBSexoMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(RBSexoFem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel13))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(TFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(TFRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TFDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(CBHabilitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(TFCartMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(TFPIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(TFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(TFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(TFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(TFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(TFTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(CBEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(RBSexoMasc)
                    .addComponent(RBSexoFem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        BInserirDados.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BInserirDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionarDados.png"))); // NOI18N
        BInserirDados.setText("Inserir Dados");
        BInserirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDadosActionPerformed(evt);
            }
        });

        BBuscarFuncionario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        BBuscarFuncionario.setText("Buscar Funcionário");
        BBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarFuncionarioActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        LCodigo.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BInserirDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LCodigo)
                            .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BInserirDados)
                            .addComponent(BBuscarFuncionario)
                            .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LCodigo)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirActionPerformed

        if (!TFNome.getText().equals("") &&  !TFCPF.getText().equals("") &&  !TFRG.getText().equals("")){
        
           try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO funcionario VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstm.setString(1, TFNome.getText());
            pstm.setString(2, TFCPF.getText());
            pstm.setString(3, TFRG.getText());
            pstm.setString(4, TFDataNasc.getText());
            pstm.setString(5, CBHabilitacao.getSelectedItem().toString());
            pstm.setString(6, TFCartMotorista.getText());
            pstm.setString(7, TFPIS.getText());
            pstm.setString(8, TFTelResidencial.getText());
            pstm.setString(9, TFCelular.getText());
            pstm.setString(10, TFEndereco.getText());
            pstm.setString(11, TFNumero.getText());
            pstm.setString(12, TFBairro.getText());
            pstm.setString(13, TFCidade.getText());
            pstm.setString(14, CBEstado.getSelectedItem().toString());
            pstm.setString(15, TFCEP.getText());
            pstm.setString(16, CBEstadoCivil.getSelectedItem().toString());  
            pstm.setString(17, (RBSexoMasc.isSelected()?"Masculino":"Feminino")); 
            pstm.setString(18, TAObservacoes.getText());          

            pstm.executeUpdate();
            pstm.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Atenção!!!\n\nErro ao inserir funcionário!!");
        }
        
         }
         else
        {
            JOptionPane.showMessageDialog(null, "Entre com os Dados do Funcionário para efetuar o cadastro!!");
        }
        
        JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!");
        
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_BInserirActionPerformed

    private void BBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarFuncionarioActionPerformed

        ConsultaFuncionario CF = new ConsultaFuncionario(conn, TFNome.getText(),TFCPF.getText(), 
                TFRG.getText(),
                TFDataNasc.getText(), 
                (String)CBHabilitacao.getSelectedItem(),
                TFCartMotorista.getText(), 
                TFPIS.getText(),
                TFTelResidencial.getText(), 
                TFCelular.getText(), 
                TFEndereco.getText(), 
                TFNumero.getText(), 
                TFBairro.getText(), 
                TFCidade.getText(),
                (String)CBEstado.getSelectedItem(), 
                TFCEP.getText(),
                (String)CBEstadoCivil.getSelectedItem(), 
                RBSexoMasc.getText(),
                TAObservacoes.getText(),
                this);
        CF.setVisible(true); 
        
// TODO add your handling code here:
    }//GEN-LAST:event_BBuscarFuncionarioActionPerformed

    private void BInserirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDadosActionPerformed

        
        
                        TFCodigo.setText("");                
                        TFNome.setText("");
                        TFCPF.setText("");
                        TFRG.setText("");
                        TFDataNasc.setText("");
                        CBHabilitacao.setSelectedItem("NH");
                        TFCartMotorista.setText("");
                        TFPIS.setText("");
                        TFTelResidencial.setText("");
                        TFCelular.setText("");
                        TFEndereco.setText("");
                        TFNumero.setText("");
                        TFBairro.setText("");
                        TFCidade.setText("");
                        CBEstado.setSelectedItem("UF");
                        TFCEP.setText("");
                        CBEstadoCivil.setSelectedItem("***   Selecione   ***");  
                        buttonGroup1.clearSelection();
                        TAObservacoes.setText("");
                        
                        
        
        TFNome.setEnabled(true);
        TFCPF.setEnabled(true);
        TFRG.setEnabled(true);
        TFDataNasc.setEnabled(true);
        CBHabilitacao.setEnabled(true);
        TFCartMotorista.setEnabled(true);
        TFPIS.setEnabled(true);
        TFTelResidencial.setEnabled(true);
        TFCelular.setEnabled(true);
        TFEndereco.setEnabled(true);
        TFNumero.setEnabled(true);
        TFBairro.setEnabled(true);
        TFCidade.setEnabled(true);
        CBEstado.setEnabled(true);
        TFCEP.setEnabled(true);
        CBEstadoCivil.setEnabled(true);
        RBSexoMasc.setEnabled(true);
        RBSexoFem.setEnabled(true);
        TAObservacoes.setEnabled(true);
        
        BInserir.setEnabled(true);
        BLimpar.setEnabled(true);
        BAtualizar.setEnabled(false);
        BExcluir.setEnabled(false);


// TODO add your handling code here:
    }//GEN-LAST:event_BInserirDadosActionPerformed

    private void BAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarActionPerformed

                 try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE funcionario SET nome = '"+TFNome.getText()+"',"
                    + "cpf = '"+TFCPF.getText()+"',"
                    + "rg = '"+TFRG.getText()+"',"
                    + "dataNascimento = '"+TFDataNasc.getText()+"',"
                    + "CatHabilitacao = '"+CBHabilitacao.getSelectedItem()+"',"
                    + "cnh = '"+TFCartMotorista.getText()+"',"
                    + "PIS = '"+TFPIS.getText()+"',"
                    + "TelResidencial = '"+TFTelResidencial.getText()+"',"
                    + "Celular = '"+TFCelular.getText()+"',"
                    + "Endereco = '"+TFEndereco.getText()+"',"
                    + "NumEnd = '"+TFNumero.getText()+"',"
                    + "Bairro = '"+TFBairro.getText()+"',"
                    + "Cidade = '"+TFCidade.getText()+"',"
                    + "Estado = '"+CBEstado.getSelectedItem()+"',"
                    + "CEP = '"+TFCEP.getText()+"',"
                    + "EstadoCivil = '"+CBEstadoCivil.getSelectedItem()+"',"
                    + "Sexo = '"+(RBSexoMasc.isSelected()?"Masculino":"Feminino")+"',"
                    + "Observacao = '"+TAObservacoes.getText()+"'"
                    + "WHERE idFuncionario = '"+TFCodigo.getText()+"'");
            
                        TFCodigo.setText("");
                        TFNome.setText("");
                        TFCPF.setText("");
                        TFRG.setText("");
                        TFDataNasc.setText("");
                        CBHabilitacao.setSelectedItem("NH");
                        TFCartMotorista.setText("");
                        TFPIS.setText("");
                        TFTelResidencial.setText("");
                        TFCelular.setText("");
                        TFEndereco.setText("");
                        TFNumero.setText("");
                        TFBairro.setText("");
                        TFCidade.setText("");
                        CBEstado.setSelectedItem("UF");
                        TFCEP.setText("");
                        CBEstadoCivil.setSelectedItem("***   Selecione   ***");  
                        buttonGroup1.clearSelection();
                        TAObservacoes.setText("");
                        
        TFCodigo.setEnabled(false); 
        TFNome.setEnabled(false);
        TFCPF.setEnabled(false);
        TFRG.setEnabled(false);
        TFDataNasc.setEnabled(false);
        CBHabilitacao.setEnabled(false);
        TFCartMotorista.setEnabled(false);
        TFPIS.setEnabled(false);
        TFTelResidencial.setEnabled(false);
        TFCelular.setEnabled(false);
        TFEndereco.setEnabled(false);
        TFNumero.setEnabled(false);
        TFBairro.setEnabled(false);
        TFCidade.setEnabled(false);
        CBEstado.setEnabled(false);
        TFCEP.setEnabled(false);
        CBEstadoCivil.setEnabled(false);
        RBSexoMasc.setEnabled(false);
        RBSexoFem.setEnabled(false);
        TAObservacoes.setEnabled(false);
        
        BAtualizar.setEnabled(false);
        BExcluir.setEnabled(false);
        BLimpar.setEnabled(false);
        BInserir.setEnabled(false);
                
        LCodigo.setVisible(false);
        TFCodigo.setVisible(false);

            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Funcionario Alterado com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Alterar Funcionário\n"+e.getMessage());
        }

    }//GEN-LAST:event_BAtualizarActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed

         try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM funcionario WHERE idFuncionario = '"+TFCodigo.getText()+"'");

                        TFNome.setText("");
                        TFCPF.setText("");
                        TFRG.setText("");
                        TFDataNasc.setText("");
                        CBHabilitacao.setSelectedItem("");
                        TFCartMotorista.setText("");
                        TFPIS.setText("");
                        TFTelResidencial.setText("");
                        TFCelular.setText("");
                        TFEndereco.setText("");
                        TFNumero.setText("");
                        TFBairro.setText("");
                        TFCidade.setText("");
                        CBEstado.setSelectedItem("");
                        TFCEP.setText("");
                        CBEstadoCivil.setSelectedItem("");  
                        buttonGroup1.clearSelection();
                        TAObservacoes.setText("");
                        
        TFCodigo.setEnabled(false); 
        TFNome.setEnabled(false);
        TFCPF.setEnabled(false);
        TFRG.setEnabled(false);
        TFDataNasc.setEnabled(false);
        CBHabilitacao.setEnabled(false);
        TFCartMotorista.setEnabled(false);
        TFPIS.setEnabled(false);
        TFTelResidencial.setEnabled(false);
        TFCelular.setEnabled(false);
        TFEndereco.setEnabled(false);
        TFNumero.setEnabled(false);
        TFBairro.setEnabled(false);
        TFCidade.setEnabled(false);
        CBEstado.setEnabled(false);
        TFCEP.setEnabled(false);
        CBEstadoCivil.setEnabled(false);
        RBSexoMasc.setEnabled(false);
        RBSexoFem.setEnabled(false);
        TAObservacoes.setEnabled(false);
        
        BAtualizar.setEnabled(false);
        BExcluir.setEnabled(false);
        BLimpar.setEnabled(false);
        BInserir.setEnabled(false);
                
        LCodigo.setVisible(false);
        TFCodigo.setVisible(false);
            
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Funcionario Excluido com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Funcionário\n"+e.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_BExcluirActionPerformed

    private void BLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparActionPerformed

                        TFNome.setText("");
                        TFCPF.setText("");
                        TFRG.setText("");
                        TFDataNasc.setText("");
                        CBHabilitacao.setSelectedItem("NH");
                        TFCartMotorista.setText("");
                        TFPIS.setText("");
                        TFTelResidencial.setText("");
                        TFCelular.setText("");
                        TFEndereco.setText("");
                        TFNumero.setText("");
                        TFBairro.setText("");
                        TFCidade.setText("");
                        CBEstado.setSelectedItem("UF");
                        TFCEP.setText("");
                        CBEstadoCivil.setSelectedItem("***   Selecione   ***");  
                        buttonGroup1.clearSelection();
                        TAObservacoes.setText("");
                        
        TFCodigo.setEnabled(false); 
        TFNome.setEnabled(false);
        TFCPF.setEnabled(false);
        TFRG.setEnabled(false);
        TFDataNasc.setEnabled(false);
        CBHabilitacao.setEnabled(false);
        TFCartMotorista.setEnabled(false);
        TFPIS.setEnabled(false);
        TFTelResidencial.setEnabled(false);
        TFCelular.setEnabled(false);
        TFEndereco.setEnabled(false);
        TFNumero.setEnabled(false);
        TFBairro.setEnabled(false);
        TFCidade.setEnabled(false);
        CBEstado.setEnabled(false);
        TFCEP.setEnabled(false);
        CBEstadoCivil.setEnabled(false);
        RBSexoMasc.setEnabled(false);
        RBSexoFem.setEnabled(false);
        TAObservacoes.setEnabled(false);
        
        BAtualizar.setEnabled(false);
        BExcluir.setEnabled(false);
        BLimpar.setEnabled(false);
        BInserir.setEnabled(false);

    }//GEN-LAST:event_BLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadFuncionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizar;
    public javax.swing.JButton BBuscarFuncionario;
    public javax.swing.JButton BExcluir;
    public javax.swing.JButton BInserir;
    public javax.swing.JButton BInserirDados;
    public javax.swing.JButton BLimpar;
    public javax.swing.JComboBox CBEstado;
    public javax.swing.JComboBox CBEstadoCivil;
    public javax.swing.JComboBox CBHabilitacao;
    private javax.swing.JLabel LCodigo;
    public javax.swing.JRadioButton RBSexoFem;
    public javax.swing.JRadioButton RBSexoMasc;
    public javax.swing.JTextArea TAObservacoes;
    public javax.swing.JTextField TFBairro;
    public javax.swing.JTextField TFCEP;
    public javax.swing.JTextField TFCPF;
    public javax.swing.JTextField TFCartMotorista;
    public javax.swing.JTextField TFCelular;
    public javax.swing.JTextField TFCidade;
    public javax.swing.JTextField TFCodigo;
    public javax.swing.JTextField TFDataNasc;
    public javax.swing.JTextField TFEndereco;
    public javax.swing.JTextField TFNome;
    public javax.swing.JTextField TFNumero;
    public javax.swing.JTextField TFPIS;
    public javax.swing.JTextField TFRG;
    public javax.swing.JTextField TFTelResidencial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
