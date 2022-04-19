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
    
    private String nombre;
    private String cantante;

    public Cancion(String nombre, String cantante) {
        this.nombre = nombre;
        this.cantante = cantante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
}
