/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.disquera;

/**
 *
 * @author CW-DV-JDAA
 */
public class Cancion {
    private String titulo;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo constructor que permite crear la instancia de la 
     * clase cancion
     * 
     * @param titulo 
     */
    public Cancion(String titulo) {
        this.titulo = titulo;
    }
}
