/* 
Create a method max() that has three integer parameters x, y and z, and it return the largest of three. 
Do it two ways:
i) Once usinf if-else-if ladder
ii) Once using nested if statements
  */

import java.util.Scanner;

public class MaxOfThreeNumbers {

    // Method 1: Using if-else-if ladder
    public static int maxUsingIfElse(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    // Method 2: Using nested if statements
    public static int maxUsingNestedIf(int x, int y, int z) {
        if (x >= y) {
            if (x >= z) {
                return x;
            } else {
                return z;
            }
        } else {
            if (y >= z) {
                return y;
            } else {
                return z;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter first number (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter second number (y): ");
        int y = scanner.nextInt();
        System.out.print("Enter third number (z): ");
        int z = scanner.nextInt();

        // Finding the largest using if-else-if ladder
        System.out.println("Largest using if-else-if: " + maxUsingIfElse(x, y, z));

        // Finding the largest using nested if statements
        System.out.println("Largest using nested if: " + maxUsingNestedIf(x, y, z));

        scanner.close();
    }
}

/********** SAMPLE OUTPUT **********
Output1:
Enter first number (x): 5
Enter second number (y): 12
Enter third number (z): 9
Largest using if-else-if: 12
Largest using nested if: 12

Output2:
Enter first number (x): 23
Enter second number (y): 17
Enter third number (z): 42
Largest using if-else-if: 42
Largest using nested if: 42

Output3:
Enter first number (x): 7
Enter second number (y): 7
Enter third number (z): 7
Largest using if-else-if: 7
Largest using nested if: 7

Output4:
Enter first number (x): 15
Enter second number (y): 25
Enter third number (z): 20
Largest using if-else-if: 25
Largest using nested if: 25

*/
