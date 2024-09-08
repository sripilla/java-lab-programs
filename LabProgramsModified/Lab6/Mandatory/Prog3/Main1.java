// Main class to demonstrate the functionality
public class Main1 {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Alice Johnson", "1980-05-15");
        System.out.println("Person Details:");
        person.displayPersonDetails();  // Displaying Person details
        System.out.println();

        // Creating a CollegeGraduate object
        CollegeGraduate grad = new CollegeGraduate("Bob Smith", "1995-07-20", 3.8, 2020);
        System.out.println("College Graduate Details:");
        grad.displayGraduateDetails();  // Displaying College Graduate details
    }
}

/* EXPLANATION 
Main Class:

Demonstrates the creation of both Person and CollegeGraduate objects and calls their respective display methods to show the details.
*/

/* SAMPLE OUTPUT
Person Details:
Name: Alice Johnson
Birth Date: 1980-05-15

College Graduate Details:
Name: Bob Smith
Birth Date: 1995-07-20
GPA: 3.8
Graduation Year: 2020
*/