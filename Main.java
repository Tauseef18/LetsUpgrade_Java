package com.employee;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Saurabh";
        e1.age = 23;
        e1.city = "Chennai";
        e1.displayEmployeeDetails();

        Employee e2 = new Employee();
        e2.name = "Tauseef";
        e2.age = 21;
        e2.city = "Mumbai";
        e2.displayEmployeeDetails();
    }
}
