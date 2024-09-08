/*
Define a class to represent a "Bank account". Include the following members:
 i) Name of the depositor
 ii) Account number
 iii) Type of account
 iv) Balance amount in the account
 v) Rate of interest (static data)

 Provide a default constructor and parameterised constructor to this class. Also provide methods:

 1. To deposit amount
 2. To withdraw amount after checking for minimum balance
 3. To display all the details of an account holder.
 4. Display rate of interest (a static method)

 Illustrate all the constructors as well as methods  by defining objects of the class.
*/

// Define the BankAccount class
class BankAccount {
    // Instance variables to store bank account details
    String depositorName;
    int accountNumber;
    String accountType;
    double balance;

    // Static variable to represent the rate of interest (same for all accounts)
    static double interestRate = 4.5;

    // Default constructor (no parameters)
    // Initializes the object with default values
    BankAccount() {
        depositorName = "Not provided";
        accountNumber = 0;
        accountType = "Not provided";
        balance = 0.0;
    }

    // Parameterized constructor
    // Initializes the object with provided values
    BankAccount(String name, int accNum, String type, double initialBalance) {
        depositorName = name;
        accountNumber = accNum;
        accountType = type;
        balance = initialBalance;
    }

    // Method to deposit an amount into the account
    void deposit(double amount) {
        balance += amount; // Add deposit amount to balance
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    // Method to withdraw an amount, checking for minimum balance
    void withdraw(double amount) {
        if (balance - amount >= 500) { // Assuming minimum balance required is 500
            balance -= amount; // Subtract withdrawal amount from balance
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance! Minimum balance of 500 required.");
        }
    }

    // Method to display the details of an account holder
    void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    // Static method to display the interest rate
    static void displayInterestRate() {
        System.out.println("Current Interest Rate: " + interestRate + "%");
    }

    // Main method to demonstrate constructors and methods
    public static void main(String[] args) {
        // Create an object using the default constructor
        BankAccount account1 = new BankAccount();
        System.out.println("Details of Account 1 (Using Default Constructor):");
        account1.display();
        System.out.println();

        // Create an object using the parameterized constructor
        BankAccount account2 = new BankAccount("John Doe", 123456, "Savings", 1000.0);
        System.out.println("Details of Account 2 (Using Parameterized Constructor):");
        account2.display();
        System.out.println();

        // Deposit money into account2
        account2.deposit(500); // Depositing 500
        System.out.println();

        // Attempt to withdraw money from account2
        account2.withdraw(800); // Withdrawing 800 (Should be successful)
        account2.withdraw(1000); // Withdrawing 1000 (Should fail due to minimum balance)
        System.out.println();

        // Display the interest rate (static method)
        BankAccount.displayInterestRate();
    }
}

/*SAMPLE OUTPUT
Details of Account 1 (Using Default Constructor):
Depositor Name: Not provided
Account Number: 0
Account Type: Not provided
Balance: 0.0

Details of Account 2 (Using Parameterized Constructor):
Depositor Name: John Doe
Account Number: 123456
Account Type: Savings
Balance: 1000.0

500.0 deposited. New balance: 1500.0

800.0 withdrawn. New balance: 700.0
Insufficient balance! Minimum balance of 500 required.

Current Interest Rate: 4.5%
*/

/* EXPLANATION
1. Instance Variables: Store details like the depositor's name, account number, account type, and balance.
Static Variable: interestRate is shared by all instances and is set to 4.5%.

2. Constructors:
Default Constructor: Initializes the object with default values.
Parameterized Constructor: Initializes the object with user-provided values.

3. Methods:
deposit: Adds the deposit amount to the account balance.
withdraw: Checks for a minimum balance of 500 before withdrawing the specified amount.
display: Displays all the details of an account holder.
displayInterestRate: Displays the static interest rate.
*/