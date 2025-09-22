package ejercicio1;


public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
        this.titular = titular;
        titular.setPasaporte(this);
    }

    public Titular getTitular() {
        return titular;
    }  
    
    
    
    
}


