package main.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = Integer::sum;
        Integer result1 = nums.stream().reduce(soma).get();
        System.out.println(result1);

        // no parallelStream o valor inicial é passado em todas iterações
        Integer result2 = nums.parallelStream().reduce(100, soma);
        System.out.println(result2);

        // no stream o valor inicial é passado apenas na primeira iteração
        Integer result3 = nums.stream().reduce(100, soma);
        System.out.println(result3);

        Integer result4 = nums.stream().filter(n -> n >= 6).reduce(soma).get();
        System.out.println(result4);
    }
}
