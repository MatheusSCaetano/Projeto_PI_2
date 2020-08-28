/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Funcionario;
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
public class FuncionarioDAO {
    
    
  public static boolean Novo(Funcionario pFuncionario)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
           //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO funcionarios (Nome, CPF, Sexo, Email, Telefone, Cargo, Salario) VALUES (?, ?, ?, ?, ?, ?, ?);"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar a Matricula
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, pFuncionario.getNome());
            instrucaoSQL.setString(2, pFuncionario.getCPFSomenteNumeros());
            instrucaoSQL.setString(3, pFuncionario.getSexo());
            instrucaoSQL.setString(4, pFuncionario.getEmail());
            instrucaoSQL.setString(5, pFuncionario.getTelefone());
            instrucaoSQL.setString(6, pFuncionario.getCargo());
            instrucaoSQL.setDouble(7, pFuncionario.getSalario());
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        pFuncionario.setIdFuncionario(generatedKeys.getInt(1));
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
    
    public static boolean Atualizar(Funcionario pFuncionario)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        System.out.println("..........Entrou no DAO............");
        System.out.println("ID:"+pFuncionario.getIdFuncionario());
        System.out.println("Nome:"+pFuncionario.getNome());
        System.out.println("cpf:"+pFuncionario.getCPF());
        System.out.println("Sexo:"+pFuncionario.getSexo());
        System.out.println("Email:"+pFuncionario.getEmail());
        System.out.println("Telefone:"+pFuncionario.getTelefone());
        System.out.println("Cargo:"+pFuncionario.getCargo());
        System.out.println("Salario:"+pFuncionario.getSalario());
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            //conexao = GerenciadorConexao.abrirConexao();
            
            //Passo 1
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("UPDATE funcionarios SET Nome = ?, CPF=?, Sexo=?, Email=?, Telefone=?, Cargo=?, Salario=?  WHERE Id_Funcionario =?");
            
            //Adiciono os parâmetros ao meu comando SQL
            
            
            instrucaoSQL.setString(1, pFuncionario.getNome());
            instrucaoSQL.setString(2, pFuncionario.getCPFSomenteNumeros());
            instrucaoSQL.setString(3, pFuncionario.getSexo());
            instrucaoSQL.setString(4, pFuncionario.getEmail());
            instrucaoSQL.setString(5, pFuncionario.getTelefone());
            instrucaoSQL.setString(6, pFuncionario.getCargo());
            instrucaoSQL.setDouble(7, pFuncionario.getSalario());
            instrucaoSQL.setInt(8, pFuncionario.getIdFuncionario());
            
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
            
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM funcionarios WHERE Id_Funcionario = ?");
            
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
    
    public static ArrayList<Funcionario> consultarFuncionarios()
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        //Armazeno as informaçoes da tabela (resultSet) em um ArrayList
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        
        try {
            conexao = GerenciadorConexao.abrirConexao();
            
            //conexao = GerenciadorConexao.abrirConexao();
           
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM funcionarios;");

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();
            
            //Percorrer o resultSet
            while(rs.next())
            {
                Funcionario f = new Funcionario();
                f.setIdFuncionario(rs.getInt("Id_Funcionario"));
                f.setNome(rs.getString("Nome"));
                f.setCPF(rs.getString("CPF"));
                f.setSexo(rs.getString("Sexo"));
                f.setEmail(rs.getString("Email"));
                f.setTelefone(rs.getString("Telefone"));
                f.setCargo(rs.getString("Cargo"));
                f.setSalario(rs.getDouble("Salario"));
                
                
                //Adiciono na listaClientes
                listaFuncionarios.add(f);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaFuncionarios = null;
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
        
        return listaFuncionarios;
    }
    
    public static ArrayList<Funcionario> consultarFuncionariopornome(String pNome)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM funcionarios WHERE nome LIKE ?;");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1,"%" + pNome + '%' );

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Funcionario f = new Funcionario();
                f.setIdFuncionario(rs.getInt("Id_Funcionario"));
                f.setNome(rs.getString("Nome"));
                f.setCPF(rs.getString("CPF"));
                f.setSexo(rs.getString("Sexo"));
                f.setEmail(rs.getString("Email"));
                f.setTelefone(rs.getString("Telefone"));
                f.setCargo(rs.getString("Cargo"));
                f.setSalario(rs.getDouble("Salario"));
                
                listaFuncionarios.add(f);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaFuncionarios = null;
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
        
        return listaFuncionarios;
    }
    
     public static ArrayList<Funcionario> consultarFuncionarioporID(int pid)
     {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM funcionarios WHERE  Id_Funcionario =?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pid);

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Funcionario f = new Funcionario();
                f.setIdFuncionario(rs.getInt("Id_Funcionario"));
                f.setNome(rs.getString("Nome"));
                f.setCPF(rs.getString("CPF"));
                f.setSexo(rs.getString("Sexo"));
                f.setEmail(rs.getString("Email"));
                f.setTelefone(rs.getString("Telefone"));
                f.setCargo(rs.getString("Cargo"));
                f.setSalario(rs.getDouble("Salario"));
                listaFuncionarios.add(f);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaFuncionarios = null;
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
        
        return listaFuncionarios;
    }
    
}

