package br.com.ericacorreia.fisio.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ericacorreia.fisio.model.Consultas;
import br.com.ericacorreia.fisio.repository.ConsultasRepository;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consultas")
public class ConstultasController {
    private ConsultasRepository service = new ConsultasRepository();
    @GetMapping
    public List<Consultas> findAll() {
        return service.findAll();
    }
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Consultas consultas) {
        try{
            return new ResponseEntity<>(service.save(consultas), HttpStatus.CREATED);
        } catch (IllegalArgumentException ia){
            return new ResponseEntity<>(ia.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("escrever palavra", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Consultas consultas) {
        try{
            return new ResponseEntity<>(service.save(consultas), HttpStatus.OK);
        } catch (IllegalAccessError ia) {
            return new ResponseEntity<>(ia.getMessage(), HttpStatus.BAD_REQUEST);
        }catch (Exception e) {
            return new ResponseEntity<>("lamento, houve um erro inesperado em nossa aplicação, tente novamente mais tarde!!!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
