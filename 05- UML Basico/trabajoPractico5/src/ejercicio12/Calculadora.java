package ejercicio12;


public class Calculadora {
    
    public void calcular(Impuesto impuesto){
        System.out.println("Calcular impuesto para: " 
                + impuesto.getContribuyente().getNombre()
                + " Monto: $" + impuesto.getMonto());
    }
    
}
