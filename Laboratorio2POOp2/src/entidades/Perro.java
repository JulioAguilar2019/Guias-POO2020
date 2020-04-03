package entidades;

public class Perro extends Mascota {

    //atributos
    private String sexo;
    private int cantPatas;
    private String raza;

    //constructor vacio
    public Perro() {
    }

    //construcor con parametros
    public Perro(String sexo, int cantPatas, String raza) {
        this.sexo = sexo;
        this.cantPatas = cantPatas;
        this.raza = raza;
    }

    //metodos set
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //metodos get
    public String getSexo() {
        return sexo;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public String getRaza() {
        return raza;
    }

    //metodos de comportamiento
    public void comer() {
        System.out.println("Comiendo carne");
    }

    public void sonido() {
        System.out.println("Guau guau");
    }

    public void saltar() {
        System.out.println("El perro esta saltando");
    }
    //metodos abstractos

    @Override
    public void verComportamientos(int op) {
        switch (op) {
            case 1:
                comer();
                break;
            case 2:
                sonido();
                break;
            case 3:
                saltar();
                break;
            default:
                System.out.println("Número equivocado");
        }
    }

    @Override
    public void verInfo() {
        System.out.println("Nombre de mascota: " + getNombre());
        System.out.println("Edad de la mascota: " + getEdad() + " años");
    }

}
