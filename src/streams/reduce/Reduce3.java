package streams.reduce;

import entities.Media;
import entities.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Thiago", 7.1),
                new Aluno("Amanda", 6.1),
                new Aluno("Iraci", 8.1),
                new Aluno("Theo", 10)
        );

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7.0;
        Function<Aluno, Double> getNota = Aluno::getNota;

        BiFunction<Media, Double, Media> calcularMedia = Media::add;
        BinaryOperator<Media> combinador = Media::combine;


        var resultado = alunos.parallelStream()
                // .filter(aprovado)
                .map(getNota)
                .reduce(new Media(), calcularMedia, combinador);
        System.out.println("A média da turma é: " + resultado.getValue());
    }
}
