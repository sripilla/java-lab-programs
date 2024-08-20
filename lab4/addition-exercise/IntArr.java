// Class to represent an array of integers
class IntArr {
    // Instance variable to store the array of integers
    private int[] arr;

    // Default constructor
    public IntArr() {
        // Initialize the array with a default size of 5 and fill with zeros
        arr = new int[5];
    }

    // Parameterized constructor to initialize the array with given values
    public IntArr(int[] inputArr) {
        // Initialize the array with the values from the input array
        arr = inputArr.clone(); // Use clone to avoid aliasing issues
    }

    // Method to display the contents of the array
    public void display() {
        System.out.print("Array contents: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line after printing all elements
    }

    // Method to search for an element in the array
    public boolean search(int key) {
        for (int i : arr) {
            if (i == key) {
                return true; // Return true if the element is found
            }
        }
        return false; // Return false if the element is not found
    }

    // Method to compare two IntArr objects for equality
    public boolean compare(IntArr other) {
        if (this.arr.length != other.arr.length) {
            return false; // Arrays are not equal if their lengths are different
        }
        for (int i = 0; i < arr.length; i++) {
            if (this.arr[i] != other.arr[i]) {
                return false; // Arrays are not equal if any corresponding elements differ
            }
        }
        return true; // Arrays are equal if all corresponding elements match
    }

    // Main method to illustrate the usage of the IntArr class and its methods
    public static void main(String[] args) {
        // Creating IntArr objects using the default constructor
        IntArr arr1 = new IntArr();
        arr1.display(); // Displaying contents of arr1

        // Creating IntArr objects using the parameterized constructor
        int[] array = {1, 2, 3, 4, 5};
        IntArr arr2 = new IntArr(array);
        arr2.display(); // Displaying contents of arr2

        // Searching for an element in arr2
        int key = 3;
        if (arr2.search(key)) {
            System.out.println("Element " + key + " found in the array.");
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        // Comparing arr1 and arr2 for equality
        if (arr1.compare(arr2)) {
            System.out.println("arr1 and arr2 are equal.");
        } else {
            System.out.println("arr1 and arr2 are not equal.");
        }

        // Creating another IntArr object with the same contents as arr2
        IntArr arr3 = new IntArr(new int[]{1, 2, 3, 4, 5});

        // Comparing arr2 and arr3 for equality
        if (arr2.compare(arr3)) {
            System.out.println("arr2 and arr3 are equal.");
        } else {
            System.out.println("arr2 and arr3 are not equal.");
        }
    }
}


/* SAMPLE OUTPUT
Array contents: 0 0 0 0 0 
Array contents: 1 2 3 4 5 
Element 3 found in the array.
arr1 and arr2 are not equal.
arr2 and arr3 are equal.


******************** EXPLANATION *************************

1. Class Definition (IntArr):

The IntArr class hosts an array of integers and provides various methods to work with this array.

2. Constructors:

.    Default Constructor: Initializes the array with a default size (e.g., 5 elements) and fills it with zeros.
.    Parameterized Constructor: Initializes the array with the values provided in the input array.

3. Methods:

.    display(): Displays the contents of the array.
.    search(int key): Searches for a specific element in the array and returns true if found, otherwise false.
.    compare(IntArr other): Compares the current IntArr object with another IntArr object for equality by comparing their arrays element by element.

4. Main Method:

.    Demonstrates the creation of IntArr objects using both constructors.
.    Displays the contents of the arrays using the display() method.
.    Searches for a specific element in one of the arrays using the search() method.
.    Compares two IntArr objects for equality using the compare() method.

*/