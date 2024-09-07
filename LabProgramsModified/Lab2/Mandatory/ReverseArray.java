/*
Write a program that creates an array of integers and then uses a for loop to reverse the order of the elements in the array.
*/

import java.util.Scanner;

public class ReverseArray {

    // Main method where the program starts
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare an array of integers with size 'n'
        int[] array = new int[n];

        // Input: Ask the user to enter the elements of the array
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();  // Fill the array with user input
        }

        // Output: Display the original array before reversing
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Move to the next line

        // Reverse the array using a for loop
        for (int i = 0; i < n / 2; i++) {
            // Swap elements from the start and end of the array
            int temp = array[i];  // Store the current element in a temporary variable
            array[i] = array[n - i - 1];  // Replace current element with its mirror element
            array[n - i - 1] = temp;  // Assign the temporary value to the mirror position
        }

        // Output: Display the array after reversing
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Move to the next line

        scanner.close();  // Close the scanner to free resources
    }
}


/* SAMPLE OUTPUT

OUTPUT1: 
Enter the number of elements in the array: 5
Enter 5 elements of the array:
1 2 3 4 5
Original array: 1 2 3 4 5 
Reversed array: 5 4 3 2 1

OUTPUT2:
Enter the number of elements in the array: 6
Enter 6 elements of the array:
10 20 30 40 50 60
Original array: 10 20 30 40 50 60 
Reversed array: 60 50 40 30 20 10

*/