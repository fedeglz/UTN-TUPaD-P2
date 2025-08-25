package trabajopractico02;

import java.util.Scanner;


public class ejercicio05 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int sumaPares = 0;
        
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = Integer.parseInt(input.nextLine());
        
        while(numero != 0) {
            if(numero % 2 == 0){
                sumaPares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());
        } 
        
        System.out.println("La suma de los numeros pares es: " + sumaPares);       
        
    }
    
}
