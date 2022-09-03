package com.company;

import com.company.dao.ClientProduct;
import com.company.models.Client;
import com.company.models.Product;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.dao.ClientProduct.amountOfProduct;

public class Main {
    public static void main(String[] args) {
        Product glue = new Product("glue", 150.0, 5.0);
        Product pen = new Product("pen", 30.0, 0.0);
        Product notebook = new Product("notebook", 350.0, 10.0);
        Product eraser = new Product("eraser", 25.0, 0.0);
        Product backpack = new Product("backpack", 3000.0, 15.0);


        Client client = new Client();
        client.setName("rikitwiki");
        client.setEmail("rikitwiki@gmail.com");



        ClientProduct clientProduct = new ClientProduct();
        clientProduct.setName("notebook");
        clientProduct.setPrice(350.0);
        clientProduct.setDiscount(10.0);
        clientProduct.setQuantity(2.0);



        ClientProduct[] clientProducts = new ClientProduct[1];
        clientProducts[0] = clientProduct;

        clientProduct.setAmount(amountOfProduct(clientProducts));

//        System.out.println(Arrays.toString(order));

    }

//    private static double amountOfProduct(ClientProduct[] clientProducts) {
//
//        double sumOfProduct = 0;
//
//        for (int i = 0; i < clientProducts.length; i++) {
//            sumOfProduct += clientProducts[i].getPrice() * clientProducts.get
//        }
//
//    }

}
