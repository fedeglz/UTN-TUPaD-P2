package ejercicio10;


public class main {
    public static void main(String[] args) {
        
        ClaveSeguridad clave = new ClaveSeguridad("123ABC", "2025-09-22");
        Titular titular = new Titular("Federico González", "34460724");
        CuentaBancaria cuenta = new CuentaBancaria("000123456789", 15000.50, clave, titular);

        System.out.println(cuenta);
        System.out.println("El titular conoce su cuenta: " + titular.getCuenta());
    }
    
}
