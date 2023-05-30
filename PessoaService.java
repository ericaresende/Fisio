package br.com.ericacorreia.fisio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ericacorreia.fisio.model.Pessoa;
import br.com.ericacorreia.fisio.repository.PessoaRepository;

@Service
public class PessoaService{
    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    public Pessoa save(Pessoa pessoa) {
        // TODO Colocar a validação aqui
        return repository.save(pessoa);
    }

    public void delete(Long codigo) {
        repository.deleteById(codigo);
    }

    public Optional<Pessoa> findById(Long codigo) {
        return repository.findById(codigo);
    }
}
