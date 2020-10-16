package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks1, marks2, marks3, marks4, marks5;
        double percentage;
        System.out.println("Enter marks for English, Hindi, Maths, Science and History");

        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        marks4 = sc.nextInt();
        marks5 = sc.nextInt();

        percentage = ((marks1 + marks2 + marks3 + marks4 + marks5) * 100 ) / 500;
//        System.out.println(percentage);

        if (percentage >= 70 && percentage <= 100){
            System.out.println("Your percentage is " + percentage + " and Your Grade is A");
        }
        else if (percentage >= 50 && percentage < 70){
            System.out.println("Your percentage is " + percentage + " and Your Grade is B");
        }
        else if (percentage >= 35 && percentage < 50){
            System.out.println("Your percentage is " + percentage + " and Your Grade is C");
        }
        else{
            System.out.println("Your percentage is " + percentage + " and You are failed");
        }





    }
}
