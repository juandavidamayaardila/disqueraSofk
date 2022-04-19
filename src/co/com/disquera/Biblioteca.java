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
    
     public void actualizar(String codigo, Cancion cancion) {

        Cancion cancionTmp;
        cancionTmp = lista.get(codigo);
        cancionTmp.setTitulo(cancion.getTitulo());
        cancionTmp.setFecha(cancion.getFecha());
        cancionTmp.setDuracion(cancion.getDuracion());
        cancionTmp.setGenero(cancion.getGenero());
        cancionTmp.setCaratula(cancion.getCaratula()); 
        cancionTmp.setDescripcion(cancion.getDescripcion());
          
        lista.put(codigo, cancionTmp);

    }
     
    public void agregar(String codigo, Cancion cancion){
        lista.put(codigo, cancion);
    }
    
    
    public String[][] mostrarLista(){
        String matriz[][] = new String [lista.size()][7];
        Cancion cancion;
        String codigo;
        int i = 0;
        for (Map.Entry<String, Cancion> item : lista.entrySet()) {
            cancion = item.getValue();
            codigo = item.getKey();
            
            matriz[i][0] = codigo;
            matriz[i][1] = (String) cancion.getTitulo();
            matriz[i][2] = (String) cancion.getFecha();
            matriz[i][3] = "" + cancion.getDuracion();
            matriz[i][4] = (String) cancion.getGenero();
            matriz[i][5] = (String) cancion.getCaratula();
            matriz[i][6] = (String) cancion.getDescripcion();
            
            i++;
        }
        
        return matriz;
    }
}
