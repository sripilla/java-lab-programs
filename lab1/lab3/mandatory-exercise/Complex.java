class Complex {
    private double real;  // The real part of the complex number
    private double imaginary;  // The imaginary part of the complex number

    // Method to assign initial values to the Complex object
    public void setValues(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to display a complex number in "a + ib" format
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        Complex result = new Complex();  // Create a new Complex object to store the result
        result.real = this.real + other.real;  // Add the real parts
        result.imaginary = this.imaginary + other.imaginary;  // Add the imaginary parts
        return result;  // Return the result as a new Complex object
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        Complex result = new Complex();  // Create a new Complex object to store the result
        result.real = this.real - other.real;  // Subtract the real parts
        result.imaginary = this.imaginary - other.imaginary;  // Subtract the imaginary parts
        // Use Math.abs() to ensure that the imaginary part is positive
        result.imaginary = Math.abs(result.imaginary);
        return result;  // Return the result as a new Complex object
    }

    // Main method to test the Complex class
    public static void main(String[] args) {
        Complex c1 = new Complex();  // Create the first complex number
        Complex c2 = new Complex();  // Create the second complex number

        // Assign values to the complex numbers
        c1.setValues(3.0, 2.0);  // c1 is 3 + 2i
        c2.setValues(1.5, 4.5);  // c2 is 1.5 + 4.5i

        // Display the original complex numbers
        System.out.print("First Complex number: ");
        c1.display();
        System.out.print("Second Complex number: ");
        c2.display();

        // Add the two complex numbers and display the result
        Complex sum = c1.add(c2);
        System.out.print("Sum of the two Complex numbers: ");
        sum.display();

        // Subtract the two complex numbers and display the result
        Complex difference = c1.subtract(c2);
        System.out.print("Difference of the two Complex numbers: ");
        difference.display();
    }
}

/* SAMPLE OUTPUT

First Complex number: 3.0 + 2.0i
Second Complex number: 1.5 + 4.5i
Sum of the two Complex numbers: 4.5 + 6.5i
Difference of the two Complex numbers: 1.5 + 2.5i

******************** EXPLANATION *****************

1. Class Definition:

The Complex class has two private instance variables, real and imaginary, to represent the real and imaginary parts of the complex number.

2. setValues Method:

Assigns initial values to the real and imaginary parts of the complex number.

3. display Method:

Prints the complex number in the format a + ib, where a is the real part and b is the imaginary part.

4. add Method:

Takes another Complex object as a parameter, adds the corresponding real and imaginary parts, and returns a new Complex object representing the sum.

5.subtract Method:

Subtracts the corresponding real and imaginary parts from another Complex object, ensuring that the imaginary part is positive using Math.abs(). Returns a new Complex object representing the difference.

6. main Method:

Tests the Complex class by creating two Complex objects, assigning them values, and displaying the results of adding and subtracting these complex numbers.
*/