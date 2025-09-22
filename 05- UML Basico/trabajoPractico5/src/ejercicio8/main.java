package ejercicio8;


public class main {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Federico González", "fede@gmail.com");
        FirmaDigital firma = new FirmaDigital("abc123hash", "2025-09-22", usuario);
        Documento documento = new Documento("Contrato", "Contenido del contrato...", firma);

        System.out.println(documento);
    }
    
}
