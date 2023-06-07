/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicacertamen2;

/**
 *
 * @author vice1
 */
public class Novelas extends Libro {
    private String histórica, romántica, policíaca, realista, cienciaficción ,aventuras;

    public String getHistórica() {
        return histórica;
    }

    public void setHistórica(String histórica) {
        this.histórica = histórica;
    }

    public String getRomántica() {
        return romántica;
    }

    public void setRomántica(String romántica) {
        this.romántica = romántica;
    }

    public String getPolicíaca() {
        return policíaca;
    }

    public void setPolicíaca(String policíaca) {
        this.policíaca = policíaca;
    }

    public String getRealista() {
        return realista;
    }

    public void setRealista(String realista) {
        this.realista = realista;
    }

    public String getCienciaficción() {
        return cienciaficción;
    }

    public void setCienciaficción(String cienciaficción) {
        this.cienciaficción = cienciaficción;
    }

    public String getAventuras() {
        return aventuras;
    }

    public void setAventuras(String aventuras) {
        this.aventuras = aventuras;
    }

    public Novelas(String histórica, String romántica, String policíaca, String realista, String cienciaficción, String aventuras, String autor, int precio, int id, String titulo) {
        super(autor, precio, id, titulo);
        this.histórica = histórica;
        this.romántica = romántica;
        this.policíaca = policíaca;
        this.realista = realista;
        this.cienciaficción = cienciaficción;
        this.aventuras = aventuras;
    }
    
    public Novelas(){
        
    }
    public void mostrarMenuNovelas(){
        System.out.println("Que desea hacer con las novelas?\n");
        System.out.println("1- Agregar\n");
        System.out.println("2- Mostrar\n");
        System.out.println("3- Eliminar\n");
        System.out.println("4- Actualizar\n");
    }   
}
