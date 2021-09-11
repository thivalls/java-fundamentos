package entities;

public class Box<T> {
    private T coisa;
    public void add(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return coisa;
    }
}