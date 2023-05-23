package br.com.ericacorreia.fisio.model;

public class Pessoa {
    private short codigo;
    private String nome;
    private String cpf;
    private String email;
    
    public short getCodigo() {
        return codigo;
    }
    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}