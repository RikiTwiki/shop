package com.company;

//import static com.company.ClientProduct.amountOfProduct;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ClientProduct laptopRog = new ClientProduct();
        laptopRog.setName("Asus Rog Zephyrus 14");
        laptopRog.setDiscount(0);
        laptopRog.setPrice(220000);
        laptopRog.setQuantity(1);

        ClientProduct mouse = new ClientProduct();
        mouse.setName("Steelseries rival pro");
        mouse.setPrice(13000);
        mouse.setDiscount(5);
        mouse.setQuantity(2);

        ClientProduct[] clientProducts = new ClientProduct[2];
        clientProducts[0] = laptopRog;
        clientProducts[1] = mouse;

        Client test = new Client();
        test.setName("Abil");
        test.setEmail("abil@mail.ru");
        test.setCart(new Cart(clientProducts));

        /**
         * создать метод который принимает объект класса клиент
         * и выводит сумму каждого товара со скидкой и общую сумму товаров в его корзине
         * */

        calculateClientProductAmount(test);
    }

    public static void calculateClientProductAmount(Client client){

        double totalSum = 0;
        for (int i = 0; i < client.getCart().getClientProducts().length; i++){
            ClientProduct clientProduct = client.getCart().getClientProducts()[i];

            double sumWithoutDiscount = clientProduct.getPrice() * clientProduct.getQuantity();
            double finalSum = sumWithoutDiscount - clientProduct.getDiscount() * clientProduct.getQuantity()  * sumWithoutDiscount/100;
            clientProduct.setAmount(finalSum);
            totalSum += finalSum;
            System.out.println("Sum of "+ clientProduct.getName() + " " + clientProduct.getAmount());
        }
        System.out.println("Total sum is "+ totalSum);
    }
}