/*Create a class, namely, Array_2D that contains a field for storing a 2D-array of integers. Define a static method to reverse each element in the 2D-array and stores the result in a separate 2D-array passed as argument to the static method. Create another class with a main method for creating an instance of the Array_2D class. Write a complete java program. 

Input Matrix:   26  89
                44  10
                 3  76


Output Matrix:  62     98
                44      1
                 3     67 */

public class Array_2D {
    private int[][] array;

    // Constructor to initialize the 2D array
    public Array_2D(int[][] array) {
        this.array = array;
    }

    // Static method to reverse each element in the 2D array
    public static void reverseArray(int[][] inputArray, int[][] outputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                outputArray[i][j] = reverseNumber(inputArray[i][j]);
            }
        }
    }

    // Helper method to reverse a single integer
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10; // Get the last digit and add it to reversed
            num /= 10; // Remove the last digit
        }
        return reversed;
    }
}

public class Main {
    public static void main(String[] args) {
        // Input Matrix
        int[][] inputMatrix = {
            {26, 89},
            {44, 10},
            {3, 76}
        };

        // Output Matrix to store reversed numbers
        int[][] outputMatrix = new int[inputMatrix.length][inputMatrix[0].length];

        // Create an instance of Array_2D
        Array_2D array2D = new Array_2D(inputMatrix);

        // Reverse the input matrix and store the result in outputMatrix
        Array_2D.reverseArray(inputMatrix, outputMatrix);

        // Print the output matrix
        System.out.println("Output Matrix:");
        for (int i = 0; i < outputMatrix.length; i++) {
            for (int j = 0; j < outputMatrix[i].length; j++) {
                System.out.print(outputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
