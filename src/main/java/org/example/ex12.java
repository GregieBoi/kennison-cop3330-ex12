/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex12 {

    // main
    public static void main(String[] args) {

        // initialize variables, convert rate out of percent, and calculate final total
        double principal = get_principal();
        double rate = get_rate();
        double years = get_years();
        double calc_rate = rate / 100.0;
        double A = principal * (1 + (calc_rate * years));

        // set formats for year and final amount, and set rounding mode for final
        DecimalFormat df_years = new DecimalFormat("0");
        DecimalFormat df_final = new DecimalFormat("0.00");
        df_final.setRoundingMode(RoundingMode.CEILING);

        // print output
        System.out.println("After " + df_years.format(years) + " years at " + rate + "%, the investment will be worth $" + df_final.format(A) + ".");

    }

    // gets principal
    public static double get_principal() {

        // prompts for input and returns scan
        System.out.print("Enter the principal: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // gets rate in percent
    public static double get_rate() {

        // prompts for input and returns scan
        System.out.print("Enter the rate of interest: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // gets time in years
    public static double get_years() {

        // prompts for input and returns scan
        System.out.print("Enter the number of years: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

}
