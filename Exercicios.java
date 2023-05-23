package br.com.ericacorreia.fisio.model;

public class Exercicios {
    private int codigo;
    private String nome;
    private String descrição;
    private Fisioterapeuta fisioterapeuta;
    private Paciente paciente;
    
    public Fisioterapeuta getFisioterapeuta() {
        return fisioterapeuta;
    }
    public void setFisioterapeuta(Fisioterapeuta fisioterapeuta) {
        this.fisioterapeuta = fisioterapeuta;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
}