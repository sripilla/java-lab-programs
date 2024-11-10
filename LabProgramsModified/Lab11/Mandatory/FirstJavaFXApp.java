/* Write a JavaFX application program to do the following:
a. Display the message “Welcome to JavaFX programming” using Label in
the Scene.
b. Set the text color of the Label to Magenta.
c. Set the title of the Stage to “This is the first JavaFX Application”.
d. Set the width and height of the Scene to 500 and 200 respectively.
e. Use FlowPane layout and set the hgap and vgap of the FlowPane to desired
values.*/

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FirstJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Label with the specified text
        Label welcomeLabel = new Label("Welcome to JavaFX programming");

        // Set the text color of the Label to Magenta
        welcomeLabel.setTextFill(Color.MAGENTA);

        // Create a FlowPane layout and set horizontal and vertical gaps
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10); // Set desired horizontal gap
        flowPane.setVgap(10); // Set desired vertical gap
        flowPane.getChildren().add(welcomeLabel);

        // Create a Scene with specified width and height
        Scene scene = new Scene(flowPane, 500, 200);

        // Set the title of the Stage
        primaryStage.setTitle("This is the first JavaFX Application");

        // Set the Scene on the Stage
        primaryStage.setScene(scene);

        // Display the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
