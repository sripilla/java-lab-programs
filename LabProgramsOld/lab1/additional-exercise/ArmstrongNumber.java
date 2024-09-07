import java.util.Scanner;

public class ArmstrongNumber {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        // Convert the number to a string to process each digit
        String numStr = Integer.toString(number);
        int numDigits = numStr.length(); // Get the number of digits
        int sum = 0; // Initialize the sum of digits raised to the power

        // Loop through each digit in the number
        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar); // Convert the character to an integer
            sum += Math.pow(digit, numDigits); // Add the digit raised to the power of numDigits to the sum
        }

        // Check if the sum is equal to the original number
        return sum == number; // Return true if they are equal, false otherwise
    }

    // Main method to test if the input number is an Armstrong number
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt(); // Read the number from the user

        // Check if the number is an Armstrong number and print the result
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}

/* SAMPLE OUTPUT

Enter a number to check if it is an Armstrong number: 153
153 is an Armstrong number.

************** Explanaion **************

1. isArmstrong Method:

Converts the number to a string to easily access each digit.
Calculates the number of digits in the number.
For each digit, raises it to the power of the number of digits and adds the result to a sum.
Checks if this sum is equal to the original number.

2. Main Method:

Uses Scanner to get input from the user.
Prompts the user to enter a number.
Reads the number, checks if it is an Armstrong number using isArmstrong, and prints the result.

153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

*/