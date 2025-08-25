package trabajopractico02;


public class ejercicio13 {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        imprimirArray(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados: ");
        imprimirArray(precios, 0);
        
    }
    
    public static void imprimirArray(double[] array, int indice){
        if (indice < array.length){
            System.out.println("Precio: $" +array[indice]);
            imprimirArray(array, indice + 1);
        }
    }
    
}
