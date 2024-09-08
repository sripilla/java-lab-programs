/* Write and execute a java program to pull out all occurrences of a given sub-string present in the main string. 
*/
public class SubstringFinder {

    /**
     * Method to find and print all occurrences of a given substring in the main string.
     * @param mainString The main string to search within.
     * @param subString The substring to find.
     */
    public static void findAllOccurrences(String mainString, String subString) {
        // Start index for search
        int startIndex = 0;

        // Find the first occurrence of the substring
        while ((startIndex = mainString.indexOf(subString, startIndex)) != -1) {
            // Print the starting index of the substring occurrence
            System.out.println("Found occurrence at index: " + startIndex);
            // Move to the next character for searching further occurrences
            startIndex += subString.length();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner for user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user for the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt the user for the substring to find
        System.out.print("Enter the substring to find: ");
        String subString = scanner.nextLine();

        // Call the method to find and print all occurrences
        findAllOccurrences(mainString, subString);

        // Close the scanner
        scanner.close();
    }
}

/* SAMPLE OUTPUT

INPUT 

Enter the main string: This is a test string. This test is just a test.
Enter the substring to find: test

OUTPUT
Found occurrence at index: 10
Found occurrence at index: 21
Found occurrence at index: 35

*/

/* EXPLANATION
findAllOccurrences Method:

Parameters: Takes two strings - the main string to search in and the substring to find.
Search Process: Uses indexOf to find the index of the first occurrence of the substring, starting from startIndex.
Print Index: Each occurrence's starting index is printed.
Update Start Index: Updates startIndex to continue searching after the current occurrence.
main Method:

Input Handling: Prompts the user to input both the main string and the substring.
Method Call: Calls findAllOccurrences to process the input strings.
Scanner Closure: Closes the scanner to avoid resource leaks.
*/