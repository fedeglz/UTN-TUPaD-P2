package ejercicio12;

public class main {

    public static void main(String[] args) {

        Contribuyente c1 = new Contribuyente("Federico González", "20-30111222-3");
        Impuesto impuesto = new Impuesto(15000, c1);

        Calculadora calc = new Calculadora();
        calc.calcular(impuesto);

    }

}
