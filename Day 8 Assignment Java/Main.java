package com.company;

public class Main {

    public static void main(String[] args) {

        Doctor[] doctors = new Doctor[2];
        Engineer[] engineers = new Engineer[2];
        Pilot[] pilots = new Pilot[2];

        for (int i=0; i<2; i++){
            doctors[i] = new Doctor();
            engineers[i] = new Engineer();
            pilots[i] = new Pilot();
        }

        //Doctors Details

        for (int i=0; i<2; i++){
            doctors[i].getDetails();
            doctors[i].hospitalName();
        }

        System.out.println("Entering Engineers Details");

        //Engineer Details
        for (int i=0; i<2; i++){
            engineers[i].getDetails();
            engineers[i].getCompanyName();
        }

        //Pilot details
        System.out.println("Entering Pilots Details");

        for (int i=0; i<2; i++){
            pilots[i].getDetails();
            pilots[i].getNameOfAirways();
        }

        //Printing Doctors Details
        for (int i=0; i<2; i++){
            doctors[i].displayDetails();
            System.out.println("Dr " + doctors[i].getName() + " works in " + doctors[i].hospitalName + " hospital");
        }

        //Printing Engineers Details
        for (int i=0; i<2; i++){
            engineers[i].displayDetails();
            System.out.println("Er " + engineers[i].getName() + " works in " + engineers[i].companyName);
        }

        //Printing Pilots Details
        for (int i=0; i<2; i++){
            engineers[i].displayDetails();
            System.out.println(pilots[i].getName() + " works in " + pilots[i].airwaysName + " airways");
        }

    }
}
