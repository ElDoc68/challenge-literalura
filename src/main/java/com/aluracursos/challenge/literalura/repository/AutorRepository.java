package com.aluracursos.challenge.literalura.repository;

import com.aluracursos.challenge.literalura.model.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    @Query("SELECT a FROM Autor a WHERE a.anhioDeNacimiento <= :anio AND a.anhioDeFallecimiento > :anio")
    List<Autor> obtenerAutoresVivosPorAnio(int anio);
}
