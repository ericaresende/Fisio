package br.com.ericacorreia.fisio.model;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Consultas {
    @JsonFormat(pattern = "yyyy-MM-dd")
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
