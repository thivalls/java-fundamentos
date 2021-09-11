package lambdas.main;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        System.out.println("UNARY OPERATOR");

        UnaryOperator<Double> dobro = inteiro -> inteiro * 2;
        UnaryOperator<Double> triplo = inteiro -> inteiro * 3;
        UnaryOperator<Double> quadrado = inteiro -> inteiro * inteiro;

        double numero = 4.0;

        Double result = dobro.andThen(triplo.andThen(quadrado)).apply(numero);

        System.out.println(result);

        double numero2 = 2.0;

        System.out.println(dobro.compose(triplo.compose(quadrado)).apply(numero2));
    }
}
