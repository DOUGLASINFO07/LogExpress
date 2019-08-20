package logexpress;

import com.lowagie.text.BadElementException;
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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioVeiculo1 extends javax.swing.JFrame {
    
    Connection conn;

    public RelatorioVeiculo1() {
        initComponents();
    }
    
     public RelatorioVeiculo1(Connection conn) {
        initComponents();
        this.conn = conn;
        
 
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CBItemPesquisa = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        TFNome = new javax.swing.JTextField();
        BMostrarAqui = new javax.swing.JButton();
        BGerarPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TRelatorioVeiculo = new javax.swing.JTable();
        BVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatório de Veículo");

        jPanel1.setBackground(new java.awt.Color(192, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("PESQUISAR POR:");

        CBItemPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Modelo", "Placa", "TipoVeiculo", "Fabricacao", "Ano", " ", " " }));
        CBItemPesquisa.setSelectedItem(CBItemPesquisa);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DIGITE O QUE DESEJA PESQUISAR");

        TFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBItemPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBItemPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BMostrarAqui.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BMostrarAqui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/aqui.png"))); // NOI18N
        BMostrarAqui.setText("MOSTRAR AQUI");
        BMostrarAqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMostrarAquiActionPerformed(evt);
            }
        });

        BGerarPDF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BGerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pdf-icon.png"))); // NOI18N
        BGerarPDF.setText("GERAR PDF");
        BGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGerarPDFActionPerformed(evt);
            }
        });

        TRelatorioVeiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TRelatorioVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLACA", "TIPO VEÍCULO", "FABRICANTE", "MODELO", "ANO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TRelatorioVeiculo);

        BVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        BVoltar.setText("VOLTAR");
        BVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BVoltar)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BMostrarAqui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BGerarPDF))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BMostrarAqui)
                    .addComponent(BGerarPDF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BMostrarAquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMostrarAquiActionPerformed

        DefaultTableModel m = (DefaultTableModel)
        TRelatorioVeiculo.getModel();

        while(TRelatorioVeiculo.getRowCount() > 0){
            m.removeRow(0);
        }
 
        String modoSelecionado = CBItemPesquisa.getSelectedItem().toString();
        String Nome = TFNome.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM veiculo WHERE "+modoSelecionado+" LIKE '"+Nome+"%' ORDER BY '"+Nome+"'");

            while(rs.next()){

                String placa = rs.getString("placa");
                String tipoVeiculo = rs.getString("tipoVeiculo");
                String Fabricacao = rs.getString("Fabricacao");
                String Modelo = rs.getString("Modelo");
                String Ano = rs.getString("Ano");

                m.addRow(new Object[] {placa, tipoVeiculo,Fabricacao, Modelo, Ano});

            }

        }catch(Exception e){
            System.out.println(
                "Error ao consultar Veículo: "+e.getMessage());
        }

    }//GEN-LAST:event_BMostrarAquiActionPerformed

    private void BGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerarPDFActionPerformed

        String modoSelecionado1 = CBItemPesquisa.getSelectedItem().toString();
        String Nome1 = TFNome.getText();
        Document document = new Document(PageSize.A4, 1, 1, 1, 1);
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM veiculo WHERE "+modoSelecionado1+" LIKE '"+Nome1+"%' ORDER BY '"+Nome1+"'");

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Relatorio_Veiculos.pdf"));

            document.open();
            
            Font font14Bold = new Font(Font.TIMES_ROMAN,12,Font.BOLD);
            Font font18 = new Font(Font.TIMES_ROMAN,18,Font.BOLDITALIC);
            
            Image Img = Image.getInstance("src/Imagens/icone_Relatorio.png");
            Img.setAlignment(Element.ALIGN_CENTER);

            PdfPTable Tabela = new PdfPTable(5);

            PdfPCell Cabecalho = new PdfPCell(new Paragraph("RELATÓRIO DE VEÍCULOS",font18));
            PdfPCell Placa = new PdfPCell(new Paragraph("PLACA",font14Bold));
            PdfPCell TipoVeiculo = new PdfPCell(new Paragraph("TIPO VEÍCULO",font14Bold));
            PdfPCell Fabricante = new PdfPCell(new Paragraph("FABRICAÇÃO",font14Bold));
            PdfPCell Modelo = new PdfPCell(new Paragraph("MODELO",font14Bold));
            PdfPCell Ano = new PdfPCell(new Paragraph("ANO",font14Bold));
            
            Tabela.addCell(Img);
            
            Cabecalho.setBackgroundColor(Color.lightGray);
            Cabecalho.setColspan(5);
            Cabecalho.setHorizontalAlignment(Element.ALIGN_CENTER);
            Cabecalho.setVerticalAlignment(Element.ALIGN_MIDDLE);
            Tabela.addCell(Cabecalho);
            
             Placa.setBackgroundColor(Color.CYAN);
            Placa.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(Placa);
            
             TipoVeiculo.setBackgroundColor(Color.CYAN);
            TipoVeiculo.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(TipoVeiculo);
            
             Fabricante.setBackgroundColor(Color.CYAN);
            Fabricante.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(Fabricante);
            
             Modelo.setBackgroundColor(Color.CYAN);
            Modelo.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(Modelo);
            
             Ano.setBackgroundColor(Color.CYAN);
            Ano.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(Ano);
           
            while(rs.next()){

                Tabela.addCell(rs.getString("placa"));
                Tabela.addCell(rs.getString("tipoVeiculo"));
                Tabela.addCell(rs.getString("fabricacao"));
                Tabela.addCell(rs.getString("modelo"));
                Tabela.addCell(rs.getString("ano"));
              
            }
            document.add(Tabela);
            document.close();
            
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+" Relatorio_Veiculos.pdf");

        }catch(SQLException | FileNotFoundException | DocumentException e){
            System.out.println(
                "Error ao consultar Veículo: "+e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(RelatorioVeiculo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_BGerarPDFActionPerformed

    private void BVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarActionPerformed

        
        this.dispose();    
        

    }//GEN-LAST:event_BVoltarActionPerformed

    private void TFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNomeActionPerformed
       

        // TODO add your handling code here:
    }//GEN-LAST:event_TFNomeActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
      
        
    }//GEN-LAST:event_formKeyReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(RelatorioVeiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioVeiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioVeiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioVeiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RelatorioVeiculo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BGerarPDF;
    public javax.swing.JButton BMostrarAqui;
    public javax.swing.JButton BVoltar;
    public javax.swing.JComboBox CBItemPesquisa;
    public javax.swing.JTextField TFNome;
    public javax.swing.JTable TRelatorioVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
