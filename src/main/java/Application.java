import lambdas.Dividir;
import lambdas.Multiplicar;
import lambdas.Soma;
import lambdas.Subtrair;

public class Application {
    public static void main(String[] args) {
        Soma soma = new Soma();
        double resultadoSoma = soma.executar(2, 5);

        Subtrair subtracao = new Subtrair();
        double resultadoSubtracao = subtracao.executar(2, 5);

        Multiplicar multiplicacao = new Multiplicar();
        double resultadoMultiplicacao = multiplicacao.executar(2, 5);

        Dividir dividir = new Dividir();
        double resultadoDivisao = dividir.executar(2, 5);

        System.out.println("Resultado da soma é: " + resultadoSoma);
        System.out.println("Resultado da subtração é: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação é: " + resultadoMultiplicacao);
        System.out.println("Resultado da divisão é: " + resultadoDivisao);
    }
}
