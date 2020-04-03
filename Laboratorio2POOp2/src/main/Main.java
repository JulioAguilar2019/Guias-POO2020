package main;

import entidades.*;

public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Masculino", 4, "Chow chow");
        Gato gato = new Gato("Femenino", 4, "Angora");
        Ave ave = new Ave("Masculino", 2, "Aguila");
        Pez pez = new Pez("Femenino", 5, "Tiburón");
        Caballo caballo = new Caballo("Masculno", 4, "Andaluz");

        System.out.println("Información del perro");
        perro.setNombre("Golden");
        perro.setEdad(5);
        perro.verInfo();
        System.out.println("Comportamiento del perro");
        perro.verComportamientos(1);
        perro.verComportamientos(2);
        perro.verComportamientos(3);
        System.out.println("------------------------------------");
        System.out.println("Información del Gato");
        gato.setNombre("Bills");
        gato.setEdad(2);
        gato.verInfo();
        System.out.println("Comportamiento del Gato");
        gato.verComportamientos(1);
        gato.verComportamientos(2);
        gato.verComportamientos(3);
        System.out.println("------------------------------------");
        System.out.println("Información del Ave");
        ave.setNombre("Falcón");
        ave.setEdad(6);
        ave.verInfo();
        System.out.println("Comportamiento de la Ave");
        ave.verComportamientos(1);
        ave.verComportamientos(2);
        ave.verComportamientos(3);
        System.out.println("------------------------------------");
        System.out.println("Información del Pez");
        pez.setNombre("Nemo");
        pez.setEdad(2);
        pez.verInfo();
        System.out.println("Comportamiento del Pez");
        pez.verComportamientos(1);
        pez.verComportamientos(2);
        pez.verComportamientos(3);
        System.out.println("------------------------------------");
        System.out.println("Información del Caballo");
        caballo.setNombre("Spirit");
        caballo.setEdad(10);
        caballo.verInfo();
        System.out.println("Comportamiento del Caballo");
        caballo.verComportamientos(1);
        caballo.verComportamientos(2);
        caballo.verComportamientos(3);
        System.out.println("------------------------------------");
    }
}
