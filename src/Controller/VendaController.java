/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDAO;
import DAO.VendaDAO;
import Model.Produto;
import Model.Venda;
import java.util.ArrayList;

/**
 *
 * @author  Matheus.Caetano
 */
public class VendaController {
     // metodos do crud eu chamo aqui
    public static int Criandovenda(double valor)
    {
       Venda objVenda = new Venda(); 
       objVenda.setValorVenda(valor);
       
       
       
       
       // para mandar gravar no banco de dados chamo o pacote DAO
       int retorno = VendaDAO.Criandovenda(objVenda);
        
        return retorno;
    }
    public static boolean PopulandoVenda(Venda objVenda)
    {
       
       objVenda.getIdVenda();
       objVenda.getData();
       objVenda.getValorVenda();
       objVenda.getCpfCliente();
      
       
       boolean retorno = VendaDAO.PopulandoVenda(objVenda);
        
        return retorno;
    }
    public static boolean Criandoitemporvenda(Venda objVenda)
    {
       
       objVenda.getIdVenda();
       objVenda.getCodProduto();
       objVenda.getQtdItem();
       objVenda.getEstoque();
       
       boolean retorno = VendaDAO.Criandoitemporvenda(objVenda);
        
        return retorno;
    }
    public static boolean CancelarVenda()
    {
        boolean retorno = VendaDAO.CancelarVenda();
        
       
        return retorno;
    }
    
     
    
}


