package logexpress;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ManutencaoVeiculo extends javax.swing.JFrame {

    public ManutencaoVeiculo() {
        initComponents();
    }
    
     Connection conn;
    
    public ManutencaoVeiculo(Connection conn) {
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
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo1.setEnabled(false);
                        CBTipoVeiculo1.setEnabled(false);
                        TFFabricante1.setEnabled(false);
                        TFModeloVeiculo1.setEnabled(false);
                        TFAnoVeiculo1.setEnabled(false);
                        TFRenavam1.setEnabled(false);
                        TFChassi1.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                                             
                        LCodigoManutencaoVeiculo.setVisible(false);
                        TFCodigoManutencaoVeiculos.setVisible(false);
                        TFDataEntrada.setEnabled(false);
                        CBReparo1.setEnabled(false);
                        CBReparo2.setEnabled(false);
                        CBReparo3.setEnabled(false);
                        TFOrcamento.setEnabled(false);
                        TFDataSaida.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                        
                        BBuscarFornecedor.setEnabled(false);
                        BInserirManutencaoVeiculo.setEnabled(false);                        
                        BLimparManutencaoVeiculo.setEnabled(false);
                        BAtualizarManutencaoVeiculo.setEnabled(false);
                        BExcluirManutencaoVeiculo.setEnabled(false);
                        BInserirDadosManutencaoVeiculo.setEnabled(true);
                         BBuscarManutencaoVeiculo.setEnabled(true);
                        BBuscarVeiculo.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BInserirManutencaoVeiculo = new javax.swing.JButton();
        BAtualizarManutencaoVeiculo = new javax.swing.JButton();
        BLimparManutencaoVeiculo = new javax.swing.JButton();
        BExcluirManutencaoVeiculo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFPlacaVeiculo1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFRenavam1 = new javax.swing.JTextField();
        TFChassi1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBTipoVeiculo1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFModeloVeiculo1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TFAnoVeiculo1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BBuscarVeiculo = new javax.swing.JButton();
        TFFabricante1 = new javax.swing.JTextField();
        LCodigoVeiculo = new javax.swing.JLabel();
        TFCodigoVeiculo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TFDataEntrada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CBReparo2 = new javax.swing.JComboBox();
        TFOrcamento = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TFDataSaida = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        TFCodigoManutencaoVeiculos = new javax.swing.JTextField();
        LCodigoManutencaoVeiculo = new javax.swing.JLabel();
        CBReparo3 = new javax.swing.JComboBox();
        CBReparo1 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservacoes = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        TFNomeFornecedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TFCNPJFornecedor = new javax.swing.JTextField();
        TFInscEstadualFornecedor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TFTelefone1Fornecedor = new javax.swing.JTextField();
        TFTelefone2Fornecedor = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TFFaxFornecedor = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        BBuscarFornecedor = new javax.swing.JButton();
        TFCodigoFornecedor = new javax.swing.JTextField();
        LCodigoFornecedor = new javax.swing.JLabel();
        TFFantasiaFornecedor = new javax.swing.JTextField();
        BInserirDadosManutencaoVeiculo = new javax.swing.JButton();
        BBuscarManutencaoVeiculo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BInserirManutencaoVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BInserirManutencaoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BInserirManutencaoVeiculo.setText("Gravar");
        BInserirManutencaoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirManutencaoVeiculoActionPerformed(evt);
            }
        });

        BAtualizarManutencaoVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarManutencaoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        BAtualizarManutencaoVeiculo.setText("Atualizar");
        BAtualizarManutencaoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarManutencaoVeiculoActionPerformed(evt);
            }
        });

        BLimparManutencaoVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparManutencaoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        BLimparManutencaoVeiculo.setText("Limpar");
        BLimparManutencaoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparManutencaoVeiculoActionPerformed(evt);
            }
        });

        BExcluirManutencaoVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirManutencaoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BExcluirManutencaoVeiculo.setText("Excluir");
        BExcluirManutencaoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirManutencaoVeiculoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 240, 240));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jLabel2.setText("Placa");

        jLabel4.setText("Renavam");

        jLabel5.setText("Chassi");

        CBTipoVeiculo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carro", "Caminhão", "Moto", "Carreta", "Caminhonete" }));

        jLabel3.setText("Tipo de Veículo");

        jLabel11.setText("Fabricante");

        jLabel20.setText("Modelo");

        jLabel21.setText("Ano");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Dados Veículo");

        BBuscarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarVeiculo.setText("Buscar Veículo");
        BBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarVeiculoActionPerformed(evt);
            }
        });

        LCodigoVeiculo.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(LCodigoVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BBuscarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFAnoVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFRenavam1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFChassi1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFPlacaVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBTipoVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFabricante1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFModeloVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(BBuscarVeiculo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LCodigoVeiculo)
                            .addComponent(TFCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel20)
                    .addComponent(TFPlacaVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CBTipoVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFabricante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFModeloVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TFAnoVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TFRenavam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TFChassi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manutenção de Veículos");

        jPanel2.setBackground(new java.awt.Color(192, 240, 240));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jLabel6.setText("Data Entrada");

        jLabel9.setText("Tipo Reparo 1");

        CBReparo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Reparo", "Eletrico", "Mecanico", "Estofado", "Carroceria", "Hidraulico", " " }));

        jLabel22.setText("Orçamento");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("Dados  Manutenção");

        jLabel27.setText("Tipo Reparo 2");

        jLabel28.setText("Data Saída");

        jLabel30.setText("Tipo Reparo 3");

        LCodigoManutencaoVeiculo.setText("Codigo");

        CBReparo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Reparo", "Eletrico", "Mecanico", "Estofado", "Carroceria", "Hidraulico" }));

        CBReparo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Reparo", "Eletrico", "Mecanico", "Estofado", "Carroceria", "Hidraulico", " " }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel19.setText("Observações");

        TAObservacoes.setColumns(20);
        TAObservacoes.setRows(5);
        TAObservacoes.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jScrollPane1.setViewportView(TAObservacoes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)
                                .addComponent(CBReparo1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBReparo2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBReparo3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(LCodigoManutencaoVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCodigoManutencaoVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCodigoManutencaoVeiculo)
                    .addComponent(TFCodigoManutencaoVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CBReparo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(CBReparo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(CBReparo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TFOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(TFDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(192, 240, 240));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jLabel14.setText("Nome / Razão Social");

        jLabel15.setText("Nome Fantasia");

        jLabel16.setText("CNPJ / CPF");

        jLabel17.setText("Inscrição Estadual / RG");

        jLabel24.setText("Telefone 01");

        jLabel25.setText("Telefone 02");

        jLabel26.setText("Fax");

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel29.setText("Fornecedor");

        BBuscarFornecedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarFornecedor.setText("Busca Fornecedor");
        BBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarFornecedorActionPerformed(evt);
            }
        });

        LCodigoFornecedor.setText("Codigo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFInscEstadualFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFTelefone1Fornecedor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(LCodigoFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(TFCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFFantasiaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFFaxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFTelefone2Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BBuscarFornecedor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LCodigoFornecedor)
                        .addComponent(TFCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BBuscarFornecedor))
                    .addComponent(jLabel29))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TFNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFantasiaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(TFFaxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TFCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(TFInscEstadualFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(TFTelefone1Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(TFTelefone2Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BInserirDadosManutencaoVeiculo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BInserirDadosManutencaoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionarDados.png"))); // NOI18N
        BInserirDadosManutencaoVeiculo.setText("Inserir Dados");
        BInserirDadosManutencaoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDadosManutencaoVeiculoActionPerformed(evt);
            }
        });

        BBuscarManutencaoVeiculo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarManutencaoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        BBuscarManutencaoVeiculo.setText("Buscar Manutenção de Veículos");
        BBuscarManutencaoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarManutencaoVeiculoActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BInserirDadosManutencaoVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBuscarManutencaoVeiculo))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BInserirManutencaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAtualizarManutencaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLimparManutencaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BExcluirManutencaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BBuscarManutencaoVeiculo)
                        .addComponent(BInserirDadosManutencaoVeiculo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BInserirManutencaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizarManutencaoVeiculo))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BLimparManutencaoVeiculo)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluirManutencaoVeiculo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
        this.dispose(); 
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarFornecedorActionPerformed
       
       ConsultaFornecedor CF = new ConsultaFornecedor(conn, 
               
               TFNomeFornecedor.getText(),
               TFCNPJFornecedor.getText(), 
               TFInscEstadualFornecedor.getText(), 
               TFTelefone1Fornecedor.getText(), 
               TFTelefone2Fornecedor.getText(), 
               TFFantasiaFornecedor.getText(), 
               TFFaxFornecedor.getText(), 
               
               this);
        CF.setVisible(true); 

    }//GEN-LAST:event_BBuscarFornecedorActionPerformed

    private void BBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarVeiculoActionPerformed

        ConsultaVeiculo1 CV1 = new ConsultaVeiculo1(conn,
                
                TFPlacaVeiculo1.getText(),
                (String) CBTipoVeiculo1.getSelectedItem() ,
                TFFabricante1.getText(),  
                TFModeloVeiculo1.getText(), 
                TFAnoVeiculo1.getText(), 
                TFRenavam1.getText(), 
                TFChassi1.getText(), 
                
                this);
        CV1.setVisible(true);

    }//GEN-LAST:event_BBuscarVeiculoActionPerformed

    private void BInserirManutencaoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirManutencaoVeiculoActionPerformed

        if (!TFDataEntrada.getText().equals("") &&  !CBReparo1.getSelectedItem().equals("")){
        
           try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO ManutencaoVeiculo VALUES (null,?,?,?,?,?,?,?,?,?)");
            
           
            pstm.setString(1, TFDataEntrada.getText());
            pstm.setString(2, CBReparo1.getSelectedItem().toString());
            pstm.setString(3, CBReparo2.getSelectedItem().toString());
            pstm.setString(4, CBReparo3.getSelectedItem().toString());
            pstm.setString(5, TFOrcamento.getText());
            pstm.setString(6, TFDataSaida.getText());
            pstm.setString(7, TAObservacoes.getText());
            pstm.setInt(8, Integer.parseInt(TFCodigoVeiculo.getText()));
            pstm.setInt(9, Integer.parseInt(TFCodigoFornecedor.getText()));
            
                       
                        TFNomeFornecedor.setText("");
                        TFFantasiaFornecedor.setText("");
                        TFCNPJFornecedor.setText("");
                        TFInscEstadualFornecedor.setText("");
                        TFTelefone1Fornecedor.setText("");
                        TFTelefone2Fornecedor.setText("");
                        TFFaxFornecedor.setText("");
                        
                        TFCodigoVeiculo.setText("");
                        TFPlacaVeiculo1.setText("");
                        CBTipoVeiculo1.setSelectedItem("");
                        TFFabricante1.setText("");
                        TFModeloVeiculo1.setText("");
                        TFAnoVeiculo1.setText("");
                        TFRenavam1.setText("");
                        TFChassi1.setText("");
                        TAObservacoes.setText(""); 
                        
                        TFDataEntrada.setText("");
                        CBReparo1.setSelectedItem("");
                        CBReparo2.setSelectedItem("");
                        CBReparo3.setSelectedItem("");
                        TFOrcamento.setText("");
                        TFDataSaida.setText("");
                        TAObservacoes.setText("");
                        
                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo1.setEnabled(false);
                        CBTipoVeiculo1.setEnabled(false);
                        TFFabricante1.setEnabled(false);
                        TFModeloVeiculo1.setEnabled(false);
                        TFAnoVeiculo1.setEnabled(false);
                        TFRenavam1.setEnabled(false);
                        TFChassi1.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                                             
                        LCodigoManutencaoVeiculo.setVisible(false);
                        TFCodigoManutencaoVeiculos.setVisible(false);
                        TFDataEntrada.setEnabled(false);
                        CBReparo1.setEnabled(false);
                        CBReparo2.setEnabled(false);
                        CBReparo3.setEnabled(false);
                        TFOrcamento.setEnabled(false);
                        TFDataSaida.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                        
                        BBuscarFornecedor.setEnabled(false);
                        BInserirManutencaoVeiculo.setEnabled(false);                        
                        BLimparManutencaoVeiculo.setEnabled(false);
                        BAtualizarManutencaoVeiculo.setEnabled(false);
                        BExcluirManutencaoVeiculo.setEnabled(false);
                        BBuscarFornecedor.setEnabled(false);
                        BBuscarVeiculo.setEnabled(false);
            

            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Manutenção de Veículo Cadastrada com Sucesso!");
            
        }
        catch (SQLException e)
        {
            System.out.println("Error ao consultar Manutenção: "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Atenção!!!\n\nErro ao inserir Manutenção de Veículo!!"+e.getMessage());
        }
         }
         else
        {  
            JOptionPane.showMessageDialog(null, "Entre com os Dados da Ordem Entrega para efetuar o cadastro!!");
        }


