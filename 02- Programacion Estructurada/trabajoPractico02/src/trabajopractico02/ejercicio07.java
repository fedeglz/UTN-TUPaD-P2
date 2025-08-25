package trabajopractico02;

import java.util.Scanner;


public class ejercicio07 {
    
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0 - 10): ");
            nota = Integer.parseInt(inpunt.nextLine());
        
            if (nota < 0 || nota > 10) {
            System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");            
            }
            
        }while(nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente");      
        
    }
    
}
