public class SumOfDigits {

    // Method to find the sum of the digits of a number
    public static int findSum(int number) {
        int sum = 0; // Initialize the sum to 0

        // Use the absolute value to handle negative numbers
        number = Math.abs(number);

        // Loop until the number becomes 0
        while (number > 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Return the total sum of digits
        return sum;
    }

    // Main method to test the findSum method
    public static void main(String[] args) {
        int number = 12345; // Example number to test

        // Calculate the sum of digits using the findSum method
        int sum = findSum(number);

        // Print the result
        System.out.println("The sum of the digits of " + number + " is " + sum + ".");
    }
}


/* SAMPLE OUTPUT

The sum of the digits of 12345 is 15.

************** Explanations **************

1. findSum Method:

Input: Takes an integer number as input.
Process:
    Initializes sum to 0.
    Uses a while loop to process each digit of the number.
    In each iteration, extracts the last digit of the number     using number % 10.
    Adds this digit to sum.
    Removes the last digit from the number by performing integer division (number /= 10).
    Continues until number becomes 0.
Output: Returns the sum of the digits.

2. Main Method:

Sets an example number 12345 to test the findSum method.
Calls findSum with the example number and stores the result.
Prints out the sum of the digits of the number.
*/