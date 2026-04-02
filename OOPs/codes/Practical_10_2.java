package OOPs.codes;

/* Practical No: 10.2
Title: JavaFX Bouncing Ball with Controls

Practical Statement:
- Circle moves left ↔ right continuously
- Start / Stop buttons
- Slider to control speed
- Responsive to window resize
*/

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Practical_10_2 extends Application {

    private double dx = 2; // speed
    private boolean running = false;

    @Override
    public void start(Stage stage) {

        Pane pane = new Pane();

        // Create circle
        Circle ball = new Circle(20, Color.BLUE);
        ball.setCenterX(50);
        ball.setCenterY(100);

        pane.getChildren().add(ball);

        // Buttons
        Button startBtn = new Button("Start");
        Button stopBtn = new Button("Stop");

        // Slider for speed control
        Slider slider = new Slider(1, 10, 2); // min=1, max=10
        slider.setPrefWidth(150);

        // Controls layout
        HBox controls = new HBox(10, startBtn, stopBtn, slider);
        controls.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        root.setCenter(pane);
        root.setBottom(controls);

        // Animation
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {

                if (!running) return;

                // Update speed from slider
                dx = slider.getValue();

                double x = ball.getCenterX();
                double radius = ball.getRadius();
                double width = pane.getWidth();

                // Move ball
                ball.setCenterX(x + dx);

                // Boundary check
                if (x + radius >= width || x - radius <= 0) {
                    dx = -dx; // reverse direction
                }
            }
        };

        timer.start();

        // Button actions
        startBtn.setOnAction(e -> running = true);
        stopBtn.setOnAction(e -> running = false);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("Bouncing Ball");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}