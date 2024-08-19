import java.util.Scanner;

public class LinearSearch {

    // Method to perform linear search on an array
    public static int linearSearch(int[] array, int key) {
        // Iterate through the array from the first element to the last
        for (int i = 0; i < array.length; i++) {
            // Check if the current element matches the key
            if (array[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        // If the key is not found, return -1
        return -1;
    }

    // Main method to test the linear search functionality
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

        // Prompt the user to enter the element to search for
        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();

        // Perform linear search to find the key in the array
        int result = linearSearch(array, key);

        // Display the result of the search
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}

/* SAMPLE OUTPUT

Enter the size of the array: 5
Enter 5 elements for the array:
12 34 45 67 89
Enter the element to search for: 45
Element found at index: 2

******************* EXPLANATION *****************

1. linearSearch Method:

This method accepts an array of integers and a key to search for.
It iterates through the array, comparing each element with the key.
If the key is found, the method returns the index of the element.
If the key is not found after checking all elements, the method returns -1.

2. main Method:

The main method is responsible for gathering input from the user and displaying the search results.
The user is prompted to enter the size of the array and then the elements of the array.
The user is then prompted to enter the element (key) they want to search for.
The program calls the linearSearch method to find the key in the array.
The result is displayed: if the key is found, the index is printed; otherwise, a message is shown indicating that the element was not found.

*/
