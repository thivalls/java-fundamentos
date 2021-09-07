package main.streams;

import main.entities.Product;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfList {
    public static void main(String[] args) {
        List<Product> produtos = Arrays.asList(
                new Product("Shampoo", 12.00, 0.0),
                new Product("Sabonete", 12.00, 0.0),
                new Product("Azeite", 12.00, 0.0),
                new Product("Cerveja", 12.00, 0.0)
        );

        System.out.println("******************** USANDO FOR ******************");

        for (Product product : produtos) {
            System.out.println(product.getName());
        }

        System.out.println("******************** USANDO ITERATOR ******************");

        Iterator<Product> it = produtos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }

        System.out.println("******************** USANDO STREAM ******************");
        List<String> names = Arrays.asList("Thiago", "Amanda", "Theo", "Elisabete", "Dirceu");
        Stream<String> st = names.stream();
        st.forEach(System.out::println);
    }
}
