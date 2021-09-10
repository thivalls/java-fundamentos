package main.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        System.out.println("Desafio STREAM FILTER");

        List<String> names = Arrays.asList("Carmina", "Carlos", "Catoia", "clauditides", "Carlotinha");

        names.stream().filter(n -> n.contains("Car")).forEach(System.out::println);

        List<Integer> nums = Arrays.asList(100, 22 ,13 , 45, 25, 68, 17, 28, 99, 30);
        Predicate<Integer> menorQue5 = n -> n <= 30;
        nums.stream().filter(menorQue5).forEach(System.out::println);

        System.out.println("*****************SEPARADOR*********************");

        List<Integer> nums2 = Arrays.asList(100, 22 ,13 , 45, 25, 68, 17, 28, 99);
        Predicate<Integer> isPar = n -> n % 2 == 0;
        nums2.stream().filter(isPar).forEach(System.out::println);
    }
}
