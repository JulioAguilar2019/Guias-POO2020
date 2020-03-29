package ejercicio3;

public class Video extends ArchivoMultimedia {

    public Video(String nombre, boolean formato) {
        super(nombre, formato);
    }

    @Override
    public void reproducir() {
        if (this.formato) {
            System.out.println("El archivo con nombre: " + this.nombre + " no se puede reproducir por el tipo de formato");
        } else {
            System.out.println("El archivo con nombre: " + this.nombre + " esta reproduciendose");
        }
    }
}
