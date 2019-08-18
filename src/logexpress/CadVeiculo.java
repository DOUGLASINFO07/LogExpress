package logexpress;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadVeiculo extends javax.swing.JFrame {

    public CadVeiculo() {
        initComponents();
    }
    
       Connection conn;
     public CadVeiculo(Connection conn) {
        initComponents();
        this.conn = conn;
        
            TFCodigoVeiculo.setEnabled(false);
            TFPlacaVeiculo.setEnabled(false);
            CBTipoVeiculo.setEnabled(false);
            TFFabricante.setEnabled(false);
            TFModelo.setEnabled(false);
            TFAno.setEnabled(false);
            TFRenavam.setEnabled(false);
            TFChassi.setEnabled(false);
            TFTipoPneu.setEnabled(false);
            CBTipoCombustivel.setEnabled(false);
            TFTara.setEnabled(false);
            TFPesoLiquido.setEnabled(false);
            TAObservacoes.setEnabled(false);
            
            BInserirVeiculo.setEnabled(false);
            BLimparVeiculo.setEnabled(false);
            BAtualizarVeiculo.setEnabled(false);
            BExcluirVeiculo.setEnabled(false);
                        
            LCodigoVeiculo.setVisible(false);
            TFCodigoVeiculo.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BInserirVeiculo = new javax.swing.JButton();
        BAtualizarVeiculo = new javax.swing.JButton();
        BLimparVeiculo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFPlacaVeiculo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFRenavam = new javax.swing.JTextField();
        TFChassi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBTipoVeiculo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFModelo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TFAno = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFTipoPneu = new javax.swing.JTextField();
        CBTipoCombustivel = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFTara = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TFPesoLiquido = new javax.swing.JTextField();
        TFFabricante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservacoes = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BVoltarVeiculo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        BExcluirVeiculo = new javax.swing.JButton();
        LCodigoVeiculo = new javax.swing.JLabel();
        TFCodigoVeiculo = new javax.swing.JTextField();
        BInserirDadosVeiculo = new javax.swing.JButton();
        BBuscarVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BInserirVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BInserirVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BInserirVeiculo.setText("Inserir");
        BInserirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirVeiculoActionPerformed(evt);
            }
        });

        BAtualizarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        BAtualizarVeiculo.setText("Atualizar");
        BAtualizarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarVeiculoActionPerformed(evt);
            }
        });

        BLimparVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        BLimparVeiculo.setText("Limpar");
        BLimparVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparVeiculoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jLabel2.setText("Placa");

        jLabel4.setText("Renavam");

        jLabel5.setText("Chassi");

        CBTipoVeiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carro", "Caminhão", "Moto", "Carreta", "Caminhonete" }));

        jLabel3.setText("Tipo de Veículo");

        jLabel11.setText("Fabricante");

        jLabel20.setText("Modelo");

        jLabel21.setText("Ano");

        jLabel6.setText("Tipo de Pneu");

        CBTipoCombustivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gasolina", "Alcool", "Diesel", " " }));

        jLabel7.setText("Tipo Combustível");

        jLabel8.setText("Tara");

        jLabel9.setText("Peso Líquido");

        TAObservacoes.setColumns(20);
        TAObservacoes.setRows(5);
        TAObservacoes.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jScrollPane1.setViewportView(TAObservacoes);

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFTara, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFPesoLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFTipoPneu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFAno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(TFPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CBTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(TFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TFRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TFTipoPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFTara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(TFPesoLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CBTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Cadastro de Veículos");

        BVoltarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BVoltarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltarVeiculo.setText("Voltar");
        BVoltarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarVeiculoActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        BExcluirVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BExcluirVeiculo.setText("Excluir");
        BExcluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirVeiculoActionPerformed(evt);
            }
        });

        LCodigoVeiculo.setText("Cogigo");

        BInserirDadosVeiculo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BInserirDadosVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionarDados.png"))); // NOI18N
        BInserirDadosVeiculo.setText("Inserir Dados");
        BInserirDadosVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDadosVeiculoActionPerformed(evt);
            }
        });

        BBuscarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        BBuscarVeiculo.setText("Buscar Veiculo");
        BBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarVeiculoActionPerformed(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BAtualizarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BInserirVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BLimparVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BVoltarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BExcluirVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(BInserirDadosVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBuscarVeiculo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TFCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(LCodigoVeiculo)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LCodigoVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BInserirDadosVeiculo)
                                    .addComponent(BBuscarVeiculo)
                                    .addComponent(TFCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BInserirVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizarVeiculo)
                        .addGap(18, 18, 18)
                        .addComponent(BLimparVeiculo)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluirVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BVoltarVeiculo))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarVeiculoActionPerformed
        
        this.dispose(); 
       
    }//GEN-LAST:event_BVoltarVeiculoActionPerformed

    private void BInserirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirVeiculoActionPerformed

         if (!TFPlacaVeiculo.getText().equals("") &&  !TFFabricante.getText().equals("") &&  !TFModelo.getText().equals("")){
        
           try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO Veiculo VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstm.setString(1, TFPlacaVeiculo.getText());
            pstm.setString(2, CBTipoVeiculo.getSelectedItem().toString());
            pstm.setString(3, TFFabricante.getText());
            pstm.setString(4, TFModelo.getText());
            pstm.setString(5, TFAno.getText());
            pstm.setString(6, TFRenavam.getText());
            pstm.setString(7, TFChassi.getText());
            pstm.setString(8, TFTipoPneu.getText());
            pstm.setString(9, CBTipoCombustivel.getSelectedItem().toString());
            pstm.setString(10, TFTara.getText());
            pstm.setString(11, TFPesoLiquido.getText());
            pstm.setString(12, TAObservacoes.getText());

            pstm.executeUpdate();
            pstm.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Atenção!!!\n\nErro ao inserir Veiculo!!");
        }
        
         }
         else
        {
            JOptionPane.showMessageDialog(null, "Entre com os Dados do Veiculo para efetuar o cadastro!!");
        }
        
        JOptionPane.showMessageDialog(null, "Veiculo Cadastrado com Sucesso!");
        
            TFCodigoVeiculo.setEnabled(false);
            TFPlacaVeiculo.setEnabled(false);
            CBTipoVeiculo.setEnabled(false);
            TFFabricante.setEnabled(false);
            TFModelo.setEnabled(false);
            TFAno.setEnabled(false);
            TFRenavam.setEnabled(false);
            TFChassi.setEnabled(false);
            TFTipoPneu.setEnabled(false);
            CBTipoCombustivel.setEnabled(false);
            TFTara.setEnabled(false);
            TFPesoLiquido.setEnabled(false);
            TAObservacoes.setEnabled(false);
            
            BInserirVeiculo.setEnabled(false);
            BLimparVeiculo.setEnabled(false);
            BAtualizarVeiculo.setEnabled(false);
            BExcluirVeiculo.setEnabled(false);
                        
            LCodigoVeiculo.setVisible(false);
            TFCodigoVeiculo.setVisible(false);
            
            TFCodigoVeiculo.setText("");
            TFPlacaVeiculo.setText("");
            CBTipoVeiculo.setSelectedItem("");
            TFFabricante.setText("");
            TFModelo.setText("");
            TFAno.setText("");
            TFRenavam.setText("");
            TFChassi.setText("");
            TFTipoPneu.setText("");
            CBTipoCombustivel.setSelectedItem("");
            TFTara.setText("");
            TFPesoLiquido.setText("");
            TAObservacoes.setText("");

    }//GEN-LAST:event_BInserirVeiculoActionPerformed

    private void BAtualizarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarVeiculoActionPerformed
            
            try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE veiculo SET "
                    + "placa = '"+TFPlacaVeiculo.getText()+"',"
                    + "TipoVeiculo = '"+CBTipoVeiculo.getSelectedItem()+"',"
                    + "fabricacao = '"+TFFabricante.getText()+"',"
                    + "Modelo = '"+TFModelo.getText()+"',"
                    + "Ano = '"+TFAno.getText()+"',"
                    + "Renavam = '"+TFRenavam.getText()+"',"
                    + "Chassi = '"+TFChassi.getText()+"',"
                    + "TipoPneu = '"+TFTipoPneu.getText()+"',"
                    + "TipoCombustivel = '"+CBTipoCombustivel.getSelectedItem()+"',"
                    + "Tara = '"+TFTara.getText()+"',"
                    + "PesoLiquido = '"+TFPesoLiquido.getText()+"',"
                    + "Observacao = '"+TAObservacoes.getText()+"'"
                    + "WHERE Codigo = '"+TFCodigoVeiculo.getText()+"'");
        
            TFCodigoVeiculo.setEnabled(false);
            TFPlacaVeiculo.setEnabled(false);
            CBTipoVeiculo.setEnabled(false);
            TFFabricante.setEnabled(false);
            TFModelo.setEnabled(false);
            TFAno.setEnabled(false);
            TFRenavam.setEnabled(false);
            TFChassi.setEnabled(false);
            TFTipoPneu.setEnabled(false);
            CBTipoCombustivel.setEnabled(false);
            TFTara.setEnabled(false);
            TFPesoLiquido.setEnabled(false);
            TAObservacoes.setEnabled(false);
            
            BInserirVeiculo.setEnabled(false);
            BLimparVeiculo.setEnabled(false);
            BAtualizarVeiculo.setEnabled(false);
            BExcluirVeiculo.setEnabled(false);
                        
            LCodigoVeiculo.setVisible(false);
            TFCodigoVeiculo.setVisible(false);
            
            TFCodigoVeiculo.setText("");
            TFPlacaVeiculo.setText("");
            CBTipoVeiculo.setSelectedItem("");
            TFFabricante.setText("");
            TFModelo.setText("");
            TFAno.setText("");
            TFRenavam.setText("");
            TFChassi.setText("");
            TFTipoPneu.setText("");
            CBTipoCombustivel.setSelectedItem("");
            TFTara.setText("");
            TFPesoLiquido.setText("");
            TAObservacoes.setText(""); 
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Veiculo Alterado com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Alterar Veiculo\n"+e.getMessage());
        }
            
    }//GEN-LAST:event_BAtualizarVeiculoActionPerformed

    private void BLimparVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparVeiculoActionPerformed

            TFCodigoVeiculo.setEnabled(false);
            TFPlacaVeiculo.setEnabled(false);
            CBTipoVeiculo.setEnabled(false);
            TFFabricante.setEnabled(false);
            TFModelo.setEnabled(false);
            TFAno.setEnabled(false);
            TFRenavam.setEnabled(false);
            TFChassi.setEnabled(false);
            TFTipoPneu.setEnabled(false);
            CBTipoCombustivel.setEnabled(false);
            TFTara.setEnabled(false);
            TFPesoLiquido.setEnabled(false);
            TAObservacoes.setEnabled(false);
            
            BInserirVeiculo.setEnabled(false);
            BLimparVeiculo.setEnabled(false);
            BAtualizarVeiculo.setEnabled(false);
            BExcluirVeiculo.setEnabled(false);
                        
            LCodigoVeiculo.setVisible(false);
            TFCodigoVeiculo.setVisible(false);
            
            TFCodigoVeiculo.setText("");
            TFPlacaVeiculo.setText("");
            CBTipoVeiculo.setSelectedItem("");
            TFFabricante.setText("");
            TFModelo.setText("");
            TFAno.setText("");
            TFRenavam.setText("");
            TFChassi.setText("");
            TFTipoPneu.setText("");
            CBTipoCombustivel.setSelectedItem("");
            TFTara.setText("");
            TFPesoLiquido.setText("");
            TAObservacoes.setText(""); 

    }//GEN-LAST:event_BLimparVeiculoActionPerformed

    private void BExcluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirVeiculoActionPerformed
        
        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM veiculo WHERE codigo = '"+TFCodigoVeiculo.getText()+"'");
       
            
            TFCodigoVeiculo.setEnabled(false);
            TFPlacaVeiculo.setEnabled(false);
            CBTipoVeiculo.setEnabled(false);
            TFFabricante.setEnabled(false);
            TFModelo.setEnabled(false);
            TFAno.setEnabled(false);
            TFRenavam.setEnabled(false);
            TFChassi.setEnabled(false);
            TFTipoPneu.setEnabled(false);
            CBTipoCombustivel.setEnabled(false);
            TFTara.setEnabled(false);
            TFPesoLiquido.setEnabled(false);
            TAObservacoes.setEnabled(false);
            
            BInserirVeiculo.setEnabled(false);
            BLimparVeiculo.setEnabled(false);
            BAtualizarVeiculo.setEnabled(false);
            BExcluirVeiculo.setEnabled(false);
                        
            LCodigoVeiculo.setVisible(false);
            TFCodigoVeiculo.setVisible(false);
            
            TFCodigoVeiculo.setText("");
            TFPlacaVeiculo.setText("");
            CBTipoVeiculo.setSelectedItem("");
            TFFabricante.setText("");
            TFModelo.setText("");
            TFAno.setText("");
            TFRenavam.setText("");
            TFChassi.setText("");
            TFTipoPneu.setText("");
            CBTipoCombustivel.setSelectedItem("");
            TFTara.setText("");
            TFPesoLiquido.setText("");
            TAObservacoes.setText(""); 

            
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Veiculo Excluido com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Veiculo\n"+e.getMessage());}
    }//GEN-LAST:event_BExcluirVeiculoActionPerformed

    private void BInserirDadosVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDadosVeiculoActionPerformed

            TFCodigoVeiculo.setEnabled(false);
            TFPlacaVeiculo.setEnabled(true);
            CBTipoVeiculo.setEnabled(true);
            TFFabricante.setEnabled(true);
            TFModelo.setEnabled(true);
            TFAno.setEnabled(true);
            TFRenavam.setEnabled(true);
            TFChassi.setEnabled(true);
            TFTipoPneu.setEnabled(true);
            CBTipoCombustivel.setEnabled(true);
            TFTara.setEnabled(true);
            TFPesoLiquido.setEnabled(true);
            TAObservacoes.setEnabled(true);
            
            BInserirVeiculo.setEnabled(true);
            BLimparVeiculo.setEnabled(true);
            BAtualizarVeiculo.setEnabled(false);
            BExcluirVeiculo.setEnabled(false);
                        
            LCodigoVeiculo.setVisible(false);
            TFCodigoVeiculo.setVisible(false);
            
            TFCodigoVeiculo.setText("");
            TFPlacaVeiculo.setText("");
            CBTipoVeiculo.setSelectedItem("");
            TFFabricante.setText("");
            TFModelo.setText("");
            TFAno.setText("");
            TFRenavam.setText("");
            TFChassi.setText("");
            TFTipoPneu.setText("");
            CBTipoCombustivel.setSelectedItem("");
            TFTara.setText("");
            TFPesoLiquido.setText("");
            TAObservacoes.setText(""); 

    }//GEN-LAST:event_BInserirDadosVeiculoActionPerformed

    private void BBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarVeiculoActionPerformed

        PesquisaVeiculo PV = new PesquisaVeiculo(conn,
            TFPlacaVeiculo.getText(),
            (String)CBTipoVeiculo.getSelectedItem(),
            TFFabricante.getText(),
            TFModelo.getText(),
            TFAno.getText(),
            TFRenavam.getText(),
            TFChassi.getText(),
            TFTipoPneu.getText(),
            (String)CBTipoCombustivel.getSelectedItem(),
            TFTara.getText(),
            TFPesoLiquido.getText(),
            TAObservacoes.getText(),
            this);

        PV.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(CadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadVeiculo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarVeiculo;
    public javax.swing.JButton BBuscarVeiculo;
    public javax.swing.JButton BExcluirVeiculo;
    public javax.swing.JButton BInserirDadosVeiculo;
    public javax.swing.JButton BInserirVeiculo;
    public javax.swing.JButton BLimparVeiculo;
    public javax.swing.JButton BVoltarVeiculo;
    public javax.swing.JComboBox CBTipoCombustivel;
    public javax.swing.JComboBox CBTipoVeiculo;
    public javax.swing.JLabel LCodigoVeiculo;
    public javax.swing.JTextArea TAObservacoes;
    public javax.swing.JTextField TFAno;
    public javax.swing.JTextField TFChassi;
    public javax.swing.JTextField TFCodigoVeiculo;
    public javax.swing.JTextField TFFabricante;
    public javax.swing.JTextField TFModelo;
    public javax.swing.JTextField TFPesoLiquido;
    public javax.swing.JTextField TFPlacaVeiculo;
    public javax.swing.JTextField TFRenavam;
    public javax.swing.JTextField TFTara;
    public javax.swing.JTextField TFTipoPneu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
