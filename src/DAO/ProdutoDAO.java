/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
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
public class ProdutoDAO {
    
    
  public static boolean Novo(Produto pProduto)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
           //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produtos (Produto, Categoria, Valor, Estoque) VALUES (?, ?, ?, ?);"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar a Matricula
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, pProduto.getProduto());
            instrucaoSQL.setString(2, pProduto.getCategoria());
            instrucaoSQL.setDouble(3, pProduto.getPreco());
            instrucaoSQL.setInt(4, pProduto.getEstoque());
           
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        pProduto.setIdProduto(generatedKeys.getInt(1));
                }else {
                        throw new SQLException("Falha ao obter o Código do Produto!.");
                }
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
    
    public static boolean Atualizar(Produto pProduto)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        
        
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            //conexao = GerenciadorConexao.abrirConexao();
            
            //Passo 1
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("UPDATE produtos SET Produto = ?, Categoria=?, Valor=?, Estoque=? WHERE Id_Produto =?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, pProduto.getProduto());
            instrucaoSQL.setString(2, pProduto.getCategoria());
            instrucaoSQL.setDouble(3, pProduto.getPreco());
            instrucaoSQL.setInt(4, pProduto.getEstoque());
            instrucaoSQL.setInt(5, pProduto.getIdProduto());
            
            
            //Mando executar a instrução SQL
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
    
    public static boolean Excluir(int pID)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            //conexao = GerenciadorConexao.abrirConexao();
            conexao = GerenciadorConexao.abrirConexao();
            
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM produtos WHERE Id_Produto = ?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pID);

            //Mando executar a instrução SQL
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
    
    public static ArrayList<Produto> consultarProdutos()
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        //Armazeno as informaçoes da tabela (resultSet) em um ArrayList
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        
        try {
            conexao = GerenciadorConexao.abrirConexao();
            
            //conexao = GerenciadorConexao.abrirConexao();
           
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produtos;");

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();
            
            //Percorrer o resultSet
            while(rs.next())
            {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("Id_Produto"));
                p.setProduto(rs.getString("Produto"));
                p.setCategoria(rs.getString("Categoria"));
                p.setPreco(rs.getDouble("Valor"));
                p.setEstoque(rs.getInt("Estoque"));
                
                
                
                //Adiciono na listaClientes
                listaProdutos.add(p);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaProdutos = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                conexao.close();
                //GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaProdutos;
    }
    
    public static ArrayList<Produto> consultarProdutopornome(String pNome)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produtos WHERE Produto LIKE ?;");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1,"%" + pNome + '%' );

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
              Produto p = new Produto();
                p.setIdProduto(rs.getInt("Id_Produto"));
                p.setProduto(rs.getString("Produto"));
                p.setCategoria(rs.getString("Categoria"));
                p.setPreco(rs.getDouble("Valor"));
                p.setEstoque(rs.getInt("Estoque"));
                
                
                
                //Adiciono na listaClientes
                listaProdutos.add(p);   
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaProdutos = null;
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
        
        return listaProdutos;
    }
    
     public static ArrayList<Produto> consultarProdutoporID(int pid)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produtos WHERE  Id_Produto =?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pid);

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                 Produto p = new Produto();
                p.setIdProduto(rs.getInt("Id_Produto"));
                p.setProduto(rs.getString("Produto"));
                p.setCategoria(rs.getString("Categoria"));
                p.setPreco(rs.getDouble("Valor"));
                p.setEstoque(rs.getInt("Estoque"));
                
                
                
                //Adiciono na listaClientes
                listaProdutos.add(p);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaProdutos = null;
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
        
        return listaProdutos;
    }
     
     
    
}


