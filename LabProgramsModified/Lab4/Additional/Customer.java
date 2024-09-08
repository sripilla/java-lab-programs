/*
Define a class called Customer that holds private fields for a customer ID number, name and credit limit. 
Include appropriate constructors  to initialise the instance variables of the Customer Class. 
Write a main() method that declares an array of 5 Customer objects. 
Prompt the user for values for each Customer, and display all 5 Customer objects.
*/
import java.util.Scanner;

// Define the Customer class
class Customer {
    // Private instance variables to store customer details
    private int customerID;
    private String customerName;
    private double creditLimit;

    // Parameterized constructor to initialize the instance variables
    public Customer(int id, String name, double limit) {
        customerID = id;
        customerName = name;
        creditLimit = limit;
    }

    // Method to display the customer details
    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Credit Limit: $" + creditLimit);
    }

    // Main method to create an array of 5 Customer objects
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input

        // Declare an array to store 5 Customer objects
        Customer[] customers = new Customer[5];

        // Loop to get details of 5 customers from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Customer " + (i + 1) + ":");

            // Prompt the user to enter the customer ID
            System.out.print("Enter Customer ID: ");
            int id = scanner.nextInt();

            // Prompt the user to enter the customer name
            System.out.print("Enter Customer Name: ");
            scanner.nextLine();  // Consume the newline character
            String name = scanner.nextLine();

            // Prompt the user to enter the credit limit
            System.out.print("Enter Credit Limit: ");
            double limit = scanner.nextDouble();

            // Create a new Customer object with the input values and store it in the array
            customers[i] = new Customer(id, name, limit);

            System.out.println();  // Print a blank line between entries
        }

        // Display the details of all 5 customers
        System.out.println("Customer Details:");
        for (Customer customer : customers) {
            customer.displayCustomerDetails();
            System.out.println();  // Print a blank line between customers
        }

        scanner.close();  // Close the scanner
    }
}


/*SAMPLE OUTPUT
Enter details for Customer 1:
Enter Customer ID: 101
Enter Customer Name: John Doe
Enter Credit Limit: 5000

Enter details for Customer 2:
Enter Customer ID: 102
Enter Customer Name: Jane Smith
Enter Credit Limit: 7000

Enter details for Customer 3:
Enter Customer ID: 103
Enter Customer Name: Alice Brown
Enter Credit Limit: 6000

Enter details for Customer 4:
Enter Customer ID: 104
Enter Customer Name: Bob Green
Enter Credit Limit: 8000

Enter details for Customer 5:
Enter Customer ID: 105
Enter Customer Name: Charlie Black
Enter Credit Limit: 9000

Customer Details:
Customer ID: 101
Customer Name: John Doe
Credit Limit: $5000.0

Customer ID: 102
Customer Name: Jane Smith
Credit Limit: $7000.0

Customer ID: 103
Customer Name: Alice Brown
Credit Limit: $6000.0

Customer ID: 104
Customer Name: Bob Green
Credit Limit: $8000.0

Customer ID: 105
Customer Name: Charlie Black
Credit Limit: $9000.0

*/
/* EXPLANATION
Private Fields: customerID, customerName, and creditLimit are private to ensure encapsulation.
Constructor: Initializes the Customer object with ID, name, and credit limit provided by the user.
displayCustomerDetails() method: Displays the details of each customer.
Main Method:
Uses a Scanner object to read input values for 5 customers.
Stores each Customer object in an array.
Displays all customer details after input is complete.
*/
