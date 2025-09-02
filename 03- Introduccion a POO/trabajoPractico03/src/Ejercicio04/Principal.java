package Ejercicio04;


public class Principal {
    
    public static void main(String[] args) {
        
        Gallina gallina1 = new Gallina(1, 10, 0);
        Gallina gallina2 = new Gallina(2, 3, 0);
        
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        
        System.out.println("Estado de las gallinas: ");
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
        
        
        
        
    }
    
}
