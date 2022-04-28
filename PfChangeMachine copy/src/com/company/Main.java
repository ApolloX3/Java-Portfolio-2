package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
    Title title = new Title("Welcome To the Change Machine", "Think of a purchase you made...\n");
    title.printTitle();

    String strGoAgain = "y";
    while (strGoAgain.equalsIgnoreCase("y")) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount purchased:\n");
        double amountPurchased = scan.nextDouble();

        System.out.println("Please enter the amount tendered:\n");
        double amountTendered = scan.nextDouble();
        double amountOfChange = amountTendered - amountPurchased ;

        Locale usa = new Locale("en", "US");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

        System.out.println("Amount Owed: " + dollarFormat.format(amountPurchased));
        System.out.println("Amount Tendered: " + dollarFormat.format(amountTendered));
        System.out.println("Change Owed: " + dollarFormat.format(amountOfChange));

        ChangeMachine changeMachine = new ChangeMachine();
        changeMachine.changePrinter(amountOfChange);

    System.out.println("Would you like to run again (y or n)? ");
    strGoAgain = scan.next();
        }
    }
}