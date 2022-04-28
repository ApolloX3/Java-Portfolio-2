package com.company;

public class ChangeMachine {
    ChangeMaker changeMaker = new ChangeMaker();
    double valDivisibleByTwenty, valDivisibleByTen, valDivisibleByFive, valDivisibleByOne,
            valDivisibleByQuarter, valDivisibleByDime, valDivisibleByNickle, valDivisibleByPennie;

    public void changePrinter(double amountChange) {
        ChangeMachine changeMachine = new ChangeMachine();
        if (amountChange >= 20) {changeMachine.CalcIfGreaterThanTwenty(amountChange);
        } else if (amountChange >= 10) {changeMachine.CalcIfGreaterThanTen(amountChange);
        } else if (amountChange >= 5) {changeMachine.CalcIfGreaterThanFive(amountChange);
        } else if (amountChange >= 1) {changeMachine.CalcIfGreaterThanOne(amountChange);
        } else if (amountChange >= .25) {changeMachine.CalcIfGreaterThanQuarter(amountChange);
        } else if (amountChange >= .10) {changeMachine.CalcIfGreaterThanDime(amountChange);
        } else if (amountChange >= .05) {changeMachine.CalcIfGreaterThanNickle(amountChange);
        } else if (amountChange >= .01) {changeMachine.CalcIfGreaterThanPennie(amountChange);
        } else {System.out.println("You did not tender enough money to pay for what you owe.");}
    }
    public void CalcIfGreaterThanTwenty (double amountChange) {
        double changeNoTwenties = changeMaker.calculateTwenties(amountChange);
        valDivisibleByTwenty = (Math.floor(amountChange / 20) * 20);
        double changeNoTens = changeMaker.calculateTens(changeNoTwenties);
        valDivisibleByTen = (changeNoTwenties >= 10) ? (Math.floor(changeNoTwenties / 10) * 10) : 0;
        double changeNoFives = changeMaker.calculateFives(changeNoTens);
        valDivisibleByFive = (changeNoTens >= 5) ? Math.floor(changeNoTens / 5) : 0;
        double changeNoOnes = changeMaker.calculateOnes(changeNoFives);
        valDivisibleByOne = (changeNoFives >= 1) ? Math.floor(changeNoFives / 1) : 0;
        double changeNoQuarters = changeMaker.calculateQuarters(changeNoOnes);
        valDivisibleByQuarter = (changeNoOnes >= .25) ? Math.floor(changeNoOnes / .25) * 25 : 0;
        double changeNoDimes = changeMaker.calculateDimes(changeNoQuarters);
        valDivisibleByDime = (changeNoQuarters >= .10) ? Math.floor(changeNoQuarters / .10) * .10 : 0;
        double changeNoNickles = changeMaker.calculateNickles(changeNoDimes);
        valDivisibleByNickle = (changeNoDimes >= .05) ? Math.floor(changeNoDimes / .05) * .05 : 0;
        double changeNoPennies = changeMaker.calculatePennies(changeNoNickles);
        valDivisibleByPennie = (changeNoNickles >= .01) ? (changeNoNickles / .01) : 0;
    }
    public void CalcIfGreaterThanTen (double amountChange) {
        double changeNoTens = changeMaker.calculateTens(amountChange);
        valDivisibleByTen = (amountChange >= 10) ? (Math.floor(amountChange / 10) * 10) : 0;
        double changeNoFives = changeMaker.calculateFives(changeNoTens);
        valDivisibleByFive = (changeNoTens >= 5) ? Math.floor(changeNoTens / 5) : 0;
        double changeNoOnes = changeMaker.calculateOnes(changeNoFives);
        valDivisibleByOne = (changeNoFives >= 1) ? Math.floor(changeNoFives / 1) : 0;
        double changeNoQuarters = changeMaker.calculateQuarters(changeNoOnes);
        valDivisibleByQuarter = (changeNoOnes >= .25) ? Math.floor(changeNoOnes / .25) * 25 : 0;
        double changeNoDimes = changeMaker.calculateDimes(changeNoQuarters);
        valDivisibleByDime = (changeNoQuarters >= .10) ? Math.floor(changeNoQuarters / .10) * .10 : 0;
        double changeNoNickles = changeMaker.calculateNickles(changeNoDimes);
        valDivisibleByNickle = (changeNoDimes >= .05) ? Math.floor(changeNoDimes / .05) * .05 : 0;
        double changeNoPennies = changeMaker.calculatePennies(changeNoNickles);
        valDivisibleByPennie = (changeNoNickles >= .01) ? (changeNoNickles / .01) : 0;
    }
    public void CalcIfGreaterThanFive (double amountChange) {
        double changeNoFives = changeMaker.calculateFives(amountChange);
        valDivisibleByFive = (amountChange >= 5) ? Math.floor(amountChange / 5) : 0;
        double changeNoOnes = changeMaker.calculateOnes(changeNoFives);
        valDivisibleByOne = (changeNoFives >= 1) ? Math.floor(changeNoFives / 1) : 0;
        double changeNoQuarters = changeMaker.calculateQuarters(changeNoOnes);
        valDivisibleByQuarter = (changeNoOnes >= .25) ? Math.floor(changeNoOnes / .25) * 25 : 0;
        double changeNoDimes = changeMaker.calculateDimes(changeNoQuarters);
        valDivisibleByDime = (changeNoQuarters >= .10) ? Math.floor(changeNoQuarters / .10) * .10 : 0;
        double changeNoNickles = changeMaker.calculateNickles(changeNoDimes);
        valDivisibleByNickle = (changeNoDimes >= .05) ? Math.floor(changeNoDimes / .05) * .05 : 0;
        double changeNoPennies = changeMaker.calculatePennies(changeNoNickles);
        valDivisibleByPennie = (changeNoNickles >= .01) ? (changeNoNickles / .01) : 0;
    }
    public void CalcIfGreaterThanOne (double amountChange) {
        double changeNoOnes = changeMaker.calculateOnes(amountChange);
        valDivisibleByOne = (amountChange >= 1) ? Math.floor(amountChange / 1) : 0;
        double changeNoQuarters = changeMaker.calculateQuarters(changeNoOnes);
        valDivisibleByQuarter = (changeNoOnes >= .25) ? Math.floor(changeNoOnes / .25) * 25 : 0;
        double changeNoDimes = changeMaker.calculateDimes(changeNoQuarters);
        valDivisibleByDime = (changeNoQuarters >= .10) ? Math.floor(changeNoQuarters / .10) * .10 : 0;
        double changeNoNickles = changeMaker.calculateNickles(changeNoDimes);
        valDivisibleByNickle = (changeNoDimes >= .05) ? Math.floor(changeNoDimes / .05) * .05 : 0;
        double changeNoPennies = changeMaker.calculatePennies(changeNoNickles);
        valDivisibleByPennie = (changeNoNickles >= .01) ? (changeNoNickles / .01) : 0;
    }
    public void CalcIfGreaterThanQuarter (double amountChange) {
        double changeNoQuarters = changeMaker.calculateQuarters(amountChange);
        valDivisibleByQuarter = (amountChange >= .25) ? Math.floor(amountChange / .25) * 25 : 0;
        double changeNoDimes = changeMaker.calculateDimes(changeNoQuarters);
        valDivisibleByDime = (changeNoQuarters >= .10) ? Math.floor(changeNoQuarters / .10) * .10 : 0;
        double changeNoNickles = changeMaker.calculateNickles(changeNoDimes);
        valDivisibleByNickle = (changeNoDimes >= .05) ? Math.floor(changeNoDimes / .05) * .05 : 0;
        double changeNoPennies = changeMaker.calculatePennies(changeNoNickles);
        valDivisibleByPennie = (changeNoNickles >= .01) ? (changeNoNickles / .01) : 0;
    }
    public void CalcIfGreaterThanDime (double amountChange) {
        double changeNoDimes = changeMaker.calculateDimes(amountChange);
        valDivisibleByDime = (amountChange >= .10) ? Math.floor(amountChange / .10) * .10 : 0;
        double changeNoNickles = changeMaker.calculateNickles(changeNoDimes);
        valDivisibleByNickle = (changeNoDimes >= .05) ? Math.floor(changeNoDimes / .05) * .05 : 0;
        double changeNoPennies = changeMaker.calculatePennies(changeNoNickles);
        valDivisibleByPennie = (changeNoNickles >= .01) ? (changeNoNickles / .01) : 0;
    }
    public void CalcIfGreaterThanNickle (double amountChange) {
        double changeNoNickles = changeMaker.calculateNickles(amountChange);
        valDivisibleByNickle = (amountChange >= .05) ? Math.floor(amountChange / .05) * .05 : 0;
        double changeNoPennies = changeMaker.calculatePennies(changeNoNickles);
        valDivisibleByPennie = (changeNoNickles >= .01) ? (changeNoNickles / .01) : 0;
    }
    public void CalcIfGreaterThanPennie (double amountChange) {
            double changeNoPennies = changeMaker.calculatePennies(amountChange);
            valDivisibleByPennie = (amountChange>= .01) ? (amountChange / .01) : 0;
    }
}