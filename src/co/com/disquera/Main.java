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
public class Main {
    
    Biblioteca lista = new Biblioteca();
    
    public Main(){
        cargarDatos();
    }
    
    public void agregar(String codigo, Cancion cancion){
        lista.agregar(codigo, cancion);
    }
    
    public String[][] mostrarDatos(){
        String matriz[][] = lista.mostrarLista();
        return matriz;
    }
    
    private void cargarDatos(){
        Cancion cn = new Cancion("Siempre si", "Alexander");
        lista.agregar("1", cn);
    }
    
}
