package ejercicio11;


public class main {
    public static void main(String[] args) {
        
        Artista artista = new Artista("Gustavo Cerati", "Rock");
        Cancion cancion = new Cancion("Crimen", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
        
        
    }
}
