/*
Define a class "IntArr" which hosts an array of integers. Provide the following methods:

 i) A "default constructor". 
 ii) A "parameterised constructor" which initialises the array of objects
 iii) A method called "display" to display the array elements.
 iv) A method called "search" to search for an element in the array. 
 v) A method called "compare" which compares "2 IntArr" objects for equality. 
*/
// Define the IntArr class
class IntArr {
    // Instance variable to hold the integer array
    int[] arr;

    // Default constructor
    // Initializes the array with 5 elements, all set to 0
    IntArr() {
        arr = new int[5];  // Creates an array of size 5 with default values (0)
    }

    // Parameterized constructor
    // Initializes the array with the values passed by the user
    IntArr(int[] inputArr) {
        arr = inputArr;  // Assigns the user-provided array to the instance variable
    }

    // Method to display the array elements
    void display() {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();  // Move to the next line after displaying all elements
    }

    // Method to search for an element in the array
    boolean search(int target) {
        for (int num : arr) {
            if (num == target) {
                return true;  // Return true if the target is found
            }
        }
        return false;  // Return false if the target is not found
    }

    // Method to compare two IntArr objects for equality
    boolean compare(IntArr other) {
        if (this.arr.length != other.arr.length) {
            return false;  // Return false if arrays are of different lengths
        }

        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] != other.arr[i]) {
                return false;  // Return false if any element is different
            }
        }
        return true;  // Return true if both arrays are identical
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating an object using the default constructor
        IntArr arr1 = new IntArr();
        System.out.println("Array 1 (Using Default Constructor):");
        arr1.display();

        // Creating an object using the parameterized constructor
        int[] numbers = {10, 20, 30, 40, 50};
        IntArr arr2 = new IntArr(numbers);
        System.out.println("Array 2 (Using Parameterized Constructor):");
        arr2.display();

        // Searching for an element in arr2
        int target = 30;
        System.out.println("Is " + target + " present in Array 2? " + arr2.search(target));

        // Comparing two IntArr objects (arr1 and arr2)
        System.out.println("Are Array 1 and Array 2 equal? " + arr1.compare(arr2));

        // Creating another IntArr object with the same elements as arr2
        int[] sameNumbers = {10, 20, 30, 40, 50};
        IntArr arr3 = new IntArr(sameNumbers);
        System.out.println("Array 3 (Same as Array 2):");
        arr3.display();

        // Comparing arr2 and arr3 (they should be equal)
        System.out.println("Are Array 2 and Array 3 equal? " + arr2.compare(arr3));
    }
}

/*Sample output
Array 1 (Using Default Constructor):
Array elements: 0 0 0 0 0 

Array 2 (Using Parameterized Constructor):
Array elements: 10 20 30 40 50 

Is 30 present in Array 2? true
Are Array 1 and Array 2 equal? false

Array 3 (Same as Array 2):
Array elements: 10 20 30 40 50 

Are Array 2 and Array 3 equal? true

*/
/*EXPLANATION
Instance Variable: arr holds the array of integers.
Default Constructor: Initializes a 5-element array with default values of 0.
Parameterized Constructor: Initializes the array with user-provided values.
display method: Displays the elements of the array.
search method: Searches for a specified element in the array and returns true if found, otherwise false.
compare method: Compares two IntArr objects for equality. If the arrays have the same size and identical elements, it returns true, otherwise false.
*/