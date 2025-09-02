package Ejercicio02;


public class Principal {
    public static void main(String[] args) {
           
        Mascota mascota = new Mascota("Anibal", "Perro", 9);
        mascota.mostrarInfo();

        System.out.println("\nCumpliendo años: ");
        mascota.cumplirAnios();
        mascota.mostrarInfo();
    }
}

        
