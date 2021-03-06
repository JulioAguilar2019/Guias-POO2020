package ejercicio2;

public class PagoContado extends Pago {

    public PagoContado(double saldo, double deposito) {
        super(saldo, deposito);
    }

    @Override
    public void pagar() {
        System.out.println("Pago al contado");
        if (deposito < saldo) {
            System.out.println("Saldo insuficiente");
        } else if (deposito == saldo) {
            System.out.println("Su nuevo saldo es 0");
        } else if (deposito > saldo) {
            System.out.println("Deposito mayor al saldo pendiente");
        }
    }

}
