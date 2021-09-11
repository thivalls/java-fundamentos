package streams.others;

import entities.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Others {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Thiago", 7.1),
                new Aluno("Amanda", 8.1),
                new Aluno("Iraci", 8.1),
                new Aluno("Theo", 10),
                new Aluno("Willian", 7.1),
                new Aluno("Everton", 8.1),
                new Aluno("Roberto", 9.1),
                new Aluno("Mariana", 10),
                new Aluno("João", 7.1),
                new Aluno("Pedro", 8.1),
                new Aluno("Junior", 5.1),
                new Aluno("Nao Ira aparecer com takeWhile", 10)
        );

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;

        alunos.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Utilizando métodos limit e skip");
        System.out.println();

        alunos.stream()
                .distinct()
                .skip(2)
                .limit(4)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Utilizando métodos distinct e takeWhile");
        System.out.println();

        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(aprovado)
                .forEach(System.out::println);
    }
}
