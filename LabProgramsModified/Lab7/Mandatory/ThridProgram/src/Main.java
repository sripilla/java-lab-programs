import myPackages.series.ByTwos;

public class Main {
    public static void main(String[] args) {
        ByTwos series = new ByTwos();

        // Set the starting point of the series
        series.setStart(0);

        System.out.println("First 5 numbers in the series:");
        for (int i = 0; i < 5; i++) {
            System.out.println(series.getNext());
        }

        // Reset the series and print again
        series.reset();
        System.out.println("\nSeries after reset:");
        for (int i = 0; i < 5; i++) {
            System.out.println(series.getNext());
        }
    }
}
