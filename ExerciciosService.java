package br.com.ericacorreia.fisio.service;

import java.util.List;

import br.com.ericacorreia.fisio.model.Exercicios;
import br.com.ericacorreia.fisio.repository.ExerciciosRepository;

public class ExerciciosService {
    private ExerciciosRepository repository = new ExerciciosRepository();

    public List<Exercicios> findAll(){
        return repository.findAll();
    }

    public Exercicios save(Exercicios exercicios) throws IllegalArgumentException {
        if(exercicios.getDescrição().trim().isEmpty()) {
            new IllegalArgumentException("A descrição não pode ficar vazia");
        }
        if(exercicios.getNome().trim().isEmpty()) {
            new IllegalArgumentException("O nome não pode ficar vazio");
        }
        return repository.save(exercicios);
    }

    public Exercicios edit(Exercicios exercicios) throws IllegalArgumentException {
        if(exercicios.getDescrição().trim().isEmpty()) {
            new IllegalArgumentException("A descrição não pode ficar vazia");
        }
        if(exercicios.getNome().trim().isEmpty()) {
            new IllegalArgumentException("O nome não pode ficar vazia");
        }
        return repository.edit(exercicios);
    }
    public Exercicios delete(Exercicios exercicios) {
        if(exercicios.getDescrição().trim().isEmpty()) {
            new IllegalArgumentException("A descrição não pode ficar vazia");
        }
        if(exercicios.getNome().trim().isEmpty()) {
            new IllegalArgumentException("O nome não pode ficar vazio");        
    }
    return repository.delete(exercicios);
}
}