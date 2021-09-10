package main.entities;

public class ProductDesafio {
    final String name;
    final double price;
    final double discount;
    final boolean freeShipping;

    public ProductDesafio(String name, double price, double discount, boolean freeShipping) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.freeShipping = freeShipping;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public boolean isFreeShipping() {
        return freeShipping;
    }
}
