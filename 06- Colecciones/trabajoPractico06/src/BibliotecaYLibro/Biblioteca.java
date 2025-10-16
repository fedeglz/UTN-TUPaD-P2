package BibliotecaYLibro;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro agregado: " + titulo);
    }
    
    public void listarLibros(){
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("Listado de libros en la biblioteca " + nombre + ":");
        for (Libro l : libros) {
            l.mostrarInfo();            
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        for (Libro l : libros) {
            if(l.getIsbn().equalsIgnoreCase(isbn)){
                return l;
            }
        }
        return null;
    }
    
    public void eliminarLibro(String isbn){
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if(encontrado != null){
            libros.remove(encontrado);
            System.out.println("Libro eliminado: " + encontrado.getTitulo());
        }else{
            System.out.println("Libro no encontrado con ISBN: " + isbn);
        }
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio){
        System.out.println("Libros publicados en " + anio + " :");
        for (Libro l : libros) {
            if(l.getAnioPublicacion() == anio){
                l.mostrarInfo();
            }            
        }
    }
    
    public void mostrarAutoresDisponibles(){
        System.out.println("Autores disponibles en la biblioteca: ");
        libros.stream().map(l -> l.getAutor().getNombre()).distinct().forEach(System.out::println);
    }
       
    
}
