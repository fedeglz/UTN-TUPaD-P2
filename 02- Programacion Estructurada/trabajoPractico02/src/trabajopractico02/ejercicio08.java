package trabajopractico02;

import java.util.Scanner;


public class ejercicio08 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento, precioFinal;
        
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine()) / 100;
        
        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine()) / 100;
        
        
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es de: " + precioFinal);
        
    }
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
    
    
}
