import java.util.Scanner;

// Class to represent a customer
class Customer {
    // Private fields for customer ID, name, and credit limit
    private int customerID;
    private String name;
    private double creditLimit;

    // Default constructor
    public Customer() {
        this.customerID = 0;
        this.name = "";
        this.creditLimit = 0.0;
    }

    // Parameterized constructor to initialize customer details
    public Customer(int customerID, String name, double creditLimit) {
        this.customerID = customerID;
        this.name = name;
        this.creditLimit = creditLimit;
    }

    // Method to display customer details
    public void displayCustomer() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Name: " + name);
        System.out.println("Credit Limit: $" + creditLimit);
        System.out.println(); // Line break for better readability
    }

    // Main method to create and display Customer objects
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold 5 Customer objects
        Customer[] customers = new Customer[5];

        // Loop to create and initialize Customer objects
        for (int i = 0; i < customers.length; i++) {
            System.out.println("Enter details for Customer " + (i + 1) + ":");

            // Prompt user for customer ID
            System.out.print("Customer ID: ");
            int customerID = scanner.nextInt();

            // Clear the scanner buffer
            scanner.nextLine();

            // Prompt user for customer name
            System.out.print("Name: ");
            String name = scanner.nextLine();

            // Prompt user for credit limit
            System.out.print("Credit Limit: ");
            double creditLimit = scanner.nextDouble();

            // Create a new Customer object and store it in the array
            customers[i] = new Customer(customerID, name, creditLimit);
            System.out.println(); // Line break for clarity
        }

        // Display all Customer objects
        System.out.println("Customer Details:");
        for (Customer customer : customers) {
            customer.displayCustomer();
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

/* SAMPLE OUTPUT

Enter details for Customer 1:
Customer ID: 101
Name: Alice
Credit Limit: 5000

Enter details for Customer 2:
Customer ID: 102
Name: Bob
Credit Limit: 7000

Enter details for Customer 3:
Customer ID: 103
Name: Charlie
Credit Limit: 6000

Enter details for Customer 4:
Customer ID: 104
Name: David
Credit Limit: 4500

Enter details for Customer 5:
Customer ID: 105
Name: Eve
Credit Limit: 8000

Customer Details:
Customer ID: 101
Name: Alice
Credit Limit: $5000.0

Customer ID: 102
Name: Bob
Credit Limit: $7000.0

Customer ID: 103
Name: Charlie
Credit Limit: $6000.0

Customer ID: 104
Name: David
Credit Limit: $4500.0

Customer ID: 105
Name: Eve
Credit Limit: $8000.0


************************ EXPLANATION *************************

1. Class Definition (Customer):

.    Private Fields: The class has three private fields: customerID, name, and creditLimit, which store the customer's ID number, name, and credit limit, respectively.
.    Constructors:
    .    Default Constructor: Initializes the fields with default values (ID = 0, name = an empty string, credit limit = 0.0).
    .    Parameterized Constructor: Initializes the fields with values provided as parameters.
.    displayCustomer() Method: This method displays the customer's ID, name, and credit limit.

2. Main Method:

.    Array of Customer Objects: The program declares an array of 5 Customer objects.
.    User Input: The program prompts the user to enter the customer ID, name, and credit limit for each Customer object.
.    Object Creation: For each iteration, a new Customer object is created with the provided values and stored in the array.
.    Display: After all objects are created, the program displays the details of all 5 Customer objects.

*/