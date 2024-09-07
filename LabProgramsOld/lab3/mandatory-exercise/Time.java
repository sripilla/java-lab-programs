class Time {
    private int hours;   // Hours (0-23)
    private int minutes; // Minutes (0-59)
    private int seconds; // Seconds (0-59)

    // Method to assign initial values to the Time object
    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to display a Time object in the form of h:mm:s (24-hour format)
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Method to add two Time objects
    public Time add(Time other) {
        Time result = new Time();
        int totalSeconds = this.toSeconds() + other.toSeconds(); // Convert both times to seconds and add them
        result.fromSeconds(totalSeconds); // Convert the total seconds back to hours, minutes, and seconds
        return result; // Return the resulting Time object
    }

    // Method to subtract two Time objects
    public Time subtract(Time other) {
        Time result = new Time();
        int totalSeconds = this.toSeconds() - other.toSeconds(); // Convert both times to seconds and subtract them
        if (totalSeconds < 0) {
            totalSeconds += 24 * 3600; // If the result is negative, adjust for the 24-hour format
        }
        result.fromSeconds(totalSeconds); // Convert the total seconds back to hours, minutes, and seconds
        return result; // Return the resulting Time object
    }

    // Method to compare two Time objects
    public int compare(Time other) {
        int thisSeconds = this.toSeconds(); // Convert this time to seconds
        int otherSeconds = other.toSeconds(); // Convert the other time to seconds
        if (thisSeconds > otherSeconds) {
            return 1; // This time is greater
        } else if (thisSeconds < otherSeconds) {
            return -1; // This time is smaller
        } else {
            return 0; // Both times are equal
        }
    }

    // Helper method to convert time to total seconds
    private int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds; // Convert hours, minutes, and seconds to total seconds
    }

    // Helper method to convert total seconds back to hours, minutes, and seconds
    private void fromSeconds(int totalSeconds) {
        this.hours = (totalSeconds / 3600) % 24; // Calculate hours and adjust for 24-hour format
        totalSeconds %= 3600;
        this.minutes = totalSeconds / 60; // Calculate minutes
        this.seconds = totalSeconds % 60; // Calculate seconds
    }

    // Main method to test the Time class
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();

        // Assign values to the Time objects
        t1.setTime(14, 45, 30); // t1 is 14:45:30
        t2.setTime(9, 30, 15);  // t2 is 09:30:15

        // Display the original times
        System.out.print("First Time: ");
        t1.displayTime();
        System.out.print("Second Time: ");
        t2.displayTime();

        // Add the two times and display the result
        Time sum = t1.add(t2);
        System.out.print("Sum of the two times: ");
        sum.displayTime();

        // Subtract the two times and display the result
        Time difference = t1.subtract(t2);
        System.out.print("Difference of the two times: ");
        difference.displayTime();

        // Compare the two times
        int comparison = t1.compare(t2);
        if (comparison > 0) {
            System.out.println("First time is greater than the second time.");
        } else if (comparison < 0) {
            System.out.println("First time is smaller than the second time.");
        } else {
            System.out.println("Both times are equal.");
        }
    }
}


/* SAMPLE OUTPUT
First Time: 14:45:30
Second Time: 09:30:15
Sum of the two times: 00:15:45
Difference of the two times: 05:15:15
First time is greater than the second time.


1. Class Definition:

The Time class has three private instance variables: hours, minutes, and seconds to represent the time in a 24-hour format.

2. setTime Method:

Assigns values to the hours, minutes, and seconds of the Time object.

3. displayTime Method:

Displays the time in h:mm:s format using printf to format the output.

4. add Method:

Adds two Time objects by first converting both to total seconds, adding them, and then converting the total back to hours, minutes, and seconds.

5. subtract Method:

Subtracts one Time object from another in a similar way, adjusting for negative results to maintain the 24-hour format.

6. compare Method:

Compares two Time objects by converting them to total seconds and returns:
1 if the first time is greater,
-1 if the first time is smaller,
0 if both times are equal.

7. Helper Methods:

toSeconds: Converts hours, minutes, and seconds to total seconds.
fromSeconds: Converts total seconds back to hours, minutes, and seconds.

8. Main Method:

Tests the Time class by creating two Time objects, setting their values, displaying them, and then demonstrating addition, subtraction, and comparison.
*/