

// Main class to test the functionality
public class main {
    public static void main(String[] args) {
        // Creating an object of FullTimeEmp class
        FullTimeEmp fullTimeEmp = new FullTimeEmp("Alice Smith", 201, 4000.0, 500.0, 200.0);
        fullTimeEmp.calculateSalary(); // Calculate full-time employee's salary
        System.out.println("Full-Time Employee Details:");
        fullTimeEmp.displayEmployeeDetails();  // Display full-time employee's details
        System.out.println();

        // Creating an object of PartTimeEmp class
        PartTimeEmp partTimeEmp = new PartTimeEmp("Bob Jones", 202, 80); // 80 hours worked
        partTimeEmp.calculateSalary(); // Calculate part-time employee's salary
        System.out.println("Part-Time Employee Details:");
        partTimeEmp.displayEmployeeDetails();  // Display part-time employee's details
    }
}

/* SAMPLE OUTPUT 
Full-Time Employee Details:
Employee Name: Alice Smith
Employee ID: 201
Salary: $4300.0
Monthly Salary: $4000.0
Bonus: $500.0
Deductions: $200.0

Part-Time Employee Details:
Employee Name: Bob Jones
Employee ID: 202
Salary: $1200.0
Part-Time Employee
Hours Worked: 80
Hourly Rate: $15.0

*/

/* EXPLANATION
main Class:

Creates objects of both FullTimeEmp and PartTimeEmp.
Demonstrates how the overridden calculateSalary() and displayEmployeeDetails() methods work for different employee types.*/
