package br.com.ericacorreia.fisio.service;

import br.com.ericacorreia.fisio.model.Consultas;

import java.time.LocalDate;
import java.util.List;

public class ConsultasService {
    private ConsultasService repository = new ConsultasService();

    public List<Consultas> findAll(){
        return repository.findAll();
    }
    public Consultas save(Consultas consultas) throws IllegalArgumentException {
        if (consultas.getDataDaConsulta().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data não deve ser inferior a data atual");
        }
        return repository.save(consultas);
    }

    public Consultas edit(Consultas consultas) throws IllegalArgumentException {
        if(consultas.getDataDaConsulta().isBefore(LocalDate.now())) {
            new IllegalArgumentException("O nome não pode ficar vazia");
        }
        return repository.edit(consultas);
    }
    public Consultas delete(Consultas consultas) {
        if(consultas.getDataDaConsulta().isBefore(LocalDate.now())) {
            new IllegalArgumentException("O nome não pode ficar vazio");        
    }
    return repository.delete(consultas);

}
}
