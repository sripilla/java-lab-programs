import java.util.Scanner;

public class ArrayManipulation {

    // Method to insert an element into an array at a specific position
    public static int[] insertElement(int[] arr, int element, int position) {
        int n = arr.length; // Length of the original array
        int[] newArr = new int[n + 1]; // New array with an additional slot for the new element

        // Copy elements up to the position where the new element is to be inserted
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element at the specified position
        newArr[position] = element;

        // Copy the remaining elements after the inserted element
        for (int i = position; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr; // Return the new array with the element inserted
    }

    // Method to delete an element from an array at a specific position
    public static int[] deleteElement(int[] arr, int position) {
        int n = arr.length; // Length of the original array
        int[] newArr = new int[n - 1]; // New array with one less element

        // Copy elements up to the position where the element is to be deleted
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Copy the remaining elements after the deleted position
        for (int i = position + 1; i < n; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr; // Return the new array with the element deleted
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a new line at the end
    }

    // Main method to test insertion and deletion in the array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array to work with
        int[] array = {1, 2, 3, 4, 5};

        // Display the original array
        System.out.println("Original array:");
        printArray(array);

        // Insert an element into the array
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();
        System.out.print("Enter the position to insert the element (0-based index): ");
        int insertPosition = scanner.nextInt();

        // Check if the position is valid
        if (insertPosition < 0 || insertPosition > array.length) {
            System.out.println("Invalid position! Please enter a position between 0 and " + array.length);
        } else {
            array = insertElement(array, elementToInsert, insertPosition);
            System.out.println("Array after insertion:");
            printArray(array);
        }

        // Delete an element from the array
        System.out.print("Enter the position to delete the element (0-based index): ");
        int deletePosition = scanner.nextInt();

        // Check if the position is valid
        if (deletePosition < 0 || deletePosition >= array.length) {
            System.out.println("Invalid position! Please enter a position between 0 and " + (array.length - 1));
        } else {
            array = deleteElement(array, deletePosition);
            System.out.println("Array after deletion:");
            printArray(array);
        }

        // Close the scanner
        scanner.close();
    }
}

/* SAMPLE OUTPUT

Original array:
1 2 3 4 5 
Enter the element to insert: 20
Enter the position to insert the element (0-based index): 3
Array after insertion:
1 2 3 20 4 5 
Enter the position to delete the element (0-based index): 5
Array after deletion:
1 2 3 20 4 

******************** EXPLANATION *****************

1. insertElement Method:

Takes the original array, the element to insert, and the position at which to insert the element.
Creates a new array that is one element larger.
Copies elements from the original array into the new array, inserts the new element at the specified position, and copies the remaining elements after the inserted element.

2. deleteElement Method:

Takes the original array and the position of the element to delete.
Creates a new array that is one element smaller.
Copies elements from the original array, skipping the element at the specified position.

3. printArray Method:

Prints the elements of an array in a single line.

4. Main Method:

Demonstrates how to use the insertElement and deleteElement methods.
Takes input from the user for the element to insert, the position to insert it, and the position of the element to delete.
Validates the input to ensure the position is within the valid range.
Prints the array before and after the insertion and deletion operations.


*/
