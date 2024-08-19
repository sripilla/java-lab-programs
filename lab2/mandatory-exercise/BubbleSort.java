public class BubbleSort {

    // Method to perform Bubble Sort in ascending order
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop to traverse through the array multiple times
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to perform comparisons and swaps
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to perform Bubble Sort in descending order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop to traverse through the array multiple times
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to perform comparisons and swaps
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a new line at the end
    }

    // Main method to test the bubble sort methods
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2, 7, 1}; // Example array to sort

        // Display original array
        System.out.println("Original array:");
        printArray(array);

        // Sort the array in ascending order and display it
        bubbleSortAscending(array);
        System.out.println("Array sorted in ascending order:");
        printArray(array);

        // Sort the array in descending order and display it
        bubbleSortDescending(array);
        System.out.println("Array sorted in descending order:");
        printArray(array);
    }
}

/*  SAMPLE OUTPUT

Original array:
5 3 8 4 2 7 1 
Array sorted in ascending order:
1 2 3 4 5 7 8 
Array sorted in descending order:
8 7 5 4 3 2 1 

******************* EXPLANATION *****************

1. bubbleSortAscending Method:

Implements the Bubble Sort algorithm to sort an array in ascending order.
Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order (i.e., the first element is greater than the second).
The largest elements "bubble up" to the end of the array with each pass.

2. bubbleSortDescending Method:

Similar to the ascending sort but swaps elements if the first is smaller than the second, thereby sorting the array in descending order.
The smallest elements "bubble down" to the end of the array with each pass.

3. printArray Method:

Prints the elements of the array in a single line.

4. Main Method:

An example array is defined and sorted in both ascending and descending order using the respective methods.
The original array, as well as the sorted arrays, are printed to the console.
*/
