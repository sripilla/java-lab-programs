/* Write a generic method to exchange the positions of two different elements in an array.*/
public class ArrayUtils {
    // Generic method to swap elements in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        // Ensure indices are within bounds
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index for array swap.");
        }

        // Swap the elements
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + java.util.Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("After swap: " + java.util.Arrays.toString(intArray));

        // Test with String array
        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("Before swap: " + java.util.Arrays.toString(strArray));
        swap(strArray, 0, 2);
        System.out.println("After swap: " + java.util.Arrays.toString(strArray));
    }
}

/*SAMPLE OUTPUT
Before swap: [1, 2, 3, 4, 5]
After swap: [1, 4, 3, 2, 5]
Before swap: [A, B, C, D]
After swap: [C, B, A, D]
*/