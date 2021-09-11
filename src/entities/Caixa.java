package entities;

public class Caixa<T> {
    private T coisa;

    public void add(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return coisa;
    }
}
