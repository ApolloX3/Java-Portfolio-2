package com.company;
import java.util.Scanner;
public class Menu {
    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";

    public void printMenu() {

        while (strGoAgain.equalsIgnoreCase("y")) {

            System.out.println("__________________________________________________");
            System.out.println("");
            System.out.println("What can I help you with today?\n"
                    + "please enter a number option (1 - 3) ");
            System.out.println("");
            System.out.println("1. Withdrawals \n"
                    + "2. Deposits\n"
                    + "3. Check your balance");
            System.out.println("");

            Scanner scan = new Scanner(System.in);
            int intChoice = scan.nextInt();

            if (intChoice < 4 & intChoice > 0) {

                Transactions my_transaction1 = new Transactions();

                switch (intChoice) {
                    case 1:
                        System.out.println("********** Withdrawals **********");
                        my_transaction1.withdrawal();
                        break;

                    case 2:
                        System.out.println("********** Deposits **********");
                        my_transaction1.deposit();
                        break;

                    case 3:
                        System.out.println("********* Balances **********");
                        my_transaction1.balance();
                        break;

                    default:
                        System.out.println("Ï");
                }
            } else {
                System.out.println("*");
                System.out.println("Please enter a valid number");
                System.out.println("*");

                Menu atm_Menu = new Menu();
                atm_Menu.printMenu();
            }
            System.out.println("\nWould you like to see the main menu again? (y or n)? ");
            strGoAgain = scan.next();

        }

    }
}
