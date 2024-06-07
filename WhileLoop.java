/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forloop;

/**
 *
 * @author NYARUP
 */
  import java.util.Scanner;
public class WhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of members
        System.out.print("Enter the number of members: ");
        int numMembers = scanner.nextInt();

        // Array to store principal amounts for each member
        double[] principalAmounts = new double[numMembers];

        // Input principal amounts for each member
        int i = 0;
        while (i < numMembers) {
            System.out.print("Enter the principal amount for member " + (i + 1) + ": ");
            principalAmounts[i] = scanner.nextDouble();
            i++;
        }

        // Input the annual interest rate
        System.out.print("Enter the annual interest rate (in %): ");
        double interestRate = scanner.nextDouble();

        // Input the number of years for the investment
        System.out.print("Enter the number of years for the investment: ");
        int years = scanner.nextInt();

        // Calculate and display the value of investment after the time frame elapses
        System.out.println("\nInvestment values after " + years + " years:");

        i = 0;
        while (i < numMembers) {
            double principal = principalAmounts[i];
            double amount = principal * Math.pow((1 + interestRate / 100), years);
            System.out.printf("Member %d: Initial Principal = %.2f, Investment Value = %.2f%n", (i + 1), principal, amount);
            i++;
        }

        scanner.close();
    }
}
  

