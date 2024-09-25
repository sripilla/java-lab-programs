/*Write a java program to print the elements of the matrix in Wave Order as shown below. The matrix can have
different numbers of rows and columns. The matrix contents should be displayed using for-each loop construct.
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
*/

public class WaveOrderMatrix {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix in Wave Order:");
        // Get the number of rows and columns
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Loop through each column
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                // Even column: Traverse top to bottom
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                // Odd column: Traverse bottom to top
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }
}

/* 
Explanation:
The matrix is traversed column by column.
For even-numbered columns, the elements are printed from top to bottom.
For odd-numbered columns, the elements are printed from bottom to top.
This approach follows the "wave" pattern, similar to the one shown in the image.
*/