package ejercicio4;


public class main {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Federico Gonzalez", "34549712");
        Banco banco = new Banco("Banco Nación", "30-34549712-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/30", cliente, banco);

        tarjeta.mostrarInfo();

        
        System.out.println("Tarjeta del cliente: " + cliente.getTarjeta().toString());
    }
    
}
