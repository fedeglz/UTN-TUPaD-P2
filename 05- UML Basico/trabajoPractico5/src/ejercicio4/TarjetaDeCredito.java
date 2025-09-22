package ejercicio4;


public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaDeVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaDeVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this);
    }
    
    public void mostrarInfo() {
        System.out.println("Tarjeta: " + numero);
        System.out.println("Vence: " + fechaVencimiento);
        System.out.println("Cliente: " + cliente);
        System.out.println("Banco: " + banco);
    }
    
}
