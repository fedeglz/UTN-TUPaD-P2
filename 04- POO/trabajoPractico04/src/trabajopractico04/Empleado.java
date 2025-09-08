package trabajopractico04;


public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;        
        totalEmpleados++;
    }
    
    
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000;        
        totalEmpleados++;
    }
    
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * porcentaje / 100;
    }
    
    public void actualizarSalario(int aumentoFijo){
        this.salario += aumentoFijo;
    }
    
    @Override
    public String toString(){
        return "Empleado {" +
                ", nombre = " + nombre + "\"" +
                ", puesto = " + puesto + "\"" +
                ", salario = " + salario +
                "}";
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }   
    
}
