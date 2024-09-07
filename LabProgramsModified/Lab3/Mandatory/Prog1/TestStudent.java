
// NOTE: This program is Continuation STUDENT.java class

// Test class to illustrate the use of STUDENT class
public class TestStudent {

    public static void main(String[] args) {
        // Create a STUDENT object
        STUDENT student = new STUDENT();

        // Initialize an array of marks
        int[] marks = {85, 90, 78, 92, 88};  // Example marks

        // Assign values to the student object
        student.assign("John Doe", marks);

        // Display the student information
        student.display();
    }
}


/* SAMPLE OUTPUT
Student Name: John Doe
Marks: 85 90 78 92 88 
Total Marks: 433
Average Marks: 86.6
*/

/* EXPLANATION

main(String[] args):

Creates an instance of the STUDENT class.
Assigns values to the student object using the assign() method.
Displays the student’s details using the display() method.
*/

/*
How It Works:
The STUDENT class manages student information and calculations.

The TestStudent class demonstrates how to create and use an instance of STUDENT, set its values, and display its information.
*/