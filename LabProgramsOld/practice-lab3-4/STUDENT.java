import java.util.Scanner;

// Class to represent a STUDENT
class STUDENT {
    // Data members
    private String sName;  // Name of the student
    private int[] marks;   // Array to store marks in different subjects
    private int total;     // Total marks obtained by the student
    private double avg;    // Average marks

    // Method to assign initial values to the STUDENT object
    public void assign(String name, int[] marks) {
        this.sName = name;
        this.marks = marks;
    }

    // Method to compute total and average marks
    public void compute() {
        total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];  // Sum up all the marks using a basic for loop
        }
        avg = total / (double) marks.length;  // Calculate average
    }

    // Method to display the STUDENT object details
    public void display() {
        System.out.println("Student Name: " + sName);
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();  // Line break
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }

    // Main method to test the STUDENT class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold 5 marks (assuming 5 subjects)
        int[] marks = new int[5];

        // Create a STUDENT object
        STUDENT student = new STUDENT();

        // Prompt user to input student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Prompt user to input marks
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Assign the values to the student object
        student.assign(name, marks);

        // Compute total and average marks
        student.compute();

        // Display the student details
        student.display();

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

/* SAMPLE OUTPUT
Enter student name: Tom
Enter marks for 5 subjects:
Subject 1: 85
Subject 2: 90
Subject 3: 78
Subject 4: 88
Subject 5: 92

Student Name: Tom
Marks: 85 90 78 88 92 
Total Marks: 433
Average Marks: 86.6


******************** EXPLANATION *********************

1. Class Definition (STUDENT):

Data Members:
    .sName: Stores the name of the student.
    .marks: An array to hold the marks for different subjects.
    .total: Stores the total marks obtained.
    .avg: Stores the average marks.
    
Methods:

    .assign(String name, int[] marks): Initializes the sName and marks fields of the STUDENT object.
    .compute(): Calculates the total marks and average marks.
    .display(): Prints the student's name, marks, total marks, and average marks.

Main Method:

    .Input: The program prompts the user to enter the student's name and marks for 5 subjects.
    .Processing: It assigns these values to a STUDENT object, computes the total and average, and then displays the details.


*/