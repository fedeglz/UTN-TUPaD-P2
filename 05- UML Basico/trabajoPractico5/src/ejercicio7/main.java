package ejercicio7;


public class main {
    public static void main(String[] args) {
        
        Motor motor = new Motor("Nafta", "MTR-443322");
        Conductor conductor = new Conductor("Federico González", "LIC-998877");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Renault Duster", motor, conductor);

        System.out.println(vehiculo);
        System.out.println("Vehículo del conductor: " + conductor.getVeiculo());
    }
    
}
