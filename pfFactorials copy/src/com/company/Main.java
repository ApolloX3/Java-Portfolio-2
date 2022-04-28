package com.company;

import java.util.Scanner;

public class Main {

    // calculate factorial using recursion
    public static int nFact(int N) {
        int factResult;
        if (N <= 1) { // Base case
            factResult = 1;

        } else {  // Recursive case
            factResult = N * nFact(N - 1);
        }
        return factResult;
    }

    // factorial no recursion
    public static void Fact(int factNum) {
        int fact = 1;
        for (int i = 1; i <= factNum; i++) {
            fact = fact * i;
            System.out.println(fact);
        }
        System.out.println("Factorial of " + factNum + " is: " + fact);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //factorial with recursion
        System.out.println("Enter a number to factorial: ");
        int sumNum = scnr.nextInt();
        System.out.println(nFact(sumNum));

        //factorial with NO recursion
        System.out.println("Enter a number to factorial with no recursion: ");
        int factNum = scnr.nextInt();
        Fact(factNum);

    }
}
