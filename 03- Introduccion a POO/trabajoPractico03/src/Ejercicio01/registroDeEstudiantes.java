package Ejercicio01;


public class registroDeEstudiantes {
    
    public static void main(String[] args) {
        
        Estudiante est = new Estudiante("Federico", "González", "Programacion II", 6);
        est.mostrarInfo();
        
         System.out.println("\nSubiendo calificación...");
        est.subirCalificacion(2.0);
        est.mostrarInfo();

        System.out.println("\nBajando calificación...");
        est.bajarCalificacion(0.5);
        est.mostrarInfo();
        
    }
    
}
