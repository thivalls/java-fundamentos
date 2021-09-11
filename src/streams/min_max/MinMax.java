package streams.min_max;

import entities.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MinMax {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Thiago", 7.1),
                new Aluno("Amanda", 8.1),
                new Aluno("Iraci", 6.1),
                new Aluno("Theo", 10)
        );

        Comparator<Aluno> comparador = (a1, a2) -> {
              if(a1.getNota() > a2.getNota()) return 1;
              if(a1.getNota() < a2.getNota()) return -1;
              return 0;
        };

        Function<Aluno, String> onlyName = Aluno::getName;

        alunos.stream().max(comparador).map(onlyName).ifPresent(System.out::println);
        alunos.stream().min(comparador).map(onlyName).ifPresent(System.out::println);
    }
}
