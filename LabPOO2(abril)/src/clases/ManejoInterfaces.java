package clases;

import interfaces.*;
import java.util.Date;
import javax.swing.JOptionPane;

public class ManejoInterfaces implements Areas, DatosEdificios {

    //atributos  
    private String tipo;
    private double area;
    private int CantPisos;
    private Date fecha;

    //ctor vacio
    public ManejoInterfaces() {
    }

    //ctor con parametros
    public ManejoInterfaces(String tipo, double area, int CantPisos, Date fecha) {
        this.tipo = tipo;
        this.area = area;
        this.CantPisos = CantPisos;
        this.fecha = fecha;
    }

    //metodos set
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCantPisos(int CantPisos) {
        this.CantPisos = CantPisos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    //metodos get
    public String getTipo() {
        return tipo;
    }

    public double getArea() {
        return area;
    }

    public int getCantPisos() {
        return CantPisos;
    }

    public Date getFecha() {
        return fecha;
    }

    //Metodos abstractos
    @Override
    public void areas(int op) {

        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "Áreas del edificio: \n1. Cancha de fútbol sala\n2. Cancha de Basketball\n3. Cancha de tenis", "Información Edificio Polideportivo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Áreas del edificio: \n1. Área de quirófano\n2. Área de odontología\n3. Área de nutrición", "Información Edificio Hospitalario", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Áreas del edificio: \n1. Área de química\n2. Área de matemática\n3. Área de informática", "Información Edificio Educativo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    @Override
    public String Tipo(int op) {
        if (op == 1) {
            return "Polideportivo";
        } else if (op == 2) {
            return "Hospitalario";
        }
        return "Educativo";
    }

    @Override
    public double area() {
        return Math.round(Math.random() * 250);
    }

    @Override
    public int cantPisos() {
        return (int) Math.round(Math.random() * 70 + 1);
    }
}
