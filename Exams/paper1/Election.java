/*An election is contested by 5 candidates. The candidates are identified by numbering them 1 to 5 and the voting is
done by marking the candidate number on the ballot paper. Write a JAVA program to read the ballots, count and
display the votes cast for each candidate along with the spoilt count, in case number read is outside the range 1-5 */

import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to store votes for each candidate (index 0-4 for candidates 1-5)
        int[] votes = new int[5];
        int spoiltVotes = 0; // Counter for spoiled votes

        System.out.println("Enter the number of voters:");
        int voters = scanner.nextInt();

        // Read the ballots for each voter
        System.out.println("Enter the candidate numbers for each voter (1-5):");
        for (int i = 0; i < voters; i++) {
            int vote = scanner.nextInt();

            // Check if the vote is valid (between 1 and 5)
            if (vote >= 1 && vote <= 5) {
                votes[vote - 1]++; // Increment the corresponding candidate's vote count
            } else {
                spoiltVotes++; // Increment the spoiled votes count
            }
        }

        // Display the results
        System.out.println("\nElection Results:");
        for (int i = 0; i < votes.length; i++) {
            System.out.println("Candidate " + (i + 1) + " received " + votes[i] + " votes.");
        }
        System.out.println("Number of spoiled ballots: " + spoiltVotes);

        // Close the scanner
        scanner.close();
    }
}
