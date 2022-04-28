package com.company;

public class ChangeMaker {
    public double calculateTwenties(double amountChange) {
        double amountOfTwenties = Math.floor(amountChange / 20);
        double amountOfTwentiesInDollars = amountOfTwenties * 20;
        double amountChangeNoTwenties = amountChange - amountOfTwentiesInDollars;
        System.out.println(amountOfTwenties + " Twenties");
            return amountChangeNoTwenties;
    }
    public double calculateTens(double amountChange) {
        double amountOfTens = Math.floor(amountChange / 10);
        double amountOfTensInDollars = amountOfTens * 10;
        double amountOfChangeNoTens = amountChange - amountOfTensInDollars;
        System.out.println(amountOfTens + " Tens");
            return amountOfChangeNoTens ;
    }
    public double calculateFives(double amountChange) {
        double amountOfFives = Math.floor(amountChange / 5);
        double amountOfFivesInDollars = amountOfFives * 5;
        double amountOfChangeNoFives = amountChange - amountOfFivesInDollars;
        System.out.println(amountOfFives + " Fives");
            return amountOfChangeNoFives ;
    }
    public double calculateOnes(double amountChange) {
        double amountOfOnes = Math.floor(amountChange / 1);
        double amountOfOnesInDollars = amountOfOnes * 1;
        double amountOfChangeNoOnes = amountChange - amountOfOnesInDollars;
        System.out.println(amountOfOnes + " Ones");
            return amountOfChangeNoOnes ;
    }
    public double calculateQuarters(double amountChange) {
        double amountOfQuarters = Math.floor(amountChange / .25);
        double amountOfQuartersInCents = amountOfQuarters * .25;
        double amountOfChangeNoQuarters = amountChange - amountOfQuartersInCents;
        System.out.println(amountOfQuarters + " Quarters");
            return amountOfChangeNoQuarters ;
    }
    public double calculateDimes(double amountChange) {
        double amountOfDimes = Math.floor(amountChange / .10);
        double amountOfDimesInCents = amountOfDimes * .10;
        double amountOfChangeNoDimes = amountChange - amountOfDimesInCents;
        System.out.println(amountOfDimes + " Dimes");
            return amountOfChangeNoDimes;
    }
    public double calculateNickles(double amountChange) {
        double amountOfNickles = Math.floor(amountChange / .05);
        double amountOfNicklesInCents = amountOfNickles * .05;
        double amountOfChangeNoNickles = amountChange - amountOfNicklesInCents;
        System.out.println(amountOfNickles + " Nickles");
            return amountOfChangeNoNickles;
    }
    public double calculatePennies(double amountChange) {
        double amountOfPennies = Math.floor(amountChange / .01);
        System.out.println(amountOfPennies + " Pennies");
            return amountOfPennies;
    }
}