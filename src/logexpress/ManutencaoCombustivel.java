package logexpress;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ManutencaoCombustivel extends javax.swing.JFrame {

    public ManutencaoCombustivel() {
        initComponents();
    }
    
     Connection conn;
    
    
    public ManutencaoCombustivel(Connection conn) {
        initComponents();
        this.conn = conn;
        
                        TFCodigoManutencaoCombustivel.setEnabled(false);
                        TFNomeFornecedor1.setEnabled(false);
                        TFFantasiaFornecedor1.setEnabled(false);
                        TFCNPJFornecedor1.setEnabled(false);
                        TFInscEstadualFornecedor1.setEnabled(false);
                        TFTelefone1Fornecedor1.setEnabled(false);
                        TFTelefone2Fornecedor1.setEnabled(false);
                        TFFaxFornecedor1.setEnabled(false);
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        
                        TFCodigoVeiculosCombustivel.setEnabled(false);
                        TFPlacaVeiculo2.setEnabled(false);
                        CBTipoVeiculo2.setEnabled(false);
                        TFFabricanteVeiculo2.setEnabled(false);
                        TFModeloVeiculo2.setEnabled(false);
                        TFAnoVeiculo2.setEnabled(false);
                        TFRenavam2.setEnabled(false);
                        TFChassi2.setEnabled(false);
                        LCodigoVeiculoCombustivel.setVisible(false);
                        TFCodigoVeiculosCombustivel.setVisible(false);
                                             
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        TFDataAbastecimento.setEnabled(false);
                        TFKilometragem.setEnabled(false);
                        CBCombustivel.setEnabled(false);
                        TFLitros.setEnabled(false);
                        TFTotalPagar.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                          LCodigoFornecedorCombustivel.setVisible(false);
                        TFCodigoFornecedorCombustivel.setVisible(false);
                        
                        BBuscarManutencaoCombustivel.setEnabled(false);
                        BInserirDadosManutencaoCombustivel.setEnabled(true);                        
                        BLimparManutencaoCombustivel.setEnabled(false);
                        BAtualizarManutencaoCombustivel.setEnabled(false);
                        BExcluirManutencaoCombustivel.setEnabled(false);
                        BInserirManutencaoCombustivel.setEnabled(false);
                        BBuscarManutencaoCombustivel.setEnabled(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BExcluirManutencaoCombustivel = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        BLimparManutencaoCombustivel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TFDataAbastecimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TFKilometragem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CBCombustivel = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        TFLitros = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TFTotalPagar = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        LCodigoManutencaoCombustivel = new javax.swing.JLabel();
        TFCodigoManutencaoCombustivel = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservacoes = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        TFNomeFornecedor1 = new javax.swing.JTextField();
        TFFantasiaFornecedor1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TFCNPJFornecedor1 = new javax.swing.JTextField();
        TFInscEstadualFornecedor1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TFTelefone1Fornecedor1 = new javax.swing.JTextField();
        TFTelefone2Fornecedor1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TFFaxFornecedor1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        BBuscarFornecedor = new javax.swing.JButton();
        LCodigoFornecedorCombustivel = new javax.swing.JLabel();
        TFCodigoFornecedorCombustivel = new javax.swing.JTextField();
        BInserirManutencaoCombustivel = new javax.swing.JButton();
        BAtualizarManutencaoCombustivel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFPlacaVeiculo2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFRenavam2 = new javax.swing.JTextField();
        TFChassi2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBTipoVeiculo2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFModeloVeiculo2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TFAnoVeiculo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFFabricanteVeiculo2 = new javax.swing.JTextField();
        BBuscarVeiculo = new javax.swing.JButton();
        LCodigoVeiculoCombustivel = new javax.swing.JLabel();
        TFCodigoVeiculosCombustivel = new javax.swing.JTextField();
        BInserirDadosManutencaoCombustivel = new javax.swing.JButton();
        BBuscarManutencaoCombustivel = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Controle de Combustível");

        BExcluirManutencaoCombustivel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirManutencaoCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BExcluirManutencaoCombustivel.setText("Excluir");
        BExcluirManutencaoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirManutencaoCombustivelActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        BLimparManutencaoCombustivel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparManutencaoCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        BLimparManutencaoCombustivel.setText("Limpar");
        BLimparManutencaoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparManutencaoCombustivelActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(192, 240, 240));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Data Abastecimento");

        jLabel9.setText("Kilometragem");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("Dados  Manutenção");

        CBCombustivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gasolina", "Alcool", "Diesel", " " }));

        jLabel8.setText("Tipo Combustível");

        jLabel12.setText("Litros");

        jLabel22.setText("Total Pagar");

        LCodigoManutencaoCombustivel.setText("Codigo");

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel19.setText("Observações");

        TAObservacoes.setColumns(20);
        TAObservacoes.setRows(5);
        TAObservacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(TAObservacoes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDataAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFLitros, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LCodigoManutencaoCombustivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCodigoManutencaoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LCodigoManutencaoCombustivel)
                        .addComponent(TFCodigoManutencaoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(TFDataAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(TFKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CBCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(TFLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(192, 240, 240));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setText("Nome / Razão Social");

        jLabel15.setText("Nome Fantasia (CNPJ)");

        jLabel16.setText("CNPJ / CPF");

        TFCNPJFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCNPJFornecedor1ActionPerformed(evt);
            }
        });

        TFInscEstadualFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFInscEstadualFornecedor1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Inscrição Estadual / RG");

        jLabel24.setText("Tel 01");

        jLabel25.setText("Tel 02");

        jLabel26.setText("Fax");

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel29.setText("Fornecedor");

        BBuscarFornecedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarFornecedor.setText("Buscar Fornecedor");
        BBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarFornecedorActionPerformed(evt);
            }
        });

        LCodigoFornecedorCombustivel.setText("Codigo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(LCodigoFornecedorCombustivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFCodigoFornecedorCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BBuscarFornecedor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNomeFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFantasiaFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCNPJFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFInscEstadualFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelefone1Fornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelefone2Fornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFaxFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LCodigoFornecedorCombustivel)
                        .addComponent(TFCodigoFornecedorCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(BBuscarFornecedor)))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFNomeFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFantasiaFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TFCNPJFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(TFInscEstadualFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(TFTelefone1Fornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(TFTelefone2Fornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(TFFaxFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BInserirManutencaoCombustivel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BInserirManutencaoCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BInserirManutencaoCombustivel.setText("Gavar");
        BInserirManutencaoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirManutencaoCombustivelActionPerformed(evt);
            }
        });

        BAtualizarManutencaoCombustivel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarManutencaoCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        BAtualizarManutencaoCombustivel.setText("Atualizar");
        BAtualizarManutencaoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarManutencaoCombustivelActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 240, 240));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Placa");

        jLabel4.setText("Renavam");

        jLabel5.setText("Chassi");

        CBTipoVeiculo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carro", "Caminhão", "Moto", "Carreta", "Caminhonete" }));

        jLabel3.setText("Tipo de Veículo");

        jLabel11.setText("Fabricante");

        jLabel20.setText("Modelo");

        jLabel21.setText("Ano");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Dados Veículo");

        TFFabricanteVeiculo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFFabricanteVeiculo2ActionPerformed(evt);
            }
        });

        BBuscarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarVeiculo.setText("Buscar Veiculo");
        BBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarVeiculoActionPerformed(evt);
            }
        });

        LCodigoVeiculoCombustivel.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFAnoVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRenavam2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFChassi2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFPlacaVeiculo2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBTipoVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFabricanteVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFModeloVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LCodigoVeiculoCombustivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFCodigoVeiculosCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(350, 350, 350)))
                        .addComponent(BBuscarVeiculo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LCodigoVeiculoCombustivel)
                                .addComponent(TFCodigoVeiculosCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel20)
                            .addComponent(TFPlacaVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(CBTipoVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFFabricanteVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFModeloVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BBuscarVeiculo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFAnoVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel4)
                    .addComponent(TFRenavam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TFChassi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BInserirDadosManutencaoCombustivel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BInserirDadosManutencaoCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionarDados.png"))); // NOI18N
        BInserirDadosManutencaoCombustivel.setText("Inserir Dados");
        BInserirDadosManutencaoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDadosManutencaoCombustivelActionPerformed(evt);
            }
        });

        BBuscarManutencaoCombustivel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarManutencaoCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        BBuscarManutencaoCombustivel.setText("Buscar Controle de Combustível");
        BBuscarManutencaoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarManutencaoCombustivelActionPerformed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BInserirDadosManutencaoCombustivel)
                        .addGap(18, 18, 18)
                        .addComponent(BBuscarManutencaoCombustivel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BInserirManutencaoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAtualizarManutencaoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLimparManutencaoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BExcluirManutencaoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BInserirDadosManutencaoCombustivel)
                                        .addComponent(BBuscarManutencaoCombustivel))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BInserirManutencaoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(BAtualizarManutencaoCombustivel))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BLimparManutencaoCombustivel)
                                .addGap(16, 16, 16)
                                .addComponent(BExcluirManutencaoCombustivel))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TFFabricanteVeiculo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFFabricanteVeiculo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFFabricanteVeiculo2ActionPerformed

    private void BInserirManutencaoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirManutencaoCombustivelActionPerformed

              if (!TFDataAbastecimento.getText().equals("") &&  !CBCombustivel.getSelectedItem().equals("")){
        
           try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO ControleCombustivel VALUES (null,?,?,?,?,?,?,?,?)");
            
            pstm.setString(1, TFDataAbastecimento.getText());
            pstm.setString(2, TFKilometragem.getText());
            pstm.setString(3, CBCombustivel.getSelectedItem().toString());
            pstm.setString(4, TFLitros.getText());
            pstm.setString(5, TFTotalPagar.getText());
            pstm.setString(6, TAObservacoes.getText());
            pstm.setInt(7, Integer.parseInt(TFCodigoVeiculosCombustivel.getText()));
            pstm.setInt(8, Integer.parseInt(TFCodigoFornecedorCombustivel.getText()));
            
                        TFNomeFornecedor1.setText("");
                        TFFantasiaFornecedor1.setText("");
                        TFCNPJFornecedor1.setText("");
                        TFInscEstadualFornecedor1.setText("");
                        TFTelefone1Fornecedor1.setText("");
                        TFTelefone2Fornecedor1.setText("");
                        TFFaxFornecedor1.setText("");
                        
                        TFCodigoVeiculosCombustivel.setText("");
                        TFPlacaVeiculo2.setText("");
                        CBTipoVeiculo2.setSelectedItem("");
                        TFFabricanteVeiculo2.setText("");
                        TFModeloVeiculo2.setText("");
                        TFAnoVeiculo2.setText("");
                        TFRenavam2.setText("");
                        TFChassi2.setText("");
                        
                        TFDataAbastecimento.setText("");
                        TFKilometragem.setText("");
                        CBCombustivel.setSelectedItem("");
                        TFLitros.setText("");
                        TFTotalPagar.setText("");
                        TAObservacoes.setText("");
                        
                        TFCodigoManutencaoCombustivel.setEnabled(false);
                        TFNomeFornecedor1.setEnabled(false);
                        TFFantasiaFornecedor1.setEnabled(false);
                        TFCNPJFornecedor1.setEnabled(false);
                        TFInscEstadualFornecedor1.setEnabled(false);
                        TFTelefone1Fornecedor1.setEnabled(false);
                        TFTelefone2Fornecedor1.setEnabled(false);
                        TFFaxFornecedor1.setEnabled(false);
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        
                        TFCodigoVeiculosCombustivel.setEnabled(true);
                        TFPlacaVeiculo2.setEnabled(false);
                        CBTipoVeiculo2.setEnabled(false);
                        TFFabricanteVeiculo2.setEnabled(false);
                        TFModeloVeiculo2.setEnabled(false);
                        TFAnoVeiculo2.setEnabled(false);
                        TFRenavam2.setEnabled(false);
                        TFChassi2.setEnabled(false);
                        LCodigoVeiculoCombustivel.setVisible(false);
                        TFCodigoVeiculosCombustivel.setVisible(true);
                                             
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        TFDataAbastecimento.setEnabled(false);
                        TFKilometragem.setEnabled(false);
                        CBCombustivel.setEnabled(false);
                        TFLitros.setEnabled(false);
                        TFTotalPagar.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                        
                        BBuscarManutencaoCombustivel.setEnabled(false);
                        BInserirDadosManutencaoCombustivel.setEnabled(true);                        
                        BLimparManutencaoCombustivel.setEnabled(false);
                        BAtualizarManutencaoCombustivel.setEnabled(false);
                        BExcluirManutencaoCombustivel.setEnabled(false);
                        BInserirDadosManutencaoCombustivel.setEnabled(false);
                        BBuscarManutencaoCombustivel.setEnabled(true);

            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Manutenção de Combustível Cadastrada com Sucesso!");
            
        }
        catch (SQLException e)
        {
            System.out.println("Error ao consultar Manutenção de Copbustivel: "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Atenção!!!\n\nErro ao inserir Manutenção de Combustivel!!"+e.getMessage());
        }
         }
         else
        {
            
            JOptionPane.showMessageDialog(null, "Entre com os Dados da Manutencao de Combustivel para efetuar o cadastro!!");
        }
        
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_BInserirManutencaoCombustivelActionPerformed

    private void BBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarVeiculoActionPerformed

        ConsultaVeiculo2 CV2 = new ConsultaVeiculo2(conn,
                
                TFPlacaVeiculo2.getText(),(String) 
                CBTipoVeiculo2.getSelectedItem() ,
                TFFabricanteVeiculo2.getText(),  
                TFModeloVeiculo2.getText(), 
                TFAnoVeiculo2.getText(), 
                TFRenavam2.getText(), 
                TFChassi2.getText(), 
                
                this);
        CV2.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_BBuscarVeiculoActionPerformed

    private void TFCNPJFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCNPJFornecedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCNPJFornecedor1ActionPerformed

    private void TFInscEstadualFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFInscEstadualFornecedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFInscEstadualFornecedor1ActionPerformed

    private void BBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarFornecedorActionPerformed

         ConsultaFornecedor1 CF1 = new ConsultaFornecedor1(conn, 
                 
                 TFNomeFornecedor1.getText(),
                 TFCNPJFornecedor1.getText(), 
                 TFInscEstadualFornecedor1.getText(), 
                 TFTelefone1Fornecedor1.getText(), 
                 TFTelefone2Fornecedor1.getText(), 
                 TFFantasiaFornecedor1.getText(), 
                 TFFaxFornecedor1.getText(),
                 
                 this);
        CF1.setVisible(true); 
