public class StackDemo {

    public static void main(String[] args) {
        // Create a stack with a capacity of 5
        Stack stack = new Stack(5);

        // Display the stack (should be empty initially)
        stack.display();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display the stack after pushing elements
        stack.display();

        // Try pushing another element (should cause overflow)
        stack.push(60);

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Display the stack after popping some elements
        stack.display();

        // Try popping from an empty stack (should cause underflow)
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Attempt to pop when stack is empty
    }
}

/* EXPLANTION

StackDemo.java:

main(String[] args):
Creates a Stack object with a capacity of 5.
Demonstrates pushing and popping elements and displays the stack contents before and after operations.
*/

/* SAMPLE OUTPUT
Stack is empty.
10 pushed to stack.
20 pushed to stack.
30 pushed to stack.
40 pushed to stack.
50 pushed to stack.
Stack contents: 10 20 30 40 50 
Stack Overflow: Cannot push 60, stack is full.
Popped element: 50
Popped element: 40
Stack contents: 10 20 30 
Stack Underflow: Cannot pop, stack is empty.
Stack Underflow: Cannot pop, stack is empty.
Stack Underflow: Cannot pop, stack is empty.
Stack Underflow: Cannot pop, stack is empty.

*/

/*
How It Works:
Initialization: The stack is initialized with a specified capacity.
Push Operation: Adds elements to the stack and checks for overflow.
Pop Operation: Removes elements from the stack and checks for underflow.
Display Operation: Shows the current state of the stack.
*/