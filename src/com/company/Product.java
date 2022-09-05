package com.company;

public class Product {
    private String name;
    private double price;
    private double discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", price=" + price +
                        ", discount=" + discount +"\n";
    }
}
