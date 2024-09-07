/* 
i) Write a method reverse to accept one integer parameter and to return the reversed digits of accepted number{
ii) Using this method, check whether the inputted parameter is 
  pallindrome or not. 
*/ 

import java.util.Scanner;

public class ReverseAndPalindrome {

    // Method to reverse the digits of the given number
    public static int reverse(int number) {
        int reversed = 0;

        // Loop to reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Add the digit to the reversed number
            number /= 10;  // Remove the last digit from the original number
        }
        return reversed;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        // A number is a palindrome if it is equal to its reverse
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Output the reversed number
        int reversedNumber = reverse(number);
        System.out.println("Reversed number: " + reversedNumber);

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        scanner.close();
    }
}

/* SAMPLE OUTPUT

OUTPUT1: 

Enter a number: 12321
Reversed number: 12321
The number is a palindrome.


OUTPUT2:

Enter a number: 12345
Reversed number: 54321
The number is not a palindrome.


*/