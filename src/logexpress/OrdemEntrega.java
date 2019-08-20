package logexpress;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OrdemEntrega extends javax.swing.JFrame {

    public OrdemEntrega() {
        initComponents();
    }
    
     Connection conn;
    
    public OrdemEntrega(Connection conn) {
        initComponents();
        this.conn = conn;
        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo.setEnabled(false);
                        CBTipoVeiculo.setEnabled(false);
                        CBFabricante.setEnabled(false);
                        TFModeloVeiculo.setEnabled(false);
                        TFAnoVeiculo.setEnabled(false);
                        TFRenavam.setEnabled(false);
                        TFChassi.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                        
                        TFNomeCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);
                        
                        LCodigoOrdemEntrega.setVisible(false);
                        TFCodigoOrdemEntrega.setVisible(false);
                        TFTipoMercadoria.setEnabled(false);
                        TFQuantidadeMercadoria.setEnabled(false);
                        TFEspecieMercadoria.setEnabled(false);
                        TFPesoMercadoria.setEnabled(false);
                        TFMetroCubico.setEnabled(false);
                        TFNotaFiscal.setEnabled(false);
                        TAObservacoes.setEnabled(false);
                        
                        BBuscaCliente.setEnabled(false);
                        BInserirOrdemEntrega.setEnabled(false);                        
                        BLimparOrdemEntrega.setEnabled(false);
                        BAtualizarOrdemEntrega.setEnabled(false);
                        BExcluirOrdemEntrega.setEnabled(false);
                        BBuscarDestinatario.setEnabled(false);
                        BBuscarVeiculo.setEnabled(false);
                        BGPS.setEnabled(false);
                        BImprimir.setEnabled(false);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFNomeDestinatario = new javax.swing.JTextField();
        TFCNPJDestinatario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TFEnderecoDestinatario = new javax.swing.JTextField();
        TFNumEndDestinatario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TFBairroDestinatario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TFCidadeDestinatario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CBEstadoDestinatario = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        BBuscarDestinatario = new javax.swing.JButton();
        LCodigoDestinatario = new javax.swing.JLabel();
        TFCodigoDestinatario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BExcluirOrdemEntrega = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFNomeCliente = new javax.swing.JTextField();
        TFCNPJCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFEnderecoCliente = new javax.swing.JTextField();
        TFNumEndCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFBairroCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TFCidadeCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CBEstadoCliente = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        BBuscaCliente = new javax.swing.JButton();
        LCodigoCliente = new javax.swing.JLabel();
        TFCodigoCliente = new javax.swing.JTextField();
        BInserirDadosOrdemEntrega = new javax.swing.JButton();
        BBuscarOrdemEntrega = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        TFPlacaVeiculo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        TFRenavam = new javax.swing.JTextField();
        TFChassi = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        CBTipoVeiculo = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        CBFabricante = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        TFModeloVeiculo = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        TFAnoVeiculo = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        BBuscarVeiculo = new javax.swing.JButton();
        LCodigoVeiculo = new javax.swing.JLabel();
        TFCodigoVeiculo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TFTipoMercadoria = new javax.swing.JTextField();
        TFQuantidadeMercadoria = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TFNotaFiscal = new javax.swing.JTextField();
        TFPesoMercadoria = new javax.swing.JTextField();
        TFEspecieMercadoria = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        TFMetroCubico = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        LCodigoOrdemEntrega = new javax.swing.JLabel();
        TFCodigoOrdemEntrega = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservacoes = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        BImprimir = new javax.swing.JButton();
        BAtualizarOrdemEntrega = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        BInserirOrdemEntrega = new javax.swing.JButton();
        BGPS = new javax.swing.JButton();
        BLimparOrdemEntrega = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(192, 240, 240));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("Destinatário");

        jLabel12.setText("Nome / Razão Social");

        jLabel14.setText("CNPJ / CPF");

        jLabel15.setText("Endereço");

        jLabel16.setText("Nº");

        jLabel17.setText("Bairro");

        jLabel18.setText("Cidade");

        CBEstadoDestinatario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF", "AC", "AL", " AP", " AM", " BA", " CE", " DF", " ES", " GO", " MA", " MT", " MS", " MG", " PA", " PB", " PR", " PE", " PI", " RJ", " RN", " RS", " RO", " RR", " SC", " SP", " SE", " TO", " " }));
        CBEstadoDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEstadoDestinatarioActionPerformed(evt);
            }
        });

        jLabel19.setText("Estado");

        BBuscarDestinatario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarDestinatario.setText("Buscar Destinatário");
        BBuscarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarDestinatarioActionPerformed(evt);
            }
        });

        LCodigoDestinatario.setText("Codigo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNomeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCNPJDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(468, 468, 468))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(LCodigoDestinatario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCodigoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(BBuscarDestinatario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEnderecoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNumEndDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFBairroDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCidadeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBEstadoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LCodigoDestinatario)
                            .addComponent(TFCodigoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBuscarDestinatario)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TFNomeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(TFCNPJDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(TFEnderecoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFNumEndDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)
                        .addComponent(CBEstadoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFCidadeDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFBairroDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Ordem Entrega");

        BExcluirOrdemEntrega.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirOrdemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BExcluirOrdemEntrega.setText("Excluir");
        BExcluirOrdemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirOrdemEntregaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 240, 240));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Dados Cliente");

        jLabel3.setText("Cliente");

        TFNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setText("CNPJ / CPF");

        jLabel6.setText("Endereço");

        jLabel7.setText("Nº");

        jLabel8.setText("Bairro");

        TFCidadeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCidadeClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Cidade");

        CBEstadoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF", "AC", "AL", " AP", " AM", " BA", " CE", " DF", " ES", " GO", " MA", " MT", " MS", " MG", " PA", " PB", " PR", " PE", " PI", " RJ", " RN", " RS", " RO", " RR", " SC", " SP", " SE", " TO", " " }));

        jLabel10.setText("Estado");

        BBuscaCliente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscaCliente.setText("Buscar Cliente");
        BBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscaClienteActionPerformed(evt);
            }
        });

        LCodigoCliente.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNumEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5)
                                .addComponent(TFNomeCliente))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(LCodigoCliente)
                        .addGap(18, 18, 18)
                        .addComponent(TFCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCNPJCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BBuscaCliente)
                        .addComponent(TFCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LCodigoCliente))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TFCNPJCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TFNumEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TFBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(TFCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(CBEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BInserirDadosOrdemEntrega.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BInserirDadosOrdemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionarDados.png"))); // NOI18N
        BInserirDadosOrdemEntrega.setText("Inserir Dados");
        BInserirDadosOrdemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirDadosOrdemEntregaActionPerformed(evt);
            }
        });

        BBuscarOrdemEntrega.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BBuscarOrdemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        BBuscarOrdemEntrega.setText("Buscar Ordem Entrega");
        BBuscarOrdemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarOrdemEntregaActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(192, 240, 240));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel30.setText("Placa");

        jLabel31.setText("Renavam");

        jLabel32.setText("Chassi");

        CBTipoVeiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carro", "Caminhão", "Moto", "Carreta", "Caminhonete", " " }));

        jLabel33.setText("Tipo de Veículo");

        CBFabricante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Volkswagem", "Scania", "GM", "Fiat", "Mercedes" }));

        jLabel34.setText("Fabricante");

        jLabel35.setText("Modelo");

        jLabel36.setText("Ano");

        jLabel37.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Veículo");

        BBuscarVeiculo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        BBuscarVeiculo.setText("Buscar Veículo");
        BBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarVeiculoActionPerformed(evt);
            }
        });

        LCodigoVeiculo.setText("Codigo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(266, 266, 266)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addGap(0, 0, 0)
                                .addComponent(CBFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(LCodigoVeiculo)
                                .addGap(103, 103, 103)
                                .addComponent(TFCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BBuscarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFAnoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LCodigoVeiculo)
                            .addComponent(TFCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BBuscarVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(TFAnoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(TFRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(TFChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(192, 240, 240));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel20.setText("Mercadoria");

        jLabel21.setText("Tipo de Mercadoria");

        jLabel23.setText("Quantidade");

        jLabel26.setText("Espécie");

        jLabel27.setText("Peso/Kg");

        jLabel28.setText("M3/L");

        jLabel22.setText("Nota Fiscal");

        LCodigoOrdemEntrega.setText("Codigo");

        TAObservacoes.setColumns(20);
        TAObservacoes.setRows(5);
        TAObservacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(TAObservacoes);

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel24.setText("Observações");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTipoMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFQuantidadeMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(LCodigoOrdemEntrega)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCodigoOrdemEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEspecieMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFMetroCubico, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFPesoMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LCodigoOrdemEntrega)
                        .addComponent(TFCodigoOrdemEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(TFTipoMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(TFQuantidadeMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(TFEspecieMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFMetroCubico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFPesoMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        BImprimir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Printer-icon.png"))); // NOI18N
        BImprimir.setText("Imprimir");
        BImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImprimirActionPerformed(evt);
            }
        });

        BAtualizarOrdemEntrega.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarOrdemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        BAtualizarOrdemEntrega.setText("Atualizar");
        BAtualizarOrdemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarOrdemEntregaActionPerformed(evt);
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

        BInserirOrdemEntrega.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BInserirOrdemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        BInserirOrdemEntrega.setText("Gravar");
        BInserirOrdemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirOrdemEntregaActionPerformed(evt);
            }
        });

        BGPS.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BGPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Google-Maps-icon.png"))); // NOI18N
        BGPS.setText("GPS");
        BGPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGPSActionPerformed(evt);
            }
        });

        BLimparOrdemEntrega.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparOrdemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        BLimparOrdemEntrega.setText("Limpar");
        BLimparOrdemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparOrdemEntregaActionPerformed(evt);
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
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BInserirDadosOrdemEntrega)
                        .addGap(18, 18, 18)
                        .addComponent(BBuscarOrdemEntrega))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BAtualizarOrdemEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BInserirOrdemEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLimparOrdemEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BExcluirOrdemEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BGPS, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BBuscarOrdemEntrega)
                        .addComponent(BInserirDadosOrdemEntrega)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BInserirOrdemEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizarOrdemEntrega)
                        .addGap(18, 18, 18)
                        .addComponent(BLimparOrdemEntrega)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluirOrdemEntrega)
                        .addGap(18, 18, 18)
                        .addComponent(BImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(BGPS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        this.dispose(); 
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscaClienteActionPerformed

        ConsultaCliente CC = new ConsultaCliente(conn, 
 
                TFNomeCliente.getText(), 
                TFCNPJCliente.getText(), 
                TFEnderecoCliente.getText(), 
                TFNumEndCliente.getText(), 
                TFBairroCliente.getText(), 
                TFCidadeCliente.getText(), 
                (String) CBEstadoCliente.getSelectedItem(), 
                this);
        CC.setVisible(true);

    }//GEN-LAST:event_BBuscaClienteActionPerformed

    private void BBuscarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarDestinatarioActionPerformed
      
        ConsultaDestinatario CD = new ConsultaDestinatario(conn, 
                TFNomeDestinatario.getText(), 
                TFCNPJDestinatario.getText(), 
                TFEnderecoDestinatario.getText(), 
                TFNumEndDestinatario.getText(), 
                TFBairroDestinatario.getText(), 
                TFCidadeDestinatario.getText(), 
                (String) CBEstadoDestinatario.getSelectedItem(), 
                
                this);
        CD.setVisible(true);

    }//GEN-LAST:event_BBuscarDestinatarioActionPerformed

    private void BBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarVeiculoActionPerformed
       
        ConsultaVeiculo CV = new ConsultaVeiculo(conn, 
                TFPlacaVeiculo.getText(),
                (String) CBTipoVeiculo.getSelectedItem() ,
                (String) CBFabricante.getSelectedItem(), 
                TFModeloVeiculo.getText(), 
                TFAnoVeiculo.getText(), 
                TFRenavam.getText(), 
                TFChassi.getText(), this);
        CV.setVisible(true);

    }//GEN-LAST:event_BBuscarVeiculoActionPerformed

    private void BInserirOrdemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirOrdemEntregaActionPerformed

         if (!TFTipoMercadoria.getText().equals("") &&  !TFQuantidadeMercadoria.getText().equals("") &&  !TFEspecieMercadoria.getText().equals("")){
        
           try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO ordemEntrega VALUES (null,?,?,?,?,?,?,?,?,?,?)");

            pstm.setString(1, TFTipoMercadoria.getText());
            pstm.setString(2, TFQuantidadeMercadoria.getText());
            pstm.setString(3, TFEspecieMercadoria.getText());
            pstm.setString(4, TFPesoMercadoria.getText());
            pstm.setString(5, TFMetroCubico.getText());
            pstm.setString(6, TFNotaFiscal.getText());
            pstm.setString(7, TAObservacoes.getText()); 
            pstm.setInt(8, Integer.parseInt(TFCodigoCliente.getText()));
            pstm.setInt(9, Integer.parseInt(TFCodigoDestinatario.getText()));
            pstm.setInt(10, Integer.parseInt(TFCodigoVeiculo.getText())); 
            
            
           
            
            
            
            
                        TFNomeCliente.setText("");
                        TFCNPJCliente.setText("");
                        TFEnderecoCliente.setText("");
                        TFNumEndCliente.setText("");
                        TFBairroCliente.setText("");
                        TFCidadeCliente.setText("");
                        CBEstadoCliente.setSelectedItem("");
                        
                        TFNomeDestinatario.setText("");
                        TFCNPJDestinatario.setText("");
                        TFEnderecoDestinatario.setText("");
                        TFNumEndDestinatario.setText("");
                        TFBairroDestinatario.setText("");
                        TFCidadeDestinatario.setText("");
                        CBEstadoDestinatario.setSelectedItem("");
                        
                        TFCodigoVeiculo.setText("");
                        TFPlacaVeiculo.setText("");
                        CBTipoVeiculo.setSelectedItem("");
                        CBFabricante.setSelectedItem("");
                        TFModeloVeiculo.setText("");
                        TFAnoVeiculo.setText("");
                        TFRenavam.setText("");
                        TFChassi.setText("");
                        TAObservacoes.setText(""); 
                        
                        TFTipoMercadoria.setText("");
                        TFQuantidadeMercadoria.setText("");
                        TFEspecieMercadoria.setText("");
                        TFPesoMercadoria.setText("");
                        TFMetroCubico.setText("");
                        TFNotaFiscal.setText("");
                        TAObservacoes.setText("");

        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo.setEnabled(false);
                        CBTipoVeiculo.setEnabled(false);
                        CBFabricante.setEnabled(false);
                        TFModeloVeiculo.setEnabled(false);
                        TFAnoVeiculo.setEnabled(false);
                        TFRenavam.setEnabled(false);
                        TFChassi.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                        
                        TFNomeCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);
                        
                        LCodigoOrdemEntrega.setVisible(false);
                        TFCodigoOrdemEntrega.setVisible(false);
                        TFTipoMercadoria.setEnabled(false);
                        TFQuantidadeMercadoria.setEnabled(false);
                        TFEspecieMercadoria.setEnabled(false);
                        TFPesoMercadoria.setEnabled(false);
                        TFMetroCubico.setEnabled(false);
                        TFNotaFiscal.setVisible(false);
                        TAObservacoes.setVisible(false);
                        
                        BBuscaCliente.setEnabled(false);
                        BInserirOrdemEntrega.setEnabled(false);                        
                        BLimparOrdemEntrega.setEnabled(false);
                        BAtualizarOrdemEntrega.setEnabled(false);
                        BExcluirOrdemEntrega.setEnabled(false);
                        BBuscarDestinatario.setEnabled(false);
                        BBuscarVeiculo.setEnabled(false);

            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Ordem Entrega Cadastrada com Sucesso!");
            
        }
        catch (SQLException e)
        {
            System.out.println("Error ao consultar Emprestimo: "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Atenção!!!\n\nErro ao inserir Ordem Entrega!!"+e.getMessage());
        }
        
         }
         else
        {
            
            JOptionPane.showMessageDialog(null, "Entre com os Dados da Ordem Entrega para efetuar o cadastro!!");
        }
        
       
        
       

    }//GEN-LAST:event_BInserirOrdemEntregaActionPerformed

    private void TFCidadeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCidadeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCidadeClienteActionPerformed

    private void BInserirDadosOrdemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirDadosOrdemEntregaActionPerformed
                        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo.setEnabled(false);
                        CBTipoVeiculo.setEnabled(false);
                        CBFabricante.setEnabled(false);
                        TFModeloVeiculo.setEnabled(false);
                        TFAnoVeiculo.setEnabled(false);
                        TFRenavam.setEnabled(false);
                        TFChassi.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                        
                        TFNomeCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);
                        
                        LCodigoOrdemEntrega.setVisible(false);
                        TFCodigoOrdemEntrega.setVisible(false);
                        TFTipoMercadoria.setEnabled(true);
                        TFQuantidadeMercadoria.setEnabled(true);
                        TFEspecieMercadoria.setEnabled(true);
                        TFPesoMercadoria.setEnabled(true);
                        TFMetroCubico.setEnabled(true);
                        TFNotaFiscal.setEnabled(true);
                        TAObservacoes.setEnabled(true);
                        
                        BBuscaCliente.setEnabled(true);
                        BInserirOrdemEntrega.setEnabled(true);                        
                        BLimparOrdemEntrega.setEnabled(true);
                        BAtualizarOrdemEntrega.setEnabled(false);
                        BExcluirOrdemEntrega.setEnabled(false);
                        BBuscarDestinatario.setEnabled(true);
                        BBuscarVeiculo.setEnabled(true);
                        BGPS.setEnabled(true);
                        BImprimir.setEnabled(true);
 

    }//GEN-LAST:event_BInserirDadosOrdemEntregaActionPerformed

    private void BBuscarOrdemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarOrdemEntregaActionPerformed
        
          PesquisaOrdemEntrega POE = new PesquisaOrdemEntrega(conn,
            TFNomeCliente.getText(),
            TFCNPJCliente.getText(),
            TFEnderecoCliente.getText(),
            TFNumEndCliente.getText(),
            TFBairroCliente.getText(),
            TFCidadeCliente.getText(),
            (String)CBEstadoCliente.getSelectedItem(),
                  
            TFNomeDestinatario.getText(),
            TFCNPJDestinatario.getText(),
            TFEnderecoDestinatario.getText(),
            TFNumEndDestinatario.getText(),
            TFBairroDestinatario.getText(),
            TFCidadeDestinatario.getText(),
            (String)CBEstadoDestinatario.getSelectedItem(),
                  
            TFPlacaVeiculo.getText(),
            (String)CBTipoVeiculo.getSelectedItem(),
            (String)CBFabricante.getSelectedItem(),
            TFModeloVeiculo.getText(),
            TFAnoVeiculo.getText(),
            TFRenavam.getText(),
            TFChassi.getText(),
                  
            TFTipoMercadoria.getText(),
            TFQuantidadeMercadoria.getText(),
            TFEspecieMercadoria.getText(),
            TFPesoMercadoria.getText(),
            TFMetroCubico.getText(),
            TFNotaFiscal.getText(),
            TAObservacoes.getText(), 

                  this

          );
        POE.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarOrdemEntregaActionPerformed

    private void BLimparOrdemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparOrdemEntregaActionPerformed
                        
                        TFNomeCliente.setText("");
                        TFCNPJCliente.setText("");
                        TFEnderecoCliente.setText("");
                        TFNumEndCliente.setText("");
                        TFBairroCliente.setText("");
                        TFCidadeCliente.setText("");
                        CBEstadoCliente.setSelectedItem("");
                        
                        TFNomeDestinatario.setText("");
                        TFCNPJDestinatario.setText("");
                        TFEnderecoDestinatario.setText("");
                        TFNumEndDestinatario.setText("");
                        TFBairroDestinatario.setText("");
                        TFCidadeDestinatario.setText("");
                        CBEstadoDestinatario.setSelectedItem("");
                        
                        TFCodigoVeiculo.setText("");
                        TFPlacaVeiculo.setText("");
                        CBTipoVeiculo.setSelectedItem("");
                        CBFabricante.setSelectedItem("");
                        TFModeloVeiculo.setText("");
                        TFAnoVeiculo.setText("");
                        TFRenavam.setText("");
                        TFChassi.setText("");
                        TAObservacoes.setText(""); 
                        
                        TFTipoMercadoria.setText("");
                        TFQuantidadeMercadoria.setText("");
                        TFEspecieMercadoria.setText("");
                        TFPesoMercadoria.setText("");
                        TFMetroCubico.setText("");
                        TFNotaFiscal.setText("");
                        TAObservacoes.setText("");

        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo.setEnabled(false);
                        CBTipoVeiculo.setEnabled(false);
                        CBFabricante.setEnabled(false);
                        TFModeloVeiculo.setEnabled(false);
                        TFAnoVeiculo.setEnabled(false);
                        TFRenavam.setEnabled(false);
                        TFChassi.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        
                        TFCodigoVeiculo.setVisible(false);
                        
                        TFNomeCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);
                        
                        LCodigoOrdemEntrega.setVisible(false);
                        TFCodigoOrdemEntrega.setVisible(false);
                        TFTipoMercadoria.setEnabled(false);
                        TFQuantidadeMercadoria.setEnabled(false);
                        TFEspecieMercadoria.setEnabled(false);
                        TFPesoMercadoria.setEnabled(false);
                        TFMetroCubico.setEnabled(false);
                        TFNotaFiscal.setVisible(true);
                        TFNotaFiscal.setEnabled(false);
                        TAObservacoes.setVisible(false);
                        
                        BBuscaCliente.setEnabled(false);
                        BInserirOrdemEntrega.setEnabled(false);                        
                        BLimparOrdemEntrega.setEnabled(false);
                        BAtualizarOrdemEntrega.setEnabled(false);
                        BExcluirOrdemEntrega.setEnabled(false);
                        BBuscarDestinatario.setEnabled(false);
                        BBuscarVeiculo.setEnabled(false);
 


