/*
 Define a class EMPLOYEE havin following members: Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and provide the following methods:
i) read(): to read N employee details
ii) display(): to display the details of employee
iii) compute_net_sal(): to compute the net salary of the employee

Write a java program to read data of N employee and compute display net salary of each employee.
NOTE: (DA = 52% of Basic, 
       gross_Sal = Basic + DA,
       IT = 30% of the gross salary)

*/

import java.util.Scanner;

public class EMPLOYEE {
    // Data members of the EMPLOYEE class
    private String Ename;           // Employee's name
    private int Eid;                // Employee ID
    private double Basic;           // Basic salary
    private double DA;              // Dearness Allowance
    private double Gross_Sal;       // Gross salary
    private double Net_Sal;         // Net salary

    // Method to read employee details
    public void read() {
        Scanner scanner = new Scanner(System.in);

        // Read employee name
        System.out.print("Enter Employee Name: ");
        Ename = scanner.nextLine();

        // Read employee ID
        System.out.print("Enter Employee ID: ");
        Eid = scanner.nextInt();

        // Read basic salary
        System.out.print("Enter Basic Salary: ");
        Basic = scanner.nextDouble();

        // Calculate DA (52% of Basic)
        DA = 0.52 * Basic;

        // Calculate Gross Salary (Basic + DA)
        Gross_Sal = Basic + DA;

        // Compute Net Salary (Gross Salary - IT)
        compute_net_sal();
    }

    // Method to compute the net salary
    public void compute_net_sal() {
        // IT is 30% of the Gross Salary
        double IT = 0.30 * Gross_Sal;

        // Net Salary = Gross Salary - IT
        Net_Sal = Gross_Sal - IT;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("Dearness Allowance (DA): " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}

/*
EMPLOYEE.java:

1. Data Members:

Ename: Stores the employee's name.
Eid: Stores the employee's ID.
Basic: Stores the basic salary.
DA: Stores the dearness allowance.
Gross_Sal: Stores the gross salary.
Net_Sal: Stores the net salary.

2. Methods:

read(): Reads employee details, calculates DA, Gross Salary, and calls compute_net_sal() to compute the Net Salary.
compute_net_sal(): Calculates the net salary by subtracting IT (30% of Gross Salary) from Gross Salary.
display(): Displays the employee's details including name, ID, basic salary, DA, gross salary, and net salary.
*/
