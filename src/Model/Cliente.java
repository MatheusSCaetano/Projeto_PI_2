/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Matheus. Caetano
 */
public class Cliente {
     private int idCliente;
    private String Nome ;
    private String CPF ;
    private String Sexo;
    private String Estado_Civil;
    private String Email;
    private String Telefone;
    private String Rua;
    private String Bairro;
    private String CEP;
    private String Cidade;
    
    

    public Cliente() {
    }
    
    public Cliente(int pId, String pNome, String pCPF, String pSexo, String pEstado_Civil, String pEmail, String pTelefone, String pRua, String pBairro, String pCEP, String pCidade) {
    this.idCliente = pId;
    this.Nome = pNome;
    this.CPF = pCPF;
    this.Sexo = pSexo;
    this.Estado_Civil = pEstado_Civil;
    this.Email = pEmail;
    this.Telefone = pTelefone;
    this.Rua = pRua;
    this.Bairro = pBairro;
    this.CEP = pCEP;
    this.Cidade = pCidade;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int pId) {
        this.idCliente = pId;
    }
    
    public String getCPF() {
        return CPF;
    }
    public String getCPFSomenteNumeros() {
        return CPF.replace(".", "").replace("-", "");
    }
    public void setCPF(String pCPF) {
        this.CPF = pCPF;
    }
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String pNome) {
        this.Nome = pNome;
    }
    
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String pSexo) {
        this.Sexo = pSexo;
    }
    
     public String getEstadoCivil() {
        return Estado_Civil;
    }
    public void setEstadoCivil(String pEstado) {
        this.Estado_Civil = pEstado;
    }
    
    public String getEmail() {
        return Email;
    }
    public void setEmail(String pEmail) {
        this.Email = pEmail;
    }
  
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String pTelefone) {
        this.Telefone = pTelefone;
    }
    
    public String getRua() {
        return Rua;
    }
    public void setRua(String pRua) {
        this.Rua = pRua;
    }
    
    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String pBairro) {
        this.Bairro = pBairro;
    }
    
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String pcep) {
        this.CEP = pcep;
    }
    
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String pCidade) {
        this.Cidade = pCidade;
    }
}
