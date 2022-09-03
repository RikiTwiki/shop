package com.company.dao;

import com.company.models.Product;

import java.util.Arrays;

public class ClientProduct extends Product {
    private String name;
    private double price;
    private double discount;
    private double quantity;
    private double amount;


    public ClientProduct() {

    }


    public ClientProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public ClientProduct(String name, double price, double discount, double quantity, double amount) {
        this(name, price, discount);
        this.quantity = quantity;
        this.amount = amount;
    }

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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static double amountOfProduct(ClientProduct[] clientProducts) {

        double sumOfProduct = 0;

        for (int i = 0; i < clientProducts.length; i++) {
            sumOfProduct += clientProducts[i].getPrice() * clientProducts[i].getQuantity();
        }
        System.out.println(sumOfProduct);
        return sumOfProduct;
    }

}
