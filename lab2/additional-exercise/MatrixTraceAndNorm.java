import java.util.Scanner;

public class MatrixTraceAndNorm {

    // Method to calculate the trace of a matrix (sum of diagonal elements)
    public static int calculateTrace(int[][] matrix, int size) {
        int trace = 0;

        // Sum the diagonal elements (where row index equals column index)
        for (int i = 0; i < size; i++) {
            trace += matrix[i][i];
        }

        return trace; // Return the calculated trace
    }

    // Method to calculate the norm of a matrix (sqrt of sum of squares of all elements)
    public static double calculateNorm(int[][] matrix, int rows, int columns) {
        int sumOfSquares = 0;

        // Iterate through each element of the matrix and add its square to sumOfSquares
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumOfSquares += matrix[i][j] * matrix[i][j];
            }
        }

        // Return the square root of sumOfSquares (norm)
        return Math.sqrt(sumOfSquares);
    }

    // Main method to take input and display the trace and norm of the matrix
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns of the matrix
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        // Initialize the matrix with the specified size
        int[][] matrix = new int[rows][columns];

        // Prompt the user to enter the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the trace (only if it's a square matrix)
        int trace = 0;
        if (rows == columns) {
            trace = calculateTrace(matrix, rows);
            System.out.println("The trace of the matrix is: " + trace);
        } else {
            System.out.println("Trace cannot be calculated for a non-square matrix.");
        }

        // Calculate the norm of the matrix
        double norm = calculateNorm(matrix, rows, columns);
        System.out.println("The norm of the matrix is: " + norm);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}

/*  SAMPLER OUTPUT

Enter the number of rows in the matrix: 3
Enter the number of columns in the matrix: 3
Enter the elements of the matrix:
1 2 3
4 5 6
7 8 9
The trace of the matrix is: 15
The norm of the matrix is: 16.881943016134134

Enter the number of rows in the matrix: 2
Enter the number of columns in the matrix: 3
Enter the elements of the matrix:
1 2 3
4 5 6
Trace cannot be calculated for a non-square matrix.
The norm of the matrix is: 9.539392014169456


************************ EXPLANATION *****************

1. calculateTrace Method:

This method calculates the trace of the matrix, which is the sum of the diagonal elements.
It iterates over the diagonal elements (where the row index equals the column index) and sums them up.
The trace is returned to the caller.

2. calculateNorm Method:

This method calculates the norm of the matrix, which is the square root of the sum of the squares of all elements.
It iterates through each element in the matrix, squares it, and adds it to sumOfSquares.
The norm is calculated by taking the square root of sumOfSquares and returned to the caller.

3. main Method:

The main method handles input from the user, stores the matrix elements, and then calculates and displays the trace and norm.
The user is prompted to enter the dimensions and elements of the matrix.
The trace is only calculated if the matrix is square (i.e., the number of rows equals the number of columns).
Both the trace and norm are displayed as the output.

*/