import lambdas.Calculo;

import java.util.function.BinaryOperator;

public class ApplicationLambda {
    public static void main(String[] args) {
        // Usando uma interface nativa do Java
        BinaryOperator<Double> bin = (value1, value2) -> value1 + value2;

        Calculo div = (value1, value2) -> value1 / value2;
        Calculo multi = (value1, value2) -> value1 * value2;
        Calculo sum = (value1, value2) -> value1 + value2;
        Calculo sub = (value1, value2) -> value1 - value2;

        System.out.println("Dividindo -> " + div.executar(33, 3));
        System.out.println("Multiplicando -> " + multi.executar(33, 3));
        System.out.println("Somando -> " + sum.executar(33, 3));
        System.out.println("Subtraindo -> " + sub.executar(33, 3));
        System.out.println("Utilizando BinaryOperator -> " + bin.apply(33.0, 3.0));

        /*
         * mostrando que podemos criar métodos default e estáticos para trabalhar com intefaces
         * funcionais
         */
        System.out.println(div.hello("Juliano"));
        System.out.println(Calculo.ola("César"));
        System.out.println(div.corra("Bilozinho"));

        System.out.println("___________________________");

        System.out.println();
    }
}
