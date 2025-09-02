package Ejercicio05;


public class Principal {
    
    public static void main(String[] args) {
        
        NaveEspacial nave = new NaveEspacial("Apollo 11", 50);
        nave.mostrarEstado();

        System.out.println("\nIntentando avanzar sin recargar: ");
        nave.avanzar(120); 

        System.out.println("\nRecargando combustible: ");
        nave.recargarCombustible(30);
        nave.mostrarEstado();

        System.out.println("\nDespegando: ");
        nave.despegar();
        nave.mostrarEstado();

        System.out.println("\nAvanzando 40 km: ");
        nave.avanzar(40);
        nave.mostrarEstado();
        
    }
    
}
