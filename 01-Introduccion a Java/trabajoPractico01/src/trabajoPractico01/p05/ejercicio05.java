package trabajoPractico01.p05;

import java.util.Scanner;


public class ejercicio05 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int val1, val2, suma, resta, multiplicacion, division;
        
        System.out.print("Ingrese el 1er. valor: ");
        val1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el 2do. valor: ");
        val2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Suma: " + val1 + " + " + val2 + " = " + (val1 + val2));
        System.out.println("Resta: " + val1 + " - " + val2 + " = " + (val1 - val2));
        System.out.println("Multiplicacion: " + val1 + " x " + val2 + " = " + (val1 * val2));
        System.out.println("Division: " + val1 + " / " + val2 + " = " + (val1 / val2));
        
        
    }
    
}
