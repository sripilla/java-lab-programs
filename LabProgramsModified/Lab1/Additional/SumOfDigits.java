/*
write a method findSum to find the sum of digits of a number.
*/

import java.util.Scanner;

public class SumOfDigits {

    // Method to find the sum of the digits of a given number
    // This method accepts an integer 'number' and returns the sum of its digits
    public static int findSum(int number) {
        int sum = 0;  // Variable to store the sum of digits

        // Loop to extract each digit and add it to the sum
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            sum += digit;  // Add the digit to the sum
            number /= 10;  // Remove the last digit from the number
        }

        return sum;  // Return the computed sum of digits
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the findSum method to compute the sum of digits
        int sumOfDigits = findSum(number);

        // Output: Display the sum of the digits of the number
        System.out.println("The sum of the digits of " + number + " is: " + sumOfDigits);

        scanner.close();  // Close the scanner to free resources
    }
}


/* SAMPLE OUTPUT

Enter a number: 1234
The sum of the digits of 1234 is: 10

*/