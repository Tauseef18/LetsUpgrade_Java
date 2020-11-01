package com.company;

public class Doctor extends Employee {

    String hospitalName;
    int yearsOfExperience;

    public void hospitalName() {
        System.out.println("Enter the name of the hospital: ");
        hospitalName = sc.next();
    }
}