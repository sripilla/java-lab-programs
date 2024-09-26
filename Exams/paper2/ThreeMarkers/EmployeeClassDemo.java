/* Create a class called Employee (instance fields: empID, name, age, Salary) with necessary constructor and methods corresponding to the Employee instances used in the EmployeeClassDemo as shown below


public class EmployeeCalssDemo{
   Public static void main(String[] args) {
         Employee[] staff = { new Employee(1, “Anil”, 25, 50000),
                                           new Employee(1, “John”, 35, 60000),
                                        new Employee(1, “Vinod”, 38, 40000)
					};
          for(int =0; i < staff.length; i++)
           staff[i].raiseSalary(5);

          for(int =0; i < staff.length; i++)
           staff[i].raiseSalary(5);
}
}



OUTPUT

Employee id: 1
Name: Anil
Age: 25
salary: 52500.0


Employee id: 2
Name: John
Age: 35
salary: 63000.0

Employee id: 3
Name: Vinod
Age: 38
salary: 42000.0
*/

class Employee {
    // Instance fields
    private int empID;
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(int empID, String name, int age, double salary) {
        this.empID = empID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percentage) {
        this.salary += this.salary * percentage / 100;
    }

    // Overriding toString() method to display employee details
    @Override
    public String toString() {
        return "Employee id: " + empID + "\n" +
               "Name: " + name + "\n" +
               "Age: " + age + "\n" +
               "Salary: " + salary + "\n";
    }
}
public class EmployeeClassDemo {
    public static void main(String[] args) {
        // Array of Employee objects
        Employee[] staff = {
            new Employee(1, "Anil", 25, 50000),
            new Employee(2, "John", 35, 60000),
            new Employee(3, "Vinod", 38, 40000)
        };

        // Raise salary by 5% for each employee
        for (int i = 0; i < staff.length; i++) {
            staff[i].raiseSalary(5);
        }

        // Print details of each employee after the salary raise
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i]);
        }
    }
}


/* SAMPLE OUTPUT
Employee id: 1
Name: Anil
Age: 25
Salary: 52500.0

Employee id: 2
Name: John
Age: 35
Salary: 63000.0

Employee id: 3
Name: Vinod
Age: 38
Salary: 42000.0
*/