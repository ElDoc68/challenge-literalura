# Desafío Literalura

Este es una aplicación de consola de Java Spring Boot que proporciona una interfaz para administrar libros y autores.

## Características

* Buscar un libro por título
* Listar todos los libros registrados
* Listar todos los autores registrados
* Listar autores que vivieron en un año específico
* Listar libros por idioma

## Tecnologías utilizadas

* Java
* Spring Boot
* Maven
* PostgreSQL

## Configuración

1. Clona el repositorio
2. Actualiza el archivo `application.properties` con tus credenciales de base de datos
3. Ejecuta la aplicación utilizando tu IDE o a través de la línea de comandos con `mvn spring-boot:run`

## Uso

La aplicación proporciona una interfaz de consola. Sigue las instrucciones para utilizar las diferentes características.

```
Menu de opciones:
1- Buscar libro por titulo
2- Listar libros registrados
3- Listar autores registrados
4- Listar autores vivos en un determinado año
5- Listar libros por idioma
0- Salir
Elija la opción a través de su número:

1
Ingrese el nombre del libro que desea buscar
don quijote
El libro ya existe en la base de datos
--------- LIBRO ---------
Titulo: Don Quijote
Autor: Cervantes Saavedra, Miguel de
Idioma: es
Numero de descargas: 12454
-------------------------

Menu de opciones:
1- Buscar libro por titulo
2- Listar libros registrados
3- Listar autores registrados
4- Listar autores vivos en un determinado año
5- Listar libros por idioma
0- Salir
Elija la opción a través de su número:

2
--------- LIBRO ---------
Titulo: Frankenstein; Or, The Modern Prometheus
Autor: Shelley, Mary Wollstonecraft
Idioma: Inglés
Numero de descargas: 73638
-------------------------

--------- LIBRO ---------
Titulo: Calculus Made Easy: Being a very-simplest introduction to those beautiful methods which are generally called by the terrifying names of the Differential Calculus and the Integral Calculus
Autor: Thompson, Silvanus P. (Silvanus Phillips)
Idioma: Inglés
Numero de descargas: 7884
-------------------------

--------- LIBRO ---------
Titulo: Alice's Adventures in Wonderland
Autor: Carroll, Lewis
Idioma: Inglés
Numero de descargas: 31169
-------------------------

--------- LIBRO ---------
Titulo: La Odisea
Autor: Homer
Idioma: Español
Numero de descargas: 3340
-------------------------

--------- LIBRO ---------
Titulo: La Divina Comedia
Autor: Dante Alighieri
Idioma: Español
Numero de descargas: 2254
-------------------------

--------- LIBRO ---------
Titulo: Don Quijote
Autor: Cervantes Saavedra, Miguel de
Idioma: Español
Numero de descargas: 12454
-------------------------

--------- LIBRO ---------
Titulo: The Adventures of Roderick Random
Autor: Smollett, T. (Tobias)
Idioma: Inglés
Numero de descargas: 32592
-------------------------

--------- LIBRO ---------
Titulo: A Lenda da Meia-Noite
Autor: Chagas, Manuel Pinheiro
Idioma: Portugués
Numero de descargas: 117
-------------------------

--------- LIBRO ---------
Titulo: Historia Antiga
Autor: Unknown
Idioma: Portugués
Numero de descargas: 116
-------------------------

--------- LIBRO ---------
Titulo: Contes du jour et de la nuit
Autor: Maupassant, Guy de
Idioma: Francés
Numero de descargas: 361
-------------------------

--------- LIBRO ---------
Titulo: Les trois mousquetaires
Autor: Dumas, Alexandre, Maquet, Auguste
Idioma: Francés
Numero de descargas: 1930
-------------------------

Menu de opciones:
1- Buscar libro por titulo
2- Listar libros registrados
3- Listar autores registrados
4- Listar autores vivos en un determinado año
5- Listar libros por idioma
0- Salir
Elija la opción a través de su número:

3
Autor: Shelley, Mary Wollstonecraft
Fecha de nacimiento: 1797
Fecha de fallecimiento: 1851
Libros: [Frankenstein; Or, The Modern Prometheus]

Autor: Thompson, Silvanus P. (Silvanus Phillips)
Fecha de nacimiento: 1851
Fecha de fallecimiento: 1916
Libros: [Calculus Made Easy: Being a very-simplest introduction to those beautiful methods which are generally called by the terrifying names of the Differential Calculus and the Integral Calculus]

Autor: Carroll, Lewis
Fecha de nacimiento: 1832
Fecha de fallecimiento: 1898
Libros: [Alice's Adventures in Wonderland]

Autor: Homer
Fecha de nacimiento: -750
Fecha de fallecimiento: -650
Libros: [La Odisea]

Autor: Dante Alighieri
Fecha de nacimiento: 1265
Fecha de fallecimiento: 1321
Libros: [La Divina Comedia]

Autor: Cervantes Saavedra, Miguel de
Fecha de nacimiento: 1547
Fecha de fallecimiento: 1616
Libros: [Don Quijote]

Menu de opciones:
1- Buscar libro por titulo
2- Listar libros registrados
3- Listar autores registrados
4- Listar autores vivos en un determinado año
5- Listar libros por idioma
0- Salir
Elija la opción a través de su número:

4
Ingrese el año de los autor(es) vivos que desea buscar: 
1875
Autor: Thompson, Silvanus P. (Silvanus Phillips)
Fecha de nacimiento: 1851
Fecha de fallecimiento: 1916
Libros: [Calculus Made Easy: Being a very-simplest introduction to those beautiful methods which are generally called by the terrifying names of the Differential Calculus and the Integral Calculus]

Autor: Carroll, Lewis
Fecha de nacimiento: 1832
Fecha de fallecimiento: 1898
Libros: [Alice's Adventures in Wonderland]

Menu de opciones:
1- Buscar libro por titulo
2- Listar libros registrados
3- Listar autores registrados
4- Listar autores vivos en un determinado año
5- Listar libros por idioma
0- Salir
Elija la opción a través de su número:

5
en - Ingles
es - Español
fr - Frances
pt - Portugues
Escriba el idioma deseado: 
es
--------- LIBRO ---------
Titulo: La Odisea
Autor: Homer
Idioma: es
Numero de descargas: 3340
-------------------------

--------- LIBRO ---------
Titulo: La Divina Comedia
Autor: Dante Alighieri
Idioma: es
Numero de descargas: 2254
-------------------------

--------- LIBRO ---------
Titulo: Don Quijote
Autor: Cervantes Saavedra, Miguel de
Idioma: es
Numero de descargas: 12454
-------------------------

Menu de opciones:
1- Buscar libro por titulo
2- Listar libros registrados
3- Listar autores registrados
4- Listar autores vivos en un determinado año
5- Listar libros por idioma
0- Salir
Elija la opción a través de su número:

0
2024-05-08T11:00:14.253-05:00  INFO 12072 --- [challenge-literalura] [ionShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2024-05-08T11:00:14.254-05:00  INFO 12072 --- [challenge-literalura] [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2024-05-08T11:00:14.256-05:00  INFO 12072 --- [challenge-literalura] [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
```