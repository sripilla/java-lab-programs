/* Write a JavaFX program to accept an integer from the user in a text field and display the multiplication table (up to number *10) for that number. Use FlowPane
layout for the application.*/

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MultiplicationTableApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI elements
        Label inputLabel = new Label("Enter an integer: ");
        TextField inputField = new TextField();
        Button calculateButton = new Button("Show Multiplication Table");
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false); // Make result area read-only

        // Set up the layout
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.getChildren().addAll(inputLabel, inputField, calculateButton, resultArea);

        // Button action to generate multiplication table
        calculateButton.setOnAction(e -> {
            try {
                int number = Integer.parseInt(inputField.getText());
                StringBuilder result = new StringBuilder();

                for (int i = 1; i <= 10; i++) {
                    result.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
                }
                resultArea.setText(result.toString());
            } catch (NumberFormatException ex) {
                resultArea.setText("Please enter a valid integer.");
            }
        });

        // Set up and display the scene
        Scene scene = new Scene(flowPane, 300, 300);
        primaryStage.setTitle("Multiplication Table");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
