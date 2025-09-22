package ejercicio7;

public class Conductor {

    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String numbre, String licencia) {
        this.nombre = numbre;
        this.licencia = licencia;
    }

    public Vehiculo getVeiculo() {
        return vehiculo;
    }

    public void setVeiculo(Vehiculo veiculo) {
        this.vehiculo = veiculo;
    }

    @Override
    public String toString() {
        return nombre + " (Licencia: " + licencia + ")";
    }

}
