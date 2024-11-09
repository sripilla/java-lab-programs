// Define the Student class
class Student {
    private int rollNo;
    private double marks;

    // Method to read roll number
    public void getNumber(int rollNo) {
        this.rollNo = rollNo;
    }

    // Method to display roll number
    public void putNumber() {
        System.out.println("Roll No: " + rollNo);
    }

    // Method to read marks
    public void getMarks(double marks) {
        this.marks = marks;
    }

    // Method to display marks
    public void putMarks() {
        System.out.println("Marks: " + marks);
    }

    // Getter for marks to use in Result class
    public double getMarks() {
        return marks;
    }
}

// Define the Sports interface
interface Sports {
    void putGrade();
}

// Define the Result class that extends Student and implements Sports
class Result extends Student implements Sports {
    private String grade;

    // Method to set grade for sports
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Implementing putGrade() method from Sports interface
    @Override
    public void putGrade() {
        System.out.println("Sports Grade: " + grade);
    }

    // Method to display final result
    public void displayResult() {
        // Display roll number and marks from Student class
        putNumber();
        putMarks();

        // Display sports grade from Sports interface method
        putGrade();

        // Calculate and display final result based on marks and grade
        System.out.println("Final Result: " + (getMarks() + (grade.equals("A") ? 10 : (grade.equals("B") ? 5 : 0))));
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Result student1 = new Result();

        // Setting data for student1
        student1.getNumber(101);
        student1.getMarks(85.5);
        student1.setGrade("A");

        // Displaying results for student1
        student1.displayResult();
    }
}


/*SAMPLE OUTPUT

Roll No: 101
Marks: 85.5
Sports Grade: A
Final Result: 95.5
*/