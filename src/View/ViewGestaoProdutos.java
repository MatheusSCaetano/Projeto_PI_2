/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import DAO.ProdutoDAO;
import Model.Produto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas
 */
public class ViewGestaoProdutos extends javax.swing.JInternalFrame {
Produto objProduto;
    /**
     * Creates new form ViewProdutoAlterar
     */
    public ViewGestaoProdutos() {
        initComponents();
        objProduto = new Produto();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnPesquisarid = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisarNome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Produto - Alterar");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Código Produto:");

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
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnAtualizar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-icon.png"))); // NOI18N

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome", "Categoria", "Valor", "Qntd. Estoque"
            }
        ));
        jScrollPane2.setViewportView(tblProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaridActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Digite o código do produto para realizar a pesquisa");
        }
        else{
        int id = Integer.parseInt(txtID.getText());
        ArrayList<Produto> listaProduto = ProdutoDAO.consultarProdutoporID(id);
        if(listaProduto.size()>0){
        DefaultTableModel tmProduto = new DefaultTableModel()
                         {
                    @Override
                    public boolean isCellEditable(final int row, final int column) {
                            return false;
                    }
            };
        tmProduto.addColumn("Id_Produto");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Categoria");
        tmProduto.addColumn("Valor");
        tmProduto.addColumn("Qntd. Estoque");
       

        tblProdutos.setModel(tmProduto);

        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
        // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmProduto.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Produto p : listaProduto) {
            tmProduto.addRow(new Object[]{p.getIdProduto(),p.getProduto(),p.getCategoria(),p.getPreco(), p.getEstoque()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
        
    } else{
            JOptionPane.showMessageDialog(this,"Produto não encontrado");
        }
    }//GEN-LAST:event_btnPesquisaridActionPerformed
    } 
    private void btnPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNomeActionPerformed
        // TODO add your handling code here:
        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Digite o nome do produto para realizar a pesquisa");
        }
        else{
        ArrayList<Produto> listaProduto = ProdutoDAO.consultarProdutopornome(txtNome.getText());
        if(listaProduto.size()>0){
        DefaultTableModel tmProduto = new DefaultTableModel()
                         {
                    @Override
                    public boolean isCellEditable(final int row, final int column) {
                            return false;
                    }
            };
        tmProduto.addColumn("Id_Produto");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Categoria");
        tmProduto.addColumn("Valor");
        tmProduto.addColumn("Qntd. Estoque");
       

        tblProdutos.setModel(tmProduto);

        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
        // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmProduto.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Produto p : listaProduto) {
            tmProduto.addRow(new Object[]{p.getIdProduto(),p.getProduto(),p.getCategoria(),p.getPreco(), p.getEstoque()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
        
    }  else{
            JOptionPane.showMessageDialog(this,"Produto não encontrado");
        }
        }
    }//GEN-LAST:event_btnPesquisarNomeActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if(tblProdutos.getSelectedRowCount()>0)
        {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblProdutos.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int Id_Produto = Integer.parseInt(tblProdutos.getModel().getValueAt(numeroLinha,0).toString());
            String nome = tblProdutos.getModel().getValueAt(numeroLinha, 1).toString();
            String categoria = tblProdutos.getModel().getValueAt(numeroLinha, 2).toString();
            double preco = Double.parseDouble(tblProdutos.getModel().getValueAt(numeroLinha, 3).toString());
            int estoque = Integer.parseInt(tblProdutos.getModel().getValueAt(numeroLinha, 4).toString());
            
            
            objProduto.setIdProduto(Id_Produto);
            objProduto.setProduto(nome);
            objProduto.setCategoria(categoria);
            objProduto.setPreco(preco);
            objProduto.setEstoque(estoque);
            

            //Passo o objeto para a tela de Cadastro informando que é alteração
            ViewProdutoCadastrar viewprodutocadastrar = new ViewProdutoCadastrar(objProduto);

            viewprodutocadastrar.modotela = "Alteração";
            getParent().add(viewprodutocadastrar);
            viewprodutocadastrar.setVisible(true);

        }else{
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ViewProdutoCadastrar viewProdutoCadastrar = new ViewProdutoCadastrar();
        getParent().add(viewProdutoCadastrar);
        viewProdutoCadastrar.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if(tblProdutos.getSelectedRowCount()>0)
        {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblProdutos.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int Id_Produto = Integer.parseInt(tblProdutos.getModel().getValueAt(numeroLinha,0).toString());
            String nome = tblProdutos.getModel().getValueAt(numeroLinha, 1).toString();
            String categoria = tblProdutos.getModel().getValueAt(numeroLinha, 2).toString();
            double preco = Double.parseDouble(tblProdutos.getModel().getValueAt(numeroLinha, 3).toString());
            int estoque = Integer.parseInt(tblProdutos.getModel().getValueAt(numeroLinha, 4).toString());
            
            
            objProduto.setIdProduto(Id_Produto);
            objProduto.setProduto(nome);
            objProduto.setCategoria(categoria);
            objProduto.setPreco(preco);
            objProduto.setEstoque(estoque);

            boolean retorno = ProdutoController.Excluir(objProduto);
            if(retorno == true){

                JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this, "Falha o excluir produto!");
            }

            //Consulto novamente a base de dados
            CarregarJTable();

        }else{
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        ArrayList<Produto> listaProduto = ProdutoDAO.consultarProdutos();

        DefaultTableModel tmProduto = new DefaultTableModel()
                         {
                    @Override
                    public boolean isCellEditable(final int row, final int column) {
                            return false;
                    }
            };
        tmProduto.addColumn("Id_Produto");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Categoria");
        tmProduto.addColumn("Valor");
        tmProduto.addColumn("Qntd. Estoque");
       

        tblProdutos.setModel(tmProduto);

        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
        // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmProduto.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Produto p : listaProduto) {
            tmProduto.addRow(new Object[]{p.getIdProduto(),p.getProduto(),p.getCategoria(),p.getPreco(), p.getEstoque()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    public void CarregarJTable(){
        
        //Peço à classe DAO para consultar os clientes
//        String[] nomes = new String[5];
//        String[] cpfs = new String[5];
        
        
        ArrayList<Produto> listaProduto = ProdutoDAO.consultarProdutos();
        DefaultTableModel tmProduto = new DefaultTableModel()
                         {
                    @Override
                    public boolean isCellEditable(final int row, final int column) {
                            return false;
                    }
            };
        tmProduto.addColumn("Id_Produto");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Categoria");
        tmProduto.addColumn("Valor");
        tmProduto.addColumn("Qntd. Estoque");
       

        tblProdutos.setModel(tmProduto);

        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
        // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmProduto.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Produto p : listaProduto) {
            tmProduto.addRow(new Object[]{p.getIdProduto(),p.getProduto(),p.getCategoria(),p.getPreco(), p.getEstoque()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
        
       
        
        
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}