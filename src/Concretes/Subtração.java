package Concretes;

import Interface.ReceiverIF;

public class Subtração implements ReceiverIF {
    private int numA;
    private int numB;

    public Subtração (int numA, int  numB){
        this.numA = numA;
        this.numB = numB;
    }

    public void Execute() {
        int resultado = numA-numB;
        System.out.println(resultado);

    }
}
