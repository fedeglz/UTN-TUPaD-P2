package trabajoPractico01.p08;

import java.util.Scanner;


public class ejercicio08 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese el 1er. número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el do. número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("La division entera entre " + num1 + " / " + num2 + " = " + num1 / num2);
        
        System.out.println("La division entera entre " + num1 + " / " + num2 + " = " + (double) num1 / num2);
        
        
    }
}
