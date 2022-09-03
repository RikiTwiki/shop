package com.company.models;

import com.company.dao.Cart;

public class Client {
    private String name;
    private String email;
    private Cart cart;


    public Client() {

    }

    public Client(String name, String email, Cart cart) {
        this.name = name;
        this.email = email;
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }


}
