package Concretes;

import Interface.ReceiverIF;

public class Multiplicacao implements ReceiverIF {
    private int numA;
    private int numB;

    public Multiplicacao (int numA, int  numB){
        this.numA = numA;
        this.numB = numB;
    }

    public void Execute() {
        int resultado = numA*numB;
        System.out.println(resultado);

    }
}
