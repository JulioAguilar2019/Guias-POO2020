package ejercicio3;

public class ArchivoMultimedia {

    protected String nombre;
    protected boolean formato;

    public ArchivoMultimedia(String nombre, boolean formato) {
        this.nombre = nombre;
        this.formato = formato;
    }

    public void reproducir() {
        if (this.formato) {
            System.out.println("Audio");
        } else {
            System.out.println("Video");
        }
    }
}
