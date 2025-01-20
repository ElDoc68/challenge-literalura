package com.aluracursos.challenge.literalura.service.provider;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
