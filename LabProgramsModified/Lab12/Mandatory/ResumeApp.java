/*Write a JavaFX application program to create your resume. Use checkbox to select
the languages which you can speak. On clicking the Submit button all the details of
the resume should be displayed using Canvas. */

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ResumeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label phoneLabel = new Label("Phone:");
        TextField phoneField = new TextField();

        Label languageLabel = new Label("Languages:");
        CheckBox englishCheckbox = new CheckBox("English");
        CheckBox frenchCheckbox = new CheckBox("French");
        CheckBox spanishCheckbox = new CheckBox("Spanish");
        CheckBox germanCheckbox = new CheckBox("German");

        Button submitButton = new Button("Submit");
        Canvas canvas = new Canvas(400, 300); // To display resume details

        // Set up layout with GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add components to GridPane
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);

        gridPane.add(emailLabel, 0, 1);
        gridPane.add(emailField, 1, 1);

        gridPane.add(phoneLabel, 0, 2);
        gridPane.add(phoneField, 1, 2);

        gridPane.add(languageLabel, 0, 3);
        gridPane.add(englishCheckbox, 1, 3);
        gridPane.add(frenchCheckbox, 1, 4);
        gridPane.add(spanishCheckbox, 1, 5);
        gridPane.add(germanCheckbox, 1, 6);

        gridPane.add(submitButton, 1, 7);
        gridPane.add(canvas, 0, 8, 2, 1); // Span canvas over 2 columns

        // Set action for the submit button
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();

            // Gather selected languages
            StringBuilder languages = new StringBuilder();
            if (englishCheckbox.isSelected()) languages.append("English ");
            if (frenchCheckbox.isSelected()) languages.append("French ");
            if (spanishCheckbox.isSelected()) languages.append("Spanish ");
            if (germanCheckbox.isSelected()) languages.append("German ");

            // Display resume details on the canvas
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Clear previous results
            gc.fillText("Resume Details:", 10, 20);
            gc.fillText("Name: " + name, 10, 50);
            gc.fillText("Email: " + email, 10, 80);
            gc.fillText("Phone: " + phone, 10, 110);
            gc.fillText("Languages: " + languages.toString(), 10, 140);
        });

        // Set up the scene and stage
        Scene scene = new Scene(gridPane, 450, 500);
        primaryStage.setTitle("Resume Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
