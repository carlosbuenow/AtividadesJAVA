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
        VALOR2_TXT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        sair_btn = new javax.swing.JButton();
        soma_btn = new javax.swing.JButton();
        sub_btn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        limpar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Valor 1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 60, 90, 40);

        VALOR1_TXT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(VALOR1_TXT);
        VALOR1_TXT.setBounds(210, 120, 80, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Valor 2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 170, 80, 30);

        VALOR2_TXT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VALOR2_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VALOR2_TXTActionPerformed(evt);
            }
        });
        jPanel1.add(VALOR2_TXT);
        VALOR2_TXT.setBounds(210, 220, 80, 28);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("/");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 350, 60, 60);

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
        soma_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soma_btnActionPerformed(evt);
            }
        });
        jPanel1.add(soma_btn);
        soma_btn.setBounds(50, 350, 60, 60);

        sub_btn.setBackground(new java.awt.Color(255, 255, 255));
        sub_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sub_btn.setText("-");
        sub_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_btnActionPerformed(evt);
            }
        });
        jPanel1.add(sub_btn);
        sub_btn.setBounds(170, 350, 60, 60);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("*");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(290, 350, 60, 60);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(519, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VALOR2_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VALOR2_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VALOR2_TXTActionPerformed

    private void sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_btnActionPerformed
        Model.Funcoes_DAO.sair();
    }//GEN-LAST:event_sair_btnActionPerformed

    private void soma_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soma_btnActionPerformed
        Model.Funcoes_DAO.somar();
    }//GEN-LAST:event_soma_btnActionPerformed

    private void sub_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_btnActionPerformed
        Model.Funcoes_DAO.sub();
    }//GEN-LAST:event_sub_btnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Model.Funcoes_DAO.mult();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Model.Funcoes_DAO.div();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_btnActionPerformed
        Model.Funcoes_DAO.limpar();
    }//GEN-LAST:event_limpar_btnActionPerformed

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
    public static javax.swing.JTextField VALOR1_TXT;
    public static javax.swing.JTextField VALOR2_TXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar_btn;
    private javax.swing.JButton sair_btn;
    private javax.swing.JButton soma_btn;
    private javax.swing.JButton sub_btn;
    // End of variables declaration//GEN-END:variables
}
