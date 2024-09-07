/*
Define a class Mixer to merge two sorted integer arrays in ascending order with the following instance variables and methods:

instance variables:
        int arr[]         // to store the elements of an array

Methods:
        void accept()     // to accept the elements of an array in ascending order without any duplicates

Mixer mix(Mixer A)       // to merge the current object array elements with the parameterized array elements and return the resultant object

void display()           // to display the elements of an array

Define the main() method to test the class.
*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mixer {
    // Instance variable to store the elements of an array
    private int[] arr;

    // Method to accept the elements of an array in ascending order without any duplicates
    public void accept() {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize a set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Read elements and add to the set
        System.out.println("Enter the elements in ascending order:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            uniqueElements.add(element);
        }

        // Convert the set to an array
        arr = uniqueElements.stream().sorted().mapToInt(Integer::intValue).toArray();

        // Close the scanner
        scanner.close();
    }

    // Method to merge the current object array elements with the parameterized array elements
    public Mixer mix(Mixer A) {
        // Create a set to store merged elements and avoid duplicates
        Set<Integer> mergedSet = new HashSet<>();

        // Add elements of the current object
        for (int num : this.arr) {
            mergedSet.add(num);
        }

        // Add elements of the parameterized array
        for (int num : A.arr) {
            mergedSet.add(num);
        }

        // Convert the set to an array and sort it
        Mixer result = new Mixer();
        result.arr = mergedSet.stream().sorted().mapToInt(Integer::intValue).toArray();

        return result;
    }

    // Method to display the elements of an array
    public void display() {
        System.out.println("Array elements: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Create two Mixer objects
        Mixer mixer1 = new Mixer();
        Mixer mixer2 = new Mixer();

        System.out.println("Enter details for the first array:");
        mixer1.accept();  // Accept elements for the first array

        System.out.println("Enter details for the second array:");
        mixer2.accept();  // Accept elements for the second array

        // Merge the two arrays
        Mixer resultMixer = mixer1.mix(mixer2);

        // Display the merged array
        System.out.println("Merged array:");
        resultMixer.display();
    }
}

/* SAMPLE OUTPUT
Enter details for the first array:
Enter the number of elements: 5
Enter the elements in ascending order:
1
2
3
4
5
Enter details for the second array:
Enter the number of elements: 4
Enter the elements in ascending order:
3
4
6
7
Merged array:
Array elements: [1, 2, 3, 4, 5, 6, 7]

*/

/* EXPLANATION
1. Instance Variable:

arr: An array to store the elements.

2. Methods:

accept(): Reads the number of elements and the elements themselves (ensuring uniqueness and order). Uses a Set to avoid duplicates and then converts it back to an array.
mix(Mixer A): Merges the current object's array with the array of another Mixer object. Uses a Set to handle duplicates and then converts the merged set to a sorted array.
display(): Prints the elements of the array in a readable format.

3. main(String[] args):

Creates two Mixer objects.
Accepts input for both objects using the accept() method.
Merges the two arrays using the mix() method.
Displays the merged array using the display() method.
*/
/*
How It Works:
The accept() method reads and processes unique, ordered elements from user input.
The mix() method merges two arrays, ensuring no duplicates.
The display() method outputs the final sorted array.
The main() method tests the functionality by reading, merging, and displaying arrays.
*/