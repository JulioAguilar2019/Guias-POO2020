package clases;

import interfaces.*;

public class Producto implements Impuesto, Caducidad {

    String nombre;

    public Producto() {

    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void impuesto() {
        System.out.println("El impuesto del producto " + this.nombre + " es de 10 dolares");
    }

    @Override
    public void fechaCaducidad() {
        System.out.println("La fecha de caducidad del producto es el 20 de Junio del 2020");
    }

}
