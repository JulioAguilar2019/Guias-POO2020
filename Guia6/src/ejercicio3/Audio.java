package ejercicio3;

public class Audio extends ArchivoMultimedia {

    public Audio(String nombre, boolean formato) {
        super(nombre, formato);
    }

    @Override
    public void reproducir() {
        if (this.formato) {
            System.out.println("El archivo con nombre: " + this.nombre + " esta reproduciendose");
        } else {
            System.out.println("El archivo con nombre: " + this.nombre + " no se puede reproducir por el tipo de formato");
        }
    }
}
