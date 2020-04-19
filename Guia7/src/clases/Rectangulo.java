package clases;

import interfaces.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica {

    double area;
    double perimetro;

    public Rectangulo() {

    }

    public Rectangulo(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    @Override
    public void area() {
        System.out.println("El área del rectángulo es: " + String.format("%.2f", this.area * this.perimetro));
    }

    @Override
    public void perimetro() {
        System.out.println("El perímetro del rectángulo es: " + String.format("%.2f", (2 * this.area) + (2 * this.perimetro)));

    }
}
