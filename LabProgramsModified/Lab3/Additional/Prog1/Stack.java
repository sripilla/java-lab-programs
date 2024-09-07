/*
Create a class called Stack for storing integers. The instance variables are:
a) An integer array
b) An integer for storing the top of stack (tos)

Include methods for initializing tos, pushing an element to the stack and for popping an element from the stack. The push() methos should also check "stack overflow" and pop() should also check for "stack underflow".
Use a display() method to display the contents of stack

*/

public class Stack {
    // Instance variables
    private int[] stackArray;  // Array to store stack elements
    private int tos;           // Index of the top of the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        stackArray = new int[size]; // Create an array of given size
        tos = -1; // Initialize top of stack to -1 (empty stack)
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (tos >= stackArray.length - 1) {
            // Stack overflow condition
            System.out.println("Stack Overflow: Cannot push " + value + ", stack is full.");
        } else {
            stackArray[++tos] = value; // Increment top of stack and add value
            System.out.println(value + " pushed to stack.");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (tos < 0) {
            // Stack underflow condition
            System.out.println("Stack Underflow: Cannot pop, stack is empty.");
            return -1; // Return -1 to indicate underflow
        } else {
            return stackArray[tos--]; // Return top value and decrement top of stack
        }
    }

    // Method to display the contents of the stack
    public void display() {
        if (tos < 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= tos; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

/* EXPLANATION
Stack.java:

1. Instance Variables:
stackArray: An integer array to store the elements of the stack.
tos: The index of the top of the stack.

2. Constructor:
Stack(int size): Initializes the stack with the given size and sets tos to -1, indicating the stack is empty.

3. Methods:
push(int value): Adds a value to the top of the stack if there is space; otherwise, it displays a stack overflow message.
pop(): Removes and returns the value from the top of the stack if the stack is not empty; otherwise, it displays a stack underflow message.
display(): Prints the current contents of the stack.
*/