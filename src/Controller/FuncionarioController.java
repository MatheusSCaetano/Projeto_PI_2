/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FuncionarioDAO;
import Model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Matheus.Caetano
 */
public class FuncionarioController {
     // metodos do crud eu chamo aqui
    public static boolean Novo(String pNome, String pCPF, String pSexo, String pEmail, String pTelefone, String pCargo, double pSalario )
    {
       Funcionario objFuncionario = new Funcionario(); 
       objFuncionario.setNome(pNome);
       objFuncionario.setCPF(pCPF);
       objFuncionario.setSexo(pSexo);
       objFuncionario.setEmail(pEmail);
       objFuncionario.setTelefone(pTelefone);
       objFuncionario.setCargo(pCargo);
       objFuncionario.setSalario(pSalario);
       
       // para mandar gravar no banco de dados chamo o pacote DAO
       boolean retorno = FuncionarioDAO.Novo(objFuncionario);
        
        return retorno;
    }
    public static boolean Alterar(Funcionario objFuncionario)
    {
       
       objFuncionario.getIdFuncionario();
       objFuncionario.getNome();
       objFuncionario.getCPF();
       objFuncionario.getSexo();
       objFuncionario.getEmail();
       objFuncionario.getTelefone();
       objFuncionario.getCargo();
       objFuncionario.getSalario();
       
       System.out.println("..........Entrou no Controller............");
       System.out.println("ID:"+objFuncionario.getIdFuncionario());
        System.out.println("Nome:"+objFuncionario.getNome());
        System.out.println("cpf:"+objFuncionario.getCPF());
        System.out.println("Sexo:"+objFuncionario.getSexo());
        System.out.println("Email:"+objFuncionario.getEmail());
        System.out.println("Telefone:"+objFuncionario.getTelefone());
        System.out.println("Cargo:"+objFuncionario.getCargo());
        System.out.println("Salario:"+objFuncionario.getSalario());
        
       // para mandar gravar no banco de dados chamo o pacote DAO
       boolean retorno = FuncionarioDAO.Atualizar(objFuncionario);
        
       
        return retorno;
    }
    public static boolean Excluir(Funcionario objFuncionario)
    {
       objFuncionario.getIdFuncionario();
       objFuncionario.getNome();
       objFuncionario.getCPF();
       objFuncionario.getSexo();
       objFuncionario.getEmail();
       objFuncionario.getTelefone();
       objFuncionario.getCargo();
       objFuncionario.getSalario();
       
       boolean retorno = FuncionarioDAO.Excluir(objFuncionario.getIdFuncionario());
        
       
        return retorno;
    }

     
    
}
