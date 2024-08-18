package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);
        System.out.printf("The tax amount is %.2f ", tax);

    }

    public static double calculateTax(double income) {
        double tax;
        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = income * 0.043;
        } else {
            tax = income * 0.067;
        }

        return tax;

    }
}