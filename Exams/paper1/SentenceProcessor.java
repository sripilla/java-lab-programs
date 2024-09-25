/*Write a java program to do the following:
A. Read a sentence from the user
B. Check if the user entered sentence has digits. If yes, Display a message" DIGIT FOUND" else then arrange
the words of the given sentence in alphabetical order
C. Display the sorted words. */

import java.util.*;

public class SentenceProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Check if the sentence contains any digits
        if (sentence.matches(".*\\d.*")) {
            System.out.println("DIGIT FOUND");
        } else {
            // Split the sentence into words
            String[] words = sentence.split("\\s+");
            // Sort the words alphabetically
            Arrays.sort(words);
            // Display the sorted words
            System.out.println("Sorted Words:");
            for (String word : words) {
                System.out.println(word);
            }
        }
        scanner.close();
    }
}

