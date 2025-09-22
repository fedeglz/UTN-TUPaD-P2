package ejercicio2;


public class main {
    
    public static void main(String[] args) {
        
        Bateria bateria = new Bateria("Li-Ion", 4500);

        Celular celular = new Celular(
            "Samsung",
            "Galaxy A54",
            "434300056323",
            bateria,
            null 
        );

        Usuario usuario = new Usuario("Federico Gonzalez", "34689434", celular);

       
        celular.setUsuario(usuario);

        
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("DNI: " + usuario.getDni());
        System.out.println("Marca de celular: " + usuario.getCelular().getMarca());
        System.out.println("Modelo: " + usuario.getCelular().getModelo());
        System.out.println("IMEI: " + usuario.getCelular().getImei());
        System.out.println("Tipo de batería: " + usuario.getCelular().getBateria().getTipo());
        System.out.println("Capacidad: " + usuario.getCelular().getBateria().getCapacidad() + "mAh");
    }
}
