package main.lambdas.main;

import main.entities.Product;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Product> showPriceDiscount = product -> System.out.println(product.getPrice() * product.getDiscount());

        Product product1 = new Product("Book", 100.00, 0.10);
        Product product2 = new Product("Book", 200.00, 0.10);
        Product product3 = new Product("Book", 300.00, 0.10);
        Product product4 = new Product("Book", 400.00, 0.10);

        List<Product> produtos = Arrays.asList(product1, product2, product3, product4);

        produtos.forEach(showPriceDiscount);

        produtos.forEach(System.out::println);
    }
}
