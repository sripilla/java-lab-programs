import java.util.Scanner;

// Class to represent an EMPLOYEE
class EMPLOYEE {
    // Data members
    private String Ename;  // Employee name
    private int EiD;       // Employee ID
    private double Basic;  // Basic salary
    private double DA;     // Dearness Allowance
    private double Gross_Sal;  // Gross Salary
    private double Net_Sal;    // Net Salary

    // Method to read employee details
    public void read(Scanner scanner) {
        System.out.print("Enter Employee Name: ");
        Ename = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        EiD = scanner.nextInt();
        System.out.print("Enter Basic Salary: ");
        Basic = scanner.nextDouble();
        System.out.print("Enter Dearness Allowance (as a percentage): ");
        DA = scanner.nextDouble();

        // Calculate Gross Salary
        Gross_Sal = Basic + (Basic * DA / 100);
    }

    // Method to compute net salary
    public void compute_net_sal() {
        // Assuming deductions like tax, etc., to be 10% of Gross Salary
        double deductions = Gross_Sal * 0.10;
        Net_Sal = Gross_Sal - deductions;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + EiD);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("Dearness Allowance: " + DA + "%");
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
        System.out.println("---------------------------------");
    }

    // Main method to test the EMPLOYEE class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int N = scanner.nextInt();  // Number of employees
        scanner.nextLine();  // Consume newline

        // Array to hold EMPLOYEE objects
        EMPLOYEE[] employees = new EMPLOYEE[N];

        // Read details of each employee
        for (int i = 0; i < N; i++) {
            employees[i] = new EMPLOYEE();  // Create a new EMPLOYEE object
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i].read(scanner);  // Read employee details
            employees[i].compute_net_sal();  // Compute net salary
        }

        // Display details of each employee
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < N; i++) {
            employees[i].display();  // Display employee details
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

/* SAMPLE OUTPUT

Enter the number of employees: 2
Enter details for Employee 1:
Enter Employee Name: John Doe
Enter Employee ID: 101
Enter Basic Salary: 50000
Enter Dearness Allowance (as a percentage): 20
Enter details for Employee 2:
Enter Employee Name: Jane Smith
Enter Employee ID: 102
Enter Basic Salary: 60000
Enter Dearness Allowance (as a percentage): 25

Employee Details:
Employee Name: John Doe
Employee ID: 101
Basic Salary: 50000.0
Dearness Allowance: 20.0%
Gross Salary: 60000.0
Net Salary: 54000.0
---------------------------------
Employee Name: Jane Smith
Employee ID: 102
Basic Salary: 60000.0
Dearness Allowance: 25.0%
Gross Salary: 75000.0
Net Salary: 67500.0
---------------------------------

********************* EXPLANATION *************************

1. Class Definition (EMPLOYEE):

Data Members:
    .Ename: Stores the employee's name.
    .EiD: Stores the employee's ID.
    .Basic: Stores the basic salary of the employee.
    .DA: Stores the dearness allowance (as a percentage of the basic salary).
    .Gross_Sal: Stores the gross salary, calculated as the sum of the basic salary and the dearness allowance.
    .Net_Sal: Stores the net salary, calculated after deducting a fixed percentage (e.g., 10%) from the gross salary.

2. Methods:

    .read(Scanner scanner): Reads the details of an employee, including name, ID, basic salary, and dearness allowance. It also computes the gross salary.
    .compute_net_sal(): Computes the net salary by deducting a fixed percentage (e.g., 10%) from the gross salary.
    .display(): Displays the details of the employee, including name, ID, basic salary, dearness allowance, gross salary, and net salary.

3. Main Method:

    .Input: The program first asks for the number of employees. Then, for each employee, it reads their details, computes their net salary, and stores them in an array.
    .Output: After reading all the details, it displays the details of each employee.


*/