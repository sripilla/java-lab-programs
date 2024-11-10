/*Write and execute a java program to create and initialize a matrix of integers. Create n
threads( by implementing Runnable interface) where n is equal to the number of rows
in the matrix. Each of these threads should compute a distinct row sum. The main
thread computes the complete sum by looking into the partial sums given by the
threads. */

// Class implementing Runnable to compute the sum of a specific row
class RowSumThread implements Runnable {
    private int[] row;
    private int rowIndex;
    private int rowSum;
    private int[] partialSums; // Array to store the partial sums

    // Constructor to initialize row and the array to store partial sums
    public RowSumThread(int[] row, int rowIndex, int[] partialSums) {
        this.row = row;
        this.rowIndex = rowIndex;
        this.partialSums = partialSums;
    }

    @Override
    public void run() {
        rowSum = 0;
        // Calculate the sum of the row
        for (int num : row) {
            rowSum += num;
        }
        // Store the partial sum in the corresponding index
        partialSums[rowIndex] = rowSum;
    }
}

public class MatrixRowSum {
    public static void main(String[] args) throws InterruptedException {
        // Initialize a matrix (2D array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;  // Number of rows in the matrix
        int columns = matrix[0].length;  // Number of columns in the matrix

        // Array to store the partial sums of each row
        int[] partialSums = new int[rows];

        // Array to store threads
        Thread[] threads = new Thread[rows];

        // Create and start a thread for each row to compute row sum
        for (int i = 0; i < rows; i++) {
            threads[i] = new Thread(new RowSumThread(matrix[i], i, partialSums));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < rows; i++) {
            threads[i].join();
        }

        // Compute the complete sum by looking at partial sums
        int totalSum = 0;
        for (int i = 0; i < rows; i++) {
            totalSum += partialSums[i];
        }

        // Display the partial sums and the total sum
        System.out.println("Partial sums of rows:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + " sum: " + partialSums[i]);
        }

        System.out.println("\nTotal sum of all elements in the matrix: " + totalSum);
    }
}

/*SAMPLE OUTPUT
Partial sums of rows:
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24

Total sum of all elements in the matrix: 45
[Finished in 824ms]*/