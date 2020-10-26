package com.example.demo.service;


import com.example.demo.dto.request.PersonaRequest;
import com.example.demo.dto.response.Respuesta;
import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Value("${demo.tipodocumento}")
    private String tipoDocumento;
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Respuesta crearPersona(PersonaRequest request) {
        Respuesta response=new Respuesta();
        Persona persona=new Persona();
        persona.setTipoDocumento(tipoDocumento);
        persona.setCargo(1);
        persona.setNombres(request.getNombres());
        persona.setApellidos(request.getApellidos());
        persona.setNumeroDocumento(request.getNumeroDocumento());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(request.getFechaNacimiento(), dtf);
        persona.setFechaNacimiento(fechaNac);
        personaRepository.save(persona);
        response.setCodigo("00");
        response.setMensaje("Persona creada con éxito");
        return response;
    }
}
