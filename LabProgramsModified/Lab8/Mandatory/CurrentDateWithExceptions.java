// Custom Exception for Invalid Day
class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Month
class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

// CurrentDate Class: Handles date validation and exceptions
class CurrentDate {
    private int day;
    private int month;
    private int year;

    // Method to create a date by reading values from the user
    public void createDate() throws InvalidDayException, InvalidMonthException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Reading day, month, and year from user input
        System.out.print("Enter day: ");
        day = scanner.nextInt();
        System.out.print("Enter month: ");
        month = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt();

        // Check for invalid day and month
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month + ". Month must be between 1 and 12.");
        }

        // Validate day based on the month and leap year check for February
        if (day < 1 || day > getMaxDaysInMonth(month, year)) {
            throw new InvalidDayException("Invalid day: " + day + ". Day must be between 1 and " + getMaxDaysInMonth(month, year) + " for month " + month + ".");
        }

        // If valid date, display it
        System.out.println("Current Date: " + day + "/" + month + "/" + year);
    }

    // Helper method to determine the maximum days in a month (including leap year check for February)
    private int getMaxDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                // Leap year check: If divisible by 4, but not by 100 unless divisible by 400
                return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
            default:
                return 0; // Should never reach here due to earlier validation of the month
        }
    }
}

// Test Program to illustrate the functionality
public class CurrentDateWithExceptions {
    public static void main(String[] args) {
        CurrentDate currentDate = new CurrentDate();

        try {
            // Creating and validating date by reading user input
            currentDate.createDate();
        } catch (InvalidDayException | InvalidMonthException e) {
            // Handling exceptions
            System.out.println(e.getMessage());
        }
    }
}

/* SAMPLE OUTPUT
Enter day: 29
Enter month: 2
Enter year: 2024
Current Date: 29/2/2024


If the user enters an invalid month or day, for example:
Enter day: 32
Enter month: 13
Enter year: 2024
Invalid month: 13. Month must be between 1 and 12.


or
Enter day: 32
Enter month: 1
Enter year: 2024
Invalid day: 32. Day must be between 1 and 31 for month 1.
*/
