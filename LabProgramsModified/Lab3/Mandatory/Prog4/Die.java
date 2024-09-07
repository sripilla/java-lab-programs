/*
Create a Die class with one integer instance variable called sideUp. Give it a getSideUp() method that returns the value of sideUp and a 
void roll() method that changes sideUpto a random value from 1 to 6. Then create a DieDemo class with a method that creates two Die objects, rolls them, and prints the sum of the two sided up.

*/

import java.util.Random;

public class Die {
    // Instance variable to store the current face value of the die
    private int sideUp;

    // Constructor to initialize the die with a random side up
    public Die() {
        roll();  // Roll the die to set an initial value
    }

    // Method to get the current face value of the die
    public int getSideUp() {
        return sideUp;
    }

    // Method to roll the die and set sideUp to a random value between 1 and 6
    public void roll() {
        Random random = new Random();
        sideUp = random.nextInt(6) + 1; // Generates a number between 1 and 6
    }
}


/* EXPLANATION
Die.java:

Instance Variable:
sideUp: Stores the current face value of the die.
Constructor:
Die(): Calls roll() to set an initial random face value when the Die object is created.
Methods:
getSideUp(): Returns the current face value of the die.
roll(): Uses Random to set sideUp to a random value between 1 and 6.

*/