package assignment;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PRIME NUMBER CHECKER ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        }

        else if (number == 2) {
            isPrime = true;
        }
        else if (number % 2 == 0) {
            isPrime = false;
        }
        else {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a PRIME number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        scanner.close();
    }
}