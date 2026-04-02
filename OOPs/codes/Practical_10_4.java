package OOPs.codes;

/* Practical No: 10.4
Title: JavaFX Bar Chart using Rectangle

Practical Statement:
- Display grade distribution using Rectangle bars
- Projects: 20% (Red)
- Quizzes: 10% (Blue)
- Midterm: 30% (Green)
- Final: 40% (Orange)
- Bars proportional in height
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Practical_10_4 extends Application {

    // Method to create bar with label
    private VBox createBar(String labelText, int percentage, Color color) {

        double maxHeight = 200; // max height for 100%
        double height = (percentage / 100.0) * maxHeight;

        Rectangle bar = new Rectangle(50, height);
        bar.setFill(color);

        Label label = new Label(labelText + " — " + percentage + "%");

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(bar, label);

        return box;
    }

    @Override
    public void start(Stage stage) {

        // Create bars
        VBox projects = createBar("Projects", 20, Color.RED);
        VBox quizzes = createBar("Quizzes", 10, Color.BLUE);
        VBox midterm = createBar("Midterm", 30, Color.GREEN);
        VBox finalExam = createBar("Final", 40, Color.ORANGE);

        // Layout
        HBox root = new HBox(20, projects, quizzes, midterm, finalExam);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}