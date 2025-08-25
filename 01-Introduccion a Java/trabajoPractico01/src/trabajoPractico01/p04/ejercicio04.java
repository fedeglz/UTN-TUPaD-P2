package trabajoPractico01.p04;

import java.util.Scanner;


public class ejercicio04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.print("ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Tengo " + edad + " años.");
        
        
    }
}
