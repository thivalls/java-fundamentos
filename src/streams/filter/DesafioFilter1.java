package streams.filter;

import entities.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Thiago", 7.0, false),
                new Aluno("Amanda", 8.0, false),
                new Aluno("Theo", 10.0, true),
                new Aluno("Iraci", 5.0, false),
                new Aluno("Carlos", 6.0, false)
        );

        Predicate<Aluno> isApproved = aluno -> aluno.getNota() >= 7.0;
        Predicate<Aluno> hasGoodBehavior = aluno -> aluno.isComportamento();
        Function<Aluno, String> saudacao = aluno -> "PARABÉNS " + aluno.getName() + " você está aprovado!!!";

        alunos.stream().filter(isApproved).filter(hasGoodBehavior).map(saudacao).forEach(System.out::println);
    }
}
