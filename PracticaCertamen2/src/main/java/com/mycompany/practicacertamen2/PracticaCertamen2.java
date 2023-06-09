/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicacertamen2;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vice1
 */


public class PracticaCertamen2 {
    public static void main(String[] args){
        
        int opcion = -1;
        Libro libros = new Libro();
        LibroTexto librosTexto = new LibroTexto();
        TextoPUCV texto = new TextoPUCV();
        Novelas novela = new Novelas();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1- Libros");
            System.out.println("2- Libros de texto");
            System.out.println("3- Libros de texto de PUCV");
            System.out.println("4- Novelas");
                try{
                    opcion = Integer.parseInt(input.next());
                    }catch(Exception e){
                    System.out.println("Lo introducido NO es un numero, porfavor, ingrese unicamente el valor numerico entre 1 y 4 que esta asociado en el menu"); 
            }
                    switch(opcion){
                        case 0: 
                            System.out.println("Fin del programa");
                            break;
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
                        default :
                            System.out.println("No ha ingresado un numero valido");
        }
            }while (opcion!=0);
        }
    }
    
   

