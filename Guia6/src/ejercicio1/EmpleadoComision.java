package ejercicio1;

class EmpleadoComision extends Empleado {

    private double comision;

    public EmpleadoComision(String nombre, double sueldo, double comision) {
        super(nombre, sueldo);
        this.comision = comision;
    }

    @Override
    public void metodoDeClase() {
        System.out.println("Método de clase en Empleado por comisión");
    }

    @Override
    public void metodoDeInstancia() {
        System.out.println("Método de instancia en Empleado por comisión");
        System.out.println("Empleado: " + this.nombre + "\n"
                + "Sueldo más comisión: " + this.sueldo * this.comision);
    }
}