// TODO add your handling code here:
    }//GEN-LAST:event_BInserirManutencaoVeiculoActionPerformed

    private void BInserirDadosManutencaoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDadosManutencaoVeiculoActionPerformed

                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo1.setEnabled(false);
                        CBTipoVeiculo1.setEnabled(false);
                        TFFabricante1.setEnabled(false);
                        TFModeloVeiculo1.setEnabled(false);
                        TFAnoVeiculo1.setEnabled(false);
                        TFRenavam1.setEnabled(false);
                        TFChassi1.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                                             
                        LCodigoManutencaoVeiculo.setVisible(false);
                        TFCodigoManutencaoVeiculos.setVisible(false);
                        TFDataEntrada.setEnabled(true);
                        CBReparo1.setEnabled(true);
                        CBReparo2.setEnabled(true);
                        CBReparo3.setEnabled(true);
                        TFOrcamento.setEnabled(true);
                        TFDataSaida.setEnabled(true);
                        TAObservacoes.setEnabled(true);
                        
                        BBuscarFornecedor.setEnabled(true);
                        BInserirManutencaoVeiculo.setEnabled(true);                        
                        BLimparManutencaoVeiculo.setEnabled(true);
                        BAtualizarManutencaoVeiculo.setEnabled(false);
                        BExcluirManutencaoVeiculo.setEnabled(false);
                        BBuscarVeiculo.setEnabled(true);

    }//GEN-LAST:event_BInserirDadosManutencaoVeiculoActionPerformed

    private void BBuscarManutencaoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarManutencaoVeiculoActionPerformed

        PesquisaManutencaoVeiculos PMV = new PesquisaManutencaoVeiculos(conn,

            TFNomeFornecedor.getText(),
            TFFantasiaFornecedor.getText(),
            TFCNPJFornecedor.getText(),
            TFInscEstadualFornecedor.getText(),
            TFTelefone1Fornecedor.getText(),
            TFTelefone2Fornecedor.getText(),
            TFFaxFornecedor.getText(),

            TFPlacaVeiculo1.getText(),
            (String)CBTipoVeiculo1.getSelectedItem(),
            TFFabricante1.getText(),
            TFModeloVeiculo1.getText(),
            TFAnoVeiculo1.getText(),
            TFRenavam1.getText(),
            TFChassi1.getText(),

            TFDataEntrada.getText(),
            (String)CBReparo1.getSelectedItem(),
            (String)CBReparo2.getSelectedItem(),
            (String)CBReparo3.getSelectedItem(),
            TFOrcamento.getText(),
            TFDataSaida.getText(),
            TAObservacoes.getText(),

            this

        );
        PMV.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarManutencaoVeiculoActionPerformed

    private void BLimparManutencaoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparManutencaoVeiculoActionPerformed

                        TFNomeFornecedor.setText("");
                        TFFantasiaFornecedor.setText("");
                        TFCNPJFornecedor.setText("");
                        TFInscEstadualFornecedor.setText("");
                        TFTelefone1Fornecedor.setText("");
                        TFTelefone2Fornecedor.setText("");
                        TFFaxFornecedor.setText("");
                        
                        TFCodigoVeiculo.setText("");
                        TFPlacaVeiculo1.setText("");
                        CBTipoVeiculo1.setSelectedItem("");
                        TFFabricante1.setText("");
                        TFModeloVeiculo1.setText("");
                        TFAnoVeiculo1.setText("");
                        TFRenavam1.setText("");
                        TFChassi1.setText("");
                        TAObservacoes.setText(""); 
                        
                        TFDataEntrada.setText("");
                        CBReparo1.setSelectedItem("");
                        CBReparo2.setSelectedItem("");
                        CBReparo3.setSelectedItem("");
                        TFOrcamento.setText("");
                        TFDataSaida.setText("");
                        TAObservacoes.setText("");
                        
                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo1.setEnabled(false);
                        CBTipoVeiculo1.setEnabled(false);
                        TFFabricante1.setEnabled(false);
                        TFModeloVeiculo1.setEnabled(false);
                        TFAnoVeiculo1.setEnabled(false);
                        TFRenavam1.setEnabled(false);
                        TFChassi1.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                                             
                        LCodigoManutencaoVeiculo.setVisible(false);
                        TFCodigoManutencaoVeiculos.setVisible(false);
                        TFDataEntrada.setEnabled(false);
                        CBReparo1.setEnabled(false);
                        CBReparo2.setEnabled(false);
                        CBReparo3.setEnabled(false);
                        TFOrcamento.setEnabled(false);
                        TFDataSaida.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                        
                        BBuscarFornecedor.setEnabled(false);
                        BInserirManutencaoVeiculo.setEnabled(false);                        
                        BLimparManutencaoVeiculo.setEnabled(false);
                        BAtualizarManutencaoVeiculo.setEnabled(false);
                        BExcluirManutencaoVeiculo.setEnabled(false);
                        BBuscarFornecedor.setEnabled(false);
                        BBuscarVeiculo.setEnabled(false);

