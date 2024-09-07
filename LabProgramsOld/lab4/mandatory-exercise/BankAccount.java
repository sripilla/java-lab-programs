// BankAccount class to represent a bank account
class BankAccount {
    // Instance variables
    private String depositorName;   // Name of the depositor
    private String accountNumber;   // Account number
    private String accountType;     // Type of account (e.g., Savings, Checking)
    private double balanceAmount;   // Balance amount in the account
    private static double interestRate = 3.5; // Static variable for rate of interest (common to all accounts)

    // Default constructor that initializes the account with default values
    public BankAccount() {
        depositorName = "Unknown";
        accountNumber = "00000000";
        accountType = "Savings";
        balanceAmount = 0.0;
    }

    // Parameterized constructor to initialize the account with given values
    public BankAccount(String name, String accNumber, String accType, double balance) {
        depositorName = name;
        accountNumber = accNumber;
        accountType = accType;
        balanceAmount = balance;
    }

    // Method to deposit amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balanceAmount += amount;  // Increase balance by the deposited amount
            System.out.println("Amount deposited successfully. New balance: " + balanceAmount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount from the account after checking for minimum balance
    public void withdraw(double amount) {
        double minimumBalance = 500;  // Assume minimum balance requirement is 500
        if (amount > 0 && balanceAmount - amount >= minimumBalance) {
            balanceAmount -= amount;  // Decrease balance by the withdrawn amount
            System.out.println("Amount withdrawn successfully. New balance: " + balanceAmount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance. Minimum balance of " + minimumBalance + " must be maintained.");
        }
    }

    // Method to display all the details of an account holder
    public void displayDetails() {
        System.out.println("Account Details:");
        System.out.println("Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance Amount: " + balanceAmount);
    }

    // Static method to display the rate of interest
    public static void displayInterestRate() {
        System.out.println("Current Rate of Interest: " + interestRate + "%");
    }

    // Main method to illustrate the constructors and methods
    public static void main(String[] args) {
        // Creating a BankAccount object using the default constructor
        BankAccount account1 = new BankAccount();
        account1.displayDetails(); // Displaying details of account1
        BankAccount.displayInterestRate(); // Displaying the rate of interest

        // Creating a BankAccount object using the parameterized constructor
        BankAccount account2 = new BankAccount("John Doe", "12345678", "Checking", 1000.0);
        account2.displayDetails(); // Displaying details of account2
        BankAccount.displayInterestRate(); // Displaying the rate of interest

        // Depositing amount into account2
        account2.deposit(500.0);

        // Withdrawing amount from account2
        account2.withdraw(700.0);

        // Trying to withdraw an amount that would result in less than the minimum balance
        account2.withdraw(800.0);
    }
}

/* SAMPLE OUTPUT

Account Details:
Name: Unknown
Account Number: 00000000
Account Type: Savings
Balance Amount: 0.0
Current Rate of Interest: 3.5%
Account Details:
Name: John Doe
Account Number: 12345678
Account Type: Checking
Balance Amount: 1000.0
Current Rate of Interest: 3.5%
Amount deposited successfully. New balance: 1500.0
Amount withdrawn successfully. New balance: 800.0
Insufficient balance. Minimum balance of 500.0 must be maintained.


********************* EXPLANATION *************************

1. Class Definition (BankAccount):

The BankAccount class represents a bank account with various attributes like the depositor's name, account number, account type, and balance amount.
The interest rate is a static variable since it is common to all accounts.

2. Constructors:

Default Constructor:
.   Initializes the account with default values ("Unknown", "00000000", "Savings", 0.0).
Parameterized Constructor:
.   Allows the user to initialize the account with specific values for the depositor's name, account number, account type, and balance amount.

3. Methods:

deposit(double amount):
.    Adds the specified amount to the account's balance if the amount is positive.
withdraw(double amount):
.    Withdraws the specified amount from the account after checking if the resulting balance will not be less than the minimum required balance (assumed to be 500).
displayDetails():
.    Displays the account holder's details, including the depositor's name, account number, account type, and balance amount.

4. Main Method:

.    Demonstrates the use of both constructors and all methods by creating BankAccount objects.
.    account1: Created using the default constructor and displays its details.
.    account2: Created using the parameterized constructor, displays its details, deposits money, withdraws money, and attempts to withdraw an amount that would result in a balance below the minimum required.




*/