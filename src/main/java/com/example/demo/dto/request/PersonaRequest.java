package com.example.demo.dto.request;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class PersonaRequest implements Serializable {

    private String nombres;
    private String apellidos;
    private String numeroDocumento;
    private String fechaNacimiento;
}
