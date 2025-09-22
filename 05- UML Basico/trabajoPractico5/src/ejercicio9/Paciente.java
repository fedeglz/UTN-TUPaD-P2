package ejercicio9;


public class Paciente {
    
    private String nombre;
    private String obraSocial;
    private CitaMedica cita; 

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public String getObraSocial() { 
        return obraSocial; 
    }
    
    public CitaMedica getCita() { 
        return cita; 
    }
    
    public void setCita(CitaMedica cita) { 
        this.cita = cita; 
    }

    @Override
    public String toString() {
        return "Paciente{nombre='" + nombre + "', obraSocial='" + obraSocial + "'}";
    }
    
}
