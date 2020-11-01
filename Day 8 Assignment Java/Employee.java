package com.company;

import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private int salary;
    private String designation;

    public String getName(){
        return name;
    }

    public void getDetails(){
        System.out.println("Enter name and designation: ");
        name = sc.next();
        designation = sc.next();
    }

    public void displayDetails(){
        System.out.println("Name is " + name + " and, Designation is " + designation);
    }



}
