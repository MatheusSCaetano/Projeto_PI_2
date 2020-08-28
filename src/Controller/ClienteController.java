/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Matheus.Caetano
 */
public class ClienteController {
     // metodos do crud eu chamo aqui
    public static boolean Novo(String pNome, String pCPF, String pSexo, String pEstadoCivil, String pEmail, String pTelefone, String pRua, String pBairro, String pCEP, String pCidade)
    {
       Cliente objCliente = new Cliente(); 
       objCliente.setNome(pNome);
       objCliente.setCPF(pCPF);
       objCliente.setSexo(pSexo);
       objCliente.setEstadoCivil(pEstadoCivil);
       objCliente.setEmail(pEmail);
       objCliente.setTelefone(pTelefone);
       objCliente.setRua(pRua);
       objCliente.setBairro(pBairro);
       objCliente.setCEP(pCEP);
       objCliente.setCidade(pCidade);
       
       
       // para mandar gravar no banco de dados chamo o pacote DAO
       boolean retorno = ClienteDAO.Novo(objCliente);
        
        return retorno;
    }
    public static boolean Alterar(Cliente objCliente)
    {
       
       objCliente.getIdCliente();
       objCliente.getNome();
       objCliente.getCPF();
       objCliente.getSexo();
       objCliente.getEstadoCivil();
       objCliente.getEmail();
       objCliente.getTelefone();
       objCliente.getRua();
       objCliente.getBairro();
       objCliente.getCEP();
       objCliente.getCidade();
       
       
       
        
       // para mandar gravar no banco de dados chamo o pacote DAO
       boolean retorno = ClienteDAO.Atualizar(objCliente);
        
       
        return retorno;
    }
    public static boolean Excluir(Cliente objCliente)
    {
       objCliente.getIdCliente();
       objCliente.getNome();
       objCliente.getCPF();
       objCliente.getSexo();
       objCliente.getEstadoCivil();
       objCliente.getEmail();
       objCliente.getTelefone();
       objCliente.getRua();
       objCliente.getBairro();
       objCliente.getCEP();
       objCliente.getCidade();
       
       boolean retorno = ClienteDAO.Excluir(objCliente.getIdCliente());
        
       
        return retorno;
    }

     
    
}

