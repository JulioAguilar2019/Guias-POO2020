package ejercicio1;

public class Empleado {

    protected String nombre;
    protected double sueldo;

    //constructor vacio
    public Empleado() {

    }

    //constructor con parametros
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Metodos get
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    //metodos de comportamiento
    public void metodoDeClase() {
        System.out.println("Método de clase en Empleado");

    }

    public void metodoDeInstancia() {
        System.out.println("Método de instancia en Empleado");
        System.out.println("Empleado: " + this.nombre + "\n"
                + "Sueldo: " + this.sueldo);
    }

}
