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

public class RelatorioOrdemEntrega extends javax.swing.JFrame {
    
    Connection conn;

    public RelatorioOrdemEntrega() {
        initComponents();
    }
    
     public RelatorioOrdemEntrega(Connection conn) {
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
        TRelatorioOrdemEntrega = new javax.swing.JTable();
        BVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_Relatorio.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatório de Ordem Entrega");

        jPanel1.setBackground(new java.awt.Color(192, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("PESQUISAR POR:");

        CBItemPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NotaFisca" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DIGITE O QUE DESEJA PESQUISAR");

        TFNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFNomeMouseClicked(evt);
            }
        });
        TFNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFNomeKeyReleased(evt);
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

        TRelatorioOrdemEntrega.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TRelatorioOrdemEntrega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOTA FISCAL", "MERCADORIA", "CLIENTE", "DESTINATARIO", "VEICULO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TRelatorioOrdemEntrega);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)))
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
        TRelatorioOrdemEntrega.getModel();

        while(TRelatorioOrdemEntrega.getRowCount() > 0){
            m.removeRow(0);
        }
 
        String modoSelecionado = CBItemPesquisa.getSelectedItem().toString();
        String Nome = TFNome.getText();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                          "     SELECT "
                        + "c.nome, "
                        + "d.nome, "
                        + "v.modelo, "
                        + "oe.notaFiscal, "
                        + "oe.tipomercadoria "
                        + "     FROM "
                        + "Clientes c, "
                        + "Destinatario d, "
                        + "Veiculo v, "
                        + "ordemEntrega oe "
                        + "     WHERE "
                        + " notaFiscal "
                        + "     LIKE "
                        + "'"+Nome+"%' "
                        + "     AND "
                        + "c.codigo = oe.codCliente "
                        + "     AND "
                        + "d.codigo = oe.codDestinatario "
                        + "     AND "
                        + "v.codigo = oe.codVeiculo "
                        + "     ORDER BY "
                        + "oe.notaFiscal");
            while(rs.next()){

                String item1 = rs.getString("oe.notaFiscal");
                String item2 = rs.getString("oe.tipoMercadoria");
                String item3 = rs.getString("c.nome");
                String item4 = rs.getString("d.nome");
                String item5 = rs.getString("v.modelo");

                m.addRow(new Object[] {item1, item2,item3, item4, item5});

            }

        }catch(Exception e){
            System.out.println(
                "Error ao consultar Ordem Entrega: "+e.getMessage());
        }

    }//GEN-LAST:event_BMostrarAquiActionPerformed

    private void BGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerarPDFActionPerformed

        String modoSelecionado1 = CBItemPesquisa.getSelectedItem().toString();
        String Nome1 = TFNome.getText();
        Document document = new Document(PageSize.A4, 1, 1, 1, 1);
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
              
                          "     SELECT "
                        + "c.nome, "
                        + "d.nome, "
                        + "v.modelo, "
                        + "oe.notaFiscal, "
                        + "oe.tipomercadoria "
                        + "     FROM "
                        + "Clientes c, "
                        + "Destinatario d, "
                        + "Veiculo v, "
                        + "ordemEntrega oe "
                        + "     WHERE "
                        + " notaFiscal "
                        + "     LIKE "
                        + "'"+Nome1+"%' "
                        + "     AND "
                        + "c.codigo = oe.codCliente "
                        + "     AND "
                        + "d.codigo = oe.codDestinatario "
                        + "     AND "
                        + "v.codigo = oe.codVeiculo "
                        + "     ORDER BY "
                        + "oe.notaFiscal");
            
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Relatorio_OrdemEntrega.pdf"));

            document.open();
            
            Font font14Bold = new Font(Font.TIMES_ROMAN,12,Font.BOLD);
            Font font18 = new Font(Font.TIMES_ROMAN,18,Font.BOLDITALIC);
            
            Image Img = Image.getInstance("src/Imagens/icone_Relatorio.png");
            Img.setAlignment(Element.ALIGN_CENTER);

            PdfPTable Tabela = new PdfPTable(5);

            PdfPCell Cabecalho = new PdfPCell(new Paragraph("RELATÓRIO DE ORDEM DE ENTREGA",font18));
            PdfPCell ITEM1 = new PdfPCell(new Paragraph("NOTA FISCAL",font14Bold));
            PdfPCell ITEM2 = new PdfPCell(new Paragraph("MERCADORIA",font14Bold));
            PdfPCell ITEM3 = new PdfPCell(new Paragraph("CLIENTE",font14Bold));
            PdfPCell ITEM4 = new PdfPCell(new Paragraph("DESTINATARIO",font14Bold));
            PdfPCell ITEM5 = new PdfPCell(new Paragraph("VEICULO",font14Bold));
            
            Tabela.addCell(Img);
            
            Cabecalho.setBackgroundColor(Color.lightGray);
            Cabecalho.setColspan(5);
            Cabecalho.setHorizontalAlignment(Element.ALIGN_CENTER);
            Cabecalho.setVerticalAlignment(Element.ALIGN_MIDDLE);
            Tabela.addCell(Cabecalho);
            
            ITEM1.setBackgroundColor(Color.CYAN);
            ITEM1.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(ITEM1);
            
            ITEM2.setBackgroundColor(Color.CYAN);
            ITEM2.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(ITEM2);
            
            ITEM3.setBackgroundColor(Color.CYAN);
            ITEM3.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(ITEM3);
            
            ITEM4.setBackgroundColor(Color.CYAN);
            ITEM4.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(ITEM4);
            
            ITEM5.setBackgroundColor(Color.CYAN);
            ITEM5.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabela.addCell(ITEM5);
           
            while(rs.next()){

                Tabela.addCell(rs.getString("oe.notaFiscal"));
                Tabela.addCell(rs.getString("oe.tipoMercadoria"));
                Tabela.addCell(rs.getString("c.nome"));
                Tabela.addCell(rs.getString("d.nome"));
                Tabela.addCell(rs.getString("v.modelo"));
              
            }
            document.add(Tabela);
            document.close();
            
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+" Relatorio_OrdemEntrega.pdf");

        }catch(SQLException | FileNotFoundException | DocumentException e){
            System.out.println(
                "Error ao consultar Ordem de Entrega: "+e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(RelatorioOrdemEntrega.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_BGerarPDFActionPerformed

    private void BVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarActionPerformed
     
        this.dispose();    

    }//GEN-LAST:event_BVoltarActionPerformed

    private void TFNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFNomeMouseClicked
       
        
    }//GEN-LAST:event_TFNomeMouseClicked

    private void TFNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNomeKeyReleased
       // TODO add your handling code here:
    }//GEN-LAST:event_TFNomeKeyReleased

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
            java.util.logging.Logger.getLogger(RelatorioOrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioOrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioOrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioOrdemEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RelatorioOrdemEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BGerarPDF;
    public javax.swing.JButton BMostrarAqui;
    public javax.swing.JButton BVoltar;
    public javax.swing.JComboBox CBItemPesquisa;
    public javax.swing.JTextField TFNome;
    public javax.swing.JTable TRelatorioOrdemEntrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
