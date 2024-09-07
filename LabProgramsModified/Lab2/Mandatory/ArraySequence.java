/* 
Write a program that creates an integer array of length N, fills the array with the sequence of values (from 1 to N) using a for loop, and then loops through the array printing out the values. Use a for-each style for loop to print out the values.
*/
import java.util.Scanner;

public class ArraySequence {

    // Main method where the program execution starts
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter the size of the array (N)
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();

        // Declare an array of integers with length N
        int[] array = new int[N];

        // Fill the array with values from 1 to N using a for loop
        for (int i = 0; i < N; i++) {
            array[i] = i + 1;  // Assign values from 1 to N to the array
        }

        // Output: Print the values of the array using a for-each loop
        System.out.print("The values in the array are: ");
        for (int value : array) {
            System.out.print(value + " ");  // Print each value in the array
        }

        System.out.println();  // Move to the next line after printing

        scanner.close();  // Close the scanner to free resources
    }
}

/* SAMPLE OUTPUT 

OUTPUT1:
Enter the size of the array (N): 5
The values in the array are: 1 2 3 4 5

OUTPUT2:
Enter the size of the array (N): 8
The values in the array are: 1 2 3 4 5 6 7 8

*/