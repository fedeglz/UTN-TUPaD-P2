package ejercicio9;


public class CitaMedica {
    
    private String fecha;
    private String hora;
    private Paciente paciente;       
    private Profesional profesional; 

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFecha() { 
        return fecha; 
    }
    
    public String getHora() { 
        return hora; 
    }
    
    public Paciente getPaciente() { 
        return paciente; 
    }
    
    public Profesional getProfesional() { 
        return profesional; 
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
        paciente.setCita(this); 
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
        profesional.setCita(this);  
        profesional.setPaciente(this.paciente); 
    }

    @Override
    public String toString() {
        return "CitaMedica{fecha='" + fecha + "', hora='" + hora +
                "', paciente=" + paciente +
                ", profesional=" + profesional + "}";
    }
}
