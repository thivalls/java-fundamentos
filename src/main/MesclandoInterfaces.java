package main;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class MesclandoInterfaces {
    public static void main(String[] args) {
        System.out.println("MESCLANDO BIFUNCTION WITH UNARY OPERATOR");

        // BiFunction<Integer, Integer, Integer> soma = (num1, num2) -> num1 + num2;
        BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;
        UnaryOperator<Integer> dobro = numero -> numero * 2;

        System.out.println(soma.andThen(dobro).apply(1, 2));

        int numero1 = 2;
        int numero2 = 3;

        System.out.println(soma.apply(dobro.apply(numero1), dobro.apply(numero2)));
    }
}
