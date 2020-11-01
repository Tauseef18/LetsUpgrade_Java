package com.company;

import java.util.Scanner;

public class Management {

    Scanner sc = new Scanner(System.in);
    Product[] products = new Product[5];
    int noOfProducts = 0;
    int count = 0;

    Management() {
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
        }
    }

    public void addProduct() {
        int choice;
        do {
            products[noOfProducts].createProduct();
            noOfProducts++;
            count++;
            System.out.println("Do you want to add one more product? 1-Yes / 0-No");
            choice = sc.nextInt();
        } while (choice == 1);
    }

    public void deleteProduct() {
        System.out.println("Enter the name of product that you want to delete: ");
        String name = sc.next();

        if (count != 0) {
            for (int i = 0; i < noOfProducts; i++) {

                if (!products[i].getName().equals(name)) {
                    System.out.println("No Products Available with this name");
                } else if (products[i].getName().equals(name))
                    products[i].setDeleted(true);
            }
        } else {
            System.out.println("You have 0 products");
        }
    }

    public void displayProducts() {
        if (count != 0) {
            for (int i = 0; i < noOfProducts; i++) {
                if (products[i].getDeleted() == false)
                    products[i].displayProduct();
            }
        } else {
            System.out.println("You have 0 products.");
        }
    }

    public void sortAndDisplay() {
        Product tempProduct;
        if (count != 0) {
            for (int i = 0; i < noOfProducts; i++) {
                for (int j = i + 1; j < noOfProducts; j++) {
                    if (products[i].getPrice() < products[j].getPrice()) {
                        tempProduct = products[i];
                        products[i] = products[j];
                        products[j] = tempProduct;
                    }
                }
            }
            for (int i = 0; i < noOfProducts; i++) {
                if (products[i].getDeleted() == false)
                    products[i].displayProduct();
            }
        } else {
            System.out.println("You have 0 products.");
        }
    }

    public void updateProduct() {
        System.out.println("Enter the name of the product whose quantity you want to increase and the amount of quantity: ");
        String name = sc.next();
        int newQuantity = sc.nextInt();

        if (count != 0) {
            for (int i = 0; i < noOfProducts; i++) {
                if (products[i].getName().equals(name)) {
                    products[i].setQuantity(newQuantity);
                }
            }
            for (int i = 0; i < noOfProducts; i++) {
                if (products[i].getDeleted() == false)
                    products[i].displayProduct();
            }
        } else {
            System.out.println("You have 0 products.");
        }
    }
}
