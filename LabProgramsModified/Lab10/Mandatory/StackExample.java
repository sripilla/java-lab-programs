/*Define a simple generic stack class and show the use of the generic class for two
different class types Student and Employee class objects. */
// Generic Stack Class
class Stack<T> {
    private Object[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        stack = new Object[capacity];
        top = -1;
    }

    // Push method to add element to stack
    public void push(T element) {
        if (top < capacity - 1) {
            stack[++top] = element;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Pop method to remove element from stack
    public T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return (T) stack[top--];
        }
    }

    // Peek method to view the top element
    public T peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return (T) stack[top];
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Size of the stack
    public int size() {
        return top + 1;
    }
}

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

// Main Class to demonstrate the usage
public class StackExample {
    public static void main(String[] args) {
        // Stack for Student objects
        Stack<Student> studentStack = new Stack<>(3);
        studentStack.push(new Student("John Doe", 101));
        studentStack.push(new Student("Jane Smith", 102));
        studentStack.push(new Student("Mike Johnson", 103));

        System.out.println("Top Student: " + studentStack.peek());
        System.out.println("Popped Student: " + studentStack.pop());
        System.out.println("Popped Student: " + studentStack.pop());

        // Stack for Employee objects
        Stack<Employee> employeeStack = new Stack<>(3);
        employeeStack.push(new Employee("Alice Brown", 201, 50000));
        employeeStack.push(new Employee("Bob White", 202, 60000));

        System.out.println("Top Employee: " + employeeStack.peek());
        System.out.println("Popped Employee: " + employeeStack.pop());
        System.out.println("Popped Employee: " + employeeStack.pop());
    }
}

/*SAMPLE OUTPUT
Top Student: Student{name='Mike Johnson', studentId=103}
Popped Student: Student{name='Mike Johnson', studentId=103}
Popped Student: Student{name='Jane Smith', studentId=102}
Top Employee: Employee{name='Bob White', employeeId=202, salary=60000.0}
Popped Employee: Employee{name='Bob White', employeeId=202, salary=60000.0}
Popped Employee: Employee{name='Alice Brown', employeeId=201, salary=50000.0}*/