// TODO add your handling code here:
    }//GEN-LAST:event_BLimparOrdemEntregaActionPerformed

    private void BAtualizarOrdemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarOrdemEntregaActionPerformed

        try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE ordemEntrega SET "
                    + "tipoMercadoria = '"+TFTipoMercadoria.getText()+"',"
                    + "QuantMercadoria = '"+TFQuantidadeMercadoria.getText()+"',"
                    + "EspecieMerc = '"+TFEspecieMercadoria.getText()+"',"
                    + "Peso = '"+TFPesoMercadoria.getText()+"',"
                    + "MetroCubico = '"+TFMetroCubico.getText()+"',"
                    + "Notafiscal = '"+TFNotaFiscal.getText()+"',"
                    + "Observacao = '"+TAObservacoes.getText()+"'"
                    + "WHERE Codigo = '"+TFCodigoOrdemEntrega.getText()+"'");
            
                        TFNomeCliente.setText("");
                        TFCNPJCliente.setText("");
                        TFEnderecoCliente.setText("");
                        TFNumEndCliente.setText("");
                        TFBairroCliente.setText("");
                        TFCidadeCliente.setText("");
                        CBEstadoCliente.setSelectedItem("");
                        
                        TFNomeDestinatario.setText("");
                        TFCNPJDestinatario.setText("");
                        TFEnderecoDestinatario.setText("");
                        TFNumEndDestinatario.setText("");
                        TFBairroDestinatario.setText("");
                        TFCidadeDestinatario.setText("");
                        CBEstadoDestinatario.setSelectedItem("");
                        
                        TFCodigoVeiculo.setText("");
                        TFPlacaVeiculo.setText("");
                        CBTipoVeiculo.setSelectedItem("");
                        CBFabricante.setSelectedItem("");
                        TFModeloVeiculo.setText("");
                        TFAnoVeiculo.setText("");
                        TFRenavam.setText("");
                        TFChassi.setText("");
                        TAObservacoes.setText(""); 
                        
                        TFTipoMercadoria.setText("");
                        TFQuantidadeMercadoria.setText("");
                        TFEspecieMercadoria.setText("");
                        TFPesoMercadoria.setText("");
                        TFMetroCubico.setText("");
                        TFNotaFiscal.setText("");
                        TAObservacoes.setText("");

        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo.setEnabled(false);
                        CBTipoVeiculo.setEnabled(false);
                        CBFabricante.setEnabled(false);
                        TFModeloVeiculo.setEnabled(false);
                        TFAnoVeiculo.setEnabled(false);
                        TFRenavam.setEnabled(false);
                        TFChassi.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                        
                        TFNomeCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);
                        
                        LCodigoOrdemEntrega.setVisible(false);
                        TFCodigoOrdemEntrega.setVisible(false);
                        TFTipoMercadoria.setEnabled(false);
                        TFQuantidadeMercadoria.setEnabled(false);
                        TFEspecieMercadoria.setEnabled(false);
                        TFPesoMercadoria.setEnabled(false);
                        TFMetroCubico.setEnabled(false);
                        TFNotaFiscal.setVisible(true);
                        TFNotaFiscal.setEnabled(false);
                        TAObservacoes.setVisible(false);
                        
                        BBuscaCliente.setEnabled(false);
                        BInserirOrdemEntrega.setEnabled(false);                        
                        BLimparOrdemEntrega.setEnabled(false);
                        BAtualizarOrdemEntrega.setEnabled(false);
                        BExcluirOrdemEntrega.setEnabled(false);
                        BBuscarDestinatario.setEnabled(false);
                        BBuscarVeiculo.setEnabled(false);

            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Ordem de Entrega Alterado com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Alterar Veiculo\n"+e.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_BAtualizarOrdemEntregaActionPerformed

    private void BExcluirOrdemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirOrdemEntregaActionPerformed
      
        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM ordemEntrega WHERE codigo = '"+TFCodigoOrdemEntrega.getText()+"'");
            
                        TFNomeCliente.setText("");
                        TFCNPJCliente.setText("");
                        TFEnderecoCliente.setText("");
                        TFNumEndCliente.setText("");
                        TFBairroCliente.setText("");
                        TFCidadeCliente.setText("");
                        CBEstadoCliente.setSelectedItem("");
                        
                        TFNomeDestinatario.setText("");
                        TFCNPJDestinatario.setText("");
                        TFEnderecoDestinatario.setText("");
                        TFNumEndDestinatario.setText("");
                        TFBairroDestinatario.setText("");
                        TFCidadeDestinatario.setText("");
                        CBEstadoDestinatario.setSelectedItem("");
                        
                        TFCodigoVeiculo.setText("");
                        TFPlacaVeiculo.setText("");
                        CBTipoVeiculo.setSelectedItem("");
                        CBFabricante.setSelectedItem("");
                        TFModeloVeiculo.setText("");
                        TFAnoVeiculo.setText("");
                        TFRenavam.setText("");
                        TFChassi.setText("");
                        TAObservacoes.setText(""); 
                        
                        TFTipoMercadoria.setText("");
                        TFQuantidadeMercadoria.setText("");
                        TFEspecieMercadoria.setText("");
                        TFPesoMercadoria.setText("");
                        TFMetroCubico.setText("");
                        TFNotaFiscal.setText("");
                        TAObservacoes.setText("");

        
                        TFCodigoDestinatario.setEnabled(false);
                        TFNomeDestinatario.setEnabled(false);
                        TFCNPJDestinatario.setEnabled(false);
                        TFEnderecoDestinatario.setEnabled(false);
                        TFNumEndDestinatario.setEnabled(false);
                        TFBairroDestinatario.setEnabled(false);
                        TFCidadeDestinatario.setEnabled(false);
                        CBEstadoDestinatario.setEnabled(false);
                        LCodigoDestinatario.setVisible(false);
                        TFCodigoDestinatario.setVisible(false);
                        
                        TFCodigoVeiculo.setEnabled(false);
                        TFPlacaVeiculo.setEnabled(false);
                        CBTipoVeiculo.setEnabled(false);
                        CBFabricante.setEnabled(false);
                        TFModeloVeiculo.setEnabled(false);
                        TFAnoVeiculo.setEnabled(false);
                        TFRenavam.setEnabled(false);
                        TFChassi.setEnabled(false);
                        LCodigoVeiculo.setVisible(false);
                        TFCodigoVeiculo.setVisible(false);
                        
                        TFNomeCliente.setEnabled(false);
                        TFCNPJCliente.setEnabled(false);
                        TFEnderecoCliente.setEnabled(false);
                        TFNumEndCliente.setEnabled(false);
                        TFBairroCliente.setEnabled(false);
                        TFCidadeCliente.setEnabled(false);
                        CBEstadoCliente.setEnabled(false);
                        LCodigoCliente.setVisible(false);
                        TFCodigoCliente.setVisible(false);
                        
                        LCodigoOrdemEntrega.setVisible(false);
                        TFCodigoOrdemEntrega.setVisible(false);
                        TFTipoMercadoria.setEnabled(false);
                        TFQuantidadeMercadoria.setEnabled(false);
                        TFEspecieMercadoria.setEnabled(false);
                        TFPesoMercadoria.setEnabled(false);
                        TFMetroCubico.setEnabled(false);
                        TFNotaFiscal.setVisible(false);
                        TAObservacoes.setVisible(false);
                        
                        BBuscaCliente.setEnabled(false);
                        BInserirOrdemEntrega.setEnabled(false);                        
                        BLimparOrdemEntrega.setEnabled(false);
                        BAtualizarOrdemEntrega.setEnabled(false);
                        BExcluirOrdemEntrega.setEnabled(false);
                        BBuscarDestinatario.setEnabled(false);
                        BBuscarVeiculo.setEnabled(false);
            
            pstm.executeUpdate();
            pstm.close();
            
        JOptionPane.showMessageDialog(null, "Veiculo Excluido com Sucesso!");

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Veiculo\n"+e.getMessage());}

