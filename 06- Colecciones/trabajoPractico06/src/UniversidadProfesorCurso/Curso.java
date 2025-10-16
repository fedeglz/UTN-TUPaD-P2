package UniversidadProfesorCurso;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) {
            return;
        }
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }
        this.profesor = nuevoProfesor;
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.getCursos().add(this);
        }
    }
    
    public void mostrarInfo() {
        String profe = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + nombre + " (" + codigo + ") - Profesor: " + profe);
    }
    
    
    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }
    
    
    
    
}
