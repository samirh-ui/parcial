package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Libro libro1 = new Libro("las aventuras de samir", "Samir Hurtado", 5, 2);
     
     Libro libro2 = new Libro();

     System.out.println("Ingrese el nombre del libro:");
     libro2.setTitulo(sc.nextLine());

     System.out.println("Ingrese el autor del libro:");
     libro2.setAutor(sc.nextLine());

     System.out.println("Ingrese el numero de ejemplares:");
     libro2.setNumEjemplares(sc.nextInt());

     libro2.setNumEjemplaresPrestados(0);

     libroTextoUniajc libro3 = new libroTextoUniajc("Matematicas", "Alexandre", 10, 3, "Matematicas", "Ingenieria");

     Novela novela = new Novela("El Gran Gatsby", "F. Scott Fitzgerald", 7, 1, "Novela Clásica");
     
     libro1.prestamo();
     libro1.devolucion();


     System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(novela);
    }
}