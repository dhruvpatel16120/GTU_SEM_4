package OOPs.codes;

/* Practical No: 10.3
Title: JavaFX Registration Form with Validation

Practical Statement:
- Fields: Roll No, Name, Age, Email
- Validate:
    RollNo & Age → integer
    Email → contains @ and .
- On success → show confirmation alert + save to file
- On error → show error alert
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.geometry.Insets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practical_10_3 extends Application {

    @Override
    public void start(Stage stage) {

        // Labels & Fields
        Label rollLabel = new Label("Roll No:");
        TextField rollField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);
        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);
        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);
        grid.add(submitBtn, 1, 4);

        // Button Action
        submitBtn.setOnAction(e -> {
            try {
                int roll = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                String name = nameField.getText();
                String email = emailField.getText();

                // Email validation
                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email format");
                }

                // Success Alert
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "Roll No: " + roll +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

                // Save to file
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Data");
                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    bw.write(roll + " " + name + " " + age + " " + email);
                    bw.newLine();
                    bw.close();
                }

            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Invalid Input");
                error.setContentText("Roll No and Age must be integers");
                error.showAndWait();

            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Validation Failed");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 400, 300);

        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}