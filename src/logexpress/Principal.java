package logexpress;

import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {
  
     Connection conn;

    public Principal() {
        initComponents();
    }
     
     public Principal(Connection conn) {
        initComponents();
        this.conn = conn;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoLogExpress.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(192, 240, 240));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro.png"))); // NOI18N
        jMenu1.setText("Cadastro");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario.png"))); // NOI18N
        jMenuItem1.setText("Funcionário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/veiculo.png"))); // NOI18N
        jMenuItem2.setText("Veículo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fornecedor.png"))); // NOI18N
        jMenuItem3.setText("Fornecedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clientes.png"))); // NOI18N
        jMenuItem4.setText("Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Destinatario.png"))); // NOI18N
        jMenuItem14.setText("Destinatário");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/frete.png"))); // NOI18N
        jMenu2.setText("Frete");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/OrdemEntrega.png"))); // NOI18N
        jMenuItem6.setText("Ordem Entrega");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Manutenção.png"))); // NOI18N
        jMenu3.setText("Manutenção");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManutVeiculo.png"))); // NOI18N
        jMenuItem8.setText("Veículos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pneu.png"))); // NOI18N
        jMenuItem9.setText("Pneus");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Combustivel.png"))); // NOI18N
        jMenuItem10.setText("Combustível");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatorio.png"))); // NOI18N
        jMenu4.setText("Relatórios");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Rel_Veiculo.png"))); // NOI18N
        jMenuItem5.setText("Veículo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Rel_Clientes.png"))); // NOI18N
        jMenuItem7.setText("Cliente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Rel_Destinatario.png"))); // NOI18N
        jMenuItem11.setText("Destinatário");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Rel_Fornecedor.png"))); // NOI18N
        jMenuItem16.setText("Fornecedor");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Rel_funcionario.png"))); // NOI18N
        jMenuItem17.setText("Funcionario");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Rel_OrdemEntrega.png"))); // NOI18N
        jMenuItem18.setText("Ordem Entrega");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuItem19.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Rel_Man_Veiculo.png"))); // NOI18N
        jMenuItem19.setText("Manutencção de Veículos");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Rel_Pneus.png"))); // NOI18N
        jMenuItem20.setText("Manutenção de Pneus");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Rel_Combustivel.png"))); // NOI18N
        jMenuItem21.setText("Controle de Combustível");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem21);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sobre.png"))); // NOI18N
        jMenu5.setText("Sobre");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/info.png"))); // NOI18N
        jMenuItem12.setText("Versão do Software");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/contato.png"))); // NOI18N
        jMenuItem13.setText("Contato");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jMenuItem15.setText("Sair");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

        ManutencaoCombustivel combustivel = new ManutencaoCombustivel(conn);
        combustivel.setTitle("   ***   MANUTENÇÃO DE COMBUSTÍVEL   ***");
        combustivel.setVisible(true);

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       
        OrdemEntrega entrega = new OrdemEntrega(conn);
        entrega.setTitle("   ***   ORDEM DE ENTREGA   ***");
        entrega.setVisible(true);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        CadFuncionario funcionario = new CadFuncionario(conn);
        funcionario.setTitle("   ***   CADASTRO DE FUNCIONÁRIO   ***   ");
        funcionario.setVisible(true);
                
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        CadVeiculo veiculo = new CadVeiculo(conn);
        veiculo.setTitle("   ***   CADASTRO DE VEICULOS  ***");
        veiculo.setVisible(true);       

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        CadFornecedor fornecedor = new CadFornecedor(conn);
        fornecedor.setTitle("   ***   CADASTRO DE FORNECEDORES   ***");
        fornecedor.setVisible(true);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        CadCliente cliente = new CadCliente(conn);
        cliente.setTitle("   ***   CADASTRO DE CLIENTES   ***");
        cliente.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        
        CadDestinatario destinatario = new CadDestinatario(conn);
        destinatario.setTitle("   ***   CADASTRO DE DESTINATÁRIOS   ***");
        destinatario.setVisible(true);

    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
        ManutencaoVeiculo manutveiculo = new ManutencaoVeiculo(conn);
        manutveiculo.setTitle("   ***   MANUTENÇÃO DE VEÍCULOS  ***");
        manutveiculo.setVisible(true);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       
        ManutencaoPneus Pneus = new ManutencaoPneus(conn);
        Pneus.setTitle("   ***   MANUTENCAO DE PNEUS   ***");
        Pneus.setVisible(true);

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        
        VersaoSoftware software = new VersaoSoftware();
        software.setTitle("   ***   VERSÃO DO SOFTWARE   ***   ");
        software.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       
        Contato cont = new Contato();
        cont.setTitle("   ***   CONTATO    ***");
        cont.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed

        RelatorioFornecedor cont = new RelatorioFornecedor(conn);
        cont.setTitle("   ***   Relatorio Fornecedor    ***");
        cont.setVisible(true);

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
       
        RelatorioManutencaoPneus cont = new RelatorioManutencaoPneus(conn);
        cont.setTitle("   ***   Relatorio Manutenção de Pneus    ***");
        cont.setVisible(true);

    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        RelatorioVeiculo1 RV = new RelatorioVeiculo1(conn);
        RV.setTitle("   ***   relatório de Veículos   ***");
        RV.setVisible(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        RelatorioCliente RV = new RelatorioCliente(conn);
        RV.setTitle("   ***   Relatório de Clientes   ***");
        RV.setVisible(true);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       
        RelatorioDestinatario RV = new RelatorioDestinatario(conn);
        RV.setTitle("   ***   Relatório de Destinatário   ***");
        RV.setVisible(true);

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        
        RelatorioFuncionario RV = new RelatorioFuncionario(conn);
        RV.setTitle("   ***   Relatório de Funcionário   ***");
        RV.setVisible(true);

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
       
        RelatorioOrdemEntrega RV = new RelatorioOrdemEntrega(conn);
        RV.setTitle("   ***   Relatório de Ordem Entrega   ***");
        RV.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed

        RelatorioManutencaoVeiculo RV = new RelatorioManutencaoVeiculo(conn);
        RV.setTitle("   ***   Relatório de Manutenção Veículo   ***");
        RV.setVisible(true);

    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        
        RelatorioManutencaoCombustivel RV = new RelatorioManutencaoCombustivel(conn);
        RV.setTitle("   ***   Relatório de Controle de Combustível   ***");
        RV.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
   
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
