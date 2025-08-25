package trabajopractico02;

import java.util.Scanner;


public class ejercicio01 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingrese el año: ");
        anio = Integer.parseInt(input.nextLine());
        
        //Verificar si el año es bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.print("El año " + anio + " es bisiesto");            
        }else  {
            System.out.print("El año " + anio + " no es bisiesto");
        }       
        System.out.println();
    }
}
