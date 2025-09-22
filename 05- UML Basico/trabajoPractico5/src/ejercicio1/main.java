package ejercicio1;


public class main {
    
    public static void main(String[] args) {
        
        Titular titular = new Titular("Federico Gonzalez", "34646323");

        Pasaporte pasaporte = new Pasaporte(
            "AR567345", 
            "2025-09-20", 
            "fede.jpg", 
            "JPG", 
            titular
        );

        System.out.println("Pasaporte de: " + pasaporte.getTitular().getNombre());
    
        
    }
    
}
