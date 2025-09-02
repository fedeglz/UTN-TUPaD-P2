package Ejercicio05;

public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    private int combustibleMax = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }
    
    public void despegar(){
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave ha despegado.");
        }else{
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }
    
    public void avanzar(int distancia){
        int consumo = distancia / 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " km.");            
        }else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }
    
    public void recargarCombustible(int cantidad){
        if(combustible + cantidad <= combustibleMax){
            combustible += cantidad;
            System.out.println("Se recargo " + cantidad + " L.");
        }else   {
            System.out.println("El tanque de combustible esta lleno " + combustibleMax);
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + " de " + combustibleMax + " L.");
    }   
    
}
