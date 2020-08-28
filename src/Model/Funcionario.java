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
public class Funcionario {
    
    private int idFuncionario;
    private String Nome ;
    private String CPF ;
    private String Sexo;
    private String Email;
    private String Telefone;
    private String Cargo;
    private double Salario;
    

    public Funcionario() {
    }
    
    public Funcionario(int pId, String pNome, String pCPF, String pSexo, String pEmail, String pTelefone, String pCargo, double pSalario) {
    this.idFuncionario = pId;
    this.Nome = pNome;
    this.CPF = pCPF;
    this.Sexo = pSexo;
    this.Email = pEmail;
    this.Telefone = pTelefone;
    this.Cargo = pCargo;
    this.Salario = pSalario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int pId) {
        this.idFuncionario = pId;
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
    
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String pCargo) {
        this.Cargo = pCargo;
    }
    
    public Double getSalario() {
        return Salario;
    }

    public void setSalario(double pSalario) {
        this.Salario = pSalario;
    }
    
    

}

