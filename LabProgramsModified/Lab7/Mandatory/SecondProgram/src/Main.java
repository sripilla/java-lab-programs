/*/*Define a class Maximum with the following overloaded static methods
a. max (which finds maximum among three integers and returns the maximum
integer)
b. max (which finds maximum among three floating point numbers and returns the
maximum among them)
c. max (which finds the maximum in an array and returns it)
d. max (which finds the maximum in a matrix and returns the result)
Place this in a package called myPackages.p1. Write a main method to use the
methods of Maximum class in package p1. */ 
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
