/* Design a Student class with appropriate data members as in Lab 5. Provide your own exceptions namely Seats Filled Exception, which is thrown when Student registration number is >XX25 (where XX is last two digits of the year of joining) Show the usage of this exception handling using Student objects in the main. (Note: Registration
number must be a unique number)*/

import java.util.Calendar;
import java.util.GregorianCalendar;

// Custom exception for when seats are filled
class SeatsFilledException extends Exception {
    public SeatsFilledException(String message) {
        super(message);
    }
}

class Student {
    // Fields for student details
    private int registrationNumber;
    private String fullName;
    private GregorianCalendar dateOfJoining;
    private short semester;
    private float gpa;
    private float cgpa;

    // Static field to keep track of student count per joining year
    private static int studentCount = 0;
    private static final int MAX_STUDENTS_PER_YEAR = 25; // Limit per year

    // Parameterized constructor
    public Student(String fullName, GregorianCalendar dateOfJoining, short semester, float gpa, float cgpa) throws SeatsFilledException {
        this.fullName = fullName;
        this.dateOfJoining = dateOfJoining;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;

        // Generate registration number based on year and check seat limits
        int year = dateOfJoining.get(Calendar.YEAR) % 100; // Get last two digits of the year
        studentCount++; // Increment the student count for the current year
        int potentialRegNum = year * 100 + studentCount;

        // Check if registration number exceeds the allowed limit for the year
        if (studentCount > MAX_STUDENTS_PER_YEAR) {
            studentCount--; // Revert the increment if registration fails
            throw new SeatsFilledException("Seats filled for the year: " + (year + 2000));
        }

        this.registrationNumber = potentialRegNum;
    }

    // Display method to print student details
    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Joining: " + dateOfJoining.get(Calendar.DAY_OF_MONTH) + "-" +
                           (dateOfJoining.get(Calendar.MONTH) + 1) + "-" + dateOfJoining.get(Calendar.YEAR));
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
        System.out.println("CGPA: " + cgpa);
        System.out.println("------------------------------------");
    }
}

public class StudentRegistrationSystem {
    public static void main(String[] args) {
        // Array to hold a fixed number of student records (attempting 26 to trigger exception)
        Student[] students = new Student[26];

        // Attempt to add 26 student records to exceed seat limit and trigger exception
        for (int i = 0; i < 26; i++) {
            try {
                students[i] = new Student(
                    "Student " + (i + 1),
                    new GregorianCalendar(2023, Calendar.SEPTEMBER, 1),
                    (short) 1,
                    3.5f,
                    3.5f
                );
                students[i].display();
            } catch (SeatsFilledException e) {
                System.out.println("Error: " + e.getMessage());
                break; // Stop adding further students as seats are filled
            }
        }
    }
}

/* SAMPLE OUTPUT
Registration Number: 2301
Full Name: Student 1
Date of Joining: 1-9-2023
Semester: 1
GPA: 3.5
CGPA: 3.5
------------------------------------
...
Registration Number: 2325
Full Name: Student 25
Date of Joining: 1-9-2023
Semester: 1
GPA: 3.5
CGPA: 3.5
------------------------------------
Error: Seats filled for the year: 2023
*/
