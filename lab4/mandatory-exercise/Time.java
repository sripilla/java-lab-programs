// Time class to represent time in hours, minutes, and seconds
class Time {
    private int hours;    // Instance variable to store hours
    private int minutes;  // Instance variable to store minutes
    private int seconds;  // Instance variable to store seconds

    // Default constructor that initializes time to 0:0:0 (midnight)
    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // Parameterized constructor that initializes time to the given values
    public Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    // Method to display the time in the format h:mm:ss
    public void display() {
        // Ensuring two digits for minutes and seconds by padding with zeros if necessary
        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Main method to illustrate the use of constructors and display method
    public static void main(String[] args) {
        // Creating a Time object using the default constructor
        Time t1 = new Time();
        System.out.print("Time t1: ");
        t1.display(); // Displaying the time t1

        // Creating a Time object using the parameterized constructor
        Time t2 = new Time(10, 15, 30);
        System.out.print("Time t2: ");
        t2.display(); // Displaying the time t2

        // Creating another Time object using the parameterized constructor
        Time t3 = new Time(23, 59, 59);
        System.out.print("Time t3: ");
        t3.display(); // Displaying the time t3
    }
}

/*  SAMPLE OUTPUT

Time t1: 0:00:00
Time t2: 10:15:30
Time t3: 23:59:59


*********************** EXPLANATION *************************

1. Class Definition (Time):

The Time class represents time with three instance variables: hours, minutes, and seconds.

2. Constructors:

Default Constructor:
Initializes the hours, minutes, and seconds to 0, representing midnight (0:0:0).
Parameterized Constructor:
Takes three parameters, h, m, and s, to initialize the hours, minutes, and seconds to specific values.

3. display Method:

Prints the time in the format h:mm:ss, where h is the hour, mm is the minutes, and ss is the seconds.
The method uses printf to format minutes and seconds with leading zeros if necessary.

4. Main Method:

Illustrates the use of both constructors and the display method.
t1: Created using the default constructor and displays 0:00:00.
t2: Created using the parameterized constructor with values 10, 15, and 30, and displays 10:15:30.
t3: Created using the parameterized constructor with values 23, 59, and 59, and displays 23:59:59.
*/