// TODO add your handling code here:
    }//GEN-LAST:event_BBuscarFornecedorActionPerformed

    private void BInserirDadosManutencaoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDadosManutencaoCombustivelActionPerformed

        TFNomeFornecedor1.setText("");
                        TFFantasiaFornecedor1.setText("");
                        TFCNPJFornecedor1.setText("");
                        TFInscEstadualFornecedor1.setText("");
                        TFTelefone1Fornecedor1.setText("");
                        TFTelefone2Fornecedor1.setText("");
                        TFFaxFornecedor1.setText("");
                        
                        TFCodigoVeiculosCombustivel.setText("");
                        TFPlacaVeiculo2.setText("");
                        CBTipoVeiculo2.setSelectedItem("");
                        TFFabricanteVeiculo2.setText("");
                        TFModeloVeiculo2.setText("");
                        TFAnoVeiculo2.setText("");
                        TFRenavam2.setText("");
                        TFChassi2.setText("");
                        
                        TFDataAbastecimento.setText("");
                        TFKilometragem.setText("");
                        CBCombustivel.setSelectedItem("");
                        TFLitros.setText("");
                        TFTotalPagar.setText("");
                        TAObservacoes.setText("");
        
                        TFCodigoManutencaoCombustivel.setEnabled(false);
                        TFNomeFornecedor1.setEnabled(false);
                        TFFantasiaFornecedor1.setEnabled(false);
                        TFCNPJFornecedor1.setEnabled(false);
                        TFInscEstadualFornecedor1.setEnabled(false);
                        TFTelefone1Fornecedor1.setEnabled(false);
                        TFTelefone2Fornecedor1.setEnabled(false);
                        TFFaxFornecedor1.setEnabled(false);
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        
                        TFCodigoVeiculosCombustivel.setEnabled(true);
                        TFPlacaVeiculo2.setEnabled(false);
                        CBTipoVeiculo2.setEnabled(false);
                        TFFabricanteVeiculo2.setEnabled(false);
                        TFModeloVeiculo2.setEnabled(false);
                        TFAnoVeiculo2.setEnabled(false);
                        TFRenavam2.setEnabled(false);
                        TFChassi2.setEnabled(false);
                        LCodigoVeiculoCombustivel.setVisible(false);
                        TFCodigoVeiculosCombustivel.setVisible(true);
                                             
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        TFDataAbastecimento.setEnabled(true);
                        TFKilometragem.setEnabled(true);
                        CBCombustivel.setEnabled(true);
                        TFLitros.setEnabled(true);
                        TFTotalPagar.setEnabled(true);
                        TAObservacoes.setEnabled(true);
                        
                        BBuscarManutencaoCombustivel.setEnabled(false);
                        BInserirManutencaoCombustivel.setEnabled(true);                        
                        BLimparManutencaoCombustivel.setEnabled(true);
                        BAtualizarManutencaoCombustivel.setEnabled(false);
                        BExcluirManutencaoCombustivel.setEnabled(false);
                        BInserirDadosManutencaoCombustivel.setEnabled(true);
                        BBuscarManutencaoCombustivel.setEnabled(true);

    }//GEN-LAST:event_BInserirDadosManutencaoCombustivelActionPerformed

    private void BBuscarManutencaoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarManutencaoCombustivelActionPerformed

        PesquisaManutencaoCombustivel PMV = new PesquisaManutencaoCombustivel(conn,

            TFNomeFornecedor1.getText(),
            TFFantasiaFornecedor1.getText(),
            TFCNPJFornecedor1.getText(),
            TFInscEstadualFornecedor1.getText(),
            TFTelefone1Fornecedor1.getText(),
            TFTelefone2Fornecedor1.getText(),
            TFFaxFornecedor1.getText(),

            TFPlacaVeiculo2.getText(),
            (String)CBTipoVeiculo2.getSelectedItem(),
            TFFabricanteVeiculo2.getText(),
            TFModeloVeiculo2.getText(),
            TFAnoVeiculo2.getText(),
            TFRenavam2.getText(),
            TFChassi2.getText(),

            TFDataAbastecimento.getText(),
            TFKilometragem.getText(),
            (String)CBCombustivel.getSelectedItem(),
            TFLitros.getText(),
            TFTotalPagar.getText(),
            TAObservacoes.getText(),

            this

        );
        PMV.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarManutencaoCombustivelActionPerformed

    private void BLimparManutencaoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparManutencaoCombustivelActionPerformed

                        TFNomeFornecedor1.setText("");
                        TFFantasiaFornecedor1.setText("");
                        TFCNPJFornecedor1.setText("");
                        TFInscEstadualFornecedor1.setText("");
                        TFTelefone1Fornecedor1.setText("");
                        TFTelefone2Fornecedor1.setText("");
                        TFFaxFornecedor1.setText("");
                        
                        TFCodigoVeiculosCombustivel.setText("");
                        TFPlacaVeiculo2.setText("");
                        CBTipoVeiculo2.setSelectedItem("");
                        TFFabricanteVeiculo2.setText("");
                        TFModeloVeiculo2.setText("");
                        TFAnoVeiculo2.setText("");
                        TFRenavam2.setText("");
                        TFChassi2.setText("");
                        
                        TFDataAbastecimento.setText("");
                        TFKilometragem.setText("");
                        CBCombustivel.setSelectedItem("");
                        TFLitros.setText("");
                        TFTotalPagar.setText("");
                        TAObservacoes.setText("");
                        
                        TFCodigoManutencaoCombustivel.setEnabled(false);
                        TFNomeFornecedor1.setEnabled(false);
                        TFFantasiaFornecedor1.setEnabled(false);
                        TFCNPJFornecedor1.setEnabled(false);
                        TFInscEstadualFornecedor1.setEnabled(false);
                        TFTelefone1Fornecedor1.setEnabled(false);
                        TFTelefone2Fornecedor1.setEnabled(false);
                        TFFaxFornecedor1.setEnabled(false);
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        
                        TFCodigoVeiculosCombustivel.setEnabled(true);
                        TFPlacaVeiculo2.setEnabled(false);
                        CBTipoVeiculo2.setEnabled(false);
                        TFFabricanteVeiculo2.setEnabled(false);
                        TFModeloVeiculo2.setEnabled(false);
                        TFAnoVeiculo2.setEnabled(false);
                        TFRenavam2.setEnabled(false);
                        TFChassi2.setEnabled(false);
                        LCodigoVeiculoCombustivel.setVisible(false);
                        TFCodigoVeiculosCombustivel.setVisible(true);
                                             
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        TFDataAbastecimento.setEnabled(false);
                        TFKilometragem.setEnabled(false);
                        CBCombustivel.setEnabled(false);
                        TFLitros.setEnabled(false);
                        TFTotalPagar.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                        
                        BBuscarManutencaoCombustivel.setEnabled(false);
                        BInserirDadosManutencaoCombustivel.setEnabled(true);                        
                        BLimparManutencaoCombustivel.setEnabled(false);
                        BAtualizarManutencaoCombustivel.setEnabled(false);
                        BExcluirManutencaoCombustivel.setEnabled(false);
                        BInserirDadosManutencaoCombustivel.setEnabled(false);
                        BBuscarManutencaoCombustivel.setEnabled(true);

    }//GEN-LAST:event_BLimparManutencaoCombustivelActionPerformed

    private void BAtualizarManutencaoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarManutencaoCombustivelActionPerformed

