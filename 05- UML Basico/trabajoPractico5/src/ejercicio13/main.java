package ejercicio13;


public class main {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Federico González", "fede@gmail.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("QR123XYZ", usuario);
    }
    
}
