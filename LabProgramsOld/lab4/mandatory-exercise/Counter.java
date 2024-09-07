// Counter class to count the number of objects created
class Counter {
    // Static data member to keep track of the number of Counter objects created
    private static int count = 0;

    // Constructor to increment the count whenever a new Counter object is created
    public Counter() {
        count++;  // Increment the count
    }

    // Static method to display the current number of Counter objects created
    public static void showCount() {
        System.out.println("Number of Counter objects created: " + count);
    }

    // Main method to demonstrate the creation of Counter objects and the use of showCount() method
    public static void main(String[] args) {
        // Creating Counter objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Displaying the count of objects created after creating 3 objects
        Counter.showCount();  // Expected output: 3

        // Creating more Counter objects
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        // Displaying the count of objects created after creating 5 objects
        Counter.showCount();  // Expected output: 5
    }
}


/* SAMPLE OUTPUT

Number of Counter objects created: 3
Number of Counter objects created: 5


*********************** EXPLANATION *************************

1. Class Definition (Counter):

.    The Counter class is designed to count the number of objects created. It contains:
     .    Static Data Member (count): A static integer variable count that keeps track of the number of Counter objects created. Since it is static, it is shared among all instances of the Counter class.
     .    Constructor: The constructor increments the count each time a new Counter object is created.

2. Static Method (showCount):

The showCount() method is a static method that prints the current value of the count, i.e., the number of Counter objects created so far. Since it is static, it can be called without creating an instance of the Counter class.

3. Main Method:

.    Object Creation: The main method demonstrates the creation of Counter objects.
.    Display Object Count: After creating objects, the showCount() method is called to display how many Counter objects have been created.

*/
