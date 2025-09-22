
package ejercicio6;


public class main {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Federico González", "38712345099");
        Mesa mesa = new Mesa(6, 2);
        Reserva reserva = new Reserva("2025-09-21", "21:00", cliente, mesa);

        System.out.println(reserva);
        
    }
    
}
