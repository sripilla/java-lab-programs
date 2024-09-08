// Base class Building
class Building {
    // Private instance variables for square footage and stories
    private int squareFootage;
    private int stories;

    // Constructor for Building class
    public Building(int squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    // Getter for square footage
    public int getSquareFootage() {
        return squareFootage;
    }

    // Setter for square footage
    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    // Getter for stories
    public int getStories() {
        return stories;
    }

    // Setter for stories
    public void setStories(int stories) {
        this.stories = stories;
    }

    // Method to display building details
    public void displayBuildingDetails() {
        System.out.println("Square Footage: " + squareFootage);
        System.out.println("Stories: " + stories);
    }
}

// Subclass House extends Building
class House extends Building {
    // Private instance variables for number of bedrooms and baths
    private int bedrooms;
    private int baths;

    // Constructor for House class
    public House(int squareFootage, int stories, int bedrooms, int baths) {
        super(squareFootage, stories); // Calling the base class constructor
        this.bedrooms = bedrooms;
        this.baths = baths;
    }

    // Getter for bedrooms
    public int getBedrooms() {
        return bedrooms;
    }

    // Setter for bedrooms
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    // Getter for baths
    public int getBaths() {
        return baths;
    }

    // Setter for baths
    public void setBaths(int baths) {
        this.baths = baths;
    }

    // Method to display house details
    public void displayHouseDetails() {
        super.displayBuildingDetails(); // Call base class method to display building details
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Baths: " + baths);
    }
}

// Subclass School extends Building
class School extends Building {
    // Private instance variables for number of classrooms and grade level
    private int classrooms;
    private String gradeLevel;

    // Constructor for School class
    public School(int squareFootage, int stories, int classrooms, String gradeLevel) {
        super(squareFootage, stories); // Calling the base class constructor
        this.classrooms = classrooms;
        this.gradeLevel = gradeLevel;
    }

    // Getter for classrooms
    public int getClassrooms() {
        return classrooms;
    }

    // Setter for classrooms
    public void setClassrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    // Getter for grade level
    public String getGradeLevel() {
        return gradeLevel;
    }

    // Setter for grade level
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    // Method to display school details
    public void displaySchoolDetails() {
        super.displayBuildingDetails(); // Call base class method to display building details
        System.out.println("Classrooms: " + classrooms);
        System.out.println("Grade Level: " + gradeLevel);
    }
}

// Main class to demonstrate functionality
public class Main2 {
    public static void main(String[] args) {
        // Creating a House object
        House house = new House(2000, 2, 4, 3);
        System.out.println("House Details:");
        house.displayHouseDetails();
        System.out.println();

        // Creating a School object
        School school = new School(5000, 3, 20, "Elementary");
        System.out.println("School Details:");
        school.displaySchoolDetails();
    }
}

/*SAMPLE OUTPUT
House Details:
Square Footage: 2000
Stories: 2
Bedrooms: 4
Baths: 3

School Details:
Square Footage: 5000
Stories: 3
Classrooms: 20
Grade Level: Elementary
*/

/*EXPLANATION
Base Class Building:

Contains fields for squareFootage and stories.
Provides getter and setter methods for both fields.
Has a displayBuildingDetails() method to show the building details.
Subclass House:

Inherits from Building and adds two additional fields: bedrooms and baths.
Provides getter and setter methods for the new fields.
Overrides the display method to include house-specific details.
Subclass School:

Inherits from Building and adds two additional fields: classrooms and gradeLevel.
Provides getter and setter methods for the new fields.
Overrides the display method to include school-specific details.
Main Class:

Creates an object of type House and School and calls their respective display methods.*/