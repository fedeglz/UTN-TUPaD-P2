package trabajopractico02;


public class ejercicio12 {
    
    public static void main(String[] args) {
        double [] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("\nPrecios originales: ");
        for(double precio : precios){
            System.out.println("Precio: $" + precio);
        }
        
        precios[2] = 129.00;
        
        System.out.println("\nPrecios modificados");
        for(double precio : precios){
            System.out.println("Precio: $" + precio);    
        }
    }
    
}
