package Ejercicio03;


public class Principal {
    
    public static void main(String[] args) {       
        
        
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        libro.mostrarInfo();

        System.out.println("\nIntentando modificar el año con un valor inválido: ");
        libro.setAnioPublicacion(1300); // no debe permitirlo
        libro.mostrarInfo();

        System.out.println("\nModificando con un año válido: ");
        libro.setAnioPublicacion(2000);
        libro.mostrarInfo();
    }
}

        
        
    
    

