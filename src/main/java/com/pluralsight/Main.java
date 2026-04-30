package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);
        boolean appRunning = true;

        //Create a while loop to efficiently navigate through the menu
        while(appRunning){
            System.out.println("Welcome to the main menu!");
            System.out.println("What would you like to do?: ");
            System.out.println("----------");
            System.out.println("D) Add a deposit");
            System.out.println("P) Make Payment (Debit)");
            System.out.println("L) Ledger");
            System.out.println("X) Quit");
            System.out.println("----------");

            String mainMenuChoice = theScanner.nextLine().toUpperCase().trim();

            //Make a switch statement to branch out the different options based on the user's choice
            switch (mainMenuChoice) {
                case "D":
                    addTransaction();
                    break;
                case "P":
                    addTransaction();
                    break;
                case "L":
                    showLedger();
                    break;
                case "X":
                    appRunning = false;
                    break;
                default:
                    System.out.println("Invalid option!");

            }

        }

        //Add a method in order to display deposits and making payments
        private static void addTransactions(boolean isDeposit) {
            System.out.println("Description: ");
            String description = theScanner.nextLine();

            System.out.println("Vendor: ");
            String vendor = theScanner.nextLine();

            System.out.println("Amount: ");
            double amount = Double.parseDouble(theScanner.nextLine());

            if (!isDeposit) amount = -Math.abs(amount);

            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();


        }

        //Add a goodbye for when the user is done using the program
        System.out.println("Thank you for using our application!");
        System.out.println("Goodbye!");



    }

}
