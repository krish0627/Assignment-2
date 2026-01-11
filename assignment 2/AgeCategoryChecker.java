package assignment;

import java.util.Scanner;

public class AgeCategoryChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Age Category Checker ===");
        System.out.print("Please enter your age: ");

        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Error: Age cannot be negative!");
        } else if (age < 18) {
            System.out.println("Category: Minor");
        } else if (age < 65) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior");
        }

        scanner.close();
    }
}