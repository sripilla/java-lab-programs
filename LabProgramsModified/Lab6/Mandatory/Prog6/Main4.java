/* Design a base class called Student with the following 2 fields
i) Name
ii) Id
Derive 2 classes called Sports and Exam from the Student base class. Class Sports has a field called s_grade and class Exam has a field e_grade which are integer fields. Derive a class called Results which inherit from Sports and Exam. This class has a character array or string field to represent the final result. Also it has a method called display which can be used to display the final result. Illustrate the usage of these classes in main.*/

// Base class Student
class Student {
    // Fields for name and ID of the student
    String name;
    int id;

    // Constructor for Student class
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Derived class Sports from Student
class Sports extends Student {
    // Field for sports grade
    int s_grade;

    // Constructor for Sports class
    public Sports(String name, int id, int s_grade) {
        super(name, id); // Call to base class (Student) constructor
        this.s_grade = s_grade;
    }

    // Method to display sports grade
    public void displaySportsGrade() {
        System.out.println("Sports Grade: " + s_grade);
    }
}

// Derived class Exam from Student
class Exam extends Student {
    // Field for exam grade
    int e_grade;

    // Constructor for Exam class
    public Exam(String name, int id, int e_grade) {
        super(name, id); // Call to base class (Student) constructor
        this.e_grade = e_grade;
    }

    // Method to display exam grade
    public void displayExamGrade() {
        System.out.println("Exam Grade: " + e_grade);
    }
}

// Derived class Results from both Sports and Exam
class Results extends Sports {
    // Field for final result
    String finalResult;

    // Constructor for Results class
    public Results(String name, int id, int s_grade, int e_grade) {
        super(name, id, s_grade); // Call to Sports class constructor
        // Inherit exam grade as well
        this.e_grade = e_grade;

        // Calculate final result
        if (s_grade > 50 && e_grade > 50) {
            finalResult = "Pass";
        } else {
            finalResult = "Fail";
        }
    }

    // Method to display final result
    public void display() {
        // Display student information
        displayStudentInfo();

        // Display grades
        displaySportsGrade();
        System.out.println("Exam Grade: " + e_grade);

        // Display the final result
        System.out.println("Final Result: " + finalResult);
    }
}

// Main class to test the program
public class Main4 {
    public static void main(String[] args) {
        // Creating a Results object and passing the name, ID, sports grade, and exam grade
        Results student1 = new Results("Alice", 101, 60, 75);

        // Display the final result
        student1.display();

        System.out.println(); // Blank line for better output readability

        // Creating another Results object for a different student
        Results student2 = new Results("Bob", 102, 45, 80);

        // Display the final result
        student2.display();
    }
}

/* SAMPLE OUTPUT
Name: Alice
ID: 101
Sports Grade: 60
Exam Grade: 75
Final Result: Pass

Name: Bob
ID: 102
Sports Grade: 45
Exam Grade: 80
Final Result: Fail
*/

/* EXPLANATION
Base Class: Student

Contains name and id fields to represent the student's basic information.
Has a displayStudentInfo() method to show student details.
Derived Classes: Sports and Exam

Sports inherits from Student and adds a s_grade field to represent the sports grade.
Exam also inherits from Student and adds an e_grade field for the exam grade.
Derived Class: Results

Inherits from Sports and overrides the display() method to display student information along with grades and the final result.
The finalResult is computed based on the grades (if both grades are more than 50, the student passes).
Main Class:

Creates Results objects and assigns values to demonstrate how the inheritance and display() method work.*/

/* Key Points:
Inheritance: The Results class inherits from both Sports and Exam.
Constructor Chaining: Constructors of derived classes call the base class constructor using super().
Dynamic Result Calculation: The final result is computed based on the grades in both sports and exams.*/
