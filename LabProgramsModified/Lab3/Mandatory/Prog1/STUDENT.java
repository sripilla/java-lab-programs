/*
Define a Class STUDENT having following members: sname, marks_array, total, avg and provide the following methods:
i) assign(): to assign initial values to the STUDENT object
ii) display(): to display the STUDENT object
iii) compute(): to compute Total, Average marks
Write a java program illustrating Class Declarations, Definition and Accessing Class Members to the test class defined.
*/

// NOTE: This program main class is in TestStudent.java class

// Define the STUDENT class
public class STUDENT {
    // Data members of the STUDENT class
    private String sname;          // Student's name
    private int[] marks_array;     // Array to store marks
    private int total;             // Total of the marks
    private double avg;            // Average of the marks

    // Method to assign initial values to the STUDENT object
    public void assign(String name, int[] marks) {
        sname = name;                 // Assign name
        marks_array = marks;          // Assign marks array
        compute();                    // Compute total and average based on the assigned marks
    }

    // Method to compute the total and average marks
    public void compute() {
        total = 0;  // Initialize total to 0

        // Calculate the total of the marks
        for (int mark : marks_array) {
            total += mark;
        }

        // Calculate the average of the marks
        if (marks_array.length > 0) {
            avg = (double) total / marks_array.length;
        } else {
            avg = 0;  // Average is 0 if there are no marks
        }
    }

    // Method to display the STUDENT object
    public void display() {
        System.out.println("Student Name: " + sname);  // Print the student's name
        System.out.print("Marks: ");

        // Print the marks array
        for (int mark : marks_array) {
            System.out.print(mark + " ");
        }

        System.out.println();  // Move to the next line

        // Print total and average
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

/* Explanation 

    1. Data Members:

    sname: Stores the student's name.
    marks_array: An array to store the student's marks.
    total: Stores the total of the marks.
    avg: Stores the average of the marks.

    2. Methods:

    assign(String name, int[] marks): Initializes the sname and marks_array, then calls compute() to calculate total and avg.
    compute(): Calculates the total and average of the marks.
    display(): Displays the student’s name, marks, total, and average.

    */
