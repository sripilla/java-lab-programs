/*Create an abstract class Figure with abstract method area and two integer dimensions. Create three more classes Rectangle, Triangle and Square 
which extend Figure and implement the area method. Show how the area can be computed dynamically during runtime for Rectangle, Square and Triangle 
to achieve dynamic polymorphism. (Use the reference of Figure class to call the three different area methods) */

// Abstract class Figure
abstract class Figure {
    // Two integer dimensions, which can be used by subclasses
    int dimension1;
    int dimension2;

    // Constructor for Figure class
    public Figure(int dim1, int dim2) {
        this.dimension1 = dim1;
        this.dimension2 = dim2;
    }

    // Abstract method area, to be implemented by subclasses
    abstract double area();
}

// Subclass Rectangle that extends Figure
class Rectangle extends Figure {

    // Constructor for Rectangle
    public Rectangle(int length, int width) {
        super(length, width); // Calling the constructor of the base class Figure
    }

    // Implementing the area method for Rectangle
    @Override
    double area() {
        return dimension1 * dimension2; // Rectangle area = length * width
    }
}

// Subclass Triangle that extends Figure
class Triangle extends Figure {

    // Constructor for Triangle
    public Triangle(int base, int height) {
        super(base, height); // Calling the constructor of the base class Figure
    }

    // Implementing the area method for Triangle
    @Override
    double area() {
        return 0.5 * dimension1 * dimension2; // Triangle area = 1/2 * base * height
    }
}

// Subclass Square that extends Figure
class Square extends Figure {

    // Constructor for Square
    public Square(int side) {
        super(side, side); // Both dimensions are the same for a square
    }

    // Implementing the area method for Square
    @Override
    double area() {
        return dimension1 * dimension1; // Square area = side * side
    }
}

// Main class to demonstrate dynamic polymorphism
public class Main3 {
    public static void main(String[] args) {
        // Using a reference of type Figure to point to different objects
        Figure fig;

        // Creating a Rectangle object
        fig = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + fig.area());

        // Creating a Triangle object
        fig = new Triangle(10, 5);
        System.out.println("Area of Triangle: " + fig.area());

        // Creating a Square object
        fig = new Square(7);
        System.out.println("Area of Square: " + fig.area());
    }
}

/* SAMPLE OUTPUT
Area of Rectangle: 50.0
Area of Triangle: 25.0
Area of Square: 49.0
*/

/* EXPLANATION 
Abstract Class Figure:

Contains two integer dimensions dimension1 and dimension2.
Has an abstract method area() which is implemented in each subclass to calculate the area according to the shape.
Subclass Rectangle:

Extends Figure and implements the area() method to calculate the area of a rectangle (length * width).
Subclass Triangle:

Extends Figure and implements the area() method to calculate the area of a triangle (0.5 * base * height).
Subclass Square:

Extends Figure and implements the area() method to calculate the area of a square (side * side).
Main Class:

Demonstrates dynamic polymorphism where a reference of type Figure is used to call the area() method for different subclasses (Rectangle, Triangle, and Square).
Each time, the appropriate area() method for the specific object type is invoked at runtime.

*/

/*Key Concepts:
Abstract Class: Figure is abstract and contains an abstract method area() to enforce its implementation in derived classes.

Dynamic Polymorphism: The area() method is invoked at runtime based on the actual type of the object referred to by the Figure reference. */
