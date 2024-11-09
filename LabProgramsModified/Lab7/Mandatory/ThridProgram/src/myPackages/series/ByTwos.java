package myPackages.series;

public class ByTwos implements Series {
    private int start;
    private int current;

    // Constructor to initialize the series start and current value
    public ByTwos() {
        start = 0;
        current = 0;
    }

    // Implement the getNext() method to return the next number in series
    @Override
    public int getNext() {
        current += 2;
        return current;
    }

    // Implement the reset() method to reset the series to the initial start
    @Override
    public void reset() {
        current = start;
    }

    // Implement the setStart() method to define a starting value for the series
    @Override
    public void setStart(int start) {
        this.start = start;
        this.current = start;
    }
}
