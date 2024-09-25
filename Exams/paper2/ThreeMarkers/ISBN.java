/* The International Standard Book Number (ISBN) is a unique numeric book identifier, which is printed on every book. The ISBN is based upon a
10-digit code. The ISBN is valid if:
1 x digit1 + 2 x digit2 + 3 x digit3 + 4 x digit4 + 5 x digit5 + 6 x digit6 + 7 x digit7 + 8 x digit8 + 9 x digit9 + 10 x digit10 is divisible by 11.
Example: For an ISBN 1401601499:
Sum=1×1 + 2×4 + 3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which is divisible by 11.
Create a class called ISBN and implement the following methods:
inputISBN( ) to read the ISBN code as a 10-digit number from the keyboard.
checkISBN() to perform the following check operations :
If the ISBN is not a 10-digit number, output the message “ISBN should be a 10 digit number” and terminate the program.
ii) If the number is 10-digit, extract the digits of the number and compute the sum as explained above. If the sum is divisible by 11, output the
message, “Legal ISBN”; otherwise output the message, “Illegal ISBN”.
Note: Do not use any array*/

import java.util.Scanner;

public class ISBN {

    // Method to read the ISBN code from the keyboard
    public void inputISBN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 10-digit ISBN number: ");
        String isbn = scanner.nextLine();
        checkISBN(isbn);
    }

    // Method to check if the ISBN is valid
    public void checkISBN(String isbn) {
        // Check if the ISBN is a 10-digit number
        if (isbn.length() != 10 || !isbn.matches("\\d{10}")) {
            System.out.println("ISBN should be a 10 digit number");
            return;
        }

        // Compute the sum for the ISBN validity check
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i)); // Extract the digit
            sum += (i + 1) * digit; // Calculate the weighted sum
        }

        // Check if the sum is divisible by 11
        if (sum % 11 == 0) {
            System.out.println("Legal ISBN");
        } else {
            System.out.println("Illegal ISBN");
        }
    }

    public static void main(String[] args) {
        ISBN isbnChecker = new ISBN();
        isbnChecker.inputISBN(); // Start the process
    }
}
