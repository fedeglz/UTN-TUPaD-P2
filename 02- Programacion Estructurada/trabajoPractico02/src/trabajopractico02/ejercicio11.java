package trabajopractico02;

import java.util.Scanner;


public class ejercicio11 {
    static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        calcularDescuentoEspecial(precio);
        
    }
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
}
