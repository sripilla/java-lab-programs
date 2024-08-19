import java.util.Scanner;

public class ArrayInputAndDisplay {

    // Main method to read array size and elements, and then display them
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt(); // Read the array size from user input

        // Initialize the array with the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Read each element and store it in the array
        }

        // Display the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Move to the next line after printing all elements

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}

/*  SAMPLE OUTPUT

Enter the size of the array: 4
Enter 4 elements for the array:
5 10 15 20
The elements of the array are:
5 10 15 20 

******************* EXPLANATION *********************

1. Scanner Initialization:

The Scanner class is used to get user input. An instance of Scanner is created to read data from the console.

2. Reading the Array Size:

The program first prompts the user to enter the size of the array. This determines how many elements the array will hold.
The size is read using scanner.nextInt() and stored in the size variable.

3. Array Initialization:

An array of integers (array) is created with the size specified by the user.

4. Reading Array Elements:

The program then prompts the user to enter the elements of the array.
A for loop is used to read each element and store it in the array.

5. Displaying Array Elements:

After all elements have been read and stored, another for loop is used to print each element of the array.
Each element is printed on the same line, separated by spaces.

6.Resource Cleanup:

The scanner.close() method is called to close the Scanner instance, which helps prevent resource leaks.

*/