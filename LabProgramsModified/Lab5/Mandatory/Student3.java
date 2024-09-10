/*
Add member functions to the above code that perform the following operations

a) List all the students whose name starts with a particular character.
b) List all the student names containing a particular sub string.
c) Change the full name in the object to name with just initials and family name. 
For example, Prakash Kalingrao Aithal must be changed to P.K.Aithal and store it in the object. 
Display modified objects.
*/
import java.util.GregorianCalendar;
import java.util.Scanner;

// Define the Student3 class
class Student3 {
    // Instance variables for the student record
    private int registrationNumber;
    private String fullName;
    private GregorianCalendar dateOfJoining;
    private short semester;
    private float cgpa;

    // Static variable to keep track of the number of students
    private static int studentCount = 0;

    // Parameterized constructor to initialize the student record
    public Student3(String fullName, GregorianCalendar dateOfJoining, short semester, float cgpa) {
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
    public static void sortBySemesterAndCGPA(Student3[] students, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].semester > students[j].semester ||
                    (students[i].semester == students[j].semester && students[i].cgpa < students[j].cgpa)) {
                    // Swap students[i] and students[j]
                    Student3 temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    // Method to sort students by name
    public static void sortByName(Student3[] students, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].fullName.compareToIgnoreCase(students[j].fullName) > 0) {
                    // Swap students[i] and students[j]
                    Student3 temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    // Method to list students whose names start with a particular character
    public static void listByStartingCharacter(Student3[] students, int n, char ch) {
        System.out.println("Students whose names start with '" + ch + "':");
        for (int i = 0; i < n; i++) {
            if (students[i].fullName.toUpperCase().startsWith(String.valueOf(ch).toUpperCase())) {
                students[i].displayRecord();
                System.out.println();  // Print a blank line for readability
            }
        }
    }

    // Method to list students whose names contain a particular substring
    public static void listBySubstring(Student3[] students, int n, String substring) {
        System.out.println("Students whose names contain '" + substring + "':");
        for (int i = 0; i < n; i++) {
            if (students[i].fullName.toUpperCase().contains(substring.toUpperCase())) {
                students[i].displayRecord();
                System.out.println();  // Print a blank line for readability
            }
        }
    }

    // Method to change the full name to initials and family name format
    public void convertToInitialsAndFamilyName() {
        String[] parts = fullName.split(" ");
        if (parts.length > 1) {
            StringBuilder initials = new StringBuilder();
            for (int i = 0; i < parts.length - 1; i++) {
                initials.append(parts[i].charAt(0)).append(".");  // Append initial and dot
            }
            fullName = initials.toString() + parts[parts.length - 1];  // Append family name
        }
    }

    // Main method to test the Student3 class and sorting functionalities
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner for user input

        // Array to store student records
        Student3[] students = new Student3[5];

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

            // Create a new Student3 object and store it in the array
            students[i] = new Student3(name, dateOfJoining, semester, cgpa);
            System.out.println();  // Print a blank line for readability
        }

        // Display all student records
        System.out.println("Student Records:");
        for (Student3 student : students) {
            student.displayRecord();
            System.out.println();  // Print a blank line between records
        }

        // Sort and display students by semester and CGPA
        System.out.println("Students sorted by Semester and CGPA:");
        sortBySemesterAndCGPA(students, students.length);
        for (Student3 student : students) {
            student.displayRecord();
            System.out.println();  // Print a blank line between records
        }

        // Sort and display students by name
        System.out.println("Students sorted by Name:");
        sortByName(students, students.length);
        for (Student3 student : students) {
            student.displayRecord();
            System.out.println();  // Print a blank line between records
        }

        // List and display students whose names start with a particular character
        System.out.print("Enter a character to filter names by starting letter: ");
        char startChar = scanner.nextLine().charAt(0);
        listByStartingCharacter(students, students.length, startChar);

        // List and display students whose names contain a particular substring
        System.out.print("Enter a substring to filter names by containing text: ");
        String substring = scanner.nextLine();
        listBySubstring(students, students.length, substring);

        // Convert full names to initials and family name and display modified records
        System.out.println("Modified Student Records with Initials and Family Name:");
        for (Student3 student : students) {
            student.convertToInitialsAndFamilyName();
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
Date of Joining: 10/1



*/
/* EXPLANATION
Class Name: Updated to Student3.
listByStartingCharacter() Method: Lists students whose names start with the specified character.
listBySubstring() Method: Lists students whose names contain the specified substring.
convertToInitialsAndFamilyName() Method: Converts the full name to initials and family name format.
*/