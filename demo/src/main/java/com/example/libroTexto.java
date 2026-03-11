package com.example;

public class libroTexto  extends Libro{
    private String curso;


    public libroTexto(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override   
    public String toString() {
        return super.toString() + "Curso: " + curso;
    }

    



    
    
}
