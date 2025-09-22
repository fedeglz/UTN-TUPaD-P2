package ejercicio2;


public class Bateria {
    
    private String tipo;
    private int capacidad;

    public Bateria(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }
    
    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
