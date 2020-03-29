package ejercicio1;

public class Main {

    public static void main(String[] args) {
        Empleado emp = new Empleado("Michelle", 300);
        EmpleadoHoras empH = new EmpleadoHoras("Adriana", 2, 8);
        EmpleadoComision empC = new EmpleadoComision("Giovanni", 300, 30);
        Asalariado asa = new Asalariado("Walter", 350);
        //Metodo de instancia de la clase empleado
        emp.metodoDeInstancia();
        System.out.println("-------------------------------");
        //metodo de instancia de la clase empleado por hora
        emp = empH;
        emp.metodoDeInstancia();
        System.out.println("-------------------------------");
        //metodo de isntancia de la clase empleado por comision
        emp = empC;
        emp.metodoDeInstancia();
        System.out.println("-------------------------------");
        //metodo de instancia de la clase asalariado
        emp = asa;
        emp.metodoDeInstancia();
        System.out.println("-------------------------------");
    }

}
