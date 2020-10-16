package com.company;

import java.util.Scanner;

public class Avenger {

    Scanner sc = new Scanner(System.in);

    public String name;
    public int age;
    public String power;
    public String weapon;
    public String planet;


    public void getDetails(){
        System.out.println("Enter name of an avenger: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter power of the avenger: ");
        power = sc.next();
        System.out.println("Enter the weapon of the avenger");
        weapon = sc.next();
        System.out.println("Enter name of the planet: ");
        planet = sc.next();

    }

    public void displayDetails(){
        System.out.println("Name: " + name + " Age: " + age + " Power: " + power + " Weapon: " + weapon + " Planet: " + planet);

    }





}
