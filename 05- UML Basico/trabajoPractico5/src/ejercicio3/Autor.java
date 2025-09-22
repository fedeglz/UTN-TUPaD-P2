package ejercicio3;


public class Autor {
    
    private String Nombre;
    private String nacionalidad;

    public Autor(String Nombre, String nacionalidad) {
        this.Nombre = Nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "Nombre=" + Nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
}
