import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of employees
        System.out.print("Enter the number of employees: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Create an array to hold EMPLOYEE objects
        EMPLOYEE[] employees = new EMPLOYEE[N];

        // Read details for each employee
        for (int i = 0; i < N; i++) {
            employees[i] = new EMPLOYEE(); // Instantiate EMPLOYEE object
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i].read();  // Read employee details
        }

        // Display details of each employee
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < N; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            employees[i].display(); // Display employee details
        }

        scanner.close(); // Close the scanner
    }
}

/*
EXPLANATION TestEmployee.java:

main(String[] args):
Reads the number of employees.
Creates an array of EMPLOYEE objects.
For each employee, reads their details and computes the necessary values.
Displays the details for each employee.
*/

/*  SAMPLE OUTPUT
Enter the number of employees: 2

Enter details for Employee 1:
Enter Employee Name: John Doe
Enter Employee ID: 101
Enter Basic Salary: 50000

Enter details for Employee 2:
Enter Employee Name: Jane Smith
Enter Employee ID: 102
Enter Basic Salary: 60000

Employee Details:

Employee 1:
Employee Name: John Doe
Employee ID: 101
Basic Salary: 50000.0
Dearness Allowance (DA): 26000.0
Gross Salary: 76000.0
Net Salary: 53200.0

Employee 2:
Employee Name: Jane Smith
Employee ID: 102
Basic Salary: 60000.0
Dearness Allowance (DA): 31200.0
Gross Salary: 91200.0
Net Salary: 63840.0

*/

/*
How It Works:
The EMPLOYEE class manages employee information and salary calculations.

The TestEmployee class demonstrates how to create EMPLOYEE objects, input their details, compute their salaries, and display the results.
*/