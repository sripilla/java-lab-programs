/*
Search an element in a 1D array using linear search.
*/
import java.util.Scanner;

public class LinearSearch {

    // Method to perform linear search in an array
    // It takes an array and a target value as inputs, and returns the index of the target if found, otherwise -1
    public static int linearSearch(int[] array, int target) {
        // Loop through each element of the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Return the index if the target is found
            }
        }
        return -1;  // Return -1 if the target is not found in the array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initialize the array with the given size
        int[] array = new int[size];

        // Input: Fill the array with user-provided elements
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = scanner.nextInt();  // Read each element
        }

        // Input: Ask the user for the element to search
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(array, target);

        // Output: Display the result of the search
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();  // Close the scanner to free resources
    }
}

/* SAMPLE OUTPUT
OUTPUT1:
Enter the number of elements in the array: 5
Enter 5 elements of the array:
Element [0]: 10
Element [1]: 20
Element [2]: 30
Element [3]: 40
Element [4]: 50
Enter the element to search for: 30
Element 30 found at index: 2

OUTPUT2:
Enter the number of elements in the array: 4
Enter 4 elements of the array:
Element [0]: 1
Element [1]: 3
Element [2]: 5
Element [3]: 7
Enter the element to search for: 4
Element 4 not found in the array.


*/