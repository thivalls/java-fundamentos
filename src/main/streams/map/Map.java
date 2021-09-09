package main.streams.map;

import main.entities.Product;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,1,1,1,1);

        System.out.println("Lista um size: " + myList.size());
        myList.stream().forEach(System.out::println);

        myList.stream().map(n -> n * 2).forEach(System.out::println);

        List<Product> produtos = Arrays.asList(
          new Product("Carteira", 100.0, 0.0),
          new Product("Bolsa", 100.0, 0.0),
          new Product("Chuteira", 100.0, 0.0),
          new Product("Brazil", 100.0, 0.0),
          new Product("Chuchu", 100.0, 0.0),
          new Product("Bala", 100.0, 0.0)
        );

        produtos.stream().map(p -> p.getName()).map(p -> p.charAt(0)).forEach(System.out::println);
    }
}
