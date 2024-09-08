/*To the already defined STUDENT4 class, add two subclasses. ScienceStudent and ArtsStudent. Add a private data member practicalMarks (int): to the ScienceStudent class to represent the marks obtained by the student in the practical subject. The ScienceStudent class should override the compute() method to include the practical marks in the total marks and average marks calculation. The ScienceStudent class should provide a method displayPracticalMarks() to display the practical marks obtained by the science student. Add the private data member electiveSubject(String): to the ArtStudent class to represent the elective subject chosen by the arts student. Also add appropriate constructors to the subclasses. In the Main class, create objects of STUDENT, scienceStudent and ArtsStudent, and demonstrate the keyword 'super' and other functionalities of the classes by assigning values, computing marks, and displaying the information of the students. Also demonstrate dynamic polymorphism. */

// Base class STUDENT4
class Student4 {
    protected String name;
    protected int rollNumber;
    protected int[] marks; // Array to store marks in subjects
    protected int totalMarks;
    protected double averageMarks;

    // Parameterized constructor for STUDENT4
    public Student4(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to compute total and average marks
    public void compute() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        averageMarks = totalMarks / (double) marks.length;
    }

    // Method to display student information
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

// Subclass ScienceStudent that extends Student4
class ScienceStudent extends Student4 {
    private int practicalMarks; // Marks for practical subject

    // Parameterized constructor for ScienceStudent
    public ScienceStudent(String name, int rollNumber, int[] marks, int practicalMarks) {
        super(name, rollNumber, marks); // Call the base class constructor
        this.practicalMarks = practicalMarks;
    }

    // Override the compute() method to include practical marks
    @Override
    public void compute() {
        super.compute(); // Call the base class compute method
        totalMarks += practicalMarks; // Add practical marks to total
        averageMarks = totalMarks / (double) (marks.length + 1); // Include practical marks in average calculation
    }

    // Method to display practical marks
    public void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }

    // Override display method to show practical marks
    @Override
    public void display() {
        super.display(); // Call the base class display method
        displayPracticalMarks(); // Show practical marks
    }
}

// Subclass ArtsStudent that extends Student4
class ArtsStudent extends Student4 {
    private String electiveSubject; // Elective subject chosen by the student

    // Parameterized constructor for ArtsStudent
    public ArtsStudent(String name, int rollNumber, int[] marks, String electiveSubject) {
        super(name, rollNumber, marks); // Call the base class constructor
        this.electiveSubject = electiveSubject;
    }

    // Override display method to show elective subject
    @Override
    public void display() {
        super.display(); // Call the base class display method
        System.out.println("Elective Subject: " + electiveSubject);
    }
}



/* EXPLANATION

Explanation:
Base Class Student4:

Contains basic fields (name, rollNumber, marks).
Has a compute() method that calculates total and average marks.
A display() method to show the student's details.

Subclass ScienceStudent:

Adds practicalMarks as an extra data member.
Overrides compute() to include practical marks in total and average.
A displayPracticalMarks() method shows the practical marks.
Overrides the display() method to call the base class method and display practical marks.

Subclass ArtsStudent:

Adds electiveSubject as an extra data member.
Overrides display() to include elective subject details.
*/