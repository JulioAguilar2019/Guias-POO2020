package clases;

import clasesAbstractas.PrendaVestir;
import interfaces.*;

public class Camisas extends PrendaVestir implements EstiloCamisa, Tela{

    @Override
    public void TipoDePrenda() {
        System.out.println("Es una camisa");
    }

    @Override
    public void EstiloCamisa() {
        System.out.println("Es un tipo de camisa polo");
    }

    @Override
    public void TipoTela() {
        System.out.println("El tipo de tela es Popelín");
    }

}
