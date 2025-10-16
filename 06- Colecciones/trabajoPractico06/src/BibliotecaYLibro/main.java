package BibliotecaYLibro;


public class main {
    public static void main(String[] args) {
        
        Autor a1 = new Autor("01", "Julio Cortázar", "Argentina");
        Autor a2 = new Autor("02", "Isabel Allende", "Chile");
        Autor a3 = new Autor("03", "Gabriel García Márquez", "Colombia");
        
        Biblioteca biblio = new Biblioteca("Biblioteca Central UTN");
        
        biblio.agregarLibro("01", "Rayuela", 1963, a1);
        biblio.agregarLibro("02", "La casa de los espíritus", 1982, a2);
        biblio.agregarLibro("03", "Cien años de soledad", 1967, a3);
        biblio.agregarLibro("04", "Bestiario", 1951, a1);
        biblio.agregarLibro("05", "Eva Luna", 1987, a2);

        System.out.println("\n------------------------------------------");
        biblio.listarLibros();
        
        System.out.println("\n------------------------------------------");
        System.out.println("Buscando libro con ISBN 03...");
        Libro encontrado = biblio.buscarLibroPorIsbn("03");
        if (encontrado != null) encontrado.mostrarInfo();

        System.out.println("\n------------------------------------------");
        biblio.filtrarLibrosPorAnio(1982);

        System.out.println("\n------------------------------------------");
        biblio.eliminarLibro("04");

        System.out.println("\n------------------------------------------");
        System.out.println("Cantidad total de libros: " + biblio.obtenerCantidadLibros());

        System.out.println("\n------------------------------------------");
        biblio.mostrarAutoresDisponibles();

    
    }
    
}
