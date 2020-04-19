package main;

import clases.Producto;

public class ejer2 {

    public static void main(String[] args) {
        Producto producto = new Producto("Leche");
        producto.impuesto();
        producto.fechaCaducidad();
    }
}
