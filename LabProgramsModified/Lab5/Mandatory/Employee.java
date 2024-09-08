/*
Add the following string processing methods to the class Employee:
a) formatEmployeeName(): A method that formats the employee's name by capitalising the first letter of each word 
and converting the remaining letters to lowercase. 
For example, if the employee's name is "JOHN DOE", this method would transform it to "John Doe".

b) generateEmail(): A method that generates an email address for the employee based on their name. 
For example, if the employee's name is "John Doe", the email address would be "jdoe@example.com".
*/
import java.util.Scanner;

// Define the Employee class
class Employee {
    // Instance variable to store the employee's name
    private String employeeName;

    // Constructor to initialize the employee's name
    public Employee(String name) {
        this.employeeName = name;
    }

    // Method to format the employee's name
    // Capitalizes the first letter of each word and converts the rest to lowercase
    public void formatEmployeeName() {
        // Split the name into words
        String[] words = employeeName.split(" ");
        StringBuilder formattedName = new StringBuilder();

        // Loop through each word and format it
        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first letter and make the rest lowercase
                formattedName.append(Character.toUpperCase(word.charAt(0)))
                             .append(word.substring(1).toLowerCase())
                             .append(" ");
            }
        }

        // Update the employeeName with the formatted version
        employeeName = formattedName.toString().trim();
    }

    // Method to generate an email address based on the employee's name
    // The email format is: first letter of the first name + full last name @example.com
    public String generateEmail() {
        String[] words = employeeName.split(" ");

        // Extract the first letter of the first name and the full last name
        if (words.length >= 2) {
            String firstName = words[0];
            String lastName = words[words.length - 1];
            // Generate email in the format: first letter of first name + last name
            return firstName.toLowerCase().charAt(0) + lastName.toLowerCase() + "@example.com";
        } else {
            // Return a default email if the name format is incorrect
            return "invalid@example.com";
        }
    }

    // Method to display the employee's name and email
    public void displayEmployeeDetails() {
        System.out.println("Formatted Employee Name: " + employeeName);
        System.out.println("Generated Email: " + generateEmail());
    }

    // Main method to demonstrate the string processing methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner for user input

        // Prompt the user to enter the employee's name
        System.out.print("Enter the employee's name: ");
        String name = scanner.nextLine();

        // Create an Employee object with the input name
        Employee emp = new Employee(name);

        // Format the employee's name and generate the email
        emp.formatEmployeeName();
        emp.displayEmployeeDetails();

        scanner.close();  // Close the scanner
    }
}


/* SAMPLE OUTPUT
Enter the employee's name: JOHN DOE
Formatted Employee Name: John Doe
Generated Email: jdoe@example.com

*/
/* EXPLANATION
Instance Variable: employeeName stores the employee's name.
Constructor: Initializes the employee's name when an object is created.
formatEmployeeName():
Splits the name into words.
Capitalizes the first letter of each word and makes the rest lowercase.
generateEmail():
Generates an email using the format: first letter of the first name + full last name + @example.com.
displayEmployeeDetails(): Displays the formatted name and generated email.
Main Method: Prompts the user for the employee's name, formats it, and displays the details.
*/
