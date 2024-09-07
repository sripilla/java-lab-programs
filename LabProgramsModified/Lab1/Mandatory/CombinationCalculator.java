/*
i) Write a method fact to accept one integer parameter and to find the factorial of a given number.
ii) Using fact method, compute nCr in the main method.
*/

import java.util.Scanner;

public class CombinationCalculator {

    // Method to calculate the factorial of a given number
    // This method accepts an integer 'n' and returns its factorial (n!)
    public static int fact(int n) {
        int factorial = 1;  // Initialize factorial as 1 (since 0! = 1)

        // Loop to multiply numbers from 1 to 'n' to find the factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;  // Multiply factorial by current number
        }

        return factorial;  // Return the computed factorial
    }

    // Main method to compute nCr (combinations) using the factorial method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask user to enter the values of 'n' and 'r'
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter value of r: ");
        int r = scanner.nextInt();

        // Calculate nCr using the formula nCr = n! / (r! * (n - r)!)
        // Using the fact method to calculate factorials
        int nCr = fact(n) / (fact(r) * fact(n - r));

        // Output: Display the calculated value of nCr
        System.out.println("nCr (" + n + "C" + r + ") = " + nCr);

        scanner.close();
    }
}
/* SAMPLE OUTPUT

OUTPUT1:

Enter value of n: 5
Enter value of r: 2
nCr (5C2) = 10

OUTPUT2:

Enter value of n: 6
Enter value of r: 3
nCr (6C3) = 20

*/