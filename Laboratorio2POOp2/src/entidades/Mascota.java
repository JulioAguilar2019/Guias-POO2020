package entidades;

public abstract class Mascota {

    //atributos    
    protected String nombre;
    protected int edad;

    //Metodos set
    public void setNombre(String comida) {
        this.nombre = comida;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //metodos abstractos
    public abstract void verComportamientos(int op);

    public abstract void verInfo();
}
