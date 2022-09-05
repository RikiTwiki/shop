package com.company;


public class Cart {
    private ClientProduct[] clientProducts;

    public Cart(ClientProduct[] clientProducts) {
        this.clientProducts = clientProducts;
    }

    public ClientProduct[] getClientProducts() {
        return clientProducts;
    }

    public void setClientProducts(ClientProduct[] clientProducts) {
        this.clientProducts = clientProducts;
    }
}