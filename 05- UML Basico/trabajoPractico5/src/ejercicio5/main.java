package ejercicio5;

public class main {

    public static void main(String[] args) {

        Propietario propietario = new Propietario("Federico González", "34692605");

        Computadora compu = new Computadora("HP", "SN-987654", "Asus TUF B450", "AMD B450", propietario);

        compu.mostrarInfo();

        System.out.println("Computadora del propietario: " + propietario.getComputadora());

    }

}
