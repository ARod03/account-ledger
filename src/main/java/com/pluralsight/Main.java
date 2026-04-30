package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner theScanner = new Scanner(System.in);
    public static ArrayList<Transaction> ledger = new ArrayList<>();

    public static void main(String[] args) {


        boolean appRunning = true;

        //This is the Home screen
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

        //Add a method in order to display deposits and make payments that shows the description, vendor, and amount
        private static void addTransaction(boolean isDeposit) {
            System.out.println("Description: ");
            String description = theScanner.nextLine();

            System.out.println("Vendor: ");
            String vendor = theScanner.nextLine();

            System.out.println("Amount: ");
            double amount = Double.parseDouble(theScanner.nextLine());

            if (!isDeposit) amount = -Math.abs(amount);

            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();

            Transaction t = new Transaction(date, time, description, vendor, amount);
            ledger.add(t);

            System.out.println("Your transaction has been saved.");

        }

        //This is the Ledger menu
        //This is the method to show the ledger screen when the user wants access to the ledger
        private static void showLedger() {
            while (true) {
                System.out.println("\n<=== Ledger ===>");
                System.out.println("A) All");
                System.out.println("D) Deposits");
                System.out.println("P) Payments");
                System.out.println("R) Reports");
                System.out.println("H) Home");
                System.out.print("Please select an option: ");

                String choice = theScanner.nextLine().toUpperCase().trim();

                //Switch statements that will branch out the options chosen from the ledger
                switch (choice) {
                    case "A":
                        showAll();
                        break;
                    case "D":
                        showDeposits();
                        break;
                    case "P":
                        showPayments();
                        break;
                    case "R":
                    case "H":
                    default:
                        System.out.println("Invalid option!");
                }
            }
        }

        //This is the Reports Menu
        //Create a method and while loop to display the reports menu
        private static void showReports() {
            while (true) {
                System.out.println("\n<=== Reports ===>");
                System.out.println("1) Month to Date");
                System.out.println("2) Previous Month");
                System.out.println("3) Year to Date");
                System.out.println("4) Previous Year");
                System.out.println("5) Search by Vendor");
                System.out.println("0) Back");
                System.out.print("Please select an option: ");

                String choice = theScanner.nextLine().trim();

                switch (choice) {
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "0":
                    default:
                        System.out.println("Invalid option!");

                }


            }
        }



        //These are the methods to display the options from the Ledger menu
        //Create a method to display everything from the ledger
        private static void showAll() {
            System.out.println("<=== All Transactions ===>");

            //For loop to display the entries from newest to oldest
            for(int i = ledger.size() - 1; i >= 0; i--) {
                Transaction t = ledger.get(i);
                printTansaction(t);
            }
        }

        //Create a method to show only the deposits from the ledger
        private static void showDeposits() {
            System.out.println("<=== Deposits ===>");
            for (int i = ledger.size() - 1; i >= 0; i--) {
                Transaction t = ledger.get(i);

                if(t.getAmount() > 0) {
                    printTransaction(t);
                }
            }
        }

        //Create a method to show only the payments from the ledger
        private static void showPayments() {
            System.out.println("<=== Payments ===>");
            for (int i = ledger.size() - 1; i >= 0; i--) {
                Transaction t = ledger.get(i);

                if(t.getAmount() < 0) {
                    printTransaction(t);
                }

            }
        }

        //Transactions would be displayed using this method. It is also formatted to be able to view the parts
        //of the transaction easily.
        private static void printTransaction(Transaction t) {
            System.out.printf("%s | %s | %-20s | %-15s | %.2fn", t.getDate(), t.getTime(),
                    t.getDescription, t.getVendor(), t.getAmount());
        }

        //These are the methods to display the options from the Reports menu
        //Create a method to show month to date of the reports
        private static void reportMonthToDate() {
            LocalDate currentDate = LocalDate.now();

            System.out.println("\n==== Month to Date ====");

            for(int i = ledger.size() - 1; i >= 0; i--) {

            }
        }

        //Create a method to show the previous month
        private static void reportPreviousMonth() {
            LocalDate currentDate = LocalDate.now();
            LocalDate previousDate = now.minusMonths(1);

            for(int i = ledger.size() - 1; i >= 0; i--) {

            }
        }

        //Create a method to show the year to date
        private static void reportYearToDate() {
            int currentYear = LocalDate.now().getYear();

            System.out.println("\n==== Year to Date ====");

            for(int i = ledger.size() - 1; i >= 0; i--) {

            }
        }

        //Create a method to show the previous year
        private static void reportPreviousYear() {
            int previousYear = LocalDate.now().getYear() - 1;

            System.out.println("\n==== Previous Year ====");

            for(int i = ledger.size() - 1; i >= 0; i--) {

            }
        }

        //Create a method to be able to search by the vendor
        System.out.print("Enter vendor name: ");
        String searchVendor = theScanner.nextLine().toLowerCase();

        System.out.println("\n==== Search Results ====");

        for(int i = ledger.size() - 1; i >= 0; i--) {

        }



        //Add a goodbye for when the user is done using the program :)
        System.out.println("Thank you for using our application!");
        System.out.println("Goodbye!");



    }

}
