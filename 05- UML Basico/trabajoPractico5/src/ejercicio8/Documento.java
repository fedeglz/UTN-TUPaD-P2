package ejercicio8;


public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital;
    }

    @Override
    public String toString() {
        return "Documento{" + 
                "titulo=" + titulo + 
                ", contenido=" + contenido + 
                ", firmaDigital=" + firmaDigital + '}';
    }
    
    
    
}