try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE controleCombustivel SET "
                    + "DataAbastecimento = '"+TFDataAbastecimento.getText()+"',"
                    + "Kilometro = '"+TFKilometragem.getText()+"',"
                    + "TipoCombustivel = '"+CBCombustivel.getSelectedItem()+"',"
                    + "Litros = '"+TFLitros.getText()+"',"
                    + "TotalPago = '"+TFTotalPagar.getText()+"',"
                    + "Observacao = '"+TAObservacoes.getText()+"'"
                    + "WHERE Codigo = '"+TFCodigoManutencaoCombustivel.getText()+"'");
            
                        TFNomeFornecedor1.setText("");
                        TFFantasiaFornecedor1.setText("");
                        TFCNPJFornecedor1.setText("");
                        TFInscEstadualFornecedor1.setText("");
                        TFTelefone1Fornecedor1.setText("");
                        TFTelefone2Fornecedor1.setText("");
                        TFFaxFornecedor1.setText("");
                        
                        TFCodigoVeiculosCombustivel.setText("");
                        TFPlacaVeiculo2.setText("");
                        CBTipoVeiculo2.setSelectedItem("");
                        TFFabricanteVeiculo2.setText("");
                        TFModeloVeiculo2.setText("");
                        TFAnoVeiculo2.setText("");
                        TFRenavam2.setText("");
                        TFChassi2.setText("");
                        
                        TFDataAbastecimento.setText("");
                        TFKilometragem.setText("");
                        CBCombustivel.setSelectedItem("");
                        TFLitros.setText("");
                        TFTotalPagar.setText("");
                        TAObservacoes.setText("");
                        
                        TFCodigoManutencaoCombustivel.setEnabled(false);
                        TFNomeFornecedor1.setEnabled(false);
                        TFFantasiaFornecedor1.setEnabled(false);
                        TFCNPJFornecedor1.setEnabled(false);
                        TFInscEstadualFornecedor1.setEnabled(false);
                        TFTelefone1Fornecedor1.setEnabled(false);
                        TFTelefone2Fornecedor1.setEnabled(false);
                        TFFaxFornecedor1.setEnabled(false);
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        
                        TFCodigoVeiculosCombustivel.setEnabled(true);
                        TFPlacaVeiculo2.setEnabled(false);
                        CBTipoVeiculo2.setEnabled(false);
                        TFFabricanteVeiculo2.setEnabled(false);
                        TFModeloVeiculo2.setEnabled(false);
                        TFAnoVeiculo2.setEnabled(false);
                        TFRenavam2.setEnabled(false);
                        TFChassi2.setEnabled(false);
                        LCodigoVeiculoCombustivel.setVisible(false);
                        TFCodigoVeiculosCombustivel.setVisible(true);
                                             
                        LCodigoManutencaoCombustivel.setVisible(false);
                        TFCodigoManutencaoCombustivel.setVisible(false);
                        TFDataAbastecimento.setEnabled(false);
                        TFKilometragem.setEnabled(false);
                        CBCombustivel.setEnabled(false);
                        TFLitros.setEnabled(false);
                        TFTotalPagar.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                        
                        BBuscarManutencaoCombustivel.setEnabled(false);
                        BInserirDadosManutencaoCombustivel.setEnabled(true);                        
                        BLimparManutencaoCombustivel.setEnabled(false);
                        BAtualizarManutencaoCombustivel.setEnabled(false);
                        BExcluirManutencaoCombustivel.setEnabled(false);
                        BInserirDadosManutencaoCombustivel.setEnabled(false);
                        BBuscarVeiculo.setEnabled(true);
                        BBuscarFornecedor.setEnabled(true);
                        
                        
                        pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Manutenção de Combustível Alterado com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Alterar Manutenção de Pneus\n"+e.getMessage());
        }        

