package com.saran;

public class Avengers_Assemble {
    public static void main(String[] args) {

        Avengers[] avg = new Avengers[5];

        System.out.println("Avengers Initiative:");
        for (int i=0;i< avg.length;i++){
            avg[i] = new Avengers();
            avg[i].getDetails();
            System.out.println();
        }
        System.out.println("Avengers Assemble...");
        for (int i=0;i< avg.length;i++){
            System.out.println();
            avg[i].displayDetails();
            System.out.println();
        }

    }
}
