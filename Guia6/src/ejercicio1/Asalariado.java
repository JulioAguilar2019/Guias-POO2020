package ejercicio1;

public class Asalariado extends Empleado {

    private String departamento;

    public Asalariado(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public void metodoDeClase() {
        System.out.println("Método de clase en Asalariado");
    }

    @Override
    public void metodoDeInstancia() {
        System.out.println("Método de instancia en Asalariado");
        System.out.println("Empleado: " + this.nombre + "\n"
                + "Sueldo: " + this.sueldo + "\n"
                + "Departamento: " + this.departamento);
    }
}
