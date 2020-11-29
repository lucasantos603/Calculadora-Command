package Concretes;

import Interface.ReceiverIF;

import javax.sound.midi.Receiver;

public class Divisao implements ReceiverIF {
    private int numA;
    private int numB;

    public Divisao (int numA, int  numB){
        this.numA = numA;
        this.numB = numB;
    }

    public void Execute() {
        int resultado = numA/numB;
        System.out.println(resultado);
    }
}
