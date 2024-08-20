import java.util.Scanner;

public class ISBNValidator {

    // Method to read the ISBN code as a 10-digit integer
    public long inputISBN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 10-digit ISBN number: ");
        long isbn = scanner.nextLong();
        return isbn;
    }

    // Method to check the validity of the ISBN
    public void checkISBN(long isbn) {
        // Check if the ISBN is a 10-digit number
        if (String.valueOf(isbn).length() != 10) {
            System.out.println("ISBN should be a 10-digit number");
            return; // Terminate the program if not 10 digits
        }

        int sum = 0; // To store the sum of the weighted digits
        // Extract each digit and compute the weighted sum
        for (int i = 1; i <= 10; i++) {
            long digit = isbn % 10; // Extract the last digit
            sum += i * digit; // Multiply by its position and add to sum
            isbn /= 10; // Remove the last digit
        }

        // Check if the sum is divisible by 11
        if (sum % 11 == 0) {
            System.out.println("LEGAL ISBN");
        } else {
            System.out.println("ILLEGAL ISBN");
        }
    }

    // Main method to test the ISBN validation
    public static void main(String[] args) {
        ISBNValidator validator = new ISBNValidator();
        long isbn = validator.inputISBN(); // Get the ISBN from the user
        validator.checkISBN(isbn); // Check if the ISBN is legal or illegal
    }
}


/* SAMPLE OUTPUT

Enter a 10-digit ISBN number: 1401601499
LEGAL ISBN


******************** EXPLANATION *********************

1. Class Definition:

The ISBNValidator class contains methods to read and validate the ISBN number.

2. inputISBN Method:

Prompts the user to enter a 10-digit ISBN number.
Reads the ISBN number as a long integer and returns it.

3. checkISBN Method:

Checks if the given ISBN is exactly 10 digits long.
If the ISBN is not 10 digits, it prints an error message and terminates the program.
If the ISBN is valid, it extracts each digit from the ISBN, calculates the weighted sum, and checks if the sum is divisible by 11.
Prints "LEGAL ISBN" if the sum is divisible by 11; otherwise, prints "ILLEGAL ISBN."


4. Main Method:

Creates an instance of ISBNValidator.
Calls the inputISBN method to read the ISBN number.
Calls the checkISBN method to validate the ISBN.

*/