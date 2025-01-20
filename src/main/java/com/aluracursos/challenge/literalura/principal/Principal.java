package com.aluracursos.challenge.literalura.principal;

import com.aluracursos.challenge.literalura.domain.AutorDto;
import com.aluracursos.challenge.literalura.domain.LibroDto;
import com.aluracursos.challenge.literalura.model.Datos;
import com.aluracursos.challenge.literalura.model.DatosLibro;
import com.aluracursos.challenge.literalura.model.entity.Idioma;
import com.aluracursos.challenge.literalura.service.AutorService;
import com.aluracursos.challenge.literalura.service.provider.ConsumoAPI;
import com.aluracursos.challenge.literalura.service.provider.ConvierteDatos;
import com.aluracursos.challenge.literalura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

@Component
public class Principal {

    private static final String URL_BASE = "https://gutendex.com/books/";

    @Autowired
    private LibroService libroService;
    @Autowired
    private AutorService autorService;

    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = ConsumoAPI.getInstance();
    private ConvierteDatos conversor = ConvierteDatos.getInstance();

    public void ejecutarOperaciones() {
        int operacion = -1;
        while (operacion != 0) {
            mostrarMenu();
            try {
                operacion = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opciones válidas: 0, 1, 2, 3, 4, 5");
                continue;
            } finally {
                teclado.nextLine();
            }
            switch (operacion) {
                case 1:
                    buscarLibroPorTitulo();
                    break;
                case 2:
                    listarLibrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosPorAnio();
                    break;
                case 5:
                    mostrarIdiomas();
                    listarLibrosPorIdioma();
                    break;
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("""
                Elija la opción a través de su número:
                1- Buscar libro por título
                2- Listar libros registrados
                3- Listar autores registrados
                4- Listar autores vivos en un determinado año
                5- Listar libros por idioma
                0- Salir
                """);
    }

    public void mostrarIdiomas() {
        System.out.println("Escriba el idioma deseado: ");
        for (Idioma idioma : Idioma.values()) {
            System.out.println(idioma.mostrar());
        }
    }

    private void buscarLibroPorTitulo() {
        System.out.println("Ingrese el nombre del libro que desea buscar");
        String titulo = teclado.nextLine();

        String json = consumoAPI.obtenerDatos(URL_BASE + "?search=" + titulo.replace(" ", "+"));

        DatosLibro libroBuscado = conversor.obtenerDatos(json, Datos.class).libros().get(0);
        LibroDto libroNuevo = libroService.guardarLibro(libroBuscado);
        System.out.println(libroNuevo);
    }

    private void listarLibrosRegistrados() {
        List<LibroDto> librosRegistrados = libroService.obtenerLibros();
        librosRegistrados.forEach(System.out::println);
    }

    private void listarAutoresRegistrados() {
        List<AutorDto> autoresRegistrados = autorService.obtenerAutores();
        autoresRegistrados.forEach(System.out::println);
    }

    private void listarAutoresVivosPorAnio() {
        System.out.println("Ingrese el año de los autor(es) vivos que desea buscar: ");
        int anio = 0;
        try {
            anio = teclado.nextInt();
            List<AutorDto> autoresVivos = autorService.obtenerAutoresVivosPorAnio(anio);
            autoresVivos.forEach(System.out::println);
        } catch (InputMismatchException e) {
            System.out.println("Ingreso un año inválido. No se pudo realizar la búsqueda.");
        }
    }

    private void listarLibrosPorIdioma() {
        String abreviatura = teclado.nextLine();
        Idioma idioma = Idioma.fromString(abreviatura);
        List<LibroDto> librosPorIdioma = libroService.obtenerLibrosPorIdioma(idioma);
        librosPorIdioma.forEach(System.out::println);
    }

}
