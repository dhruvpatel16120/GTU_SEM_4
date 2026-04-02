package OOPs.codes;

/* Practical No: 10.1
Title: JavaFX - Styled Text with Random Color & Opacity

Practical Statement:
- Display 5 Text nodes vertically
- Font: Times New Roman, Bold + Italic, Size 22
- Random color and opacity (0.3 to 1.0)
- Center aligned using VBox
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.stage.Stage;

import java.util.Random;

public class Practical_10_1 extends Application {

    @Override
    public void start(Stage stage) {

        VBox vbox = new VBox(15); // spacing between texts
        vbox.setAlignment(Pos.CENTER);

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {

            Text text = new Text("Text " + i);

            // Font settings
            text.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22));

            // Random color
            Color color = Color.color(rand.nextDouble(),
                                      rand.nextDouble(),
                                      rand.nextDouble());

            // Random opacity (0.3 to 1.0)
            double opacity = 0.3 + (rand.nextDouble() * 0.7);

            text.setFill(color);
            text.setOpacity(opacity);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);

        stage.setTitle("Random Styled Text");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}