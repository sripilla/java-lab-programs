/* Predict the output */

public class Solution2{
public static void main(String[] args){
  int[] x = {120, 200, 016};
  for(int i = 0; i < x.length; i++){
  System.out.print(x[i] + " ");
  } } }

/*
120 200 14

Here's the explanation:

The array x is initialized with three values: {120, 200, 016}.

120 and 200 are standard decimal integers, so they are stored as-is.

016 is written with a leading 0, which means it is interpreted as an octal (base 8) number in Java. The octal number 016 is equivalent to the decimal number 14.

Therefore, the array x contains the values: 120, 200, and 14
*/