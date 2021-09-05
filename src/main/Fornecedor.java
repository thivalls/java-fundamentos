package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        System.out.println("Ola Amanda");
        
        Supplier<List<String>> loadList = () -> Arrays.asList("Thiago", "Amanda", "Theo", "Junior", "Diego");

        for (String name : loadList.get()) {
            System.out.println(name);
        }
    }
}
