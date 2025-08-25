package trabajopractico02;

import java.util.Scanner;


public class ejercicio06 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numPositivo = 0;
        int numnegativo = 0;
        int ceros = 0;
        int numero;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + " : ");
            numero = Integer.parseInt(input.nextLine());
            
            if (numero > 0) {
                numPositivo ++;                
            }else if (numero < 0){
                numnegativo ++;
            }else {
                ceros ++;
            }
                       
        }
        System.out.println(); 
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + numPositivo);
        System.out.println("Negativo: " + numnegativo);
        System.out.println("Ceros: " + ceros);        
    }
    
}
