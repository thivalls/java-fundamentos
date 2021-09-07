package main.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("PHP ", "JAVA ", "JAVASCRIPT\n");
        langs.forEach(print);

        String[] frontend = { "CSS ", "HTML ", "JAVASCRIPT ", "REACT\n" };
        Stream.of(frontend).forEach(print);

        Arrays.stream(frontend).forEach(print);
        Arrays.stream(frontend, 0, 2).forEach(print);

        System.out.println("");
        List<String> favorites = Arrays.asList("Java ", "PHP ", "JAVASCRIPT\n");
        favorites.stream().forEach(print);
        favorites.parallelStream().forEach(print);

        // Stream.generate(() -> "PHP").forEach(print);
        // Stream.iterate(0, n -> n + 1).forEach(System.out::println);
     }
}
