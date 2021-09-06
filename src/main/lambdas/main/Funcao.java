package main.lambdas.main;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        System.out.println("Utilizando interface FUNCTION");
        System.out.println("+++++++++++++++++++++++++++++");

        Function<Integer, String> checkEvenOdd = integer -> integer % 2 == 0 ? "par" : "ímpar";
        Function<String, String> printResult = text -> "O resultado é " + text;
        Function<String, String> sufixoEmpolgado = whatEverString -> whatEverString + "!!!";

        Integer inteiro = 101;

        System.out.println("UTILIZANDO MÉTODO ENDTHEN PARA ENCADEAR FUNÇÕES");
        System.out.println(checkEvenOdd.andThen(printResult).andThen(sufixoEmpolgado).apply(inteiro));

        System.out.println("------------------------------------------------------");

        System.out.println("ENCADEANDO FUNÇÕES MANUALMENTE");
        System.out.println(sufixoEmpolgado.apply(printResult.apply(checkEvenOdd.apply(inteiro))));

    }
}
