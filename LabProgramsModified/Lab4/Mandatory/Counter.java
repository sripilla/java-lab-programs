/*
Create a class called Counter that contains a static data member to count the number of Counter objects  being created. Also define a static member function called showCount() which displays the number of objects created at any given point of time. Illustrate this
*/
// Define the Counter class
class Counter {
    // Static variable to store the count of objects created
    static int objectCount = 0;

    // Constructor to increment the object count each time a new object is created
    Counter() {
        objectCount++;  // Increment the object count by 1
    }

    // Static method to display the number of objects created
    static void showCount() {
        System.out.println("Number of Counter objects created: " + objectCount);
    }

    // Main method to illustrate the functionality
    public static void main(String[] args) {
        // Display initial object count (should be 0)
        Counter.showCount();

        // Create the first Counter object
        Counter counter1 = new Counter();
        // Display the updated object count (should be 1)
        Counter.showCount();

        // Create the second Counter object
        Counter counter2 = new Counter();
        // Display the updated object count (should be 2)
        Counter.showCount();

        // Create the third Counter object
        Counter counter3 = new Counter();
        // Display the updated object count (should be 3)
        Counter.showCount();
    }
}

/* SAMPLE OUTPUT
Number of Counter objects created: 0
Number of Counter objects created: 1
Number of Counter objects created: 2
Number of Counter objects created: 3

*/
/* 
1.Static Variable objectCount: This variable belongs to the class and not to any particular object. It keeps track of how many Counter objects have been created.
2. Constructor: Each time a Counter object is created, the constructor increments objectCount by 1.
3. Static Method showCount(): This method displays the current count of objects created so far. Since it's static, it can be called without needing to create an object.
*/