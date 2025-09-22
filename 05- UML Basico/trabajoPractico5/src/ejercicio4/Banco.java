package ejercicio4;


public class Banco {
    
    private String nombre;
    private String cuil;

    public Banco(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuil=" + cuil + '}';
    }
    
    
    
}
