/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Venda;
import Utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Matheus.Caetano
 */
public class VendaDAO {
    
    public static int Criandovenda(Venda pVenda)
    {
        int retorno=0;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
           //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO vendas (valor_venda) VALUES (?);"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar a Matricula
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setDouble(1, pVenda.getValorVenda());
            
           
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID da venda
                if (generatedKeys.next()) {
                        pVenda.setIdVenda(generatedKeys.getInt(1));
                        retorno = pVenda.getIdVenda();
                }else {
                        throw new SQLException("Falha ao obter o Código da Venda!.");
                }
            }else{
                retorno = 0;
            }
            
        }catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = 0;
        }finally{

            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }

        return retorno;
    }
    public static boolean PopulandoVenda(Venda pVenda)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
           //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
           
            
            instrucaoSQL = conexao.prepareStatement("Update vendas set data_venda= ?, valor_venda= ?, id_cliente= ? where id_venda= ?");  
            instrucaoSQL.setString(1, pVenda.getData());
            instrucaoSQL.setDouble(2, pVenda.getValorVenda());
            instrucaoSQL.setString(3, pVenda.getCpfCliente());
            instrucaoSQL.setInt(4, pVenda.getIdVenda());
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
         
            if(linhasAfetadas>0){
                
                retorno = true; 
                
            }else{
                retorno = false;
            }
            
        }catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        }finally{

            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }

        return retorno;
    }
    public static boolean Criandoitemporvenda(Venda pVenda)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
           //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (?, ?, ?);"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar a Matricula
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setDouble(1, pVenda.getIdVenda());
            instrucaoSQL.setDouble(2, pVenda.getCodProduto());
            instrucaoSQL.setDouble(3, pVenda.getQtdItem());
            
           
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            //baixa de estoque
            int quant =0, result =0;
            
            instrucaoSQL = conexao.prepareStatement("update produtos set Estoque= ? where Id_Produto = ?");  //Caso queira retornar a Matricula
            instrucaoSQL.setInt(1, pVenda.getEstoque());
            instrucaoSQL.setInt(2, pVenda.getCodProduto());
            
            int linhasAfetadas2 = instrucaoSQL.executeUpdate();
           
            
            //
            if(linhasAfetadas>0 & linhasAfetadas2>0){
                retorno = true;
                
                
                
            }else{
                retorno = false;
            }
            
        }catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        }finally{

            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }

        return retorno;
    }
    public static ArrayList<Venda> Carregaritensvenda(int pcodvenda)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Venda> listaItensadd = new ArrayList<Venda>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produtos inner join itens_venda_produto on produtos.Id_Produto = itens_venda_produto.id_produto inner join vendas on vendas.id_venda = itens_venda_produto.id_venda where vendas.id_venda = ?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1,pcodvenda);

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
              Venda p = new Venda();
                p.setNomeProduto(rs.getString("Produto"));
                p.setQtdItem(rs.getInt("quantidade_produto"));
                p.setvalorunitario(rs.getDouble("Valor"));
                
                
                
                //Adiciono na listaClientes
                listaItensadd.add(p);   
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaItensadd = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaItensadd;
    }
    public static double Realizarsoma(int pcodvenda)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        double total =0;
        
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select*from itens_venda_produto inner join produtos on itens_venda_produto.id_produto = produtos.Id_produto where id_venda = ?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1,pcodvenda);

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
              
              total = total + rs.getDouble("Valor") * rs.getInt("quantidade_produto"); 
            
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return total;
    }
    public static boolean CancelarVenda()
    {
        ResultSet rs = null;
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select * from vendas inner join itens_venda_produto on vendas.id_venda = itens_venda_produto.id_venda inner join produtos on itens_venda_produto.id_produto = produtos.Id_Produto where valor_venda=0");
           
            rs = instrucaoSQL.executeQuery();;
            
            rs.first();
            do{
                int quantidade_estoque = rs.getInt("Estoque"); // variavel para armazenar qnt em estoque
                int quantidade_vendida= rs.getInt("quantidade_produto");; //variavel para armazenar a qnt vendida tabela itens_venda_produto
                int soma = quantidade_estoque+quantidade_vendida;
                instrucaoSQL = conexao.prepareStatement("Update produtos set Estoque =? where Id_Produto= ?");
                instrucaoSQL.setInt(1, soma );
                instrucaoSQL.setInt(2, rs.getInt("Id_produto") );
                instrucaoSQL.executeUpdate(); 
                // pegar na tabela produto tudo que foi vendido e dar um update 
                instrucaoSQL = conexao.prepareStatement("delete from itens_venda_produto where id_venda=?");
                instrucaoSQL.setInt(1, rs.getInt("id_venda") );
                instrucaoSQL.executeUpdate(); 
            }while(rs.next());
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM vendas WHERE valor_venda = ?");
            
            instrucaoSQL.setInt(1, 0);

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                //GerenciadorConexao.fecharConexao();
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    public static ArrayList<Venda> CarregarVendasRelatorio(String pdata)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Venda> listaVenda = new ArrayList<Venda>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select * from vendas inner join clientes on vendas.id_cliente = clientes.CPF where data_venda = ?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1,pdata);

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
              Venda p = new Venda();
                p.setIdVenda(rs.getInt("id_venda"));
                p.setData(rs.getString("data_venda"));
                p.setValorVenda(rs.getDouble("valor_venda"));
                p.setCpfCliente(rs.getString("CPF"));
                p.setNomeCliente(rs.getString("Nome"));
                
                
                //Adiciono na listaClientes
                listaVenda.add(p);   
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaVenda = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaVenda;
    }
     public static ArrayList<Venda> CarregarVendasRelatorioperiodo(String dedata, String atedata)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Venda> listaVenda = new ArrayList<Venda>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select * from vendas inner join clientes on vendas.id_cliente = clientes.CPF WHERE STR_TO_DATE(data_venda, '%d/%m/%Y') BETWEEN STR_TO_DATE(?, '%d/%m/%Y') AND STR_TO_DATE(?, '%d/%m/%Y');");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1,dedata);
            instrucaoSQL.setString(2,atedata);
            
            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
              Venda p = new Venda();
                p.setIdVenda(rs.getInt("id_venda"));
                p.setData(rs.getString("data_venda"));
                p.setValorVenda(rs.getDouble("valor_venda"));
                p.setCpfCliente(rs.getString("CPF"));
                p.setNomeCliente(rs.getString("Nome"));
                
                
                //Adiciono na listaClientes
                listaVenda.add(p);   
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaVenda = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaVenda;
    }
    public static ArrayList<Venda> CarregarItensRelatorio(int pid)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Venda> listaVenda = new ArrayList<Venda>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select * from vendas inner join itens_venda_produto on vendas.id_venda = itens_venda_produto.id_venda inner join produtos on itens_venda_produto.id_produto = produtos.Id_produto where vendas.id_venda= ?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1,pid);

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
              Venda p = new Venda();
                p.setNomeProduto(rs.getString("Produto"));
                p.setQtdItem(rs.getInt("quantidade_produto"));
                
                
                
                //Adiciono na listaClientes
                listaVenda.add(p);   
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaVenda = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaVenda;
    }
     
     
    
}



