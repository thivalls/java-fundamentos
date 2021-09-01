package main.lambdas;

public class Subtrair implements Calculo {
    @Override
    public Double executar(double value1, double value2) {
        return value1 - value2;
    }
}
