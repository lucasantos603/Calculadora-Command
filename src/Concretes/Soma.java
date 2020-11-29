package Concretes;

import Interface.ReceiverIF;

public class Soma implements ReceiverIF {
    private int numA;
    private int numB;

    public Soma (int numA, int  numB){
        this.numA = numA;
        this.numB = numB;
    }


    @Override
    public void Execute() {
        int resultado = numA+numB;
        System.out.println(resultado);

    }
}
