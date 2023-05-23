package br.com.ericacorreia.fisio.model;

public class Fisioterapeuta extends Pessoa{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}