package ejercicio3;


public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("isbn: " + isbn);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
    }
    
}
