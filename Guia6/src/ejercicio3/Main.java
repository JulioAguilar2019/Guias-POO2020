package ejercicio3;

public class Main {

    public static void main(String[] args) {
        ArchivoMultimedia arc = new ArchivoMultimedia("Cancion", true);
        Audio au = new Audio("Black betty", true);
        Video vi = new Video("Cadena nacional", false);
        //identificando el tipo de archivo multimedia
        arc.reproducir();
        //reproduciendo audio
        au.reproducir();
        //reproduciendo video
        vi.reproducir();
    }

}
