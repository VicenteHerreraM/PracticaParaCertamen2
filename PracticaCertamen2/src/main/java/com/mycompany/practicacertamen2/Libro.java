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
public class Libro {
    private Libro libro;
    private ArrayList <Libro> libros = new ArrayList();
    private ArrayList <TextoPUCV> textosPUCV = new ArrayList();
    private ArrayList <Novelas> novelas = new ArrayList();
    private String autor;
    private int precio;
    private int id;
    private String titulo;

    public Libro(String autor, int precio, int id, String titulo) {
        this.autor = autor;
        this.precio = precio;
        this.id = id;
        this.titulo = titulo;
    }
    
    public Libro(){
        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    

    
    public void mostrarMenu(){
        int opcion , idLibro;
        Libro libro = new Libro();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Que desea hacer con los libros?\n");
            System.out.println("1- Agregar\n");
            System.out.println("2- Mostrar\n");
            System.out.println("3- Eliminar\n");
            System.out.println("4- Actualizar\n");    
            System.out.println("0- Salir al menu anterior\n");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    libro.agregarLibro();
                    break;
                case 2:
                    System.out.println("Ingrese la id del libro del cual desea ver la respectiva informacion:");
                    idLibro = input.nextInt();
                    libro.imprimirLibro(idLibro);
                    break;
                case 3:
                    System.out.println("Ingrese la id del libro que desee eliminar:");
                    idLibro = input.nextInt();
                    libro.eliminarLibro(idLibro);
                    break;
                case 4:
                    System.out.println("Ingrese la id del libro que desee cambiar su informacion:");
                    idLibro = input.nextInt();
                    libro.actualizarLibro(idLibro);
                    break;
            }
            
        }while (opcion != 0);
        
    }
    
    
    public void imprimirLibro(int idLibro){
        int i;
        for(i = 0 ; i < libros.size() ; i++){
            System.out.println("La informacion del libro que ha buscardo es la siguiente:\n");
            System.out.println(libros.get(i).getTitulo());
            System.out.println(libros.get(i).getPrecio());
            System.out.println(libros.get(i).getAutor());
            
        }
     
    }
    
    public void agregarLibro(){
        System.out.println("Ingrese la informacion del libro que desea agregar:");
        Scanner input = new Scanner(System.in);
        String autor , titulo;
        int precio , id;     
        System.out.println("Autor");
        autor = input.nextLine();
        System.out.println("Precio");
        precio= input.nextInt();
        System.out.println("ID");
        id= input.nextInt();
        System.out.println("Título");
        titulo= input.next(); //Actualmente esta agregando unicamente la primera palabra que encuentra.
        libros.add(new Libro(autor , precio , id , titulo));
    }
    
    public void  eliminarLibro(int idLibro){
        int i , id;
        Scanner input = new Scanner(System.in);
        for(i = 0  ; i < libros.size() ; i++){
            if(libros.get(i).getId() == idLibro){
                libros.remove(i);
            }
        }
    }
    
    public void actualizarLibro(int idLibro){
        Scanner input = new Scanner(System.in);
        String autor , titulo;
        int precio , id , i;
        for(i = 0 ; i < libros.size() ; i++){
            if(idLibro == libros.get(i).getId()){
                System.out.println("Por favor, ingrese los nuevos datos para actualizar la informacion del libro");
                System.out.println("Autor");
                autor = input.nextLine();
                libros.get(i).setAutor(autor);
                System.out.println("Precio");
                precio= input.nextInt();
                libros.get(i).setPrecio(precio);
                System.out.println("ID");
                id= input.nextInt();
                libros.get(i).setId(precio);
                System.out.println("Título");
                titulo= input.next();
                libros.get(i).setTitulo(titulo);
            }
        }
    }
}
