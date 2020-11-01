package com.company;

public class Engineer extends Employee {

    String companyName;
    int yearsOfExperience;

    public void getCompanyName(){
        System.out.println("Enter company Name: ");
        companyName=sc.next();
    }


}
