package trabajoPractico01.p09;

import java.util.Scanner;

public class ejercicio09 {

    public static void main(String[] args) {    

        Scanner scanner = new Scanner(System.in);

        System.out.print ("Ingresa tu nombre: ");
        /*String nombre = scanner.nextInt();  ERROR --> el Error es porque al poner un .nextInt() el programa espera que el usuario ingrese un numero entero y no un String.*/
        String nombre = scanner.nextLine(); // para que devuelva un String hay que escribir un .nextLine(). Y asi el Programa va a funcionar correctamente.

        System.out.println (
    

        "Hola, " + nombre);
    }
                            
    
}
