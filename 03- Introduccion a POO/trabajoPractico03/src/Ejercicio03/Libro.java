package Ejercicio03;

import java.time.Year;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }    

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anio) {
        int anioActual = Year.now().getValue();
        if (anio >= 1900 && anio <= anioActual) {
            this.anioPublicacion = anio;            
        }else {
            System.out.println("Año invalido, debe ser entre el año 1900 y " + anioActual);
        }
        
    }
    
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
    
}
