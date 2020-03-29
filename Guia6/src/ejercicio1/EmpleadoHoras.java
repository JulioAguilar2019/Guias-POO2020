package ejercicio1;

public class EmpleadoHoras extends Empleado {

    private int horas;

    public EmpleadoHoras(String nombre, double sueldo, int horas) {
        super(nombre, sueldo);
        this.horas = horas;
    }

    @Override
    public void metodoDeClase() {
        System.out.println("Método de clase en Empleado por hora");
    }

    @Override
    public void metodoDeInstancia() {
        System.out.println("Método de instancia en Empleado por hora");
        System.out.println("Empleado: " + this.nombre + "\n"
                + "Sueldo diario: " + this.sueldo * this.horas);
    }
}