// TODO add your handling code here:
    }//GEN-LAST:event_BExcluirOrdemEntregaActionPerformed

    private void CBEstadoDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEstadoDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBEstadoDestinatarioActionPerformed

    private void BImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImprimirActionPerformed

            String NomeCliente = TFNomeCliente.getText();
            String CNPJCLiente = TFCNPJCliente.getText();
            String EndCliente = TFEnderecoCliente.getText();
            String NumEndCliente = TFNumEndCliente.getText();
            String BairroCliente = TFBairroCliente.getText();
            String CidadeCliente = TFCidadeCliente.getText();
            String EstadoCliene = CBEstadoCliente.getSelectedItem().toString();
            String NomeDest = TFNomeDestinatario.getText();
            String CNPJDest = TFCNPJDestinatario.getText();
            String EndDest = TFEnderecoDestinatario.getText();
            String NumEndDest = TFNumEndDestinatario.getText();
            String BairroDest = TFBairroDestinatario.getText();
            String CidadeDest = TFCidadeDestinatario.getText();
            String EstadoDest = CBEstadoDestinatario.getSelectedItem().toString();
            String Placa = TFPlacaVeiculo.getText();
            String TipoVeiculo = CBTipoVeiculo.getSelectedItem().toString();
            String Fabricante = CBFabricante.getSelectedItem().toString();
            String Modelo = TFModeloVeiculo.getText();
            String Ano = TFAnoVeiculo.getText();
            String Renavam = TFRenavam.getText();
            String Chassi = TFChassi.getText();
            String TipoMercadoria = TFTipoMercadoria.getText();
            String Quantidade = TFQuantidadeMercadoria.getText();
            String Especie = TFEspecieMercadoria.getText();
            String MetroCubico = TFMetroCubico.getText();
            String Peso = TFPesoMercadoria.getText();
            String NotaFiscal = TFNotaFiscal.getText();
            String Observacao = TAObservacoes.getText();


                Document document = new Document(PageSize.A4, 25, 25, 25, 25);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(NotaFiscal+".pdf"));
        
            document.open();

            
            Font font10 = new Font(Font.TIMES_ROMAN,12);
            Font font8 = new Font(Font.TIMES_ROMAN,12);
            Font font8Bold = new Font(Font.TIMES_ROMAN,14,Font.BOLD);
            Font font12Bold = new Font(Font.TIMES_ROMAN,10,Font.BOLD);
            Font font14Bold = new Font(Font.TIMES_ROMAN,16,Font.BOLD);
            Font font18 = new Font(Font.TIMES_ROMAN,18,Font.BOLDITALIC);
            
            Image Img = Image.getInstance("src/Imagens/icone_Relatorio.png");
            Img.setAlignment(Element.ALIGN_CENTER);

            PdfPTable Tabela = new PdfPTable(5);
            PdfPCell Cabecalho = new PdfPCell(new Paragraph("ORDEM DE ENTREGA DE MERCADORIA",font18));
            Tabela.addCell(Img);
            Cabecalho.setBackgroundColor(Color.lightGray);
            Cabecalho.setColspan(5);
            Cabecalho.setHorizontalAlignment(Element.ALIGN_CENTER);
            Cabecalho.setVerticalAlignment(Element.ALIGN_MIDDLE);
            Tabela.addCell(Cabecalho);
            document.add(Tabela);
            
  
            Paragraph P1 = new Paragraph("\nLOG EXPRESS\n\n"
                    + "SISTEMA DE GERENCIAMENTO DE TRANSPORTES RODOVIÁRIOS\n"
                    + "WWW.LOGEXPRESS.COM.BR   /   ATENDIMENTO@LOGEXPRESS.COM.BR\n\n",font8Bold);  
            P1.setAlignment(Element.ALIGN_CENTER);
            document.add(P1); 
            
            
            PdfPTable Tabela1 = new PdfPTable(5);            
            PdfPCell Cliente = new PdfPCell(new Paragraph("DADOS DO CLIENTE",font14Bold));                       
            Cliente.setBackgroundColor(Color.lightGray);
            Cliente.setColspan(5);
            Cliente.setHorizontalAlignment(Element.ALIGN_CENTER);
            Cliente.setVerticalAlignment(Element.ALIGN_MIDDLE);
            Tabela1.addCell(Cliente);
            document.add(Tabela1);
            Paragraph P7 = new Paragraph("\nCLIENTE:   "+NomeCliente+"           CNPJ:   "+CNPJCLiente+"\n"
                                       + "ENDEREÇO:   "+EndCliente+"           Nº:   "+NumEndCliente+"\n"
                                       + "BAIRRO:   "+BairroCliente+"          CIDADE:   "+CidadeCliente+"          ESTADO:   "+EstadoCliene+"\n\n",font10);  
            P7.setSpacingAfter(15);
            document.add(P7);

            
            PdfPTable Tabela2 = new PdfPTable(5);            
            PdfPCell Veiculo = new PdfPCell(new Paragraph("DADOS DO VEICULO",font14Bold));                    
            Veiculo.setBackgroundColor(Color.lightGray);
            Veiculo.setColspan(5);
            Veiculo.setHorizontalAlignment(Element.ALIGN_CENTER);
            Veiculo.setVerticalAlignment(Element.ALIGN_MIDDLE);
            Tabela2.addCell(Veiculo);
            document.add(Tabela2);
            Paragraph PV = new Paragraph("\nMODELO DO VEICULO:   "+Modelo+"          PLACA:   "+Placa+"\n"
                                       + "TIPO DE VEÍCULO:   "+TipoVeiculo+"          FABRICANTE:   "+Fabricante+"\n"
                                       + "ANO:   "+Ano+"          RENAVAM:   "+Renavam+"          CHASSI:   "+Chassi+"\n\n",font10);  
            PV.setSpacingAfter(15);
            document.add(PV);
            
            
            PdfPTable Tabela3 = new PdfPTable(5);            
            PdfPCell Destinatario = new PdfPCell(new Paragraph("DADOS DO DESTINATARIO",font14Bold));                    
            Destinatario.setBackgroundColor(Color.lightGray);
            Destinatario.setColspan(5);
            Destinatario.setHorizontalAlignment(Element.ALIGN_CENTER);
            Destinatario.setVerticalAlignment(Element.ALIGN_MIDDLE);
            Tabela3.addCell(Destinatario);
            document.add(Tabela3);
            Paragraph PD = new Paragraph("\nNOME DESTINATARIO:   "+NomeDest+"          CPF/CNPJ:   "+CNPJDest+"\n"
                                       + "ENDEREÇO:   "+EndDest+"          Nº:   "+NumEndDest+"         BAIRRO:   "+BairroDest+"\n"
                                       + "CIDADE:   "+CidadeDest+"          ESTADO:   "+EstadoDest+"\n\n",font10);  
            PD.setSpacingAfter(15);
            document.add(PD);
            
            
            PdfPTable Tabela4 = new PdfPTable(5);            
            PdfPCell Mercadoria = new PdfPCell(new Paragraph("DADOS DO MERCADORIA",font14Bold));                    
            Mercadoria.setBackgroundColor(Color.lightGray);
            Mercadoria.setColspan(5);
            Mercadoria.setHorizontalAlignment(Element.ALIGN_CENTER);
            Mercadoria.setVerticalAlignment(Element.ALIGN_MIDDLE);
            Tabela4.addCell(Mercadoria);
            document.add(Tabela4);
            Paragraph PM = new Paragraph("\nTIPO MERCADORIA:   "+TipoMercadoria+"          QUANTIDADE:   "+Quantidade+"          ESPECIE:   "+EndDest+"         \n"
                                       + "METRO CUBICO DO VOLUME:   "+MetroCubico+"         PESO:   "+Peso+"         "
                                       + "NOTA FISCAL:   "+NotaFiscal+"          \n\n",font10);  
            PM.setSpacingAfter(15);
            document.add(PM);
            
            
            PdfPTable Tabela5 = new PdfPTable(5);            
            PdfPCell Observacao1 = new PdfPCell(new Paragraph("OBSERVAÇÕES:     \n\n"+Observacao,font10));  
            Observacao1.setColspan(5);
            Observacao1.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            Tabela5.addCell(Observacao1);
            document.add(Tabela5);
            
 

             Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+" "+NotaFiscal+".pdf");
            
            document.close();
        
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(OrdemEntrega.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
     
    }//GEN-LAST:event_BImprimirActionPerformed

    private void BGPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGPSActionPerformed

        String Estado = CBEstadoDestinatario.getSelectedItem().toString();
        String Cidade1 = TFCidadeDestinatario.getText();

        try {
            String url = "https://www.google.com.br/maps/dir/Passos+-+MG/"+Cidade1+",+"+Estado+"";
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BGPSActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(OrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdemEntrega().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarOrdemEntrega;
    public javax.swing.JButton BBuscaCliente;
    public javax.swing.JButton BBuscarDestinatario;
    public javax.swing.JButton BBuscarOrdemEntrega;
    public javax.swing.JButton BBuscarVeiculo;
    public javax.swing.JButton BExcluirOrdemEntrega;
    public javax.swing.JButton BGPS;
    public javax.swing.JButton BImprimir;
    public javax.swing.JButton BInserirDadosOrdemEntrega;
    public javax.swing.JButton BInserirOrdemEntrega;
    public javax.swing.JButton BLimparOrdemEntrega;
    public javax.swing.JComboBox CBEstadoCliente;
    public javax.swing.JComboBox CBEstadoDestinatario;
    public javax.swing.JComboBox CBFabricante;
    public javax.swing.JComboBox CBTipoVeiculo;
    public javax.swing.JLabel LCodigoCliente;
    public javax.swing.JLabel LCodigoDestinatario;
    public javax.swing.JLabel LCodigoOrdemEntrega;
    public javax.swing.JLabel LCodigoVeiculo;
    public javax.swing.JTextArea TAObservacoes;
    public javax.swing.JTextField TFAnoVeiculo;
    public javax.swing.JTextField TFBairroCliente;
    public javax.swing.JTextField TFBairroDestinatario;
    public javax.swing.JTextField TFCNPJCliente;
    public javax.swing.JTextField TFCNPJDestinatario;
    public javax.swing.JTextField TFChassi;
    public javax.swing.JTextField TFCidadeCliente;
    public javax.swing.JTextField TFCidadeDestinatario;
    public javax.swing.JTextField TFCodigoCliente;
    public javax.swing.JTextField TFCodigoDestinatario;
    public javax.swing.JTextField TFCodigoOrdemEntrega;
    public javax.swing.JTextField TFCodigoVeiculo;
    public javax.swing.JTextField TFEnderecoCliente;
    public javax.swing.JTextField TFEnderecoDestinatario;
    public javax.swing.JTextField TFEspecieMercadoria;
    public javax.swing.JTextField TFMetroCubico;
    public javax.swing.JTextField TFModeloVeiculo;
    public javax.swing.JTextField TFNomeCliente;
    public javax.swing.JTextField TFNomeDestinatario;
    public javax.swing.JTextField TFNotaFiscal;
    public javax.swing.JTextField TFNumEndCliente;
    public javax.swing.JTextField TFNumEndDestinatario;
    public javax.swing.JTextField TFPesoMercadoria;
    public javax.swing.JTextField TFPlacaVeiculo;
    public javax.swing.JTextField TFQuantidadeMercadoria;
    public javax.swing.JTextField TFRenavam;
    public javax.swing.JTextField TFTipoMercadoria;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
