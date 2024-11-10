/*Write a JavaFX application program that creates a thread which will scroll the
message from right to left across the window or left to right based on RadioButton
option selected by the user. */

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScrollingMessageApp extends Application {

    private static final String MESSAGE = "Welcome to the Scrolling Message Application!";

    @Override
    public void start(Stage primaryStage) {
        // Create a Text object to display the scrolling message
        Text messageText = new Text(MESSAGE);
        messageText.setFill(Color.BLUE);

        // Create RadioButtons for direction selection
        RadioButton leftToRightButton = new RadioButton("Left to Right");
        RadioButton rightToLeftButton = new RadioButton("Right to Left");

        // Create a ToggleGroup for the RadioButtons to ensure only one is selected at a time
        ToggleGroup toggleGroup = new ToggleGroup();
        leftToRightButton.setToggleGroup(toggleGroup);
        rightToLeftButton.setToggleGroup(toggleGroup);

        // Set default direction (left to right)
        leftToRightButton.setSelected(true);

        // StackPane to center the message on the screen
        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(messageText);

        // Set the layout and add the RadioButtons
        StackPane layout = new StackPane();
        layout.getChildren().addAll(root, leftToRightButton, rightToLeftButton);

        // Position the RadioButtons at the bottom
        StackPane.setAlignment(leftToRightButton, Pos.BOTTOM_LEFT);
        StackPane.setAlignment(rightToLeftButton, Pos.BOTTOM_RIGHT);

        // Create the Timeline for scrolling the message
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            double x = messageText.getTranslateX();
            double width = messageText.getBoundsInParent().getWidth();

            // Determine the scrolling direction based on the selected RadioButton
            if (leftToRightButton.isSelected()) {
                // Move the message from left to right
                messageText.setTranslateX(x + 1);
                if (x > 400) {
                    messageText.setTranslateX(-width);
                }
            } else {
                // Move the message from right to left
                messageText.setTranslateX(x - 1);
                if (x < -width) {
                    messageText.setTranslateX(400);
                }
            }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE); // Run the timeline infinitely
        timeline.play(); // Start the scrolling animation

        // Create the Scene
        Scene scene = new Scene(layout, 400, 200);
        primaryStage.setTitle("Scrolling Message Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
