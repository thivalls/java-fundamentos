package streams.filter;

import entities.ProductDesafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
    public static void main(String[] args) {
        List<ProductDesafio> products = Arrays.asList(
            new ProductDesafio("Shoes", 140.0, 0.30, true),
            new ProductDesafio("Fan", 105.0, 0.31, false),
            new ProductDesafio("TV", 1000.0, 0.35, true),
            new ProductDesafio("Watch", 500.0, 0.30, true),
            new ProductDesafio("Book", 130.0, 0.40, true)
        );

        Predicate<ProductDesafio> moreThan30Percent = product -> product.getDiscount() > 0.30;
        Predicate<ProductDesafio> hasFreeShipping = product -> product.isFreeShipping();
        Function<ProductDesafio, String> output = product -> product.getName() + " - " + product.getPrice() + " SUPER PROMOÇÃO!!!";

        products.stream().filter(moreThan30Percent).filter(hasFreeShipping).map(output).forEach(System.out::println);
    }
}
