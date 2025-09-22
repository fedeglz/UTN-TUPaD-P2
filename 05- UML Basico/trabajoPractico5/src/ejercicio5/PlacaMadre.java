package ejercicio5;


public class PlacaMadre {
    
    private String nombre;
    private String chipset;

    public PlacaMadre(String nombre, String chipset) {
        this.nombre = nombre;
        this.chipset = chipset;
    }

    public String getNombre() {
        return nombre;
    }

    public String getChipset() {
        return chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "nombre=" + nombre + ", chipset=" + chipset + '}';
    }
    
    
    
    
}
