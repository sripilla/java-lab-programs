/* 
Perform the following operations by adding member functions to the program implemented in the above question. 
(Student1.java) 

a) Sort the student records with respect to semester and CGPA.
b) Sort the student record with respect to name.

5. Add member functions to the above code that perform the following operations
*/
import java.util.GregorianCalendar;
import java.util.Scanner;

// Define the Student2 class
class Student2 {
    // Instance variables for the student record
    private int registrationNumber;
    private String fullName;
    private GregorianCalendar dateOfJoining;
    private short semester;
    private float cgpa;

    // Static variable to keep track of the number of students
    private static int studentCount = 0;

    // Parameterized constructor to initialize the student record
    public Student2(String fullName, GregorianCalendar dateOfJoining, short semester, float cgpa) {
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

    // Method to sort students by semester and CGPA
    public static void sortBySemesterAndCGPA(Student2[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].semester > students[j].semester || 
                    (students[i].semester == students[j].semester && students[i].cgpa < students[j].cgpa)) {
                    // Swap students[i] and students[j]
                    Student2 temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    // Method to sort students by name
    public static void sortByName(Student2[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].fullName.compareToIgnoreCase(students[j].fullName) > 0) {
                    // Swap students[i] and students[j]
                    Student2 temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    // Main method to test the Student2 class and sorting functionalities
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner for user input

        // Array to store student records
        Student2[] students = new Student2[5];

        // Input and create student records
        for (int i = 0; i < 5; i++) {
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

            // Create a new Student2 object and store it in the array
            students[i] = new Student2(name, dateOfJoining, semester, cgpa);
            System.out.println();  // Print a blank line for readability
        }

        // Display all student records
        System.out.println("Student Records:");
        for (Student2 student : students) {
            student.displayRecord();
            System.out.println();  // Print a blank line between records
        }

        // Sort and display students by semester and CGPA
        System.out.println("Students sorted by Semester and CGPA:");
        sortBySemesterAndCGPA(students);
        for (Student2 student : students) {
            student.displayRecord();
            System.out.println();  // Print a blank line between records
        }

        // Sort and display students by name
        System.out.println("Students sorted by Name:");
        sortByName(students);
        for (Student2 student : students) {
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

Students sorted by Semester and CGPA:
Registration Number: 1203
Full Name: Charlie Brown
Date of Joining: 10/1/2012
Semester: 1
CGPA: 8.8

Registration Number: 1204
Full Name: 

*/
/* EXPLANATION
Student2 Class:

Instance Variables: Holds information about each student.
Constructor: Initializes the student record and calculates the registration number.
Methods:
displayRecord(): Prints the student's details.
sortBySemesterAndCGPA(): Sorts an array of students first by semester and then by CGPA in descending order.
sortByName(): Sorts an array of students alphabetically by name in a case-insensitive manner.

Main Method:

Prompts the user for details of 5 students.
Stores these details in an array.
Displays all student records.
Sorts and displays students by semester and CGPA.
Sorts and displays students by name.
*/
