/*Design an interface called Series with the following methods
i) Get Next (returns the next number in series)
ii) reset(to restart the series)
iii) set Start (to set the value from which the series should start)
Design a class named By Twos that will implement the methods of the interface Series
such that it generates a series of numbers, each two greater than the previous one.
Also design a class which will include the main method for referencing the interface. */
import myPackages.series.ByTwos;

public class Main {
    public static void main(String[] args) {
        ByTwos series = new ByTwos();

        // Set the starting point of the series
        series.setStart(0);

        System.out.println("First 5 numbers in the series:");
        for (int i = 0; i < 5; i++) {
            System.out.println(series.getNext());
        }

        // Reset the series and print again
        series.reset();
        System.out.println("\nSeries after reset:");
        for (int i = 0; i < 5; i++) {
            System.out.println(series.getNext());
        }
    }
}
