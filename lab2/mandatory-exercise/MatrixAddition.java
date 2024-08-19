import java.util.Scanner;

public class MatrixAddition {

    // Main method to perform matrix addition
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns for the matrices
        System.out.print("Enter the number of rows in the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        int columns = scanner.nextInt();

        // Create two matrices and a resultant matrix
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] result = new int[rows][columns];

        // Input elements for the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i] = new int[columns]; // Initialize the row for matrix1
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i] = new int[columns]; // Initialize the row for matrix2
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the resultant matrix
        System.out.println("The resultant matrix after addition is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}

/*  SAMPLE OUTPUT

Enter the number of rows in the matrices: 2
Enter the number of columns in the matrices: 3
Enter the elements of the first matrix:
1 2 3
4 5 6
Enter the elements of the second matrix:
7 8 9
10 11 12
The resultant matrix after addition is:
8 10 12 
14 16 18 


******************* Explanation *******************

1. User Input:

The program first prompts the user to input the number of rows and columns for the matrices.
It then creates two matrices (matrix1 and matrix2) and a result matrix to store the sum.

2. Matrix Input:

The user is prompted to enter the elements for matrix1 and matrix2.
Each element is stored in the respective position within the matrix.

3. Matrix Addition:

The program performs matrix addition by iterating through each element of the matrices.
The sum of the corresponding elements from matrix1 and matrix2 is stored in the result matrix.

4. Displaying the Resultant Matrix:

The resultant matrix is displayed by iterating through the result matrix and printing each element.
*/