package entidades;

public class Gato extends Mascota {

    //atributos
    private String sexo;
    private int cantPatas;
    private String especie;

    //constructor vacio
    public Gato() {
    }

    //construcor con parametros
    public Gato(String sexo, int cantPatas, String especie) {
        this.sexo = sexo;
        this.cantPatas = cantPatas;
        this.especie = especie;
    }

    //metodos set
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //metodos get
    public String getSexo() {
        return sexo;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public String getEspecie() {
        return especie;
    }

    //metodos de comportamiento
    public void comer() {
        System.out.println("Comiendo wiskas");
    }

    public void sonido() {
        System.out.println("Miau");
    }

    public void saltar() {
        System.out.println("El gato esta saltando");
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
