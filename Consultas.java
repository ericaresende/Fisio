package br.com.ericacorreia.fisio.model;
import java.time.LocalDate;

public class Consultas {
    private LocalDate dataDaConsulta;
    private Paciente paciente;
    
    public LocalDate getDataDaConsulta() {
        return dataDaConsulta;
    }
    public void setDataDaConsulta(LocalDate dataDaConsulta) {
        this.dataDaConsulta = dataDaConsulta;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}