/*
Consider the already defined EMPLOYEE class. Provide a default constructor and parameterised constructor to this class. Also provide a display method. Illustrate all the constructors as well as the display method by defining EMPLOYEE objects.

*/
// Define the EMPLOYEE class
class EMPLOYEE {
    // Instance variables to store employee details
    String name;
    int empID;
    double salary;

    // Default constructor (no parameters)
    // Initializes the object with default values
    EMPLOYEE() {
        name = "Not provided";
        empID = 0;
        salary = 0.0;
    }

    // Parameterized constructor
    // Initializes the object with the provided values
    EMPLOYEE(String employeeName, int employeeID, double employeeSalary) {
        name = employeeName;
        empID = employeeID;
        salary = employeeSalary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empID);
        System.out.println("Salary: $" + salary);
    }

    // Main method to illustrate the constructors and display method
    public static void main(String[] args) {
        // Create an object using the default constructor
        EMPLOYEE employee1 = new EMPLOYEE();
        // Display the details of the first employee (default values)
        System.out.println("Details of Employee 1 (Using Default Constructor):");
        employee1.display();
        System.out.println();

        // Create an object using the parameterized constructor
        EMPLOYEE employee2 = new EMPLOYEE("Alice Johnson", 1001, 75000);
        // Display the details of the second employee (initialized values)
        System.out.println("Details of Employee 2 (Using Parameterized Constructor):");
        employee2.display();
    }
}

/* SAMPLE OUTPUT
Details of Employee 1 (Using Default Constructor):
Employee Name: Not provided
Employee ID: 0
Salary: $0.0

Details of Employee 2 (Using Parameterized Constructor):
Employee Name: Alice Johnson
Employee ID: 1001
Salary: $75000.0
*/


/* EXPLANATION
Default Constructor: Initializes name, empID, and salary with default values.
Parameterized Constructor: Takes values for name, empID, and salary as arguments and assigns them to the object.
display method: Displays the employee details.
*/