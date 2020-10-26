package com.example.demo.service;

import com.example.demo.dto.request.PersonaRequest;
import com.example.demo.dto.response.Respuesta;

public interface PersonaService {

    Respuesta crearPersona(PersonaRequest request);
}
