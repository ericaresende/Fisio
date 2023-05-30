
package br.com.ericacorreia.fisio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ericacorreia.fisio.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    public List<Pessoa> findByAuthor(String name);
}
