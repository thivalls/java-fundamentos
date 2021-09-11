package streams.match;

import entities.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match1 {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Thiago", 7.1),
                new Aluno("Amanda", 6.1),
                new Aluno("Iraci", 8.1),
                new Aluno("Theo", 10)
        );

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7.0;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
