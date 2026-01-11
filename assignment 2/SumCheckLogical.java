package assignment;

import java.util.Scanner;

public class SumCheckLogical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SUM CHECK USING LOGICAL OPERATORS ===");
        System.out.println("Check if third number = first + second");


        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();


        boolean isSum = (num3 == (num1 + num2));


        if (isSum) {
            System.out.println("\n Result: TRUE");
            System.out.println(num3 + " is equal to (" + num1 + " + " + num2 + ")");
        } else {
            System.out.println("\n Result: FALSE");
            System.out.println(num3 + " is NOT equal to (" + num1 + " + " + num2 + ")");
        }

        scanner.close();
    }
}

