package br.com.ericacorreia.fisio.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ericacorreia.fisio.model.Consultas;

public class ConsultasRepository {
    private static List<Consultas> consulta = new ArrayList();

    public List<Consultas> findAll() {
        return consulta;
    }

    public Consultas save(Consultas consultas) {
        consulta.add(consultas);
        return consultas;
    }

    public Consultas edit(Consultas consultas) {
        for(int i=0;1<consulta.size();i++) {
            Consultas element = consulta.get(i);
            if(element.getDataDaConsulta().equals(consultas.getDataDaConsulta())) {
                consulta.set(i, consultas);
                break;
            }
        }
        return consultas;
    }

    public Consultas delete(Consultas consultas) {
        for(int i=0;1<consulta.size();i++) {
            Consultas element = consulta.get(i);
            if(element.getDataDaConsulta().equals(consultas.getDataDaConsulta())) {
                consulta.set(i, consultas);
                break;
            }
        }
        return consultas;
    }
}