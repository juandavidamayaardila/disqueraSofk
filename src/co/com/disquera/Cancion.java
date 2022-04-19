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
    private int identificador;
    private String fecha;
    
    public Cancion(){}

    public Cancion( int identificador,String titulo, String fecha, int duracion, String genero, String caratula, String descripcion) {
        this.titulo = titulo;
        this.identificador = identificador;
        this.fecha = fecha;
        this.duracion = duracion;
        this.genero = genero;
        this.caratula = caratula;
        this.descripcion = descripcion;
    }
    private int duracion;
    private String genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    private String caratula;
    private String descripcion;
}
