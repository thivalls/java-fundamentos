package main;

import main.entities.Product;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicado2 {
    public static void main(String[] args) {
        Consumer<String> printResult = texto -> System.out.println(texto);
        Predicate<Integer> isPar = inteiro -> inteiro % 2 == 0;
        Predicate<Integer> hasThreeDigits = number -> number >= 100 && number < 999;
        Function<Integer, String> resultEven = resultText -> "O resultado é par e tem 3 digitos: " + resultText;
        Function<Integer, String> resultOdd = resultText -> "O resultado é impar ou não tem 3 digitos: " + resultText;

        List<Integer> numbers = Arrays.asList(100, 233, 444, 20, 1000, 998);



        numbers.forEach(inteiro -> {
            if(isPar.and(hasThreeDigits).test(inteiro)) {
                printResult.accept(resultEven.apply(inteiro));
            } else {
                printResult.accept(resultOdd.apply(inteiro));
            }
        });
    }
}
