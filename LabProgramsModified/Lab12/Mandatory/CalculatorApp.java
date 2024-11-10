/*Write a JavaFX application program that obtains two floating point numbers in two
text fields from the user and displays the sum, product, difference and quotient of
these numbers using Canvas on clicking compute button with a calculator image
placed on it. */
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label num1Label = new Label("Number 1:");
        TextField num1Field = new TextField();

        Label num2Label = new Label("Number 2:");
        TextField num2Field = new TextField();

        Button computeButton = new Button();
        Canvas canvas = new Canvas(300, 200); // To display results

        // Set up compute button with calculator image
        Image calculatorImage = new Image("file:calculator.png");
        computeButton.setGraphic(new javafx.scene.image.ImageView(calculatorImage));
        computeButton.setText("Compute");

        // Set up layout with GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add components to GridPane
        gridPane.add(num1Label, 0, 0);
        gridPane.add(num1Field, 1, 0);
        gridPane.add(num2Label, 0, 1);
        gridPane.add(num2Field, 1, 1);
        gridPane.add(computeButton, 1, 2);
        gridPane.add(canvas, 0, 3, 2, 1); // Span canvas over 2 columns

        // Set action for the compute button
        computeButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());

                double sum = num1 + num2;
                double product = num1 * num2;
                double difference = num1 - num2;
                double quotient = num2 != 0 ? num1 / num2 : Double.NaN;

                // Display results on the canvas
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Clear previous results
                gc.fillText("Sum: " + sum, 10, 20);
                gc.fillText("Product: " + product, 10, 50);
                gc.fillText("Difference: " + difference, 10, 80);
                gc.fillText("Quotient: " + (Double.isNaN(quotient) ? "Undefined (division by zero)" : quotient), 10, 110);

            } catch (NumberFormatException ex) {
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Clear previous results
                gc.fillText("Invalid input! Please enter valid numbers.", 10, 20);
            }
        });

        // Set up the scene and stage
        Scene scene = new Scene(gridPane, 350, 300);
        primaryStage.setTitle("Calculator Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
