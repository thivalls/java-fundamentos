package main.streams.reduce;

import main.entities.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Thiago", 6.1),
            new Aluno("Amanda", 7.1),
            new Aluno("Iraci", 8.1),
            new Aluno("Theo", 10.0)
        );

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7.0;
        Function<Aluno, Double> getNota = Aluno::getNota;
        // BinaryOperator<Double> somatorio = (n, n1) -> n + n1;
        BinaryOperator<Double> somatorio = Double::sum;

        // alunos.stream().filter(aprovado).map(getNota).forEach(System.out::println);
        alunos.stream()
                // .filter(aprovado)
                .map(getNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}