// TODO add your handling code here:
    }//GEN-LAST:event_BLimparManutencaoVeiculoActionPerformed

    private void BAtualizarManutencaoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarManutencaoVeiculoActionPerformed

        try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE manutencaoveiculo SET "
                    + "DataEntrada = '"+TFDataEntrada.getText()+"',"
                    + "Reparo1 = '"+CBReparo1.getSelectedItem()+"',"
                    + "Reparo2 = '"+CBReparo2.getSelectedItem()+"',"
                    + "Reparo3 = '"+CBReparo3.getSelectedItem()+"',"
                    + "Orcamento = '"+TFOrcamento.getText()+"',"
                    + "DataSaida = '"+TFDataSaida.getText()+"',"
                    + "Observacao = '"+TAObservacoes.getText()+"'"
                    + "WHERE Codigo = '"+TFCodigoManutencaoVeiculos.getText()+"'");
            
                        TFNomeFornecedor.setText("");
                        TFFantasiaFornecedor.setText("");
                        TFCNPJFornecedor.setText("");
                        TFInscEstadualFornecedor.setText("");
                        TFTelefone1Fornecedor.setText("");
                        TFTelefone2Fornecedor.setText("");
                        TFFaxFornecedor.setText("");
                        
                        TFCodigoVeiculo.setText("");
                        TFPlacaVeiculo1.setText("");
                        CBTipoVeiculo1.setSelectedItem("");
                        TFFabricante1.setText("");
                        TFModeloVeiculo1.setText("");
                        TFAnoVeiculo1.setText("");
                        TFRenavam1.setText("");
                        TFChassi1.setText("");
                        TAObservacoes.setText(""); 
                        
                        TFDataEntrada.setText("");
                        CBReparo1.setSelectedItem("");
                        CBReparo2.setSelectedItem("");
                        CBReparo3.setSelectedItem("");
                        TFOrcamento.setText("");
                        TFDataSaida.setText("");
                        TAObservacoes.setText("");
                        
                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo1.setEnabled(false);
                        CBTipoVeiculo1.setEnabled(false);
                        TFFabricante1.setEnabled(false);
                        TFModeloVeiculo1.setEnabled(false);
                        TFAnoVeiculo1.setEnabled(false);
                        TFRenavam1.setEnabled(false);
                        TFChassi1.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                                             
                        LCodigoManutencaoVeiculo.setVisible(false);
                        TFCodigoManutencaoVeiculos.setVisible(false);
                        TFDataEntrada.setEnabled(false);
                        CBReparo1.setEnabled(false);
                        CBReparo2.setEnabled(false);
                        CBReparo3.setEnabled(false);
                        TFOrcamento.setEnabled(false);
                        TFDataSaida.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                        
                        BBuscarFornecedor.setEnabled(false);
                        BInserirManutencaoVeiculo.setEnabled(false);                        
                        BLimparManutencaoVeiculo.setEnabled(false);
                        BAtualizarManutencaoVeiculo.setEnabled(false);
                        BExcluirManutencaoVeiculo.setEnabled(false);
                        BBuscarFornecedor.setEnabled(false);
                        BBuscarVeiculo.setEnabled(false);

            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Ordem de Entrega Alterado com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Alterar Veiculo\n"+e.getMessage());
        }

