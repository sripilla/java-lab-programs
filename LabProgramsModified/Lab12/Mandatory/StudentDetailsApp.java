/*Write a JavaFX application program that displays the student details that are created
in the earlier labs using Canvas based on the option chosen in List View (student
register numbers). */

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentDetailsApp extends Application {

    // Sample student data
    private static final Student[] students = {
        new Student("John Doe", "12345", "Computer Science", 85, 90, 88),
        new Student("Jane Smith", "67890", "Electrical Engineering", 92, 89, 94),
        new Student("Bob Brown", "11223", "Mechanical Engineering", 78, 82, 80),
        new Student("Alice Green", "44556", "Civil Engineering", 88, 91, 85)
    };

    @Override
    public void start(Stage primaryStage) {
        // Create ListView with student register numbers
        ListView<String> listView = new ListView<>();
        for (Student student : students) {
            listView.getItems().add(student.getRegisterNumber());
        }

        // Create Canvas to display student details
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Set the action for when a register number is selected
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // Find the selected student
            Student selectedStudent = getStudentByRegisterNumber(newValue);

            if (selectedStudent != null) {
                // Clear the canvas before drawing new details
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

                // Display the student details on the canvas
                gc.fillText("Student Details:", 10, 20);
                gc.fillText("Name: " + selectedStudent.getName(), 10, 50);
                gc.fillText("Register No: " + selectedStudent.getRegisterNumber(), 10, 80);
                gc.fillText("Course: " + selectedStudent.getCourse(), 10, 110);
                gc.fillText("Marks (Midterm, Final, Practical):", 10, 140);
                gc.fillText("Midterm: " + selectedStudent.getMidtermMarks(), 10, 170);
                gc.fillText("Final: " + selectedStudent.getFinalMarks(), 10, 200);
                gc.fillText("Practical: " + selectedStudent.getPracticalMarks(), 10, 230);
            }
        });

        // Create a VBox for the ListView
        VBox listViewBox = new VBox(10, new Label("Select Student Register Number:"), listView);
        listViewBox.setPrefWidth(200);

        // Create a BorderPane to place ListView and Canvas side by side
        BorderPane root = new BorderPane();
        root.setLeft(listViewBox);
        root.setCenter(canvas);

        // Set up the scene and stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Student Details Viewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Helper method to find student by register number
    private Student getStudentByRegisterNumber(String registerNumber) {
        for (Student student : students) {
            if (student.getRegisterNumber().equals(registerNumber)) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        launch(args);
    }

    // Student class to hold student data
    public static class Student {
        private String name;
        private String registerNumber;
        private String course;
        private int midtermMarks;
        private int finalMarks;
        private int practicalMarks;

        public Student(String name, String registerNumber, String course, int midtermMarks, int finalMarks, int practicalMarks) {
            this.name = name;
            this.registerNumber = registerNumber;
            this.course = course;
            this.midtermMarks = midtermMarks;
            this.finalMarks = finalMarks;
            this.practicalMarks = practicalMarks;
        }

        public String getName() {
            return name;
        }

        public String getRegisterNumber() {
            return registerNumber;
        }

        public String getCourse() {
            return course;
        }

        public int getMidtermMarks() {
            return midtermMarks;
        }

        public int getFinalMarks() {
            return finalMarks;
        }

        public int getPracticalMarks() {
            return practicalMarks;
        }
    }
}
