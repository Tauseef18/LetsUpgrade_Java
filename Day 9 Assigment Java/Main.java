package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        int doIt;
        Management management = new Management();

        do {
            System.out.println("Choose an option: ");
            System.out.println("1.Add Product");
            System.out.println("2.View Product");
            System.out.println("3.Sort By Price");
            System.out.println("4.Delete By Name");
            System.out.println("5.Update Quantity of Product.");
            choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    management.addProduct();
                    break;
                }
                case 2: {
                    management.displayProducts();
                    break;
                }
                case 3:{
                    management.sortAndDisplay();
                    break;
                }
                case 4:{
                    management.deleteProduct();
                    break;
                }
                case 5:{
                    management.updateProduct();
                    break;
                }

                default: {
                    System.out.println("Please select a valid option.");
                }
            }
            System.out.println("Do You want to continue? 1-Yes / 0-No");
            doIt = sc.nextInt();

        }while (doIt == 1);

    }
}
