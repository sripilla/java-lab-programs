/* Find the value of a[1] after execution of the following code snippet*/

int[] a = {0,2,4,1,3};
for(int i = 0; i < a.length; i++){
a[i] = a[(a[i] + 3) % a.length];
}

/*
Initial array: a = {0, 2, 4, 1, 3}

Loop Analysis:
The loop iterates through the array and updates each element a[i] using the expression: a[i] = a[(a[i] + 3) % a.length]

Iteration 1 (i = 0):
Current a[0] = 0
Update: a[0] = a[(0 + 3) % 5] = a[3]
Current a[3] = 1, so a[0] becomes 1
New array: {1, 2, 4, 1, 3}

Iteration 2 (i = 1):
Current a[1] = 2
Update: a[1] = a[(2 + 3) % 5] = a[0]
Current a[0] = 1, so a[1] becomes 1
New array: {1, 1, 4, 1, 3}

Iteration 3 (i = 2):
Current a[2] = 4
Update: a[2] = a[(4 + 3) % 5] = a[2]
Current a[2] = 4, so a[2] remains 4
New array: {1, 1, 4, 1, 3}

Iteration 4 (i = 3):
Current a[3] = 1
Update: a[3] = a[(1 + 3) % 5] = a[4]
Current a[4] = 3, so a[3] becomes 3
New array: {1, 1, 4, 3, 3}

Iteration 5 (i = 4):
Current a[4] = 3
Update: a[4] = a[(3 + 3) % 5] = a[1]
Current a[1] = 1, so a[4] becomes 1
New array: {1, 1, 4, 3, 1}

Final Value of a[1]:
After the loop, the array is:{1, 1, 4, 3, 1}
Thus, a[1] = 1.
*/