import java.util.Scanner;

public class LargestNumber {

    // Method to find the maximum of three numbers
    public static int largest(int num1, int num2, int num3) {
        // Initialize the maximum value to the first number
        int max = num1;

        // Compare max with the second number
        if (num2 > max) {
            max = num2;
        }

        // Compare max with the third number
        if (num3 > max) {
            max = num3;
        }

        // Return the largest number
        return max;
    }

    // Main method to read 3 numbers and find the largest among them
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Call the largest method to find the maximum of the three numbers
        int maxNumber = largest(number1, number2, number3);

        // Print the largest number
        System.out.println("The largest number is: " + maxNumber);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}


/* SAMPLE OUTPUT

Enter the first number: 3
Enter the second number: 4
Enter the third number: 5
The largest number is: 5

**************** EXPLANATION *****************

1. largest Method:

This method takes three integer parameters (num1, num2, and num3) and returns the largest among them.
It initializes max to the first number and then compares it with the other two numbers to determine the largest.

2. main Method:

The main method is where the program starts execution.
It uses a Scanner object to read three integers from the user.
After reading the inputs, it calls the largest method to find the largest number among the three and prints the result

*/
