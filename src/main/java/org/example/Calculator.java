package org.example;

import java.util.Scanner;

public class Calculator {
    public static double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Input must be a non-negative number for squaroot.");
        }

        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        long result = 1;

        if (x < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer for factorial.");
        }

        if (x > 20) {
            throw new IllegalArgumentException("Input must be less than 20 for factorial to avoid overflow.");
        }

        for (int i = 1; i <= x; i++) {
            result *= i;
        }

        return result;
    }

    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Input must be greater than 0 for natural logarithm.");
        }

        return Math.log(x);
    }

    public static double power(double x, double b) {
        if (x == 0 && b < 0) {
            throw new IllegalArgumentException("Input must be valid for power operation.");
        }

        return Math.pow(x, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Select an operation: ");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");

            int option;

            try {
                option = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number corresponding to the options.");
                // Clear the invalid input
                sc.next();
                continue;
            }

            if (option == 5) {
                System.out.println("Exiting the calculator...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println();
                    System.out.println("Error: " + e.getMessage());
                    System.out.println();
                }

                break;
            }

            double x;
            double b;

            switch (option) {
                case 1:
                    System.out.println("Enter a number to find its square root: ");
                    x = sc.nextDouble();

                    try {
                        System.out.println();
                        System.out.println("Result: " + squareRoot(x));
                        System.out.println();
                    } catch (IllegalArgumentException e) {
                        System.out.println();
                        System.out.println("Error: " + e.getMessage());
                        System.out.println();
                    }

                    break;

                case 2:
                    System.out.println("Enter a number to find its factorial: ");
                    int x1 = sc.nextInt();

                    try {
                        System.out.println();
                        System.out.println("Result: " + factorial(x1));
                        System.out.println();
                    } catch (IllegalArgumentException e) {
                        System.out.println();
                        System.out.println("Error: " + e.getMessage());
                        System.out.println();
                    }

                    break;

                case 3:
                    System.out.println("Enter a number to find its natural logarithm: ");
                    x = sc.nextDouble();

                    try {
                        System.out.println();
                        System.out.println("Result: " + naturalLog(x));
                        System.out.println();
                    } catch (IllegalArgumentException e) {
                        System.out.println();
                        System.out.println("Error: " + e.getMessage());
                        System.out.println();
                    }

                    break;

                case 4:
                    System.out.println("Enter base (x): ");
                    x = sc.nextDouble();
                    System.out.println("Enter exponent (b): ");
                    b = sc.nextDouble();

                    try {
                        System.out.println();
                        System.out.println("Result: " + power(x, b));
                        System.out.println();
                    } catch (IllegalArgumentException e) {
                        System.out.println();
                        System.out.println("Error: " + e.getMessage());
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println();
                    System.out.println("Input must be valid for power operation.");
                    System.out.println();
                    break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        sc.close();
    }
}