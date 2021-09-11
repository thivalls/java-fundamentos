package lambdas.main;

import entities.Product;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        /*
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto municipal: >= 2500 (8,5%) | < 2500 (isento)
         * 3. Frete: >= 3000 (100) | < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,26
         */

        Function<Product, Double> calcPrice = product -> product.getPrice() * (1 - product.getDiscount());
        UnaryOperator<Double> calcTax = price -> price < 2500.0 ? price : price + (price * (8.5 / 100));
        UnaryOperator<Double> calcShipping = price -> price < 3000 ? price + 50.0 : price + 100.0;
        UnaryOperator<Double> setFormatNumber = price -> Double.parseDouble(String.format("%.2f", price).replace(",", "."));
        Function<Double, String> formatResponse = priceString -> ("R$ " + priceString.toString()).replace(".", ",");

        Product p = new Product("Ipad", 3235.89, 0.13);
        Object result = calcPrice
                .andThen(calcTax)
                .andThen(calcShipping)
                .andThen(setFormatNumber)
                .andThen(formatResponse)
                .apply(p);

        System.out.println(result);

    }
}
