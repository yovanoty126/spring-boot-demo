/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.dto.request.PersonaRequest;
import com.example.demo.dto.response.Respuesta;
import com.example.demo.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


/**
 * @author Edward Ardila
 */
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/demo")
@Slf4j
public class ServiciosController {

    @Autowired
    private PersonaService personaService;

    @PostMapping(path = "/crearPersona")
    public ResponseEntity<Respuesta> cargarArchivo(@RequestBody PersonaRequest request) {
        Respuesta response = personaService.crearPersona(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
