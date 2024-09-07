/* 
Print all the prime numbers in a given 1D array.
*/
import java.util.Scanner;

public class PrimeNumbersInArray {

    // Method to check if a number is prime
    // It accepts an integer 'num' and returns true if 'num' is prime, false otherwise
    public static boolean isPrime(int num) {
        // A number is not prime if it's less than or equal to 1
        if (num <= 1) {
            return false;
        }

        // Check if the number is divisible by any number other than 1 and itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // If divisible, the number is not prime
            }
        }

        return true;  // If no divisors are found, the number is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Declare and initialize a 1D array of integers with the given size
        int[] array = new int[size];

        // Input: Ask the user to enter the elements of the array
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Output: Display all the prime numbers in the array
        System.out.print("Prime numbers in the array are: ");
        boolean foundPrime = false;  // To check if any prime number was found

        for (int i = 0; i < size; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");  // Print the prime number
                foundPrime = true;
            }
        }

        // If no prime numbers are found, display a message
        if (!foundPrime) {
            System.out.print("No prime numbers found.");
        }

        System.out.println();  // Move to the next line after printing primes

        scanner.close();  // Close the scanner to free resources
    }
}

/* SAMPLE OUTPUT

OUTPUT1:
Enter the number of elements in the array: 6
Enter 6 elements of the array:
12 5 8 7 11 13
Prime numbers in the array are: 5 7 11 13

OUTPUT2:
Enter the number of elements in the array: 5
Enter 5 elements of the array:
4 6 8 10 12
Prime numbers in the array are: No prime numbers found.

*/