/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Matheus.Caetano
 */
public class Produto {
    
    private int idProduto;
    private String Produto ;
    private String Categoria ;
    private double Preco;
    private int Estoque;
    

    public Produto() {
    }
    
    public Produto(int pId, String pProduto, String pCategoria, double pPreco, int pEstoque) {
    this.idProduto = pId;
    this.Produto = pProduto;
    this.Categoria = pCategoria;
    this.Preco = pPreco;
    this.Estoque = pEstoque;
    
    }

    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int pId) {
        this.idProduto = pId;
    }
    
    public String getProduto() {
        return Produto;
    }
    public void setProduto(String pProduto) {
        this.Produto = pProduto;
    }
    
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String pCategoria) {
        this.Categoria = pCategoria;
    }
    
    public Double getPreco() {
        return Preco;
    }
    public void setPreco(double pPreco) {
        this.Preco = pPreco;
    }
    
    public int getEstoque() {
        return Estoque;
    }
    public void setEstoque(int pEstoque) {
        this.Estoque = pEstoque;
    }
   
  
 
    
   
    
    
    
    

}


