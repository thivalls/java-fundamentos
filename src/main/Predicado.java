package main;

import main.entities.Product;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Product> isExpensive = prod -> (prod.getPrice() * (1 - prod.getDiscount())) >= 800.0;

        Product prod1 = new Product("E-Book", 1000.0, 0.15);

        if (isExpensive.test(prod1)) {
            System.out.println("é caro");
        }
        else {
            System.out.println("não é caro");
        }
    }
}
