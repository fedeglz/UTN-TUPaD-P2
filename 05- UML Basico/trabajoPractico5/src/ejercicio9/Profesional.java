package ejercicio9;


public class Profesional {
    
    private String nombre;
    private String especialidad;
    private Paciente paciente;     
    private CitaMedica cita;       

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public String getEspecialidad() { 
        return especialidad; 
    }
    
    public Paciente getPaciente() { 
        return paciente; 
    }
    
    public void setPaciente(Paciente paciente) { 
        this.paciente = paciente; 
    }
    
    public CitaMedica getCita() { 
        return cita; 
    }
    
    public void setCita(CitaMedica cita) { 
        this.cita = cita; 
    }

    @Override
    public String toString() {
        return "Profesional{nombre='" + nombre + "', especialidad='" + especialidad + "'}";
    }
    
}
