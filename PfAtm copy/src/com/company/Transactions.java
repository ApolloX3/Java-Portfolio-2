package com.company;
import java.util.Scanner;

public class Transactions {
    Scanner scan = new Scanner(System.in);

    double my_Balance = 1000;

    public double withdrawal() {

        System.out.println(" Welcome to withdrawals, please enter an amount"
                + " to withdraw");
        System.out.println("");
        System.out.println("        20$         40$\n"
                + "60$          120$            200$");
        System.out.println("");

        double amount_Withdraw = scan.nextDouble();

        try {

            if (my_Balance > 0 && my_Balance >= amount_Withdraw && amount_Withdraw == 20 || amount_Withdraw == 40 || amount_Withdraw == 60 || amount_Withdraw == 120 || amount_Withdraw == 200) {

                my_Balance -= amount_Withdraw;

                System.out.println("");
                System.out.println("Your withdrawal amount is: " + amount_Withdraw);
                System.out.println("");
                System.out.println("Your balance is now " + my_Balance
                        + " after your " + amount_Withdraw + " withdrawal");
                System.out.println("");
                System.out.println("++++++ Don't forget to take your money below ++++++");
            } else {
                System.out.println("Please enter a valid withdrawal amount. Either 20, 40, 60, 120 or 200");
                Transactions reRun = new Transactions();
                reRun.withdrawal();
            }
        } catch (Exception e) {
            System.out.println("********* You need to enter a valid number **********");
            Transactions reRun = new Transactions();
            reRun.withdrawal();
        }
        return my_Balance;
    }

    public double deposit() {

        System.out.println("Welcome to deposits, please enter an amount you would like to deposit");

        try {
            double my_Deposit = scan.nextDouble();
            my_Balance += my_Deposit;

            System.out.println("");
            System.out.println("Your total available balance is now: " + my_Balance
                    + " after depositing " + my_Deposit);

        } catch (Exception e) {
            System.out.println("********* You need to enter a valid number **********");
            Transactions reRun = new Transactions();
            reRun.deposit();
        }
        return my_Balance;
    }

    // gets balance on account
    public double balance() {
        System.out.println("Checking your balance...");
        System.out.println("Your Balance is: " + my_Balance);
        return my_Balance;

    }

}
