package entidades;

public class Pez extends Mascota {

    //atributos
    private String sexo;
    private int cantAletas;
    private String especie;

    //constructor vacio
    public Pez() {
    }

    //construcor con parametros
    public Pez(String sexo, int cantAletas, String especie) {
        this.sexo = sexo;
        this.cantAletas = cantAletas;
        this.especie = especie;
    }

    //metodos set
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCantAletas(int cantAletas) {
        this.cantAletas = cantAletas;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //metodos get
    public String getEspecie() {
        return especie;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCantAletas() {
        return cantAletas;
    }

    //metodos de comportamiento
    public void comer() {
        System.out.println("Comiendo concentrado");
    }

    public void sonido() {
        System.out.println("Blup blup blup");
    }

    public void saltar() {
        System.out.println("El pez esta saltando");
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
