/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.disquera;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author CW-DV-JDAA
 */
public class Biblioteca {
    HashMap<String, Cancion> lista;

    public Biblioteca() {
         lista = new HashMap<>();
    }
    
    
    public void agregar(String codigo, Cancion cancion){
        lista.put(codigo, cancion);
    }
    
    
    public String[][] mostrarLista(){
        String matriz[][] = new String [lista.size()][2];
        Cancion cancion;
        String codigo;
        int i = 0;
        for (Map.Entry<String, Cancion> item : lista.entrySet()) {
            cancion = item.getValue();
            codigo = item.getKey();
            
            matriz[i][0] = codigo;
            matriz[i][1] = (String) cancion.getNombre();
            matriz[i][2] = (String) cancion.getCantante();
            
            i++;
        }
        
        return matriz;
    }
}
