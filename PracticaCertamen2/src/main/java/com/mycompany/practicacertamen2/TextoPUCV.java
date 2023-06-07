/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicacertamen2;

/**
 *
 * @author vice1
 */
public class TextoPUCV extends LibroTexto{
    private String escuela;

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public TextoPUCV(String escuela, int curso, String autor, int precio, int id, String titulo) {
        super(curso, autor, precio, id, titulo);
        this.escuela = escuela;
    }

    public TextoPUCV(){
    
}
    public void mostrarMenuTextosPUCV(){
        System.out.println("Que desea hacer con los textos de la PUCV?\n");
        System.out.println("1- Agregar\n");
        System.out.println("2- Mostrar\n");
        System.out.println("3- Eliminar\n");
        System.out.println("4- Actualizar\n");
    }   
}
