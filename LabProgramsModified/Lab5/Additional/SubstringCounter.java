/*Write and execute a java program to count number of occurrences of a particular string in another string.
 */
public class SubstringCounter {

    /**
     * Method to count the number of occurrences of a substring within a main string.
     * @param mainString The main string to search within.
     * @param subString The substring to count occurrences of.
     * @return The number of occurrences of the substring in the main string.
     */
    public static int countOccurrences(String mainString, String subString) {
        // Initialize the count of occurrences
        int count = 0;

        // Start index for search
        int startIndex = 0;

        // Loop to find all occurrences of the substring
        while ((startIndex = mainString.indexOf(subString, startIndex)) != -1) {
            // Increment the count for each occurrence found
            count++;
            // Move to the next character after the current occurrence
            startIndex += subString.length();
        }

        return count;  // Return the total count of occurrences
    }

    public static void main(String[] args) {
        // Create a Scanner for user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user for the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt the user for the substring to count
        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();

        // Call the method to count occurrences and store the result
        int count = countOccurrences(mainString, subString);

        // Display the result
        System.out.println("The substring \"" + subString + "\" occurs " + count + " times in the main string.");

        // Close the scanner
        scanner.close();
    }
}

/*SAMPLE OUTPUT

INPUT: 
Enter the main string: This is a test. Testing the test cases.
Enter the substring to count: test

OUTPUT
The substring "test" occurs 3 times in the main string.

*/


/* EXPLANATION
countOccurrences Method:

Parameters: Takes two strings - mainString (the string to search within) and subString (the substring to count).
Count Initialization: Initializes the count of occurrences to 0.
Search Process: Uses indexOf to find the starting index of each occurrence of the substring.
Count Increment: Increments the count for each found occurrence.
Update Start Index: Moves the start index past the current occurrence to continue searching.
Return Count: Returns the total number of occurrences found.
main Method:

Input Handling: Prompts the user to enter both the main string and the substring.
Method Call: Calls countOccurrences to get the number of occurrences.
Display Result: Outputs the count of occurrences to the user.
Scanner Closure: Closes the scanner to avoid resource leaks.
*/