package com.aluracursos.challenge.literalura.service.provider;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos {

    private static ConvierteDatos instance;
    private ObjectMapper objectMapper = new ObjectMapper();

    private ConvierteDatos() {}

    public static synchronized ConvierteDatos getInstance() {
        if (instance == null) {
            instance = new ConvierteDatos();
        }
        return instance;
    }

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
