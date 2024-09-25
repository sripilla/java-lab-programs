/*Consider the code given :
A. Identify the error in the following code with proper justification.
B. Change the code to make it error free.
C. Write /Add the statements in the main method to access the printt() method of C class using runtime
polymorphism..
class A {
public void printt() {
System.out.println("Class A print method");}
class B extends A {
public void printt() {
System.out.println("Class B print method");
}
}
class C extends A {
public void printt() {
System.out.println("Class C print method");
}
}
class D extends A,B {
public void printt() {
System.out.println("Class D print method");
}}
class Main {
public static void main(String args[]) {
D obj = new D();
obj.printt();
}
}  */

class A {
  public void printt() {
      System.out.println("Class A print method");
  }
}

class B extends A {
  @Override
  public void printt() {
      System.out.println("Class B print method");
  }
}

class C extends A {
  @Override
  public void printt() {
      System.out.println("Class C print method");
  }
}

// Removed the class D trying to extend both A and B
class D extends C {  // Now D extends C, which already extends A
  @Override
  public void printt() {
      System.out.println("Class D print method");
  }
}

class Main {
  public static void main(String args[]) {
      // Runtime polymorphism: use an A type reference to access C class's method
      A obj = new D(); // D object but reference type is A
      obj.printt();     // This will call D's printt() method due to runtime polymorphism
  }
}


/* A. Error Identification:
The code contains a compilation error due to multiple inheritance, which is not allowed in Java. Specifically, the class D tries to extend both A and B, which is not valid in Java since Java does not support multiple inheritance with classes. A class in Java can only extend one superclass. This causes an error because the compiler cannot decide which printt() method from A or B should be inherited by D.

Error:
class D extends A, B is incorrect because Java does not support extending more than one class.

B. Error-Free Code:
To resolve the multiple inheritance issue, Java uses interfaces or other design patterns like composition. In this case, I will rewrite the code to avoid the multiple inheritance issue. Instead of extending two classes, I’ll define the correct inheritance relationships and remove the erroneous multiple inheritance.

C. Explanation and Runtime Polymorphism:
In the main() method, we use runtime polymorphism by creating an object of class D but referring to it using a superclass (A). During runtime, Java will call the printt() method of the actual object type, which is D. This is runtime polymorphism in action, where the method call is resolved at runtime.


Key Points:
Runtime Polymorphism: The method to be executed is determined by the actual object (D) at runtime, even though the reference is of type A.
Correct Inheritance: Now, class D extends only one class (C), which avoids the multiple inheritance error, and still achieves the desired method overriding behavior.*/