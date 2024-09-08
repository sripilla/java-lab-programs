// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        // Creating an object of STUDENT4 class
        Student4 student = new Student4("John Doe", 101, new int[]{85, 90, 78});
        student.compute();
        System.out.println("STUDENT Information:");
        student.display();
        System.out.println();

        // Creating an object of ScienceStudent class
        ScienceStudent scienceStudent = new ScienceStudent("Jane Smith", 102, new int[]{88, 92, 84}, 95);
        scienceStudent.compute();
        System.out.println("Science STUDENT Information:");
        scienceStudent.display();
        System.out.println();

        // Creating an object of ArtsStudent class
        ArtsStudent artsStudent = new ArtsStudent("Emily Brown", 103, new int[]{75, 80, 85}, "Psychology");
        artsStudent.compute();
        System.out.println("Arts STUDENT Information:");
        artsStudent.display();

        // Demonstrating dynamic polymorphism
        System.out.println("\nDemonstrating dynamic polymorphism:");
        Student4 ref; // Reference of type Student4
        ref = scienceStudent; // ScienceStudent object assigned to Student4 reference
        ref.display(); // Calls ScienceStudent's display() method due to polymorphism
        ref = artsStudent; // ArtsStudent object assigned to Student4 reference
        ref.display(); // Calls ArtsStudent's display() method due to polymorphism
    }
}

/* SAMPLE OUTPUT
STUDENT Information:
Name: John Doe
Roll Number: 101
Total Marks: 253
Average Marks: 84.33333333333333

Science STUDENT Information:
Name: Jane Smith
Roll Number: 102
Total Marks: 359
Average Marks: 89.75
Practical Marks: 95

Arts STUDENT Information:
Name: Emily Brown
Roll Number: 103
Total Marks: 240
Average Marks: 80.0
Elective Subject: Psychology

Demonstrating dynamic polymorphism:
Name: Jane Smith
Roll Number: 102
Total Marks: 359
Average Marks: 89.75
Practical Marks: 95
Name: Emily Brown
Roll Number: 103
Total Marks: 240
Average Marks: 80.0
Elective Subject: Psychology
*/

/* EXPLANATION
    Main Class:

    Demonstrates the creation of objects for Student4, ScienceStudent, and ArtsStudent.
    Shows how the super keyword is used to call the base class constructor and methods.
    Demonstrates dynamic polymorphism by assigning subclass objects to a Student4 reference.
    */