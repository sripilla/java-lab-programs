/*Write a program to print all the unique integers in a number. For instance, if the input number is "1232", the output
will be the characters '1' and '3' as they are unique. The digit '2' repeats twice and so it will not be printed. The
number is passed as command line argument. */

public class UniqueDigits {
    public static void main(String[] args) {
        // Ensure a number is passed as command line argument
        if (args.length != 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        // Get the input number as a string from command line
        String number = args[0];

        // Array to count the occurrences of each digit (0-9)
        int[] digitCount = new int[10];

        // Traverse the number string and count each digit occurrence
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (Character.isDigit(c)) {
                digitCount[c - '0']++; // Increment count for the digit
            } else {
                System.out.println("Invalid input: Please enter a valid number.");
                return;
            }
        }

        // Print unique digits (digits with count 1)
        System.out.print("Unique digits: ");
        boolean foundUnique = false;
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] == 1) {
                System.out.print(i + " ");
                foundUnique = true;
            }
        }

        // If no unique digits found, print a message
        if (!foundUnique) {
            System.out.println("No unique digits found.");
        } else {
            System.out.println(); // Move to the next line after printing digits
        }
    }
}
