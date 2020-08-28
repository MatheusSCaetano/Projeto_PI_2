/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FuncionarioController;
import DAO.FuncionarioDAO;
import Model.Funcionario;
import View.ViewFuncionarioCadastrar;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author MOISES
 */
public class ViewGestaoFuncionarios extends javax.swing.JInternalFrame {
    
    Funcionario objFuncionario;
    /**
     * Creates new form ViewGestaoFuncionarios
     */
    public ViewGestaoFuncionarios() {
        initComponents();
        objFuncionario = new Funcionario();
        CarregarJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnPesquisarid = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisarNome = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Gestão de Fornecedores");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-icon.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão de Registros"));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Novo");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addGap(12, 12, 12)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Sexo", "E-mail", "Telefone", "Cargo", "Salário"
            }
        ));
        jScrollPane1.setViewportView(tblFuncionarios);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ID / Matricula:");

        btnPesquisarid.setText("Pesquisar");
        btnPesquisarid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaridActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        btnPesquisarNome.setText("Pesquisar");
        btnPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarid))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarNome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Atualizar Tabela"));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnAtualizar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     

    private void btnPesquisaridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaridActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtID.getText());
        ArrayList<Funcionario> listaFuncionario = FuncionarioDAO.consultarFuncionarioporID(id);
        
       
       DefaultTableModel tmFuncionario = new DefaultTableModel();
        tmFuncionario.addColumn("Id_Cliente");
        tmFuncionario.addColumn("Nome");
        tmFuncionario.addColumn("CPF");
        tmFuncionario.addColumn("Sexo");
        tmFuncionario.addColumn("Email");
        tmFuncionario.addColumn("Telefone");
        tmFuncionario.addColumn("Cargo");
        tmFuncionario.addColumn("Salario");
        
        
        tblFuncionarios.setModel(tmFuncionario);
        
        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
       // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));
        
        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmFuncionario.setRowCount(0);
        
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Funcionario c : listaFuncionario) {
            tmFuncionario.addRow(new Object[]{c.getIdFuncionario(),c.getNome(),c.getCPFSomenteNumeros(),c.getSexo(), c.getEmail(), c.getTelefone(), c.getCargo(), c.getSalario()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(6).setPreferredWidth(100);
       
        
    }//GEN-LAST:event_btnPesquisaridActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       
        ArrayList<Funcionario> listaFuncionario = FuncionarioDAO.consultarFuncionarios();
        
       
        DefaultTableModel tmFuncionario = new DefaultTableModel();
        tmFuncionario.addColumn("Id_Funcionario");
        tmFuncionario.addColumn("Nome");
        tmFuncionario.addColumn("CPF");
        tmFuncionario.addColumn("Sexo");
        tmFuncionario.addColumn("Email");
        tmFuncionario.addColumn("Telefone");
        tmFuncionario.addColumn("Cargo");
        tmFuncionario.addColumn("Salario");
        
        
        tblFuncionarios.setModel(tmFuncionario);
        
        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
       // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));
        
        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmFuncionario.setRowCount(0);
        
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Funcionario c : listaFuncionario) {
            tmFuncionario.addRow(new Object[]{c.getIdFuncionario(),c.getNome(),c.getCPFSomenteNumeros(),c.getSexo(), c.getEmail(), c.getTelefone(), c.getCargo(), c.getSalario()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(6).setPreferredWidth(100);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       
        if(tblFuncionarios.getRowCount()>0)
        {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblFuncionarios.getSelectedRow();
            
            //Resgato o ID (oculto) do cliente pelo JTableModel
            int Id_Funcionario = Integer.parseInt(tblFuncionarios.getModel().getValueAt(numeroLinha,0).toString());
            String nome = tblFuncionarios.getModel().getValueAt(numeroLinha, 1).toString();
            String cpf = tblFuncionarios.getModel().getValueAt(numeroLinha, 2).toString();
            String sexo = tblFuncionarios.getModel().getValueAt(numeroLinha, 3).toString();
            String email = tblFuncionarios.getModel().getValueAt(numeroLinha, 4).toString();
            String telefone = tblFuncionarios.getModel().getValueAt(numeroLinha, 5).toString();
            String cargo = tblFuncionarios.getModel().getValueAt(numeroLinha, 6).toString();
            double salario = Double.parseDouble(tblFuncionarios.getModel().getValueAt(numeroLinha, 7).toString());
            
            objFuncionario.setIdFuncionario(Id_Funcionario);
            objFuncionario.setNome(nome);
            objFuncionario.setCPF(cpf);
            objFuncionario.setSexo(sexo);
            objFuncionario.setEmail(email);
            objFuncionario.setTelefone(telefone);
            objFuncionario.setCargo(cargo);
            objFuncionario.setSalario(salario);
            
            
            //Passo o objeto para a tela de Cadastro informando que é alteração
            ViewFuncionarioCadastrar viewfuncionariocadastrar = new ViewFuncionarioCadastrar(objFuncionario);
            
            viewfuncionariocadastrar.modotela = "Alteração";
            getParent().add(viewfuncionariocadastrar);
            viewfuncionariocadastrar.setVisible(true);
                 
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um cliente da tabela!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
      ViewFuncionarioCadastrar viewFuncionarioCadastrar = new ViewFuncionarioCadastrar();
      getParent().add(viewFuncionarioCadastrar);
      viewFuncionarioCadastrar.setVisible(true);  
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
         if(tblFuncionarios.getRowCount()>0)
        {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblFuncionarios.getSelectedRow();
            
            //Resgato o ID (oculto) do cliente pelo JTableModel
            int Id_Funcionario = Integer.parseInt(tblFuncionarios.getModel().getValueAt(numeroLinha, 0).toString());
            String Nome = tblFuncionarios.getModel().getValueAt(numeroLinha, 1).toString();
            String CPF = tblFuncionarios.getModel().getValueAt(numeroLinha, 2).toString();
            String Sexo = tblFuncionarios.getModel().getValueAt(numeroLinha, 3).toString();
            String Email = tblFuncionarios.getModel().getValueAt(numeroLinha, 4).toString();
            String Telefone = tblFuncionarios.getModel().getValueAt(numeroLinha, 5).toString();
            String Cargo = tblFuncionarios.getModel().getValueAt(numeroLinha, 6).toString();
            double Salario = Double.parseDouble(tblFuncionarios.getModel().getValueAt(numeroLinha, 7).toString());
           
            
            
            objFuncionario.setIdFuncionario(Id_Funcionario);
            objFuncionario.setNome(Nome);
            objFuncionario.setCPF(CPF);
            objFuncionario.setSexo(Sexo);
            objFuncionario.setEmail(Email);
            objFuncionario.setTelefone(Telefone);
            objFuncionario.setCargo(Cargo);
            objFuncionario.setSalario(Salario);
            
            boolean retorno = FuncionarioController.Excluir(objFuncionario);
            if(retorno == true){
               
                JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this, "Falha o excluir cliente!");
            }      
            
            //Consulto novamente a base de dados
            CarregarJTable();
            
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um cliente da tabela!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNomeActionPerformed
        // TODO add your handling code here:
        ArrayList<Funcionario> listaFuncionario = FuncionarioDAO.consultarFuncionariopornome(txtNome.getText());
        
       
       DefaultTableModel tmFuncionario = new DefaultTableModel();
        tmFuncionario.addColumn("Id_Funcionario");
        tmFuncionario.addColumn("Nome");
        tmFuncionario.addColumn("CPF");
        tmFuncionario.addColumn("Sexo");
        tmFuncionario.addColumn("Email");
        tmFuncionario.addColumn("Telefone");
        tmFuncionario.addColumn("Cargo");
        tmFuncionario.addColumn("Salario");
        
        
        tblFuncionarios.setModel(tmFuncionario);
        
        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
       // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));
        
        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmFuncionario.setRowCount(0);
        
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Funcionario c : listaFuncionario) {
            tmFuncionario.addRow(new Object[]{c.getIdFuncionario(),c.getNome(),c.getCPFSomenteNumeros(),c.getSexo(), c.getEmail(), c.getTelefone(), c.getCargo(), c.getSalario()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(6).setPreferredWidth(100);
        
    }//GEN-LAST:event_btnPesquisarNomeActionPerformed
   public void CarregarJTable(){
        
        //Peço à classe DAO para consultar os clientes
//        String[] nomes = new String[5];
//        String[] cpfs = new String[5];
        
        
        ArrayList<Funcionario> listaFuncionario = FuncionarioDAO.consultarFuncionarios();
        
       
        DefaultTableModel tmFuncionario = new DefaultTableModel();
        tmFuncionario.addColumn("Id_Funcionario");
        tmFuncionario.addColumn("Nome");
        tmFuncionario.addColumn("CPF");
        tmFuncionario.addColumn("Sexo");
        tmFuncionario.addColumn("Email");
        tmFuncionario.addColumn("Telefone");
        tmFuncionario.addColumn("Cargo");
        tmFuncionario.addColumn("Salario");
        
        //Defina sua estrutura com a estrutura tmClientes;
        tblFuncionarios.setModel(tmFuncionario);
        
        
        //tblClientes.removeColumn(tblClientes.getColumnModel().getColumn(0));
        
        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmFuncionario.setRowCount(0);
        
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
//        for(int i=0;i<listaClientes.size();i++){
//            Maquina objCliente = new Maquina();
//            objCliente =  (Maquina)listaClientes.get(i);
//            objCliente.setId(objCliente.getId());
//            
//            tmClientes.addRow(new Object[]{objCliente.getId(),objCliente.getNome(),objCliente.getCPF()});
//        }
         for (Funcionario c : listaFuncionario) {
            tmFuncionario.addRow(new Object[]{c.getIdFuncionario(),c.getNome(),c.getCPFSomenteNumeros(),c.getSexo(), c.getEmail(), c.getTelefone(), c.getCargo(), c.getSalario()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblFuncionarios.getColumnModel().getColumn(6).setPreferredWidth(100);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisarNome;
    private javax.swing.JButton btnPesquisarid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
