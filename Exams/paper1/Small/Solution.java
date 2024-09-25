/* What is the output of the following code snippet*/

public class Solution{
public static void main(String[] args){
short x = 20;
x = x * 2;
System.out.print(x);
}
}

/*The given code snippet will cause a compilation error. Here's why:

In Java, when performing arithmetic operations involving variables, the result of x * 2 (where x is of type short) is automatically promoted to int. This is because Java automatically promotes smaller integer types (byte, short, char) to int when performing arithmetic operations.

Therefore, the expression x * 2 results in an int, but you are trying to assign it back to a short variable (x). This leads to a type mismatch, causing a compilation error. You would need to explicitly cast the result back to short like this:

x = (short) (x * 2);

This cast will allow the program to compile and execute correctly.

So, the answer is:

Compilation Error Exception

*/