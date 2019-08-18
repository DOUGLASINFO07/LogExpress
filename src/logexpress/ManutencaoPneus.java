package logexpress;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ManutencaoPneus extends javax.swing.JFrame {

    public ManutencaoPneus() {
        initComponents();
    }
    
    Connection conn;
    
     public int codFornecedor = 0;
     public int codVeiculo = 0;
    
    public ManutencaoPneus(Connection conn) {
        initComponents();
        this.conn = conn;
        
                        TFCodigoManutencaoPneus.setEnabled(false);
                        TFNomeFornecedor2.setEnabled(false);
                        TFFantasiaFornecedor2.setEnabled(false);
                        TFCNPJFornecedor2.setEnabled(false);
                        TFInscEstadualFornecedor2.setEnabled(false);
                        TFTelefone1Fornecedor2.setEnabled(false);
                        TFTelefone2Fornecedor2.setEnabled(false);
                        TFFaxFornecedor2.setEnabled(false);
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        
                        TFCodigoVeiculosPneus.setEnabled(true);
                        TFPlacaVeiculo3.setEnabled(false);
                        CBTipoVeiculo3.setEnabled(false);
                        TFFabricanteVeiculo3.setEnabled(false);
                        TFModeloVeiculo3.setEnabled(false);
                        TFAnoVeiculo3.setEnabled(false);
                        TFRenavam3.setEnabled(false);
                        TFChassi3.setEnabled(false);
                        LCodigoVeiculoPneus.setVisible(false);
                        TFCodigoVeiculosPneus.setVisible(true);
                                             
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        TFDataEntradaPneus.setEnabled(false);
                        CBTipoReparo1Pneus.setEnabled(false);
                        CBTipoReparo2Pneus.setEnabled(false);
                        CBTipoReparo3Pneus.setEnabled(false);
                        TFOrcamentoPneus.setEnabled(false);
                        TFDataSaidaPneus.setEnabled(false);
                        TAObservacoesPnues.setEnabled(false);
                        
                        BBuscarManutencaoPneus.setEnabled(false);
                        BInserirDadosManutencaoPneus.setEnabled(true);                        
                        BLimparmanutencaoPneus.setEnabled(false);
                        BAtualizarPneus.setEnabled(false);
                        BExcluirPneus.setEnabled(false);
                        BInserirManutencaoPneus.setEnabled(false);
                        BBuscarManutencaoPneus.setEnabled(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFPlacaVeiculo3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFRenavam3 = new javax.swing.JTextField();
        TFChassi3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBTipoVeiculo3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFModeloVeiculo3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TFAnoVeiculo3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFFabricanteVeiculo3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        LCodigoVeiculoPneus = new javax.swing.JLabel();
        TFCodigoVeiculosPneus = new javax.swing.JTextField();
        BInserirManutencaoPneus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TFDataEntradaPneus = new javax.swing.JTextField();
        CBTipoReparo1Pneus = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        CBTipoReparo2Pneus = new javax.swing.JComboBox();
        TFOrcamentoPneus = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TFDataSaidaPneus = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        CBTipoReparo3Pneus = new javax.swing.JComboBox();
        TFCodigoManutencaoPneus = new javax.swing.JTextField();
        LCodigoManutencaoPneus = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservacoesPnues = new javax.swing.JTextArea();
        BLimparmanutencaoPneus = new javax.swing.JButton();
        BExcluirPneus = new javax.swing.JButton();
        BAtualizarPneus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        TFNomeFornecedor2 = new javax.swing.JTextField();
        TFFantasiaFornecedor2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TFCNPJFornecedor2 = new javax.swing.JTextField();
        TFInscEstadualFornecedor2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TFTelefone1Fornecedor2 = new javax.swing.JTextField();
        TFTelefone2Fornecedor2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TFFaxFornecedor2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        TFCodigoFornecedorPneus = new javax.swing.JTextField();
        LCodigoFornecedorPneus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        BInserirDadosManutencaoPneus = new javax.swing.JButton();
        BBuscarManutencaoPneus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 240, 240));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Placa");

        jLabel4.setText("Renavam");

        jLabel5.setText("Chassi");

        CBTipoVeiculo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carro", "Caminhão", "Moto", "Carreta", "Caminhonete" }));

        jLabel3.setText("Tipo de Veículo");

        jLabel11.setText("Fabricante");

        jLabel20.setText("Modelo");

        jLabel21.setText("Ano");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Dados Veículo");

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        jButton6.setText("Buscar Veiculo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        LCodigoVeiculoPneus.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFPlacaVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(CBTipoVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel11)
                                .addGap(9, 9, 9)
                                .addComponent(TFFabricanteVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(LCodigoVeiculoPneus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFCodigoVeiculosPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFAnoVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRenavam3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFChassi3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFModeloVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LCodigoVeiculoPneus)
                        .addComponent(TFCodigoVeiculosPneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(TFPlacaVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBTipoVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFabricanteVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFAnoVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TFRenavam3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel5)
                    .addComponent(TFChassi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(TFModeloVeiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BInserirManutencaoPneus.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BInserirManutencaoPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BInserirManutencaoPneus.setText("Gravar");
        BInserirManutencaoPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirManutencaoPneusActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(192, 240, 240));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Data Entrada");

        CBTipoReparo1Pneus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Reparo", "Rodizio", "Troca", "Conserto", " " }));

        jLabel9.setText("Tipo Reparo 1");

        CBTipoReparo2Pneus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Reparo", "Rodizio", "Troca", "Conserto", " " }));

        jLabel22.setText("Orçamento");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("Dados  Manutenção");

        jLabel27.setText("Tipo Reparo 2");

        jLabel28.setText("Data Saída");

        jLabel30.setText("Tipo Reparo 3");

        CBTipoReparo3Pneus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Reparo", "Rodizio", "Troca", "Conserto", " " }));

        LCodigoManutencaoPneus.setText("Codigo");

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel19.setText("Observações");

        TAObservacoesPnues.setColumns(20);
        TAObservacoesPnues.setRows(5);
        TAObservacoesPnues.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(TAObservacoesPnues);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFDataEntradaPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBTipoReparo1Pneus, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBTipoReparo2Pneus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBTipoReparo3Pneus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFOrcamentoPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFDataSaidaPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LCodigoManutencaoPneus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCodigoManutencaoPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LCodigoManutencaoPneus)
                        .addComponent(TFCodigoManutencaoPneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TFDataEntradaPneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(CBTipoReparo1Pneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFOrcamentoPneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel28)
                            .addComponent(TFDataSaidaPneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(CBTipoReparo2Pneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)
                        .addComponent(CBTipoReparo3Pneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BLimparmanutencaoPneus.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparmanutencaoPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        BLimparmanutencaoPneus.setText("Limpar");
        BLimparmanutencaoPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparmanutencaoPneusActionPerformed(evt);
            }
        });

        BExcluirPneus.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BExcluirPneus.setText("Excluir");
        BExcluirPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirPneusActionPerformed(evt);
            }
        });

        BAtualizarPneus.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        BAtualizarPneus.setText("Atualizar");
        BAtualizarPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarPneusActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(192, 240, 240));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setText("Nome / Razão Social");

        jLabel15.setText("Nome Fantasia(CNPJ)");

        jLabel16.setText("CNPJ / CPF");

        jLabel17.setText("Inscrição Estadual / RG");

        TFTelefone1Fornecedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTelefone1Fornecedor2ActionPerformed(evt);
            }
        });

        jLabel24.setText("Tel 01");

        jLabel25.setText("Tel 02");

        jLabel26.setText("Fax");

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel29.setText("Fornecedor");

        jButton7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        jButton7.setText("Buscar Fornecedor");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        LCodigoFornecedorPneus.setText("Codigo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNomeFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFantasiaFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCNPJFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFInscEstadualFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelefone1Fornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelefone2Fornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFaxFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(LCodigoFornecedorPneus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFCodigoFornecedorPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LCodigoFornecedorPneus)
                        .addComponent(TFCodigoFornecedorPneus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(TFNomeFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFFantasiaFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TFCNPJFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(TFInscEstadualFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(TFTelefone1Fornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(TFTelefone2Fornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(TFFaxFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Manutenção de Pneus");

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        BInserirDadosManutencaoPneus.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BInserirDadosManutencaoPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionarDados.png"))); // NOI18N
        BInserirDadosManutencaoPneus.setText("Inserir Dados");
        BInserirDadosManutencaoPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDadosManutencaoPneusActionPerformed(evt);
            }
        });

        BBuscarManutencaoPneus.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarManutencaoPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        BBuscarManutencaoPneus.setText("Buscar Manutenção de Pneus");
        BBuscarManutencaoPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarManutencaoPneusActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BInserirDadosManutencaoPneus)
                        .addGap(18, 18, 18)
                        .addComponent(BBuscarManutencaoPneus))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BAtualizarPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BInserirManutencaoPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLimparmanutencaoPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BExcluirPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BBuscarManutencaoPneus)
                                    .addComponent(BInserirDadosManutencaoPneus)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BInserirManutencaoPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizarPneus)
                        .addGap(18, 18, 18)
                        .addComponent(BLimparmanutencaoPneus)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluirPneus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.dispose(); 
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BInserirManutencaoPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirManutencaoPneusActionPerformed

        if (!TFDataEntradaPneus.getText().equals("") &&  !CBTipoReparo1Pneus.getSelectedItem().equals("")){
        
           try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO ManutencaoPneus VALUES (null,?,?,?,?,?,?,?,?,?)");
            
            pstm.setString(1, TFDataEntradaPneus.getText());
            pstm.setString(2, CBTipoReparo1Pneus.getSelectedItem().toString());
            pstm.setString(3, CBTipoReparo2Pneus.getSelectedItem().toString());
            pstm.setString(4, CBTipoReparo3Pneus.getSelectedItem().toString());
            pstm.setString(5, TFOrcamentoPneus.getText());
            pstm.setString(6, TFDataSaidaPneus.getText());
            pstm.setString(7, TAObservacoesPnues.getText());
            pstm.setInt(8, Integer.parseInt(TFCodigoVeiculosPneus.getText()));
            pstm.setInt(9, Integer.parseInt(TFCodigoFornecedorPneus.getText()));
            
                        TFNomeFornecedor2.setText("");
                        TFFantasiaFornecedor2.setText("");
                        TFCNPJFornecedor2.setText("");
                        TFInscEstadualFornecedor2.setText("");
                        TFTelefone1Fornecedor2.setText("");
                        TFTelefone2Fornecedor2.setText("");
                        TFFaxFornecedor2.setText("");
                        
                        TFCodigoVeiculosPneus.setText("");
                        TFPlacaVeiculo3.setText("");
                        CBTipoVeiculo3.setSelectedItem("");
                        TFFabricanteVeiculo3.setText("");
                        TFModeloVeiculo3.setText("");
                        TFAnoVeiculo3.setText("");
                        TFRenavam3.setText("");
                        TFChassi3.setText("");
                        TAObservacoesPnues.setText(""); 
                        
                        TFDataEntradaPneus.setText("");
                        CBTipoReparo1Pneus.setSelectedItem("");
                        CBTipoReparo2Pneus.setSelectedItem("");
                        CBTipoReparo3Pneus.setSelectedItem("");
                        TFOrcamentoPneus.setText("");
                        TFDataSaidaPneus.setText("");
                        TAObservacoesPnues.setText("");
                        
                        TFCodigoManutencaoPneus.setEnabled(false);
                        TFNomeFornecedor2.setEnabled(false);
                        TFFantasiaFornecedor2.setEnabled(false);
                        TFCNPJFornecedor2.setEnabled(false);
                        TFInscEstadualFornecedor2.setEnabled(false);
                        TFTelefone1Fornecedor2.setEnabled(false);
                        TFTelefone2Fornecedor2.setEnabled(false);
                        TFFaxFornecedor2.setEnabled(false);
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        
                        TFCodigoVeiculosPneus.setEnabled(true);
                        TFPlacaVeiculo3.setEnabled(false);
                        CBTipoVeiculo3.setEnabled(false);
                        TFFabricanteVeiculo3.setEnabled(false);
                        TFModeloVeiculo3.setEnabled(false);
                        TFAnoVeiculo3.setEnabled(false);
                        TFRenavam3.setEnabled(false);
                        TFChassi3.setEnabled(false);
                        LCodigoVeiculoPneus.setVisible(false);
                        TFCodigoVeiculosPneus.setVisible(true);
                                             
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        TFDataEntradaPneus.setEnabled(false);
                        CBTipoReparo1Pneus.setEnabled(false);
                        CBTipoReparo2Pneus.setEnabled(false);
                        CBTipoReparo3Pneus.setEnabled(false);
                        TFOrcamentoPneus.setEnabled(false);
                        TFDataSaidaPneus.setEnabled(false);
                        TAObservacoesPnues.setEnabled(false);
                        
                        BBuscarManutencaoPneus.setEnabled(false);
                        BInserirDadosManutencaoPneus.setEnabled(false);                        
                        BLimparmanutencaoPneus.setEnabled(false);
                        BAtualizarPneus.setEnabled(false);
                        BExcluirPneus.setEnabled(false);
                        BBuscarManutencaoPneus.setEnabled(false);
                        BBuscarManutencaoPneus.setEnabled(false);
        
            

            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Manutenção de Pneus Cadastrada com Sucesso!");
            
        }
        catch (SQLException e)
        {
            System.out.println("Error ao consultar Manutenção de Pneus: "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Atenção!!!\n\nErro ao inserir Manutenção de Combustivel!!"+e.getMessage());
        }
         }
         else
        {
            
            JOptionPane.showMessageDialog(null, "Entre com os Dados da Manutencao de Pneus para efetuar o cadastro!!");
        }
        
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_BInserirManutencaoPneusActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        ConsultaVeiculo3 CV3 = new ConsultaVeiculo3(conn, 
                
                TFPlacaVeiculo3.getText(),
                (String) CBTipoVeiculo3.getSelectedItem() ,
                TFFabricanteVeiculo3.getText(),  
                TFModeloVeiculo3.getText(), 
                TFAnoVeiculo3.getText(), 
                TFRenavam3.getText(), 
                TFChassi3.getText(), 
                
                this);
        CV3.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        ConsultaFornecedor2 CF2 = new ConsultaFornecedor2(conn, 
                
                TFNomeFornecedor2.getText(), 
                TFCNPJFornecedor2.getText(), 
                TFInscEstadualFornecedor2.getText(), 
                TFTelefone1Fornecedor2.getText(), 
                TFTelefone2Fornecedor2.getText(), 
                TFFantasiaFornecedor2.getText(), 
                TFFaxFornecedor2.getText(), 
                this);
        CF2.setVisible(true); 
// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void TFTelefone1Fornecedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTelefone1Fornecedor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTelefone1Fornecedor2ActionPerformed

    private void BInserirDadosManutencaoPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDadosManutencaoPneusActionPerformed

                        TFCodigoManutencaoPneus.setEnabled(false);
                        TFNomeFornecedor2.setEnabled(false);
                        TFFantasiaFornecedor2.setEnabled(false);
                        TFCNPJFornecedor2.setEnabled(false);
                        TFInscEstadualFornecedor2.setEnabled(false);
                        TFTelefone1Fornecedor2.setEnabled(false);
                        TFTelefone2Fornecedor2.setEnabled(false);
                        TFFaxFornecedor2.setEnabled(false);
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        
                        TFCodigoVeiculosPneus.setEnabled(true);
                        TFPlacaVeiculo3.setEnabled(false);
                        CBTipoVeiculo3.setEnabled(false);
                        TFFabricanteVeiculo3.setEnabled(false);
                        TFModeloVeiculo3.setEnabled(false);
                        TFAnoVeiculo3.setEnabled(false);
                        TFRenavam3.setEnabled(false);
                        TFChassi3.setEnabled(false);
                        LCodigoVeiculoPneus.setVisible(false);
                        TFCodigoVeiculosPneus.setVisible(true);
                                             
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        TFDataEntradaPneus.setEnabled(true);
                        CBTipoReparo1Pneus.setEnabled(true);
                        CBTipoReparo2Pneus.setEnabled(true);
                        CBTipoReparo3Pneus.setEnabled(true);
                        TFOrcamentoPneus.setEnabled(true);
                        TFDataSaidaPneus.setEnabled(true);
                        TAObservacoesPnues.setEnabled(true);
                        
                        BBuscarManutencaoPneus.setEnabled(true);
                        BInserirDadosManutencaoPneus.setEnabled(false);                        
                        BLimparmanutencaoPneus.setEnabled(true);
                        BAtualizarPneus.setEnabled(false);
                        BExcluirPneus.setEnabled(false);
                        BInserirManutencaoPneus.setEnabled(true);
                        
    }//GEN-LAST:event_BInserirDadosManutencaoPneusActionPerformed

    private void BBuscarManutencaoPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarManutencaoPneusActionPerformed

        PesquisaManutencaoPneus PMV = new PesquisaManutencaoPneus(conn,

            TFNomeFornecedor2.getText(),
            TFFantasiaFornecedor2.getText(),
            TFCNPJFornecedor2.getText(),
            TFInscEstadualFornecedor2.getText(),
            TFTelefone1Fornecedor2.getText(),
            TFTelefone2Fornecedor2.getText(),
            TFFaxFornecedor2.getText(),

            TFPlacaVeiculo3.getText(),
            (String)CBTipoVeiculo3.getSelectedItem(),
            TFFabricanteVeiculo3.getText(),
            TFModeloVeiculo3.getText(),
            TFAnoVeiculo3.getText(),
            TFRenavam3.getText(),
            TFChassi3.getText(),

            TFDataEntradaPneus.getText(),
            (String)CBTipoReparo1Pneus.getSelectedItem(),
            (String)CBTipoReparo2Pneus.getSelectedItem(),
            (String)CBTipoReparo3Pneus.getSelectedItem(),
            TFOrcamentoPneus.getText(),
            TFDataSaidaPneus.getText(),
            TAObservacoesPnues.getText(),

            this

        );
        PMV.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarManutencaoPneusActionPerformed

    private void BLimparmanutencaoPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparmanutencaoPneusActionPerformed

                    
                        TFNomeFornecedor2.setText("");
                        TFFantasiaFornecedor2.setText("");
                        TFCNPJFornecedor2.setText("");
                        TFInscEstadualFornecedor2.setText("");
                        TFTelefone1Fornecedor2.setText("");
                        TFTelefone2Fornecedor2.setText("");
                        TFFaxFornecedor2.setText("");
                        
                        TFCodigoVeiculosPneus.setText("");
                        TFPlacaVeiculo3.setText("");
                        CBTipoVeiculo3.setSelectedItem("");
                        TFFabricanteVeiculo3.setText("");
                        TFModeloVeiculo3.setText("");
                        TFAnoVeiculo3.setText("");
                        TFRenavam3.setText("");
                        TFChassi3.setText("");
                        TAObservacoesPnues.setText(""); 
                        
                        TFDataEntradaPneus.setText("");
                        CBTipoReparo1Pneus.setSelectedItem("");
                        CBTipoReparo2Pneus.setSelectedItem("");
                        CBTipoReparo3Pneus.setSelectedItem("");
                        TFOrcamentoPneus.setText("");
                        TFDataSaidaPneus.setText("");
                        TAObservacoesPnues.setText("");
                        
                        TFCodigoManutencaoPneus.setEnabled(false);
                        TFNomeFornecedor2.setEnabled(false);
                        TFFantasiaFornecedor2.setEnabled(false);
                        TFCNPJFornecedor2.setEnabled(false);
                        TFInscEstadualFornecedor2.setEnabled(false);
                        TFTelefone1Fornecedor2.setEnabled(false);
                        TFTelefone2Fornecedor2.setEnabled(false);
                        TFFaxFornecedor2.setEnabled(false);
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        
                        TFCodigoVeiculosPneus.setEnabled(true);
                        TFPlacaVeiculo3.setEnabled(false);
                        CBTipoVeiculo3.setEnabled(false);
                        TFFabricanteVeiculo3.setEnabled(false);
                        TFModeloVeiculo3.setEnabled(false);
                        TFAnoVeiculo3.setEnabled(false);
                        TFRenavam3.setEnabled(false);
                        TFChassi3.setEnabled(false);
                        LCodigoVeiculoPneus.setVisible(false);
                        TFCodigoVeiculosPneus.setVisible(true);
                                             
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        TFDataEntradaPneus.setEnabled(false);
                        CBTipoReparo1Pneus.setEnabled(false);
                        CBTipoReparo2Pneus.setEnabled(false);
                        CBTipoReparo3Pneus.setEnabled(false);
                        TFOrcamentoPneus.setEnabled(false);
                        TFDataSaidaPneus.setEnabled(false);
                        TAObservacoesPnues.setEnabled(false);
                        
                        BBuscarManutencaoPneus.setEnabled(false);
                        BInserirDadosManutencaoPneus.setEnabled(false);                        
                        BLimparmanutencaoPneus.setEnabled(false);
                        BAtualizarPneus.setEnabled(false);
                        BExcluirPneus.setEnabled(false);
                        BBuscarManutencaoPneus.setEnabled(false);
                        BBuscarManutencaoPneus.setEnabled(false);
        
    }//GEN-LAST:event_BLimparmanutencaoPneusActionPerformed

    private void BAtualizarPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarPneusActionPerformed

        try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE manutencaopneus SET "
                    + "DataEntrada = '"+TFDataEntradaPneus.getText()+"',"
                    + "Reparo1 = '"+CBTipoReparo1Pneus.getSelectedItem()+"',"
                    + "Reparo2 = '"+CBTipoReparo2Pneus.getSelectedItem()+"',"
                    + "Reparo3 = '"+CBTipoReparo3Pneus.getSelectedItem()+"',"
                    + "Orcamento = '"+TFOrcamentoPneus.getText()+"',"
                    + "DataSaida = '"+TFDataSaidaPneus.getText()+"',"
                    + "Observacao = '"+TAObservacoesPnues.getText()+"'"
                    + "WHERE Codigo = '"+TFCodigoManutencaoPneus.getText()+"'");
            
                        TFNomeFornecedor2.setText("");
                        TFFantasiaFornecedor2.setText("");
                        TFCNPJFornecedor2.setText("");
                        TFInscEstadualFornecedor2.setText("");
                        TFTelefone1Fornecedor2.setText("");
                        TFTelefone2Fornecedor2.setText("");
                        TFFaxFornecedor2.setText("");
                        
                        TFCodigoVeiculosPneus.setText("");
                        TFPlacaVeiculo3.setText("");
                        CBTipoVeiculo3.setSelectedItem("");
                        TFFabricanteVeiculo3.setText("");
                        TFModeloVeiculo3.setText("");
                        TFAnoVeiculo3.setText("");
                        TFRenavam3.setText("");
                        TFChassi3.setText("");
                        TAObservacoesPnues.setText(""); 
                        
                        TFDataEntradaPneus.setText("");
                        CBTipoReparo1Pneus.setSelectedItem("");
                        CBTipoReparo2Pneus.setSelectedItem("");
                        CBTipoReparo3Pneus.setSelectedItem("");
                        TFOrcamentoPneus.setText("");
                        TFDataSaidaPneus.setText("");
                        TAObservacoesPnues.setText("");
                        
                        TFCodigoManutencaoPneus.setEnabled(false);
                        TFNomeFornecedor2.setEnabled(false);
                        TFFantasiaFornecedor2.setEnabled(false);
                        TFCNPJFornecedor2.setEnabled(false);
                        TFInscEstadualFornecedor2.setEnabled(false);
                        TFTelefone1Fornecedor2.setEnabled(false);
                        TFTelefone2Fornecedor2.setEnabled(false);
                        TFFaxFornecedor2.setEnabled(false);
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        
                        TFCodigoVeiculosPneus.setEnabled(true);
                        TFPlacaVeiculo3.setEnabled(false);
                        CBTipoVeiculo3.setEnabled(false);
                        TFFabricanteVeiculo3.setEnabled(false);
                        TFModeloVeiculo3.setEnabled(false);
                        TFAnoVeiculo3.setEnabled(false);
                        TFRenavam3.setEnabled(false);
                        TFChassi3.setEnabled(false);
                        LCodigoVeiculoPneus.setVisible(false);
                        TFCodigoVeiculosPneus.setVisible(true);
                                             
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        TFDataEntradaPneus.setEnabled(false);
                        CBTipoReparo1Pneus.setEnabled(false);
                        CBTipoReparo2Pneus.setEnabled(false);
                        CBTipoReparo3Pneus.setEnabled(false);
                        TFOrcamentoPneus.setEnabled(false);
                        TFDataSaidaPneus.setEnabled(false);
                        TAObservacoesPnues.setEnabled(false);
                        
                        BBuscarManutencaoPneus.setEnabled(false);
                        BInserirDadosManutencaoPneus.setEnabled(false);                        
                        BLimparmanutencaoPneus.setEnabled(false);
                        BAtualizarPneus.setEnabled(false);
                        BExcluirPneus.setEnabled(false);
                        BBuscarManutencaoPneus.setEnabled(false);
                        
                        pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Manutenção de Pneus Alterado com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Alterar Manutenção de Pneus\n"+e.getMessage());
        }

    }//GEN-LAST:event_BAtualizarPneusActionPerformed

    private void BExcluirPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirPneusActionPerformed

        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM ManutencaoPneus WHERE codigo = '"+TFCodigoManutencaoPneus.getText()+"'");
            
                        TFNomeFornecedor2.setText("");
                        TFFantasiaFornecedor2.setText("");
                        TFCNPJFornecedor2.setText("");
                        TFInscEstadualFornecedor2.setText("");
                        TFTelefone1Fornecedor2.setText("");
                        TFTelefone2Fornecedor2.setText("");
                        TFFaxFornecedor2.setText("");
                        
                        TFCodigoVeiculosPneus.setText("");
                        TFPlacaVeiculo3.setText("");
                        CBTipoVeiculo3.setSelectedItem("");
                        TFFabricanteVeiculo3.setText("");
                        TFModeloVeiculo3.setText("");
                        TFAnoVeiculo3.setText("");
                        TFRenavam3.setText("");
                        TFChassi3.setText("");
                        TAObservacoesPnues.setText(""); 
                        
                        TFDataEntradaPneus.setText("");
                        CBTipoReparo1Pneus.setSelectedItem("");
                        CBTipoReparo2Pneus.setSelectedItem("");
                        CBTipoReparo3Pneus.setSelectedItem("");
                        TFOrcamentoPneus.setText("");
                        TFDataSaidaPneus.setText("");
                        TAObservacoesPnues.setText("");
                        
                        TFCodigoManutencaoPneus.setEnabled(false);
                        TFNomeFornecedor2.setEnabled(false);
                        TFFantasiaFornecedor2.setEnabled(false);
                        TFCNPJFornecedor2.setEnabled(false);
                        TFInscEstadualFornecedor2.setEnabled(false);
                        TFTelefone1Fornecedor2.setEnabled(false);
                        TFTelefone2Fornecedor2.setEnabled(false);
                        TFFaxFornecedor2.setEnabled(false);
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        
                        TFCodigoVeiculosPneus.setEnabled(true);
                        TFPlacaVeiculo3.setEnabled(false);
                        CBTipoVeiculo3.setEnabled(false);
                        TFFabricanteVeiculo3.setEnabled(false);
                        TFModeloVeiculo3.setEnabled(false);
                        TFAnoVeiculo3.setEnabled(false);
                        TFRenavam3.setEnabled(false);
                        TFChassi3.setEnabled(false);
                        LCodigoVeiculoPneus.setVisible(false);
                        TFCodigoVeiculosPneus.setVisible(true);
                                             
                        LCodigoManutencaoPneus.setVisible(false);
                        TFCodigoManutencaoPneus.setVisible(false);
                        TFDataEntradaPneus.setEnabled(false);
                        CBTipoReparo1Pneus.setEnabled(false);
                        CBTipoReparo2Pneus.setEnabled(false);
                        CBTipoReparo3Pneus.setEnabled(false);
                        TFOrcamentoPneus.setEnabled(false);
                        TFDataSaidaPneus.setEnabled(false);
                        TAObservacoesPnues.setEnabled(false);
                        
                        BBuscarManutencaoPneus.setEnabled(false);
                        BInserirDadosManutencaoPneus.setEnabled(false);                        
                        BLimparmanutencaoPneus.setEnabled(false);
                        BAtualizarPneus.setEnabled(false);
                        BExcluirPneus.setEnabled(false);
                        BBuscarManutencaoPneus.setEnabled(false);          
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Manutencao de Pneus Excluido com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Manutencao Pneus\n"+e.getMessage());}
// TODO add your handling code here:
    }//GEN-LAST:event_BExcluirPneusActionPerformed

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
            java.util.logging.Logger.getLogger(ManutencaoPneus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPneus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPneus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPneus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManutencaoPneus().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarPneus;
    public javax.swing.JButton BBuscarManutencaoPneus;
    public javax.swing.JButton BExcluirPneus;
    public javax.swing.JButton BInserirDadosManutencaoPneus;
    public javax.swing.JButton BInserirManutencaoPneus;
    public javax.swing.JButton BLimparmanutencaoPneus;
    public javax.swing.JComboBox CBTipoReparo1Pneus;
    public javax.swing.JComboBox CBTipoReparo2Pneus;
    public javax.swing.JComboBox CBTipoReparo3Pneus;
    public javax.swing.JComboBox CBTipoVeiculo3;
    public javax.swing.JLabel LCodigoFornecedorPneus;
    public javax.swing.JLabel LCodigoManutencaoPneus;
    public javax.swing.JLabel LCodigoVeiculoPneus;
    public javax.swing.JTextArea TAObservacoesPnues;
    public javax.swing.JTextField TFAnoVeiculo3;
    public javax.swing.JTextField TFCNPJFornecedor2;
    public javax.swing.JTextField TFChassi3;
    public javax.swing.JTextField TFCodigoFornecedorPneus;
    public javax.swing.JTextField TFCodigoManutencaoPneus;
    public javax.swing.JTextField TFCodigoVeiculosPneus;
    public javax.swing.JTextField TFDataEntradaPneus;
    public javax.swing.JTextField TFDataSaidaPneus;
    public javax.swing.JTextField TFFabricanteVeiculo3;
    public javax.swing.JTextField TFFantasiaFornecedor2;
    public javax.swing.JTextField TFFaxFornecedor2;
    public javax.swing.JTextField TFInscEstadualFornecedor2;
    public javax.swing.JTextField TFModeloVeiculo3;
    public javax.swing.JTextField TFNomeFornecedor2;
    public javax.swing.JTextField TFOrcamentoPneus;
    public javax.swing.JTextField TFPlacaVeiculo3;
    public javax.swing.JTextField TFRenavam3;
    public javax.swing.JTextField TFTelefone1Fornecedor2;
    public javax.swing.JTextField TFTelefone2Fornecedor2;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
