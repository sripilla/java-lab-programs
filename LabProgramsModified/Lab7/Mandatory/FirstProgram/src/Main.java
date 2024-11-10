/* Design a Building class as in Lab 6, program no. 2. Place the Building, House, and
School classes in a package named com.course.structure. Create a main method that
declares objects of each type and uses the package.*/
import com.course.structure.House;
import com.course.structure.School;

public class Main {
    public static void main(String[] args) {
        // Creating a House object
        House house = new House(2000, 2, 4, 3);
        System.out.println("House Details:");
        System.out.println("Square Footage: " + house.getSquareFootage());
        System.out.println("Stories: " + house.getStories());
        System.out.println("Bedrooms: " + house.getBedrooms());
        System.out.println("Baths: " + house.getBaths());

        // Creating a School object
        School school = new School(5000, 3, 20, "Elementary");
        System.out.println("\nSchool Details:");
        System.out.println("Square Footage: " + school.getSquareFootage());
        System.out.println("Stories: " + school.getStories());
        System.out.println("Classrooms: " + school.getClassrooms());
        System.out.println("Grade Level: " + school.getGradeLevel());
    }
}
