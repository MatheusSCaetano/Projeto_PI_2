/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Matheus.Caetano
 */
public class ProdutoController {
     // metodos do crud eu chamo aqui
    public static boolean Novo(String pNome, String pCategoria, double pValor, int pEstoque)
    {
       Produto objProduto = new Produto(); 
       objProduto.setProduto(pNome);
       objProduto.setCategoria(pCategoria);
       objProduto.setPreco(pValor);
       objProduto.setEstoque(pEstoque);
       
       
       
       // para mandar gravar no banco de dados chamo o pacote DAO
       boolean retorno = ProdutoDAO.Novo(objProduto);
        
        return retorno;
    }
    public static boolean Alterar(Produto objProduto)
    {
       
       objProduto.getIdProduto();
       objProduto.getProduto();
       objProduto.getCategoria();
       objProduto.getPreco();
       objProduto.getEstoque();
       
       
       
       
        
       // para mandar gravar no banco de dados chamo o pacote DAO
       boolean retorno = ProdutoDAO.Atualizar(objProduto);
        
       
        return retorno;
    }
    public static boolean Excluir(Produto objProduto)
    {
        objProduto.getIdProduto();
       objProduto.getProduto();
       objProduto.getCategoria();
       objProduto.getPreco();
       objProduto.getEstoque();
       
       
       boolean retorno = ProdutoDAO.Excluir(objProduto.getIdProduto());
        
       
        return retorno;
    }

     
    
}

