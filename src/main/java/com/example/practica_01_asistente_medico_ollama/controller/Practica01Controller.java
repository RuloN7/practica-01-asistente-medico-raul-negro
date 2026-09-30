package com.example.practica_01_asistente_medico_ollama.controller;

import com.example.practica_01_asistente_medico_ollama.service.Practica01Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Practica01Controller {

    Practica01Service practica01Service;

    public Practica01Controller(Practica01Service practica01Service) {
        super();
        this.practica01Service = practica01Service;
    }

    @GetMapping("consulta")
    public ResponseEntity<String> obtenerInfo(@RequestParam("consulta") String consulta) {
        return new ResponseEntity<>(practica01Service.getRespuestaLLM(consulta), HttpStatus.OK);
    }

}
