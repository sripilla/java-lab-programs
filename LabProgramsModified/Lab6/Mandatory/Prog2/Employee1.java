/*To the already defined EMPLOYEE1 class, add two subclasses. FullTimeEmp and PartTimeEmp. Add the following data Members and Member Functions to the PartTimeEmp class. hoursWorked(int): Represents the number of hours worked by the part-time employee. hourly-rate(double, static and final): Represents the hourly rate at which the part-time employee is paid. The calculateSalary(): overrides the calculateSalary() method of the base class to calculate the salary of the part-time employee based on the hours worked and hourly rate. The displayEmployeeDetails(): Overrides the displayEmplyeeDetails() methods of the base class to display the part-time employee's details, including the hours worked and hourly rate. */

// Base class EMPLOYEE1
// Base class EMPLOYEE1
class Employee1 {
    protected String name;       // Employee's name
    protected int empId;         // Employee's ID
    protected double salary;     // Employee's salary

    // Parameterized constructor for Employee1
    public Employee1(String name, int empId) {
        this.name = name;
        this.empId = empId;
        this.salary = 0.0;  // Default salary
    }

    // Method to calculate salary (will be overridden by subclasses)
    public void calculateSalary() {
        // Base class doesn't define salary calculation
        salary = 0.0;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass FullTimeEmp extending Employee1
class FullTimeEmp extends Employee1 {
    private double monthlySalary;    // Full-time employee's monthly salary
    private double bonus;            // Bonus for full-time employees
    private double deductions;       // Deductions for full-time employees

    // Constructor for FullTimeEmp
    public FullTimeEmp(String name, int empId, double monthlySalary, double bonus, double deductions) {
        super(name, empId);  // Call the base class constructor
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    // Override the calculateSalary method for full-time employees
    @Override
    public void calculateSalary() {
        salary = (monthlySalary + bonus) - deductions; // Salary calculation including bonus and deductions
    }

    // Override the displayEmployeeDetails method to include full-time details
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Call the base class method
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Deductions: $" + deductions);
    }
}

// Subclass PartTimeEmp extending Employee1
class PartTimeEmp extends Employee1 {
    private int hoursWorked;                         // Hours worked by part-time employee
    private static final double HOURLY_RATE = 15.0;  // Hourly rate (static and final)

    // Constructor for PartTimeEmp
    public PartTimeEmp(String name, int empId, int hoursWorked) {
        super(name, empId);  // Call the base class constructor
        this.hoursWorked = hoursWorked;
    }

    // Override the calculateSalary method for part-time employees
    @Override
    public void calculateSalary() {
        salary = hoursWorked * HOURLY_RATE;  // Calculate salary based on hours worked
    }

    // Override the displayEmployeeDetails method to include part-time details
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Call the base class method
        System.out.println("Part-Time Employee");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + HOURLY_RATE);
    }
}




/*EXPLANATION
Base Class Employee1:

Contains basic fields (name, empId, salary).
calculateSalary() is a placeholder method that will be overridden by subclasses.
displayEmployeeDetails() shows basic employee information.

Subclass FullTimeEmp:

Inherits from Employee1.
Adds monthlySalary, bonus, and deductions to represent additional compensation and deductions.
Overrides calculateSalary() to compute salary based on monthly salary, bonus, and deductions.
Overrides displayEmployeeDetails() to show all relevant details for full-time employees.

Subclass PartTimeEmp:

Inherits from Employee1.
Adds hoursWorked and a static final field HOURLY_RATE to represent the hourly pay rate for part-time employees.
Overrides calculateSalary() to compute salary based on hours worked.
Overrides displayEmployeeDetails() to show all relevant details for part-time employees.*/