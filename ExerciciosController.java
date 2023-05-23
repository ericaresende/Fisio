package br.com.ericacorreia.fisio.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ericacorreia.fisio.model.Exercicios;
import br.com.ericacorreia.fisio.service.ExerciciosService;

@RestController
@RequestMapping("/api/exercicios")
public class ExerciciosController {
    private ExerciciosService service = new ExerciciosService();
    @GetMapping
    public List<Exercicios> findAll() {
        return service.findAll();
    }
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Exercicios exercicios) {
        try{
            return new ResponseEntity<>(service.save(exercicios), HttpStatus.CREATED);
        }catch (IllegalArgumentException ia) {
            return new ResponseEntity<>(ia.getMessage(), HttpStatus.BAD_REQUEST);
        }catch (Exception e) {
            return new ResponseEntity<>("escrever palavra", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    
    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Exercicios exercicios) {
     try{
        return new ResponseEntity<>(service.edit(exercicios),
        HttpStatus.CREATED);        
    } catch (IllegalArgumentException ia) {
        return new ResponseEntity<>(ia.getMessage(),
        HttpStatus.BAD_REQUEST);
    } catch (Exception e){
        return new ResponseEntity<>("Lamento, houve um erro inesperado em nossa aplicação, tente novamente mais tarde!!!",
        HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
    @DeleteMapping 
    public ResponseEntity<Object> delete(@RequestBody Exercicios exercicios) {
        try{
            return new ResponseEntity<>(service.delete(exercicios),
            HttpStatus.OK);
        } catch(IllegalArgumentException ia) {
            return new ResponseEntity<>(ia.getMessage(),
            HttpStatus.BAD_REQUEST);

        } catch (Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado em nossa aplicação, tente novamente mais tarde!!!",
            HttpStatus.INTERNAL_SERVER_ERROR);
        }
     }


    }
