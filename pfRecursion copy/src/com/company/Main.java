package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    // sum numbers
    public static int sumNumbers(int number) {
        int sumNum;
        if (number <= 0) {
            sumNum = 0; //base
        } else {
            sumNum = number + sumNumbers(number - 1);
        }
        return sumNum;
    }

    // Add sum num no recursion

    public static void sumNoRec(int Num) {
        int sum = 0;
        for (int i = 0; i < Num; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number to sum no recursion: ");
        int Num = scnr.nextInt();
        sumNoRec(Num);

        //sum numbers with recursion
        System.out.println("Enter a number to Sum: ");
        int sumNumber = scnr.nextInt();
        System.out.println(sumNumbers(sumNumber));
    }
}
