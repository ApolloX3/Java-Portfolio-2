package com.company;

import java.util.Scanner;

public class Main {
    public static void computeFibonacci(int fibNum1, int fibNum2, int runCnt) {
        System.out.println(fibNum1 + " + " + fibNum2 + " = " + (fibNum1 + fibNum2));
        if (runCnt <= 1) {//base case
        } else {
            computeFibonacci(fibNum2, fibNum1 + fibNum2, runCnt - 1);
        }
    }

    // compute fib no recurssion
    public static void computeFib(int count) {
        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i < count; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //fibbonacci numbers with NO recursion
        System.out.println("Enter a number of fibonacci sequence to print with no recursion: ");
        int count = scnr.nextInt();
        computeFib(count);
        System.out.println("");

        // Fib numbers with recursion
        int runFor;     // User specified number of values computed
        // Output program description
        System.out.println("This program outputs the\n" +
                "Fibonacci sequence step-by-step,\n" +
                "starting after the first 0 and 1.\n");

        // Prompt user for number of values to compute
        System.out.print("How many steps would you like? ");
        runFor = scnr.nextInt();

        // Output first two Fibonacci values, call recursive function
        System.out.println("0\n1");
        computeFibonacci(0, 1, runFor);
    }
}
