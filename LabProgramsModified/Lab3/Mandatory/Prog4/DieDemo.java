public class DieDemo {

    public static void main(String[] args) {
        // Create two Die objects
        Die die1 = new Die();
        Die die2 = new Die();

        // Roll both dice
        die1.roll();
        die2.roll();

        // Get the side up values of both dice
        int die1Value = die1.getSideUp();
        int die2Value = die2.getSideUp();

        // Calculate the sum of the two dice
        int sum = die1Value + die2Value;

        // Print the results
        System.out.println("Die 1 shows: " + die1Value);
        System.out.println("Die 2 shows: " + die2Value);
        System.out.println("Sum of both dice: " + sum);
    }
}

/*  EXPLANATION
DieDemo.java:

main(String[] args):
Creates two Die objects.
Rolls both dice.
Retrieves and prints the face values of the dice and their sum.
*/

/* SAMPLE OUTPUT
Die 1 shows: 3
Die 2 shows: 5
Sum of both dice: 8

*/

/*
How It Works:
The Die class handles the rolling and value retrieval of a die.
The DieDemo class demonstrates creating and rolling two dice, then calculates and displays their face values and sum.
Each run of the program will produce different results due to the randomness of the die rolls.
*/