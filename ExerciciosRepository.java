package br.com.ericacorreia.fisio.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ericacorreia.fisio.model.Exercicios;

public class ExerciciosRepository {
    private static List<Exercicios> exercicio = new ArrayList<>();

    public List<Exercicios> findAll() {
        return exercicio;
    }

    public Exercicios save(Exercicios exercicios) {
        exercicio.add(exercicios);
        return exercicios;
    }

    public Exercicios edit (Exercicios exercicios) {
        for(int i=0;1<exercicio.size();i++) {
            Exercicios element = exercicio.get(i);
            if(element.getDescrição().equals(exercicios.getDescrição())) {
                exercicio.set(i, exercicios);
                break;
            }
        }
        return exercicios;
    }

    public Exercicios delete(Exercicios exercicios) {
        for(int i=0;1<exercicio.size();i++) {
            Exercicios element = exercicio.get(i);
            if(element.getDescrição().equals(exercicios.getDescrição())) {
                exercicio.set(i, exercicios);
                break;
            }
        }
        return exercicios;
    }
}