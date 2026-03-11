# Demo - Sistema de Gestión de Libros

Un proyecto Java que implementa un sistema de gestión de bibliotecas usando Maven.

## Descripción

Este proyecto proporciona una aplicación Java que permite gestionar libros en una biblioteca, incluyendo funcionalidades de préstamo y devolución.

## Estructura del Proyecto

```
demo/
├── pom.xml                    # Configuración de Maven
├── README.md                  # Este archivo
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/example/
    │   │       ├── Main.java      # Clase principal
    │   │       ├── Libro.java     # Modelo base de Libro
    │   │       └── libroTexto.java # Modelo de Libro de Texto
    │   └── resources/             # Archivos de recursos
    └── test/
        └── java/                  # Tests unitarios
```

## Clases del Modelo

### Libro.java
Clase base que representa un libro en la biblioteca.

**Atributos:**
- `titulo`: Título del libro
- `autor`: Autor del libro
- `numEjemplares`: Número total de ejemplares disponibles
- `numEjemplaresPrestados`: Número de ejemplares prestados

**Métodos:**
- `prestamo()`: Realiza el préstamo de un libro si hay ejemplares disponibles
- `devolucion()`: Registra la devolución de un libro
- Getters y setters para todos los atributos
- `toString()`: Representación en texto del objeto

### libroTexto.java
Clase que hereda de `Libro` y representa un libro de texto específico para cursos académicos.

**Herencia:** Extiende la clase `Libro`

**Atributos adicionales:**
- `curso`: Curso académico al que pertenece el libro de texto

**Métodos:**
- Hereda todos los métodos de la clase `Libro`
- Getters y setters para el atributo `curso`

## Historial de Cambios

### creando clase libro texto, con su atributo y herendando de libro
- Se creó la clase `libroTexto` que hereda de `Libro`
- Se agregó el atributo `curso` para libros de texto
- Implementación de herencia en el modelo

### agregando metodos
- Se añadieron métodos principales para la gestión de libros
- Implementación de funcionalidades de préstamo y devolución

## Propiedades Técnicas

- **Java Version**: 17
- **Maven Compiler Source**: 17
- **Maven Compiler Target**: 17

## Licencia

Este proyecto está bajo licencia MIT.

## Autor

Desarrollado como parte de un proyecto de demostración.
