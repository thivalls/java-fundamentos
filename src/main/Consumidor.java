package main;

import main.entities.Product;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Product> consolePrice = product -> System.out.println(product.getPrice());

        Product product = new Product("Book", 100.00, 0.10);

        consolePrice.accept(product);
    }
}
