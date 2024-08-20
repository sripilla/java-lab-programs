import java.util.Random;

// Die class representing a six-sided die
class Die {
    private int sideUp;  // Instance variable to store the current side up of the die

    // Constructor to initialize the die with a random side up
    public Die() {
        roll();  // Roll the die to set an initial random value
    }

    // Method to return the current value of sideUp
    public int getSideUp() {
        return sideUp;
    }

    // Method to roll the die, setting sideUp to a random value between 1 and 6
    public void roll() {
        Random rand = new Random();
        sideUp = rand.nextInt(6) + 1;  // Generates a random number between 1 and 6
    }
}

// DieDemo class to demonstrate rolling two dice and printing the sum of their sides up
public class DieDemo {

    public static void main(String[] args) {
        // Create two Die objects
        Die die1 = new Die();
        Die die2 = new Die();

        // Roll both dice
        die1.roll();
        die2.roll();

        // Get the values of side up for both dice
        int sideUp1 = die1.getSideUp();
        int sideUp2 = die2.getSideUp();

        // Print the side up values for both dice
        System.out.println("Die 1 rolled: " + sideUp1);
        System.out.println("Die 2 rolled: " + sideUp2);

        // Calculate and print the sum of the two sides up
        int sum = sideUp1 + sideUp2;
        System.out.println("Sum of the two dice: " + sum);
    }
}


/*  SAMPLE OUTPUT
Die 1 rolled: 4
Die 2 rolled: 6
Sum of the two dice: 10

********************** EXPLANATION *************************

1. Die Class:

The Die class has one private instance variable sideUp to store the value of the side currently facing up.
The constructor initializes the die by rolling it once, setting sideUp to a random value between 1 and 6.
The getSideUp method returns the current value of sideUp.
The roll method generates a random number between 1 and 6 and assigns it to sideUp.

2. DieDemo Class:

The DieDemo class contains the main method, which demonstrates the functionality of the Die class.
Two Die objects (die1 and die2) are created.
The dice are rolled using the roll method.
The values of sideUp for both dice are retrieved using getSideUp.
The program prints the value of each die and the sum of the two values.
*/