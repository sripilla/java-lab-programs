/* 
i) Write a method isPrime to accept one integer parameter and to check whether that parameter is prime or not.
ii) Using this method, generate first N prime numbers in the main method.
*/

import java.util.Scanner;

public class PrimeNumberGenerator {

    // Method to check if a number is prime
    // This method accepts an integer 'num' and returns true if 'num' is prime, false otherwise
    public static boolean isPrime(int num) {
        // A prime number must be greater than 1
        if (num <= 1) {
            return false;
        }

        // Check for factors other than 1 and the number itself
        for (int i = 2; i <= num / 2; i++) {
            // If 'num' is divisible by any number between 2 and num/2, it's not prime
            if (num % i == 0) {
                return false;
            }
        }
        return true;  // If no factors are found, the number is prime
    }

    // Main method to generate the first N prime numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask user to enter the value of N (how many prime numbers to generate)
        System.out.print("Enter the value of N (number of primes to generate): ");
        int N = scanner.nextInt();

        // Variable to count how many prime numbers we have found
        int count = 0;
        // Variable to check each number starting from 2 (since 1 is not prime)
        int num = 2;

        // Loop until we find N prime numbers
        while (count < N) {
            // If the current number is prime, display it and increment the count
            if (isPrime(num)) {
                System.out.print(num + " ");  // Print the prime number
                count++;  // Increment the count of prime numbers found
            }
            num++;  // Move to the next number to check
        }

        System.out.println();  // Move to the next line after printing primes

        scanner.close();
    }
}

/* SAMPLE OUTPUT

OUTPUT1:

Enter the value of N (number of primes to generate): 5
2 3 5 7 11 

OUTPUT2:

Enter the value of N (number of primes to generate): 10
2 3 5 7 11 13 17 19 23 29 

*/