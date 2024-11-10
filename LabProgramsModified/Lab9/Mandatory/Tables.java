/*Create a class by extending Thread Class to print a multiplication table of a number
supplied as parameter. Create another class Tables which will instantiate two objects
of the above class to print multiplication table of 5 and 7. */

// Class that extends Thread to print multiplication table
class MultiplicationTable extends Thread {
    private int number;

    // Constructor to set the number for which multiplication table is to be printed
    public MultiplicationTable(int number) {
        this.number = number;
    }

    // Overriding the run() method of Thread class to print multiplication table
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

// Class to instantiate objects of MultiplicationTable class and print tables
public class Tables {
    public static void main(String[] args) {
        // Create two MultiplicationTable objects for 5 and 7
        MultiplicationTable table5 = new MultiplicationTable(5);
        MultiplicationTable table7 = new MultiplicationTable(7);

        // Start the threads to print the multiplication tables
        table5.start();
        table7.start();

        try {
            // Wait for both threads to finish
            table5.join();
            table7.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}


/*SAMPLE OUTPUT
5 * 1 = 5
7 * 1 = 7
5 * 2 = 10
7 * 2 = 14
5 * 3 = 15
7 * 3 = 21
5 * 4 = 20
7 * 4 = 28
5 * 5 = 25
7 * 5 = 35
5 * 6 = 30
7 * 6 = 42
5 * 7 = 35
7 * 7 = 49
5 * 8 = 40
7 * 8 = 56
5 * 9 = 45
7 * 9 = 63
5 * 10 = 50
7 * 10 = 70
[Finished in 814ms]*/