/* 
Design a class which represents a student. Every student record is made up of the following fields.
a) Registration number (int)
b) Full Name (String)
c) Date of joining (Gregorian calendar)
d) Semester (short)
e) CGPA (float)

Whenever a student joins he will be given a new registration number. Registration number is calculated as follows. If year of joining is 2012 and he is the 80th student to join then his registration will be 1280

Write member functions to do the following:

a) Provide parameterised constructors to this class
b) Write display method which displays the record. Test the class by writing suitable main method. 
c) Create an array of student record to store minimum of 5 record in it. Input the record and display them. 

*/

import java.util.GregorianCalendar;
import java.util.Scanner;

// Define the Student1 class
class Student1 {
    // Instance variables for the student record
    private int registrationNumber;
    private String fullName;
    private GregorianCalendar dateOfJoining;
    private short semester;
    private float cgpa;

    // Static variable to keep track of the number of students
    private static int studentCount = 0;

    // Parameterized constructor to initialize the student record
    public Student1(String fullName, GregorianCalendar dateOfJoining, short semester, float cgpa) {
        studentCount++;  // Increment the student count
        this.registrationNumber = calculateRegistrationNumber(dateOfJoining.get(GregorianCalendar.YEAR), studentCount);
        this.fullName = fullName;
        this.dateOfJoining = dateOfJoining;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    // Method to calculate registration number based on year and student count
    private int calculateRegistrationNumber(int year, int studentNumber) {
        return (year % 100) * 100 + studentNumber;  // Format as YYNN
    }

    // Method to display the student record
    public void displayRecord() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Joining: " + dateOfJoining.get(GregorianCalendar.DAY_OF_MONTH) + "/"
                           + (dateOfJoining.get(GregorianCalendar.MONTH) + 1) + "/"
                           + dateOfJoining.get(GregorianCalendar.YEAR));
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }

    // Main method to test the Student1 class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner for user input

        // Array to store student records
        Student1[] students = new Student1[5];

        // Input and create student records
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            // Input the full name of the student
            System.out.print("Full Name: ");
            String name = scanner.nextLine();

            // Input the date of joining
            System.out.print("Date of Joining (YYYY MM DD): ");
            int year = scanner.nextInt();
            int month = scanner.nextInt() - 1;  // GregorianCalendar months are 0-based
            int day = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            GregorianCalendar dateOfJoining = new GregorianCalendar(year, month, day);

            // Input the semester
            System.out.print("Semester: ");
            short semester = scanner.nextShort();

            // Input the CGPA
            System.out.print("CGPA: ");
            float cgpa = scanner.nextFloat();
            scanner.nextLine();  // Consume the newline character

            // Create a new Student1 object and store it in the array
            students[i] = new Student1(name, dateOfJoining, semester, cgpa);
            System.out.println();  // Print a blank line for readability
        }

        // Display all student records
        System.out.println("Student Records:");
        for (Student1 student : students) {
            student.displayRecord();
            System.out.println();  // Print a blank line between records
        }

        scanner.close();  // Close the scanner
    }
}

/* SAMPLE OUTPUT
Enter details for Student 1:
Full Name: Alice Johnson
Date of Joining (YYYY MM DD): 2012 3 15
Semester: 2
CGPA: 8.5

Enter details for Student 2:
Full Name: Bob Smith
Date of Joining (YYYY MM DD): 2012 5 20
Semester: 3
CGPA: 7.9

Enter details for Student 3:
Full Name: Charlie Brown
Date of Joining (YYYY MM DD): 2012 1 10
Semester: 1
CGPA: 8.8

Enter details for Student 4:
Full Name: Daisy Miller
Date of Joining (YYYY MM DD): 2012 8 22
Semester: 4
CGPA: 9.0

Enter details for Student 5:
Full Name: Eva Green
Date of Joining (YYYY MM DD): 2012 7 30
Semester: 2
CGPA: 8.2

Student Records:
Registration Number: 1201
Full Name: Alice Johnson
Date of Joining: 15/4/2012
Semester: 2
CGPA: 8.5

Registration Number: 1202
Full Name: Bob Smith
Date of Joining: 20/5/2012
Semester: 3
CGPA: 7.9

Registration Number: 1203
Full Name: Charlie Brown
Date of Joining: 10/1/2012
Semester: 1
CGPA: 8.8

Registration Number: 1204
Full Name: Daisy Miller
Date of Joining: 22/8/2012
Semester: 4
CGPA: 9.0

Registration Number: 1205
Full Name: Eva Green
Date of Joining: 30/7/2012
Semester: 2
CGPA: 8.2

*/

/* EXPLANATION
Class Name: Changed to Student1 to meet the requirement.
Instance Variables: Store the student's registration number, full name, date of joining, semester, and CGPA.
Static Variable: studentCount tracks the number of students and is used to generate unique registration numbers.
Constructor: Initializes the student's record and calculates the registration number based on the year of joining and student count.
calculateRegistrationNumber() Method: Computes the registration number in the format YYNN, where YY is the last two digits of the year and NN is the student count.
displayRecord() Method: Displays the student's details.
Main Method:
Prompts the user to input details for 5 students.
Creates Student1 objects and stores them in an array.
Displays the details of all students.
*/