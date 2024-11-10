/*Write a JavaFX program to display a window using grid pane. Use TextField for UserName and PasswordField for Password input. On click of “Sign in” Button
the message “Welcome UserName” should be displayed in a Text Control. Use GridPane layout for the application.*/

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label welcomeLabel = new Label("Welcome");
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Text welcomeText = new Text(); // Will display "Welcome Username"
        Button signInButton = new Button("Sign in");

        // Set up GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add components to GridPane
        gridPane.add(welcomeLabel, 0, 0, 2, 1); // Spanning over two columns
        gridPane.add(usernameLabel, 0, 1);
        gridPane.add(usernameField, 1, 1);
        gridPane.add(passwordLabel, 0, 2);
        gridPane.add(passwordField, 1, 2);

        // Adding the welcome text in front of the sign-in button
        gridPane.add(welcomeText, 0, 3); 
        gridPane.add(signInButton, 1, 3);

        // Set action for the sign-in button
        signInButton.setOnAction(e -> {
            String username = usernameField.getText();
            welcomeText.setText("Welcome " + username);
        });

        // Set up the scene and stage
        Scene scene = new Scene(gridPane, 350, 200);
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
