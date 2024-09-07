
public class ArrayInputAndPrint {

    // Main method to read elements into a 1D array and print them
    public static void main(String[] args) {

        int a[] = new int[3];  // declaration and instantiation
        a[0]= 10; // assignment
        a[1]= 20;
        a[2]= 70;

        // Printing array elements
        // Using the length property

        for(int i = 0; i < a.length; i++)
            {
                System.out.println(a[i]);
            }
   
     }
    
}


/*  SAMPLE OUTPUT

10
20
70


*/