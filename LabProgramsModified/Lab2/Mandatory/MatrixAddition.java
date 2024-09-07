/*
Find the addition of two matrices and display the resultant matrix.
*/
import java.util.Scanner;

public class MatrixAddition {

    // Method to add two matrices and return the resultant matrix
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;         // Number of rows in the matrices
        int cols = matrix1[0].length;      // Number of columns in the matrices

        int[][] result = new int[rows][cols];  // Initialize the resultant matrix

        // Loop through each element and add corresponding elements from matrix1 and matrix2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];  // Add elements
            }
        }

        return result;  // Return the resultant matrix
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user for the dimensions of the matrices
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize two matrices with the given dimensions
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input: Fill the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();  // Read each element
            }
        }

        // Input: Fill the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();  // Read each element
            }
        }

        // Calculate the sum of the two matrices
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Output: Display the first matrix
        System.out.println("First matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix1[i][j] + " ");  // Print each element
            }
            System.out.println();  // New line after each row
        }

        // Output: Display the second matrix
        System.out.println("Second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix2[i][j] + " ");  // Print each element
            }
            System.out.println();  // New line after each row
        }

        // Output: Display the resultant matrix
        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");  // Print each element
            }
            System.out.println();  // New line after each row
        }

        scanner.close();  // Close the scanner to free resources
    }
}

/* SAMPLE OUTPUT

OUTPUT1:
Enter the number of rows: 2
Enter the number of columns: 3
Enter elements for the first matrix:
Enter element [0][0]: 1
Enter element [0][1]: 2
Enter element [0][2]: 3
Enter element [1][0]: 4
Enter element [1][1]: 5
Enter element [1][2]: 6
Enter elements for the second matrix:
Enter element [0][0]: 7
Enter element [0][1]: 8
Enter element [0][2]: 9
Enter element [1][0]: 10
Enter element [1][1]: 11
Enter element [1][2]: 12
First matrix:
1 2 3 
4 5 6 
Second matrix:
7 8 9 
10 11 12 
Resultant matrix after addition:
8 10 12 
14 16 18 

OUTPUT2:
Enter the number of rows: 3
Enter the number of columns: 2
Enter elements for the first matrix:
Enter element [0][0]: 1
Enter element [0][1]: 2
Enter element [1][0]: 3
Enter element [1][1]: 4
Enter element [2][0]: 5
Enter element [2][1]: 6
Enter elements for the second matrix:
Enter element [0][0]: 7
Enter element [0][1]: 8
Enter element [1][0]: 9
Enter element [1][1]: 10
Enter element [2][0]: 11
Enter element [2][1]: 12
First matrix:
1 2 
3 4 
5 6 
Second matrix:
7 8 
9 10 
11 12 
Resultant matrix after addition:
8 10 
12 14 
16 18 

*/