package br.com.ericacorreia.fisio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ericacorreia.fisio.model.Pessoa;
import br.com.ericacorreia.fisio.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService service;

    @GetMapping
    public List<Pessoa> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Pessoa pessoa) {
        try {
            return new ResponseEntity<>(service.save(pessoa), HttpStatus.CREATED);
        } catch (Exception e) {

            // TODO gerar um log de sistema

            return new ResponseEntity<>(
                    "Lamento, houve um erro inesperado em nossa aplicação, tente novamente mais tarde!!!",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Pessoa pessoa) {
        try {
            return new ResponseEntity<>(service.save(pessoa), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(
                    "Lamento, houve um erro inesperado em nossa aplicação, tente novamente mais tarde!!!",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<String> delete(@PathVariable("codigo") Long codigo) {
        service.delete(codigo);
        var result = service.findById(codigo);

        if (result.isEmpty()) {
            return new ResponseEntity<>("Pessoa removida com sucesso!!!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Lamento, não foi possível remover a pessoa!!!", HttpStatus.OK);
    }
}
