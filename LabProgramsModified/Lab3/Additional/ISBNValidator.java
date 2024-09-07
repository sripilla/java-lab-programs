/*
The International Standard Book (ISBN) is a unique numeric book identifier which is printed on every book. The ISBN is based upon a 10-digit code. The ISBN is legal if:
1*digit1 + 2*digit2 + 3*digit3 + 4*digit4 + 5*digit5 + 6*digit6 + 7*digit7 + 8*digit8 + 9*digit9 + 10*digit10 is divisible by 11

ex: For an ISBN 1401601499:

Sum = 1*1 + 2*4 + 4*1 + 5*6 + 6*0 + 7*1 + 8*4 + 9*9 + 10*9  = 253 which is divisible by 11

Write a program to implement the following methods:

inputISBN() to read the ISBN code as a 10-digit integer.
checkISBN() to check to perform the following check operations:

  a) If the ISBN is not a 10-digit integer, output the message "ISBN should be a 10 digit number" and terminate the program. 

  b) If the number is 10-digit, extract the digits of the number and compute the sum as explained above. If the sum is divisible by 11, output the message, "Legal ISBN"; otherwise output the message "Illegal ISBN"


*/

import java.util.Scanner;

public class ISBNValidator {

    // Method to read the ISBN code as a 10-digit integer
    public static long inputISBN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 10-digit ISBN number: ");
        long isbn = scanner.nextLong();  // Read the ISBN number
        scanner.close();  // Close the scanner

        return isbn;
    }

    // Method to check if the ISBN is legal or illegal
    public static void checkISBN(long isbn) {
        // Convert the ISBN to a string to check its length
        String isbnStr = Long.toString(isbn);

        // Check if the ISBN is exactly 10 digits long
        if (isbnStr.length() != 10) {
            System.out.println("ISBN should be a 10 digit number");
            return;
        }

        // Calculate the sum based on the given formula
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int digit = Character.getNumericValue(isbnStr.charAt(i));
            sum += (i + 1) * digit;  // Calculate the weighted sum
        }

        // Check if the sum is divisible by 11
        if (sum % 11 == 0) {
            System.out.println("Legal ISBN");
        } else {
            System.out.println("Illegal ISBN");
        }
    }

    public static void main(String[] args) {
        // Read the ISBN number from user input
        long isbn = inputISBN();

        // Check if the ISBN number is legal or illegal
        checkISBN(isbn);
    }
}

/* SAMPLE OUTPUT

VALID ISBN:
Enter the 10-digit ISBN number: 1401601499
Legal ISBN

INVALIS ISBN (Not 10 digits): 
Enter the 10-digit ISBN number: 123456789
ISBN should be a 10 digit number

Invalid ISBN (Sum not divisible by 11):

Enter the 10-digit ISBN number: 1234567890
Illegal ISBN


*/

/* EXPLANATION
1. inputISBN():

Reads a 10-digit ISBN number from the user.
Returns the ISBN number as a long.

2. checkISBN(long isbn):

Converts the ISBN number to a string to verify its length.
Checks if the length is exactly 10 digits. If not, it outputs an error message and terminates.
Computes the sum of the weighted digits as per the given formula.
Checks if the computed sum is divisible by 11 and outputs whether the ISBN is legal or illegal.

3. main(String[] args):

Calls inputISBN() to get the ISBN number from the user.
Calls checkISBN() to validate and check the ISBN number.
*/

/* How It Works:
The program ensures that the ISBN number is a 10-digit integer.
It computes a weighted sum of the digits and checks if the sum is divisible by 11.
Outputs appropriate messages based on whether the ISBN is valid or not.
*/