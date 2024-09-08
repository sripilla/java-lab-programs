/*
Consider the already defined STUDENT class. Provide a default constructor and parameterised constructor to this class. Also provide a display method. Illustrate all the constructors as well as the display method by defining STUDENT objects.
*/

// Define the STUDENT class
class STUDENT {
    // Instance variables to store student details
    String name;
    int rollNumber;
    String grade;

    // Default constructor (no parameters)
    // Initializes the object with default values
    STUDENT() {
        name = "Not provided";
        rollNumber = 0;
        grade = "Not provided";
    }

    // Parameterized constructor
    // Initializes the object with the provided values
    STUDENT(String studentName, int studentRollNumber, String studentGrade) {
        name = studentName;
        rollNumber = studentRollNumber;
        grade = studentGrade;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Main method to illustrate the constructors and display method
    public static void main(String[] args) {
        // Create an object using the default constructor
        STUDENT student1 = new STUDENT();
        // Display the details of the first student (default values)
        System.out.println("Details of Student 1 (Using Default Constructor):");
        student1.display();
        System.out.println();

        // Create an object using the parameterized constructor
        STUDENT student2 = new STUDENT("John Doe", 101, "A");
        // Display the details of the second student (initialized values)
        System.out.println("Details of Student 2 (Using Parameterized Constructor):");
        student2.display();
    }
}

/* SAMPLE OUTPUT
Details of Student 1 (Using Default Constructor):
Student Name: Not provided
Roll Number: 0
Grade: Not provided

Details of Student 2 (Using Parameterized Constructor):
Student Name: John Doe
Roll Number: 101
Grade: A
*/

/* EXPLANATION 
Default Constructor: Initializes name, rollNumber, and grade with default values.
Parameterized Constructor: Takes values for name, rollNumber, and grade as arguments and assigns them to the object.
display method: Displays the student details.
*/
