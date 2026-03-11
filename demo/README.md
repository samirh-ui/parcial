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
    │   │       ├── Main.java              # Clase principal con demostración
    │   │       ├── Libro.java             # Modelo base de Libro
    │   │       ├── Novela.java            # Modelo de Novela
    │   │       ├── libroTexto.java        # Modelo de Libro de Texto
    │   │       └── libroTextoUniajc.java  # Modelo de Libro de Texto UNIAJC
    │   └── resources/                     # Archivos de recursos
    └── test/
        └── java/                          # Tests unitarios
```

## Clases del Modelo

### Main.java
Clase principal que demuestra el funcionamiento del sistema de gestión de libros.

**Funcionalidad:**
- Creación de instancias de diferentes tipos de libros (`Libro`, `libroTextoUniajc`, `Novela`)
- Demostración de métodos de préstamo y devolución
- Entrada de datos por consola para crear libros dinámicamente
- Impresión de información de todos los libros creados

**Métodos principales:**
- `main(String[] args)`: Método principal que ejecuta la demostración del sistema

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

### Novela.java
Clase que hereda de `Libro` y representa una novela literaria.

**Herencia:** Extiende la clase `Libro`

**Atributos adicionales:**
- `tipo`: Tipo o género de la novela (ej: romance, misterio, ciencia ficción, etc.)

**Constructores:**
- `Novela(String titulo, String autor, int numeroEjemplares, int numeroPrestados, String tipo)`: Constructor que inicializa todos los atributos incluyendo los heredados

**Métodos:**
- Hereda todos los métodos de la clase `Libro`
- `toString()`: Sobrescribe el método para incluir información del tipo de novela

### libroTexto.java
Clase que hereda de `Libro` y representa un libro de texto específico para cursos académicos.

**Herencia:** Extiende la clase `Libro`

**Atributos adicionales:**
- `curso`: Curso académico al que pertenece el libro de texto

**Constructores:**
- `libroTexto(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso)`: Constructor que inicializa todos los atributos incluyendo los heredados

**Métodos:**
- Hereda todos los métodos de la clase `Libro`
- `getCurso()`: Obtiene el curso del libro de texto
- `setCurso(String curso)`: Establece el curso del libro de texto
- `toString()`: Sobrescribe el método para incluir información del curso

### libroTextoUniajc.java
Clase que hereda de `libroTexto` y representa un libro de texto específico de la Universidad UNIAJC.

**Herencia:** Extiende la clase `libroTexto` (que a su vez extiende `Libro`)

**Atributos adicionales:**
- `facultad`: Facultad de la Universidad UNIAJC a la que pertenece el libro

**Constructores:**
- `libroTextoUniajc(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso, String universidad)`: Constructor que inicializa todos los atributos incluyendo los heredados

**Métodos:**
- Hereda todos los métodos de las clases `libroTexto` y `Libro`
- `toString()`: Sobrescribe el método para incluir información de la facultad

## Análisis de Herencia

### Situaciones donde NO se podría realizar la herencia

1. **Herencia múltiple directa**: No se puede heredar directamente de múltiples clases padre al mismo tiempo. Por ejemplo, no se puede crear una clase que herede tanto de `Libro` como de otra clase `Publicacion` simultáneamente.

2. **Herencia de clases finales**: No se puede heredar de clases marcadas como `final`. Si `Libro` fuera declarada como `final class Libro`, ninguna clase podría heredar de ella.

### Nuevos atributos y métodos sugeridos

**Nuevos atributos:**
1. `fechaPublicacion`: Para almacenar la fecha de publicación del libro
2. `isbn`: Código ISBN único para identificación internacional del libro

**Nuevo método:**
1. `estaDisponible()`: Método que retorna `true` si hay ejemplares disponibles para préstamo (es decir, `numEjemplares > numEjemplaresPrestados`)

## Historial de Cambios

### creando la calse main y llamando los objetos con sus metodos
- Se implementó la clase `Main` con funcionalidad completa
- Creación de instancias de `Libro`, `libroTextoUniajc` y `Novela`
- Demostración de métodos `prestamo()` y `devolucion()`
- Implementación de entrada de datos por consola
- Impresión de información de todos los objetos creados

### creando clase novela con su atribuetos, sus metodos y hereda de libro
- Se creó la clase `Novela` que hereda de `Libro`
- Se agregó el atributo `tipo` para clasificar el género de la novela
- Se implementó constructor completo y método `toString()` sobrescrito

### creando clase libro tecto uniajc, con sus atributos, constructor y metodos
- Se creó la clase `libroTextoUniajc` que hereda de `libroTexto`
- Se agregó el atributo `facultad` para libros de texto de UNIAJC
- Se implementó constructor completo y método `toString()` sobrescrito
- Extensión de la jerarquía de herencia: Libro → libroTexto → libroTextoUniajc

### agrendo metodos get y set
- Se agregaron métodos getter y setter para el atributo `curso` en `libroTexto`
- Se implementó constructor completo para la clase `libroTexto`
- Se sobrescribió el método `toString()` para incluir información del curso

### creando clase libro texto, con su atributo y herendando de libro
- Se creó la clase `libroTexto` que hereda de `Libro`
- Se agregó el atributo `curso` para libros de texto
- Implementación de herencia en el modelo

### agregando metodos
- Se añadieron métodos principales para la gestión de libros
- Implementación de funcionalidades de préstamo y devolución

## Análisis de Herencia y Limitaciones

### Situaciones donde NO se podría realizar la herencia (0.5 puntos)

#### Situación 1: Clase con modificador `final`
Si la clase `Libro` fuera declarada como `final`:
```java
public final class Libro {
    // atributos y métodos...
}
```
**Problema:** Las clases `libroTexto`, `Novela` y `libroTextoUniajc` NO podrían heredar de `Libro` porque una clase final no puede ser extendida.

**Fragmento problemático:**
```java
public final class Libro { }  // Con final
public class libroTexto extends Libro { }  // ❌ Error: Cannot extend final class
```

#### Situación 2: Constructor privado sin alternativa
Si el constructor de `Libro` fuera privado:
```java
public class Libro {
    private Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        // ...
    }
}
```
**Problema:** Las subclases NO podrían llamar al constructor de la clase padre mediante `super()`, lo que impediría la herencia funcional.

**Fragmento problemático:**
```java
public class libroTexto extends Libro {
    public libroTexto(...) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados);  // ❌ Error: Constructor is private
    }
}
```

### Nuevos atributos y métodos propuestos (0.5 puntos)

#### Nuevos Atributos:
1. **`fechaPublicacion` (Date o String)**: Registra la fecha de publicación del libro para mantener un historial y controlar la antigüedad.
   ```java
   private String fechaPublicacion;  // Formato: "YYYY-MM-DD"
   ```

2. **`isbn` (String)**: Código ISBN único para identificar cada libro de forma única en el sistema.
   ```java
   private String isbn;  // Ejemplo: "978-0-13-110362-7"
   ```

#### Método Adicional:
**`calcularDisponibilidad()`**: Calcula y retorna cuántos ejemplares están disponibles para prestar.
```java
public int calcularDisponibilidad() {
    return numEjemplares - numEjemplaresPrestados;
}
```
**Utilidad:** Permite consultar rápidamente la cantidad de ejemplares disponibles sin realizar cálculos manuales en la clase `Main`.

## Propiedades Técnicas

- **Java Version**: 17
- **Maven Compiler Source**: 17
- **Maven Compiler Target**: 17

## Licencia

Este proyecto está bajo licencia MIT.

## Autor

Desarrollado como parte de un proyecto de demostración.
