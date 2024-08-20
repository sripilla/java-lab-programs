// Complex class to represent a complex number
class Complex {
    private int real;    // Instance variable to store the real part of the complex number
    private int imaginary; // Instance variable to store the imaginary part of the complex number

    // Default constructor that initializes the complex number to 0 + 0i
    public Complex() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized constructor that initializes the complex number to the given values
    public Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    // Method to display the complex number in the form a + ib
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    // Main method to illustrate the use of constructors and display method
    public static void main(String[] args) {
        // Creating a Complex object using the default constructor
        Complex c1 = new Complex();
        System.out.print("Complex number c1: ");
        c1.display(); // Displaying the complex number c1

        // Creating a Complex object using the parameterized constructor
        Complex c2 = new Complex(3, 4);
        System.out.print("Complex number c2: ");
        c2.display(); // Displaying the complex number c2

        // Creating another Complex object using the parameterized constructor
        Complex c3 = new Complex(5, -7);
        System.out.print("Complex number c3: ");
        c3.display(); // Displaying the complex number c3
    }
}

/* SAMPLE OUTPUT

Complex number c1: 0 + 0i
Complex number c2: 3 + 4i
Complex number c3: 5 + -7i

******************** EXPLANATION *************************
1. Class Definition (Complex):

The Complex class represents a complex number with real and imaginary parts.
Two instance variables real and imaginary store the real and imaginary parts of the complex number, respectively.

2. Constructors:

Default Constructor:
Initializes both real and imaginary parts to 0, creating the complex number 0 + 0i.
Parameterized Constructor:
Takes two parameters, r and i, to initialize the real and imaginary parts of the complex number.

3. display Method:

Prints the complex number in the format 
𝑎 + 𝑖𝑏
a+ib, where a is the real part and b is the imaginary part.

4. Main Method:

Illustrates the use of both constructors and the display method.
c1: Created using the default constructor and displays 0 + 0i.
c2: Created using the parameterized constructor with values 3 and 4, and displays 3 + 4i.
c3: Created using the parameterized constructor with values 5 and -7, and displays 5 - 7i.


*/