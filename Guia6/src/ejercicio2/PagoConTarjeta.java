package ejercicio2;

public class PagoConTarjeta extends Pago {

    public PagoConTarjeta(double saldo, double deposito) {
        super(saldo, deposito);
    }

    @Override
    public void pagar() {
        System.out.println("Pago con tarjeta");
        if (deposito < saldo) {
            System.out.println("Saldo insuficiente");
        } else if (deposito == saldo) {
            System.out.println("Su nuevo saldo es 0");
        } else if (deposito > saldo) {
            System.out.println("Deposito mayor al saldo pendiente");
        }
    }
}
