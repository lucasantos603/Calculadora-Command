package Concretes;

import Interface.ReceiverIF;

public class Raiz_Quadrada implements ReceiverIF {
    private int numA;

    public Raiz_Quadrada (int numA){
        this.numA = numA;
    }

    public void Execute() {
        int resultado = (int) Math.sqrt(numA);
        System.out.println(resultado);

    }
}
