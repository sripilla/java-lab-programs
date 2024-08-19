public class PrimeNumberGenerator {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // A prime number is greater than 1 and has no divisors other than 1 and itself
        if (number <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, not a prime number
            }
        }

        return true; // If no divisors found, it's a prime number
    }

    // Main method to generate first N prime numbers
    public static void main(String[] args) {
        int N = 10; // Example: generate the first 10 prime numbers
        int count = 0; // Counter for the number of primes found
        int number = 2; // Start checking from 2, the first prime number

        System.out.println("First " + N + " prime numbers:");

        // Loop until we find the first N prime numbers
        while (count < N) {
            if (isPrime(number)) { // Use the isPrime method to check if the number is prime
                System.out.print(number + " "); // Print the prime number
                count++; // Increment the prime counter
            }
            number++; // Move to the next number
        }
    }
}


/* SAMPLE OUTPUT

First 10 prime numbers:
2 3 5 7 11 13 17 19 23 29 

EXPLANATION:

1. isPrime Method:

Checks if a given number is prime by testing divisibility from 2 up to the square root of the number.
Returns true if the number is prime and false otherwise.

2. Main Method:

Uses the isPrime method to find and print the first N prime numbers.
A loop continues until N prime numbers are found, starting from 2 (the first prime number).
Each prime number is printed out as soon as it's identified.

How to Run:
Set the value of N to generate a different number of prime numbers.
The program will print the first N prime numbers to the console.

*/