package ejercicio2;

public class Pago {

    protected double saldo;
    protected double deposito;

    public Pago(double saldo, double deposito) {
        this.saldo = saldo;
        this.deposito = deposito;
    }

    //metodos de comportamiento
    public void pagar() {
        System.out.println("Pago");
        if (deposito < saldo) {
            System.out.println("Saldo insuficiente");
        } else if (deposito == saldo) {
            System.out.println("Su nuevo saldo es 0");
        } else if (deposito > saldo) {
            System.out.println("Deposito mayor al saldo pendiente");
        }
    }
}
