/*Write a program to demonstrate the use of wildcard arguments. */
import java.util.List;
import java.util.ArrayList;

// Student Class
class Student {
    String name;
    int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', studentId=" + studentId + "}";
    }
}

// Employee Class
class Employee {
    String name;
    int employeeId;
    double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', employeeId=" + employeeId + ", salary=" + salary + "}";
    }
}

// Class to demonstrate the use of wildcards
public class WildcardDemo {
    // Generic method with wildcard argument
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        // List of Students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe", 101));
        students.add(new Student("Jane Smith", 102));
        students.add(new Student("Mike Johnson", 103));

        // List of Employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice Brown", 201, 50000));
        employees.add(new Employee("Bob White", 202, 60000));

        // Calling printList with wildcard argument
        System.out.println("Students List:");
        printList(students);

        System.out.println("\nEmployees List:");
        printList(employees);
    }
}

/* SAMPLE OUTPUT
Students List:
Student{name='John Doe', studentId=101}
Student{name='Jane Smith', studentId=102}
Student{name='Mike Johnson', studentId=103}

Employees List:
Employee{name='Alice Brown', employeeId=201, salary=50000.0}
Employee{name='Bob White', employeeId=202, salary=60000.0}*/
