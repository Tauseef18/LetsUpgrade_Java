package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String employeeName;
        int dateOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        int monthSalary;
        double tax;

        System.out.println("Enter Employee Name, date of Birth, month of birth, year of birth and per month salary");

        employeeName = sc.nextLine();
        dateOfBirth = sc.nextInt();
        monthOfBirth = sc.nextInt();
        yearOfBirth = sc.nextInt();
        monthSalary = sc.nextInt();

        int age = 2020 - yearOfBirth;

        int annualSalary = monthSalary * 12;

        if (annualSalary >= 500000){
            tax = (annualSalary * 0.20);
        }
        else if (annualSalary >= 400000 && annualSalary < 500000){
            tax = (annualSalary * 0.15);
//            System.out.println(tax);
        }
        else if (annualSalary >= 300000 && annualSalary < 400000){
            tax = (annualSalary * 0.10);
        }
        else if (annualSalary >= 200000 && annualSalary < 300000){
            tax = (annualSalary * 0.05);
        }
        else{
            tax = 0.0;
        }

        System.out.println("Employer Name is " + employeeName + ", Age is " + age + ", Annual Salary is "
        + annualSalary + ", Tax Amount is " + tax);

    }
}
