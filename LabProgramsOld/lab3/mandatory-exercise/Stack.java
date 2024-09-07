class Stack {
    private int[] stackArray;  // Integer array to store the elements of the stack
    private int top;  // Integer to store the top of the stack

    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        stackArray = new int[size];  // Initialize the array with the given size
        top = -1;  // Initialize the top to -1 to indicate the stack is empty
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stackArray[++top] = element;  // Increment top and then push the element
            System.out.println(element + " pushed onto stack.");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;  // Return a sentinel value indicating failure
        } else {
            int poppedElement = stackArray[top--];  // Pop the element and decrement top
            System.out.println(poppedElement + " popped from stack.");
            return poppedElement;  // Return the popped element
        }
    }

    // Method to display the contents of the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i] + " ");
            }
        }
    }

    // Main method to test the Stack class
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack with a size of 5

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);  // This push should trigger a stack overflow

        // Display the stack contents
        stack.display();

        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();  // This pop should trigger a stack underflow

        // Display the stack contents after popping
        stack.display();
    }
}


/*  SAMPLER OUTPUT

10 pushed onto stack.
20 pushed onto stack.
30 pushed onto stack.
40 pushed onto stack.
50 pushed onto stack.
Stack Overflow! Cannot push 60
Stack contents:
50 
40 
30 
20 
10 
50 popped from stack.
40 popped from stack.
30 popped from stack.
20 popped from stack.
10 popped from stack.
Stack Underflow! Cannot pop.
Stack is empty.


************************ EXPLANATION *************************

1. Class Definition:

The Stack class has two private instance variables:
stackArray: An integer array to store the elements of the stack.
top: An integer to keep track of the top of the stack.

2. Constructor:

Initializes the stack with a given size. The top is set to -1 to indicate that the stack is initially empty.

3. push Method:

Adds an element to the top of the stack.
Checks for stack overflow by comparing top with the size of the array.
If there's space, it increments top and then adds the element.
If the stack is full, it displays a "Stack Overflow" message.

4. pop Method:

Removes and returns the top element from the stack.
Checks for stack underflow by ensuring top is not -1.
If there are elements in the stack, it returns the top element and decrements top.
If the stack is empty, it displays a "Stack Underflow" message and returns -1 as a sentinel value.

5. display Method:

Prints the contents of the stack from top to bottom.
If the stack is empty, it displays a message indicating that the stack is empty.

6. Main Method:

Tests the Stack class by pushing elements onto the stack, displaying the stack contents, popping elements, and then displaying the stack contents again.

*/