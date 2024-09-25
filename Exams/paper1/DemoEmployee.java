/*Write a java program to do the following:
A. Define a class called Person with the following attributes and methods:
Name, DoB(date of birth), suitable overloaded constructors and a method to display the details of a Employee
object.
B. Define a subclass "Employee " with Person as super class. The Employee class should have the following
attributes and methods:
empID, dateofJoining, Salary, suitable overloaded constructors and a method to display the details of a Employee
object.
C. Write suitable main method for the above defined Employee class to do the following
i. Create an array of Employee Objects(3 employees).
ii. Display the empID and the name of the Employees who are having 10 years of experience. */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Person {
    // Attributes of Person
    String name;
    LocalDate dateOfBirth;

    // Overloaded Constructor for Person
    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Method to display details of a Person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

class Employee extends Person {
    // Attributes of Employee
    int empID;
    LocalDate dateOfJoining;
    double salary;

    // Overloaded Constructor for Employee
    public Employee(String name, LocalDate dateOfBirth, int empID, LocalDate dateOfJoining, double salary) {
        super(name, dateOfBirth); // Call the superclass (Person) constructor
        this.empID = empID;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    // Method to display Employee details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Display Person details
        System.out.println("Employee ID: " + empID);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Salary: " + salary);
    }

    // Method to check if the employee has 10 or more years of experience
    public boolean hasTenYearsExperience() {
        long yearsOfExperience = ChronoUnit.YEARS.between(dateOfJoining, LocalDate.now());
        return yearsOfExperience >= 10;
    }
}

public class DemoEmployee {
    public static void main(String[] args) {
        // Create an array of Employee objects (3 employees)
        Employee[] employees = new Employee[3];

        // Creating employees with name, DoB, empID, dateOfJoining, salary
        employees[0] = new Employee("John Doe", LocalDate.of(1985, 5, 15), 101, LocalDate.of(2010, 7, 10), 50000);
        employees[1] = new Employee("Jane Smith", LocalDate.of(1990, 11, 22), 102, LocalDate.of(2015, 3, 15), 60000);
        employees[2] = new Employee("Alice Brown", LocalDate.of(1988, 1, 30), 103, LocalDate.of(2013, 9, 25), 55000);

        // Display employees with 10 years of experience
        System.out.println("Employees with 10 or more years of experience:");
        for (Employee emp : employees) {
            if (emp.hasTenYearsExperience()) {
                System.out.println("Employee ID: " + emp.empID + ", Name: " + emp.name);
            }
        }
    }
}
