package com.company;

public class Pilot extends Employee {

    String airwaysName;
    int yearsOfExperience;

    public void getNameOfAirways(){
        System.out.println("Enter name of Airways: ");
        airwaysName = sc.next();
    }
}
