package com.aluracursos.challenge.literalura.repository;

import com.aluracursos.challenge.literalura.model.entity.Idioma;
import com.aluracursos.challenge.literalura.model.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    @Query("SELECT l FROM Libro l WHERE l.idioma = :idioma")
    List<Libro> obtenerLibrosPorIdioma(Idioma idioma);

    Optional<Libro> findByTitulo(String titulo);
}
