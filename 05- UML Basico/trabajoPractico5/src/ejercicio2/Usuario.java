package ejercicio2;


public class Usuario {
    
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni, Celular celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }  
    
    
    
}
