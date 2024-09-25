/* What is the output of the following code snippet ? */
class Test1 {
    static int x; 

    static void display() { 
        System.out.println(x);
    } 

    public static void main(String args[]) { 
            Test1 t1 = new Test1(); 
        t1.display(); 
    } 
}
/*
Static Variable:

static int x; declares a static variable x of type int. Since x is a static variable and is not explicitly initialized, it will have the default value for integers, which is 0.
Static Method:

static void display() is a static method that prints the value of x. Since x has not been assigned a value, it remains 0.
Main Method:

In the main method, an instance of the class test is created with test t1 = new test();.
Even though t1 is an instance of test, display() is a static method and can be called using the class name or an instance reference. Here, it’s called using the instance t1.
When t1.display() is called, it executes the display method, which prints the value of x.

Since x is 0, the output of the code snippet will be: 0*/