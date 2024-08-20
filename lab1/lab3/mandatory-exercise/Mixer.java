import java.util.Scanner;

class Mixer {
    private int[] arr;  // Instance variable to store the elements of the array

    // Method to accept the elements of the array in ascending order without duplicates
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        arr = new int[n];

        System.out.println("Enter the elements in ascending order without duplicates:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            // Ensure the element is in ascending order and not a duplicate
            if (i > 0 && element <= arr[i - 1]) {
                System.out.println("Elements must be in ascending order and unique.");
                i--; // Decrement index to re-enter the element
            } else {
                arr[i] = element;
            }
        }
    }

    // Method to merge the current object's array with another Mixer object's array
    public Mixer mix(Mixer A) {
        int[] mergedArray = new int[this.arr.length + A.arr.length]; // Array to store merged elements
        int i = 0, j = 0, k = 0;

        // Merge the arrays while maintaining ascending order
        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                mergedArray[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                mergedArray[k++] = A.arr[j++];
            } else {
                mergedArray[k++] = this.arr[i++];
                j++; // Skip duplicate element in the second array
            }
        }

        // Copy remaining elements from the first array
        while (i < this.arr.length) {
            mergedArray[k++] = this.arr[i++];
        }

        // Copy remaining elements from the second array
        while (j < A.arr.length) {
            mergedArray[k++] = A.arr[j++];
        }

        // Create a new Mixer object to store the merged array
        Mixer result = new Mixer();
        result.arr = new int[k]; // Initialize the array with the exact size of merged elements
        System.arraycopy(mergedArray, 0, result.arr, 0, k);

        return result; // Return the new Mixer object containing the merged array
    }

    // Method to display the elements of the array
    public void display() {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Main method to test the Mixer class
    public static void main(String[] args) {
        Mixer mixer1 = new Mixer();
        Mixer mixer2 = new Mixer();

        // Accept elements for the first array
        System.out.println("Enter elements for the first array:");
        mixer1.accept();

        // Accept elements for the second array
        System.out.println("Enter elements for the second array:");
        mixer2.accept();

        // Merge the two arrays
        Mixer mergedMixer = mixer1.mix(mixer2);

        // Display the merged array
        System.out.println("Merged array:");
        mergedMixer.display();
    }
}

/* SAMPLE OUTPUT

Enter elements for the first array:
Enter the number of elements: 4
Enter the elements in ascending order without duplicates:
1
3
5
7
Enter elements for the second array:
Enter the number of elements: 5
Enter the elements in ascending order without duplicates:
2
3
6
8
9
Merged array:
1 2 3 5 6 7 8 9 

******************** EXPLANATION *********************

1. Class Definition:

The Mixer class has an instance variable arr, which is an integer array to store the elements.

2. accept Method:

Prompts the user to enter the number of elements and the elements themselves.
Ensures that the elements are entered in ascending order without duplicates.

3. mix Method:

Takes another Mixer object as a parameter and merges its array with the current object's array.
The merging process maintains the ascending order and eliminates duplicates.
Returns a new Mixer object containing the merged array.

4. display Method:

Prints the elements of the array in a single line.

5. Main Method:

Tests the Mixer class by creating two Mixer objects, accepting elements for both, merging them, and displaying the merged array.

*/