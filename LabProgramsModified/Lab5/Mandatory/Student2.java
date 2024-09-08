/* 
Perform the following operations by adding member functions to the program implemented in the above question. 
(Student1.java) 

a) Sort the student records with respect to semester and CGPA.
b) Sort the student record with respect to name.

5. Add member functions to the above code that perform the following operations
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    public static void sortBySemesterAndCGPA(ArrayList<Student2> students) {
        Collections.sort(students, new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                // First compare by semester
                int semesterComparison = Short.compare(s1.semester, s2.semester);
                if (semesterComparison != 0) {
                    return semesterComparison;
                }
                // If semesters are the same, compare by CGPA
                return Float.compare(s2.cgpa, s1.cgpa);  // Descending order for CGPA
            }
        });
    }

    // Method to sort students by name
    public static void sortByName(ArrayList<Student2> students) {
        Collections.sort(students, new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s1.fullName.compareToIgnoreCase(s2.fullName);  // Alphabetical order (case insensitive)
            }
        });
    }

    // Main method to test the Student2 class and sorting functionalities
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner for user input

        // ArrayList to store student records
        ArrayList<Student2> students = new ArrayList<>();

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

            // Create a new Student2 object and store it in the ArrayList
            students.add(new Student2(name, dateOfJoining, semester, cgpa));
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
Full Name: Daisy Miller
Date of Joining: 22/8/2012
Semester: 4
CGPA: 9.0

Registration Number: 1201
Full Name: Alice Johnson
Date of Joining: 15/4/2012
Semester: 2
CGPA: 8.5

Registration Number: 1205
Full Name: Eva Green
Date of Joining: 30/7/2012
Semester: 2
CGPA: 8.2

Registration Number: 1202
Full Name: Bob Smith
Date of Joining: 20/5/2012
Semester: 3
CGPA: 7.9

Students sorted by Name:
Registration Number: 1203
Full Name: Charlie Brown
Date of Joining: 10/1/2012
Semester: 1
CGPA: 8.8

Registration Number: 1201
Full Name: Alice Johnson
Date of Joining: 15/4/2012
Semester: 2
CGPA: 8.5

Registration Number: 1205
Full Name: Eva Green
Date of Joining: 30/7/2012
Semester: 2
CGPA: 8.2

Registration Number: 1204
Full Name: Daisy Miller
Date of Joining: 22/8/2012
Semester: 4
CGPA: 9.0

Registration

*/
/* EXPLANATION
Class Name: Changed to Student2 to meet the requirement.
Sorting Methods:
sortBySemesterAndCGPA(): Sorts students first by semester and then by CGPA in descending order if semesters are the same.
sortByName(): Sorts students alphabetically by their names in a case-insensitive manner.
Main Method:
Collects details for 5 students.
Displays the details of all students.
Sorts and displays students by semester and CGPA.
Sorts and displays students by name.
*/
