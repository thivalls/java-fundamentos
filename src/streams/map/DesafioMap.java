package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioMap {
    public static String myReverseString(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /**
         * 1. Numero para string binária
         * 2. Inverter string
         * 3. Converter a inteiro novamente
         */

        Function<String, Integer> binToInt = n -> Integer.parseInt(n, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(DesafioMap::myReverseString)
                .map(binToInt)
                .forEach(System.out::println);
    }
}
