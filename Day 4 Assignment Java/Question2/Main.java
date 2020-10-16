package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {5, 8, 98, 19, 65};

        for (int i=0; i<5; i++){
            if (numbers[i] % 2 != 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
