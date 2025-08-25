package trabajopractico02;

import java.util.Scanner;


public class ejercicio04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double precio;
        String categoria;
        double descuento = 0;
        double precioFinal;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingresa su categoria: [A], [B], [C]: ");
        categoria = input.nextLine().toUpperCase();
        
        switch (categoria) {
            case "A":
                descuento = 0.10;  
                
                break;
            case "B":
                descuento = 0.15;   
                
                break;
            case "C":
                descuento = 0.20;   
                
                break;
            default:
                System.out.println("Categoria invalida");
                return;
        }
        
        precioFinal = precio - (precio * descuento);
        
        System.out.println("El descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
        
    }
    
}
