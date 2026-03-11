package com.example;

public class libroTextoUniajc  extends libroTexto {

    private String facultad;

    public libroTextoUniajc(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso, String universidad) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados, curso);
        this.facultad = universidad;
    }

    @Override
    public String toString() {
        return super.toString() + " Facultad: " + facultad;
    }
    
}
