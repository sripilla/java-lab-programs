/*
Add the following string processing methods to the class STUDENT:

a) extractInitials(): A method that extracts the initials from the student's name. For example,
if the student's name is "John Doe", this methods would transform it to "JD".

b) removeWhitespace(): A method that removes any whitespace characters from the student's name. 
For example, if the student's name is "John Doe", this methods would transform it to "JohnDoe".

c) List all the student names containing a particular sub string.

d) Sort the student alphabetically

*/
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
    public static void listNamesContainingSubstring(Student[] students, String substring) {
        System.out.println("Students containing \"" + substring + "\":");
        for (Student student : students) {
            if (student.studentName.contains(substring)) {
                System.out.println(student.studentName);
            }
        }
    }

    // Static method to sort students alphabetically by name (Bubble Sort algorithm)
    public static void sortStudentsAlphabetically(Student[] students) {
        int n = students.length;
        Student temp;  // Temporary variable for swapping

        // Bubble Sort algorithm to sort students by name
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare names in case-insensitive manner
                if (students[j].studentName.compareToIgnoreCase(students[j + 1].studentName) > 0) {
                    // Swap students[j] and students[j + 1] if they are in the wrong order
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Display the sorted students
        System.out.println("Students sorted alphabetically:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].studentName);
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

        // Create an array to store 5 Student objects
        Student[] students = new Student[5];

        // Prompt the user to enter details for 5 students
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            students[i] = new Student(name);
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

User Input: User Input:
Enter the name of student 1: john doe

Enter the name of student 2: alice smith

Enter the name of student 3: bob johnson

Enter the name of student 4: mary jane

Enter the name of student 5: lucas white

Enter a substring to search for in student names: jo

OUTPUT:
Enter the name of student 1: john doe
Enter the name of student 2: alice smith
Enter the name of student 3: bob johnson
Enter the name of student 4: mary jane
Enter the name of student 5: lucas white

Student Details:
Student Name: john doe
Initials: JD
Name without Whitespace: johndoe

Student Name: alice smith
Initials: AS
Name without Whitespace: alicesmith

Student Name: bob johnson
Initials: BJ
Name without Whitespace: bobjohnson

Student Name: mary jane
Initials: MJ
Name without Whitespace: maryjane

Student Name: lucas white
Initials: LW
Name without Whitespace: lucaswhite

Enter a substring to search for in student names: jo
Students containing "jo":
john doe
bob johnson
lucas white

Students sorted alphabetically:
alice smith
bob johnson
john doe
lucas white
mary jane

*/

/* EXPLANATION
Student Class:

extractInitials(): Extracts the initials from the student's name.
removeWhitespace(): Removes all whitespace characters from the student's name.
listNamesContainingSubstring(): Lists students whose names contain the specified substring.
sortStudentsAlphabetically(): Sorts students alphabetically using the Bubble Sort algorithm.

Main Method:

Uses a basic array Student[] to store the student objects.
Takes input for student names.
Displays student details.
Lists names containing a specific substring.
Sorts and displays students alphabetically.
*/
