/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disquera;

import co.com.disquera.Biblioteca;
import co.com.disquera.Cancion;

/**
 *
 * @author CW-DV-JDAA
 */
public class Disquera {

     Biblioteca lista = new Biblioteca();
     
     public Disquera(){
         cargarDatos();
     }
     
     public void agregar(String codigo, Cancion cancion){
        lista.agregar(codigo, cancion);
    }
     
     public void actualizar(String codigo, Cancion cancion){
        lista.actualizar(codigo, cancion);
    }
    
    public String[][] mostrarDatos(){
        String matriz[][] = lista.mostrarLista();
        return matriz;
    }
    
    private void cargarDatos(){
        Cancion cn = new Cancion(1,"Siempre si","2022-04-18",5,"Salsa","Bonita","Disco de swing cubano");
        lista.agregar("1", cn);
    }
    
    
}
