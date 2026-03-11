package com.example;

public class Libro {

    public String titulo;
    public String autor;
    public int numEjemplares;
    public int numEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }



    
}
