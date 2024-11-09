// File: myPackages/p1/Maximum.java
package myPackages.p1;

public class Maximum {

    // Method to find the maximum of three integers
    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Method to find the maximum of three floating-point numbers
    public static float max(float a, float b, float c) {
        return Math.max(a, Math.max(b, c));
    }

    // Method to find the maximum element in an array
    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to find the maximum element in a matrix
    public static int max(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
}
