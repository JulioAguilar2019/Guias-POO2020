package ejercicio2;

public class Main {

    public static void main(String[] args) {
        //Argumento 1, saldo
        //Argumento2, deposito
        Pago pago = new Pago(1000, 1000);
        PagoContado pagoC = new PagoContado(1000, 500);
        PagoConTarjeta pagoT = new PagoConTarjeta(1000, 2000);
        //metodo pagar de la clase pago
        pago.pagar();
        System.out.println("------------------------------------------");
        //metodo pagar de la clase pago contado
        pagoC.pagar();
        System.out.println("------------------------------------------");
        //metodo pagar de la clase pago tarjeta
        pagoT.pagar();
        System.out.println("------------------------------------------");
    }
}
