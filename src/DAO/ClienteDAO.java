/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
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
 * @author fernando.fernandes
 */
public class ClienteDAO {
    
    
  public static boolean Novo(Cliente pCliente)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
           //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO clientes (Nome, CPF, Sexo, Estado_Civil, Email, Telefone, Rua, Bairro, CEP, Cidade) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar a Matricula
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, pCliente.getNome());
            instrucaoSQL.setString(2, pCliente.getCPFSomenteNumeros());
            instrucaoSQL.setString(3, pCliente.getSexo());
            instrucaoSQL.setString(4, pCliente.getEstadoCivil());
            instrucaoSQL.setString(5, pCliente.getEmail());
            instrucaoSQL.setString(6, pCliente.getTelefone());
            instrucaoSQL.setString(7, pCliente.getRua());
            instrucaoSQL.setString(8, pCliente.getBairro());
            instrucaoSQL.setString(9, pCliente.getCEP());
            instrucaoSQL.setString(10, pCliente.getCidade());
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        pCliente.setIdCliente(generatedKeys.getInt(1));
                }else {
                        throw new SQLException("Falha ao obter o ID do Funcionario!.");
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
    
    public static boolean Atualizar(Cliente pCliente)
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
            
            instrucaoSQL = conexao.prepareStatement("UPDATE clientes SET Nome = ?, CPF=?, Sexo=?, Estado_Civil=?, Email=?, Telefone=?, Rua=?, Bairro=?, CEP=?, Cidade=?  WHERE Id_Cliente =?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, pCliente.getNome());
            instrucaoSQL.setString(2, pCliente.getCPFSomenteNumeros());
            instrucaoSQL.setString(3, pCliente.getSexo());
            instrucaoSQL.setString(4, pCliente.getEstadoCivil());
            instrucaoSQL.setString(5, pCliente.getEmail());
            instrucaoSQL.setString(6, pCliente.getTelefone());
            instrucaoSQL.setString(7, pCliente.getRua());
            instrucaoSQL.setString(8, pCliente.getBairro());
            instrucaoSQL.setString(9, pCliente.getCEP());
            instrucaoSQL.setString(10, pCliente.getCidade());
            instrucaoSQL.setInt(11, pCliente.getIdCliente());
            
            
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
            
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM clientes WHERE Id_Cliente = ?");
            
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
    
    public static ArrayList<Cliente> consultarClientes()
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        //Armazeno as informaçoes da tabela (resultSet) em um ArrayList
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            conexao = GerenciadorConexao.abrirConexao();
            
            //conexao = GerenciadorConexao.abrirConexao();
           
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM clientes;");

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();
            
            //Percorrer o resultSet
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("Id_Cliente"));
                c.setNome(rs.getString("Nome"));
                c.setCPF(rs.getString("CPF"));
                c.setSexo(rs.getString("Sexo"));
                c.setEstadoCivil(rs.getString("Estado_Civil"));
                c.setEmail(rs.getString("Email"));
                c.setTelefone(rs.getString("Telefone"));
                c.setRua(rs.getString("Rua"));
                c.setBairro(rs.getString("Bairro"));
                c.setCEP(rs.getString("CEP"));
                c.setCidade(rs.getString("Cidade"));
                
                
                //Adiciono na listaClientes
                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
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
        
        return listaClientes;
    }
    
    public static ArrayList<Cliente> consultarClientepornome(String pNome)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM clientes WHERE nome LIKE ?;");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1,"%" + pNome + '%' );

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("Id_Cliente"));
                c.setNome(rs.getString("Nome"));
                c.setCPF(rs.getString("CPF"));
                c.setSexo(rs.getString("Sexo"));
                c.setEstadoCivil(rs.getString("Estado_Civil"));
                c.setEmail(rs.getString("Email"));
                c.setTelefone(rs.getString("Telefone"));
                c.setRua(rs.getString("Rua"));
                c.setBairro(rs.getString("Bairro"));
                c.setCEP(rs.getString("CEP"));
                c.setCidade(rs.getString("Cidade"));
                
                
                //Adiciono na listaClientes
                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
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
        
        return listaClientes;
    }
    
     public static ArrayList<Cliente> consultarClienteporID(int pid)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM clientes WHERE  Id_Cliente =?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pid);

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("Id_Cliente"));
                c.setNome(rs.getString("Nome"));
                c.setCPF(rs.getString("CPF"));
                c.setSexo(rs.getString("Sexo"));
                c.setEstadoCivil(rs.getString("Estado_Civil"));
                c.setEmail(rs.getString("Email"));
                c.setTelefone(rs.getString("Telefone"));
                c.setRua(rs.getString("Rua"));
                c.setBairro(rs.getString("Bairro"));
                c.setCEP(rs.getString("CEP"));
                c.setCidade(rs.getString("Cidade"));
                
                
                //Adiciono na listaClientes
                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
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
        
        return listaClientes;
    }
     
      public static ArrayList<Cliente> consultarClienteporCPF(String pcpf)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM clientes WHERE cpf LIKE ?;");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1,"%" + pcpf + '%' );

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("Id_Cliente"));
                c.setNome(rs.getString("Nome"));
                c.setCPF(rs.getString("CPF"));
                c.setSexo(rs.getString("Sexo"));
                c.setEstadoCivil(rs.getString("Estado_Civil"));
                c.setEmail(rs.getString("Email"));
                c.setTelefone(rs.getString("Telefone"));
                c.setRua(rs.getString("Rua"));
                c.setBairro(rs.getString("Bairro"));
                c.setCEP(rs.getString("CEP"));
                c.setCidade(rs.getString("Cidade"));
                
                
                //Adiciono na listaClientes
                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
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
        
        return listaClientes;
    }
     
    
}


