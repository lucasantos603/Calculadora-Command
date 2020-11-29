import Concretes.*;
import Interface.CommandIF;
import Interface.ReceiverIF;

import java.util.Scanner;

public class Main {

    public static void CommandIFIntanciator(ReceiverIF r){
        CommandIF commCalc = new CommandConcrete(r);
        Invoke i = new Invoke();

        i.storeCommand(commCalc);
        i.invoke();
    }

    public static void main (String [] args){
        int a,b;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma das Opções (Soma, Subtracao, Divisao, Multiplicacao, e Raiz ou Tudo)");
        String entrada = teclado.nextLine().toLowerCase();

        switch (entrada) {
            case "soma": {
                System.out.println("Entre com dois numeros");

                System.out.println("Primero");
                a = teclado.nextInt();

                System.out.println("Segundo");
                b = teclado.nextInt();

                Soma soma = new Soma(a, b);
                CommandIFIntanciator(soma);
                break;
            }
            case "subtracao": {
                System.out.println("Entre com dois numeros");

                System.out.println("Primero");
                a = teclado.nextInt();

                System.out.println("Segundo");
                b = teclado.nextInt();

                Subtração sub = new Subtração(a, b);
                CommandIFIntanciator(sub);
                break;
            }
            case "multiplição": {
                System.out.println("Entre com dois numeros");

                System.out.println("Primero");
                a = teclado.nextInt();

                System.out.println("Segundo");
                b = teclado.nextInt();

                Multiplicacao mult = new Multiplicacao(a, b);
                CommandIFIntanciator(mult);
                break;
            }
            case "divisao": {
                System.out.println("Entre com dois numeros");

                System.out.println("Primero");
                a = teclado.nextInt();

                System.out.println("Segundo");
                b = teclado.nextInt();

                Divisao div = new Divisao(a, b);
                CommandIFIntanciator(div);
                break;
            }
            case "raiz": {
                System.out.println("Entre o numero");

                a = teclado.nextInt();

                Raiz_Quadrada raiz = new Raiz_Quadrada(a);
                CommandIFIntanciator(raiz);
                break;
            }
            case "tudo": {
                System.out.println("Primero");
                a = teclado.nextInt();

                System.out.println("Segundo");
                b = teclado.nextInt();

                Soma soma = new Soma(a, b);
                Subtração sub = new Subtração(a, b);
                Multiplicacao mult = new Multiplicacao(a, b);
                Divisao div = new Divisao(a, b);
                Raiz_Quadrada raiz = new Raiz_Quadrada(a);

                CommandIFIntanciator(soma);
                CommandIFIntanciator(sub);
                CommandIFIntanciator(mult);
                CommandIFIntanciator(div);
                CommandIFIntanciator(raiz);
                break;
            }
        }


    }
}
