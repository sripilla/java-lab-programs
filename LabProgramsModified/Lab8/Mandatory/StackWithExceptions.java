// PushException: Thrown when trying to push onto a full stack
class PushException extends Exception {
    public PushException(String message) {
        super(message);
    }
}

// PopException: Thrown when trying to pop from an empty stack
class PopException extends Exception {
    public PopException(String message) {
        super(message);
    }
}

// Stack Class: Implements stack operations with exceptions
class Stack {
    private int maxSize;
    private int top;
    private int[] stack;

    // Constructor
    public Stack(int size) {
        maxSize = size;
        stack = new int[size];
        top = -1;
    }

    // Push method: Adds an element to the stack
    public void push(int value) throws PushException {
        if (top == maxSize - 1) {
            throw new PushException("Stack is full! Cannot push " + value);
        }
        stack[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    // Pop method: Removes and returns the top element of the stack
    public int pop() throws PopException {
        if (top == -1) {
            throw new PopException("Stack is empty! Cannot pop");
        }
        return stack[top--];
    }

    // Peek method: Returns the top element without removing it
    public int peek() throws PopException {
        if (top == -1) {
            throw new PopException("Stack is empty! Cannot peek");
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
}

// Main Class: Demonstrating stack usage with custom exceptions
public class StackWithExceptions {
    public static void main(String[] args) {
        // Creating a stack with a capacity of 3
        Stack stack = new Stack(3);

        try {
            // Pushing elements into the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);

            // Trying to push another element to a full stack
            stack.push(40);  // This will throw PushException

        } catch (PushException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Popping elements from the stack
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());

            // Trying to pop from an empty stack
            System.out.println("Popped: " + stack.pop());  // This will throw PopException

        } catch (PopException e) {
            System.out.println(e.getMessage());
        }
    }
}

/* SAMPLE OUTPUT
10 pushed to stack
20 pushed to stack
30 pushed to stack
Stack is full! Cannot push 40
Popped: 30
Popped: 20
Popped: 10
Stack is empty! Cannot pop
*/