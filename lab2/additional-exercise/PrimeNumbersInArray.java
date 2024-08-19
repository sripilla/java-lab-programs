import java.util.Scanner;

public class PrimeNumbersInArray {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // A number less than or equal to 1 is not prime
        if (num <= 1) {
            return false;
        }

        // Check for factors other than 1 and the number itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so it's not prime
            }
        }

        // If no factors are found, the number is prime
        return true;
    }

    // Main method to find and print all prime numbers in an array
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print all prime numbers in the array
        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < size; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " "); // Print the prime number
            }
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}

/* SAMPLE OUTPUT

Enter the size of the array: 6
Enter 6 elements for the array:
12 5 8 13 22 17
Prime numbers in the array are:
5 13 17 

******************* EXPLANATION *****************

1. isPrime Method:

This method checks whether a given number (num) is prime.
It first checks if the number is less than or equal to 1, in which case it’s not prime.
Then, it checks for divisibility by any integer from 2 to the square root of num. If num is divisible by any of these, it’s not prime.
If no divisors are found, the method returns true, indicating that the number is prime.

2. main Method:

The main method is responsible for taking input from the user, storing it in an array, and then printing all the prime numbers in the array.
The user is prompted to enter the size of the array and then the elements of the array.
The program iterates through the array, checking each element using the isPrime method.
If an element is prime, it is printed to the console.

*/