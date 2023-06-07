/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicacertamen2;


/**
 *
 * @author vice1
 */
public class LibroTexto extends Libro {
    private int curso;    

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public LibroTexto(int curso, String autor, int precio, int id, String titulo) {
        super(autor, precio, id, titulo);
        this.curso = curso;
    }
    
    public LibroTexto(){
    
}
    
    public void mostrarMenuTextos(){
        System.out.println("Que desea hacer con los libros de texto?\n");
        System.out.println("1- Agregar\n");
        System.out.println("2- Mostrar\n");
        System.out.println("3- Eliminar\n");
        System.out.println("4- Actualizar\n");
    }    
}
