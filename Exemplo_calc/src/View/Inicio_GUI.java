/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

public class Inicio_GUI extends javax.swing.JFrame {
    
    public Inicio_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VALOR1_TXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RESULTADO_TXT = new javax.swing.JTextField();
        sair_btn = new javax.swing.JButton();
        soma_btn = new javax.swing.JButton();
        sub_btn = new javax.swing.JButton();
        mult_btn = new javax.swing.JButton();
        limpar_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        VALOR2_TXT = new javax.swing.JTextField();
        porc_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        potencia_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultado");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 210, 90, 40);

        VALOR1_TXT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(VALOR1_TXT);
        VALOR1_TXT.setBounds(210, 70, 80, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Valor 2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 120, 80, 30);

        RESULTADO_TXT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RESULTADO_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESULTADO_TXTActionPerformed(evt);
            }
        });
        jPanel1.add(RESULTADO_TXT);
        RESULTADO_TXT.setBounds(210, 260, 80, 28);

        sair_btn.setBackground(new java.awt.Color(255, 255, 255));
        sair_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sair_btn.setText("Sair");
        sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_btnActionPerformed(evt);
            }
        });
        jPanel1.add(sair_btn);
        sair_btn.setBounds(400, 20, 100, 31);

        soma_btn.setBackground(new java.awt.Color(255, 255, 255));
        soma_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soma_btn.setText("+");
        soma_btn.setMaximumSize(new java.awt.Dimension(43, 31));
        soma_btn.setMinimumSize(new java.awt.Dimension(43, 31));
        soma_btn.setPreferredSize(new java.awt.Dimension(43, 31));
        soma_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soma_btnActionPerformed(evt);
            }
        });
        jPanel1.add(soma_btn);
        soma_btn.setBounds(20, 360, 60, 50);

        sub_btn.setBackground(new java.awt.Color(255, 255, 255));
        sub_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sub_btn.setText("-");
        sub_btn.setMaximumSize(new java.awt.Dimension(43, 31));
        sub_btn.setMinimumSize(new java.awt.Dimension(43, 31));
        sub_btn.setPreferredSize(new java.awt.Dimension(43, 31));
        sub_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_btnActionPerformed(evt);
            }
        });
        jPanel1.add(sub_btn);
        sub_btn.setBounds(100, 360, 60, 50);

        mult_btn.setBackground(new java.awt.Color(255, 255, 255));
        mult_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mult_btn.setText("*");
        mult_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mult_btnActionPerformed(evt);
            }
        });
        jPanel1.add(mult_btn);
        mult_btn.setBounds(180, 360, 60, 50);

        limpar_btn.setBackground(new java.awt.Color(255, 255, 255));
        limpar_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        limpar_btn.setText("Limpar");
        limpar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(limpar_btn);
        limpar_btn.setBounds(400, 60, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor 1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 30, 90, 40);

        VALOR2_TXT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VALOR2_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VALOR2_TXTActionPerformed(evt);
            }
        });
        jPanel1.add(VALOR2_TXT);
        VALOR2_TXT.setBounds(210, 160, 80, 28);

        porc_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        porc_btn.setText("%");
        porc_btn.setPreferredSize(new java.awt.Dimension(43, 31));
        porc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porc_btnActionPerformed(evt);
            }
        });
        jPanel1.add(porc_btn);
        porc_btn.setBounds(340, 360, 60, 50);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("/");
        jButton3.setMaximumSize(new java.awt.Dimension(43, 31));
        jButton3.setMinimumSize(new java.awt.Dimension(43, 31));
        jButton3.setPreferredSize(new java.awt.Dimension(43, 31));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(260, 360, 60, 50);

        potencia_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        potencia_btn.setText("^");
        potencia_btn.setMaximumSize(new java.awt.Dimension(43, 31));
        potencia_btn.setMinimumSize(new java.awt.Dimension(43, 31));
        potencia_btn.setPreferredSize(new java.awt.Dimension(43, 31));
        potencia_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencia_btnActionPerformed(evt);
            }
        });
        jPanel1.add(potencia_btn);
        potencia_btn.setBounds(420, 360, 60, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(519, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RESULTADO_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESULTADO_TXTActionPerformed

    }//GEN-LAST:event_RESULTADO_TXTActionPerformed

    private void sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_btnActionPerformed
        Model.Funcoes_DAO.sair();
    }//GEN-LAST:event_sair_btnActionPerformed

    private void soma_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soma_btnActionPerformed
        Model.Funcoes_DAO.somar();
    }//GEN-LAST:event_soma_btnActionPerformed

    private void sub_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_btnActionPerformed
        Model.Funcoes_DAO.sub();
    }//GEN-LAST:event_sub_btnActionPerformed

    private void mult_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mult_btnActionPerformed
        Model.Funcoes_DAO.mult();
    }//GEN-LAST:event_mult_btnActionPerformed

    private void limpar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_btnActionPerformed
        Model.Funcoes_DAO.limpar();
    }//GEN-LAST:event_limpar_btnActionPerformed

    private void VALOR2_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VALOR2_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VALOR2_TXTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Model.Funcoes_DAO.div();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void porc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porc_btnActionPerformed
        Model.Funcoes_DAO.porc();
    }//GEN-LAST:event_porc_btnActionPerformed

    private void potencia_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencia_btnActionPerformed
       Model.Funcoes_DAO.potencia();
    }//GEN-LAST:event_potencia_btnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField RESULTADO_TXT;
    public static javax.swing.JTextField VALOR1_TXT;
    public static javax.swing.JTextField VALOR2_TXT;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar_btn;
    private javax.swing.JButton mult_btn;
    private javax.swing.JButton porc_btn;
    private javax.swing.JButton potencia_btn;
    private javax.swing.JButton sair_btn;
    private javax.swing.JButton soma_btn;
    private javax.swing.JButton sub_btn;
    // End of variables declaration//GEN-END:variables
}
