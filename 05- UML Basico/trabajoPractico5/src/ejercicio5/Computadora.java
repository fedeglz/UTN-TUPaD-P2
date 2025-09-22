package ejercicio5;


public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
        this.propietario = propietario;
        propietario.setComputadora(this);
    }
    
    public void mostrarInfo() {
        System.out.println("Computadora:");
        System.out.println("Marca: " + marca);
        System.out.println("Número de serie: " + numeroSerie);
        System.out.println("Placa Madre: " + placaMadre);
        System.out.println("Propietario: " + propietario);
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + ", propietario=" + propietario + '}';
    }

   
    
    
    
}
