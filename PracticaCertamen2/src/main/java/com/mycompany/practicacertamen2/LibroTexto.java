/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicacertamen2;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author vice1
 */
public class LibroTexto extends Libro {
    private int curso;    
    private ArrayList <LibroTexto> librotexto = new ArrayList();


    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public ArrayList<LibroTexto> getLibrotexto() {
        return librotexto;
    }

    public void setLibrotexto(ArrayList<LibroTexto> librotexto) {
        this.librotexto = librotexto;
    }

    public LibroTexto(int curso, String autor, int precio, int id, String titulo) {
        super(autor, precio, id, titulo);
        this.curso = curso;
    }
    
    public LibroTexto(){
    
}
    
    public void mostrarMenuTextos(){
        int opcion , idLibro;
        LibroTexto librotexto = new LibroTexto();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Que desea hacer con los libros de texto?\n");
            System.out.println("1- Agregar\n");
            System.out.println("2- Mostrar\n");
            System.out.println("3- Eliminar\n");
            System.out.println("4- Actualizar\n");    
            System.out.println("0- Salir al menu anterior\n");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    librotexto.agregarLibroTexto();
                    break;
                case 2:
                    System.out.println("Ingrese la id del libro del cual desea ver la respectiva informacion:");
                    idLibro = input.nextInt();
                    librotexto.imprimirLibroTexto(idLibro);
                    break;
                case 3:
                    System.out.println("Ingrese la id del libro que desee eliminar:");
                    idLibro = input.nextInt();
                    librotexto.eliminarLibroTexto(idLibro);
                    break;
                case 4:
                    System.out.println("Ingrese la id del libro que desee cambiar su informacion:");
                    idLibro = input.nextInt();
                    librotexto.actualizarLibroTexto(idLibro);
                    break;
            }
            
        }while (opcion != 0);
        
    }

    public void imprimirLibroTexto(int idLibro){
        int i;
        for(i = 0 ; i < librotexto.size() ; i++){
            System.out.println("La informacion del libro que ha buscardo es la siguiente:\n");
            System.out.println(librotexto.get(i).getTitulo());
            System.out.println(librotexto.get(i).getPrecio());
            System.out.println(librotexto.get(i).getAutor());
            System.out.println(librotexto.get(i).getCurso());
        }
     
    }
    
    public void agregarLibroTexto(){
        System.out.println("Ingrese la informacion del libro que desea agregar:");
        Scanner input = new Scanner(System.in);
        String autor , titulo;
        int precio , id , curso;     
        System.out.println("Autor");
        autor = input.nextLine();
        System.out.println("Precio");
        precio= input.nextInt();
        System.out.println("ID");
        id= input.nextInt();
        System.out.println("Título");
        titulo= input.next(); 
        System.out.println("Curso");
        curso = input.nextInt(); 
        librotexto.add(new LibroTexto(curso ,autor , precio , id  , titulo));
    }
    
    public void  eliminarLibroTexto(int idLibro){
        int i , id;
        Scanner input = new Scanner(System.in);
        for(i = 0  ; i < librotexto.size() ; i++){
            if(librotexto.get(i).getId() == idLibro){
                librotexto.remove(i);
                System.out.println("El libro ha sido eliminado exitosamente");
            }
        }
    }
    
    public void actualizarLibroTexto(int idLibro){
        Scanner input = new Scanner(System.in);
        String autor , titulo;
        int precio , id , i , curso;
        for(i = 0 ; i < librotexto.size() ; i++){
            if(idLibro == librotexto.get(i).getId()){
                System.out.println("Por favor, ingrese los nuevos datos para actualizar la informacion del libro");
                System.out.println("Autor");
                autor = input.nextLine();
                librotexto.get(i).setAutor(autor);
                System.out.println("Precio");
                precio= input.nextInt();
                librotexto.get(i).setPrecio(precio);
                System.out.println("ID");
                id= input.nextInt();
                librotexto.get(i).setId(precio);
                System.out.println("Título");
                titulo= input.next();
                librotexto.get(i).setTitulo(titulo);
                System.out.println("Curso");
                curso = input.nextInt();
                librotexto.get(i).setCurso(curso);

            }
        }
    }    
}