// TODO add your handling code here:
    }//GEN-LAST:event_BAtualizarManutencaoCombustivelActionPerformed

    private void BExcluirManutencaoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirManutencaoCombustivelActionPerformed

        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM controleCombustivel WHERE codigo = '"+TFCodigoManutencaoCombustivel.getText()+"'");
            
                              
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Controle de Combustível Excluido com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Controle de Combustivel \n"+e.getMessage());}
// TODO add your handling code here:
    }//GEN-LAST:event_BExcluirManutencaoCombustivelActionPerformed

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
            java.util.logging.Logger.getLogger(ManutencaoCombustivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoCombustivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoCombustivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoCombustivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManutencaoCombustivel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarManutencaoCombustivel;
    public javax.swing.JButton BBuscarFornecedor;
    public javax.swing.JButton BBuscarManutencaoCombustivel;
    public javax.swing.JButton BBuscarVeiculo;
    public javax.swing.JButton BExcluirManutencaoCombustivel;
    public javax.swing.JButton BInserirDadosManutencaoCombustivel;
    public javax.swing.JButton BInserirManutencaoCombustivel;
    public javax.swing.JButton BLimparManutencaoCombustivel;
    public javax.swing.JComboBox CBCombustivel;
    public javax.swing.JComboBox CBTipoVeiculo2;
    public javax.swing.JLabel LCodigoFornecedorCombustivel;
    public javax.swing.JLabel LCodigoManutencaoCombustivel;
    public javax.swing.JLabel LCodigoVeiculoCombustivel;
    public javax.swing.JTextArea TAObservacoes;
    public javax.swing.JTextField TFAnoVeiculo2;
    public javax.swing.JTextField TFCNPJFornecedor1;
    public javax.swing.JTextField TFChassi2;
    public javax.swing.JTextField TFCodigoFornecedorCombustivel;
    public javax.swing.JTextField TFCodigoManutencaoCombustivel;
    public javax.swing.JTextField TFCodigoVeiculosCombustivel;
    public javax.swing.JTextField TFDataAbastecimento;
    public javax.swing.JTextField TFFabricanteVeiculo2;
    public javax.swing.JTextField TFFantasiaFornecedor1;
    public javax.swing.JTextField TFFaxFornecedor1;
    public javax.swing.JTextField TFInscEstadualFornecedor1;
    public javax.swing.JTextField TFKilometragem;
    public javax.swing.JTextField TFLitros;
    public javax.swing.JTextField TFModeloVeiculo2;
    public javax.swing.JTextField TFNomeFornecedor1;
    public javax.swing.JTextField TFPlacaVeiculo2;
    public javax.swing.JTextField TFRenavam2;
    public javax.swing.JTextField TFTelefone1Fornecedor1;
    public javax.swing.JTextField TFTelefone2Fornecedor1;
    public javax.swing.JTextField TFTotalPagar;
    public javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
