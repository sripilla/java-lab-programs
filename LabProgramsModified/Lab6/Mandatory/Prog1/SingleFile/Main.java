// Main.java
class STUDENT4 {
    protected String name;
    protected int rollNo;
    protected int totalMarks;
    protected double averageMarks;

    public STUDENT4(String name, int rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public void compute() {
        averageMarks = totalMarks / 5.0; // Assuming totalMarks out of 500 for simplicity
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

class ScienceStudent extends STUDENT4 {
    private int practicalMarks;

    public ScienceStudent(String name, int rollNo, int totalMarks, int practicalMarks) {
        super(name, rollNo, totalMarks);
        this.practicalMarks = practicalMarks;
    }

    @Override
    public void compute() {
        totalMarks += practicalMarks;
        averageMarks = totalMarks / 6.0; // Including practical marks in total
    }

    public void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }

    @Override
    public void display() {
        super.display();
        displayPracticalMarks();
    }
}

class ArtsStudent extends STUDENT4 {
    private String electiveSubject;

    public ArtsStudent(String name, int rollNo, int totalMarks, String electiveSubject) {
        super(name, rollNo, totalMarks);
        this.electiveSubject = electiveSubject;
    }

    public void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }

    @Override
    public void display() {
        super.display();
        displayElectiveSubject();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a general STUDENT4 object
        STUDENT4 generalStudent = new STUDENT4("Alice", 101, 450);
        generalStudent.compute();
        System.out.println("General Student Info:");
        generalStudent.display();

        // Creating a ScienceStudent object
        ScienceStudent scienceStudent = new ScienceStudent("Bob", 102, 400, 40);
        scienceStudent.compute();
        System.out.println("\nScience Student Info:");
        scienceStudent.display();

        // Creating an ArtsStudent object
        ArtsStudent artsStudent = new ArtsStudent("Charlie", 103, 420, "History");
        artsStudent.compute();
        System.out.println("\nArts Student Info:");
        artsStudent.display();

        // Demonstrating dynamic polymorphism
        System.out.println("\nDynamic Polymorphism Demo:");
        STUDENT4 student;

        // Assigning ScienceStudent object to STUDENT4 reference
        student = scienceStudent;
        student.display(); // Should invoke ScienceStudent's overridden display method

        // Assigning ArtsStudent object to STUDENT4 reference
        student = artsStudent;
        student.display(); // Should invoke ArtsStudent's overridden display method
    }
}
