/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicacertamen2;
import java.util.Scanner;

/**
 *
 * @author vice1
 */


public class PracticaCertamen2 {
    public static void main(String[] args){
        int opcion;
        Libro libros = new Libro();
        LibroTexto librosTexto = new LibroTexto();
        TextoPUCV texto = new TextoPUCV();
        Novelas novela = new Novelas();
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al programa, que desea hacer?");
    
        do{
            System.out.println("1- Libros");
            System.out.println("2- Libros de texto");
            System.out.println("3- Libros de texto de PUCV");
            System.out.println("4- Novelas");
            opcion = input.nextInt();
        
            
            switch(opcion){
                case 1: 
                    texto.mostrarMenu();
                    break;
                case 2:
                    texto.mostrarMenuTextos();
                    break;
                case 3:
                    texto.mostrarMenuTextosPUCV();
                    break;
                case 4:
                    novela.mostrarMenuNovelas();
                    break;
        }
    
    
    
    
    
    
            }while (opcion!=0); 
    
    
    
    }
}
