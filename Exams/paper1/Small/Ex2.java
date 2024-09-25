/*What is the output of the following code snippet? */

double num[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
float result = 0;
for (int i = 0; i < 5; ++i)
    result = result + num[i];
System.out.print(result / 6);


/*
Array Initialization: The array num is initialized with the following values:
num = {5.5, 10.1, 11, 12.8, 56.9, 2.5}
Result Initialization: The variable result is initialized to 0 and is of type float.

For Loop: The loop iterates from 0 to 4 (5 iterations). Inside the loop, it adds the first five elements of the num array to result:

Iteration 0: result = 0 + 5.5 = 5.5
Iteration 1: result = 5.5 + 10.1 = 15.6
Iteration 2: result = 15.6 + 11 = 26.6
Iteration 3: result = 26.6 + 12.8 = 39.4
Iteration 4: result = 39.4 + 56.9 = 96.3
After the loop, result holds the value 96.3.

Final Calculation: The last line of the code computes:
System.out.print(result / 6);

So, result / 6 = 96.3 / 6 = 16.05.*/

