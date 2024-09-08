/* Write and execute a java program to convert strings containing numbers into comma-punctuated numbers, 
with a comma every third digit from the right.
eg., Input String: "1234567"
    Output String: "1,234,567" */
public class NumberFormatter {

    // Method to format a numeric string with commas
    public static String formatNumber(String numberStr) {
        // Remove any non-numeric characters (if any)
        numberStr = numberStr.replaceAll("\\D", "");

        // Check if the string is empty or has only one character
        if (numberStr.length() <= 3) {
            return numberStr;
        }

        // Use a StringBuilder to build the formatted string
        StringBuilder formattedNumber = new StringBuilder();
        int length = numberStr.length();

        // Start from the end of the string and work backwards
        for (int i = length - 1; i >= 0; i--) {
            // Append the current digit to the result
            formattedNumber.append(numberStr.charAt(i));

            // Add a comma if it's not the last group of three digits
            if ((length - i) % 3 == 0 && i != 0) {
                formattedNumber.append(',');
            }
        }

        // Reverse the StringBuilder to get the correct order
        return formattedNumber.reverse().toString();
    }

    // Main method to test the formatNumber method
    public static void main(String[] args) {
        // Create a Scanner for user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number string to format: ");
        String input = scanner.nextLine();

        // Format the input number string
        String formattedNumber = formatNumber(input);

        // Display the formatted number
        System.out.println("Formatted Number: " + formattedNumber);

        // Close the scanner
        scanner.close();
    }
}

/* SAMPLE OUTPUT

INPUT 
Enter a number string to format: 1234567

OUTPUT
Formatted Number: 1,234,567
*/
/* EXPLANATION
formatNumber Method:

Remove Non-Numeric Characters: Uses replaceAll("\\D", "") to remove any characters that are not digits.
Handle Short Strings: If the string length is 3 or less, it is returned as-is (no commas needed).
StringBuilder for Formatting: Iterates from the end of the string to the beginning, adding digits and commas as needed. The comma is added every three digits from the right unless it's the start of the string.
Reverse String: Since digits are added in reverse order, the StringBuilder is reversed before converting it to a string.
main Method:

Input Handling: Prompts the user to enter a number string.
Output: Calls the formatNumber method and displays the formatted number.
*/
