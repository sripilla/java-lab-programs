/*
Write a program that creates a "triangular" two-dimensional array A of 10 rows. 
The first row has length 1, 
the second row has length 2,
the third row has length 3, and so on.
Then initialise the array using nested for loops so that the value of 
A[i][j] is i+j.
Finally, print out the array in a nice triangular form.
*/

public class TriangularArray {

    public static void main(String[] args) {
        int rows = 10;  // Define the number of rows in the triangular array

        // Create a 2D array with the given number of rows
        int[][] array = new int[rows][];

        // Initialize the array
        for (int i = 0; i < rows; i++) {
            array[i] = new int[i + 1];  // Set the length of each row

            // Fill the array with values where A[i][j] = i + j
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }

        // Print the array in a triangular form
        System.out.println("Triangular array:");
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for triangular shape
            for (int k = 0; k < rows - i - 1; k++) {
                System.out.print("  ");  // Two spaces for alignment
            }

            // Print the elements of the current row
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();  // Move to the next line after printing a row
        }
    }
}

/* SAMPLE OUTPUT

OUTPUT1:
Triangular array:
                 0 
               1 2 
             2 3 4 
           3 4 5 6 
         4 5 6 7 8 
       5 6 7 8 9 10 
     6 7 8 9 10 11 12 
   7 8 9 10 11 12 13 14 
 8 9 10 11 12 13 14 15 16 
9 10 11 12 13 14 15 16 17 18 

*/