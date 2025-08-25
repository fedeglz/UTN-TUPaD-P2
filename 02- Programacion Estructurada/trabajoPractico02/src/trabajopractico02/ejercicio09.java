package trabajopractico02;

import java.util.Scanner;

public class ejercicio09 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, precioProducto, costoEnvio, total;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        total = calcularTotalCompra(precioProducto, costoEnvio);
        
        
        System.out.println("El costo del envio es de: " + costoEnvio);
        System.out.println("El total a pagar es de: " + total);
        
        
    }
    
    
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        }else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        }else {
            System.out.println("Zona invalida, Ingrese [Nacional] , [Internacional]");
            return 0;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
}