// TODO add your handling code here:
    }//GEN-LAST:event_BAtualizarManutencaoVeiculoActionPerformed

    private void BExcluirManutencaoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirManutencaoVeiculoActionPerformed

        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM ManutencaoVeiculo WHERE codigo = '"+TFCodigoManutencaoVeiculos.getText()+"'");
            
                        TFNomeFornecedor.setText("");
                        TFFantasiaFornecedor.setText("");
                        TFCNPJFornecedor.setText("");
                        TFInscEstadualFornecedor.setText("");
                        TFTelefone1Fornecedor.setText("");
                        TFTelefone2Fornecedor.setText("");
                        TFFaxFornecedor.setText("");
                        
                        TFCodigoVeiculo.setText("");
                        TFPlacaVeiculo1.setText("");
                        CBTipoVeiculo1.setSelectedItem("");
                        TFFabricante1.setText("");
                        TFModeloVeiculo1.setText("");
                        TFAnoVeiculo1.setText("");
                        TFRenavam1.setText("");
                        TFChassi1.setText("");
                        TAObservacoes.setText(""); 
                        
                        TFDataEntrada.setText("");
                        CBReparo1.setSelectedItem("");
                        CBReparo2.setSelectedItem("");
                        CBReparo3.setSelectedItem("");
                        TFOrcamento.setText("");
                        TFDataSaida.setText("");
                        TAObservacoes.setText("");
                        
                        TFCodigoFornecedor.setEnabled(false);
                        TFNomeFornecedor.setEnabled(false);
                        TFFantasiaFornecedor.setEnabled(false);
                        TFCNPJFornecedor.setEnabled(false);
                        TFInscEstadualFornecedor.setEnabled(false);
                        TFTelefone1Fornecedor.setEnabled(false);
                        TFTelefone2Fornecedor.setEnabled(false);
                        TFFaxFornecedor.setEnabled(false);
                        LCodigoFornecedor.setVisible(false);
                        TFCodigoFornecedor.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo1.setEnabled(false);
                        CBTipoVeiculo1.setEnabled(false);
                        TFFabricante1.setEnabled(false);
                        TFModeloVeiculo1.setEnabled(false);
                        TFAnoVeiculo1.setEnabled(false);
                        TFRenavam1.setEnabled(false);
                        TFChassi1.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                                             
                        LCodigoManutencaoVeiculo.setVisible(false);
                        TFCodigoManutencaoVeiculos.setVisible(false);
                        TFDataEntrada.setEnabled(false);
                        CBReparo1.setEnabled(false);
                        CBReparo2.setEnabled(false);
                        CBReparo3.setEnabled(false);
                        TFOrcamento.setEnabled(false);
                        TFDataSaida.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                        
                        BBuscarFornecedor.setEnabled(false);
                        BInserirManutencaoVeiculo.setEnabled(false);                        
                        BLimparManutencaoVeiculo.setEnabled(false);
                        BAtualizarManutencaoVeiculo.setEnabled(false);
                        BExcluirManutencaoVeiculo.setEnabled(false);
                        BBuscarFornecedor.setEnabled(false);
                        BBuscarVeiculo.setEnabled(false);            
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Veiculo Excluido com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Veiculo\n"+e.getMessage());}
// TODO add your handling code here:
    }//GEN-LAST:event_BExcluirManutencaoVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(ManutencaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManutencaoVeiculo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarManutencaoVeiculo;
    public javax.swing.JButton BBuscarFornecedor;
    public javax.swing.JButton BBuscarManutencaoVeiculo;
    public javax.swing.JButton BBuscarVeiculo;
    public javax.swing.JButton BExcluirManutencaoVeiculo;
    public javax.swing.JButton BInserirDadosManutencaoVeiculo;
    public javax.swing.JButton BInserirManutencaoVeiculo;
    public javax.swing.JButton BLimparManutencaoVeiculo;
    public javax.swing.JComboBox CBReparo1;
    public javax.swing.JComboBox CBReparo2;
    public javax.swing.JComboBox CBReparo3;
    public javax.swing.JComboBox CBTipoVeiculo1;
    public javax.swing.JLabel LCodigoFornecedor;
    public javax.swing.JLabel LCodigoManutencaoVeiculo;
    public javax.swing.JLabel LCodigoVeiculo;
    public javax.swing.JTextArea TAObservacoes;
    public javax.swing.JTextField TFAnoVeiculo1;
    public javax.swing.JTextField TFCNPJFornecedor;
    public javax.swing.JTextField TFChassi1;
    public javax.swing.JTextField TFCodigoFornecedor;
    public javax.swing.JTextField TFCodigoManutencaoVeiculos;
    public javax.swing.JTextField TFCodigoVeiculo;
    public javax.swing.JTextField TFDataEntrada;
    public javax.swing.JTextField TFDataSaida;
    public javax.swing.JTextField TFFabricante1;
    public javax.swing.JTextField TFFantasiaFornecedor;
    public javax.swing.JTextField TFFaxFornecedor;
    public javax.swing.JTextField TFInscEstadualFornecedor;
    public javax.swing.JTextField TFModeloVeiculo1;
    public javax.swing.JTextField TFNomeFornecedor;
    public javax.swing.JTextField TFOrcamento;
    public javax.swing.JTextField TFPlacaVeiculo1;
    public javax.swing.JTextField TFRenavam1;
    public javax.swing.JTextField TFTelefone1Fornecedor;
    public javax.swing.JTextField TFTelefone2Fornecedor;
    public javax.swing.JButton jButton5;
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
