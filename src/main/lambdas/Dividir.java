package main.lambdas;

public class Dividir implements Calculo{
    @Override
    public Double executar(double value1, double value2) {
        return value1 / value2;
    }
}
