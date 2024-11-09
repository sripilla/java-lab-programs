// File: Main.java
import myPackages.p1.Maximum;

public class Main {
    public static void main(String[] args) {
        // Test max with three integers
        int maxInt = Maximum.max(3, 9, 7);
        System.out.println("Maximum of 3, 9, 7 is: " + maxInt);

        // Test max with three floats
        float maxFloat = Maximum.max(2.5f, 3.8f, 1.9f);
        System.out.println("Maximum of 2.5, 3.8, 1.9 is: " + maxFloat);

        // Test max with an array
        int[] array = {1, 5, 3, 9, 2};
        int maxArray = Maximum.max(array);
        System.out.println("Maximum in array {1, 5, 3, 9, 2} is: " + maxArray);

        // Test max with a matrix
        int[][] matrix = {
            {3, 5, 9},
            {2, 8, 6},
            {4, 7, 1}
        };
        int maxMatrix = Maximum.max(matrix);
        System.out.println("Maximum in matrix is: " + maxMatrix);
    }
}
