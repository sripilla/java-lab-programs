/*Define a class called Employee with the attributes name, empID, designation,
basicPay, DA, HRA, PF, LIC, netSalary. DA is 40% of basicPay, HRA is 15% of
basicPay, PF is 12% of basicPay. Display all the employee information in a JavaFX
application. */
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

class Employee {
    private String name;
    private String empID;
    private String designation;
    private double basicPay;
    private double DA;
    private double HRA;
    private double PF;
    private double LIC;
    private double netSalary;

    // Constructor to initialize the employee details
    public Employee(String name, String empID, String designation, double basicPay, double LIC) {
        this.name = name;
        this.empID = empID;
        this.designation = designation;
        this.basicPay = basicPay;
        this.LIC = LIC;
        computeSalaryComponents();
    }

    // Method to compute DA, HRA, PF, and netSalary
    private void computeSalaryComponents() {
        DA = 0.40 * basicPay;
        HRA = 0.15 * basicPay;
        PF = 0.12 * basicPay;
        netSalary = basicPay + DA + HRA - PF - LIC;
    }

    // Getters for employee details
    public String getName() { return name; }
    public String getEmpID() { return empID; }
    public String getDesignation() { return designation; }
    public double getBasicPay() { return basicPay; }
    public double getDA() { return DA; }
    public double getHRA() { return HRA; }
    public double getPF() { return PF; }
    public double getLIC() { return LIC; }
    public double getNetSalary() { return netSalary; }
}

public class EmployeeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Input fields for employee details
        TextField nameField = new TextField();
        TextField empIDField = new TextField();
        TextField designationField = new TextField();
        TextField basicPayField = new TextField();
        TextField licField = new TextField();

        // Labels for displaying employee details
        Label nameLabel = new Label("Name:");
        Label empIDLabel = new Label("Employee ID:");
        Label designationLabel = new Label("Designation:");
        Label basicPayLabel = new Label("Basic Pay:");
        Label licLabel = new Label("LIC Deduction:");

        Label daLabel = new Label("DA:");
        Label hraLabel = new Label("HRA:");
        Label pfLabel = new Label("PF:");
        Label netSalaryLabel = new Label("Net Salary:");

        // Output labels to display computed values
        Label daValueLabel = new Label();
        Label hraValueLabel = new Label();
        Label pfValueLabel = new Label();
        Label netSalaryValueLabel = new Label();

        Button computeButton = new Button("Compute Salary");

        // Layout using GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Adding input fields and labels to the grid
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(empIDLabel, 0, 1);
        gridPane.add(empIDField, 1, 1);
        gridPane.add(designationLabel, 0, 2);
        gridPane.add(designationField, 1, 2);
        gridPane.add(basicPayLabel, 0, 3);
        gridPane.add(basicPayField, 1, 3);
        gridPane.add(licLabel, 0, 4);
        gridPane.add(licField, 1, 4);

        gridPane.add(computeButton, 1, 5);

        // Adding output fields to the grid
        gridPane.add(daLabel, 0, 6);
        gridPane.add(daValueLabel, 1, 6);
        gridPane.add(hraLabel, 0, 7);
        gridPane.add(hraValueLabel, 1, 7);
        gridPane.add(pfLabel, 0, 8);
        gridPane.add(pfValueLabel, 1, 8);
        gridPane.add(netSalaryLabel, 0, 9);
        gridPane.add(netSalaryValueLabel, 1, 9);

        // Button action to compute and display the salary details
        computeButton.setOnAction(e -> {
            String name = nameField.getText();
            String empID = empIDField.getText();
            String designation = designationField.getText();
            double basicPay = Double.parseDouble(basicPayField.getText());
            double LIC = Double.parseDouble(licField.getText());

            Employee employee = new Employee(name, empID, designation, basicPay, LIC);

            // Display computed details
            daValueLabel.setText(String.format("%.2f", employee.getDA()));
            hraValueLabel.setText(String.format("%.2f", employee.getHRA()));
            pfValueLabel.setText(String.format("%.2f", employee.getPF()));
            netSalaryValueLabel.setText(String.format("%.2f", employee.getNetSalary()));
        });

        // Setting up the scene
        Scene scene = new Scene(gridPane, 350, 400);
        primaryStage.setTitle("Employee Information");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
