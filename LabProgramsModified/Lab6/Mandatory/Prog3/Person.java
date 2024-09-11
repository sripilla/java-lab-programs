/* "Person" class with private instance variables for the person's name and birth date. Add appropriate accessor methods for these variables. 
Then create a subclass "CollegeGraduate" with private instance variables for the student's GPA and year of graduation and appropriate accessors 
for these variables. Include appropriate constructors for your classes. Then create a class with main() methods that demonstrates your classes.*/
// Base class Person
class Person {
    // Private instance variables
    private String name;       // Person's name
    private String birthDate;  // Person's birth date

    // Constructor for Person class
    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Accessor method for name
    public String getName() {
        return name;
    }

    // Accessor method for birthDate
    public String getBirthDate() {
        return birthDate;
    }

    // Display method to show Person's details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
    }
}

// Subclass CollegeGraduate extending Person
class CollegeGraduate extends Person {
    // Private instance variables
    private double gpa;         // College Graduate's GPA
    private int graduationYear; // Year of graduation

    // Constructor for CollegeGraduate
    public CollegeGraduate(String name, String birthDate, double gpa, int graduationYear) {
        super(name, birthDate);  // Call the base class constructor
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }

    // Accessor method for GPA
    public double getGpa() {
        return gpa;
    }

    // Accessor method for Graduation Year
    public int getGraduationYear() {
        return graduationYear;
    }

    // Display method to show CollegeGraduate's details (overrides base class method)
    public void displayGraduateDetails() {
        super.displayPersonDetails(); // Call the base class method to display person details
        System.out.println("GPA: " + gpa);
        System.out.println("Graduation Year: " + graduationYear);
    }
}

/*EXPLANATION 
Base Class Person:

The class has two private instance variables: name and birthDate.
Accessor methods getName() and getBirthDate() are provided to access these private fields.
The displayPersonDetails() method displays the person’s details.

Subclass CollegeGraduate:

Inherits from the Person class and adds two additional private instance variables: gpa and graduationYear.
Accessor methods getGpa() and getGraduationYear() are provided for these fields.
The displayGraduateDetails() method overrides and extends the base class method to display the graduate’s details along with GPA and graduation year.
*/


