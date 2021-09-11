package entities;

public class Media {
    private double total;
    private int quantidade;

    public Media add(double valor) {
        total += valor;
        quantidade++;
        return this;
    }

    public Double getValue() {
        return total/quantidade;
    }

    public static Media combine(Media m1, Media m2) {
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.quantidade = m1.quantidade + m2.quantidade;

        return resultante;
    }
}
