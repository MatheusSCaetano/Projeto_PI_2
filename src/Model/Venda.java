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
public class Venda {
    
    private int idVenda;
    private String data;
    private double valorVenda;
    private String id_cliente;//cpd do cliente
    private String nomeProduto;
    private int cod_produto;
    private int qtdItem;
    private double valorunitario_produto;
    private int estoque;
    private String cpfcliente;
    private String nomecliente;

    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the valorVenda
     */
    public double getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    /**
     * @return the cpfCliente
     */
    public String getCpfCliente() {
        return id_cliente;
    }

    /**
     * @param cpfCliente the cpfCliente to set
     */
    public void setCpfCliente(String cpfCliente) {
        this.id_cliente = cpfCliente;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the qtdItem
     */
    public int getQtdItem() {
        return qtdItem;
    }

    /**
     * @param qtdItem the qtdItem to set
     */
    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }
    
    public int getCodProduto() {
        return cod_produto;
    }

    /**
     * @param qtdItem the qtdItem to set
     */
    public void setCodProduto(int codProduto) {
        this.cod_produto = codProduto;
    }
    
    public double getvalorunitario() {
        return valorunitario_produto;
    }
    
    public void setvalorunitario(double qtdValor) {
        this.valorunitario_produto = qtdValor;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int pestoque) {
        this.estoque = pestoque;
    }

    public String getCpfCliente2() {
        return cpfcliente;
    }

    public void setCpfCliente2(String pcpfcliente) {
        this.cpfcliente = pcpfcliente;
    }

    public String getNomeCliente() {
        return nomecliente;
    }

    public void setNomeCliente(String pnomecliente) {
        this.nomecliente = pnomecliente;
    }
    
 }