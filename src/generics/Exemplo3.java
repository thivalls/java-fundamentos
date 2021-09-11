package generics;

import entities.BoxInteger;
import entities.BoxString;
import entities.Caixa;
import entities.CaixaNumerica;

public class Exemplo3 {
    public static void main(String[] args) {
        System.out.println("Estudando generics");
        System.out.println("----------------------------------------------");

        CaixaNumerica<Integer> myIntegerBox = new CaixaNumerica<>();
        myIntegerBox.add(123);
        System.out.println(myIntegerBox.abrir());

        System.out.println("----------------------------------------------");

        CaixaNumerica<Double> myDoubleBox = new CaixaNumerica<>();
        myDoubleBox.add(1.23);
        System.out.println(myDoubleBox.abrir());
    }
}
