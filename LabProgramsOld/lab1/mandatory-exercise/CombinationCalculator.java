import java.util.Scanner;

public class CombinationCalculator {

    // Method to compute the factorial of a given number
    public static int fact(int num) {
        // Initialize the factorial result to 1
        int result = 1;

        // Loop from 1 to the given number and multiply each value to the result
        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        // Return the factorial result
        return result;
    }

    // Main method to compute nCr using the fact method
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for n and r
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        // Calculate nCr using the formula: nCr = n! / (r! * (n-r)!)
        int nCr = fact(n) / (fact(r) * fact(n - r));

        // Display the result
        System.out.println("nCr (" + n + " choose " + r + ") = " + nCr);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}

/* SAMPLE OUTPUT

Enter the value of n: 5
Enter the value of r: 2
nCr (5 choose 2) = 10

o/p2:

Enter the value of n: 6
Enter the value of r: 3
nCr (6 choose 3) = 20

o/p3:

Enter the value of n: 8
Enter the value of r: 0
nCr (8 choose 0) = 1

******************* EXPLANATION *****************

1. fact Method:

This method computes the factorial of a given number num.
It initializes the result to 1 and then multiplies it by every number from 1 to num using a for loop.
The factorial result is then returned.

2. main Method:

The main method is responsible for computing nCr using the fact method.
It starts by prompting the user to input the values of n and r.
nCr is calculated using the formula:
nCr = n! / n! * (n - r)!
 The fact method is called to calculate n!, r!, and (n-r)!.
The result of nCr is then displayed to the user.


*/