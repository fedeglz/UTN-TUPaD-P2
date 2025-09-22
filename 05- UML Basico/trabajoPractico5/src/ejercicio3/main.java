package ejercicio3;


public class main {
    
    public static void main(String[] args) {
        
        Autor autor = new Autor("Jorge Luis Borges", "Argentina");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Ficciones", "1234567890", autor, editorial);

        libro.mostrarInfo();
        
        
    }
    
}
