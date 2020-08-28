/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.ViewFuncionarioDesktop;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ViewLogin extends javax.swing.JFrame {

    /**
     * Creates new form ViewFuncionarioT
     */
    public ViewLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFuncionarioUsuario = new javax.swing.JTextField();
        txtFuncionarioSenha = new javax.swing.JPasswordField();
        btnFuncionarioAcessar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnFuncionarioFile = new javax.swing.JMenu();
        MnFuncionarioSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login - Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(442, 190));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Usuário:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Senha:");

        txtFuncionarioUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFuncionarioUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFuncionarioUsuarioFocusLost(evt);
            }
        });

        txtFuncionarioSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFuncionarioSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFuncionarioSenhaFocusLost(evt);
            }
        });

        btnFuncionarioAcessar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnFuncionarioAcessar.setText("Acessar");
        btnFuncionarioAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioAcessarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFuncionarioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFuncionarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnFuncionarioAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFuncionarioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFuncionarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnFuncionarioAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        MnFuncionarioFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/file-icon.png"))); // NOI18N
        MnFuncionarioFile.setText("Arquivo");

        MnFuncionarioSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit-icon.png"))); // NOI18N
        MnFuncionarioSair.setText("Sair");
        MnFuncionarioSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFuncionarioSairActionPerformed(evt);
            }
        });
        MnFuncionarioFile.add(MnFuncionarioSair);

        jMenuBar1.add(MnFuncionarioFile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnFuncionarioSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFuncionarioSairActionPerformed
        ViewLogin.this.dispose();
    }//GEN-LAST:event_MnFuncionarioSairActionPerformed

    private void btnFuncionarioAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioAcessarActionPerformed
        if(txtFuncionarioSenha.getText().equals("admin") && txtFuncionarioUsuario.getText().equals("admin")) {
            JOptionPane.showMessageDialog(this, "Bem-Vindo ao Sistema!");
        }
            /* Acesso para exemplo */
        if (txtFuncionarioSenha.getText().equals("admin") && txtFuncionarioUsuario.getText().equals("admin")) {
            new ViewFuncionarioDesktop().setVisible(true);
            ViewLogin.this.dispose();
        }
        else {
            if (!txtFuncionarioSenha.getText().equals("admin")) {
                JOptionPane.showMessageDialog(this, "Campo 'Senha' inválida");
                txtFuncionarioSenha.setBackground(Color.red);
            }
            if (!txtFuncionarioUsuario.getText().equals("admin")) {
                JOptionPane.showMessageDialog(this, "Campo 'Usuário' inválida");
                txtFuncionarioUsuario.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_btnFuncionarioAcessarActionPerformed

    private void txtFuncionarioSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFuncionarioSenhaFocusGained
        txtFuncionarioSenha.setBackground(Color.white);
    }//GEN-LAST:event_txtFuncionarioSenhaFocusGained

    private void txtFuncionarioSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFuncionarioSenhaFocusLost
        if(txtFuncionarioSenha.getText().trim().equals("")) {
            txtFuncionarioSenha.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtFuncionarioSenhaFocusLost

    private void txtFuncionarioUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFuncionarioUsuarioFocusGained
        txtFuncionarioUsuario.setBackground(Color.white);
    }//GEN-LAST:event_txtFuncionarioUsuarioFocusGained

    private void txtFuncionarioUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFuncionarioUsuarioFocusLost
        if(txtFuncionarioUsuario.getText().trim().equals("")) {
            txtFuncionarioUsuario.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtFuncionarioUsuarioFocusLost

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
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnFuncionarioFile;
    private javax.swing.JMenuItem MnFuncionarioSair;
    private javax.swing.JButton btnFuncionarioAcessar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtFuncionarioSenha;
    private javax.swing.JTextField txtFuncionarioUsuario;
    // End of variables declaration//GEN-END:variables
}