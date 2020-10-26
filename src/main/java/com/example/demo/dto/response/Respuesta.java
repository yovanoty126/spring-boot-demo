package com.example.demo.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class Respuesta implements Serializable {

    private String codigo;
    private String mensaje;
}
