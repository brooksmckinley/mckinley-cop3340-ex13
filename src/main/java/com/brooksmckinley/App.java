/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        double principal = scan.nextDouble();
        System.out.print("What is the rate? ");
        // Divide by 100 to convert percentage into decimal
        double interest = scan.nextDouble() / 100.0;
        System.out.print("What is the number of years? ");
        int years = scan.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int numTimesCompounded = scan.nextInt();

        System.out.println(generateInterestReport(principal, interest, years, numTimesCompounded));
    }

    public static String generateInterestReport(double principal, double interest, int years, int compounded) {
        double investmentWorthCents = (principal * 100) * Math.pow(1 + (interest / compounded), compounded * years);
        // Round up to next cent
        investmentWorthCents = Math.ceil(investmentWorthCents);

        return String.format("$%.2f invested at %f%% for %d years compounded %d times per year is $%.2f.",
                principal, interest * 100.0, years, compounded, investmentWorthCents / 100.00);
    }
}