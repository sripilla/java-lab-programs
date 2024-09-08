/*
Add the following string processing methods to the class STUDENT:

a) extractInitials(): A method that extracts the initials from the student's name. For example,
if the student's name is "John Doe", this methods would transform it to "JD".

b) removeWhitespace(): A method that removes any whitespace characters from the student's name. 
For example, if the student's name is "John Doe", this methods would transform it to "JohnDoe".

c) List all the student names containing a particular sub string.

d) Sort the student alphabetically

*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Define the Student class
class Student {
    // Instance variable to store the student's name
    private String studentName;

    // Constructor to initialize the student's name
    public Student(String name) {
        this.studentName = name;
    }

    // Method to extract initials from the student's name
    public String extractInitials() {
        String[] words = studentName.split(" ");
        StringBuilder initials = new StringBuilder();

        // Loop through each word and take the first letter
        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return initials.toString();
    }

    // Method to remove any whitespace characters from the student's name
    public String removeWhitespace() {
        return studentName.replaceAll("\\s+", ""); // Remove all whitespace
    }

    // Static method to list student names containing a particular substring
    public static void listNamesContainingSubstring(ArrayList<Student> students, String substring) {
        System.out.println("Students containing \"" + substring + "\":");
        for (Student student : students) {
            if (student.studentName.contains(substring)) {
                System.out.println(student.studentName);
            }
        }
    }

    // Static method to sort students alphabetically by name
    public static void sortStudentsAlphabetically(ArrayList<Student> students) {
        Collections.sort(students, (s1, s2) -> s1.studentName.compareToIgnoreCase(s2.studentName));
        System.out.println("Students sorted alphabetically:");
        for (Student student : students) {
            System.out.println(student.studentName);
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Initials: " + extractInitials());
        System.out.println("Name without Whitespace: " + removeWhitespace());
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner for user input

        // Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Prompt the user to enter details for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            students.add(new Student(name));
        }

        // Display details for each student
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayStudentDetails();
            System.out.println();  // Print a blank line between students
        }

        // Prompt the user for a substring to search for
        System.out.print("Enter a substring to search for in student names: ");
        String substring = scanner.nextLine();
        listNamesContainingSubstring(students, substring);

        // Sort and display students alphabetically
        sortStudentsAlphabetically(students);

        scanner.close();  // Close the scanner
    }
}

/* SAMPLE OUTPUT
Enter the name of student 1: John Doe
Enter the name of student 2: Jane Smith
Enter the name of student 3: Alice Johnson
Enter the name of student 4: Bob Brown
Enter the name of student 5: Charlie White

Student Details:
Student Name: John Doe
Initials: JD
Name without Whitespace: JohnDoe

Student Name: Jane Smith
Initials: JS
Name without Whitespace: JaneSmith

Student Name: Alice Johnson
Initials: AJ
Name without Whitespace: AliceJohnson

Student Name: Bob Brown
Initials: BB
Name without Whitespace: BobBrown

Student Name: Charlie White
Initials: CW
Name without Whitespace: CharlieWhite

Enter a substring to search for in student names: Smith
Students containing "Smith":
Jane Smith

Students sorted alphabetically:
Alice Johnson
Bob Brown
Charlie White
Jane Smith
John Doe

*/

/* EXPLANATION
Instance Variable: studentName stores the name of the student.
Constructor: Initializes the student's name.
extractInitials(): Extracts and returns the initials of the student’s name.
removeWhitespace(): Removes all whitespace from the student’s name.
listNamesContainingSubstring(): A static method that prints names containing a given substring.
sortStudentsAlphabetically(): A static method that sorts the list of students alphabetically and displays them.
displayStudentDetails(): Displays the student's name, initials, and name without whitespace.
Main Method:
Collects names for 5 students from user input.
Displays each student's details.
Searches for and lists names containing a specified substring.
Sorts and displays students alphabetically.
*/
